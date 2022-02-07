import java.util.Scanner;

public class function1{
    
    public static void log(String text) {
        System.out.println(text);
    }
    
    public static double calculateTax(double pay, double deductible) {
        double taxableAmount = pay - deductible;
        return (taxableAmount * 0.8) + deductible;
    }

     public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        log("Tulumaksu kalkulaator. Sisesta brutopalk ja maksuvaba tulu kuus.");
        log("Sisesta brutopalk:");
        double pay = scanner.nextDouble();
        log("Sisesta maksuvaba tulu kuus:");
        double deductible = scanner.nextDouble();
        
        double taxedAmount = calculateTax(pay, deductible);
        log("Parast tulumaksu jaab netopalgaks " + taxedAmount);
        scanner.close();
        return;
     }
     
     
}