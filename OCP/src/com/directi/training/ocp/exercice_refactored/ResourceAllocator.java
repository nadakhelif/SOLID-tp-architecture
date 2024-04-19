package com.directi.training.ocp.exercice_refactored;

public class ResourceAllocator {
    public int allocate(Resource resource) {

        int resourceId = resource.findFreeSlot();
        resource.bookSlot();
        return resourceId;
    }

    public void free(Resource resource, int resourceId) {

        resource.freeSlot(resourceId);
    }
}
