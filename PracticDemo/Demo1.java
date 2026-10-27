interface Maruti {
    void car();
    

}
interface Hyundai{
    void clutch();
}
class Demo1 implements Maruti,Hyundai{
     public void car(){
        System.out.println("powerful");
    }
     public void clutch(){
        System.out.println("horse power");
    }
    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.car();
        d1.clutch();
        
    }

}