package strategy;

public class ContextRobot {
    private InterfaceBehaviour behaviour;

    public void setBehaviour(InterfaceBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void move() {
        behaviour.move();
    }

}
