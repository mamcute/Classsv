package FC1_B01;
import java.util.Scanner;
public class FC1_n1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0;
		Scanner a= new Scanner(System.in);
		System.out.print("nhap n:");
		n= a.nextInt();
		for(int i=1;i<=n;i++) {
			s= s+ i*i;
		}
		System.out.print("s=" +s);

	}

}
