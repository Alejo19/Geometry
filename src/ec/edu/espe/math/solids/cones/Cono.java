/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.cones;

import ec.edu.espe.math.shapes.circumference.Circumference;
import ec.edu.espe.math.solids.SolidInterface;

/**
 *
 * @author Jonathan
 */
public class Cono extends Circumference implements ConoSolid{

    public Cono(float radius) {
        super(radius);
    }

    @Override
    public float CalculateArea() {
        return (float)(Math.PI );
    }

    @Override
    public float CalculatePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
