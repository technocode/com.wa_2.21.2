package X;

/* renamed from: X.2tY  reason: invalid class name and case insensitive filesystem */
public class C61672tY {
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;

    public C61672tY() {
    }

    public C61672tY(AnonymousClass0M5 r6) {
        String str = r6.A00;
        if (str.equals("otp")) {
            this.A09 = "otp";
            this.A04 = r6.A0G("type", null);
            this.A03 = r6.A0G("value", null);
            this.A00 = C006803i.A02(r6.A0G("length", null), 6);
            this.A01 = C006803i.A02(r6.A0G("resend-interval-sec", null), 60);
        } else if (str.equals("app-to-app")) {
            this.A09 = "app-to-app";
            this.A05 = r6.A0G("value", null);
            this.A07 = r6.A0G("request-payload", null);
            this.A06 = r6.A0G("source", null);
        } else if (str.equals("customer-service")) {
            this.A09 = "customer-service";
            this.A08 = r6.A0G("value", null);
        }
        this.A0A = "1".equals(r6.A0G("disabled", null));
        this.A02 = r6.A0G("identifier", null);
    }
}
