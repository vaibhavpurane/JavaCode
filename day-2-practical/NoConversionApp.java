//Write a program to convert decimal to binary and binary to decimal number.

import java.util.*;
import java.lang.Math;

class NumberConversion{
    public int dno;
    public int bno[];

    NumberConversion(int number){
        dno=number;
        int rem;
        int binNo[] = new int[5];

        for(int i=2 ;i<dno;i++){
            rem = dno%i;
            dno = dno/i;
            
            binNo[i]=rem;
        }
        for(int i=5;i>0;i--)
            System.out.println("Value of decimal number in binary is: "+binNo);
              
    }
    NumberConversion(int bin[], int size){
        bno=bin;
        double val=0;
        int base=2;
        double result=0;
        for(int i=0;i<size;i++){
            val = (bno[i])*(Math.(base,i));
            result +=val; 
        }
        System.out.println("Decimal value of binary number is "+result); 
    }
}
public class NoConversionApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        int number = sc.nextInt();
 
        System.out.println("Enter size of binaryNo array ");
        int s = sc.nextInt(); 
        System.out.println("Enter binary number ");
        int bin[] = new int[s];
        for(int i=0;i<s;i++)
            bin[i]=sc.nextInt();
      
        System.out.println("Binary number is "+bin);
    
        NumberConversion s = new NumberConversion(number);

        NumberConversion s2 = new NumberConversion(bin,s);

    }
}


