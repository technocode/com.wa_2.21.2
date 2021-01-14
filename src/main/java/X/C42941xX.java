package X;

import com.whatsapp.util.Log;

/* renamed from: X.1xX  reason: invalid class name and case insensitive filesystem */
public class C42941xX implements AnonymousClass09O {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ AbstractC28101Sx A01;
    public final /* synthetic */ C28111Sy A02;

    public C42941xX(C28111Sy r1, C28021Sn r2, AbstractC28101Sx r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        C28021Sn r1 = this.A00;
        if (r1 != null) {
            r1.A00("on_failure");
        }
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r9) {
        StringBuilder A0S = AnonymousClass008.A0S("Bloks: IQRequestHelper/sendIQRequest onError: ");
        A0S.append(r9.toString());
        Log.e(A0S.toString());
        this.A02.A00.A0E(new RunnableEBaseShape1S0400000_I1(this, this.A00, this.A01, r9, 7));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r6) {
        this.A02.A00.A0E(new RunnableEBaseShape2S0300000_I1(this, this.A00, r6, 19));
    }
}
