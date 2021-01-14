package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;

public class RedactedString {
    public NativeHolder mNativeHolder;

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public RedactedString(String str) {
        if (str != null) {
            this.mNativeHolder = initNativeHolder(str);
            return;
        }
        throw null;
    }

    public RedactedString(String str, int i) {
        if (str != null) {
            this.mNativeHolder = initNativeHolder(str, i);
            return;
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }
}
