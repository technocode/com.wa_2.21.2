package X;

import com.google.android.search.verification.client.R;

/* renamed from: X.2Xd  reason: invalid class name and case insensitive filesystem */
public class C51052Xd {
    public final /* synthetic */ AbstractActivityC60812rK A00;

    public C51052Xd(AbstractActivityC60812rK r1) {
        this.A00 = r1;
    }

    public void A00(String str) {
        AbstractActivityC60812rK r1 = this.A00;
        if (!r1.A0Q(R.string.connectivity_check_connection)) {
            AbstractActivityC60812rK.A05(r1);
            r1.A08.ANF(new RunnableEBaseShape1S1100000_I1(this, str, 19));
        }
    }

    public void A01(String str) {
        AbstractActivityC60812rK r3 = this.A00;
        if (!r3.A0Q(R.string.connectivity_check_connection)) {
            if (r3 != null) {
                AnonymousClass008.A18("websessions/clear bid=", str);
                boolean A01 = r3.A09.A01().A01(str);
                r3.A0B.A0H(true, str);
                if (A01) {
                    r3.A07.A0I(true);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
