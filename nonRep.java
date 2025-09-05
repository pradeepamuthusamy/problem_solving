//find the first nonrepeating or first unique character

class nonRep{
	public static void main(String[] args){
		//String str="geeksforgeeks";
		//String str="pradeepa";
		//String str="meme";
		System.out.println(findRep(str));
	}
		
		static char findRep(String str){ 
		for(int i=0;i<str.length();i++){
			boolean check=false;
			for(int j=0;j<str.length();j++){
				if(i!=j && str.charAt(i)==str.charAt(j)){
					check=true;
					break;
				}
			}
			if(!check){
				return str.charAt(i);
			}
		}
		return '$';
	}
}






#undefined

		
