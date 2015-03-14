
public class Calculator {

	
	static int static_num=100;  //200
	
	int non_sta_num=200;

	public Calculator(int i) {
		// TODO Auto-generated constructor stub
	}
	//non static	
	public static void main(String [] args){ //JVM
		
		Calculator obj_cal = new  Calculator(10); //heap memory
		
		Calculator obj_cal_2 = new  Calculator(10); 
		
		obj_cal.non_sta_num=400;
		
		System.out.println("the obj 1 num "+obj_cal.non_sta_num);
		System.out.println("the obj 2 num "+obj_cal_2.non_sta_num);
		
		obj_cal.sum(10, 20);
		
		float sum_v_re = obj_cal.sum(10,(float)20.33);
		
		System.out.println("The sum of the numbers is : "+sum_v_re);	
		
		
		Calculator.diff(30,(float)20.8);// static
	}
	
	//non static  ---> static
	
	void sum(int num1,int num2){ // non static
		System.out.println("The sum of numbers :" + (num1+num2));//30
	}
	
	float sum(int num1,float  num2){ //non static //float num2=20.33;
		
		float sum_V =num1+num2;
	
		return sum_V;
		
	}
	
	static float diff(int num1,float  num2){ // static //float num2=20.33;
		
		float sum_V =num1-num2;
	
		return sum_V;
		
	}
}








/*

//daemon thread
		
		
		
		System.out.println("main block");
		
	byte num;	
	num=(byte) 200; //-128,-127,-126 to +127.....    73
	

	float fl;
	fl=(float) 200.87;
	
	int balance=10000;
	
	float  bal_fl=(float) (balance+67.88); //10000.00000
	
	int bal_in=(int) bal_fl;//10067
	
	//classNmae.objectname.task();	
	System.out.print(bal_in);
		
	}	

}
*/