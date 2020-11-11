package visitor;

/**
 *
 * @author Muzaffar
 */
public class Employee {
    
    private int vacDays;
    private String name;
    
    Employee(){
        
    }

    Employee(String name, int vacDays){
        this.vacDays = vacDays;
        this.name = name;            
    }
    
    public int getVacDays(){
        return vacDays;
    }
    
    public void accept(VacationVisitor vc){
        vc.visit(this);
    }
    
}
