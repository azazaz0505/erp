//package nari.mip.card.controller;
package nari.mip.card;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import nari.mip.card.controller.responsebean.ResponseBean;
import nari.mip.card.service.CardService;
import nari.mip.card.service.InsertService;
import nari.mip.card.service.UserService;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;


import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;




/**
 * Hello world!
 *
 */
//@SpringBootApplication   // same as @Configuration @EnableAutoConfiguration @ComponentScan
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
@RestController
//@EnableDiscoveryClient
//@EnableEurekaClient
//@EnableAutoConfiguration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan({ "nari.mip.card","com.nt.erp"})
//@MapperScan("com.nt.erp.dao")
@RequestMapping("/mips/card/rest")

public class allController {
	

    private static final Logger LOG = Logger.getLogger(allController.class);
	 
	@Autowired
	private RestTemplate restTemplate;

	//@HystrixCommand(fallbackMethod = "fallback")
	@RequestMapping("/")
	public String invokeCalcService() {
		// ServiceInstance inst = loadBalancer.choose("CALC");

		// System.out.print("---------------" + inst);

	//	String result = restTemplate.getForObject("http://CALC/", String.class);
		//System.out.println(result);
		return "内网移动平台nari";
	}
	 

	public String fallback() {
		return "some exception occur call fallback method.";
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
		RestTemplate template = new RestTemplate();
		SimpleClientHttpRequestFactory factory = (SimpleClientHttpRequestFactory) template.getRequestFactory();
		factory.setConnectTimeout(3000);
		factory.setReadTimeout(3000);
		return template;
	}

	//配置
	@Autowired
    DataSource dataSource;
	
	@Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
 
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        
        sqlSessionFactoryBean.setTypeAliasesPackage("nari.mip.card.model");

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
 
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
       
        //sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/nari/mip/card/mapper/*.xml"));
        
        return sqlSessionFactoryBean.getObject();
    }
	
		@Bean
	    public PlatformTransactionManager transactionManager() {
	        return new DataSourceTransactionManager(dataSource);
	    }
	
		/**
		 * 卡片接口
		 * @param args
		 */
		@Autowired
	    private CardService cardService; 
		
	    /**
	     * 接收动态卡片信息
	     * @param requestParam
	     * @return
	     */
	    
	    @RequestMapping(value = "/card/getCardInfo", method = RequestMethod.POST)
	    public @ResponseBody ResponseBean getCardInfo(@RequestBody Map<String,Object> requestParam) {
	        LOG.debug("接收动态卡片信息，内容：" + requestParam.toString());
	        System.out.printf(requestParam.toString());
	        ResponseBean responseBean = cardService.getCardInfo(requestParam);
	        return responseBean;
	    }
	    
	    /**
	     * 删除动态卡片信息
	     * @param requestParam
	     * @return 
	     */
	    @RequestMapping(value = "/card/deleteCardInfo", method = RequestMethod.POST)
	    public @ResponseBody
	    ResponseBean deleteCardInfo(@RequestBody Map<String,Object> requestParam){
	    	LOG.debug("删除动态卡片，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = cardService.deleteCardInfo(requestParam);
	    	return responseBean;
	    }
	    
	    /**
	     * 
	     * 更新动态卡片信息
	     * @param requestParam
	     * @return
	     */
	    @RequestMapping(value = "/card/updateCardInfo", method = RequestMethod.POST)
	    public @ResponseBody
	    ResponseBean updateCardInfo(@RequestBody Map<String, Object> requestParam){
	    	//设置更新时间
	    	DateFormat dateFormate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    	String updateTime = dateFormate.format(new Date());
	    	requestParam.put("cardupdatetime", updateTime);
	    	LOG.debug("更新动态卡片，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = cardService.updateCardInfo(requestParam);
	    	return responseBean ;
	    }
	      
	    /**
	     * 增加动态卡片信息
	     * @param requestParam
	     * @return
	     */
	    
	    @RequestMapping(value = "/card/setCardInfo",method = RequestMethod.POST)
	    public @ResponseBody
	    ResponseBean setCardInfo(@RequestBody Map<String,Object> requestParam){
	    	LOG.debug("接收动态卡片信息，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = cardService.setCardInfo(requestParam);
	    	return responseBean;
	    }
	    
	    
	    /**
	     *获取根据应用ID获取卡片信息
	     * 
	     */
	    @RequestMapping(value = "/card/getWorkCardInfo",method = RequestMethod.POST)
	    public @ResponseBody
	    ResponseBean getWorkCardInfo(@RequestBody Map<String,Object>requestParam){
	    	LOG.debug("接收根据关联的应用ID分组的卡片信息，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = cardService.getWorkCardInfo(requestParam);
	    	return responseBean;
	    }
	    
	    /**
	     *获取根据应用ID分组的卡片信息
	     * 
	     */
	    @RequestMapping(value = "/card/getWorkGroupCardInfo",method = RequestMethod.POST)
	    public @ResponseBody
	    ResponseBean getWorkGroupCardInfo(@RequestBody Map<String,Object>requestParam){
	    	LOG.debug("接收动态卡片信息，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = cardService.getWorkGroupCardInfo();
	    	return responseBean;
	    }
	    
	    /**
	     * 
	     * 登录接口
	     * @param args
	     */
	    
	    @Autowired
	    private UserService userService;

	    /**
	     * 登录页面跳转
	     *
	     * @return
	     */
	    //@HystrixCommand(fallbackMethod = "fallback")
	    @RequestMapping(value = "/iniLogin", method = RequestMethod.GET)
	    public ModelAndView iniLogin() { //ModelAndView
	        ModelAndView mav = new ModelAndView();
	        LOG.info("欢迎登陆支撑平台");
	        System.out.println("-----------------");
	        mav.setViewName("login");
	        return mav;
	        //return "login";
	    }

	    /**
	     * 用户登录
	     *
	     * @param requestParam
	     * @param request
	     * @return
	     */
	    @ResponseBody
	    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
	    public 
	    ResponseBean userLogin(@RequestBody Map<String, Object> requestParam, HttpServletRequest request) {
	    	//UserServiceImpl userService = new UserServiceImpl();
	        LOG.info("登录：" + requestParam.toString());
	        return userService.userLogin(requestParam);
	    }

	    /**
	     * 跳转主界面
	     *
	     * @return
	     */
	    @RequestMapping(value = "/iniIndex", method = RequestMethod.GET)
	    public ModelAndView iniIndex() {
	        ModelAndView mav = new ModelAndView();
	        LOG.info("跳转：");
	        mav.setViewName("index");
	        return mav;
	    }
	    
	    /**
	     * 接入服务
	     * 
	     * @param args
	     */
	    @Autowired
	    private InsertService InsertService;

	    /**
	     * 获取服务信息
	     * @param requestParam
	     * @return
	     */
	    @RequestMapping(value = "insert/getServiceInfo", method = RequestMethod.POST)
	    @ResponseBody
	    public ResponseBean getServiceInfo(@RequestBody Map<String,Object> requestParam) {
	        LOG.debug("获取接入服务信息，内容：" + requestParam.toString());
	        System.out.printf(requestParam.toString());
	        ResponseBean responseBean = InsertService.getServiceInfo(requestParam);
	        return responseBean;
	    }

	    /**
	     * 删除服务信息
	     * @param requestParam
	     * @return 
	     */
	    @RequestMapping(value = "insert/deleteServiceInfo", method = RequestMethod.POST)
	    @ResponseBody
	    public 
	    ResponseBean deleteServiceInfo(@RequestBody Map<String,Object> requestParam){
	    	LOG.debug("删除接入服务，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = InsertService.deleteServiceInfo(requestParam);
	    	return responseBean;
	    }
	    
	    /**
	     * 
	     * 更新服务信息
	     * @param requestParam
	     * @return
	     */
	    @RequestMapping(value = "insert/updateServiceInfo", method = RequestMethod.POST)
	    @ResponseBody
	    public 
	    ResponseBean updateServiceInfo(@RequestBody Map<String, Object> requestParam){
	    	//设置更新时间
	    	//DateFormat dateFormate= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    	//String updateTime = dateFormate.format(new Date());
	    	//requestParam.put("cardupdatetime", updateTime);
	    	LOG.debug("更新接入服务，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = InsertService.updateServiceInfo(requestParam);
	    	return responseBean ;
	    }
	      
	    /**
	     * 增加服务信息
	     * @param requestParam
	     * @return
	     */
	    
	    @RequestMapping(value = "insert/setServiceInfo",method = RequestMethod.POST)
	    @ResponseBody
	    public 
	    ResponseBean setServiceInfo(@RequestBody Map<String,Object>requestParam){
	    	LOG.debug("插入接入服务信息，内容：" + requestParam.toString());
	    	System.out.printf(requestParam.toString());
	    	ResponseBean responseBean = InsertService.setServiceInfo(requestParam);
	    	return responseBean;
	    }
	    
	/*public static void main(String[] args) {
		SpringApplication.run(allController.class, args);
		//SpringApplication.run(LoginController.class, args);
	}*/
}
