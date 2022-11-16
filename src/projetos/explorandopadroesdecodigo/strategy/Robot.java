package projetos.explorandopadroesdecodigo.strategy;

public class Robot {

    private IBehavior behavior;

    public void setBehavior(IBehavior behavior) {
        this.behavior = behavior;
    }

    public void move() {
        behavior.move();
    }
}
