package com.ust.LP2.c2.serialization;

import java.io.Serializable;

//public class Duck implements Serializable {
public class Duck {
    // it doesn't implement serializable,
    // so when we try to serialize a pond object, it fails because the pond's
    // duck instance variable can't be saved
}
