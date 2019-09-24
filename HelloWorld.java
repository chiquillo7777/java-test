import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner (System.in);

         System.out.println("Enter a ramdom Integer number between 1900 and 2016");
         int givenNumber = sc.nextInt();
         System.out.println("\n");

         System.out.println("how old were you back in 2016?");
         int ageIn2016 = sc.nextInt();
         System.out.println("\n");
            if(givenNumber > ageIn2016){
                System.out.println(1);
            }else if(givenNumber == ageIn2016 ){
                System.out.println(0);
            }else if (givenNumber < ageIn2016){
                 System.out.println(-1);
            }

    }
}