import java.util.Scanner;
//Bashaer alhuthali
//Java Bootcamp

public class Main {
    public static void main(String[] args) {

    //Q1.Write a program that prints the numbers from 1 to 100 such that:
        /*for (int i =1; i<= 100; i++){
            boolean isMultiplied=false;
            if(i%3==0)
            {
                isMultiplied=true;
                if(i%5==0)
                {
                    System.out.println("FizzBuzz");
                    continue;
                }
                System.out.println("Fizz");
            } else if (i%5==0) {
                isMultiplied=true;
                System.out.println("Buzz");
            }

            if(isMultiplied!=true){
                System.out.println(i);
            }
        }*/

    //Q2.Write a Java program to reverse a string.
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text ");
        String text = input.nextLine();
        for (int i =text.length()-1;i>=0; i--){
            System.out.print(text.charAt(i));
        }*/

    //Q3.Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
       /*Scanner input = new Scanner(System.in);
        int number=0;
        do {
            System.out.println("Please enter a positive number ");
            number= input.nextInt();

            if(number >= 0) {

                 for (int i = 1; i <= 10; i++) {
                    int result = number * i;
                    System.out.println(number + " * " + i + " = " + result);
            }
          }
        }while(number<0);*/

    //Q4.Write a program to find the factorial value of any number entered through the keyboard.
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ");
        int number= input.nextInt();
        input.nextLine();
        int result =1;
        for (int i = 1; i <=number ; i++) {
             result *= i;
        }
        System.out.println("The result is " + result);*/

    //5.Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)
        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number ");
        int firstNumber= input.nextInt();
        input.nextLine();

        System.out.println("Please enter the second number ");
        int secondNumber= input.nextInt();

        int result= 1;
        for(int i =1; i<=secondNumber;i++){
            result *= firstNumber;
        }
        System.out.println("The result is " + result);*/

        //Q6.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

        /*Scanner input = new Scanner(System.in);

        int oddSum =0;
        int evenSum =0;
        String answer=null;
        do {
            System.out.println("\nPlease enter a number ");
            int Number = input.nextInt();
            input.nextLine();
            if (Number%2==0){
                evenSum += Number;
            }else if (Number%2!=0){
                oddSum += Number;

            }

            System.out.println("\nto exit enter 'Yes' ");
            answer=input.nextLine().toLowerCase();

        }while(!answer.equals("yes"));
        System.out.println("the sum of the odd numbers is " + oddSum);
        System.out.println("the sum of the even numbers is " + evenSum);*/

        //Q7.Write a program that prompts the user to input a positive integer. It should then output a message indicating whether the number is a prime number.
        /*Scanner input = new Scanner(System.in);
        int Number=0;
        Boolean IsPrime = true;
        do {
            System.out.println("\nPlease enter a positive number ");
            Number = input.nextInt();
            input.nextLine();

            if (Number>0) {
                for (int i = 2; i <Number; i++) {
                    if(Number%i==0)
                    {
                        IsPrime = false;
                        break;
                    }
                }
                if(IsPrime ==true){
                    System.out.println("the number is a prime");
                }
            }
        }while(Number<0);*/


        //Q8.Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
        /*Scanner input = new Scanner(System.in);

        int positiveCount =0;
        int negativeCount =0;
        int zeroCount =0;

        String answer=null;
        do {
            System.out.println("\nPlease enter a number ");
            int Number = input.nextInt();
            input.nextLine();
            if(Number == 0){
                zeroCount++;
            }
            else if (Number>0){
                positiveCount++;
            }else{
                negativeCount++;

            }

            System.out.println("\nto exit enter 'Yes' ");
            answer=input.nextLine().toLowerCase();

        }while(!answer.equals("yes"));
        System.out.println("Count of the positive numbers is " + positiveCount);
        System.out.println("Count of the negative numbers is " + negativeCount);
        System.out.println("Count of Zero numbers is " + zeroCount);*/

        //Q9.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use another for loop to print the days (Days 1 -7) for each week.
        /*for (int i = 1; i <= 4; i++) {
            System.out.println("\nWeek "+i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("\nDay"+j);
            }
        }*/

        //Q10.Write a program thats check if the word is a palindrome or not. hint: A string is said to be a palindrome if it is the same if we start reading it from left to right or right to left.


        /*Scanner input = new Scanner(System.in);
        System.out.println("Please enter a text ");
        String word = input.nextLine();
        String wordRe=null;

        for (int i =word.length()-1;i>=0; i--){
            wordRe += word.charAt(i);
        }
        if(word.equals(wordRe)){
            System.out.println("The word is a palindrome");
        }else{
            System.out.println("The word is not a palindrome");

        }*/
    }
}
