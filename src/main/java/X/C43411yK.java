package X;

import com.whatsapp.util.Log;

/* renamed from: X.1yK  reason: invalid class name and case insensitive filesystem */
public class C43411yK implements AbstractC02140Au {
    public static volatile C43411yK A04;
    public final AnonymousClass01I A00;
    public final AnonymousClass0HN A01;
    public final C014708f A02;
    public final AnonymousClass00T A03;

    public C43411yK(AnonymousClass01I r1, AnonymousClass00T r2, AnonymousClass0HN r3, C014708f r4) {
        this.A00 = r1;
        this.A03 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    @Override // X.AbstractC02140Au
    public void AGf() {
        Log.d("contactsynchourlycron/onHourlyCron");
        AnonymousClass01I r0 = this.A00;
        r0.A04();
        if (r0.A00 != null && this.A02.A02()) {
            this.A03.ANF(new RunnableEBaseShape8S0100000_I1_3(this.A01, 44));
        }
    }
}
