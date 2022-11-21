import java.util.ArrayList;

public class Wallet {
    private String name;
    private ArrayList<IScan> walletItems;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
        this.walletItems = new ArrayList<IScan>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
//        this.tickets = new ArrayList<Ticket>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
        return this.walletItems.size();
    }

    public void addItem(IScan item) {
        this.walletItems.add(item);
    }

    public String scan(int index) {
        IScan item = walletItems.get(index);
        return item.scan();
    }

}
