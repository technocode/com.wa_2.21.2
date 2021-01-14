package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.3Xv  reason: invalid class name and case insensitive filesystem */
public class C73563Xv extends AbstractC68463Dh {
    public final /* synthetic */ AbstractC61542tL A00;
    public final /* synthetic */ AbstractC61552tM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73563Xv(AbstractC61552tM r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5, AbstractC61542tL r6) {
        super(context, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r6;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r2) {
        this.A00.AFb(r2);
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r2) {
        this.A00.AFb(r2);
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r6) {
        try {
            AnonymousClass0M5 A0E = r6.A0E("account");
            C61072sS A002 = C61072sS.A00(A0E);
            if (A002 != null) {
                int i = A002.code;
                if (i == 1441) {
                    this.A01.A0H.A03(A002.nextAttemptTs);
                } else if (i == 1448) {
                    AbstractC61552tM r0 = this.A01;
                    r0.A0E.A04(r0.A0P, "PIN", A002);
                }
                this.A00.AFb(A002);
                return;
            }
            AnonymousClass0M5 A0D = A0E.A0D("transaction");
            if (A0D != null) {
                String A0F = A0D.A0F("id");
                if (!TextUtils.isEmpty(A0F)) {
                    this.A00.AJc(A0F);
                    return;
                }
            }
            this.A00.AFb(new C61072sS(500));
        } catch (AnonymousClass1XC e) {
            C018809u r2 = this.A01.A0F;
            StringBuilder sb = new StringBuilder("sendPrecheckWithSignature/onResponseSuccess/corrupt stream exception: ");
            sb.append(e);
            r2.A04(sb.toString());
            this.A00.AFb(new C61072sS(500));
        }
    }
}
