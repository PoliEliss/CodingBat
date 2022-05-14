package warmup1.nearhundred;

/*

Given an int n, return true if it is within 10 of 100 or 200.
 Note: Math.abs(num) computes the absolute value of a number.


 */
public class NearHundred {
    public static void main(String[] args) {
        NearHundred nearHundred = new NearHundred();
        nearHundred.nearHundred(90);
    }
    boolean nearHundred(int num) {
        if (Math.abs(100 - num) <= 10) {
            System.out.println("true");
            return true;
        } else if (Math.abs(200 - num) <= 10) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
