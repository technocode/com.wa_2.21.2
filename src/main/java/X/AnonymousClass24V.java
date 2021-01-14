package X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.24V  reason: invalid class name */
public class AnonymousClass24V extends AbstractC31301cy {
    public AnonymousClass24V(Context context, AnonymousClass0t5 r3) {
        super(C17880sQ.A00(context, r3).A02);
    }

    @Override // X.AbstractC31301cy
    public boolean A01(Object obj) {
        C17810sJ r5 = (C17810sJ) obj;
        int i = Build.VERSION.SDK_INT;
        boolean z = r5.A00;
        if (i < 26) {
            return !z;
        }
        if (!z || !r5.A03) {
            return true;
        }
        return false;
    }
}
