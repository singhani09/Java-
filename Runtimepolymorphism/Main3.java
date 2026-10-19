class Mobiles{
 void features(){
   System.out.println("Mobiles");
 }
}

class Vivo extends Mobiles{
 void features(){
   System.out.println("Vivo");
 }
}

class Oppo extends Mobiles{
 void features(){
   System.out.println("Oppo");
 }
}

class Redmi extends Mobiles{
 void features(){
   System.out.println("Redmi");
 }
}

class Stimulator{
  static void buy(Mobiles m){
    m.features();
  }
}

class Main3{
 public static void main(String[] args){
   Vivo v=new Vivo();
   Oppo o=new Oppo();
   Redmi r=new Redmi();
   
   Stimulator.buy(v);
   Stimulator.buy(o);
   Stimulator.buy(r);
 }
}