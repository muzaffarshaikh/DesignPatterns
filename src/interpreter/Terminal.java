package interpreter;

/**
 *
 * @author Muzaffar
 */
public class Terminal extends AbstractExpression {

    @Override
    public void Interpret() {
         System.out.println("Evaluating Terminal Expression.");
    }
}
