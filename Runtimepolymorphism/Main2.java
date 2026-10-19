class Amazon{
 void buy(){
   System.out.println("Amazon");
 }
}

class Shoes extends Amazon{
 void buy(){
   System.out.println("Shoes");
 }
}

class Dress extends Amazon{
 void buy(){
   System.out.println("Dress");
 }
}

class Mobiles extends Amazon{
 void buy(){
   System.out.println("Mobiles");
 }
}

class Stimulator{
  static void buy(Amazon a){
    a.buy();
  }
}

class Main2{
 public static void main(String[] args){
   Shoes s=new Shoes();
   Dress d=new Dress();
   Mobiles m=new Mobiles();
   
   Stimulator.buy(s);
   Stimulator.buy(d);
   Stimulator.buy(m);
 }
}