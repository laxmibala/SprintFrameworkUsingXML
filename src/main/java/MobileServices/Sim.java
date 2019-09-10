package MobileServices;

public interface Sim {
    void calling();
    void browsingInternet();
    void services();
    default void displayInternetConnection(){
        System.out.println("default Internet Connection Speed: 2G");
    }


}
