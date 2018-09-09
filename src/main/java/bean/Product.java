package bean;

public class Product {
    private String product_id;
    private String product_name;
    private String product_descri;
    private float product_price;
    private String product_type;


    @Override
    public String toString() {
        return "Product{" +
                "product_id='" + product_id + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_descri='" + product_descri + '\'' +
                ", product_price=" + product_price +
                ", product_type='" + product_type + '\'' +
                '}';
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_descri() {
        return product_descri;
    }

    public void setProduct_descri(String product_descri) {
        this.product_descri = product_descri;
    }

    public float getProduct_price() {
        return product_price;
    }

    public void setProduct_price(float product_price) {
        this.product_price = product_price;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public Product(String product_id, String product_name, String product_descri, float product_price, String product_type) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_descri = product_descri;
        this.product_price = product_price;
        this.product_type = product_type;
    }
}
