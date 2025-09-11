//  given a binary substring
//count the substring that should start and end with '1'

class BinarySubString{
	public static void main(String[] args){
		String str="000100101";
		int len=str.length();
		int count =0;
		for(int i=0;i<len;i++){
			if(str.charAt(i)=='1'){
				for(int j=i+1;j<len;j++){
					if(str.charAt(j)=='1'){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}

#undefied
