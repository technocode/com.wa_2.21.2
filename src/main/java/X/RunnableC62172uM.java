package X;

import com.whatsapp.payments.ui.BrazilPaymentActivity;

/* renamed from: X.2uM  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC62172uM extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AbstractC05890Qx A00;
    public final /* synthetic */ C05900Qy A01;
    public final /* synthetic */ AnonymousClass1VM A02;
    public final /* synthetic */ AnonymousClass3Y3 A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ C05490Ot A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ RunnableC62172uM(BrazilPaymentActivity brazilPaymentActivity, C05490Ot r2, C05900Qy r3, AbstractC05890Qx r4, AnonymousClass1VM r5, AnonymousClass3Y3 r6, String str, boolean z) {
        this.A04 = brazilPaymentActivity;
        this.A05 = r2;
        this.A01 = r3;
        this.A00 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = str;
        this.A07 = z;
    }

    public final void run() {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        ((AbstractActivityC34761jB) brazilPaymentActivity).A0J.A07(this.A05, this.A01, this.A00, this.A02, this.A03, ((AbstractActivityC34761jB) brazilPaymentActivity).A08, this.A06, this.A07);
    }
}
