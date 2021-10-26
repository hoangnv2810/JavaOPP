package CauLacBoBongDa1;

public class Match extends Club{
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
        return getPriceTicket()*numberFans;
    }

    @Override
    public String toString() {
        return id + " " + getName() + " " + revenue();
    }
}
