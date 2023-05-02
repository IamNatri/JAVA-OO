package JAVAOO.IamNatri.com.github.OODataStructures.CreditCard;

public class Purchase implements Comparable<Purchase> {
        private String Description;
        private double value;

        public Purchase(String Description, double value) {
            this.Description = Description;
            this.value = value;
        }

        public String getDescription() {
            return Description;
        }

        public double getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "Purchase: Description = " + Description +
                    " value =" + value;
        }

        @Override
        public int compareTo(Purchase anotherPurchase) {
            return Double.valueOf(this.value).compareTo(Double.valueOf(anotherPurchase.value));
        }

}
