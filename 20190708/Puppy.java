package test;
public class Puppy{
	   int puppyAge;
	   public Puppy(String name){
	      // 这个构造器仅有一个参数：name
	      System.out.println("丈夫的名字是 : " + name ); 
	   }	 
	   public void setAge( int age ){
	       puppyAge = age;
	   }	 
	   public int getAge( ){
	       System.out.println(puppyAge); 
	       return puppyAge;
	   }	   
	   public static void main(String[] args){
	      /* 创建对象 */
	      Puppy myPuppy = new Puppy( "老公" );	    
	      /* 通过方法来设定age */
	      myPuppy.setAge( 10 );
	      /* 调用另一个方法获取age */
	      
	      myPuppy.getAge();//这里调用了gatAge的pirnt 10
	      
	      System.out.println(myPuppy); //打印出test.Puppy@15db9742
	      //可能是myPuppy在编译器里的指针
	      //其他一些语言可以把类或函数设置成返回10，java我没去研究过怎么写
	      
	      System.out.println(myPuppy.getAge());//不仅执行了一次pirnt 10，
	                                           //而且打印出了getAge()的return，也是10
	      
	      System.out.println(myPuppy.puppyAge); //打印myPuppy类的puppyAge，即是10
	   }	   	
	}