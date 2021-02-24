package com.interfaces.interfacesclass;

import org.springframework.stereotype.Component;

@Component
public interface Interface2 {
	public void hello();
	default void run()
	{
		System.out.println("default run method inside Interface2");
	}
	
	public void get();
	
	
	default void print()
	{
		System.out.println("default method in interface 2 having unique method name print");
	}
	
}
