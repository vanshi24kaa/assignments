abstract class Shape {
    abstract void draw();
}
class Rectangle
{
    int length,breadth;
    void draw(int l, int b)
    {
        length=l;
        breadth=b;
        System.out.println("Drawing rectangle of length and breadth" + length );
    }
}
class Line
{
    int length;
    void draw(int l)
    {
        length=l;
        System.out.println("Drawing line of length"+length);
    }
}
class Cube
{
    int side;
    void draw(int l)
    {
        side=1;
        System.out.println("Drawing cube of side"+side);
    }
}
public class Draw
{
    public static void main(String[] args)
    {
        Rectangle r=new Rectangle();
        Line l=new Line();
        Cube c=new Cube();
        r.draw(3,4);
        l.draw(6);
        c.draw(4);
    }
}
