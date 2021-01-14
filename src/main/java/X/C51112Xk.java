package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2Xk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C51112Xk implements AnonymousClass0RN {
    public final /* synthetic */ C51132Xm A00;

    public /* synthetic */ C51112Xk(C51132Xm r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0RN
    public final Object A20(Object obj) {
        C51132Xm r3 = this.A00;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        r3.A00.A08(null);
        if (booleanValue) {
            r3.A04 = false;
            r3.A05 = false;
            r3.A03(false);
            return null;
        }
        r3.A03.A08(Integer.valueOf((int) R.string.linked_device_logout_error_message));
        return null;
    }
}
