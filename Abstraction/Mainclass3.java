interface LG{
    void usage();
}
class Fridge implements LG{
    public void usage(){
        System.out.println("to keep the things cool and  protect from bacteria");
    }
}
class Television implements LG{
    public void usage(){
        System.out.println("for the entertainment");

    }
}
class Geyser implements LG{
    public void usage(){
        System.out.println("to warm the water in the winter");
    }
}
class Stimulator{
    static void ansim(LG l1){
        l1.usage();
    }
}
class Mainclass3{
    public static void main(String[] args) {
        Fridge f1 = new Fridge();
        Television t1 = new Television();
        Geyser g1 = new Geyser();
        Stimulator.ansim(f1);
        Stimulator.ansim(g1);
        Stimulator.ansim(t1);
    }
}