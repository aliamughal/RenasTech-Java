package studyHall;
import java.util.Scanner;
public class AlphabeticOrder {
    //Write a program that will print out letters in alphabetic order accordingly to the given range of 2 chars.
    //              ex:
    //                  input: A
    //                  input: Z
    //                  output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
    //                  input: c
    //                  input: g
    //                 output: cdefg
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        for(char i = start; i <= end; i++){
            System.out.print(i);
        }
    }
}






