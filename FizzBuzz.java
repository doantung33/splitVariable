import java.util.Scanner;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        boolean isFizz = number %3 ==0;
        boolean isBuzz = number % 5==0;

        if(isFizz && isBuzz)
            return "FizzBuzz";

        if(isFizz)
            return "Fizz";

        if(isBuzz)
            return "Buzz";

        return number + "";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter");
        int num= scanner.nextInt();
        int i ;
        for (i=0;i<num;i++){
            System.out.print(fizzBuzz(i) + " , ");
        }
    }

}
