package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("輸入n");
		int n =scn.nextInt();
		double sum=0;
		for(int i=n;i>0;i--){
			sum=sum+Math.pow(2, i);
					
			
		}System.out.print((int)sum);
		

	}

}
