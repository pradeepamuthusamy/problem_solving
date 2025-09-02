//sum of prime number from 1 to n
class prime{
	public static void main(String[] args){
		//int n=10;
		int n=11;
		//int n=50;
		
		boolean prime[] =new boolean[n+1];
		for(int i=0;i<=n;i++){
			prime[i]=true;
		}
		prime[0]=prime[1]=false;
		for(int p=2 ;p*p<=n;p++){
			if(prime[p]){
				for(int i=p*p;i<=n;i+=p){
					prime[i]=false;
				}
			}
		}
		int sum=0;
		for(int j=2;j<=n;j++){
			if(prime[j]){
				sum+=j;
			}
		}
		System.out.println(sum);
	}
}