package projetos.explorandopadroesdecodigo.strategy;

public class DefensiveBehavior implements IBehavior{
    @Override
    public void move() {
        System.out.println("Its moving defensively...");
    }
}
