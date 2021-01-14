package X;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: X.0mu  reason: invalid class name and case insensitive filesystem */
public final class C14800mu {
    public static Method A00;
    public static Method A01;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 21) {
            try {
                Class<?> cls = Class.forName("libcore.icu.ICU");
                A01 = cls.getMethod("getScript", String.class);
                A00 = cls.getMethod("addLikelySubtags", String.class);
            } catch (Exception e) {
                A01 = null;
                A00 = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                A00 = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    public static String A00(Locale locale) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) A00.invoke(null, locale)).getScript();
            } catch (InvocationTargetException e) {
                Log.w("ICUCompat", e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w("ICUCompat", e2);
                return locale.getScript();
            }
        } else {
            Object obj = locale.toString();
            try {
                Method method = A00;
                if (method != null) {
                    obj = method.invoke(null, obj);
                }
            } catch (IllegalAccessException e3) {
                Log.w("ICUCompat", e3);
            } catch (InvocationTargetException e4) {
                Log.w("ICUCompat", e4);
            }
            if (obj != null) {
                try {
                    Method method2 = A01;
                    if (method2 != null) {
                        return (String) method2.invoke(null, obj);
                    }
                } catch (IllegalAccessException e5) {
                    Log.w("ICUCompat", e5);
                    return null;
                } catch (InvocationTargetException e6) {
                    Log.w("ICUCompat", e6);
                }
            }
            return null;
        }
    }
}
