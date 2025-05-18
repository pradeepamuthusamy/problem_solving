class valid_palindrome{
	public static void main(String args[]){
		//String s="A  man, a plan, a canal: Panama ";
		String s ="race a car";
		System.out.println(is_palindrome(s));
		
		
	}
	public static boolean is_palindrome(String s){
		StringBuilder cleaned=new StringBuilder();
		for(char c:s.toCharArray()){
			if(Character.isLetterOrDigit(c)){
				cleaned.append(Character.toLowerCase(c));
				
			}
		}
		String original=cleaned.toString();
		String reversed=cleaned.reverse().toString();
		return original.equals(reversed);
	}
}