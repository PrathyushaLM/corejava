package com.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Encapsulation ob= new Encapsulation();
        
    //    ob.name="prathyu";//calling the variables
    //    ob.age=21;
    //    ob.serialNum=22;
        
        ob.setAge(21);
        ob.setName("kutti");
        ob.setSerialNum(55);
        System.out.println(ob);
	}

}
