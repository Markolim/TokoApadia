package com.example.ppw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PpwApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpwApplication.class, args);
	}

}
public class JavaExample {

    public void calculate(int p, int t, double r, int n) {
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;
        System.out.println("Compound Interest after " + t + " years: "+cinterest);
        System.out.println("Amount after " + t + " years: "+amount);
    }
    public static void main(String args[]) {
    	JavaExample obj = new JavaExample();
    	obj.calculate(2000, 5, .08, 12);
    }
}
class vectorcl{
  public static void main(String args[]){
   Vector v=new Vector(3,2);
   System.out.println("size:"+v.size());
   System.out.println("capacity:"+v.capacity());
   v.addElement(new Integer(1));
   v.addElement(new Integer(2));
   v.addElement(new Integer(3));
   v.addElement(new Integer(4));
   System.out.println("capacity after four additions:"+v.capacity());
  v.addElement(new Double(3.25));
  System.out.println("current capacity:"+v.capacity());
  v.addElement(new Float(7.5));
  v.addElement(new Integer(1));
  System.out.println("current capacity:"+v.capacity());
  System.out.println("Firstelement:"+(Integer)v.firstElement());
 System.out.println("Lastelement:"+(Integer)v.lastElement());
if(v.contains(new Integer(1)))
  System.out.println("contains 1");
Iterator it=v.iterator();
System.out.println("\n elements in vector:");
while(it.hasNext())
  System.out.print(it.next()+" ");
  System.out.println();
 }
}
