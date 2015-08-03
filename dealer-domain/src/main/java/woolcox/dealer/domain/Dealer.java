package woolcox.dealer.domain;

import java.util.List;

/**
 * Created by woolcoxs on 15-08-01.
 */
public class Dealer {
    private String firstname;
    private String lastname;
    private DealerCode dealerCode;
    private List<Vehicle> inventory;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public DealerCode getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(DealerCode dealerCode) {
        this.dealerCode = dealerCode;
    }

    public List<Vehicle> getInventory() {
        return inventory;
    }

    public void setInventory(List<Vehicle> inventory) {
        this.inventory = inventory;
    }
}
