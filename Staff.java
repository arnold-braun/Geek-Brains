package OOP;

public class Staff {
    private String name;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Staff(String name, String position, String email, int phone,int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("name: " + name + "; Должность: " + position + "; Email: " + email +
                "; Номер телефона: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}
