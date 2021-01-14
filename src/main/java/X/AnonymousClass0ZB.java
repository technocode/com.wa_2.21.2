package X;

/* renamed from: X.0ZB  reason: invalid class name */
public class AnonymousClass0ZB extends AnonymousClass0MO implements AbstractC02870Du, AbstractC02880Dv {
    public AnonymousClass0ZB(C007303n r2, long j) {
        super(r2, j, (byte) 13);
    }

    public AnonymousClass0ZB(C007303n r2, long j, byte b) {
        super(r2, j, (byte) 29);
    }

    public AnonymousClass0ZB(C007303n r9, long j, C76563ek r12, boolean z, boolean z2) {
        super(r9, j, r12, z, z2, (byte) 13);
        A13(r12);
    }

    public AnonymousClass0ZB(AnonymousClass0ZB r9, C007303n r10, long j, AnonymousClass0M4 r13) {
        super((AnonymousClass0M3) r9, r10, j, r13, false, (byte) 13);
    }

    public AnonymousClass0ZB(AnonymousClass0ZB r9, C007303n r10, long j, AnonymousClass0M4 r13, boolean z) {
        super(r9, r10, j, r13, z, r9.A0m);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011a, code lost:
        if (r6 != null) goto L_0x00e5;
     */
    @Override // X.AbstractC02880Dv
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2N(X.C64552yN r15) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0ZB.A2N(X.2yN):void");
    }

    @Override // X.AbstractC02870Du
    public /* bridge */ /* synthetic */ AbstractC007503q A2n(C007303n r8) {
        if (this instanceof AnonymousClass2CE) {
            AnonymousClass2CE r1 = (AnonymousClass2CE) this;
            return new AnonymousClass2CE(r1, r8, r1.A0E, ((AnonymousClass0M3) r1).A02);
        } else if (!(this instanceof AnonymousClass2CE)) {
            return new AnonymousClass0ZB(this, r8, this.A0E, ((AnonymousClass0M3) this).A02, true);
        } else {
            AnonymousClass2CE r12 = (AnonymousClass2CE) this;
            return new AnonymousClass2CE(r12, r8, r12.A0E, ((AnonymousClass0M3) r12).A02);
        }
    }
}
