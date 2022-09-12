package FC1_B01;
import java.util.Scanner;
public class FC1_giaithua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,s=0;
		Scanner a= new Scanner(System.in);
		System.out.print("nhap n:");
		n=a.nextInt();
		for(int i=n;i>0;i--) {
			int t=1;
			for(int j=i;j>0;j--) {
				
				t= t*j;
				
			}
			s=s +t;
			
		}
		System.out.print("s=" +s);
      
	}

}
