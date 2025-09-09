//Given two arrays A and B of positive integers of the same size N. 
//The task is to find the maximum sum of products of their elements. 
//Each element in A has to be multiplied with exactly one element in B or vice versa such 
//that each element of both the arrays appears exactly once and the sum of the product obtained is maximum. 

//Examples: 



//Input : A[] = {1, 2, 3},  B[] = {4, 5, 1} 
//Output : 24 
//Explanation : Maximum sum of product is obtained by 5*3+4*2+1*1 = 24.
import java.util.*;
class maximumSumOfProduct{
	public static void main(String[] args){
		int a[]={5, 1, 3, 4, 2};
		int b[]={8, 10, 9, 7, 6};
		int n=a.length;
		int sumOfProduct=0;
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<n;i++){
			sumOfProduct+=a[i]*b[i];
		}
		System.out.println(sumOfProduct);
		
		
	}
}
		
