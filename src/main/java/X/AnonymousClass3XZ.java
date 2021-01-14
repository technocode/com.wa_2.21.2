package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3XZ  reason: invalid class name */
public class AnonymousClass3XZ extends AbstractC68463Dh {
    public final /* synthetic */ AbstractC61272su A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XZ(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4, AbstractC61272su r5) {
        super(context, r2, r3, r4);
        this.A00 = r5;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilGetVerificationMethods onRequestError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.AJf(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r3) {
        StringBuilder sb = new StringBuilder("PAY: BrazilGetVerificationMethods onResponseError: ");
        sb.append(r3);
        Log.i(sb.toString());
        this.A00.AJf(null, r3);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r7) {
        int length;
        AnonymousClass0M5 A0D = r7.A0D("account");
        if (A0D != null) {
            ArrayList arrayList = new ArrayList();
            AnonymousClass0M5 A0D2 = A0D.A0D("verify-method-list");
            AnonymousClass0M5 A0D3 = A0D.A0D("card");
            if (A0D3 != null) {
                C74723bO r0 = new C74723bO();
                r0.A01(0, A0D3);
                C43761yu r1 = (C43761yu) r0.A03();
                if (r0.A0X) {
                    this.A00.ADv(r1);
                    return;
                }
            }
            if (A0D2 != null) {
                AnonymousClass0M5[] r02 = A0D2.A03;
                if (r02 != null && (length = r02.length) > 0) {
                    for (int i = 0; i < length; i++) {
                        arrayList.add(new C61672tY(A0D2.A0C(i)));
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.A00.AJf(arrayList, null);
                } else {
                    this.A00.AJf(null, new C61072sS());
                }
            }
        }
    }
}
