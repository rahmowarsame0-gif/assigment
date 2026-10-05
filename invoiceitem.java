package paractice;

public class invoiceitem {



        private String id;
        private String desc;
        private int qty;
        private double unitPrice;

        public invoiceitem (String id, String desc, int qty, double unitPrice) { // Constructors
            this.id = id;
            this.desc=desc;
            this.qty=qty;
            this.unitPrice=unitPrice;
        }
        public String getId () {
            return id;
        }
        public String getDesc () {
            return desc;
        }
        public int getQty () {
            return qty;
        }
        public void setQty (int qty) {
            this.qty = qty;
        }
        public double getUnitPrice () {
            return unitPrice;
        }
        public void setUnitPrice (double unitPrice){
            this.unitPrice = unitPrice;
        }
        public double getTotal () {
            return unitPrice * qty;
        }
        public String toString () {
            return "InvoiceItem [id: " + id + " " + "Desc: " + desc + " " + "Qty: " + qty + " " + "Unit Price: " + unitPrice + "]";
        }
    }
    class testMain2 {
        public static void main(String[] args) {
            invoiceitem inv1 = new invoiceitem("A101", "Pen Red ", 888, 0.08);
            System.out.println(inv1);

            inv1.setQty(999);
            inv1.setUnitPrice(0.99);
            System.out.println(inv1);
            System.out.println("Id Is: " + inv1.getId());
            System.out.println("Desc Is: " + inv1.getDesc());
            System.out.println("qty Is: " + inv1.getQty());
            System.out.println("Unit Price Is: " + inv1.getUnitPrice());

            System.out.println("The Total Is: " + inv1.getTotal());
        }
    }
}
