package X;

import java.util.Arrays;

/* renamed from: X.2dU  reason: invalid class name and case insensitive filesystem */
public class C53572dU implements AnonymousClass2OP {
    public final int A00;
    public final AnonymousClass2OP A01;
    public final AnonymousClass2OP A02;

    public C53572dU(int i, AnonymousClass2OP r2, AnonymousClass2OP r3) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass2OP
    public boolean AB0(AnonymousClass2OQ r5) {
        int i = this.A00;
        if (i == 0) {
            AnonymousClass2OP r1 = this.A02;
            if (r1 == null) {
                throw null;
            } else if (!this.A01.AB0(r5) || !r1.AB0(r5)) {
                return false;
            } else {
                return true;
            }
        } else if (i == 1) {
            AnonymousClass2OP r12 = this.A02;
            if (r12 == null) {
                throw null;
            } else if (this.A01.AB0(r5) || r12.AB0(r5)) {
                return true;
            } else {
                return false;
            }
        } else if (i == 2) {
            return !this.A01.AB0(r5);
        } else {
            throw new IllegalStateException(AnonymousClass008.A0N(AnonymousClass008.A0S("Operator with code "), i, " is not currently supported"));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C53572dU
            r2 = 0
            if (r0 != 0) goto L_0x0006
            return r2
        L_0x0006:
            X.2dU r4 = (X.C53572dU) r4
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0021
            X.2OP r1 = r3.A01
            X.2OP r0 = r4.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.2OP r1 = r3.A02
            X.2OP r0 = r4.A02
            if (r1 != 0) goto L_0x0022
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r2 = 1
        L_0x0021:
            return r2
        L_0x0022:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0021
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53572dU.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01, this.A02});
    }
}
