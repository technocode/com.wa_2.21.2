package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* renamed from: X.23l  reason: invalid class name and case insensitive filesystem */
public class C452123l extends C30031ac {
    public final Class A00;
    public final Constructor A01;
    public final Method A02;
    public final Method A03;
    public final Method A04;
    public final Method A05;
    public final Method A06;

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0006 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.lang.reflect.Constructor */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.reflect.Constructor */
    /* JADX WARN: Multi-variable type inference failed */
    public C452123l() {
        Constructor constructor;
        Method method;
        Method method2;
        Class cls;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls2 = null;
        try {
            Class<?> cls3 = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls3.getConstructor(new Class[0]);
            Class<?> cls4 = Integer.TYPE;
            method = cls3.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls4, Boolean.TYPE, cls4, cls4, cls4, FontVariationAxis[].class);
            method2 = cls3.getMethod("addFontFromBuffer", ByteBuffer.class, cls4, FontVariationAxis[].class, cls4, cls4);
            method3 = cls3.getMethod("freeze", new Class[0]);
            method4 = cls3.getMethod("abortCreation", new Class[0]);
            method5 = A08(cls3);
            cls2 = cls3;
            cls = cls2;
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder A0S = AnonymousClass008.A0S("Unable to collect necessary methods for class ");
            A0S.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", A0S.toString(), e);
            method5 = cls2;
            method4 = cls2;
            constructor = cls2;
            method = cls2;
            method2 = cls2;
            method3 = cls2;
            cls = cls2;
        }
        this.A00 = cls;
        this.A01 = constructor;
        this.A03 = method;
        this.A04 = method2;
        this.A06 = method3;
        this.A02 = method4;
        this.A05 = method5;
    }

    @Override // X.C05050Mz
    public Typeface A02(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        boolean z;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        boolean z2 = false;
        if (method != null) {
            z2 = true;
        }
        if (!z2) {
            return super.A02(context, resources, i, str, i2);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!A09(context, obj, str, 0, -1, -1, null)) {
            try {
                this.A02.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        try {
            z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return A07(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        throw r0;
     */
    @Override // X.C30031ac, X.C05050Mz
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r19, android.os.CancellationSignal r20, X.C14780ms[] r21, int r22) {
        /*
        // Method dump skipped, instructions count: 259
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452123l.A05(android.content.Context, android.os.CancellationSignal, X.0ms[], int):android.graphics.Typeface");
    }

    @Override // X.C30031ac, X.C05050Mz
    public Typeface A06(Context context, AnonymousClass0NL r15, Resources resources, int i) {
        Object obj;
        boolean z;
        Method method = this.A03;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        boolean z2 = false;
        if (method != null) {
            z2 = true;
        }
        if (!z2) {
            return super.A06(context, r15, resources, i);
        }
        try {
            obj = this.A01.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        AnonymousClass0NG[] r3 = r15.A00;
        for (AnonymousClass0NG r0 : r3) {
            if (!A09(context, obj, r0.A05, r0.A01, r0.A02, r0.A04 ? 1 : 0, FontVariationAxis.fromFontVariationSettings(r0.A03))) {
                try {
                    this.A02.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        try {
            z = ((Boolean) this.A06.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return A07(obj);
    }

    public Typeface A07(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A00, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A05.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method A08(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean A09(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.A03.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
