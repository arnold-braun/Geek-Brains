package OOP;

public class OOP {
    public static void main(String[] args) {
        Staff staff1 = new Staff("James", "Programmer",
                "james.it@email.com", 123321, 95000, 33);

        staff1.printInfo();

        Staff[] persArray = new Staff[5];
        persArray[0] = new Staff("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312,
                30000, 42);
        persArray[1] = new Staff("Petrov Vasiliy", "Lawyer", "petrov.law@mailbox.com", 892312412,
                40000, 51);
        persArray[2] = new Staff("Smirnov Sergei", "IT", "sergei.it@mailbox.com", 892312512,
                80000, 38);
        persArray[3] = new Staff("Karapetyan Anzor", "Driver", "anzor@mailbox.com", 892312612,
                20000, 29);
        persArray[4] = new Staff("Uvarov Alexei", "Accountant", "uvarov@mailbox.com", 892312712,
                500000, 34);
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].printInfo();
            }
        }
    }
}
