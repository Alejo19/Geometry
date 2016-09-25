/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.math.shapes.circumference;

/**
 *
 * @author Jonathan
 */
import ec.edu.espe.math.shapes.ShapeInterface;

public abstract class Circumference implements ShapeInterface{
    protected float radius;

    public Circumference(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Float.floatToIntBits(this.radius);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Circumference other = (Circumference) obj;
        if (Float.floatToIntBits(this.radius) != Float.floatToIntBits(other.radius)) {
            return false;
        }
        return true;
    }
    
}
