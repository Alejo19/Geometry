/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.geometry.shapes.triangles;

/**
 *
 * @author Jonathan
 */
public class RightAngleTriangle extends Triangle {

    public RightAngleTriangle(float sideBase, float sideHeight) {
        super(sideBase, sideHeight);
    }

    
    @Override
    public Float CalculatePerimeter() {
        return this.sideBase+this.sideHeight+(float)(Math.sqrt(Math.pow(this.sideBase,2)+Math.pow(this.sideHeight,2)));
    }
    
}
