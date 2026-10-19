class LG{
 void select(){
   System.out.println("LG");
 }
}

class Mobiles extends LG{
 void select(){
   System.out.println("MObiles");
 }
}

class Refigirators extends LG{
 void select(){
   System.out.println("Refigirators");
 }
}

class Television extends LG{
 void select(){
   System.out.println("television");
 }
}

class Stimulator{
  static void buy(LG l){
    l.select();
  }
}

class Main1{
 public static void main(String[] args){
   Mobiles m=new Mobiles();
   Refigirators r=new Refigirators();
   Television t=new Television();
   
   Stimulator.buy(m);
   Stimulator.buy(r);
   Stimulator.buy(t);
 }
}