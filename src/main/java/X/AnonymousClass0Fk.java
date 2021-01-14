package X;

/* renamed from: X.0Fk  reason: invalid class name */
public class AnonymousClass0Fk {
    public static final AnonymousClass0Fk A01 = new AnonymousClass0Fk();
    public int A00 = 3;

    public String toString() {
        int i = this.A00;
        if (i == 1) {
            return "available";
        }
        return i == 3 ? "un-available" : "available-waiting-timeout";
    }
}
