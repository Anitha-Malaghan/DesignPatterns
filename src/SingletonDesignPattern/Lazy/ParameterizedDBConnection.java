package SingletonDesignPattern.Lazy;

public class ParameterizedDBConnection {
    private static ParameterizedDBConnection instance = null;
    private String url=null;
    private ParameterizedDBConnection(String url){
        this.url = url;
    };

    public static ParameterizedDBConnection getInstance(String url) {
        if(instance == null) {
            synchronized (ParameterizedDBConnection.class) {
                if (instance == null) {
                    instance = new ParameterizedDBConnection(url);
                }
            }
        }

        return instance;
    }
}
