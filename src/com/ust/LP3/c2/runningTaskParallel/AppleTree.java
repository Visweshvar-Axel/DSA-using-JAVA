package com.ust.LP3.c2.runningTaskParallel;

import java.util.concurrent.TimeUnit;

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
    public int pickApples(String workerName) {
        try {
            System.out.printf("%s Started picking apples from %s \n",workerName,treeLabel);
            TimeUnit.SECONDS.sleep(1);
            System.out.println(workerName+" picked "+numberOfApples+" s from "+treeLabel);
        }
    }
}
