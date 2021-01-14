package X;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.36H  reason: invalid class name */
public class AnonymousClass36H {
    public static final Map A00 = new WeakHashMap();
    public static volatile AnonymousClass36H A01;

    public static AnonymousClass36H A00() {
        if (A01 == null) {
            synchronized (AnonymousClass36H.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass36H();
                }
            }
        }
        return A01;
    }

    public synchronized AnonymousClass36G A01(Context context) {
        AnonymousClass36G r0;
        while (context instanceof ContextWrapper) {
            ContextWrapper contextWrapper = (ContextWrapper) context;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            context = contextWrapper.getBaseContext();
        }
        Map map = A00;
        r0 = (AnonymousClass36G) map.get(context);
        if (r0 == null) {
            r0 = new AnonymousClass36G();
            map.put(context, r0);
        }
        return r0;
    }
}
