package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.0My  reason: invalid class name */
public class AnonymousClass0My {
    public static final AnonymousClass08V A00 = new AnonymousClass08V(16);
    public static final C05050Mz A01;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            A01 = new C30051ae();
        } else if (i >= 28) {
            A01 = new AnonymousClass28P();
        } else if (i >= 26) {
            A01 = new C452123l();
        } else {
            if (i >= 24) {
                Method method = C30041ad.A02;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    A01 = new C30041ad();
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                A01 = new C30031ac();
            } else {
                A01 = new C05050Mz();
            }
        }
    }

    public static Typeface A00(Context context, Typeface typeface, int i) {
        AnonymousClass0NL r1;
        Typeface A06;
        if (context != null) {
            if (Build.VERSION.SDK_INT < 21) {
                C05050Mz r5 = A01;
                long A002 = C05050Mz.A00(typeface);
                if (!(A002 == 0 || (r1 = (AnonymousClass0NL) r5.A00.get(Long.valueOf(A002))) == null || (A06 = r5.A06(context, r1, context.getResources(), i)) == null)) {
                    return A06;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static String A01(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }
}
