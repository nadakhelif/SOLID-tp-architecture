package com.directi.training.ocp.exercice_refactored;

public interface Resource {
    public int findFreeSlot();
    public void bookSlot();
    public void freeSlot(int resourceId);
}
