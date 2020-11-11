/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;

/**
 *
 * @author Muzaffar
 */
public abstract class AbstractExpression {
    
    protected String interpretedString;
    protected ArrayList<Character> interpretedSymbol;
    
    public abstract void Interpret();
    
    public void setInterpretedString(String interpretedString) {
        this.interpretedString = interpretedString;
    }
    
}
