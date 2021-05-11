package HWL11;
//Task4
public class SingletonExample {
    private static SingletonExample example_singleton = null;
    public String s;

    private SingletonExample() {
        s = "Singleton class";
    }

    public static SingletonExample getInstance() {
        if (example_singleton == null)
            example_singleton = new SingletonExample();
        return example_singleton;

    }
}
