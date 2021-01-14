package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.1bf  reason: invalid class name and case insensitive filesystem */
public class C30631bf extends AnonymousClass0Q0 {
    public final C07800Zo A00;

    public C30631bf(C07800Zo r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0Q0
    public boolean A02(View view, int i, Bundle bundle) {
        if (super.A02(view, i, bundle)) {
            return true;
        }
        C07800Zo r1 = this.A00;
        return (r1.A03() || r1.A01.A0S != null) ? false : false;
    }
}
