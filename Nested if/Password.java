class Password{
    public static void main(String[] args) {
        boolean isPassword = false;
        String password= "1234";
        String pasEntered="1234";
        if(isPassword){
            if(password.equals(pasEntered)){
                System.out.println("Correct password,Umlocked");
        }
        else {
            System.out.println("wrong password");
        }
    }
    else{
        System.out.println("Phone already unlocked");
    }
}
}