class Car{
    double carCo;
    String caMo;
    String caTy;
    Car(double carCo,String caMo,String caTy){
        this.carCo = carCo;
        this.caMo = caMo;
        this.caTy = caTy;
    }
    public boolean equals(Object obj){
        Car c2 = (Car) obj;
        return this.carCo==c2.carCo;

    }
    public static void main(String[] args){
        Car c1 = new Car(200000, "hyundai i20","petrol");
      Car c2 = new Car(20000, "hyundai i20","petrol");
      if(c1.equals(c2)){
        System.out.println("same");
      }else{
        System.out.println("not same");
      }
        
    }

}