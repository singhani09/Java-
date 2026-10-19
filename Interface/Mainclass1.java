interface Sample1{
    void disp();
    void test();
}
class Demo1 implements Sample1{
    public void disp(){
        System.out.println("apple juice");
    }
        public void test(){
            System.out.println("Mango juice");
        }
    }
class Mainclass1{
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.disp();
        d1.test();
    }
}