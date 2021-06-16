package day18;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

public class c1_MethodOverloadiing {

    public static void main(String[] args) {

        int num1 = 25;
        double num2 = 10.55;
        byte num3 = 2;
        method(2);

    }

    public static void method(int a) {
        System.out.println(a + "is integer");

    }

    public static void method1(double a) {
        System.out.println(a + " is double");

    }

    public static void method(byte a) {
        System.out.println(a + "is byte");

        public static void method(String str){

        }
    }
}
