package visitor;

/**
 *
 * @author Muzaffar
 */
public class TheVisitorPatternDemo {

    public static void main(String[] args) {
        
        Employee emp1 = new Employee("Muzaffar", 12);
        Employee emp2 = new Employee("Valdo", 2);
        Employee emp3 = new Employee("Vedank", 13);
        Employee emp4 = new Employee("Mangirish", 50);
        
        VacationVisitor v = new VacationVisitor();
    
        emp1.accept(v);
        emp2.accept(v);
        emp3.accept(v);
        emp4.accept(v);
        
        System.out.println(v.getTotalDays());
    }
    
}
