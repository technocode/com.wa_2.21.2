package X;

import android.os.Bundle;
import com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity;

/* renamed from: X.3Yp  reason: invalid class name and case insensitive filesystem */
public class C73763Yp extends C30271b3 {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ BrazilPaymentTransactionDetailActivity A01;
    public final /* synthetic */ C63272w9 A02;

    public C73763Yp(C63272w9 r1, BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity, Bundle bundle) {
        this.A02 = r1;
        this.A01 = brazilPaymentTransactionDetailActivity;
        this.A00 = bundle;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(C73733Ym.class)) {
            BrazilPaymentTransactionDetailActivity brazilPaymentTransactionDetailActivity = this.A01;
            C63272w9 r1 = this.A02;
            return new C73733Ym(brazilPaymentTransactionDetailActivity, r1.A06, r1.A01, r1.A02, r1.A07, r1.A0R, r1.A0B, r1.A0Q, r1.A03, r1.A05, r1.A08, r1.A0M, r1.A00, r1.A09, r1.A0O, r1.A0E, r1.A0K, r1.A0A, r1.A0N, r1.A0I, r1.A0D, this.A00);
        }
        throw new IllegalArgumentException("View model type mismatch");
    }
}
