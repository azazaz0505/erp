package nariis.springcloud.CalcClient;

/*import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

*//**
 * Hello world!
 *
 *//*
@SpringBootApplication   // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
@EnableDiscoveryClient*/























//import nari.mip.card.allController;




import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
//import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * Hello world!
 *
 */
@SpringBootApplication   // same as @Configuration @EnableAutoConfiguration @ComponentScan
@RestController
@EnableEurekaClient
public class CalcClientApp {

    private static final Logger LOG = Logger.getLogger(CalcClientApp.class);
	 
	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "fallback")
	@RequestMapping("/")
	public String invokeCalcService() {
//		 ServiceInstance inst = loadBalancer.choose("CALC");

//		 System.out.print("---------------" + inst);
//
		String result = restTemplate.getForObject("http://CALC/", String.class);
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

	
	
	
//	public static void main(String[] args) {
//		SpringApplication.run(CalcClientApp.class, args);
//		//SpringApplication.run(LoginController.class, args);
//	}

	  
		
}
