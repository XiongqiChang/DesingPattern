package com.ccnu.flyweight;

public class Tets {

    private static  final  String  department[] = {"RD","PM","QA"};



    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            String departement = department[(int) (Math.random()*department.length)];
            Manger manger = (Manger) EmployeeFactory.getManager(departement);
            manger.report();
        }
    }

    public  static  int test(){
        int a = 20;
        try{
            return a+25;
        }catch (Exception e){
            System.out.println("excception");
        }finally {
            System.out.println(a + " ");
            a = a + 10;
        }
        return a;
    }
}
