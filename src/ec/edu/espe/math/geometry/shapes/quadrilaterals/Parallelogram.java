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
public class Parallelogram extends Quadrilaterals {
    private float sideI,height;

    public Parallelogram(float height,float sideI, float side) {
        super(side);
        this.sideI = sideI;
        this.height=height;
    }

    @Override
    public Float CalculateArea() {
        return this.height*this.side;
    }

    @Override
    public Float CalculatePerimeter() {
        return this.sideI*2+this.side*2;
    }
    
}
