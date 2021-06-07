package tester;

import hello.Hello;
import hello.Hello2;
public class Tester
{
    public static void main(String[] args) 
	{
		{
			System.out.println("Hello Motherfucking Java!!!!");
			Hello h1 = new Hello(10,"Suraj");
			Hello h2 = new Hello(20,"Manish");
			Hello h3 = new Hello(30,"Vrusha");
			Hello h4 = new Hello(40,"Hrushi");
			Hello h5 = new Hello(50,"xbcv");
			
			Hello2 h6 = new Hello2(10,"Suraj");
			Hello2 h7 = new Hello2(50,"xbcv");
			Hello2 h8= new Hello2(10, "suraj", 10000);
		    Hello2 h9;
		    h9=h8;
	       System.out.println( h9.equals(h8)); 
	       System.out.println( h1.hashCode());
	       System.out.println( h2.hashCode());
	       System.out.println( h3.hashCode()); 
	       System.out.println( h4.hashCode()); 
	       System.out.println( h5.hashCode()); 
	       System.out.println( h6.hashCode());
	       System.out.println( h7.hashCode());
	       System.out.println( h6.equals(h7));
	       
	       System.out.println( h8.hashCode());

	     }
	}
}   		
