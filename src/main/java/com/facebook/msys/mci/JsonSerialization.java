package com.facebook.msys.mci;

import X.C002601j;

public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized boolean initialize() {
        synchronized (JsonSerialization.class) {
            C002601j.A01("JsonSerialization.initialize");
            try {
                if (sInitialized) {
                    return false;
                }
                nativeInitialize();
                sInitialized = true;
                C002601j.A00();
                return true;
            } finally {
                C002601j.A00();
            }
        }
    }
}
