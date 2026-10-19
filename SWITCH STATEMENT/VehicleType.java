public class VehicleType {
    public static void main(String[] args) {
        int wheels = 4;

        switch (wheels) {
            case 1:
                System.out.println("Unicycle");
                break;
            case 2:
                System.out.println("Bike/Motorcycle");
                break;
            case 3:
                System.out.println("Auto-rickshaw/Tricycle");
                break;
            case 4:
                System.out.println("Car");
                break;
            case 6:
                System.out.println("Truck (basic)");
                break;
            case 8:
                System.out.println("Heavy Truck");
                break;
            default:
                System.out.println("Unknown vehicle type");
        }
    }
}