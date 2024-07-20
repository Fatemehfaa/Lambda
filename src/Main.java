public class Main {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        sendMessage(telegram);

        sendMessage(() -> System.out.println("whatsapp"));
    }

    private static void sendMessage(Messenger messenger) {
        messenger.send();
    }



}