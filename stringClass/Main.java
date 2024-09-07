package stringClass;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // String name = "Oliver";
        // name.concat(" Carter");
        // System.out.println(name);  //Output Oliver --> sting in java is immutable 
        //java me string ko edit nahi kar sakte to resolve this issue in java we use 
        //StringBuilder class --> problem solved

        //StringBuilder will use the original string and do the operations in it --> save space

        //creation of StringBuilder Object with capacity 50.
        // StringBuilder name = new StringBuilder(50);
                        
        // name.append("Mississippi");
        // int length = name.length();  // will give the length of address
        // name.insert(length, " River");
        // System.out.println(name);   //Output :- Mississippi River
                
        // name.reverse();    // Output :- reviR ippississiM
        // name.delete(5, 10); // Output :- reviRssissiM
        // System.out.println(name.charAt(3));  // Output :- i

        	//creation of string using string literal
		// String firstString = "Java";
		
		// //creation of string using new keyword
		// String secondString = new String("Stream");
		
		// /*
		// Task 1 :- using concat() display Java Stream
		// */
		// System.out.println("------------"+"concat()"+"------------");
		// System.out.println("Concatenating using concat() :- "+firstString.concat(secondString));
		// System.out.println();
		
		// /*
		// Task 2 :- string comparison using equals(), == operator, compareTo()
		// */
		// System.out.println("------------"+"Comparison(.equals , == , compareTo)"+"------------");
		// String thirdString = "Thomas";
		// String fourthString = "THOMAS";
		
		// System.out.println("Comparison of Thomas with THOMAS using equals :- "+thirdString.equals(fourthString));
		// //string1.equalsIgnoreCase(string2) => case insensitive comparison
		// System.out.println("Comparison of Thomas with THOMAS using equals ignoring case:- "+thirdString.equalsIgnoreCase(fourthString));
		
		// System.out.println();
		// //using == operator
		// String fifthString = "Thomas";
		// String sixthString = new String("Thomas");
		
		// System.out.println("Comparison using == operator :- "+(thirdString==fifthString));
		
	
		// System.out.println("Comparison using == operator with new keyword :- "+(sixthString==fifthString));
		// //Line 39 sixthString refers to instance created in nonpool
		
		// System.out.println();
		// //using compareTo()
		
		// /*
		// 	if s1 and s2 are two strings which are to be compared 
		// 	if s1 == s2 then output is 0
		// 	if s1 > s2 then output is 1
		// 	if s1 < s2 then output is -1
		// */
		// //thirdString-->"Thomas"  fifthString-->"Thomas";
		// System.out.println("Comparison of Thomas and Thomas using comapreTo :- "+(thirdString.compareTo(fifthString)));
		// System.out.println("Comparison of Thomas and RudolfShelby using compareTo :- "+(thirdString.compareTo("RudolfShelby")));
	
        	/*
		Task 1 :- Other String methods like toUpperCase(),toLowerCase(),isEmpty(),startsWith(),endsWith(),length()
		
		// */
		// System.out.println("------------"+"Other String methods"+"------------");
		// String car = "Mercedes";
		// System.out.println("To upper case :- "+car.toUpperCase());
		// System.out.println("To lower case :- "+car.toLowerCase());
		// System.out.println();
		// //Tryout different scenarios of startsWith and endsWith
		// System.out.println("Check whether string starts with Merc :- "+car.startsWith("Merc"));
		// System.out.println("Check whether string ends with des :- "+car.endsWith("des"));
		
		// System.out.println();
		// System.out.println("Check whether a string is empty");
		// System.out.println("for string car :- "+car.isEmpty());
		// String str = "";
		// System.out.println("for string str :- "+str.isEmpty());
		// System.out.println();
		
		// System.out.println("To calculate length of string we use length()");
		// System.out.println("Length of string car is :- "+car.length());
		// System.out.println();
		/*
		Task 2 :- substring(),split(),indexOf(),trim(),replace()
		
		// */
		// System.out.println("------------"+"substring(),split(),indexOf(),trim(),replace()"+"------------");
		
		// String forest = "Grand Canyon National Park";
		// System.out.println();
		// System.out.println("substring(2,6) of string forest :- "+forest.substring(2,6));
		//It gives the characters in string from startpoint i.e 2 to 6 which is endpoint
		
		// System.out.println();
		// System.out.println("split() will split the string into String array based on the character given in parameter");
		// String[] words = forest.split("a");
		// //It will split the string forest based on white spaces
		// for(String w:words){  
		// 	System.out.println(w);  
		// }
		
		// System.out.println();
		// System.out.println("indexOf() returns the index of substring passed as parameter");
		// System.out.println("forest.indexOf(Canyon) will give result as :- "+forest.indexOf("Canyon"));
		
		// System.out.println();
		// String s1 = "   Amazon ";
		// System.out.println("trim() is used to remove the leading and trailing white-spaces");
		// System.out.println("s.trim() will give result as :- "+s1.trim());
		
		// System.out.println();
		// System.out.println("replace() method replaces the string according to the given parameters");
		// System.out.println("forest.replace('a','e') will give result as :- "+forest.replace("a", "e"));
		// //replacing all the occurences of a to e

        // System.out.println();
		// System.out.println("------------"+"Java 11 String methods"+"------------");
		// String one = "amazon";
		// System.out.println("Repeat method used to repeat the string having count passed as parameter");
		// System.out.println("Repeat string one 3 times :-"+one.repeat(3));
		
		// System.out.println();
		// String two = "Antarctica";
		// System.out.println("isBlank() tells us whether the string contains only Blank spaces");
		// System.out.println("Checking isBlank() with string two :- "+two.isBlank());
		// String blank="     ";
		// System.out.println("Checking isBlank() with string blank :- "+blank.isBlank());
		
		// System.out.println();
		// String whiteSpaceLeadingAndTrailing = "   Pacific  ";
		// String whiteSpaceLeading = "   Pacific";
		// String whiteSpaceTrailing = "Pacific    ";
		
		// System.out.println("In Java 11, we have three methods to remove extra white-spaces\n"
		// 		+ "1.strip() => All the leading and trailing white-spaces are removed.\n"
		// 		+ "2.stripLeading() => All the leading white-spaces are removed.\n"
		// 		+ "3.stripTrailing() => All the trailing white-spaces are removed.\n"
		// 		+ "These methods are extension to the trim() method which we have already seen\n");
		
		// System.out.println("----Demo----");
		// System.out.println("Using strip() :- "+whiteSpaceLeadingAndTrailing.strip());
		// System.out.println("Using stripLeading() :- "+whiteSpaceLeading.stripLeading());
		// System.out.println("Using stripTrailing() :- "+whiteSpaceTrailing.stripTrailing());
		
		// System.out.println();
		// System.out.println("String.lines() splits the string by its line terminators and returns a Stream of Strings");
		// String str1 = "A \n B \n C \n D"; 
		// System.out.println("Use String.lines() on string str1");
        // Stream<String> lines = str1.lines();
        // lines.forEach(System.out::println);


		//Text Block --> multi line string ////////////////////////////////////////////////////////////////////////

		// String textBlock  = """
		// 		"Enter
		// 		Multi-line
		// 		text
		// 		""";

		// // String myText = "Mathew\nJohn\nJacob\n";
		// String myText = """
		// 	Mathew
		// 	John
		// 	Jacob
		// 	""";
		// System.out.println(myText);

		String a = " Hello ";
		a = a.trim();
		System.out.println(a);
		String b = a.concat("World");
		System.out.println(b);
		String c = a+"World";
		System.out.println(c);

		String s = "";
		s = 1+1+"u";
		System.out.println(s);
		s = "u"+1+1;
		System.out.println(s);
		s="u"+(1+1);
		System.out.println(s);



        

    }
}
