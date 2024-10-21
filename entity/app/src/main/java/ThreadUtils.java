public class ThreadUtils {

    private static final Integer NUM_THREAD_PRIORITY = 6;

    enum ThreadPriority {
        MIN(1),
        NORM(5),
        MAX(10);

        private final Integer priority;

        ThreadPriority(Integer priority) {
            this.priority = priority;
        }

        public Integer getPriority() {
            return priority;
        }
    }   

    public void setThreadPriority(Thread thread, ThreadPriority priority) {
        thread.setPriority(priority.getPriority());
    }

}