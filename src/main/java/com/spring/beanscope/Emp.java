package com.spring.beanscope;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*@Component("employee")*/
/*@Scope("prototype")*/
public class Emp {

	/* @Value("500") */
	private int id;
	
	/* @Value("anisha") */
	private String name;
	
	/* @Value("#{ad} ") */
	private List<String> city;
	
	/* @Value(" #{ph}") */
	private Set<String> phoneno;

	
	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public List<String> getCity() {
		return city;
	}

	
	public void setCity(List<String> city) {
		this.city = city;
	}

	
	public Set<String> getPhoneno() {
		return phoneno;
	}

	
	public void setPhoneno(Set<String> phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", city=" + city + ", phoneno=" + phoneno + "]";
	}
	
	
	
	
	
}
