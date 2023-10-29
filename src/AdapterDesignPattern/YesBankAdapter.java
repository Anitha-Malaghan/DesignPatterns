package AdapterDesignPattern;

import AdapterDesignPattern.Component.yesBank.YesBankApi;

public class YesBankAdapter implements BankApiAdapter{
    private YesBankApi yesBankApi = new YesBankApi();

    @Override
    public double getBalance(String accNumber){
        return 1000;
    }
    @Override
    public boolean sendMoney(String from, String to, int amt){
        return false;
    }
}
