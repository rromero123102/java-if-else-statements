
package pkgif.pkgelse.statements;

// Import Scanner Here
import java.util.Scanner;


/**
 *
 * Name:
 * Period:
 * Project Name:
 * 
 * 
 */
public class IfElseStatements {

    // Create Scanner Object here So it may be used in all methods
    
    private static Scanner kb = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Happy Coding!
        
        
        //Invoke the methods here 
        //System.out.print("type grade here: ");
        question8();
        
        
    }
    
    
    public static void question1(){
        int grade = kb.nextInt();
        if (grade > 69)
            System.out.println("PASSING");
        else   
            System.out.println("NOT PASSING");
    }
    
    public static void question2(){
        int num = kb.nextInt();
        if (num <= 50)
            System.out.println("GO");
        else   
            System.out.println("STOP");
    }
    
    public static void question3(){
        int num = kb.nextInt();
        if (num % 2 == 0)
            System.out.println("EVEN");
        else   
            System.out.println("ODD");
    }
    
    public static void question4(){
        int num = kb.nextInt();
        if (num % 5 == 0)
            System.out.println("MULTIPLE OF 5");
        else   
            System.out.println("NOT A MULTIPLE OF 5");
    }
    
    public static void question5(){
        int num = kb.nextInt();
        if (num > 99)
            System.out.println("THREE DIGITS");
        else if (num > 9)   
            System.out.println("TWO DIGITS");
        else if (num > 0)   
            System.out.println("ONE DIGIT");
    }
    
    public static void question6(){
        int num = kb.nextInt();
        int[] usedNums = new int[] {12, 71, 80};
        
        for (int n : usedNums) {
            if (num == n) {
                System.out.println("THAT NUMBER IS RETIRED FROM THE SEATTLE SEAHAWKS");
            }
        }
    }
    
    public static void question7(){
        String state = kb.nextLine();
        String[] pwnStates = new String[] {"Washington", "Oregon", "Idaho"};
        
        for (String n : pwnStates) {
            if (state.equals(n)) {
                System.out.println("THAT STATE IS IN THE PWN");
                return;
            }
        }
        System.out.println("You should move to the PNW; it's great here!");
    }
    
    public static void question8(){
        System.out.println("What size drink? Short, Tall, Grandi, or Venti?");
        String drink = kb.nextLine();
        int oz;
        switch (drink) {
            case "Short":
                oz = 8;
                 break;
            case "Tall":
                oz = 12;
                 break;
            case "Grandi":
                oz = 16;
                 break;
            case "Venti":
                oz = 20;
                break;
            default:
                oz = 0;
                break;
        }
        if (oz > 0) {
            System.out.println(oz);
        }
        
        
    }
    
    public static void question9(){
        
    }
    
    public static void question10(){
        
    }
    
}
