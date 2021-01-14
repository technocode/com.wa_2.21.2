package X;

import com.whatsapp.util.Log;

/* renamed from: X.1wg  reason: invalid class name and case insensitive filesystem */
public class C42421wg implements AnonymousClass09O {
    public final AnonymousClass1S3 A00;
    public final AnonymousClass1SX A01;
    public final AnonymousClass04j A02;
    public final AnonymousClass2KZ A03;
    public final AnonymousClass09H A04;

    public C42421wg(AnonymousClass09H r1, AnonymousClass1S3 r2, AnonymousClass2KZ r3, AnonymousClass04j r4, AnonymousClass1SX r5) {
        this.A04 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = r5;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("sendGetBizProductCatalog/delivery-error");
        this.A00.A01(this.A03, 500);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        Log.e("sendGetBizProductCatalog/response-error");
        this.A00.A01(this.A03, C002001d.A0E(r5));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r8) {
        StringBuilder A0S = AnonymousClass008.A0S("sendGetBizProductCatalog/onSuccess jid=");
        AnonymousClass2KZ r5 = this.A03;
        A0S.append(r5.A03);
        Log.d(A0S.toString());
        AnonymousClass2KX A012 = this.A01.A01(r8);
        if (A012 != null) {
            AnonymousClass1S3 r3 = this.A00;
            AnonymousClass02M r2 = r3.A01;
            r2.A02.post(new RunnableEBaseShape2S0300000_I1(r3, r5, A012, 17));
            return;
        }
        this.A00.A01(r5, 0);
    }
}
