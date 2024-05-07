package toggolingSwitch;

public class HallwayLight {
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;

    public HallwayLight() {
        firstSwitchState = 0;
        secondSwitchState = 0;
        lampState = 0;
    }

    public int getFirstSwitchState() {
        return firstSwitchState;
    }

    public int getSecondSwitchState() {
        return secondSwitchState;
    }

    public int getLampState() {
        return lampState;
    }

    public void toggleFirstSwitch() {
        firstSwitchState = 1 -firstSwitchState;
        toggleLamp();
    }

    public void toggleSecondSwitch() {
        secondSwitchState = 1 -secondSwitchState;
        toggleLamp();
    }

    private void toggleLamp() {
        if (firstSwitchState == 1 || secondSwitchState == 1) {
            lampState = firstSwitchState ^ secondSwitchState;
        }
    }

    public static void main(String[] args) {
        HallwayLight hallwayLight = new HallwayLight();
        System.out.println("Initial states:");
        System.out.println("First switch: " + hallwayLight.getFirstSwitchState());
        System.out.println("Second switch: " + hallwayLight.getSecondSwitchState());
        System.out.println("Lamp: " + hallwayLight.getLampState());


        hallwayLight.toggleFirstSwitch();
        System.out.println("\nAfter toggling first switch:");
        System.out.println("First switch: " + hallwayLight.getFirstSwitchState());
        System.out.println("Second switch: " + hallwayLight.getSecondSwitchState());
        System.out.println("Lamp: " + hallwayLight.getLampState());


        hallwayLight.toggleSecondSwitch();
        System.out.println("\nAfter toggling second switch:");
        System.out.println("First switch: " + hallwayLight.getFirstSwitchState());
        System.out.println("Second switch: " + hallwayLight.getSecondSwitchState());
        System.out.println("Lamp: " + hallwayLight.getLampState());
    }
}
