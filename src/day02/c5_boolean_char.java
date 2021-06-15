package day02;

public class c5_boolean_char {

    public static void main(String [] args){
        //        boolean            1 bit        stores true or false values
        //        char               2 bytes      stores a single character/letter or ASCII values  'a'


        boolean b1=true;
        boolean b2=false;

        System.out.println(b1);
        System.out.println(b2);

        boolean b3=125 < 200 ;
    //    boolean b4= 125; no condition here (neither true or false)

          System.out.print(b3); //true

        System.out.println(10 !=20); // false
        // ==means equal

        // != not equal

        System.out.println(10  !=20);

        System.out.println("*********************************");
        System.out.println(true == false );
        System.out.println(b1 == b2);

        // ! opposite
        System.out.println( !true == false ); // false == false which is true
        System.out.println( !true == ! false ); // false == true which is false

        System.out.println( ! (true == false) ); // ( ! (false) ) --- true

        System.out.println(  (true== true) == (false==false ) ); // (true) == (true)  -- true

        System.out.println( (true!=false) ==  !(false==false));
        // (true!=false) ==

    }
}
