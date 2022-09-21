package ptao;
import java.util.*;
public class Nv {
   protected  String name;
   protected  int hsl;
   protected int salary;
   Nv(){
	   
   }
   Nv(String name, int hsl,int salary){
	   this.name=name;
	   this.hsl=hsl;
	   this.salary=salary;
   }
   public String toString() {
	   return name+"\t"+hsl+"\t"+salary;
   }
   void input() {
	   Scanner ka=new Scanner(System.in);
	   System.out.print("name:");
	   name= ka.nextLine();
	   System.out.print("hsl:");
	   hsl=ka.nextInt();
	   setSalary(getHsl()*1500);
	   
   }
   void output() {
	   System.out.print("\t"+name+"\t"+hsl+"\t"+getSalary());
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHsl() {
	return hsl;
}
public void setHsl(int hsl) {
	this.hsl = hsl;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}

