/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Vector;

/**
 *
 * @author Muzaffar
 */
public class Main {
    
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("1");
        v.add("4");
        v.add("6");
        v.add("3");
        v.add("2");
        
        VectorIterator vi = new VectorIterator(v);
        vi.resetIndex();
        while(vi.hasNext()){
            System.out.println(vi.next());
        }
        
        v.add("8");
        v.add("9");
        
        System.out.println("Elements after addition");
         
        vi.resetIndex();
        while(vi.hasNext()){
            System.out.println(vi.next());
        }
    }
}
