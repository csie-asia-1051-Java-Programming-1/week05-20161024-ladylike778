package hw;
import java.util.*;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn");
		int n = scn.nextInt();
		int data [][]=new int[n][n];
		int a = 1,t = 0;
		while(t<=(n-1)*2){
			if(t<n){
				for(int i =t;i>=0;i--){
					int v1=t-i;
					data[i][v1]=a;
					a++;
				}
			}
			if(t>=n){
				for(int i=t-n+1;i<n;i++){
					int q = t-i;
					data[q][i]=a;
					a++;
					
				}
			}
			t++;
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(data[i][j]+"\t");
			}System.out.println();
		}
	}

}