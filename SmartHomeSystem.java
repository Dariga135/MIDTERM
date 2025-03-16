import java.util.Scanner;
public class SmartHomeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeFactory factory = new BasicSmartHomeFactory();
        SmartHomeController controller = new SmartHomeController();

        System.out.println("Welcome to the Smart Home System!");

        while (true) {
            System.out.println("1. Add Room\n2. Add Light\n3. Add Thermostat\n4. Add Camera\n5. Show Status\n6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter room name: ");
                    String roomName = scanner.nextLine();
                    controller.addRoom(new Room(roomName));
                    System.out.println("Room added.");
                    break;
                case 2:
                    if (controller.rooms.isEmpty()) {
                        System.out.println("No rooms available. Add a room first.");
                        break;
                    }
                    controller.rooms.get(0).addDevice(factory.createLight());
                    System.out.println("Light added to " + controller.rooms.get(0).name);
                    break;
                case 3:
                    if (controller.rooms.isEmpty()) {
                        System.out.println("No rooms available. Add a room first.");
                        break;
                    }
                    controller.rooms.get(0).addDevice(factory.createThermostat());
                    System.out.println("Thermostat added to " + controller.rooms.get(0).name);
                    break;
                case 4:
                    if (controller.rooms.isEmpty()) {
                        System.out.println("No rooms available. Add a room first.");
                        break;
                    }
                    controller.rooms.get(0).addDevice(factory.createCamera());
                    System.out.println("Camera added to " + controller.rooms.get(0).name);
                    break;
                case 5:
                    System.out.println(controller.turnAllLightsOn());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
                    break;
            }
        }
    }
}
