package projetos.explorandopadroesdecodigo.singleton;

public class SingletonLazyHolder {
    private static class holder {
        private static SingletonLazyHolder instance = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }
    public static SingletonLazyHolder getInstance() {
        return holder.instance;
    }
}
