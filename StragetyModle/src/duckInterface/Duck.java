package duckInterface;

import Stragety.FlyStragety;

/*****
 * ����ģʽ:���ɱ�Ĳ��֣��������з���������ýӿڽ���������ͬʱʹ����ϵķ�ʽ��
 * @author lw
 * 
 * 1.����Ѽ�ӵ����Ե�֪ʶ
 *  
 *  1.����
 *  2.���ڵ���ɫ
 *  3.�ɱ䲿���ǣ����еķ�ʽ
 *
 */


public abstract class Duck {
	
    //Ѽ�ӵĽ���
	public void quock(){
		System.out.println("Ѽ�Ӹ¸¸µĽ�....");
	}
	
	//Ѽ�ӵ�������ʾ
	public abstract void show();

	//����:ʹ�ò��Է�ʽ
	private FlyStragety flyStragety;


	//���ý���ע��ķ�ʽ;
	public void setFlyStragety(FlyStragety flyStragety) {
		this.flyStragety = flyStragety;
	}
	
   //������Ϊʹ��
	public void fly(){
		//�ӿ��з��е���Ϊ;
		flyStragety.FlyHehavior();
	}
	
	
	
	
}
