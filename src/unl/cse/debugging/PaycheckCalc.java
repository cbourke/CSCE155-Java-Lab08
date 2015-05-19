package unl.cse.debugging;

import java.util.Scanner;

public class PaycheckCalc {

    public static final int SAVINGS = 10;

    public static void main( String[] args ){

        Scanner input = new Scanner( System.in );

        int socSecTax, ficaTax, fedTax, stateTax;

        double hoursWorked, payRate;

        System.out.print( "Please enter the percentage deducted due to Social Security: " );
        socSecTax = input.nextInt();

        System.out.print( "Please enter the percentage deducted due to FICA: " );
        ficaTax = input.nextInt();

        System.out.print( "Please enter the percentage deducted due to Federal tax: " );
        fedTax = input.nextInt();

        System.out.print( "Please enter the percentage deducted due to State tax: " );
        stateTax = input.nextInt();

        System.out.print( "Please enter the number of hours worked: " );
        hoursWorked = input.nextDouble();

        System.out.print( "Please enter the pay rate(per hour): " );
        payRate = input.nextDouble();

        double netPay;

        /* Calculate gross pay */
        grossPay = payRate * hoursWorked;

        /* Calculate net pay after taxes */
        netPay = grossPay - (grossPay * socSecTax);
		netPay = grossPay - (grossPay * ficaTax);
		netPay = grossPay - (grossay * fedTax);
		netPay = grossPay - (grossPay * stateTax);

        /* Displays the net pay */
		System.out.format( "The net pay before savings is: $%d\n", netPay );
		System.out.format( "The net pay after savings is: $%d\n", netPay - SAVINGS );
        
    } 

}
