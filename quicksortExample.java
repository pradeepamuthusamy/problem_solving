import java.util.Scanner;
class quicksortExample{
	public static void main(String [] args){
		int []arr={33,12,78,90,10,15,24,56,77,99,11,15,51};
		quickSort(arr);
		print(arr);
		
	}
	public static void quickSort(int arr[]){
		quickSortHelper(arr,0,arr.length-1);
	}
	public static void quickSortHelper(int arr[],int start,int last){
		if(start>=last) return;
		int lf=start;
		int sf=last;
		int pivot =arr[last];
		int temp;
		
		while(true){
			while(lf<last && arr[lf] < pivot){
				lf++;
			}
			while( sf>start && arr[sf]>= pivot){
				sf--;
			}
			if(lf<sf){
				//swap(arr,lf,sf);
				temp=arr[sf];
				arr[sf]=arr[lf];
				arr[lf]=temp;
			}
			else{
				break;
			}
		}
		temp=arr[lf];
		arr[lf]=arr[last];
		arr[last]=temp;
		
		quickSortHelper(arr,start,lf-1);
		quickSortHelper(arr,lf+1,last);
	}
	//public static void swap(int []arr,int lf,int sf){
	//	int swap=arr[sf];
	//	arr[sf]=arr[lf];
	//	arr[lf]=swap;}

	public static void print(int []arr){
		int arr_ind;
		for(arr_ind=0;arr_ind<arr.length;arr_ind++){
			System.out.printf("%d ",arr[arr_ind]);
		}
	}
}