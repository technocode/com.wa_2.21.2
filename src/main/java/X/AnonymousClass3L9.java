package X;

import com.whatsapp.util.Log;

/* renamed from: X.3L9  reason: invalid class name */
public class AnonymousClass3L9 implements AnonymousClass09O {
    public final AnonymousClass02M A00;
    public final C52102aa A01;
    public final AnonymousClass09H A02;
    public final C64472yF A03 = new C64472yF();

    public AnonymousClass3L9(AnonymousClass02M r2, AnonymousClass09H r3, C52102aa r4) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A00.A0E(new RunnableEBaseShape12S0100000_I1_7(this.A01, 3));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r6) {
        Log.e("GetCTWAContextIQ/response-error");
        AnonymousClass0M5 A0D = r6.A0D("error");
        if (A0D != null) {
            this.A00.A0E(new RunnableEBaseShape1S0101000_I1(this, A0D.A05("code", 0), 18));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    @Override // X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKk(java.lang.String r12, X.AnonymousClass0M5 r13) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3L9.AKk(java.lang.String, X.0M5):void");
    }
}
