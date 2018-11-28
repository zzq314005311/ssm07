package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.providerMapper;
import pojo.provider;
import service.providerServce;

public class Mybatis07 {

	@Test
	public void select() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		providerMapper mapper = context.getBean(providerMapper.class);
		List<provider> list = new ArrayList<provider>();
		list = mapper.selectAll("…œ∫£");
		for (provider u : list) {
			System.out.println(u.getProCode() + u.getProName());
		}
	}
}
