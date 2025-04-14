import java.util.Scanner;
import java.util.Random;
class insertion_sort
{
     public static void print ( int [] arr )
	 {
	    int arr_ind ;
		for( arr_ind = 0; arr_ind < arr.length ; arr_ind +=1)
		  System.out.printf("%d ", arr [ arr_ind ] );
		  
		  System.out.println();
	 }

     public static void main(String [] args)
	 {
       // int arr [] = { 89,23,90,34,67,10,35,67,88,5,15,51,99,33,77,66};
		int noe;
		Scanner kbd = new Scanner ( System.in );
        noe = kbd.nextInt();
		Random rnd = new Random();
		int arr [] = new int [ noe ];
		
		
		
 
		int arr_ind;
		for ( arr_ind = 0; arr_ind < noe ; arr_ind += 1)
		{
			arr [ arr_ind ]  = rnd.nextInt(100000000);
		}
		int unsorted_ind;
		int shifter;
		int temp;
		print ( arr );
	    long start = System.currentTimeMillis();
		for( unsorted_ind = 1; unsorted_ind < arr.length; unsorted_ind += 1)
		{		
			shifter = unsorted_ind;
			while ( shifter > 0 && arr [ shifter ] < arr [ shifter - 1 ] ) 
			{
			   temp = arr [ shifter ] ;
			   arr [ shifter ]  = arr [ shifter - 1];
			   arr [ shifter - 1] = temp;
			   shifter -=1;
			
			}
			print(arr);
		}
	
	 }
}
