class Demo2{
    double z = 5.5;
    int r = 56;
    
}
class Dumtaka3 extends Demo2{
    int x = 56;

    public static void main(String[] args) {
        Demo2 d1 = new Dumtaka3();
        System.out.println(d1.z);
        System.out.println(d1.r);

        Dumtaka3 s1 = (Dumtaka3)d1;
        System.out.println(s1.x);

    }
}