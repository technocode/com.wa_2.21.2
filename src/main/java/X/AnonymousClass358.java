package X;

/* renamed from: X.358  reason: invalid class name */
public class AnonymousClass358 {
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass358(String str, String str2, String str3) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = str3;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Bullet{text='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", iconLightUrl='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", iconDarkUrl='");
        A0S.append(this.A00);
        A0S.append('\'');
        A0S.append('}');
        return A0S.toString();
    }
}
