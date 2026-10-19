interface Apple{
    void Functionality();
}
class Mac implements Apple{
    public void Functionality(){
        System.out.println("use to code and videoediting");
    }
}
class iphone implements Apple{
   public void Functionality(){
        System.out.println("call and chill gaming");
    }
}
class ipad implements Apple{
    public void Functionality(){
        System.out.println("to study or to teach");
    }
}
class Stimulator{
     static void ansim(Apple a1){
        a1.Functionality();

    }
}
class Mainclass2{
    public static void main(String[] args){
        Mac c1 = new Mac();
        iphone d1 = new iphone();
        ipad s1 = new ipad();
        Stimulator.ansim(c1);
        Stimulator.ansim(d1);
        Stimulator.ansim(s1);
    }

}