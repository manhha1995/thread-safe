public class Wait {
    public Wait() {
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
