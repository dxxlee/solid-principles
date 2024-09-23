public class Button {
    private Switchable device;


    public Button(Switchable device){
        this.device = device;
    }

    boolean isOn = false;

    public void press(){
        if (isOn){
            device.turnOff();
            isOn = false;
        }
        else {
            device.turnOn();
            isOn = true;
        }
    }




}

