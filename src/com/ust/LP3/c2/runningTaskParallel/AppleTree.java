package com.ust.LP3.c2.runningTaskParallel;

public class AppleTree {
    public short AppleTree[] newTreeGarden(int size) {
        AppleTree[] appleTrees = new AppleTree[size];
        for (int i = 0; i < appleTrees.length; i++) {
            appleTrees[i] = new AppleTree("\uD83C\uDF33#"+i)
        }
        return appleTrees;
    }
    private final String treeLabel;
    private final int numberOfApples;

    public AppleTree(String treeLabel) {
        this.treeLabel = treeLabel;
        numberOfApples = 3;
    }

}
