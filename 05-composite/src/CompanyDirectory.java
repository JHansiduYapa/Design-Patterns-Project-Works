import java.util.ArrayList;
import java.util.List;

/// This is composite object
class CompanyDirectory implements Employee {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void removeEmployee(Employee emp) {
        employees.remove(emp);
    }

    @Override
    public void showDetails() {
        for (Employee emp : employees) {
            emp.showDetails();
        }
    }
}