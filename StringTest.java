package stringtest;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

//        *** Extracting First and Last name from the the String ***
        
         System.out.print("What is your name?\t");
         String name = reader.nextLine().trim();

         System.out.printf("First name:\t%s"
         + "\nLast name:\t%s\n", name.substring(0, name.indexOf(" ")), name.substring(name.lastIndexOf(" ") + 1));
         
        
        
//       *** String concatenation ***
//        System.out.println(1 + " Welcome " + 'a' + 1);                                    
//        Returns 1 Welcome a1
//        System.out.println("Wlecome" + 1);                                                    
//        Returns Wlecome1 
//        System.out.println("Wlecome to".concat(" Iran"));                             
//        Returns Wlecome to Iran
//        System.out.println("Wlecome to" + " Iran");                                         
//        Returns Wlecome to Iran
        //       *** Getting String length ***
//        System.out.println("Mahdi".length());                                         
//        Returns Wlecome to 5
        
        
        //       *** Getting Characters from a String ***
        /*
         String name = "Mahdi";
         char ch1 = name.charAt(0); 
        //        Returns 'M'
         char ch2 = name.charAt(name.length() - 1); 
        //        Returns 'i'
         */
        
        
//      *** Converting a String to LOWER CASE or UPPER CASE ***
//        System.out.println("Mahdi".toLowerCase()); 
//        Returns mahdi
//        System.out.println("Mahdi".toUpperCase());
//        Returns MAHDI
        //      *** Reading a String from the Console ***
//        String value1 = reader.next();    
//        Reads a String that ends with a whitespace.
//        String value2 = reader.nextLine();
//        Reads a String that ends with an Enter key.
        
        
        //      *** Comparing Strings ***
        /*
         String s1, s2, s3, s4;
         s1 = "Iran";
         s2 = "Esfahan";
         s3 = s1;
         s4 = "IRAN";
        
         System.out.println(s1.equals(s2));      
        //        Returns false
         System.out.println(s1.equals(s3));
        //        Returns true
        
         System.out.println(s1 == s2);
        //        Returns false
         System.out.println(s1 == s3);
        //        Returns true
        
         System.out.println(s1.compareTo(s2));
        //        Returns 4
         System.out.println(s1.compareTo(s3));
        //        Returns 0
        
         System.out.println(s1.equalsIgnoreCase(s4));
        //        Returns true
         System.out.println(s1.compareToIgnoreCase(s4));
        //        Returns 0
        
         System.out.println(s1.startsWith("LA"));
        //        Returns false
         System.out.println(s1.endsWith("n"));        
        //        Returns true
         System.out.println(s2.contains("fa"));
        //        Returns true
        
         */
        
        
//      *** Obtaining Substrings ***
        /*
         String string = "I am a coder!";
         System.out.println(string.substring(2));
        //        Returns am a coder!
         System.out.println(string.substring(7));
        //        Returns coder!
         System.out.println(string.substring(7, 9));
        //        Returns co
         */
        
        
        //      *** Finding indexes ***
        /*
         String message = "Welcome to Java";

         System.out.println(message.indexOf('o'));                                                                  
        //        Returns 4
         System.out.println(message.indexOf("om"));                                                             
        //        Returns 4
         System.out.println(message.indexOf('o', 5));                                                            
        //        Returns 9
         System.out.println(message.indexOf("om", 5));                                                        
        //        Returns -1
         System.out.println(message.lastIndexOf('o'));                                                         
        //        Returns 9
         System.out.println(message.lastIndexOf("om"));                                                     
        //        Returns 4
         System.out.println(message.lastIndexOf('o', 5));                                                   
        //        Returns 4
         System.out.println(message.lastIndexOf("om", 5));                                              
        //        Returns 4
         */
        
        
        //      *** Conversion between Strings and numbers ***
        /*
         String number = "123";
         int nom1 = Integer.parseInt(number);
        //        Assign the nonString variable (number) contents to the int variable.
         float nom2 = Float.parseFloat(number);
        //        Assign the nonString variable (number) contents to the float variable.
         */
    }

}
