import java.util.Scanner;
import java.util.Random;
class selection 
{
     public static void print( int [] arr )
	 {
	    int arr_ind;
		for( arr_ind = 0; arr_ind < arr.length; arr_ind += 1)
		{
		   System.out.printf("%02d ", arr [ arr_ind ]);
		}
		System.out.println();
	 }
     public static void main(String [] args)
	 {
		int noe;
		Scanner kbd = new Scanner ( System.in );
        noe = kbd.nextInt();
		int [] arr = new int [noe];
		Random rnd = new Random();
		int arr_ind;
		int temp;
		for( arr_ind = 0; arr_ind < noe; arr_ind +=1)
		{
		   temp = rnd.nextInt() ;
		   if ( temp < 0)
		      temp = -temp;
			  arr [ arr_ind ]  = temp;
		}
	//	print ( arr );
		int scop_begin;
		int small_finder;
		int smallest=0;
		int ind_smallest=0;
		// noe 10
		// 0 to 9
		long start = System.currentTimeMillis();
		for ( scop_begin = 0; scop_begin < arr.length-1; scop_begin += 1)
		{
			smallest = arr [ scop_begin ];
			ind_smallest = scop_begin;
			for ( small_finder = scop_begin + 1;small_finder < arr.length; small_finder += 1)
			{
			   if ( arr [ small_finder ] < smallest )
			   {
				  smallest = arr [ small_finder ];
				  ind_smallest = small_finder;
			   }
			}
		
			temp = arr [ scop_begin ];
			arr [ scop_begin  ] = smallest;
			arr [ ind_smallest ] = temp;
		}
		//long stop = System.currentTimeMillis();
		//double time_taken = ( stop - start ) / 1000.0;
		//System.out.printf("Selection Sort %d , time Taken = %.3g\f", noe, time_taken);
		print ( arr );
		
		
		
		
		
		
		
		
		
	 }
}
