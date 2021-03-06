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

import java.math.*;

public class Rhombus extends Quadrilaterals{
    private float bigDiagonal,smallDiagonal;

    public Rhombus(float bigDiagonal, float smallDiagonal) {
        super((float)Math.sqrt(Math.pow(bigDiagonal/2, 2)+Math.pow(smallDiagonal/2,2)));
        this.bigDiagonal = bigDiagonal;
        this.smallDiagonal = smallDiagonal;
        
    }

    @Override
    public Float CalculateArea() {
        return this.bigDiagonal*this.smallDiagonal/2;
    }

    @Override
    public Float CalculatePerimeter() {
        return this.side*4; 
    }
    
}
