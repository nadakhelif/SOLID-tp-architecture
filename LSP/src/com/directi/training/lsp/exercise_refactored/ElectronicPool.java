package com.directi.training.lsp.exercise_refactored;

public class ElectronicPool {

    public void run()
    {
        ElectronicDuck electricDuck1 = new ElectronicDuck();
        ElectronicDuck electricDuck2 = new ElectronicDuck();
        quack(electricDuck1, electricDuck2);
        swim(electricDuck1, electricDuck2);
    }

    private void quack(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(ElectronicDuck... ducks)
    {
        for (ElectronicDuck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args)
    {
        ElectronicPool electronicPool = new ElectronicPool();
        electronicPool.run();
    }
}
