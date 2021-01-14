package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.3XY  reason: invalid class name */
public class AnonymousClass3XY extends AbstractC68463Dh {
    public final /* synthetic */ C61262st A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3XY(C61262st r1, Context context, AnonymousClass02M r3, AnonymousClass04j r4, AnonymousClass0GP r5) {
        super(context, r3, r4, r5);
        this.A00 = r1;
    }

    @Override // X.AbstractC68463Dh
    public void A01(C61072sS r4) {
        this.A00.A05.AGU(null, new C61072sS());
    }

    @Override // X.AbstractC68463Dh
    public void A02(C61072sS r4) {
        this.A00.A05.AGU(null, new C61072sS());
    }

    @Override // X.AbstractC68463Dh
    public void A03(AnonymousClass0M5 r7) {
        AnonymousClass0M5 A0D = r7.A0D("account");
        if (A0D != null) {
            C61072sS A002 = C61072sS.A00(A0D);
            if (A002 != null) {
                this.A00.A05.AGU(null, A002);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass0M5 r2 : A0D.A0H("bank")) {
                C74713bN r1 = new C74713bN();
                r1.A01(0, r2);
                arrayList.add(r1);
            }
            this.A00.A05.AGU(arrayList, null);
            return;
        }
        this.A00.A05.AGU(null, new C61072sS());
    }
}
