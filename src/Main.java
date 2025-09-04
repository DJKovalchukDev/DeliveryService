public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(3, 7, 10);
        System.out.println(dimensions);
        Goods goods = new Goods(dimensions, 2.5, "St.Petersburg", false,
                "570-A888", true);
        System.out.println(goods);

        Dimensions cloneDimensions;
        cloneDimensions = dimensions.setLength(2);
        cloneDimensions = cloneDimensions.setWidth(5);
        cloneDimensions = cloneDimensions.setHeight(9);
        System.out.println("\nCloneDimensions: " + cloneDimensions + "\n" + goods);



        Goods clone1;
        clone1 = goods.setWeight(30);
        clone1 = clone1.setDeliveryAddress("Berlin");
        System.out.println("\nClone1:" + "\n" + clone1);

        Dimensions fullCopyDimensions = new Dimensions(
                dimensions.getLength(),
                dimensions.getWidth(),
                dimensions.getHeight());
        System.out.println(fullCopyDimensions);
    }
}
