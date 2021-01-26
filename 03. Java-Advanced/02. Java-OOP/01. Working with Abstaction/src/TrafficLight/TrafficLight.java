package TrafficLight;

public class TrafficLight {
    private int n;
    private String[] signals;
    private Signal signal;

    public TrafficLight(int n, String[] signals) {
        this.n = n;
        this.signals = signals;
    }

    public void updateSignal() {
        for (int i = 0; i < signals.length; i++) {
            signal = Signal.valueOf(signals[i]);

            if (signal.getOrdinal() == 2) {
                System.out.print(Signal.values()[0] + " ");
                signals[i] = Signal.values()[0].toString();
            } else {
                System.out.print(Signal.values()[signal.getOrdinal() + 1] + " ");
                signals[i] = Signal.values()[signal.getOrdinal() + 1].toString();
            }
        }
    }

    public void timesUpdatedSignal() {
        for (int i = 0; i < n; i++) {
            updateSignal();
            System.out.println();
        }
    }

}
