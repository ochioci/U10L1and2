public class Countdown {

    public boolean pInit (String word) {

        return true;
    }

    public boolean pRec (String word, int n) {
        //for initialization, supply n as -1
        if (n == -1) {
            if (n % 2 == 0) {
                n = (word.length()/2)-1;
            } else {
                n = (word.length()-1)/2;
            }
        }
        int n2;
        if (word.length() % 2 == 0) {
            n2 = word.length() - n - 1;
        } else {
            n2 = word.length() - n - 2;
        }


        if (word.substring(n, n+1).equals(word.substring(n2,n2+1))) {
            if (n == 0) {
                return true;
            } else {
                return pRec(word, n-1);
            }
        } else {
            return false;
        }
    }


}
