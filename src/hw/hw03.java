package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("input");
		int n=scn.nextInt();
		int i=1;
		while(Math.pow(n, i)<=10000){
			i++;
		  }System.out.print(i);
		

	}

}
