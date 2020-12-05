import java.util.*;

public class Password2{

     static String Calculator(String s, int a){

            Vector<Integer> vector = new Vector<>();

            for(int i=0; i<=s.length()-1; i++) 
      	         vector.add(((s.charAt(i)-96) + a)%26);
               
            return vector.toString();
     }
     public static void main(String[] args){
      
           //user will run with java <Password2(program_name)> <string> <number>            
           String s = args[0];
           int a = Integer.parseInt(args[1]);
           
           System.out.println("Password: " + s);
           System.out.println("Number: " + a);
           System.out.println("Size: " + s.length());
           System.out.println("New Password: " + Calculator(s,a));
      }
}
