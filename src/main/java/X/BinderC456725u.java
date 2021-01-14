package X;

import android.content.Context;
import android.os.Binder;
import android.os.IInterface;

/* renamed from: X.25u  reason: invalid class name and case insensitive filesystem */
public final class BinderC456725u extends AnonymousClass19P implements IInterface {
    public final Context A00;

    public BinderC456725u(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.A00 = context;
    }

    public final void A00() {
        if (!AnonymousClass0LV.A03(this.A00, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append("Calling UID ");
            sb.append(callingUid);
            sb.append(" is not Google Play services.");
            throw new SecurityException(sb.toString());
        }
    }
}
