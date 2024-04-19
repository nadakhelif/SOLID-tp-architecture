package com.directi.training.isp.exercise_refactored;

import java.util.Random;

public class Sensor
{
    public void register(ISensing sensingObject)
    {
        while (true) {
            if (isPersonClose()) {
                sensingObject.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
