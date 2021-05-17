package cmdorder;

/*使用组合+命令模式实现多功能开关,
  让用户进行设置,可以同时控制教室的所有灯的开和关，并能控制风扇、空凋、多媒体投影仪设备的开和关。
 */

public class Pro {
    public static void main(String[] args){
        DevicePackage allLights; // 所有灯设备的集合
        Device light, light2, blower, airCleaner, Multimedia;
        // 初始化设备
        allLights = new DevicePackage();
        light = new Light();
        light2 = new Light();
        blower = new Blower();
        airCleaner = new airCleaner();
        Multimedia = new Multimedia();
        allLights.addDevice(light);
        allLights.addDevice(light2);

        // 初始化命令
        Command lightsOpenCommand, lightsCloseCommand, blowerOpenCommand, blowerCloseCommand, airOpenCommand,
                airCloseCommand, multiOpenCommand, multiCloseCommand;
        lightsOpenCommand = new DeviceOpenCommand(allLights);
        lightsCloseCommand = new DeviceCloseCommand(allLights);
        blowerOpenCommand = new DeviceOpenCommand(blower);
        blowerCloseCommand = new DeviceCloseCommand(blower);
        airOpenCommand = new DeviceOpenCommand(airCleaner);
        airCloseCommand = new DeviceCloseCommand(airCleaner);
        multiOpenCommand = new DeviceOpenCommand(Multimedia);
        multiCloseCommand = new DeviceCloseCommand(Multimedia);

        // 命令集成为多功能遥控
        Controller controller = new Controller(lightsOpenCommand, lightsCloseCommand, blowerOpenCommand,
                blowerCloseCommand, airOpenCommand, airCloseCommand, multiOpenCommand, multiCloseCommand);

        controller.openAllLights();
        controller.openBlower();
        controller.openMulti();
        controller.openAirCleaner();
        controller.closeAllLights();
        controller.closeBlower();
        controller.closeMulti();
        controller.closeAirCleaner();
    }
}
