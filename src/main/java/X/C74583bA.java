package X;

import android.content.Context;
import com.whatsapp.payments.ui.IndiaUpiDeviceBindActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3bA  reason: invalid class name and case insensitive filesystem */
public class C74583bA extends C73483Xm {
    public final /* synthetic */ C61412t8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74583bA(C61412t8 r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13) {
        super(context, r10, r11, r12, r13, "upi-get-accounts");
        this.A00 = r8;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r3) {
        super.A01(r3);
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        AbstractC61392t6 r1 = this.A00.A02;
        if (r1 != null) {
            ((IndiaUpiDeviceBindActivity) r1).A0k(null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r3) {
        super.A02(r3);
        StringBuilder sb = new StringBuilder("PAY: IndiaUpiGetBankAccountsAction: sendGetBankAccounts: onResponseError: ");
        sb.append(r3);
        Log.i(sb.toString());
        AbstractC61392t6 r1 = this.A00.A02;
        if (r1 != null) {
            ((IndiaUpiDeviceBindActivity) r1).A0k(null, r3);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r9) {
        AnonymousClass0M5[] r5;
        super.A03(r9);
        C61412t8 r7 = this.A00;
        if (r7.A02 != null) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass0M5 A0D = r9.A0D("account");
            if (!(A0D == null || (r5 = A0D.A03) == null)) {
                for (AnonymousClass0M5 r2 : r5) {
                    if (r2 != null && "upi".equals(r2.A00)) {
                        C74463ay r1 = new C74463ay();
                        r1.A01(3, r2);
                        arrayList.add(r1);
                    }
                }
            }
            ((IndiaUpiDeviceBindActivity) r7.A02).A0k(arrayList, null);
        }
    }
}
