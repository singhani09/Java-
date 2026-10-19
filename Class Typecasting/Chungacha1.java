class Cola23{
    int f = 32;
    void disp(){
        System.out.println("blank");
    }
}
class Chungacha1 extends Cola23{
    int d = 43;


    public static void main(String[] args) {
        Cola23 c1 = new Chungacha1();
        System.out.println(c1.f);
        c1.disp();

        Chungacha1 c2 = (Chungacha1)c1;
        System.out.println(c2.d);
    }
}
