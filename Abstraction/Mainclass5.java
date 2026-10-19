interface Snapchat{
    void feature();
}
class Camera implements Snapchat{
    public void feature(){
        System.out.println("to make snap and send everyone");
    }
}
class Spotlight implements Snapchat{
    public void feature(){
        System.out.println("to see reels and enjoy");
    }
}
class Story implements Snapchat{
    public void feature(){
        System.out.println("daily activities can be uploaded");
    }
}
class Stimulator{
    static void ansim(Snapchat s1){
        s1.feature();

    }
}
class Mainclass5{
    public static void main(String[] args) {
        Camera c1 = new Camera();
        Spotlight s1 = new Spotlight();
        Story st = new Story();
        Stimulator.ansim(s1);
        Stimulator.ansim(c1);
        Stimulator.ansim(st);
    }
}