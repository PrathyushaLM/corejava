package com.tnsif.scannerclass;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ob=new Scanner(System.in);
       System.out.println("Enter the ID");
       
       boolean a= ob.hasNextInt();
       System.out.println(a);
       int id=ob.nextInt();
       System.out.println(id);
      
	}

}
