// Write a function that reverses a string. The input string is given as an array of characters s
// input: ["o","l","l","e","h"]
// output: ["h","e","l","l","o"]

class reverse_ch_arr{
	public static void main(String args[]){
		char[] arr={'o','l','l','e','h'};
		int n=arr.length;
		string_rev(arr);
		System.out.print("[");
		for(int i=0;i<n;i++){
			System.out.print(arr[i] +",");
		}

		System.out.print("]");
		
	}
	public static void string_rev(char[] s){
		int start=0;
		int end=s.length-1;
		while(start<end){
			char ch=s[start];
			s[start]=s[end];
			s[end]=ch;
			start++;
			end--;
			}
	}
}