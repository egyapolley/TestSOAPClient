package model;

public class Balance {

    private String balance_name;
    private String value;
    private String expiry;

    public Balance() {
    }

    public Balance(String balance_name, String value, String expiry) {
        this.balance_name = balance_name;
        this.value = value;
        this.expiry = expiry;
    }

    public String getBalance_name() {
        return balance_name;
    }

    public void setBalance_name(String balance_name) {
        this.balance_name = balance_name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "balance_name='" + balance_name + '\'' +
                ", value='" + value + '\'' +
                ", expiry='" + expiry + '\'' +
                '}';
    }
}
