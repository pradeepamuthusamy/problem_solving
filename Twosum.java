//two sum
// given array of integers and a target
//when sum of any 2 number equals to target then return their index 
//only one solution for each array
import java.util.*;

class Twosum{
	public static int[] two_sum(int arr[],int target){
		int []ans=new int[2];
		ans[0]=ans[1]=-1;
		HashMap <Integer,Integer> map=new HashMap<>();
		int n=arr.length;
		for(int i=0;i<n;i++){
			int num1=arr[i];
			int num2=target-num1;
			if(map.containsKey(num2)){
				ans[0]=map.get(num2);
				ans[1]=i;
				return ans;
			}
			map.put(arr[i],i);
		}
		return ans;
			
		
	}
	public static void main(String []args){
		int []arr={2,3,4,6};
		int target=9;
		int[] result= two_sum(arr, target);
		for(int i=0;i<2;i++){
			System.out.print( result[i]+" ");
		}
	}
}


undefined
