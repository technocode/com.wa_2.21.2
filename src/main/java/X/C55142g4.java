package X;

import com.whatsapp.util.Log;

/* renamed from: X.2g4  reason: invalid class name and case insensitive filesystem */
public class C55142g4 implements AnonymousClass09O {
    public final AnonymousClass02M A00;
    public final C55152g5 A01;
    public final AnonymousClass09H A02;

    public C55142g4(AnonymousClass02M r1, AnonymousClass09H r2, C55152g5 r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A00.A0E(new RunnableEBaseShape10S0100000_I1_5(this.A01, 30));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r6) {
        StringBuilder sb = new StringBuilder("ChatSupportTicketProtocolHelper/onError: error response:");
        sb.append(r6);
        Log.e(sb.toString());
        AnonymousClass0M5 A0D = r6.A0D("error");
        if (A0D != null) {
            this.A00.A0E(new RunnableEBaseShape1S0101000_I1(this, A0D.A05("code", 0), 17));
        }
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r6) {
        this.A00.A0E(new RunnableEBaseShape10S0100000_I1_5(this.A01, 29));
    }
}
