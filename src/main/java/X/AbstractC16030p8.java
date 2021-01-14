package X;

/* renamed from: X.0p8  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC16030p8 {
    public int A00() {
        if (this instanceof AnonymousClass3UR) {
            return ((AnonymousClass3UR) this).A00.size();
        }
        if (this instanceof C71303Oj) {
            return ((C71303Oj) this).A00.size();
        }
        if (!(this instanceof C71053Nk)) {
            return ((C33651h8) this).A00.A04.size();
        }
        return ((C71053Nk) this).A00.size();
    }

    public int A01() {
        if (this instanceof AnonymousClass3UR) {
            return ((AnonymousClass3UR) this).A01.size();
        }
        if (this instanceof C71303Oj) {
            return ((C71303Oj) this).A01.size();
        }
        if (!(this instanceof C71053Nk)) {
            return ((C33651h8) this).A01.size();
        }
        return ((C71053Nk) this).A01.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0112 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(int r9, int r10) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC16030p8.A02(int, int):boolean");
    }

    public boolean A03(int i, int i2) {
        if (this instanceof AnonymousClass3UR) {
            AnonymousClass3UR r1 = (AnonymousClass3UR) this;
            C676139i r5 = (C676139i) r1.A01.get(i);
            C676139i r4 = (C676139i) r1.A00.get(i2);
            int i3 = r5.A00;
            if (i3 != r4.A00) {
                return false;
            }
            if (i3 == 0 || i3 == 2) {
                return true;
            }
            AnonymousClass0QY r12 = r5.A01;
            if (r12 != null) {
                AnonymousClass0QY r0 = r4.A01;
                if (r0 == null || !r12.A06.equals(r0.A06)) {
                    return false;
                }
            } else if (r4.A01 == null) {
                return true;
            } else {
                return false;
            }
            return true;
        } else if (this instanceof C71303Oj) {
            C71303Oj r2 = (C71303Oj) this;
            return ((AbstractC658031p) r2.A01.get(i)).A00 == ((AbstractC658031p) r2.A00.get(i2)).A00;
        } else if (!(this instanceof C71053Nk)) {
            C33651h8 r13 = (C33651h8) this;
            return ((long) ((C37781om) r13.A01.get(i)).A02.A07) == ((long) ((C37781om) r13.A00.A04.get(i2)).A02.A07);
        } else {
            C71053Nk r6 = (C71053Nk) this;
            AbstractC08640bT r52 = (AbstractC08640bT) r6.A01.get(i);
            AbstractC08640bT r42 = (AbstractC08640bT) r6.A00.get(i2);
            int i4 = r52.A00;
            if (!AnonymousClass3ZP.A00(i4)) {
                int i5 = r42.A00;
                if (!AnonymousClass3ZP.A00(i5)) {
                    if (i4 == 4) {
                        return i5 == 4;
                    }
                    if (r6.A03.equals(r6.A02)) {
                        return C006803i.A0q(r52.A01, r42.A01);
                    }
                    return C006803i.A0q(Integer.valueOf(i4), Integer.valueOf(i5));
                }
            }
            return C006803i.A0q(r52.A01, r42.A01);
        }
    }
}
