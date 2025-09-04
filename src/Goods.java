public class Goods {
    private final Dimensions dimensions;
    private final double weight;
    private final String deliveryAddress;
    private final boolean isFlipped;
    private final String registrationNumber;
    private final boolean isFragile;

    public Goods(Dimensions dimensions,
                 double weight,
                 String deliveryAddress,
                 boolean isFlipped,
                 String registrationNumber,
                 boolean isFragile) {

        this.dimensions = dimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.isFlipped = isFlipped;
        this.registrationNumber = registrationNumber;
        this.isFragile = isFragile;
    }

    public Goods setWeight(int weight) {
        return new Goods(dimensions, weight, deliveryAddress, isFlipped, registrationNumber, isFragile);
    }

    public Goods setDeliveryAddress(String deliveryAddress) {
        return new Goods(dimensions, weight, deliveryAddress, isFlipped, registrationNumber, isFragile);
    }


    public String toString() {
        return "Вес / Weight: " + weight +
                "\nАдрес доставки / Delivery address: " + deliveryAddress +
                "\nМожно ли переворачивать / Can be flipped: " + isFlipped +
                "\nРегистрационный номер / Registration number: " + registrationNumber +
                "\nГруз хрупкий / Fragile cargo: " + isFragile;
    }
}
