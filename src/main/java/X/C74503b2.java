package X;

import android.content.Context;
import android.os.Bundle;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3b2  reason: invalid class name and case insensitive filesystem */
public class C74503b2 extends C73483Xm {
    public final /* synthetic */ AnonymousClass3E7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74503b2(AnonymousClass3E7 r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13) {
        super(context, r10, r11, r12, r13, "upi-get-banks");
        this.A00 = r8;
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A01(C61072sS r2) {
        super.A01(r2);
        AbstractC61362t3 r0 = this.A00.A00;
        if (r0 != null) {
            ((IndiaUpiPaymentBankSetupActivity) r0).A0f(r2);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A02(C61072sS r2) {
        super.A02(r2);
        AbstractC61362t3 r0 = this.A00.A00;
        if (r0 != null) {
            ((IndiaUpiPaymentBankSetupActivity) r0).A0f(r2);
        }
    }

    @Override // X.AbstractC68463Dh, X.C73483Xm
    public void A03(AnonymousClass0M5 r10) {
        super.A03(r10);
        AnonymousClass3E7 r3 = this.A00;
        AbstractC61142sZ A7y = r3.A07.A03().A7y();
        if (A7y != null) {
            ArrayList ALu = A7y.ALu(r10);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ALu.iterator();
            AnonymousClass3DY r4 = null;
            while (it.hasNext()) {
                AnonymousClass0RL r7 = (AnonymousClass0RL) it.next();
                if (r7 instanceof AnonymousClass3DY) {
                    AnonymousClass3DY r72 = (AnonymousClass3DY) r7;
                    if (r72.A03() != null) {
                        arrayList2.add(r72);
                    } else {
                        Bundle bundle = r72.A00;
                        if (!(bundle == null || bundle.getStringArrayList("pspRouting") == null)) {
                            r4 = r72;
                        }
                    }
                } else if (r7 instanceof C74463ay) {
                    arrayList.add(r7);
                }
            }
            if (AnonymousClass3E7.A00(r3.A05, arrayList, arrayList2, r4)) {
                r3.A04.A09(arrayList, arrayList2, r4);
                AbstractC61362t3 r0 = r3.A00;
                if (r0 != null) {
                    ((IndiaUpiPaymentBankSetupActivity) r0).A0h(arrayList, arrayList2, r4, null);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("PAY: received invalid data from get-banks: banks: ");
            sb.append(arrayList);
            sb.append(" psps: ");
            sb.append(arrayList2);
            sb.append(" pspRouting: ");
            sb.append(r4);
            sb.append(" , try get bank list directly.");
            Log.w(sb.toString());
            AbstractC61362t3 r1 = r3.A00;
            if (r1 != null) {
                ((IndiaUpiPaymentBankSetupActivity) r1).A0h(null, null, null, new C61072sS());
                return;
            }
            return;
        }
        throw null;
    }
}
