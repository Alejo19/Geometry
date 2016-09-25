/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.cirfumference;

import ec.edu.espe.math.shapes.circumference.Circumference;
import ec.edu.espe.math.shapes.circumference.Ellipse;

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
    public float CalculateArea() {
        return (float)(2*Math.PI*this.radius*(this.radius+ this.hight));
    }

    @Override
    public float CalculatePerimeter() {
        return 0.0f;
    }

    @Override
    public float volume() {
        return (float)((4/3)*(Math.PI)*Math.pow(this.radius,3));
    }
    
    
    
}
