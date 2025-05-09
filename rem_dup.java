//Leetcode problem no:26
//Remove Duplcates from the sorted array
/*
given a sorted array remove the duplicates and return the array size after removing return the length of the array as output.
Input:1|2|2|3|3|5
output:4
*/

class rem_dup{
	public static void main(String args[]){
		int arr[]={1,2,2,3,3,5};
		System.out.println(remove_duplicates(arr));
		
		
	}
	public static int remove_duplicates(int arr[]){
		int j=0;
	    for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[j]){
				j++;
				arr[j]=arr[i];
				
			}
		}
		return j+1;
	}
	
}















undefined
