package X;

/* renamed from: X.1F5  reason: invalid class name */
public class AnonymousClass1F5 extends Exception {
    public EnumC12510iD errorType;
    public String message;

    public AnonymousClass1F5(EnumC12510iD r1, String str) {
        super(str);
        this.message = str;
        this.errorType = r1;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Error type: ");
        A0S.append(this.errorType);
        A0S.append(". ");
        A0S.append(this.message);
        return A0S.toString();
    }
}
