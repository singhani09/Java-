class Cool4{
    void add(){
        System.out.println("just won");
    }
}
class Goolata2 extends Cool4{
    void dispu(){
        System.out.println("exit");
    }
    public static void main(String[] args){
        Cool4 c1 = new Goolata2();
        c1.add();

        Goolata2 g1 = (Goolata2)c1;
        g1.dispu();
    }
}