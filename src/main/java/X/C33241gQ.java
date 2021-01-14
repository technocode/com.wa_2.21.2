package X;

/* renamed from: X.1gQ  reason: invalid class name and case insensitive filesystem */
public class C33241gQ implements AbstractC21870zT {
    public final /* synthetic */ C33251gR A00;

    public C33241gQ(C33251gR r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC21870zT
    public void AL0() {
        C33251gR r4 = this.A00;
        if (r4.A0E) {
            if (r4.A0C == 1 || r4.A0C == 7) {
                r4.A0C = 0;
                r4.A07 = Boolean.FALSE;
                r4.A02 = new C21620z2("Failed to start operation. Operation timed out.");
            } else if (r4.A0C == 2 || r4.A0C == 3 || r4.A0C == 4) {
                r4.A0C = 0;
            }
        }
    }
}
