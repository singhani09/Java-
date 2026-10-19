class Customer{
      void data(String name, int age){
        System.out.println("Customer name is  -- " + name + ",\n Age --" + age);
    }
    void data(long mobileno){
        System.out.println("Mobile no. --" + mobileno );
    }
    void data(int birthYear){
        System.out.println("He was born on --" + birthYear);
    }
    void data(char CustomerType){
        System.out.println("trustworthyfactor");
    }
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.data("Animesh kumar singh",23);
        c1.data(7370085729L);
        c1.data('A');
        c1.data(2003);

    }



}