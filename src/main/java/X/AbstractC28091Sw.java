package X;

import android.text.TextUtils;
import java.io.File;

/* renamed from: X.1Sw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28091Sw {
    public int A00;
    public int A01;
    public final AnonymousClass02M A02;
    public final C02660Cy A03;
    public final AnonymousClass03U A04;
    public final AnonymousClass00T A05;
    public volatile boolean A06 = true;
    public volatile boolean A07 = false;

    public AbstractC28091Sw(AnonymousClass02M r2, AnonymousClass00T r3, AnonymousClass03U r4, C02660Cy r5) {
        this.A02 = r2;
        this.A05 = r3;
        this.A04 = r4;
        this.A03 = r5;
        this.A00 = 1;
        this.A01 = 1;
    }

    public String A00() {
        String str = (String) C28001Sl.A00.get(C05870Qv.A01(((C42931xW) this).A0A.A0F()).A02);
        if (TextUtils.isEmpty(str)) {
            return "default";
        }
        return AnonymousClass008.A0K(str, "_p");
    }

    public void A01() {
        C42931xW r3 = (C42931xW) this;
        AnonymousClass00D r2 = r3.A0A;
        StringBuilder A0S = AnonymousClass008.A0S("2.21.2.4");
        A0S.append(C05870Qv.A01(r2.A0F()).A02);
        A0S.append(" ");
        A0S.append(r3.A0B.A04());
        AnonymousClass008.A0m(r2, "bloks_version", A0S.toString());
    }

    public boolean A02() {
        File A042;
        C42931xW r2 = (C42931xW) this;
        File A043 = r2.A04(C42931xW.A0G);
        if (A043 == null || A043.list() == null || A043.list().length == 0 || (A042 = r2.A04(C42931xW.A0H)) == null || A042.list() == null || A042.list().length == 0) {
            return false;
        }
        return true;
    }
}
