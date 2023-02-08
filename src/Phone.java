public class Phone {
    String phone;
    String model;
    int weight;
    public Phone(String phoneNum, String modelNum, int pWeight){
        this(phoneNum, modelNum);
        weight = pWeight;
    }

    public Phone(String phoneNum, String modelNum){
        phone = phoneNum;
        model = modelNum;
    }

    public Phone(){}

    public String GetNumber(){
        return phone;
    }

    public void receiveCall(String name){
        System.out.println("Вам звонит " + name);
    }

    public void receiveCall(String name, String phoneNumber){
        System.out.println("Вам звонит " + name + " c телефона " + phoneNumber);
    }

    public static void sendMessage(String[] numbers){
        System.out.println("Вы отправили сообщения на номера: ");
        for (String number : numbers) {
            System.out.print(number + " ");
        }
    }
}
