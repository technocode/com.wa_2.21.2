package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.3bF  reason: invalid class name and case insensitive filesystem */
public class C74633bF extends C73483Xm {
    public final /* synthetic */ C69673Hy A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74633bF(Context context, AnonymousClass02M r9, AnonymousClass04j r10, AnonymousClass0GP r11, C61082sT r12, C69673Hy r13) {
        super(context, r9, r10, r11, r12, "upi-check-balance");
        this.A00 = r13;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        C69673Hy r1 = this.A00;
        if (r1 != null) {
            r1.A00(null, null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        C69673Hy r1 = this.A00;
        if (r1 != null) {
            r1.A00(null, null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r6) {
        Bundle bundle;
        Bundle bundle2;
        String str;
        String str2;
        super.A03(r6);
        AnonymousClass0M5 A0D = r6.A0D("account");
        if (A0D == null) {
            Log.e("PAY: IndiaUpiPaymentMethodAction sendCheckPin: empty account node");
            this.A00.A00(null, null, new C61072sS());
            return;
        }
        AnonymousClass3DY r4 = new AnonymousClass3DY();
        r4.A01(6, A0D);
        Bundle bundle3 = r4.A00;
        if ((bundle3 != null && bundle3.getString("updatedVpaFor") != null) || (bundle = r4.A00) == null || !"1".equals(bundle.getString("valid")) || (bundle2 = r4.A00) == null || bundle2.getString("balance") == null) {
            this.A00.A00(null, null, new C61072sS());
            return;
        }
        Bundle bundle4 = r4.A00;
        if (bundle4 != null) {
            str = bundle4.getString("balance");
        } else {
            str = null;
        }
        C05900Qy A002 = C05900Qy.A00(str, C05880Qw.A01.A5z());
        Bundle bundle5 = r4.A00;
        if (bundle5 != null) {
            str2 = bundle5.getString("usableBalance");
        } else {
            str2 = null;
        }
        this.A00.A00(A002, C05900Qy.A00(str2, C05880Qw.A01.A5z()), null);
    }
}
