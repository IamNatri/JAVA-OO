package JAVAOO.IamNatri.com.github.OODataStructures.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {

        private double limit;
        private double balance;
        private List<Purchase> purchases;

        public CreditCard(double limit) {
            this.limit = limit;
            this.balance = limit;
            this.purchases = new ArrayList<>();
        }

        public boolean upPurchase(Purchase purchases) {
            if(this.balance >= purchases.getValue()){
                this.balance -= purchases.getValue();
                this.purchases.add(purchases);
                return true;
            }

            return false;
        }

        public double getLimit() {
            return limit;
        }

        public double getbalance() {
            return balance;
        }

        public List<Purchase> getPurchases() {
            return purchases;
        }
}
