package cmdorder;

public class DeviceCloseCommand extends Command{
    public DeviceCloseCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.close();
    }
}
