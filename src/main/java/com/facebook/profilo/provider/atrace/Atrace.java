package com.facebook.profilo.provider.atrace;

import X.AnonymousClass10c;
import X.C33421gi;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative();

    public static native boolean installSystraceHook(int i);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative();

    public static void enableSystrace() {
        Method method;
        if (hasHacks()) {
            enableSystraceNative();
            Field field = AnonymousClass10c.A00;
            if (field != null && (method = AnonymousClass10c.A01) != null) {
                try {
                    field.set(null, method.invoke(null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }

    public static synchronized boolean hasHacks() {
        boolean z;
        synchronized (Atrace.class) {
            z = sHasHook;
            if (!z && !sHookFailed) {
                z = installSystraceHook(C33421gi.A00);
                sHasHook = z;
                boolean z2 = false;
                if (!z) {
                    z2 = true;
                }
                sHookFailed = z2;
            }
        }
        return z;
    }

    public static void restoreSystrace() {
        Method method;
        if (hasHacks()) {
            restoreSystraceNative();
            Field field = AnonymousClass10c.A00;
            if (field != null && (method = AnonymousClass10c.A01) != null) {
                try {
                    field.set(null, method.invoke(null, new Object[0]));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        }
    }
}
