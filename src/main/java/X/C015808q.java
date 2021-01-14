package X;

/* renamed from: X.08q  reason: invalid class name and case insensitive filesystem */
public class C015808q {
    public static volatile C015808q A07;
    public Boolean A00;
    public final AnonymousClass009 A01;
    public final C000300f A02;
    public final AnonymousClass00D A03;
    public final C014508d A04;
    public final C015408m A05;
    public final AnonymousClass00Y A06;

    public C015808q(AnonymousClass009 r1, AnonymousClass00Y r2, C000300f r3, C015408m r4, C014508d r5, AnonymousClass00D r6) {
        this.A01 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A05 = r4;
        this.A04 = r5;
        this.A03 = r6;
    }

    public static C015808q A00() {
        if (A07 == null) {
            synchronized (C015808q.class) {
                if (A07 == null) {
                    A07 = new C015808q(AnonymousClass009.A00(), AnonymousClass00Y.A00(), C000300f.A00(), C015408m.A00(), C014508d.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A07;
    }

    public boolean A01() {
        if (!A03()) {
            return false;
        }
        if (this.A02.A06(AbstractC000400g.A3P) == 3 || this.A03.A00.getBoolean("companion_reg_opt_in_enabled", false)) {
            return true;
        }
        return false;
    }

    public boolean A02() {
        if (!A03()) {
            return false;
        }
        int A062 = this.A02.A06(AbstractC000400g.A3P);
        if (A062 == 1 || A062 == 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (java.lang.Integer.parseInt(r0) != 2) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A03() {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C015808q.A03():boolean");
    }
}
