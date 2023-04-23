package CreationalDesignPatterns.Builder;

public class Product {
    private String productName;
    private String productDescription;
    private Double price;

    public Product(Builder builder) {
        this.productName = builder.productName;
        this.productDescription = builder.productDescription;
        this.price = builder.price;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDefinition() {
        return productDescription;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String productName;
        private String productDescription;
        private Double price;

        public Builder() {
        }

        public Builder setProductName(String productName){
            this.productName = productName;
            return this;
        }
        public Builder setProductDescription(String productDescription){
            this.productDescription = productDescription;
            return this;
        }
        public Builder setPrice(Double price){
            this.price = price;
            return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
}