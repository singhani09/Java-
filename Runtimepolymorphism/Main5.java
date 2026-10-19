class Films{
 void watch(){
   System.out.println("Films");
 }
}

class Comedy extends Films{
 void watch(){
   System.out.println("Comedy");
 }
}

class Romantic extends Films{
 void watch(){
   System.out.println("Romantic");
 }
}

class Action extends Films{
 void watch(){
   System.out.println("Action");
 }
}

class Stimulator{
  static void buy(Films f){
    f.watch();
  }
}

class Main5{
 public static void main(String[] args){
   Comedy c=new Comedy();
   Romantic r=new Romantic();
   Action a=new Action();
   
   Stimulator.buy(c);
   Stimulator.buy(r);
   Stimulator.buy(a);
 }
}