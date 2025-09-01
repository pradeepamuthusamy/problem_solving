//Given three distinct numbers a, b and c find the number with a value in middle.

//Examples:

//Input : a = 20, b = 30, c = 40
//Output : 30

//Input : a = 12, n = 32, c = 11

//Output : 12

class middleOfThree{
	public static void main(String[] args){
		//int a=10,b=40,c=30;
		int a=20,b=40,c=30;
		//int a=10,b=20,c=30;
		if(a<b && b<c || b<a && c<b){
			System.out.println("middle value is:"+b);
		}
		else if(a>b && a<c || b<a && c>a){
			System.out.println("middle value is:"+a);
		}
		else{
			System.out.println("middle value is:"+c);
		}
	}
}
	
