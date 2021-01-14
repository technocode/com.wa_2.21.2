package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3b9  reason: invalid class name and case insensitive filesystem */
public class C74573b9 extends C73483Xm {
    public final /* synthetic */ C61412t8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74573b9(C61412t8 r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13) {
        super(context, r10, r11, r12, r13, "upi-bind-device");
        this.A00 = r8;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        A04(r3);
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ");
        sb.append(r3);
        Log.i(sb.toString());
        A04(r3);
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r6) {
        super.A03(r6);
        C61412t8 r4 = this.A00;
        r4.A0A.A0F(r4.A04, r4.A05, r4.A0E.A03());
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction processSuccess: device binding done. stored psp: ");
        sb.append(r4.A04);
        sb.append(" seqNumPrefix: ");
        AnonymousClass008.A1U(sb, r4.A05);
        AbstractC61392t6 r1 = r4.A02;
        if (r1 != null) {
            ((IndiaUpiDeviceBindActivity) r1).A0i(null);
        }
    }

    public final void A04(C61072sS r6) {
        C61412t8 r4 = this.A00;
        AbstractC61392t6 r2 = r4.A02;
        if (r2 == null) {
            return;
        }
        if (r6.code == 11453) {
            r4.A0A.A0F(r4.A04, r4.A05, r4.A0E.A03());
            StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction processError: device binding already done. stored psp: ");
            sb.append(r4.A04);
            sb.append(" seqNumPrefix: ");
            AnonymousClass008.A1U(sb, r4.A05);
            ((IndiaUpiDeviceBindActivity) r4.A02).A0i(r6);
            return;
        }
        ((IndiaUpiDeviceBindActivity) r2).A0i(r6);
    }
}
