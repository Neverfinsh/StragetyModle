package duck.impl;

import FlyStrageImp.FlyStrageImp;
import Stragety.FlyStragety;
import duckInterface.Duck;

public class GreenDuck extends  Duck {

	
	 public GreenDuck() {
		 super();
		 super.setFlyStragety(new FlyStrageImp());
	}
	
	
	
	
	@Override
	public void show() {
		System.out.println("бли╚╣дя╪вс");
	}
	



}
