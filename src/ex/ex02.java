package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
        System.out.println("輸入n");
        int n=scn.nextInt();
        int sum=1;
        while( n>1){
        	
        	sum=sum*n;
        	n--;
        	
        	
    
        
	}System.out.println(sum);
		

	}

}
