/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.solids.cubes;

import ec.edu.espe.math.shapes.quadrilaterals.Square;

/**
 *
 * @author Labs-DECC
 */
public class Cube extends Square implements CubeSolid{
    
    public Cube(float side) {
        super(side);
    }

    @Override
    public Float CalculateVolume() {
        return (float)(Math.pow(this.side, 3));
    }
    
}
