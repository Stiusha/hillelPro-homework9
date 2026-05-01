package app;

public class Main {

    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        DataHandler dataHandler = new DataHandler();

        String namesOutput = dataHandler.handleData(provider.getProductNames());
        System.out.println("Products:\t" + namesOutput);

        String salesOutput = dataHandler.handleData(provider.getSalesAmounts());
        System.out.println("Sales, EUR:\t" + salesOutput);
    }
}