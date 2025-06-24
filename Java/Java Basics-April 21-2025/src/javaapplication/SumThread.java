package javaapplication;

public class SumThread extends Thread {

    private int pos; // Thread's index — determines its assigned slice of work

    public SumThread(int pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        super.run(); // Calls Thread's run(), which does nothing — harmless, but unnecessary

        // Thread processes every THREAD_COUNT-th element, starting from its own index
        for (int i = pos; i < GlobalData.ARRAY_LEIGHT; i += GlobalData.THREAD_COUNT) {
            GlobalData.result[pos] += GlobalData.array[i];
        }
    }
}
