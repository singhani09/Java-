class Train{
 void travel(){
   System.out.println("Train");
 }
}

class Firstclass extends Train{
 void travel(){
   System.out.println("Firstclass");
 }
}

class Sleeper extends Train{
 void travel(){
   System.out.println("Sleeper");
 }
}

class Secondclass extends Train{
 void travel(){
   System.out.println("Secondclass");
 }
}

class Stimulator{
  static void buy(Train t){
    t.travel();
  }
}

class Main4{
 public static void main(String[] args){
   Firstclass f=new Firstclass();
   Sleeper s=new Sleeper();
   Secondclass sc=new Secondclass();
   
   Stimulator.buy(f);
   Stimulator.buy(s);
   Stimulator.buy(sc);
 }
}