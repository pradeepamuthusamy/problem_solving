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

}