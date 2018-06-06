package nariis.springcloud.CalcClient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CalcClientApp.class)
@WebAppConfiguration
public class AppTest {
	@Autowired
	private LoadBalancerClient loadBalancer;
	@Autowired
	private RestTemplate restTemplate;

	@Test
	public void testClient() {

//		String result = restTemplate.getForObject("http://CALC/", String.class);
		long start = System.currentTimeMillis();
//		for (int i = 1; i <= 1000; i++) {
//			result = restTemplate.getForObject("http://CALC/", String.class);
//		}
		long end = System.currentTimeMillis();

		System.out.println((end - start) + " ms");
	}
}
