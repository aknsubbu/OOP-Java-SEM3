package Exam_Prep;

import java.util.*;


public class q2c {
    public static class Invoice{
        String partNumber;
        String partDescription;
        int quantity;
        double price;

        public Invoice(String partNumber, String partDescription, int quantity, double price) {
            this.partNumber = partNumber;
            this.partDescription = partDescription;
            this.quantity = quantity;
            this.price = price;
        }

        public String getPartNumber() {
            return partNumber;
        }


        public String getPartDescription() {
            return partDescription;
        }

        public int invoiceAmount(){
            int amt=this.quantity*(int)this.price;
            return amt;
        }

    }


}
