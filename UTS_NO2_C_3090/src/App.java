import app.CommissionEmployee_3090;
import app.ProjectPlanner_3090;
import app.SalariedEmployee_3090;

public class App {
    public static void main(String[] args) throws Exception {
        SalariedEmployee_3090 salaried1_3090 = new SalariedEmployee_3090("Dede", "2112", 500000);
        ProjectPlanner_3090 projectPlanner1_3090 = new ProjectPlanner_3090("Adi", "2114", 2000000, 800000, 10);
        CommissionEmployee_3090 CommisionEmployee1_3090 = new CommissionEmployee_3090("Ade", "2113", 1000000, 500000, 20);
        
        salaried1_3090.info();
        System.out.println();
        projectPlanner1_3090.info();
        System.out.println();
        CommisionEmployee1_3090.info();

    }
}
