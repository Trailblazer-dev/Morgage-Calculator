import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        double Mortgage,principle,rate;
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your principle: ");
        principle = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Annual interest: ");
        rate = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Number of years: ");
        year = scanner.nextInt();
        int months = year*12;

        double annualRate= (rate/100)/12;
        double ratePow = Math.pow(1+ annualRate,months);
        Mortgage = (principle * (annualRate*ratePow))/(ratePow-1);

        System.out.println("YOur mortgage is : "+Mortgage);


    }
}