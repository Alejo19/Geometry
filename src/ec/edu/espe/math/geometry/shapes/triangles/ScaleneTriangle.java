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
public class ScaleneTriangle extends Triangle{
    private float sideTwo,sideThree;

    public ScaleneTriangle(float sideTwo, float sideThree, float sideBase, float sideHeight) {
        super(sideBase, sideHeight);
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }
    @Override
    public Float CalculatePerimeter() {
        return this.sideBase+this.sideTwo+this.sideThree;
    }
    @Override
    public Float CalculateArea() {
        float s=CalculatePerimeter()/2;
        return (float)(Math.sqrt((s-this.sideBase)+(s-this.sideTwo)+(s-this.sideThree)));
    }
    
    
}
