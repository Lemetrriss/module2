package classWork;

public class Comp {
    int name;
    private String manufacturer;
    private int serialNumber;
    private double price;
    private int quantityCPU;
    private int frequencyCPU;

    public Comp(int name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
    @Override
    public String toString() {
        return "Comp# " + name +
                " { manufacturer='" + manufacturer + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + String.format("%.2f", price) +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU +
                '}';
    }
}
