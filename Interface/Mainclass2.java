interface Sample2{
    void disp();
    void test();

}
abstract class Demo1 implements Sample2{
   public void disp(){
        System.out.println("apple juice");
    }
    
}
class Tester2 extends Demo1{
   public void test(){
        System.out.println("Mango juice");
    }
}
class Mainclass2{
    public static void main(String[] args) {
        Tester2 t1 = new Tester2();
        t1.disp();
        t1.test();
    }
}