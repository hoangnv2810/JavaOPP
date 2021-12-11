package LopPair;

public class Pair<T, S> {
    private T first;
    private S second;

    public Pair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    private boolean checkPrime(Integer n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    public boolean isPrime() {
        return checkPrime((Integer) first) && checkPrime((Integer) second);
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
