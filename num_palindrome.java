
import java.util.*;
class num_palindrome{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(is_Palindrome(n));
	}
	public static boolean is_Palindrome(int num){
		if(num <0) return false;
		int sum=0;
		int digit;
		int temp=num;
		while(num!=0){
			digit=num%10;
			sum=(sum*10)+digit;
			num=num/10;
			
			
		}
		if(sum == temp){
			return true;
		}else{
			return false;
		}
	}
//	return 0;


}