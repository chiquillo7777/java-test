import java.util.Scanner;

public class HelloWorld {

    public static boolean isInteger(String x){
        try {
            Integer.parseInt(x);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

         Scanner sc = new Scanner (System.in);

         /*System.out.println("Enter a ramdom Integer number between 1900 and 2016");
         int givenNumber = sc.nextInt();
         System.out.println("\n");

         System.out.println("how old were you back in 2016?");
         int ageIn2016 = sc.nextInt();
         int dateOfbirth = 2016-ageIn2016;
         System.out.println("\n");
            if(givenNumber > dateOfbirth){
                System.out.println(1);
            }else if(givenNumber == dateOfbirth ){
                System.out.println(0);
            }else if (givenNumber < da){
                 System.out.println(-1);
            }*/

        String array1[] = {"1", "6","6", "h","1", "9","7", "5"};
        int sum=0;
        for (int i=0; i < array1.length; i++) {
            if(i != 2 && i!= 6 && i!= 8){
                try {
                    if(i%2 == 0 && isInteger(array1[i]) ){
                            sum = sum + Integer.parseInt(array1[i]);
                    }
                } catch (Exception e) {
                    throw e;
                }

            }

        }
        System.out.println(sum);

         Scanner input = new Scanner(System.in);

        int givenNumber = 1991;
        int dateOfBirth = 2016-25;

        if(givenNumber > dateOfBirth){
            System.out.println(1);
        }else if(givenNumber == dateOfBirth){
            System.out.println(0);

        }else if(givenNumber < dateOfBirth){
            System.out.println(-1);

        }

    }
}