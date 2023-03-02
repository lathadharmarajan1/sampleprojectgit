package org.gitSampleprojects;

public class LogicalProgram {
public static void main(String[] args) {
	String s= "welcome to java";
	String Reverse= "";
	for(int i=s.length()-1; i>=0; i--) {
		char c = s.charAt(i);
		Reverse=Reverse+c;
	}
	String upperCase = s.toUpperCase();
	System.out.println(Reverse);
	System.out.println(upperCase);
}
}
