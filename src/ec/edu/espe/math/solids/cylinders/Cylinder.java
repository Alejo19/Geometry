/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.cylinders;

import ec.edu.espe.math.shapes.circumference.Circumference;

/**
 *
 * @author Labs-DECC
 */
public class Cylinder extends Circumference implements CylinderSolid{
    private Float height;
    
    public Cylinder(Float height, Float radius) {
        super(radius);
        this.height = height;
}
    @Override
    public Float CalculateVolume() {
        return (float)(Math.PI*Math.pow(this.radius,2)*this.height);
    }

    @Override
    public Float CalculateArea() {
        return (float)(2 * Math.PI*this.radius*(this.radius + this.height));
    }

    @Override
    public Float CalculatePerimeter() {
        return null;
    }
    
}
