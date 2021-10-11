package MultiplyString;

import java.util.Scanner;

public class StringMulEx {
	
	public static String multiply(String num1, String num2) {
		int m=num1.length();
		int n=num2.length();
		int[] vals=new int[m+n];

		    for(int i=m-1;i>=0;i--){
		        for(int j=n-1;j>=0;j--){
		            int mul= (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
		            int sum= vals[i+j+1]+mul;
		            vals[i+j+1] =sum%10;
		            vals[i+j]+=sum/10;
		        }
		    }
		    StringBuilder sb=new StringBuilder();
		    for(int val:vals){
		        if(sb.length()!=0 || val!=0){
		            sb.append(val);
		        }
		    }
		    return sb.length()==0 ? "0" : sb.toString();
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of NUM1:");
		String num1 = sc.next();
		System.out.println("Enter value of NUM1:");
		String  num2 = sc.next();
		System.out.println(multiply(num1,num2));
	}
	

}


