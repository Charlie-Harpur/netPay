/*
 * Charlie Harpur
 * Finds the net pay (n) for an employee who works 40 hours (h) at 5.00 per hour (w) and has 2.00 (i) deducted 
 * for insurance and must pay 22% for tax (t). Displays answer in sentence form and uses the following formula: 
 * n=(h*w-i)-t*(h*w-i).
 * 28/02/2018
 */

package netpay;

public class NetPay
{
    public static void main(String[] args)
    {
        int hours = 40, weeks = 5, insurance = 2;
        double netPay, tax = 0.22;
        netPay = (hours * weeks - insurance)-tax *(hours * weeks - insurance);
        System.out.println ("The net pay is $" + netPay);
    }
    
}
