import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n*************** Welome to Number Guessing Game ****************");
        System.out.println("\nRules");
        System.out.println("1) You need to guess my selected numbers from 1 to 100");
        System.out.println("2) You will get 5 trials");
        System.out.println("3) You will get hints on your every input");
        System.out.println("Press 1 to Continue ");
        System.out.println("Press 2 to Exit");
         int in=sc.nextInt();
        int num=(int) (Math.random()*100);  //(int) converts double to int
         if(in==1)
        {
            System.out.println("The Game Starts");
            for(int i=4;i>=0;i--)
            {
                if(i!=0) //just for formality
            {
            System.out.println("Guess the number");
            }
            int a=sc.nextInt();
            if(num>a)
            {
            System.out.println("The number is greater than this number("+i+" trials remaining)");
            if(i==0)
            {
                System.out.println("\n*********** Game Over! You Lost *************");
                System.out.println("The number was "+num+"\n\n");
            }
            }
            else if(num<a)
            {
            System.out.println("The number is less this number("+i+" trials remaining)");
            if(i==0)
            {
                System.out.println("***********Game Over , You Lost*************");
                System.out.println("The number was"+num);
            }
            }
            else if(num==a)
            System.out.println("Congratulations You guessed it correctly in "+(5-i)+"th attempt.");
        }   
        }
        else if(in==2)
        {
            System.out.println("Thank you for using the Program");
        }
        else
        {
            System.out.println("Wrong Input");
        }
        sc.close();
    }
}
