/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.solids.cirfumference;

import ec.edu.espe.math.geometry.shapes.circumference.Circumference;
import ec.edu.espe.math.geometry.shapes.circumference.Ellipse;

/**
 *
 * @author Jonathan
 */
public class Sphere extends Circumference implements CircumferenceSolid{

    private Float hight;
    
    public Sphere(Float higth, Float radio) {
        super(radio);
        this.hight = higth;
    }
    public Sphere(Float radio) {
        super(radio);
}
    
    @Override
    public Float CalculateArea() {
        return (float)(2*Math.PI*this.radius*(this.radius+ this.hight));
    }

    @Override
    public Float CalculatePerimeter() {
        return null;
    }

    @Override
    public Float CalculateVolume() {
        return (float)((4/3)*(Math.PI)*Math.pow(this.radius,3));
    }
    
    
    
}
