package com.company;

public class parent {

     void  sum(){
        System.out.println("sum");
    }

     void  minus(){
        System.out.println("minuse");
    }

}

class child extends parent{

    void mul(){
        System.out.println("mul");
    }


    @Override
    void sum() {

        System.out.println("iwelcome ot");
    }



    @Override
    public String toString() {
        System.out.println("my child");
        return  "mc";
    }

    public static void main(String[] args) {

        child c = new child();
        c.toString();
        System.out.println(c);








//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//
//
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Long.MIN_VALUE);
//
//        long  l = 23234234L;
////typecasting
//        short s22 = (short) l;
//        System.out.println(s22+" " +"hdrer");
//        int i = (int) l;
//
////        short s
//
//        System.out.println(l);







//
////        int ab = new Integer(23);
//        float  a= 12;
//
//
//        String  s1 =new String("adrhs");
//        String s = "dkh";
//
//
//        char c1 = 'a';
//
//
//
//        child c = new child();
//        c.sum();
//        c.mul();
//        c.minus();
//        parent p = new child();
////downcast;
////        upcast;
//        child c34 = (child) p;
////        c34.
//
//
//
//
//        child c100 = new child();
//        parent c101  = new child();
//        Object obj =new child();
////        ob.toString();
//
//
//        child c102 = (child) obj;
//

    }

}
