package ru.geekbrains.lesson5;

public class HomeWork5 {
    public static void main (String [] args) {
        Employee[] employees = new Employee[5];
        employees[0]=new Employee("Petrov Roman", "engineer", "rpetrov@elstroy.ru", "9102345678", 45000,41);
        employees[1]=new Employee("Morozov Roman", "engineer", "rmorozov@elstroy.ru", "9100987654", 45000,38);
        employees[2]=new Employee("Harin Alex", "engineer", "aharin@elstroy.ru", "9209202123", 36000,45);
        employees[3]=new Employee("Polyakov Dmytry", "manager", "dpolyakov@elstroy.ru", "9106373157", 64000,31);
        employees[4]=new Employee("Nilova Inna", "manager", "inilova@elstroy.ru", "9033034152", 45000,35);

        for (int i=0; i< employees.length; i++) {
           if( employees[i].age>40) {
               employees[i].print();
           }

        }


    }
}
