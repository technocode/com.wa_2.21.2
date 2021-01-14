package X;

import com.whatsapp.payments.ui.IndiaUpiSecureQrCodeDisplayActivity;

/* renamed from: X.3Yu  reason: invalid class name and case insensitive filesystem */
public class C73813Yu extends C30271b3 {
    public final /* synthetic */ IndiaUpiSecureQrCodeDisplayActivity A00;
    public final /* synthetic */ C63332wF A01;

    public C73813Yu(C63332wF r1, IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity) {
        this.A01 = r1;
        this.A00 = indiaUpiSecureQrCodeDisplayActivity;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(C69703Ib.class)) {
            IndiaUpiSecureQrCodeDisplayActivity indiaUpiSecureQrCodeDisplayActivity = this.A00;
            C63332wF r0 = this.A01;
            return new C69703Ib(indiaUpiSecureQrCodeDisplayActivity, r0.A07, r0.A01, r0.A08, r0.A03, r0.A09, r0.A05, r0.A0L, r0.A0M, r0.A0J, r0.A0G);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
