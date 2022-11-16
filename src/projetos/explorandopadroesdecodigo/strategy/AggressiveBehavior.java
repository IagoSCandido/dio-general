package projetos.explorandopadroesdecodigo.strategy;

public class AggressiveBehavior implements  IBehavior{
    @Override
    public void move () {
        System.out.println("Its moving aggressively...");
    }
}
