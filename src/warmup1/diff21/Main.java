package warmup1.diff21;

/*

Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
public class Main {

    public static void main(String[] args) {
        Diff21 diff21 = new Diff21();
        diff21.diff21(19);
        diff21.diff21(10);
        diff21.diff21(21);
        diff21.diff21(22);
        diff21.diff21(25);
        diff21.diff21(30);
        diff21.diff21(-1);
        diff21.diff21(-9);
    }
}
