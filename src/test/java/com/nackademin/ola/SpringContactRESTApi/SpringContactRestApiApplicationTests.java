package com.nackademin.ola.SpringContactRESTApi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringContactRestApiApplicationTests {

	@Test
	public void contextLoads() {
		Contacts testContacts=new Contacts("Ola", "Karlsson","Kungsgatan 20","ola@gmail.com","070 777 55 66");
	}
}
