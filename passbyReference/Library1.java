class Library1{
    void item(){
        System.err.println("books");
    }
    void essential(){
        System.err.println("reading material");
    }
    void printer(){
        System.err.println("to print");
    }
    void librarian(){
        System.err.println("track the books");
    }
    void cafe(){
        System.err.println("to provide tea");
    }
    static void ansim(Library l1){
        l1.printer();
        l1.cafe();
        System.out.println(l1.hashCode());
        System.out.println(l1.toString());
        l1.librarian();
    }
    public static void main(String[] args) {
        Library l2 = new Library();
        ansim(l2);
    }

    }
