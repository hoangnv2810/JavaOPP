package CauLacBoBongDa2;

public class Match extends Club implements Comparable<Match>{
    private String id;
    private int numberFans;

    public Match(String id, int numberFans) {
        this.id = id;
        this.numberFans = numberFans;
    }

    public Match(String id, String name, int priceTicket, String id1, int numberFans) {
        super(id, name, priceTicket);
        this.id = id1;
        this.numberFans = numberFans;
    }

    @Override
    public String getId() {
        return id;
    }

    public int getNumberFans() {
        return numberFans;
    }

    public String idClub(){
        return id.substring(1, 3);
    }

    public long revenue(){
        return numberFans*getPriceTicket();
    }

    @Override
    public String toString() {
        return id + " " + getName() + " " + revenue();
    }

    @Override
    public int compareTo(Match o) {
        if(revenue() < o.revenue()){
            return 1;
        } else if(revenue() == o.revenue()){
            if(getName().compareTo(o.getName()) > 0){
                return 1;
            } else {
                return -1;
            }
        }
        return -1;
    }
}
