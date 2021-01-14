package X;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.10z  reason: invalid class name and case insensitive filesystem */
public class C223210z {
    public static C223110y A00;
    public static final Map A01 = new HashMap(4);
    public static final WeakHashMap A02 = new WeakHashMap();

    public static C14840my A00(Context context, Object obj) {
        Map map = A01;
        Map map2 = (Map) map.get(context);
        if (map2 == null) {
            Context context2 = context;
            while ((context2 instanceof ContextWrapper) && !(context2 instanceof Activity) && !(context2 instanceof Application) && !(context2 instanceof Service)) {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (A02.containsKey(context2)) {
                return null;
            }
            if (A00 == null) {
                A00 = new C223110y();
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(A00);
            }
            map2 = new HashMap();
            map.put(context, map2);
        }
        C14840my r1 = (C14840my) map2.get(obj);
        if (r1 != null) {
            return r1;
        }
        C14840my r12 = new C14840my(3);
        map2.put(obj, r12);
        return r12;
    }
}
