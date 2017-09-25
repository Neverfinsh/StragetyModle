package duck.impl;

import FlyStrageImp.FlyRocketStrageImp;
import duckInterface.Duck;

public class RocketDuck extends Duck {

	//利用构造的方式进行注册

	public RocketDuck() {
		super();
		//父类中进行设置		
		super.setFlyStragety(new FlyRocketStrageImp());
	}

	
	@Override
	public void show() {
	System.out.println("我是一只太空的鸭子");
	}
	
	
	/***
	 * 重写鸭子父类中鸭子的叫声
	 * 
	 */
	public void quock(){
		System.out.println("用无线电进行沟通....");
	}
	
	
}
