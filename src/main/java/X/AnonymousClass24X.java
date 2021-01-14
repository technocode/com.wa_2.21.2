package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.24X  reason: invalid class name */
public class AnonymousClass24X extends AbstractC31301cy {
    public static final String A00 = AbstractC17610rq.A01("NetworkNotRoamingCtrlr");

    public AnonymousClass24X(Context context, AnonymousClass0t5 r3) {
        super(C17880sQ.A00(context, r3).A02);
    }

    @Override // X.AbstractC31301cy
    public boolean A01(Object obj) {
        C17810sJ r6 = (C17810sJ) obj;
        if (Build.VERSION.SDK_INT < 24) {
            AbstractC17610rq.A00().A02(A00, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !r6.A00;
        } else if (!r6.A00 || !r6.A02) {
            return true;
        } else {
            return false;
        }
    }
}
