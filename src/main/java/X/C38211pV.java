package X;

/* renamed from: X.1pV  reason: invalid class name and case insensitive filesystem */
public class C38211pV implements AnonymousClass1HG {
    public final /* synthetic */ AnonymousClass1HI A00;

    @Override // X.AnonymousClass1HG
    public double A22(double d, double d2) {
        return d % d2;
    }

    public C38211pV(AnonymousClass1HI r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass1HG
    public long A24(long j, long j2) {
        if (j2 != 0) {
            return j % j2;
        }
        AnonymousClass1HI.A01("Division by zero");
        throw null;
    }
}
