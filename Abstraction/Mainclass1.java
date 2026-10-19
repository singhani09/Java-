

interface Animal{
    void noise();
}
class Cat implements Animal{
    public void noise(){
        System.out.println("meoww meoww");
    }
}
class Dog implements Animal{
   public void noise(){
        System.out.println("bow bow");
    }
}
class Snake implements Animal{
    public void noise(){
        System.out.println("his hisss");
    }
}
class Stimulator{
     static void ansim(Animal a1){
        a1.noise();

    }
}
class Mainclass1{
    public static void main(String[] args){
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Snake s1 = new Snake();
        Stimulator.ansim(c1);
        Stimulator.ansim(d1);
        Stimulator.ansim(s1);
    }

}