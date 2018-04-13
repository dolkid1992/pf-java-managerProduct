import java.io.Serializable;

public class Stock implements Serializable {
    private int id;
    private String nameProducts;
    private String producer;
    private double price;
    private String comment;

    public Stock (int id, String nameProducts, String producer, double price, String comment ){
        this.id = id;
        this.nameProducts = nameProducts;
        this.producer = producer;
        this.price = price;
        this.comment = comment;
    }

    @Override
    public String toString(){
        return id + "-" + nameProducts + "-" + producer + "-" + price + "-" + comment;
    }
}
