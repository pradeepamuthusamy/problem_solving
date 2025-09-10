class RemoveCharString{
	static final int NoOfChars=256;
	static int[] getCharArrayCount(String str){
			int[] count=new int[NoOfChars];
			for(int i=0;i<str.length();i++){
				count[str.charAt(i)]++;
			}
			return count;
	}
	public static String RemoveChar(String str1,String str2){
		int[] count=getCharArrayCount(str2);
		int ip_ind=0,res_ind=0;
		char arr[] =str1.toCharArray();
		while(ip_ind!=arr.length){
			char temp=arr[ip_ind];
			if(count[temp]==0){
				arr[res_ind]=arr[ip_ind];
				res_ind++;
			}
			ip_ind++;
		
		}
		String str=new String(arr);
		return str.substring(0,res_ind);
	}
	public static void main(String[] args){
		String str1="geeksforgeeks";
		String str2="mask";
		System.out.println(RemoveChar(str1,str2));
	}
}

