package X;

import android.os.Build;
import android.os.Trace;
import android.util.Log;

/* renamed from: X.01j  reason: invalid class name and case insensitive filesystem */
public final class C002601j {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 18 && i < 29) {
            try {
                Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                Trace.class.getMethod("isTagEnabled", cls);
                Trace.class.getMethod("asyncTraceBegin", cls, String.class, Integer.TYPE);
                Class cls2 = Long.TYPE;
                Class cls3 = Integer.TYPE;
                Trace.class.getMethod("asyncTraceEnd", cls2, String.class, cls3);
                Trace.class.getMethod("traceCounter", cls2, String.class, cls3);
            } catch (Exception e) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e);
            }
        }
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
