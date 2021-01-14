package com.facebook.msys.mci;

import X.AnonymousClass0MQ;
import X.C002601j;

public class Log {
    public static boolean sRegistered;

    public static int getAndroidLogLevel(int i) {
        if (i == 0) {
            return 7;
        }
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 6 : 2;
        }
        return 3;
    }

    public static int getWaLogLevel(int i) {
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 7 ? 1 : 0;
        }
        return 2;
    }

    public static native void registerLoggerNative(long j, int i);

    public static native void setLogLevel(int i);

    public static void log(int i, String str) {
        int waLogLevel = getWaLogLevel(i);
        StringBuilder sb = new StringBuilder("wamsys/");
        sb.append(str);
        com.whatsapp.util.Log.log(waLogLevel, sb.toString());
    }

    public static synchronized boolean registerLogger(AnonymousClass0MQ r4) {
        synchronized (Log.class) {
            C002601j.A01("registerLogger");
            try {
                if (sRegistered) {
                    return false;
                }
                registerLoggerNative(r4.A01, r4.A00);
                setLogLevel(getAndroidLogLevel(4));
                sRegistered = true;
                C002601j.A00();
                return true;
            } finally {
                C002601j.A00();
            }
        }
    }
}
