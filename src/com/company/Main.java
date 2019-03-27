package com.company;
//import java.util.Base64;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        mainwhile:
        while (true) {
            Scanner in = new Scanner(System.in);
            //InputStreamReader str = new InputStreamReader (System.in);
            //BufferedReader uinp= new BufferedReader (str);
            System.out.print("Which assigment do you want to see?( 0<x<6 ) : ");
            int choose = in.nextInt();
            //val = uinp.readLine();
            switch (choose){
                case (1):{
                    Main.first_assigment();
                    break;
                }
                case (2):{
                    Main.second_assigment();
                    break;
                }
                case (3):{
                    Main.third_assigment();
                    break;
                }
                case (4):{
                    Main.fours_assigment();
                    break;
                }
                case (5):{
                    Main.fifs_assigment();
                    break;
                }
                default:
                    System.out.print(" 0 < x < 6 \n");
                    continue mainwhile;

            }
            //in.remove();
            System.out.print("If you want to continue enter  1  : ");
            choose = in.nextInt();
            if ( choose==1 ){
                continue ;
            }
            in.close();
            break;
        }
    }
    public static void first_assigment (){
        Scanner in_first = new Scanner(System.in);
        System.out.print("Enter binaric number : ");
        int number_int = in_first.nextByte(2);
        System.out.print( "Your number in Decimal : " + number_int + "\n" );
       /* byte *//* String binar = //in_first.nextLine;
       int decimal = 0;
        for (int i = 0; i < binar.length(); i++) {
            if (binar.charAt(binar.length() - i - 1) == '1') {
                dec += 1 << i;
            }
        }
*/    }
    public static void second_assigment (){
        Scanner in_second = new Scanner(System.in);
        System.out.print("Enter your int : ");
        int number = in_second.nextInt();
        System.out.print("-(" + number + ") = " + ~(number-1) + "\n");
    }
    public static void third_assigment (){
        Scanner in_third = new Scanner(System.in);
        System.out.print("Enter your int : ");
        int n = in_third.nextInt();
        int count = 0;
        while(n > 0 /* n!=0*/){
            //count++;
            //n = n&(n - 1);
            ////count += n & 1;
            ////n = n >>> 1;
            count++;
            n = n >> 1;

        }
        System.out.print("Amount bit input int : " + count + "\n");
        byte bNumber = Byte.MAX_VALUE;
        short shNumber = Short.MAX_VALUE;
        long lNumber = Long.MAX_VALUE;
        count = 1;
        while (bNumber > 0) {
            bNumber = (byte) (bNumber >> 1);
            count++;
        }
        System.out.print("Amount bit max byte : " + count + "\n");

        count = 1;
        while (shNumber > 0) {
            shNumber = (short) (shNumber >> 1);
            count++;
        }
        System.out.print("Amount bit max byte : " + count + "\n");

        count = 1;
        while (lNumber > 0) {
            lNumber = (lNumber >> 1);
            count++;
        }
        System.out.print("Amount bit max long : " + count + "\n");
    }
    public static void fours_assigment (){
        Scanner in_fours = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = in_fours.nextInt();
        System.out.print("Enter b : ");
        int b = in_fours.nextInt();
        while (b != 0){
            b = a % (a = b);
        }
        System.out.print("nod = " + (a < 0 ? -a : a) + "\n");
    }
    public static void fifs_assigment (){
        Scanner in_fifs = new Scanner(System.in);
        System.out.print("Enter int number : ");
        int number = in_fifs.nextInt();
        System.out.print("Enter pos : ");
        int pos = in_fifs.nextInt();
        int a = 1 << pos;
        System.out.print("Your number: " + Integer.toBinaryString(number) + "\n");
        System.out.print("Result: " + Integer.toBinaryString(number ^ a) + "\n");
    }
}
