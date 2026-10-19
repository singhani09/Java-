class Cool2{
    void disp(){
        System.out.println("heyy");
    }
}
class Dinga extends Cool2{
    void tata(){
        System.out.println("byeee");
    }
    public static void main(String[] args) {
        Cool2 c1 = new Dinga();
        c1.disp();

        Dinga d1 = (Dinga)c1;
        d1.tata();
    }
}