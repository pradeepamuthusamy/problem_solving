//Given n doors and n persons. The doors are numbered 1 to n and persons are given id's numbered 1 to n. Each door can have only 2 status open and closed.
//Initially all the doors have status closed.
//Find the final status of all the doors if a person changes the current status of all the doors, i.e.
//if status open then change to status closed and vice versa, for which he is authorized. 
//A person with id 'i' is authorized to change the status of door numbered 'j' if 'j' is a multiple of 'i'. 

import java.util.*;
class noOfOpenDoor{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printStatus(n);
	}
	static boolean hasEvenNoFactors(int n){
		double root=Math.sqrt(n);
		if(root*root==n){
			return false;
		}
		return true;
	}
	static void printStatus(int n){
		for(int i=1;i<=n;i++){
			if(hasEvenNoFactors(i)){
				System.out.print("closed"+" ");
			}
			else{
				System.out.print("opened"+" ");
			}
		}
	}





	#undefined

}
