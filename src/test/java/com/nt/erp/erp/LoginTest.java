package com.nt.erp.erp;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nt.erp.dao.LoginMapper;
import com.nt.erp.model.Login;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginTest {

    @Autowired
    private LoginMapper loginMapper;
    
	@Test
	public void getAll() {
	    List<Login> list = loginMapper.selectAll();
	    
	    for (Login l : list) {
            System.out.println(l.getLoginaccount());
            System.out.println(l.getLoginpasswd());
            System.out.println(l.getId());
        }
	}

}
