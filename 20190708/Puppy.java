package test;
public class Puppy{
	   int puppyAge;
	   public Puppy(String name){
	      // �������������һ��������name
	      System.out.println("�ɷ�������� : " + name ); 
	   }	 
	   public void setAge( int age ){
	       puppyAge = age;
	   }	 
	   public int getAge( ){
	       System.out.println(puppyAge); 
	       return puppyAge;
	   }	   
	   public static void main(String[] args){
	      /* �������� */
	      Puppy myPuppy = new Puppy( "�Ϲ�" );	    
	      /* ͨ���������趨age */
	      myPuppy.setAge( 10 );
	      /* ������һ��������ȡage */
	      
	      myPuppy.getAge();//���������gatAge��pirnt 10
	      
	      System.out.println(myPuppy); //��ӡ��test.Puppy@15db9742
	      //������myPuppy�ڱ��������ָ��
	      //����һЩ���Կ��԰���������óɷ���10��java��ûȥ�о�����ôд
	      
	      System.out.println(myPuppy.getAge());//����ִ����һ��pirnt 10��
	                                           //���Ҵ�ӡ����getAge()��return��Ҳ��10
	      
	      System.out.println(myPuppy.puppyAge); //��ӡmyPuppy���puppyAge������10
	   }	   	
	}