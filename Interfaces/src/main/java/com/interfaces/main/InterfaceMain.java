package com.interfaces.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.interfaces.primaryclass.PrimaryClass;


@SpringBootApplication
public class InterfaceMain{
	
	
	public static void main(String args[])
	{
		SpringApplication.run(InterfaceMain.class, args);
		
		
		PrimaryClass p= new PrimaryClass();
		p.hai();//invokes interface 1 method
		p.hello();//invokes interface 2 method
		p.run();//invokes interface 1  and 2 default methods by calling super
		p.get();//invokes anyone interface get() method as both are of same name and type
		p.print();//invoke interface 1 default method print
		p.printable();//invoke interface 2 default method printable

}

	

}

