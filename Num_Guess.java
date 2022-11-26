import java.util.*;
class Estmt_num
{
    public void start()
    {
        Random r = new Random(); //usage of the random class for generating random numbers
        int v = r.nextInt(2525); // for generating the pseudo random number from the computer
        System.out.println("Random Number generated\n");
        int s = 3;
        System.out.println("You have only " + s + " chances to guess the number\n");
        int prize = 2525; //Used for correct guess
        int i = 0;
        for( i = 0; i < s; i++)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number you've guessed ?? : \n");
            int l = sc.nextInt();
            if(l == v)
            {
                System.out.println("Fantastic! You won the game\n");
                System.out.println("Your score is " + prize);
                break;
            }
            else if(l > v)
            {
                if(l - v > 25)
                {
                    System.out.println("Your guess extremely High !!\n");
                }
                else
                {
                    System.out.println("Your guess nearly high !!\n");
                }
            }
            else
            {
                if(v - l > 25)
                {
                    System.out.println("Your guess is extremely low !!\n");
                }
                else
                {
                    System.out.println("Your guess is nearly low !!\n");
                }
            }
            prize = prize - 10; //decreasing reward for every wrong guess
        }
        if(i == s)
        {
            System.out.println("Sorry!!! You're unable to guess the number\n");
            System.out.println("The random number is " + v);
            prize = 0;
            System.out.println("Your reward is : " + prize);
        }
    }
}
public class Num_Guess{
    public static void main(String args[])
    {
        System.out.println("Welcome to the Number Guessing Game !!\n");
        System.out.println("Enter your choice: 1.Play \n2.Exit \n");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        if(op == 1)
        {
            Estmt_num g = new Estmt_num();
            g.start();
            System.out.println("Do you want to play again: Yes/No\n");
            String a = sc.next();
            while(a.equalsIgnoreCase("Yes"))
            {
                g.start();
                System.out.println("Do you want to play once again: Yes/No\n");
                a = sc.next();
            }
        }
        else {
            System.out.println("You're now exited !!\n");
        }


    }
}
