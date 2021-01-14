package X;

/* renamed from: X.2Y6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Y6 implements AbstractC02390Bu {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;

    public /* synthetic */ AnonymousClass2Y6(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.AbstractC02390Bu
    public final int A9s(byte b) {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        if (b != 1) {
            if (b != 3) {
                if (b != 13) {
                    if (b != 42) {
                        i2 = 1;
                        if (b == 43) {
                            return i3;
                        }
                    }
                }
                return i2;
            }
            return i3;
        }
        return i;
    }
}
