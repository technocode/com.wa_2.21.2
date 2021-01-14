package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.1wt  reason: invalid class name and case insensitive filesystem */
public class C42551wt implements AnonymousClass09O {
    public AnonymousClass0I1 A00 = new AnonymousClass0I1();
    public final AnonymousClass1SM A01;
    public final AnonymousClass1SO A02;
    public final AnonymousClass09H A03;

    public C42551wt(AnonymousClass09H r2, AnonymousClass1SM r3, AnonymousClass1SO r4) {
        this.A02 = r4;
        this.A03 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        AnonymousClass008.A1C("GetOrderProtocol/delivery-error with iqId ", str, ">");
        this.A00.A00(new C64212xo(str));
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r8) {
        Pair A0j = C002001d.A0j(r8);
        if (A0j != null) {
            AnonymousClass0I1 r1 = this.A00;
            r1.A01 = new AnonymousClass1SW(null, A0j);
            r1.A02 = true;
            r1.A03.countDown();
            StringBuilder sb = new StringBuilder("GetOrderProtocol/response-error with iqId <");
            sb.append(str);
            sb.append("> and error ");
            sb.append(A0j);
            Log.w(sb.toString());
            return;
        }
        AnonymousClass0I1 r3 = this.A00;
        r3.A01 = new AnonymousClass1SW(null, new Pair(1, "error code is null"));
        r3.A02 = true;
        r3.A03.countDown();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0125  */
    @Override // X.AnonymousClass09O
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKk(java.lang.String r24, X.AnonymousClass0M5 r25) {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42551wt.AKk(java.lang.String, X.0M5):void");
    }
}
