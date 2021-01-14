package X;

/* renamed from: X.0K4  reason: invalid class name */
public class AnonymousClass0K4 {
    public double A00;
    public double A01;
    public double A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public final C000300f A0F;
    public final C02420Bx A0G;
    public final C02410Bw A0H;
    public final String A0I;

    public AnonymousClass0K4(C000300f r2, C02410Bw r3, C02420Bx r4, String str, String str2, String str3, String str4, String str5, boolean z) {
        this.A0F = r2;
        this.A0H = r3;
        this.A0G = r4;
        this.A0I = str;
        this.A0B = str2;
        this.A0C = str3;
        this.A09 = str4;
        this.A08 = str5;
        this.A0E = z;
        A00(true);
    }

    public final void A00(boolean z) {
        boolean equals = "Portal".equals(this.A09);
        this.A0D = equals;
        if (z) {
            C000300f r2 = this.A0F;
            C02410Bw r1 = this.A0H;
            boolean A042 = this.A0G.A04();
            int A062 = r2.A06(AbstractC000400g.A41);
            if (r1.A00.getInt("disabled_version", 0) >= A062 || A062 > 1 || equals || A042) {
                A062 = 0;
            }
            this.A03 = A062;
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("WebSessionInfo{browserId='");
        AnonymousClass008.A1W(A0S, this.A0I, '\'', ", secret='");
        AnonymousClass008.A1W(A0S, this.A0B, '\'', ", token='");
        AnonymousClass008.A1W(A0S, this.A0C, '\'', ", os='");
        AnonymousClass008.A1W(A0S, this.A09, '\'', ", browserType='");
        AnonymousClass008.A1W(A0S, this.A08, '\'', ", lat=");
        A0S.append(this.A01);
        A0S.append(", lon=");
        A0S.append(this.A02);
        A0S.append(", accuracy=");
        A0S.append(this.A00);
        A0S.append(", placeName='");
        AnonymousClass008.A1W(A0S, this.A0A, '\'', ", lastActive=");
        A0S.append(this.A05);
        A0S.append(", lastPushSent=");
        A0S.append(this.A06);
        A0S.append(", timeout=");
        A0S.append(this.A0E);
        A0S.append(", expiration=");
        A0S.append(this.A04);
        A0S.append(", syncdRelease=");
        A0S.append(this.A03);
        A0S.append('}');
        return A0S.toString();
    }
}
