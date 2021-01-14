package X;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.1ad  reason: invalid class name and case insensitive filesystem */
public class C30041ad extends C05050Mz {
    public static final Class A00;
    public static final Constructor A01;
    public static final Method A02;
    public static final Method A03;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.reflect.Method */
    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
            Class<?> cls3 = Integer.TYPE;
            Method method3 = cls2.getMethod("addFontWeightStyle", ByteBuffer.class, cls3, List.class, cls3, Boolean.TYPE);
            constructor = constructor2;
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
            method = method3;
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = constructor;
            method2 = constructor;
            method = constructor;
        }
        A01 = constructor;
        A00 = cls;
        A02 = method;
        A03 = method2;
    }

    public static boolean A02(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) A02.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // X.C05050Mz
    public Typeface A05(Context context, CancellationSignal cancellationSignal, C14780ms[] r13, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        AnonymousClass05W r8 = new AnonymousClass05W();
        for (C14780ms r6 : r13) {
            Uri uri = r6.A03;
            ByteBuffer byteBuffer = (ByteBuffer) r8.get(uri);
            if (byteBuffer == null) {
                byteBuffer = AnonymousClass0N2.A0t(context, cancellationSignal, uri);
                r8.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !A02(obj, byteBuffer, r6.A01, r6.A02, r6.A04)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(A00, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) A03.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        throw r0;
     */
    @Override // X.C05050Mz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A06(android.content.Context r16, X.AnonymousClass0NL r17, android.content.res.Resources r18, int r19) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30041ad.A06(android.content.Context, X.0NL, android.content.res.Resources, int):android.graphics.Typeface");
    }
}
