/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.cubs;

import ec.edu.espe.math.shapes.quadrilaterals.Square;

/**
 *
 * @author Labs-DECC
 */
public class Cubs extends Square implements CubSolidInterface{
    
    public Cubs(float side) {
        super(side);
    }

    @Override
    public float volume() {
        return (float)(Math.pow(this.side, 3));
    }
    
}
