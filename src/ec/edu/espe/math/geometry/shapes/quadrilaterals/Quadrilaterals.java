package ec.edu.espe.math.geometry.shapes.quadrilaterals;

import ec.edu.espe.math.geometry.shapes.ShapeInterface;

/**
 *
 * @author Jonathan
 */
public abstract class Quadrilaterals  implements ShapeInterface{
    protected float side;//also the base of some shapes

    public Quadrilaterals(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    
}
