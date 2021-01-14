package X;

/* renamed from: X.3Ll  reason: invalid class name and case insensitive filesystem */
public class C70543Ll extends C64392y7 {
    public final AnonymousClass02N A00;
    public final AnonymousClass02N A01;
    public final String A02;
    public final boolean A03;

    public C70543Ll(String str, AnonymousClass02N r4, AnonymousClass02N r5, String str2, boolean z, boolean z2, int i, String str3) {
        super(false);
        this.A01 = r4;
        this.A00 = r5;
        this.A0F = str2;
        this.A0L = z;
        this.A03 = z2;
        super.A01 = i;
        this.A02 = str3;
        int hashCode = str.hashCode();
        if (hashCode != -440536404) {
            if (hashCode != 3540562) {
                if (hashCode == 954925063 && str.equals("message")) {
                    this.A04 = 4;
                }
            } else if (str.equals("star")) {
                this.A04 = 20;
            }
        } else if (str.equals("media_message")) {
            this.A04 = 23;
        }
    }
}
