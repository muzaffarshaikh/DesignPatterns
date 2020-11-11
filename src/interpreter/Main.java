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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractExpression t1 = new Terminal();
        AbstractExpression t2 = new Terminal();
        AbstractExpression t3 = new Terminal();
        AbstractExpression t4 = new Terminal();
        AbstractExpression nt1 = new NonTerminal();
        AbstractExpression nt2 = new NonTerminal();

        AbstractExpression[] exp = {t1, nt1, t2, t3, nt2, t4};

        for (AbstractExpression exp1 : exp) {
            exp1.Interpret();
        }

    }

}
