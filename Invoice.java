package week03.invoice;

public class Invoice {

    private String PartNumber;
    private String PartDescription;
    private int Quantity;
    private double PricePerItem;

    public Invoice(String PartNumber, String PartDescription, int Quantity, double PricePerItem) {

        this.PartNumber = PartNumber;
        this.PartDescription = PartDescription;
        this.Quantity = Quantity;
        this.PricePerItem = PricePerItem;
    }

    public void setPartNumber(String PartNumber) {
        this.PartNumber = PartNumber;
    }

    public String getPartNumber() {
        return PartNumber;
    }
    public void setPartDescription(String partDescription) {
        this.PartDescription = partDescription;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setPricePerItem(double PricePerItem) {
        this.PricePerItem = PricePerItem;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }
}