package Decorator_pattern;

public class BlueShapeDecorator extends ShapeDecorator{
    public BlueShapeDecorator(Shape decoratedShape)
    {
        super(decoratedShape);
    }
    @Override
    public void draw()
    {
        decoratedShape.draw();
        setBorder(decoratedShape);

    }
    public void setBorder(Shape decoratedShape)
    {
        System.out.println("Border color: Blue");
    }


}
