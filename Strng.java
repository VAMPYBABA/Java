import java.util.Scanner;

public class Strng {
  public static void main(String[] args) {
    /*
     * String name = "Sumit";
     * String Full_name = "Sumit Kumar";
     * String Sentence = "My name is sumit.";
     */

    /*
     * Scanner sc = new Scanner(System.in);
     * String name = sc.nextLine();
     * System.out.println("Your name is : "+name);
     */

    /*
     * Scanner sc = new Scanner(System.in);
     * String name = sc.next();
     * System.out.println("Your name is : "+name);
     */

    /*
     * concatenation
     * String fname = "sumit";
     * String lname = "kumar";
     * String full_name = (fname + " " + lname);
     * System.out.println(full_name);
     * 
     * // size of string
     * System.out.println(full_name.length());
     * 
     * // charAt
     * for(int i=0; i<full_name.length(); i++){
     * System.out.println(full_name.charAt(i));
     * }
     * 
     * //compare
     * if(fname.compareTo(lname) == 0){
     * System.out.println("Equal");
     * }
     * else {
     * System.out.println("Not equal");
     * }
     */

    // substing
    String sen = "My name is Sumit Kumar";
    //substring(beg index,end index)
    String name = sen.substring(11,15);
    System.out.println(name);
    
    //String are Immutable
  }
}