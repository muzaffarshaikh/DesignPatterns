package visitor;

/**
 *
 * @author Muzaffar
 */
public class VacationVisitor extends Visitor {
    
    public int totalDays;
    
    VacationVisitor(){
     
    }
    
    public int getTotalDays(){
        return totalDays;
    }

    @Override
    public void visit(Employee e) {
        totalDays += e.getVacDays();
    }
    
}
