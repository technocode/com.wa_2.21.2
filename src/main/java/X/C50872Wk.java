package X;

/* renamed from: X.2Wk  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C50872Wk implements AbstractC19820vf {
    public final /* synthetic */ AnonymousClass2EV A00;

    public /* synthetic */ C50872Wk(AnonymousClass2EV r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC19820vf
    public final void AIm(C19810ve r8) {
        AnonymousClass2EV r6 = this.A00;
        if (r8 != null && r6.A08) {
            Object obj = r6.A06;
            synchronized (obj) {
                if (r6.A07) {
                    AnonymousClass2EU r4 = r6.A02;
                    byte[] bArr = r8.A02;
                    AbstractC19800vd[] r2 = r8.A03;
                    int i = r8.A01;
                    int i2 = r8.A00;
                    r4.A02 = bArr;
                    r4.A03 = r2;
                    r4.A01 = i;
                    r4.A00 = i2;
                    r6.A09 = true;
                    obj.notify();
                    while (r6.A07 && r6.A08) {
                        try {
                            obj.wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                    r6.A09 = false;
                }
            }
        }
    }
}
