package ex;
import java.lang.reflect.Array;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021037 林建宏
 */
import java.util.*;
public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scn=new Scanner(System.in);
		System.out.println("請輸入學生人數");
		int n=scn.nextInt();
		System.out.println("輸入學生學號");
		int data[]=new int[n];
		for(int a=0;a<n;a++){
			data[a]=scn.nextInt();		
		}
		
        Arrays.sort(data);
		for(int a=data.length-1;a>=0;a--)
	    {
	      System.out.print(data[a]+"\t");

	}

}}
