
  package com.interfaces.primaryclass;
  
  import org.springframework.stereotype.Component;

import com.interfaces.interfacesclass.Interface1;
import
  com.interfaces.interfacesclass.Interface2;
  
  @Component public class PrimaryClass implements Interface1,Interface2{
	  @Override
		public void run() {
			// TODO Auto-generated method stub
			Interface1.super.run();//calling default methods of interface 1 as both interface 1 and 2 have same method names
			Interface2.super.run();//calling default methods of interface 1 as both interface 1 and 2 have same method names
		}

		@Override
		public void hai() {
		System.out.println("Calling hai method from interface1");
			
		}
		@Override
		public void hello() {
		System.out.println("Calling hello method from interface2");
			
		}

		@Override
		public void get() {
			// TODO Auto-generated method stub
			System.out.println("the 2 interfaces have same type of method with same datatype so itll invoke any one method");
		}


		
  }