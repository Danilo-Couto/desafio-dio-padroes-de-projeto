package strategy;

import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

        BehaviourNormal normalBehaviour = new BehaviourNormal();
        BehaviourDefensive defensiveBehaviour = new BehaviourDefensive();
        BehaviourAgressive aggressiveBehaviour= new BehaviourAgressive();

        ContextRobot robot = new ContextRobot();
        robot.setBehaviour(normalBehaviour);
        robot.move();

        robot.setBehaviour(defensiveBehaviour);
        robot.move();

        robot.setBehaviour(aggressiveBehaviour);
        robot.move();
    }
};