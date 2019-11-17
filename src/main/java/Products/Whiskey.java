package Products;

public class Whiskey {
    private Double price;
    private String name;
    private Double size;
    private Integer quantity;

    public Whiskey(Double price, String name, Double size, Integer quantity) {
        this.price = price;
        this.name = name;
        this.size = size;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
