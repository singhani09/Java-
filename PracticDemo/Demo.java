
// Pass by reference program --- Here we are making a superclass object as reference in Animal method and calling that by passing the reference
class Demo{
    String noise;
    void library(){
        System.out.println("hehehhehhe");
    }
    void cafe(){
        System.out.println("cofeee peelo");
    }
    void Animal(Demo d1){
        System.out.println(d1.noise);
        d1.cafe();
        d1.library();
        d1.hashCode();
    }
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.Animal(d1);
    }
}