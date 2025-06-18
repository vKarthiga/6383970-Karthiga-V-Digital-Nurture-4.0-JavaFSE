package command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        System.out.println("Turning the light ON:");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("\nTurning the light OFF:");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}
