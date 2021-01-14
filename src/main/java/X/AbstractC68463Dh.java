package X;

import android.content.Context;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Dh  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC68463Dh implements AnonymousClass09O {
    public final Context A00;
    public final AnonymousClass02M A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass0GP A03;

    public abstract void A01(C61072sS v);

    public abstract void A02(C61072sS v);

    public abstract void A03(AnonymousClass0M5 v);

    public AbstractC68463Dh(Context context, AnonymousClass02M r2, AnonymousClass04j r3, AnonymousClass0GP r4) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public static List A00(AnonymousClass0M5 r6) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0M5 r3 : r6.A0H("error")) {
            if (r3 != null) {
                String A0G = r3.A0G("code", null);
                String A0G2 = r3.A0G("text", null);
                if (A0G != null) {
                    int parseInt = Integer.parseInt(A0G);
                    C61072sS r1 = new C61072sS();
                    r1.code = parseInt;
                    r1.text = A0G2;
                    arrayList.add(r1);
                    if (parseInt == 454) {
                        r1.stepUpNode = r3.A0D("step_up");
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        C61072sS r3 = new C61072sS();
        int i = 6;
        if (AnonymousClass04j.A02(this.A00)) {
            i = -2;
        }
        r3.code = i;
        this.A01.A0E(new RunnableEBaseShape8S0200000_I1_3(this, r3, 35));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r7) {
        Iterator it = ((AbstractCollection) A00(r7)).iterator();
        while (it.hasNext()) {
            C61072sS r3 = (C61072sS) it.next();
            AnonymousClass0GP r0 = this.A03;
            int i = r3.code;
            AnonymousClass0GQ r2 = r0.A00;
            if (r2 != null && (i == 404 || i == 440 || i == 449)) {
                r2.A02(true, false);
            }
            this.A01.A0E(new RunnableEBaseShape8S0200000_I1_3(this, r3, 34));
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r5) {
        this.A01.A0E(new RunnableEBaseShape8S0200000_I1_3(this, r5, 36));
    }
}
