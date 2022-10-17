public class Card {

    String  cardNum;
    String cardType;
    String expiry;
    Account account;

    public Card(String cardNum, String cardType, String expiry, Account account) {
        this.cardNum = cardNum;
        this.cardType = cardType;
        this.expiry = expiry;
        this.account = account;
    }

    public String getCardNum() {
        return cardNum;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
