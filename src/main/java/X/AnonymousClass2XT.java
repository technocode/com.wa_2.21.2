package X;

import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.2XT  reason: invalid class name */
public class AnonymousClass2XT implements AnonymousClass09O {
    public C05350Oe A00;
    public final AnonymousClass2bW A01;
    public final AnonymousClass09H A02;

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
    }

    public AnonymousClass2XT(AnonymousClass09H r1, AnonymousClass2bW r2) {
        this.A02 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r7) {
        int A0E = C002001d.A0E(r7);
        AnonymousClass008.A0t("deviceRemoveRequest/onError :", A0E);
        AnonymousClass2bW r0 = this.A01;
        C05350Oe r3 = this.A00;
        Set<AnonymousClass0By> set = ((AnonymousClass1YF) r0.A00).A00;
        synchronized (set) {
            for (AnonymousClass0By r02 : set) {
                r02.AF0(r3, A0E);
            }
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r8) {
        Log.d("deviceRemoveRequest/onSuccess");
        AnonymousClass2bW r0 = this.A01;
        C05350Oe r5 = this.A00;
        C02430Bz r4 = r0.A00;
        r4.A0G.execute(new RunnableEBaseShape0S0210000_I0(r4, r5, true, 6));
    }
}
