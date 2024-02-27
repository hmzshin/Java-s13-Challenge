package employeeApp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        workWithData();
    }

    private static void workWithData() {
        HealthPlan h1 = new HealthPlan(1, "A Sigorta", Plan.BASIC);
        HealthPlan h2 = new HealthPlan(2, "B Sigorta", Plan.ADVANCE);

        String[] healthPlans = new String[3];
        healthPlans[0] = h1.getName();
        healthPlans[1] = h2.getName();

        Employee employee = new Employee(1, "Ahmet", "Ahmet.com", "12344", healthPlans);
        employee.addHealthPlan(0, "C sigorta");
        employee.addHealthPlan(2, "C sigorta");
        employee.addHealthPlan(2, "X sigorta");

        Company company = new Company(1, "workintech", -100, healthPlans);

        System.out.println(company);
        System.out.println(employee);
        System.out.println(h1);
        ;

        System.out.println(Arrays.toString(employee.getHealthPlans()));
    }
}
