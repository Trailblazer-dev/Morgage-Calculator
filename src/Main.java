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
        while (true) {
            System.out.print("Enter your principle: ");
            principle = scanner.nextDouble();
            if(principle>=1000 && principle<=10000000){
                break;
            }
            else{
                System.out.println("Enter a value between 1k and 1M");
            }
        }
        scanner.nextLine();
        while (true) {
            System.out.print("Annual interest: ");
            rate = scanner.nextDouble();
            if(rate >=1 && rate <=30){
                break;
            }
            else
                System.out.println("Enter a value between 1 and 30");
        }
        scanner.nextLine();
        while(true) {
            System.out.print("Number of years: ");
            year = scanner.nextInt();
            if(year>=1 && year <=30){
                break;
            }
            else {
                System.out.println("Enter a value between 1 and 30");
            }
        }
        int months = year*12;

        double annualRate= (rate/100)/12;
        double ratePow = Math.pow(1+ annualRate,months);
        Mortgage = (principle * (annualRate*ratePow))/(ratePow-1);

        System.out.println("YOur mortgage is : "+Mortgage);


    }
}