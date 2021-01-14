package X;

import android.os.SystemClock;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: X.22n  reason: invalid class name and case insensitive filesystem */
public class C450122n implements AnonymousClass09O {
    public final long A00 = SystemClock.elapsedRealtime();
    public final AnonymousClass009 A01;
    public final C40421tF A02;
    public final C002701k A03;
    public final AnonymousClass09H A04;
    public final String A05;
    public final String A06;

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
    }

    public C450122n(C002701k r3, AnonymousClass009 r4, AnonymousClass09H r5, String str, String str2, C40421tF r8) {
        this.A03 = r3;
        this.A01 = r4;
        this.A04 = r5;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = r8;
    }

    public final boolean A00() {
        String str = this.A06;
        if (str != "preview" || !this.A03.A0E(101)) {
            return str == "image" && this.A03.A0E(102);
        }
        return true;
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r16) {
        int A0E = C002001d.A0E(r16);
        AnonymousClass02N r8 = (AnonymousClass02N) r16.A08(AnonymousClass02N.class, "from", this.A01);
        int i = 2;
        if (A0E == 404) {
            C40421tF r2 = this.A02;
            if (!"preview".equals(this.A06)) {
                i = 1;
            }
            r2.A00(new AnonymousClass1WL(r8, null, null, null, -1, i), this.A00);
            return;
        }
        C40421tF r0 = this.A02;
        String str2 = this.A06;
        long j = this.A00;
        AnonymousClass0ES r4 = r0.A01;
        AnonymousClass0AT r1 = r4.A0A;
        r1.A01.A01(r8);
        r1.A02.A01(r8);
        r4.A02(r8, A0E);
        AnonymousClass0ET r5 = r4.A07;
        if ("preview".equals(str2)) {
            i = 1;
        }
        r5.A02(6, i, Long.valueOf(System.currentTimeMillis() - j), null);
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r13) {
        String str2;
        URL url;
        int i;
        String str3;
        AnonymousClass0OS A0A;
        AnonymousClass02N r5 = (AnonymousClass02N) r13.A08(AnonymousClass02N.class, "from", this.A01);
        AnonymousClass0M5 A0D = r13.A0D("picture");
        String str4 = this.A05;
        byte[] bArr = null;
        if (A0D != null) {
            byte[] bArr2 = A0D.A01;
            if (!A00() || (A0A = A0D.A0A("direct_path")) == null) {
                str2 = null;
            } else {
                str2 = A0A.A03;
            }
            AnonymousClass0OS A0A2 = A0D.A0A("url");
            if (A0A2 == null || (str3 = A0A2.A03) == null) {
                url = null;
            } else {
                try {
                    url = new URL(str3);
                } catch (MalformedURLException unused) {
                    throw new AnonymousClass1XC("Malformed picture url");
                }
            }
            AnonymousClass0OS A0A3 = A0D.A0A("id");
            if (A0A3 != null) {
                str4 = A0A3.A03;
            } else {
                str4 = null;
            }
            bArr = bArr2;
        } else {
            url = null;
            str2 = null;
        }
        if (r5 != null) {
            if (str4 == null) {
                i = -1;
            } else {
                try {
                    i = Integer.parseInt(str4);
                } catch (NumberFormatException unused2) {
                    throw new AnonymousClass1XC(AnonymousClass008.A0K("Malformed photo id=", str4));
                }
            }
            C40421tF r2 = this.A02;
            int i2 = 1;
            if ("preview".equals(this.A06)) {
                i2 = 2;
            }
            r2.A00(new AnonymousClass1WL(r5, bArr, url, str2, i, i2), this.A00);
        }
    }
}
