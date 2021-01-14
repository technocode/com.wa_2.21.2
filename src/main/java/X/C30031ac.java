package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.1ac  reason: invalid class name and case insensitive filesystem */
public class C30031ac extends C05050Mz {
    public static Class A00;
    public static Constructor A01;
    public static Method A02;
    public static Method A03;
    public static boolean A04;

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: java.lang.reflect.Method */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Class */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: java.lang.reflect.Method */
    /* JADX WARN: Multi-variable type inference failed */
    public static void A02() {
        Class cls;
        Method method;
        Method method2;
        if (!A04) {
            A04 = true;
            Constructor<?> constructor = null;
            try {
                Class<?> cls2 = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls2.getConstructor(new Class[0]);
                Method method3 = cls2.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                constructor = constructor2;
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls2, 1).getClass());
                method = method3;
                cls = cls2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = constructor;
                cls = constructor;
                method = constructor;
            }
            A01 = constructor;
            A00 = cls;
            A02 = method;
            A03 = method2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047 A[SYNTHETIC] */
    @Override // X.C05050Mz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r6, android.os.CancellationSignal r7, X.C14780ms[] r8, int r9) {
        /*
        // Method dump skipped, instructions count: 120
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30031ac.A05(android.content.Context, android.os.CancellationSignal, X.0ms[], int):android.graphics.Typeface");
    }

    @Override // X.C05050Mz
    public Typeface A06(Context context, AnonymousClass0NL r15, Resources resources, int i) {
        A02();
        try {
            Object newInstance = A01.newInstance(new Object[0]);
            AnonymousClass0NG[] r10 = r15.A00;
            for (AnonymousClass0NG r2 : r10) {
                File A0o = AnonymousClass0N2.A0o(context);
                if (A0o == null) {
                    return null;
                }
                try {
                    if (!AnonymousClass0N2.A1j(A0o, resources, r2.A00)) {
                        A0o.delete();
                        return null;
                    }
                    String path = A0o.getPath();
                    int i2 = r2.A02;
                    boolean z = r2.A04;
                    A02();
                    try {
                        if (!((Boolean) A02.invoke(newInstance, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                            return null;
                        }
                        A0o.delete();
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    A0o.delete();
                }
            }
            A02();
            try {
                Object newInstance2 = Array.newInstance(A00, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) A03.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
