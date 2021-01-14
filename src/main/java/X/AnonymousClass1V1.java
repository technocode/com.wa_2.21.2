package X;

/* renamed from: X.1V1  reason: invalid class name */
public class AnonymousClass1V1 {
    public final int A00;

    public AnonymousClass1V1(int i) {
        this.A00 = i;
    }

    public AnonymousClass1V1(int i, C47982Kl r2) {
        this.A00 = i;
    }

    public static AnonymousClass1V1 A00(int i) {
        if (i <= 7) {
            return new AnonymousClass1V1(i);
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("Initialization state is not recognized. State = ", i));
    }

    public String toString() {
        return String.valueOf(this.A00);
    }
}
