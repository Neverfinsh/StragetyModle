package duck.impl;

import FlyStrageImp.FlyRocketStrageImp;
import duckInterface.Duck;

public class RocketDuck extends Duck {

	//���ù���ķ�ʽ����ע��

	public RocketDuck() {
		super();
		//�����н�������		
		super.setFlyStragety(new FlyRocketStrageImp());
	}

	
	@Override
	public void show() {
	System.out.println("����һֻ̫�յ�Ѽ��");
	}
	
	
	/***
	 * ��дѼ�Ӹ�����Ѽ�ӵĽ���
	 * 
	 */
	public void quock(){
		System.out.println("�����ߵ���й�ͨ....");
	}
	
	
}
