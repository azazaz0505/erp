package com.nt.erp;

import nari.mip.card.allController;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@ComponentScan({ "nari.mip.card","com.nt.erp"})
@MapperScan("com.nt.erp.dao")
public class ErpApplication {
	
	private static final Logger LOG = Logger.getLogger(allController.class);
	
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

		
	 
	
		
	public static void main(String[] args) {
		SpringApplication.run(ErpApplication.class, args);
	}
}
