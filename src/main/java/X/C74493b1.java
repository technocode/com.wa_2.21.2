package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.payments.ui.IndiaUpiPaymentBankSetupActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3b1  reason: invalid class name and case insensitive filesystem */
public class C74493b1 extends C73483Xm {
    public final /* synthetic */ AnonymousClass3E7 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74493b1(AnonymousClass3E7 r8, Context context, AnonymousClass02M r10, AnonymousClass04j r11, AnonymousClass0GP r12, C61082sT r13) {
        super(context, r10, r11, r12, r13, "upi-batch");
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
    public void A03(AnonymousClass0M5 r12) {
        super.A03(r12);
        AnonymousClass3E7 r2 = this.A00;
        AbstractC61142sZ A7y = r2.A07.A03().A7y();
        if (A7y != null) {
            ArrayList ALu = A7y.ALu(r12);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            AnonymousClass3DY r3 = null;
            for (int i = 0; i < ALu.size(); i++) {
                AnonymousClass0RL r10 = (AnonymousClass0RL) ALu.get(i);
                if (r10 instanceof AnonymousClass3DY) {
                    AnonymousClass3DY r102 = (AnonymousClass3DY) r10;
                    Bundle bundle = r102.A00;
                    if (bundle != null && bundle.getString("keys") != null) {
                        ((C61432tA) r2).A00.A04("upi-list-keys");
                        Bundle bundle2 = ((AnonymousClass3DY) ALu.get(i)).A00;
                        String string = bundle2 != null ? bundle2.getString("keys") : null;
                        if (!TextUtils.isEmpty(string)) {
                            r2.A05.A0D(string);
                        }
                    } else if (r102.A03() != null) {
                        arrayList2.add(r102);
                    } else {
                        Bundle bundle3 = r102.A00;
                        if (!(bundle3 == null || bundle3.getStringArrayList("pspRouting") == null)) {
                            r3 = r102;
                        }
                    }
                } else if (r10 instanceof C74463ay) {
                    arrayList.add(r10);
                }
            }
            if (AnonymousClass3E7.A00(r2.A05, arrayList, arrayList2, r3)) {
                r2.A04.A09(arrayList, arrayList2, r3);
                ((C61432tA) r2).A00.A04("upi-get-banks");
                AbstractC61362t3 r0 = r2.A00;
                if (r0 != null) {
                    ((IndiaUpiPaymentBankSetupActivity) r0).A0h(arrayList, arrayList2, r3, null);
                }
            } else {
                StringBuilder sb = new StringBuilder("PAY: received invalid objects from batch: banks: ");
                sb.append(arrayList);
                sb.append(" psps: ");
                sb.append(arrayList2);
                sb.append(" pspRouting: ");
                sb.append(r3);
                sb.append(" , try get bank list directly.");
                Log.w(sb.toString());
                r2.A01();
            }
            C61082sT r32 = ((C61432tA) r2).A00;
            ArrayList arrayList3 = r32.A04;
            if (!arrayList3.contains("upi-list-keys")) {
                r32.A05("upi-list-keys", 500);
            }
            if (!arrayList3.contains("upi-get-banks")) {
                r32.A05("upi-get-banks", 500);
                return;
            }
            return;
        }
        throw null;
    }
}
