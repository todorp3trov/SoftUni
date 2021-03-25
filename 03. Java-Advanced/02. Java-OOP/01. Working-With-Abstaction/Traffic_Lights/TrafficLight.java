package Traffic_Lights;

public class TrafficLight {
    private Light light;

    public TrafficLight(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return this.light;
    }

    public void update() {
        switch (this.light) {
            case RED:
                this.light = Light.GREEN;
                break;
            case GREEN:
                this.light = Light.YELLOW;
                break;
            case YELLOW:
                this.light = Light.RED;
                break;
        }
    }
}
