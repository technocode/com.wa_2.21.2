package X;

import java.util.ArrayList;

/* renamed from: X.0fz  reason: invalid class name and case insensitive filesystem */
public class C11260fz {
    public final AnonymousClass01A A00;
    public final C014308b A01;
    public final AnonymousClass00S A02;
    public final ArrayList A03;

    public C11260fz(AnonymousClass00S r2, AnonymousClass01A r3, C014308b r4) {
        this.A03 = new ArrayList();
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public C11260fz(AnonymousClass00S r2, AnonymousClass01A r3, C014308b r4, AnonymousClass0QM r5) {
        ArrayList arrayList = new ArrayList();
        this.A03 = arrayList;
        this.A02 = r2;
        this.A00 = r3;
        this.A01 = r4;
        arrayList.add(r5);
    }

    public int A00() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return 3;
        }
        AnonymousClass0QM r1 = (AnonymousClass0QM) arrayList.get(0);
        if (r1.A09.A03) {
            return 0;
        }
        int i = r1.A00;
        return (i == 5 || i == 6) ? 1 : 2;
    }

    public long A01() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return this.A02.A06(((AnonymousClass0QM) arrayList.get(0)).A08);
    }

    public C007003k A02() {
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            return this.A00.A0A(((AnonymousClass0QM) arrayList.get(0)).A09.A01);
        }
        return null;
    }

    public String A03() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty()) {
            return null;
        }
        AnonymousClass0QM r1 = (AnonymousClass0QM) arrayList.get(0);
        if (r1.A0D()) {
            StringBuilder A0S = AnonymousClass008.A0S("G:");
            C09260ca r12 = r1.A09;
            A0S.append(AnonymousClass1VY.A0D(r12.A01));
            A0S.append(r12.A03);
            A0S.append(r12.A02);
            A0S.append(r12.A00);
            return A0S.toString();
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("O:");
        A0S2.append(AnonymousClass1VY.A0D(r1.A09.A01));
        A0S2.append(r1.A08);
        return A0S2.toString();
    }

    public boolean A04() {
        ArrayList arrayList = this.A03;
        return !arrayList.isEmpty() && ((AnonymousClass0QM) arrayList.get(0)).A0D();
    }

    public boolean A05() {
        ArrayList arrayList = this.A03;
        if (arrayList.isEmpty() || !((AnonymousClass0QM) arrayList.get(0)).A0E) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r1 == 6) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r2 == 6) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06(X.AnonymousClass0QM r10) {
        /*
            r9 = this;
            java.util.ArrayList r4 = r9.A03
            boolean r0 = r4.isEmpty()
            r8 = 0
            if (r0 != 0) goto L_0x005d
            int r0 = r4.size()
            int r0 = r0 + -1
            java.lang.Object r5 = r4.get(r0)
            X.0QM r5 = (X.AnonymousClass0QM) r5
            boolean r0 = r10.A0D()
            if (r0 != 0) goto L_0x0061
            boolean r0 = r5.A0D()
            if (r0 != 0) goto L_0x0061
            X.0ca r7 = r10.A09
            com.whatsapp.jid.UserJid r1 = r7.A01
            X.0ca r6 = r5.A09
            com.whatsapp.jid.UserJid r0 = r6.A01
            boolean r0 = X.C006803i.A0q(r1, r0)
            if (r0 == 0) goto L_0x0061
            long r2 = r10.A08
            long r0 = r5.A08
            boolean r0 = X.AnonymousClass0OY.A06(r2, r0)
            if (r0 == 0) goto L_0x0061
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x0046
            int r1 = r10.A00
            r0 = 5
            if (r1 == r0) goto L_0x0046
            r0 = 6
            r3 = 1
            if (r1 != r0) goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            boolean r0 = r6.A03
            if (r0 != 0) goto L_0x0054
            int r2 = r5.A00
            r0 = 5
            if (r2 == r0) goto L_0x0054
            r1 = 6
            r0 = 1
            if (r2 != r1) goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            if (r3 != r0) goto L_0x0061
            boolean r1 = r10.A0E
            boolean r0 = r5.A0E
            if (r1 != r0) goto L_0x0061
        L_0x005d:
            r8 = 1
            r4.add(r10)
        L_0x0061:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11260fz.A06(X.0QM):boolean");
    }

    public String toString() {
        if (this.A03.isEmpty()) {
            return null;
        }
        return this.A01.A08(A02(), false);
    }
}
