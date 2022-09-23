public class U2L2Runner {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(150,200);
        Rectangle rect2 = new Rectangle(100);
        Rectangle rect3 = new Rectangle();

        rect1.setWidth(125);
        rect2.setLength(125);
        rect2.setWidth(125);
        rect3.setWidth(125);

        int totalPerimeter = rect1.calculatePerimeter() + rect2.calculatePerimeter() + rect3.calculatePerimeter();
        System.out.println("You will need a total of " + totalPerimeter + " feet of fencing");

        int totalArea = rect1.calculateArea() + rect2.calculateArea() + rect3.calculateArea();
        System.out.println("You will need a total of " + totalArea + " square feet of grass");

    }
}
