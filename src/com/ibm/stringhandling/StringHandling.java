package com.ibm.stringhandling;

class StringHandling {
	public static void main(String[] args) {
		String a="Welcome to Java World",s="";
		int x;
		for(x=0;x<a.length();x++)
		{
			if(x==5)
				System.out.println("The character at 5th position is-->"+a.charAt(x));
			if(a.charAt(x)=='a')
			{
				System.out.println("The first occurence of character 'a' is at "+x+"th position");
				break;
			}
		}
		a=a+"-Let us learn";
		System.out.println("New Concatenated String-->"+a);
		System.out.println(a.replace('a','e'));
		for(x=0;x<a.length();x++)
		{
			if(x>4 && x<10)
				s+=a.charAt(x);
		}
		System.out.println("String between 4th position and 10th position-->"+s);
		System.out.println("Lower case of the string-->"+a.toLowerCase());
		
		
	}

}
