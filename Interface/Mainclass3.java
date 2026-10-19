interface Nike{
    public void shoes();
}

interface Puma extends Nike{
     public void logs();
}

class Rajaoutlet implements Puma{
     public void shoes(){
        System.out.println("jingala shoes");
    }
     public void logs(){
        System.out.println("jingalalala logs");
    }
}
class Mainclass3{
    public static void main(String[] args) {
        Rajaoutlet r1 = new Rajaoutlet();
        r1.shoes();
        r1.logs();
    }
}