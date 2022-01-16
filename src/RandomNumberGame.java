import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Random GeneratedValue=new Random();
        int RandomValue=GeneratedValue.nextInt(0,100);
        System.out.println(RandomValue);
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the value to check the answer");
            int  UserValue =sc.nextInt();
            if (UserValue==RandomValue)
            {
                System.out.println("congrats,answer is correct");
                break;
            }
            else
                if(RandomValue>UserValue) {
                    System.out.println("your value  is less than the answer");
                }
                if(RandomValue<UserValue)
                {
                    System.out.println("your value is greater than the answer");
                }
        }

    }
}
