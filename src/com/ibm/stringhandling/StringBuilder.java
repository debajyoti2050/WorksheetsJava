package com.ibm.stringhandling;

import java.util.StringTokenizer;

class StringBuilder {
	StringTokenizer str = new StringTokenizer("C:\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE");
	int i = 1;
	String a = "", b = "", c = "";
	while (str.hasMoreTokens()) {

		if (i == 1) {
			a = str.nextToken("\\");
			i++;
		} else if (i == 2 || i == 3) {
			b += str.nextToken("\\");
			b = b.concat("||");
			i++;
		} else if (i == 4) {
			b += str.nextToken("\\");
			i++;
		} else {
			c = str.nextToken("\\");
			i++;
		}

	}
	System.out.println("\n\n...String Builder...");
	System.out.println("Drive : " + a + "\nFolders : " + b + "\nFile : " + c);

}
