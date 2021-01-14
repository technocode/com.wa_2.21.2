package com.facebook.msys.util;

public class Environment {
    public static native synchronized boolean setenvNative(String str, String str2, boolean z);

    public static boolean setenv(String str, String str2) {
        return setenv(str, str2, true);
    }

    public static boolean setenv(String str, String str2, boolean z) {
        if (str == null) {
            throw null;
        } else if (str2 != null) {
            return setenvNative(str, str2, z);
        } else {
            throw null;
        }
    }
}
