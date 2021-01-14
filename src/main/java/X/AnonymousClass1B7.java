package X;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;

/* renamed from: X.1B7  reason: invalid class name */
public final class AnonymousClass1B7 {
    public static boolean A00;

    public static synchronized int A00(Context context) {
        synchronized (AnonymousClass1B7.class) {
            C001801b.A1R(context, "Context is null");
            if (A00) {
                return 0;
            }
            try {
                AnonymousClass1BM A01 = AnonymousClass1BK.A01(context);
                try {
                    ICameraUpdateFactoryDelegate ASF = A01.ASF();
                    C001801b.A1Q(ASF);
                    C008805h.A02 = ASF;
                    AnonymousClass06E ASI = A01.ASI();
                    if (C008805h.A01 == null) {
                        C001801b.A1Q(ASI);
                        C008805h.A01 = ASI;
                    }
                    A00 = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new AnonymousClass06B(e);
                }
            } catch (AnonymousClass16s e2) {
                return e2.errorCode;
            }
        }
    }
}
