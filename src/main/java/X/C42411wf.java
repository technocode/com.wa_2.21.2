package X;

import com.whatsapp.util.Log;

/* renamed from: X.1wf  reason: invalid class name and case insensitive filesystem */
public class C42411wf implements AnonymousClass09O {
    public final AnonymousClass1S3 A00;
    public final C48082Kv A01;
    public final AnonymousClass09H A02;

    public C42411wf(AnonymousClass09H r1, AnonymousClass1S3 r2, C48082Kv r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        Log.e("sendReportBizProduct/delivery-error");
        this.A00.A02(this.A01, false);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r5) {
        Log.e("sendReportBizProduct/response-error");
        this.A00.A02(this.A01, false);
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r5) {
        AnonymousClass0M5 A0D = r5.A0D("response");
        if (A0D != null) {
            AnonymousClass0M5 A0D2 = A0D.A0D("success");
            if (A0D2 == null) {
                return;
            }
            if ("true".equals(AnonymousClass0M5.A00(A0D2.A01))) {
                this.A00.A02(this.A01, true);
            } else {
                this.A00.A02(this.A01, false);
            }
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("sendReportBizProduct/corrupted-response:");
            A0S.append(r5.toString());
            Log.e(A0S.toString());
            this.A00.A02(this.A01, false);
        }
    }
}
