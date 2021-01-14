package X;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.0ob  reason: invalid class name and case insensitive filesystem */
public final class C15750ob {
    public static C15750ob A05;
    public static final Object A06 = new Object();
    public final Context A00;
    public final Handler A01;
    public final ArrayList A02 = new ArrayList();
    public final HashMap A03 = new HashMap();
    public final HashMap A04 = new HashMap();

    public C15750ob(Context context) {
        this.A00 = context;
        this.A01 = new HandlerC15720oY(this, context.getMainLooper());
    }

    public static C15750ob A00(Context context) {
        C15750ob r1;
        synchronized (A06) {
            r1 = A05;
            if (r1 == null) {
                r1 = new C15750ob(context.getApplicationContext());
                A05 = r1;
            }
        }
        return r1;
    }
}
