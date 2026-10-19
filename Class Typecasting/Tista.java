class Tester{
    int r = 10;
}
class Tista extends Tester{
    void uliya(){
        System.out.println("upcasting eee");
    }
    public static void main(String[] args){
        Tester t1 = new Tista();
        System.out.println(t1.r);
        Tista t2 = (Tista)t1;
        t2.uliya();

    }
}