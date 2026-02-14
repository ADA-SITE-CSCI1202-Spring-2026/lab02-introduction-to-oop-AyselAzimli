public class InvoiceTest {
    public static void main(String[] args) {
       Invoice invoice1 = new Invoice("B44", "Cekin", 75, 100);
       System.out.println(invoice1.getPartNumber());
       System.out.println(invoice1.getPartDescription());
       System.out.println(invoice1.getQuantity());
       System.out.println(invoice1.getPricePerItem());
       System.out.println(invoice1.getInvoiceAmount());


        Invoice invoice2 = new Invoice("B45", "Screwdriver", -3, -5.50);
        System.out.println(invoice2.getQuantity());
        System.out.println(invoice2.getPricePerItem());
        System.out.println(invoice2.getInvoiceAmount());
    }
}
