package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0Mz  reason: invalid class name and case insensitive filesystem */
public class C05050Mz {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public static long A00(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    public static Object A01(Object[] objArr, int i, AbstractC14700mj r12) {
        int i2 = 700;
        if ((i & 1) == 0) {
            i2 = 400;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            z = true;
        }
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int abs = Math.abs(r12.A9t(obj2) - i2) << 1;
            int i4 = 1;
            if (r12.ABH(obj2) == z) {
                i4 = 0;
            }
            int i5 = abs + i4;
            if (obj == null || i3 > i5) {
                obj = obj2;
                i3 = i5;
            }
        }
        return obj;
    }

    public Typeface A02(Context context, Resources resources, int i, String str, int i2) {
        File A0o = AnonymousClass0N2.A0o(context);
        if (A0o == null) {
            return null;
        }
        try {
            if (!AnonymousClass0N2.A1j(A0o, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A0o.getPath());
            A0o.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A0o.delete();
        }
    }

    public Typeface A03(Context context, InputStream inputStream) {
        File A0o = AnonymousClass0N2.A0o(context);
        if (A0o == null) {
            return null;
        }
        try {
            if (!AnonymousClass0N2.A1k(A0o, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(A0o.getPath());
            A0o.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A0o.delete();
        }
    }

    public C14780ms A04(C14780ms[] r2, int i) {
        return (C14780ms) A01(r2, i, new C30061af());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024 A[SYNTHETIC, Splitter:B:17:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002b A[SYNTHETIC, Splitter:B:25:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface A05(android.content.Context r4, android.os.CancellationSignal r5, X.C14780ms[] r6, int r7) {
        /*
            r3 = this;
            int r1 = r6.length
            r2 = 0
            r0 = 1
            if (r1 >= r0) goto L_0x0006
            return r2
        L_0x0006:
            X.0ms r0 = r3.A04(r6, r7)
            android.content.ContentResolver r1 = r4.getContentResolver()     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.net.Uri r0 = r0.A03     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.InputStream r1 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            android.graphics.Typeface r0 = r3.A03(r4, r1)     // Catch:{ IOException -> 0x0029, all -> 0x001e }
            if (r1 == 0) goto L_0x001d
            r1.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            return r0
        L_0x001e:
            r0 = move-exception
            r2 = r1
            goto L_0x0022
        L_0x0021:
            r0 = move-exception
        L_0x0022:
            if (r2 == 0) goto L_0x0027
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            throw r0
        L_0x0028:
            r1 = r2
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05050Mz.A05(android.content.Context, android.os.CancellationSignal, X.0ms[], int):android.graphics.Typeface");
    }

    public Typeface A06(Context context, AnonymousClass0NL r9, Resources resources, int i) {
        AnonymousClass0NG r0 = (AnonymousClass0NG) A01(r9.A00, i, new C30071ag());
        if (r0 == null) {
            return null;
        }
        int i2 = r0.A00;
        Typeface A02 = AnonymousClass0My.A01.A02(context, resources, i2, r0.A05, i);
        if (A02 != null) {
            AnonymousClass0My.A00.A07(AnonymousClass0My.A01(resources, i2, i), A02);
        }
        long A002 = A00(A02);
        if (A002 != 0) {
            this.A00.put(Long.valueOf(A002), r9);
        }
        return A02;
    }
}
