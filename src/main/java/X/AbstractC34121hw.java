package X;

/* renamed from: X.1hw  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC34121hw extends AnonymousClass12R {
    public final int A00;
    public final AnonymousClass146 A01;

    public AbstractC34121hw(AnonymousClass146 r2) {
        this.A01 = r2;
        this.A00 = ((C34221i6) r2).A00;
    }

    public final int A0E(int i, boolean z) {
        if (z) {
            int i2 = i + 1;
            if (i2 < ((C34221i6) this.A01).A00) {
                return i2;
            }
        } else if (i < this.A00 - 1) {
            return i + 1;
        }
        return -1;
    }
}
