

/*
The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true*/

package warmup1.sleepin;

public class Main {
    public static void main(String[] args) {
      SleepIn sleepIn = new SleepIn();
      sleepIn.sleepIn(false,false);
      sleepIn.sleepIn(true,false);
      sleepIn.sleepIn(false,true);
      sleepIn.sleepIn(true,true);
    }
}

