package com.atguigu.test;
@FunctionalInterface
interface test{
    public int add(int x ,int y);
    default  int dev (int x , int y){
        System.out.println(66666);
        return x/y;
    }
    public static int mv (int x , int y){
        return x * y ;
    }

}

public class LambdaExpress {
    public static void main(String[] args) {
 /*test test = new test() {
     @Override
     public void add() {
         System.out.println("*****************");

     }

 };
test.add();*/

        test test =(int x , int y) -> {
            System.out.println("hello world");
            return x + y;
        };

        System.out.println(test.add(5, 6));
        System.out.println(test.add(18, 6));
        System.out.println(test.add(12, 6));
    }


}