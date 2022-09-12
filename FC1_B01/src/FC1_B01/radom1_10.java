package FC1_B01;
import java.util.*;
public class radom1_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[100];
//		int[] temp= {0,1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 100);
//        }
//        System.out.print("arr: ");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " " + i);
//
//        }
//
//        
//        System.out.println();
//        for (int i = 0; i < temp.length; i++) {
//        	int count=0;
//        	System.out.print(temp[i]+ ":");
//            for (int j = 0; j < arr.length; j++) {
//                if(temp[i] == arr[j]){
//                    count++;
//                }
//            }
//            System.out.print(count);
//            System.out.println();
//        }
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(random.nextInt() / 100000000);
        }
        int c[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]]++;
        }
        System.out.println("\nSố lượng các phần tử xuất hiện trong dãy là :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + c[i]);
        }

	}

}