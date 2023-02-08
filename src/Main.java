public class Main {
    public static void main(String[] args) {

        /*
        ЗАДАНИЕ №1
         */

        //Создаем  3 объекта класса Phone
        Phone phone1 = new Phone("89001233456", "IPhon 5s", 120);
        Phone phone2 = new Phone("89056783478", "Huawei 10 pro", 177);
        Phone phone3 = new Phone("89607801238", "Xiaomi 9 pro max", 200);

        //Вывовы методов
        phone1.receiveCall("Мама Tele2");
        System.out.println(phone1.GetNumber());
        phone2.receiveCall("Бабушка билайн");
        System.out.println(phone2.GetNumber());
        phone3.receiveCall("Тема бутер мен");
        System.out.println(phone3.GetNumber());

        //Вызовы перегруженного метода
        phone1.receiveCall("Мама Tele2", "89001233456");
        phone2.receiveCall("Бабушка билайн", "89056783478");
        phone3.receiveCall("Тема бутер мен", "89607801238");

        //Метод sendMessage
        String[] nums = new String[] {"89001233456", "89056783478", "89607801238"};
        Phone.sendMessage(nums);
        System.out.println("");

        /*
        ЗАДАНИЕ №2
        */

        Person noName = new Person();

        System.out.println("Задание 2");
        Person Nikita = new Person("Метлов Никита Михайлович", 17);
        Nikita.move(Nikita.fullName);
        Nikita.talk(Nikita.fullName);

    }
}