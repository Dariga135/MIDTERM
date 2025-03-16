import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartHomeController {
    List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public String turnAllLightsOn() {
        StringBuilder result = new StringBuilder();
        for (Room room : rooms) {
            result.append(room.operate()).append("\n");
        }
        return result.toString();
    }
}