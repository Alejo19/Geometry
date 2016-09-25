/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.shapes.quadrilaterals;

/**
 *
 * @author Jonathan
 */
public class Trapezoid extends Quadrilaterals{
    private float minSide,sideA,sideC,height;

    public Trapezoid(float minSide, float height, float side) {
        super(side);
        this.minSide = minSide;
        this.height = height;
    }

    @Override
    public Float CalculateArea() {
        return (this.side+this.minSide)*this.height/2;
    }

    @Override
    public Float CalculatePerimeter() {
        return this.minSide+this.sideA+this.sideC+this.side;
    }
}
