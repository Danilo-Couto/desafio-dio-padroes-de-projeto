package singleton;

public class SingletonLazyHolder {
    private static class InnerHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {super();}
    public static SingletonLazyHolder getInstance() { return InnerHolder.instance;}
}
