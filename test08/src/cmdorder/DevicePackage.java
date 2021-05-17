package cmdorder;

import java.util.ArrayList;

public class DevicePackage extends Device{
    private ArrayList<Device> list = new ArrayList<Device>();

    public void addDevice(Device device) {
        list.add(device);
    }

    public void removeDevice(Device device) {
        list.remove(device);
    }

    @Override
    public void close() {
        int index = 1;
        for (Device device : list) {
            System.out.print(index + "号");
            device.close();
            index++;
        }
    }

    @Override
    public void open() {
        int index = 1;
        for (Device device : list) {
            System.out.print(index + "号");
            device.open();
            index++;
        }
    }
}
