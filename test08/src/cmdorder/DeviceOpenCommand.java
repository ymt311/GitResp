package cmdorder;

public class DeviceOpenCommand extends Command{
    public DeviceOpenCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.open();
    }

}
