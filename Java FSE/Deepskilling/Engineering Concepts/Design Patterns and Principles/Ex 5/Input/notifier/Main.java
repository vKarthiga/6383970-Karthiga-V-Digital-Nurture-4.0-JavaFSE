package notifier;

public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new BaseNotifier();
        Notifier emailNotifier = new EmailNotifier(baseNotifier);
        Notifier smsNotifier = new SMSNotifier(emailNotifier);
        Notifier slackNotifier = new SlackNotifier(smsNotifier);

        slackNotifier.send("Your order has been shipped!");
    }
}
