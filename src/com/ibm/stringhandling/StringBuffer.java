package com.ibm.stringhandling;

class String_Buffer {
	StringBuffer a=new StringBuffer("This is StringBuffer");
	StringBuffer s=new StringBuffer();
	
	int x,y=0;
	a=a.append("This is a sample program");
	System.out.println("Original form -->"+a);
	for(x=0;x<a.length();x++)
	{
		if(x==20)
		{
			s=s.append("Object");
		}
		s=s.append(a.charAt(x));
	}
	System.out.println("Inserted form -->"+s);
	for(x=0;x<s.length();x++)
	{
		if(s.charAt(x)=='B')
		{
			y=x;
			break;
		}
	}
	System.out.println("Replaced form -->"+s.replace(y, y+6, "Builder"));
	System.out.println("Reversed form -->"+s.reverse());
  }
	
}
