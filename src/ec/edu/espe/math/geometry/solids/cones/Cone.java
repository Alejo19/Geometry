/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cones;

import ec.edu.espe.math.geometry.shapes.circumference.Circumference;
import ec.edu.espe.math.geometry.solids.SolidInterface;

/**
 *
 * @author Jonathan
 */
public class Cone extends Circumference implements ConeSolid{
    private Float side;
    private Float height;
    
    public Cone(Float side, Float height, Float radio) {
        super(radio);
        this.side = side;
        this.height = height;
}

    @Override
    public Float CalculateArea() {
        return (float)Math.PI*this.radius*(this.side+this.radius);
    }

    @Override
    public Float CalculatePerimeter() {
        return null;
    }

    @Override
    public Float CalculateVolume() {
        return (float)(1/3*Math.PI*Math.pow(this.radius,3)*this.height);
    }
    
}
