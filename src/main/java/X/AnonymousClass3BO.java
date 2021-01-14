package X;

/* renamed from: X.3BO  reason: invalid class name */
public class AnonymousClass3BO {
    public String A00;
    public String A01;

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("OtpSms{, sms='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", otp='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
