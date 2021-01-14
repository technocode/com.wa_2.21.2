package X;

import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

/* renamed from: X.3Yt  reason: invalid class name and case insensitive filesystem */
public class C73803Yt extends C30271b3 {
    public final /* synthetic */ AnonymousClass1VM A00;
    public final /* synthetic */ AnonymousClass3EC A01;
    public final /* synthetic */ AnonymousClass3EL A02;
    public final /* synthetic */ IndiaUpiMandatePaymentActivity A03;
    public final /* synthetic */ C63332wF A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public C73803Yt(C63332wF r1, IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity, String str, AnonymousClass1VM r4, AnonymousClass3EL r5, AnonymousClass3EC r6, boolean z, String str2) {
        this.A04 = r1;
        this.A03 = indiaUpiMandatePaymentActivity;
        this.A06 = str;
        this.A00 = r4;
        this.A02 = r5;
        this.A01 = r6;
        this.A07 = z;
        this.A05 = str2;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass3I7.class)) {
            IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = this.A03;
            C63332wF r0 = this.A04;
            return new AnonymousClass3I7(indiaUpiMandatePaymentActivity, r0.A01, r0.A0W, r0.A0D, r0.A0A, r0.A0O, r0.A0C, r0.A0K, this.A06, this.A00, this.A02, this.A01, this.A07, this.A05);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
