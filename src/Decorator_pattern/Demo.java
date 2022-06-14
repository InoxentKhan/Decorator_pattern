package Decorator_pattern;




public class Demo {
    public static void main(String[] args) {


        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape bluecircle =new BlueShapeDecorator(new Circle());


        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("\nCircle of blueborder");
        bluecircle.draw();
        Shape rectangle = new Rectangle();
        System.out.println("\nRectangle with normal border");
        rectangle.draw();
        Shape bluerectangle = new BlueShapeDecorator(new Rectangle());
         Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        System.out.println("\nRectangle of blue border");
        bluerectangle.draw();

        Shape triangle = new Triangle();
        Shape redTriangle = new RedShapeDecorator(new Triangle());
        Shape blueTriangle = new BlueShapeDecorator(new Triangle());
        System.out.println("\nTriangle with normal border");
        triangle.draw();
        System.out.println("Triangle with red Border");
        triangle.draw();
        System.out.println("Triangle with blue Border");
        triangle.draw();

    }
}

