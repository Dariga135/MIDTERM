public class ScheduledOperationDecorator extends DeviceDecorator {
    public ScheduledOperationDecorator(Device device) {
        super(device);
    }

    public String operate() {
        return "Scheduled: " + device.operate();
    }
}