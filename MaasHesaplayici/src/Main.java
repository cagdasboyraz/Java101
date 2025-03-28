public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Cagdas", 2300, 45, 1985 );
        emp.bonus();
        emp.tax();
        emp.raiseSalary();
        emp.toSting();
    }
}
