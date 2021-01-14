package X;

/* renamed from: X.3BF  reason: invalid class name */
public class AnonymousClass3BF extends Exception {
    public final int errorCode;
    public final String errorMessage;

    public AnonymousClass3BF(AnonymousClass3BG r2) {
        super(r2.description);
        this.errorCode = r2.code;
        this.errorMessage = r2.description;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("Error ");
        A0S.append(this.errorCode);
        A0S.append(" : ");
        A0S.append(this.errorMessage);
        return A0S.toString();
    }
}
