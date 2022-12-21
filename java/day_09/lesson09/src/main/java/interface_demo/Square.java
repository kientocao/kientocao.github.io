package interface_demo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Square implements  IShape,IOther{
    private double side;

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public double getPerimeter() {
        return this.side * 4;
    }

    @Override
    public void sayHello() {
        IShape.super.sayHello();
    }

    @Override
    public void show() {

    }
}