package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1we  reason: invalid class name and case insensitive filesystem */
public class C42401we implements AnonymousClass09O {
    public final AnonymousClass0HL A00;
    public final AnonymousClass1S3 A01;
    public final AnonymousClass1SX A02;
    public final AnonymousClass04j A03;
    public final C48092Kw A04;
    public final AnonymousClass09H A05;

    public C42401we(AnonymousClass09H r1, AnonymousClass1S3 r2, C48092Kw r3, AnonymousClass0HL r4, AnonymousClass04j r5, AnonymousClass1SX r6) {
        this.A05 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A00 = r4;
        this.A03 = r5;
        this.A02 = r6;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("sendGetBizProduct/delivery-error");
        AnonymousClass1S3 r5 = this.A01;
        C48092Kw r4 = this.A04;
        AnonymousClass02M r3 = r5.A01;
        r3.A02.post(new RunnableEBaseShape1S0201000_I1(r4, 0, r5, 12));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r8) {
        Log.e("sendGetBizProduct/response-error");
        AnonymousClass1S3 r5 = this.A01;
        C48092Kw r4 = this.A04;
        int A0E = C002001d.A0E(r8);
        AnonymousClass02M r2 = r5.A01;
        r2.A02.post(new RunnableEBaseShape1S0201000_I1(r4, A0E, r5, 12));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r9) {
        AnonymousClass2KX A012 = this.A02.A01(r9);
        if (A012 != null) {
            List list = A012.A01;
            if (!list.isEmpty()) {
                Log.d("sendGetBizProduct/success");
                C48092Kw r5 = this.A04;
                this.A00.A05((C48052Ks) list.get(0), r5.A00);
                AnonymousClass1S3 r4 = this.A01;
                String str2 = ((C48052Ks) list.get(0)).A06;
                AnonymousClass02M r2 = r4.A01;
                r2.A02.post(new RunnableEBaseShape1S1200000_I1(r4, r5, str2, 14));
                return;
            }
        }
        Log.e("sendGetBizProduct/error: empty response");
    }
}
