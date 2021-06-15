package day02;

public class c3_varibles {

    public static void main(String[] args){

//  range for numbers double > float > long > int> short > byte

    // smallest whole number is byte

    //range for byte stores whole numbers from -128 to 127
    byte b1= 25;
    System.out.println(b1);

//     byte b2=128;  this will give you an error because range of int in until 127
//     system.out.println(b2);
//     byte b3=5.5; this will gib=ve you an error because byte can't ve stored in decimal numbers

        byte b4=100;
        System.out.println(b4);


        // -----short example
        //short             2 bytes          stores whole numbers from -32,768 to 32,767

        short s1=128;
        short s2=1888;
//        short s3=40000; this is out of range


        short s4=25; // you can assign byte numbers to short because short is bigger than byte
        System.out.println("************* short");
        System.out.println("s1");
        System.out.println("s2");
        System.out.println("s4");

        //range of int  int         4 bytes    stores whole number from =2,147,483,648 to 2,147,483,647
        System.out.print("************int");
        int number=8798798;
        //int number2=380808080; bigger than range

        System.out.println(number);

        System.out.print(55);
        // if you don't assign
        // As a default java picks int for whole number

        System.out.println("**************long");
        //long       8 bytes stores whole number from -9,223,373,036,854,775,888 to 9,223,372,036,8544,775,887
        long l1=200;

        long l2=999999999999L;// when you move out of the int range compiler needs to know what is the number
        //that is why you need to tell its long by adding L at the end

        System.out.println("l1");
        System.out.println("l2");
        System.out.println(5555555555l); //y you need to tell compiler this is not int it is long



        //float      4 bytes      stores fractional numbers, sufficient for storing 6 to 7 decimal digits
        //double        8 bytes      stores fractional numbers, sufficient for storing is decimal digits


        //stores decimal numbers
        double d1=5.5;
        System.out.println("d1");
//       As a default java picks double for decimal number
        System.out.println("3.5");

//        float f0=3.5;  java will pick decimal numbers as a double you need to tell compiler this is float not double
        float f1=3.5f;
        System.out.println(f1);
        double d2=5.555555555555555555555;
        System.out.println(d2);
        System.out.println(d1+f1);
        System.out.println(b1+b4);




    }
}
