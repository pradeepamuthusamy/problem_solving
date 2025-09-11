import java.util.*;
class StringLength{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.println("The length of the string is: "+ str.length());
		
	}
}

class StringConcat{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string1:");
		String str1=sc.next();
		System.out.print("Enter the string2:");
		String str2=sc.next();
		String result1 = str1 + " " + str2;
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Result 1:" + result1);
        System.out.println("Result 2:" + result2);
		
		
	}
}




class StringCompare{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str1=sc.next();
		System.out.print("Enter the string2:");
		String str2=sc.next();
		System.out.println("Equals: " + str1.equals(str2));
        System.out.println("Compare To: " + str1.compareTo(str2));

	}
}



class StringCaseConvert{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());

		
	}
}


class StringSubString{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		String substring = str.substring(3);
        System.out.println("Substring: " + substring);

		
	}
}

class StringReplace{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.print("Enter the string replaced:");
		String str1=sc.next();
		String replaced = str.replace(str,str1);
        System.out.println("Replaced: " + replaced);

		
	}
}


class StringSplit{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str = "apple,banana,cherry";
        String[] fruits = str.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
		}

		
	}
}