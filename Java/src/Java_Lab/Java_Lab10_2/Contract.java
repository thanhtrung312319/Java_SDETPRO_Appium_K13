package Java_Lab.Java_Lab10_2;

public class Contract extends Employee {
    public Contract(){
        this.salary = 40000;
        this.supportSalary = 400;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getSupportSalary(){
        return this.supportSalary;
    }

}
