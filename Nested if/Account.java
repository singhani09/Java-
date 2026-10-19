class Account{
    public static void main(String[] args) {
        boolean hasAccount = true;
String pin = "4321";
String enteredPin = "4321";
if (hasAccount) {
    if (enteredPin.equals(pin)) {
        System.out.println("PIN Verified, Withdrawal Allowed");
    } else {
        System.out.println("Wrong PIN");
    }
} else {
    System.out.println("No Account Found");
}
    }}
