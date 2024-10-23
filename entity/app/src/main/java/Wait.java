public class Wait {

    private boolean condition = false;
    public Wait() {

        if (!condition) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        exit();
    }

    public void exit() {
        System.exit(0);
        notifyAll();
    }

    public boolean isExit() {
        notifyAll();
        return true;
    }
}
