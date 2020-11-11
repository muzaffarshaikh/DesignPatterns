/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Muzaffar
 */
public class VectorIterator implements Iterator{
    private Vector v;
    private int index;    
    
    public VectorIterator(Vector v){
        this.v = v;
    }

    public void resetIndex() {
        this.index = 0;
    }
    
    @Override
    public boolean hasNext() {
        if(v.isEmpty() || index >= v.size()) return false;
        return true;
    }

    @Override
    public Object next() {
        return v.get(index++);
    }
}
