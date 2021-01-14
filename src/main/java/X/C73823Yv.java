package X;

import com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity;

/* renamed from: X.3Yv  reason: invalid class name and case insensitive filesystem */
public class C73823Yv extends C30271b3 {
    public final /* synthetic */ C43751yt A00;
    public final /* synthetic */ AnonymousClass3EI A01;
    public final /* synthetic */ AnonymousClass3EL A02;
    public final /* synthetic */ IndiaUpiCheckBalanceActivity A03;
    public final /* synthetic */ C63332wF A04;
    public final /* synthetic */ String A05;

    public C73823Yv(C63332wF r1, IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity, AnonymousClass3EL r3, AnonymousClass3EI r4, C43751yt r5, String str) {
        this.A04 = r1;
        this.A03 = indiaUpiCheckBalanceActivity;
        this.A02 = r3;
        this.A01 = r4;
        this.A00 = r5;
        this.A05 = str;
    }

    @Override // X.C30271b3, X.AnonymousClass0O4
    public AnonymousClass0SD A3B(Class cls) {
        if (cls.isAssignableFrom(AnonymousClass3I5.class)) {
            return new AnonymousClass3I5(this.A03, this.A04.A0A, this.A02, this.A01, this.A00, this.A05);
        }
        throw new IllegalArgumentException("Invalid viewModel");
    }
}
