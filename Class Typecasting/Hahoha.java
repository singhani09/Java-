class Sample21{
    int r = 20;
    void co(){
        System.out.println("waoo");
    }
}
class Hahoha extends Sample21{
    void disp(){
        System.out.println("heheheh");
    }
    public static void main(String[] args) {
        Sample21 s1 = new Hahoha();
        s1.co();
        System.out.println(s1.r);

        Hahoha r1 = (Hahoha)s1;
        r1.disp();

    }
}