package mypckg;

/**
 * Created by Ксения on 4/19/2016.
 */
public class Buyer {
    int id;
    String name;
    String region;
    double discount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Buyer() {
    }

    public Buyer(int id, String name, String region, double discount) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", discount=" + discount +
                '}';
    }
}
