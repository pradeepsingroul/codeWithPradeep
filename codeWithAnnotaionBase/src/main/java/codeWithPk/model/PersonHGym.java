package codeWithPk.model;

import java.util.*;
import java.util.stream.Stream;

import javax.swing.text.html.parser.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PersonHGym {
	
	@Autowired
	private Map <Person, Gym> theMap;
	
	@Autowired
	private List<Person> theList;
	
	@Value("GymApllication")
	private String appName;
	
	
	public void printMap() {
		for(Map.Entry<Person, Gym> entry :theMap.entrySet() ) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	
	public void printList() {
		 Collections.sort(theList, (o1, o2) -> (o1.getAge() > o2.getAge()) ? -1 :(o1.getAge() < o2.getAge()) ? 1 : 0);
		 System.out.println(theList);
	}
	
	public void printAppName() {
		System.out.println(this.appName);
	}
}
