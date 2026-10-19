class Car{
    double carCo;
    String caMo;
    String caTy;
    Car(double carCo,String caMo,String caTy){
        this.carCo = carCo;
        this.caMo = caMo;
        this.caTy = caTy;
    }
    public static void main(String[] args){
        Car c1 = new Car(200000, "hyundai i20","petrol");
        System.out.println(c1.carCo);
        System.out.println(c1.caMo);
        System.out.println(c1.caTy);

        
    }

}