package decoratorpattern;

/**
 *
 * @author Muzaffar
 */

public abstract class Decorator {
    ConstructionProject cp;
    Decorator(ConstructionProject cp){
      this.cp=cp;
    }

    public abstract void display();
    
}
