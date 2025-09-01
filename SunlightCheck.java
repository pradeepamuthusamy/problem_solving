//Given the array arr[] of heights of certain buildings that 
//lie adjacent to each other, Sunlight starts falling from the left side of the buildings.
// If there is a building of a certain height, all the buildings to the right side of it 
//having lesser heights cannot see the sun. The task is to find the
// total number of buildings that receive sunlight.

//Examples: 

//Input: arr[] = [6, 2, 8, 4, 11, 13]
//Output: 4
//Explanation: Only buildings of height 6, 8, 11 and 13 can see the sun, hence output is 4.

import java.util.*;
class SunlightCheck{
	public static void main(String[] args){
		int[] arr={6, 2, 8, 4, 11, 13};
		int n=arr.length;
		System.out.println(CheckBuilding(arr,n));
	}
	static int CheckBuilding(int[] arr,int n){
		if(n==0) return -1;
		int ans=1;
		
		int max=arr[0];
		for(int i=1;i<n;i++){
			if(arr[i] > max){
				ans++;
				max=arr[i];
			}
			
		}return ans;
	
	}
}