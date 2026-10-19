interface  Amazon{
    void product();
}
class Shoes implements Amazon{
    public void product(){
        System.out.println("Running shoes ");
    }
}
class Watch implements  Amazon{
    public void product(){
        System.out.println(" to see the timing of mine destiny");
    }
}
class Smartphone implements Amazon{
    public void product(){
        System.out.println("to see Reels and use it for study");
    }
}
class Stimulator{
    static void ansim(Amazon a1){
        a1.product();
    }
}
class Mainclass4{
    public static void main(String[] args) {
        Shoes s1 = new Shoes();
        Watch w1 = new Watch();
        Smartphone sm = new Smartphone();
        Stimulator.ansim(w1);
        Stimulator.ansim(s1);
        Stimulator.ansim(sm);

    }
}