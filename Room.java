import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room implements Device {
    String name;
    private List<Device> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public String operate() {
        StringBuilder result = new StringBuilder("Room '" + name + "':\n");
        for (Device device : devices) {
            result.append(device.operate()).append("\n");
        }
        return result.toString();
    }
}