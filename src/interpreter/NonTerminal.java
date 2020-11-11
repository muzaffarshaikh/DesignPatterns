/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Muzaffar
 */
public class NonTerminal extends AbstractExpression {

    @Override
    public void Interpret() {
        System.out.println("Evaluating Non-Terminal Expression.");
    }
    
}
