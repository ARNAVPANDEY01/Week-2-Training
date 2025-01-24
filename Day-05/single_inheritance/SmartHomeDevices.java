package single_inheritance;
class Device{
    protected int deviceId;
    protected String status;

    Device(int deviceId, String status){
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayInfo(){
        System.out.println("Device  Id:" + deviceId);
        System.out.println("Status Of Device:" + status);
    }
}

class ThermoStat extends Device{
    protected double temperatureSetting;
    public ThermoStat(int deviceId, String status, double temperatureSetting){
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature Setting:" + temperatureSetting);
    }
}
public class SmartHomeDevices {
    public static void main(String[]args){
        ThermoStat thermo = new ThermoStat(11, "Correct", 67.7);
        thermo.displayInfo();
    }
}
