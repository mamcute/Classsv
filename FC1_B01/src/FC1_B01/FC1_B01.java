package FC1_B01;
import java.util.Scanner;
public class FC1_B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Xin Chao!!!\n Moi ban nhap tuoi?");
//		
//		int tuoi;
//		Scanner kb= new Scanner(System.in);tuoi=kb.nextInt();
//		System.out.println(" Ban duoc "+ tuoi +"tuoi");
//		
		int a, b;
		System.out.print("nhap lan 1:");
		Scanner kb= new Scanner(System.in); a=kb.nextInt();
		System.out.print("nhap lan 2:");
		Scanner kp= new Scanner(System.in); b=kb.nextInt();
		int c1=a+b;
		System.out.print("ket qua cong la:"+c1);
		int c2=a-b;
		System.out.print("\nket qua tru la:"+c2);
		int c3=a*b;
		System.out.print("\nKet qua nhan la:"+c3);
		float c4=(float)a/b;
		System.out.print("\nKet qua chia la:"+c4);


	}

}
