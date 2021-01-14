package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: X.1iw  reason: invalid class name and case insensitive filesystem */
public final class C34651iw implements AbstractC235916n {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ String A01;

    public C34651iw(String str, Bundle bundle) {
        this.A01 = str;
        this.A00 = bundle;
    }

    @Override // X.AbstractC235916n
    public final /* synthetic */ Object AS9(IBinder iBinder) {
        AbstractC241319b r1;
        if (iBinder == null) {
            r1 = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.auth.IAuthManagerService");
            if (queryLocalInterface instanceof AbstractC241319b) {
                r1 = (AbstractC241319b) queryLocalInterface;
            } else {
                r1 = new C35621kf(iBinder);
            }
        }
        Bundle ARj = r1.ARj(this.A01, this.A00);
        C235816m.A03(ARj);
        String string = ARj.getString("Error");
        if (ARj.getBoolean("booleanResult")) {
            return null;
        }
        throw new AnonymousClass16O(string);
    }
}
