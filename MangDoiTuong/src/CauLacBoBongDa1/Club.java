package CauLacBoBongDa1;

public class Club {
    private String id;
    private String name;
    private int priceTicket;

    public Club() {
    }

    public Club(String id, String name, int priceTicket) {
        this.id = id;
        this.name = name;
        this.priceTicket = priceTicket;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

}
