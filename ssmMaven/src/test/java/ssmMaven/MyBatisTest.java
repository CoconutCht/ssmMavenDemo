package ssmMaven;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.itmayiedu.service.IStationService;
import com.itmayiedu.service.StationServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class MyBatisTest {

	@Autowired
	private IStationService stationService;

	@Test
	public void testCalcuStarttoEndtinatPrice() {

		// ctrl+alt2+1
		// ClassPathXmlApplicationContext beans = new
		// ClassPathXmlApplicationContext(new
		// String[]{"spring.xml","spring-mybatis.xml"});
		// IStationService stationService= (IStationService)
		// beans.getBean("stationService");
		Double calcuStarttoEndtinatPrice = stationService.calcuStarttoEndtinatPrice("k339", "秦皇岛", "哈尔滨");
		System.out.println("calcuStarttoEndtinatPrice:" + calcuStarttoEndtinatPrice);
	}

}
