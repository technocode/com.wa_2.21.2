package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;

/* renamed from: X.3b7  reason: invalid class name and case insensitive filesystem */
public class C74553b7 extends C73483Xm {
    public final /* synthetic */ AbstractC61372t4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74553b7(Context context, AnonymousClass02M r9, AnonymousClass04j r10, AnonymousClass0GP r11, C61082sT r12, AbstractC61372t4 r13) {
        super(context, r9, r10, r11, r12, "upi-collect-from-vpa");
        this.A00 = r13;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        AbstractC61372t4 r1 = this.A00;
        if (r1 != null) {
            ((IndiaUpiPaymentActivity) r1).A0w(r3, true);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        AbstractC61372t4 r1 = this.A00;
        if (r1 != null) {
            ((IndiaUpiPaymentActivity) r1).A0w(r3, true);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r4) {
        super.A03(r4);
        AbstractC61372t4 r2 = this.A00;
        if (r2 != null) {
            ((IndiaUpiPaymentActivity) r2).A0w(null, true);
        }
    }
}
