public class Fruit {
    private int fruitId;
    private String fruitName;
    private int price;
    private int quality;
    private String origin;
    public Fruit() {
    }
    public Fruit(int fruitId, String fruitName, int price, int quality, String origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.quality = quality;
        this.origin = origin;
    }
    public int getFruitId() {
        return fruitId;
    }
    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }
    public String getFruitName() {
        return fruitName;
    }
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuality() {
        return quality;
    }
    public void setQuality(int quality) {
        this.quality = quality;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    @Override
    public String toString() {
        return "Fruit [fruitId=" + fruitId + ", fruitName=" + fruitName + ", price=" + price + ", quality=" + quality
                + ", origin=" + origin + "]";
    }
}
