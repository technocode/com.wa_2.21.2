package X;

import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;

/* renamed from: X.3Yo  reason: invalid class name and case insensitive filesystem */
public class C73753Yo extends C30271b3 {
    public final /* synthetic */ BrazilMerchantDetailsListActivity A00;
    public final /* synthetic */ C63272w9 A01;

    public C73753Yo(C63272w9 r1, BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity) {
        this.A01 = r1;
        this.A00 = brazilMerchantDetailsListActivity;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(C73743Yn.class)) {
            BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = this.A00;
            C63272w9 r0 = this.A01;
            return new C73743Yn(brazilMerchantDetailsListActivity, r0.A06, r0.A01, r0.A02, r0.A07, r0.A0R, r0.A0B, r0.A08, r0.A0P, r0.A0M, r0.A09, r0.A0C, r0.A0H, r0.A04, r0.A0J, r0.A0A, r0.A0L, r0.A0F, r0.A0G);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
