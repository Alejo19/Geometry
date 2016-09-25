/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.frustums;

import ec.edu.espe.math.shapes.circumference.Ellipse;

/**
 *
 * @author Labs-DECC
 */
public class Frustum extends Ellipse implements FrustumSolid{
    private Float heigth;

    public Frustum(Float heigth, float otherRadius, float radius) {
        super(otherRadius, radius);
        this.heigth = heigth;
    }

    @Override
    public Float CalculateVolume() {
        return (float)(Math.PI*this.radius*this.heigth*(Math.pow(this.heigth,2)));
    }
    
}
