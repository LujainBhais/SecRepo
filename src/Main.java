import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
         System.out.print("Enter your choice (A,B,C or D) : \n A: Converts a temperature from Celsius to Fahrenheit.\n B: Enter two number then output the next 6 number where the number is the subtract of previous two number \n C: Print a right-aligned decreasing number pattern.\n C: Reverse the digits of an entered integer");
        System.out.print(" \n Enter character : ");
         char choice=input.next().charAt(0);

        switch (choice){
            case 'a':
            case 'A':
                System.out.print("Enter the Temperature in Celsius : ");
                float temp=input.nextInt();
                float result = (temp/((float) 9 /5)+32);
                System.out.print("The Temperature in Fahrenheit : "+result);
                break;
            case 'b':
            case 'B':
                System.out.print("Enter First number : ");
                int num1= input.nextInt();
                System.out.print("Enter Second number : ");
                int num2= input.nextInt();
                for (int i=0 ; i<6 ; i++){
                    int next=num1-num2;
                    System.out.print(next+" ");
                   num2=num1;
                   num1=next;
                }
                System.out.println();
                break;
            case 'c':
            case 'C':
                System.out.print("Enter the row : ");
                int row =input.nextInt();
                for (int i=row;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print(j+" ");
                    }
                    System.out.println();}
                    break;
            case 'd':
            case 'D':
                System.out.print("Enter an integer : ");
                int number =input.nextInt();
                int reversed=0;
                while (number!=0){
                    int digit = number % 10;
                    reversed = reversed * 10 + digit;
                    number /= 10;
                }
                System.out.print("Reversed = "+reversed);
                break;
            default:
                System.out.print("Enter correct character .");
                break;

    }
  }
}