package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;//6


        Scanner scan = new Scanner(System.in);
        //6-ask the user for the number of sales:
        System.out.println("Enter the number of salesPerson");
        int salesNumber=scan.nextInt();
        int[] sales = new int[salesNumber+1];
        int sum;
        for (int i=1; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
            //5- instead of stocking in the array starting from index 0 we start from 1
            //sales[i+1] = scan.nextInt(); //we shoud extend the lenght by 1
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=1; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        //1-average :
        System.out.println("\n Average :"+(double)sum/5);
        //2-Searching the maximum sale :
        int indexMax=0;

        for (int i=1;i<sales.length;i++){
            if(sales[indexMax]<sales[i]){
                indexMax=i;
            }
        }
        System.out.println("Salesperson "+(indexMax+1)+" had the highest sale with $"+sales[indexMax]);
        //3-Searching the maximum sale :
        int indexMin=0;

        for (int i=1;i<sales.length;i++){
            if(sales[indexMin]>sales[i]){
                indexMin=i;
            }
        }
        System.out.println("Salesperson "+(indexMin+1)+" had the lowest sale with $"+sales[indexMin]);
        //4- comparing with a user's input amount
        System.out.println("Enter a value :");
        int value=scan.nextInt();
        int count=0;
        System.out.println("\nThe salesperson who exceeded the amount "+value);
        for (int i=1; i<sales.length; i++)
        {
            if(sales[i]>value) {
                System.out.println("id : " + i + "amount : " + sales[i]);
                count++;
            }
        }

        System.out.println("The total number of sales person whose their sales exceeded the value entered : "+count);
        //5-


        //6-
    }
}