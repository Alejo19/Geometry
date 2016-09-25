/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.shapes.circumference;

/**
 *
 * @author Jonathan
 */
public class Circle extends Circumference{

    public Circle(float radius) {
        super(radius);
    }

    @Override
    public Float CalculateArea() {
        return (float)(Math.PI*Math.pow(radius,2));
    }

    @Override
    public Float CalculatePerimeter() {
        return (float)(2*Math.PI*this.radius);
    }
    
}
