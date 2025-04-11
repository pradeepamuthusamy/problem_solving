import java.util.Scanner;
class amicable{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sof_num1=isAmicableHelper(n1);
		//System.out.println("enter:");
		int sof_num2=isAmicableHelper(n2);
		//System.out.println("enter:");
		if(n1==sof_num2 && n2==sof_num1){
			System.out.println("the numbers are amicable ");
		} 
		
	}
	
	public static int isAmicableHelper(int n){
		int sof_num=1;
		int cff;
		for(cff=2;cff*cff<=n;cff++){
			if(n%cff==0){
				sof_num+= (cff+(n/cff));
			}
		}
		return sof_num;
	}
}

undefined
