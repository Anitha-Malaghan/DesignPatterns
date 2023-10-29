package AdapterDesignPattern;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        BankApiAdapter bankApiAdapter = new YesBankAdapter();
           PhonePe phonePe = new PhonePe(bankApiAdapter);

           double result = phonePe.doSomething();

           System.out.println("Debug");

    }
}
