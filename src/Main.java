public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastname = "Ivanov";
        String fullName = lastname + ' ' + firstName + ' ' + middleName;

        System.out.println("Ф.И.О. сотрудника - " +fullName);


        // Задача 2
        System.out.println("Задача 2");

        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());



        // Задача 3
        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";

        String fullNameTrue = fullName.replace("ё", "е");

        System.out.println("Данные Ф.И.О. сотрудника - " + fullNameTrue);

    }
}