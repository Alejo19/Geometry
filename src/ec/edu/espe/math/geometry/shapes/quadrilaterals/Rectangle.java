/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.quadrilaterals;

/**
 *
 * @author Jonathan
 */
public class Rectangle extends Quadrilaterals{
    private float height;

    public Rectangle(float side,float height) {
        super(side);
        this.height=height;
    }

    @Override
    public Float CalculateArea() {
        return this.side*2+this.height*2;
    }

    @Override
    public Float CalculatePerimeter() {
        return this.side*this.height;
    }
    
}
