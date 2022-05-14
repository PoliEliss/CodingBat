package warmup1.sleepin;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println(true);
            return true;
        }
        System.out.println(false);
        return false;
    }
}


