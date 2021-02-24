package com.interfaces.interfacesclass;

import org.springframework.stereotype.Component;

@Component
public interface Interface1 {

	
	public void hai();
	
	public void get();
	
	default void run()
	{
		System.out.println("default run method inside Interface1");
	}
	default void printable()
	{
		System.out.println("default method in interface 1 having unique method name printable");
	}
	
}
