package interface_demo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Rectangle implements IShape,IOther {
    private double width;
    private double height;

    @Override
    public double getArea() {
        return this.width*this.height;
    }
    public double getPerimeter(){
        return  (this.height+this.width)*2;
    }

    @Override
    public void sayHello() {
        IShape.super.sayHello();
    }

    @Override
    public void show() {

    }
}
