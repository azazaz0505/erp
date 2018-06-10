package com.nt.erp;


import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@ComponentScan({ "nari.mip.card","com.nt.erp"})
@MapperScan("com.nt.erp.dao")
public class ErpApplication {
	
	private static final Logger LOG = Logger.getLogger(ErpApplication.class);
	
//	//配置
//	@Autowired
//    DataSource dataSource;
	
//	@Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
// 
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        
//        sqlSessionFactoryBean.setTypeAliasesPackage("nari.mip.card.model");
//
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
// 
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mybatis/*.xml"));
//       
//        //sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/nari/mip/card/mapper/*.xml"));
//        
//        return sqlSessionFactoryBean.getObject();
//    }
//		
//	@Bean
//    public PlatformTransactionManager transactionManager() {
//        return new DataSourceTransactionManager(dataSource);
//    }

		
	 
	
		
	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}
}
