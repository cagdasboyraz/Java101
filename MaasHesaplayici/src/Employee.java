public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    void tax(){
        if (this.salary > 0 && this.salary < 1000)
        {
            this.tax = this.salary * 0;

        } else {
            this.tax = this.salary * 0.03;
        }
    }

    void bonus(){
        if (this.workHours>40) {
            this.bonus = (this.workHours - 40) * 30;

        } else {

            this.bonus=0;
        }
    }

    void raiseSalary()
    {
        if (2021-this.hireYear<10)
        {
            this.raiseSalary=this.salary*0.05;
        }
        else if(2021-this.hireYear<20)
        {
            this.raiseSalary=this.salary*0.10;
        }
        else
            this.raiseSalary=this.salary*0.15;
    }

    void toSting(){
        System.out.println("Adi: " + this.name);
        System.out.println("Maasi: " + this.salary);
        System.out.println("Calisma saati " + this.workHours);
        System.out.println("Ise giris yili: " + this.hireYear);
        System.out.println("vergisi: " + this.tax);
        System.out.println("Bonus " + this.bonus);
        System.out.println("Yila gore maas artisi: " + this.raiseSalary);
        System.out.println("Vergi ve bonuslar ile maas " + (this.salary + this.tax + this.bonus));
        System.out.println("Toplam maas: " +(this.salary + this.bonus));

    }
}
