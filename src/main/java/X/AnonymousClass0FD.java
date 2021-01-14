package X;

import com.whatsapp.util.Log;

/* renamed from: X.0FD  reason: invalid class name */
public class AnonymousClass0FD implements AnonymousClass09O {
    public AnonymousClass2FI A00;
    public final AnonymousClass0FC A01;
    public final AnonymousClass0F5 A02;
    public final AnonymousClass0F7 A03;
    public final AnonymousClass0F2 A04;
    public final AnonymousClass09H A05;
    public final AnonymousClass00T A06;

    public AnonymousClass0FD(AnonymousClass00T r1, AnonymousClass09H r2, AnonymousClass0F2 r3, AnonymousClass0F5 r4, AnonymousClass0F7 r5, AnonymousClass0FC r6) {
        this.A06 = r1;
        this.A05 = r2;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }

    public final synchronized AnonymousClass2FI A00(boolean z) {
        AnonymousClass2FI r2;
        r2 = this.A00;
        if (r2 != null) {
            if (!z) {
                this.A02.A01(r2.A00.A02());
            }
            this.A00 = null;
        } else {
            throw null;
        }
        return r2;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A06.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 15));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r12) {
        Long l;
        AnonymousClass0M5 A0D = r12.A0D("error");
        if (A0D != null) {
            int A052 = A0D.A05("code", -1);
            if (A052 != -1) {
                String A0G = A0D.A0G("text", null);
                try {
                    long A07 = A0D.A07("backoff", -1);
                    if (A07 != -1) {
                        l = Long.valueOf(A07 * 1000);
                        this.A06.ANF(new RunnableEBaseShape0S1201000_I0(this, A052, l, A0G, 1));
                        return;
                    }
                } catch (AnonymousClass1XC e) {
                    Log.e("SyncRequestHandler/getServerProvidedBackoffInMs the provided backoff is not an integral value.", e);
                }
                l = null;
                this.A06.ANF(new RunnableEBaseShape0S1201000_I0(this, A052, l, A0G, 1));
                return;
            }
            StringBuilder sb = new StringBuilder("Expected attribute code in ");
            sb.append(r12);
            throw new AnonymousClass1XC(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Expected child error in ");
        sb2.append(r12);
        throw new AnonymousClass1XC(sb2.toString());
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r6) {
        try {
            this.A06.ANF(new RunnableEBaseShape1S0200000_I0_0(this, new AnonymousClass2FM(r6), 47));
        } catch (C52822bo | C52832bp e) {
            A00(false);
            this.A06.ANF(new RunnableEBaseShape1S0200000_I0_0(this, e, 48));
        }
    }
}
