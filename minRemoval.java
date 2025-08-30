//Remove minimum elements from either side such that 2*min becomes more than max
//Given an unsorted array, trim the array such that twice of minimum is greater than maximum in the trimmed array. Elements should be removed either end of the array.
//Number of removals should be minimum.

//Examples: 

//arr[] = {4, 5, 100, 9, 10, 11, 12, 15, 200}
//Output: 4
//We need to remove 4 elements (4, 5, 100, 200)
//so that 2*min becomes more than max.



import java.util.*;

class minRemoval{
	
	public static void main(String[] args){
		//int arr[]={20,7,6,5};
		//int arr[]={20,1,4,3};
		int arr[]={4,7,6,5};
		int n=arr.length;
		System.out.println(removal(arr,n));
	}	

	
	static int min(int[] arr,int l,int h){
		int mini=arr[l];
		for(int i=l;i<=h;i++){
			if(arr[i]<mini){
				mini=arr[i];
				
			}
		}
		return mini;
	}
	static int max(int[] arr,int l,int h){
		int maxi=arr[l];
		for(int i=l;i<=h;i++){
			if(arr[i]>maxi){
				maxi=arr[i];
			}
		}
		return maxi;
	}
	static int minFind(int a,int b){
		return (a<b) ? a:b;
	}
	static int removal(int[] arr,int n){
		int table[][]=new int[n][n];
		int i,j,gap;
		for(gap=0;gap<n;++gap){
			for(i=0,j=gap;j<n;++i,++j){
				int mn=min(arr,i,j);
			    int mx=max(arr,i,j);
				table[i][j]=(2*mn>mx) ? 0: minFind(table[i+1][j]+1,table[i][j-1]+1);
			}
		}
		return table[0][n-1];
	}
}	

undefined
			

	
