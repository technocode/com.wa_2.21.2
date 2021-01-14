package X;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.2tQ  reason: invalid class name and case insensitive filesystem */
public class C61592tQ {
    public static volatile C61592tQ A0A;
    public final AnonymousClass02M A00;
    public final AnonymousClass04j A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass01K A03;
    public final AnonymousClass0GP A04;
    public final C02010Ah A05;
    public final AnonymousClass0AD A06;
    public final C03340Fu A07;
    public final C01970Ad A08;
    public final C03300Fq A09;

    public C61592tQ(AnonymousClass02M r1, AnonymousClass00G r2, C01970Ad r3, AnonymousClass01K r4, C02010Ah r5, C03300Fq r6, AnonymousClass04j r7, C03340Fu r8, AnonymousClass0GP r9, AnonymousClass0AD r10) {
        this.A00 = r1;
        this.A02 = r2;
        this.A08 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A09 = r6;
        this.A01 = r7;
        this.A07 = r8;
        this.A04 = r9;
        this.A06 = r10;
    }

    public static C61592tQ A00() {
        if (A0A == null) {
            synchronized (C61592tQ.class) {
                if (A0A == null) {
                    A0A = new C61592tQ(AnonymousClass02M.A00(), AnonymousClass00G.A01, C01970Ad.A00(), AnonymousClass01K.A00(), C02010Ah.A00(), C03300Fq.A00(), AnonymousClass04j.A00(), C03340Fu.A00(), AnonymousClass0GP.A00(), AnonymousClass0AD.A00);
                }
            }
        }
        return A0A;
    }

    public void A01(String str, AnonymousClass0GT r16) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass0OS("action", "get-transactions"));
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass008.A1D("after", str, arrayList);
        }
        AnonymousClass0M5 r10 = new AnonymousClass0M5("account", (AnonymousClass0OS[]) arrayList.toArray(new AnonymousClass0OS[0]));
        AbstractC61782tj A6O = this.A08.A03().A6O();
        if (A6O != null) {
            A6O.AQ7();
        }
        this.A07.A09(false, r10, new C73603Xz(this, this.A02.A00, this.A00, this.A01, this.A04, true, r16), 0);
    }

    public void A02(String str, boolean z, AnonymousClass0GT r17) {
        AnonymousClass0OS[] r4 = new AnonymousClass0OS[3];
        r4[0] = new AnonymousClass0OS("action", "get-transaction");
        int i = 1;
        r4[1] = new AnonymousClass0OS("id", str);
        if (!z) {
            i = 2;
        }
        r4[2] = new AnonymousClass0OS("version", i);
        this.A07.A09(false, new AnonymousClass0M5("account", r4), new C73603Xz(this, this.A02.A00, this.A00, this.A01, this.A04, false, r17), 0);
    }
}
