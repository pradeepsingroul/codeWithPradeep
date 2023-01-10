package codeWithPk.model;

import java.util.*;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "codeWithPk")
@Configuration
//@PropertySource(value = )
public class AppConfig {
	
	
	@Bean(name = "p1")
	public Person getPerson() {
		
		Person p  = new Person();
		p.setAge(23);
		p.setEmail("pradeep4899@gmail.com");
		p.setMobile("9340724066");
		p.setPersonId(10);
		p.setPersonName("Version_2.o");
		
		return p;
	}
	@Bean(name = "p4")
	public Person getPerson4() {
		
		Person p  = new Person();
		p.setAge(23);
		p.setEmail("pradeep4899@gmail.com");
		p.setMobile("9340724066");
		p.setPersonId(10);
		p.setPersonName("Version_2.o");
		
		return p;
	}
	@Bean(name = "p2")
	public Person getPerson2() {
		
		Person p  = new Person();
		p.setAge(23);
		p.setEmail("pradeep4899@gmail.com");
		p.setMobile("9340724066");
		p.setPersonId(10);
		p.setPersonName("Version_2.o");
		
		return p;
	}
	@Bean(name = "p3")
	public Person getPerson3() {
		
		Person p  = new Person();
		p.setAge(23);
		p.setEmail("pradeep4899@gmail.com");
		p.setMobile("9340724066");
		p.setPersonId(10);
		p.setPersonName("Version_2.o");
		
		return p;
	}
	@Bean(name = "g1")
	public Gym getGym() {
		
		Gym g = new Gym();
		g.setGym_Name("FitnessBilla");
		g.setFee(1200);
		g.setGymId(1);
		
		return g;
	}
	@Bean(name = "g2")
	public Gym getGym2() {
		
		Gym g = new Gym();
		g.setGym_Name("FitnessBilla");
		g.setFee(1200);
		g.setGymId(1);
		
		return g;
	}
	@Bean(name = "g3")
	public Gym getGym3() {
		
		Gym g = new Gym();
		g.setGym_Name("FitnessBilla");
		g.setFee(1200);
		g.setGymId(1);
		
		return g;
	}
	@Bean(name = "g4")
	public Gym getGym4() {
		
		Gym g = new Gym();
		g.setGym_Name("FitnessBilla");
		g.setFee(1200);
		g.setGymId(1);
		
		return g;
	}
	
	
	@Bean("theMap")
	public Map<Person,Gym> getTheMap() {
		Map<Person,Gym> theMap  = new HashMap();
		theMap.put(getPerson(), getGym());
		theMap.put(getPerson2(), getGym2());
		theMap.put(getPerson3(), getGym3());
		theMap.put(getPerson4(), getGym4());
		
		
		return theMap;
	}
	
	@Bean("theList")
	public List<Person> getTheList(){
		
		List<Person> theList = new ArrayList();
		theList.add(getPerson());
		theList.add(getPerson2());
		theList.add(getPerson3());
		theList.add(getPerson4());
		
		
		return theList;
		
	}

}
