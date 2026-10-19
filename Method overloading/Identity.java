class Identity{
    static void inf(String name, String city){
        System.out.println("Name -- " + name + ", \nCityname is " + city);
    }

static void inf(long idNo){
    System.out.println("The id no. is :-- " + idNo);
}

static void inf(int cost, String completion){
    System.out.println("the cost is : " + cost + ",\nComment : " + completion);
}
public static void main(String[] args) {
    inf("Animesh kumar singh", "Bengaluru");
    inf(718096454635L);
    inf(250," Your id completion is successful ");

}
}