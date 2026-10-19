class Tester3{
    int r = 34;
    void disp(){
        System.out.println("javaa");
    }
}
class Tista1 extends Tester3{
    void uliya(){
        System.out.println("typecasting");
    }
    public static void main(String[] args){
        Tester3 t1 = new Tista1();
        System.out.println(t1.r);
        t1.disp();

        Tista1 t2 = (Tista1)t1;
        t2.uliya();

    }
}