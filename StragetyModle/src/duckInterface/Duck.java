package duckInterface;

import Stragety.FlyStragety;

/*****
 * 策略模式:将可变的部分，从主体中分离出来，用接口进行描述，同时使用组合的方式。
 * @author lw
 * 
 * 1.描述鸭子的特性的知识
 *  
 *  1.鸣叫
 *  2.外在的颜色
 *  3.可变部分是：飞行的方式
 *
 */


public abstract class Duck {
	
    //鸭子的叫声
	public void quock(){
		System.out.println("鸭子嘎嘎嘎的叫....");
	}
	
	//鸭子的种类显示
	public abstract void show();

	//飞行:使用策略方式
	private FlyStragety flyStragety;


	//设置进行注入的方式;
	public void setFlyStragety(FlyStragety flyStragety) {
		this.flyStragety = flyStragety;
	}
	
   //飞行行为使用
	public void fly(){
		//接口中飞行的行为;
		flyStragety.FlyHehavior();
	}
	
	
	
	
}
