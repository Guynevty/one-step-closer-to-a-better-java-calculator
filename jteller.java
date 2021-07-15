import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class jteller{



    public static void main(String[] args) {
        int k = 1;
        String L;
        int o;
        int sub;
        String demo;
        char y;

       System.out.println("enter Sentence here, it will tell you how many words there are in it. ");

       Scanner scan = new Scanner(System.in);
       String p = scan.nextLine();
       int bob = 0;
       while( k<p.length()){
          // L = p.substring(0,k++);
             y = p.charAt(k);
           if (y ==' '){

               bob+=1;
               p.replace(" ","3");

            // System.out.println("hello");

          }
          
        //  System.out.println(L);
         k++;
       }
     
       bob+=1;

      System.out.println(bob);
      System.out.println("note: a letter with spaces surounded by it counts as a word to the code ");
    
      

       
    }
}