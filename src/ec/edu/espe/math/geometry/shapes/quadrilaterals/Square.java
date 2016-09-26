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
public class Square extends Quadrilaterals{
    public Square(float side) {
        super(side);
    }

    @Override
    public Float CalculateArea() {
       return this.side*4;
    }
    @Override
    public Float CalculatePerimeter() {
       return this.side*this.side;
    }
    
}
