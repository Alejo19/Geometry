/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.frustoms;

import ec.edu.espe.math.shapes.circumference.Ellipse;

/**
 *
 * @author Labs-DECC
 */
public class Frustom extends Ellipse implements FrustomSolid{
    
    public Frustom(float otherRadius, float radius) {
        super(otherRadius, radius);
    }

    @Override
    public float volume() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
