package test;

import duck.impl.GreenDuck;
import duck.impl.RocketDuck;
import duckInterface.Duck;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("²âÊÔ¿ªÊ¼");
		
		Duck duck=null;
		duck=new RocketDuck();
		
		duck.show();
		duck.quock();
		duck.fly();
		
		System.out.println("²âÊÔ½áÊø");
	}

}
