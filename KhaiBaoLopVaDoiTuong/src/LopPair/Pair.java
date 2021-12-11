package LopPair;

public class Pair {
    private int first;
    private int second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    private boolean checkPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        return checkPrime(first) && checkPrime(second);
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
