package X;

import com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity;

/* renamed from: X.3Yr  reason: invalid class name and case insensitive filesystem */
public class C73783Yr extends C30271b3 {
    public final /* synthetic */ IndiaUpiMandateHistoryActivity A00;
    public final /* synthetic */ C63332wF A01;

    public C73783Yr(C63332wF r1, IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity) {
        this.A01 = r1;
        this.A00 = indiaUpiMandateHistoryActivity;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass3I6.class)) {
            IndiaUpiMandateHistoryActivity indiaUpiMandateHistoryActivity = this.A00;
            C63332wF r0 = this.A01;
            return new AnonymousClass3I6(indiaUpiMandateHistoryActivity, r0.A01, r0.A0W, r0.A0A, r0.A0C);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
