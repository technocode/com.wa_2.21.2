package X;

import android.view.View;

/* renamed from: X.1Gx  reason: invalid class name and case insensitive filesystem */
public class C25421Gx {
    public C25411Gw A00;
    public C25411Gw A01;
    public EnumC25431Gy A02;
    public Float A03;

    public C25421Gx(EnumC25431Gy r1, Float f) {
        this.A02 = r1;
        this.A03 = f;
    }

    public final int A00(View view, AnonymousClass0VS r5) {
        EnumC25431Gy r2 = this.A02;
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            return r5.A09(view);
        }
        if (ordinal == 2) {
            return r5.A06(view);
        }
        StringBuilder A0S = AnonymousClass008.A0S("Invalid gravity :");
        A0S.append(r2);
        throw new IllegalArgumentException(A0S.toString());
    }

    public final int A01(AnonymousClass0VT r4, AnonymousClass0VS r5) {
        EnumC25431Gy r2 = this.A02;
        int ordinal = r2.ordinal();
        if (ordinal == 0) {
            Float f = this.A03;
            if (!r4.A0f()) {
                return 0;
            }
            return Math.round(f.floatValue()) + r5.A04();
        } else if (ordinal != 2) {
            StringBuilder A0S = AnonymousClass008.A0S("Invalid gravity :");
            A0S.append(r2);
            throw new IllegalArgumentException(A0S.toString());
        } else if (r4.A0f()) {
            return r5.A02();
        } else {
            return r5.A01();
        }
    }

    public View A02(AnonymousClass0VT r9) {
        AnonymousClass0VS r7;
        if (r9.A0d()) {
            C25411Gw r1 = this.A00;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C25411Gw(r9, new C30531bV(r9));
                this.A00 = r1;
            }
            r7 = r1.A00;
        } else {
            C25411Gw r12 = this.A01;
            if (r12 == null || r12.A01 != r9) {
                r12 = new C25411Gw(r9, new C30541bW(r9));
                this.A01 = r12;
            }
            r7 = r12.A00;
        }
        int A0A = r9.A0A();
        View view = null;
        if (A0A != 0) {
            int i = Integer.MAX_VALUE;
            int A012 = A01(r9, r7);
            for (int i2 = 0; i2 < A0A; i2++) {
                View A0I = r9.A0I(i2);
                int abs = Math.abs(A00(A0I, r7) - A012);
                if (abs < i) {
                    view = A0I;
                    i = abs;
                }
            }
        }
        return view;
    }

    public int[] A03(AnonymousClass0VT r6, View view) {
        int[] iArr = new int[2];
        if (r6.A0d()) {
            C25411Gw r1 = this.A00;
            if (r1 == null || r1.A01 != r6) {
                r1 = new C25411Gw(r6, new C30531bV(r6));
                this.A00 = r1;
            }
            AnonymousClass0VS r0 = r1.A00;
            iArr[0] = A00(view, r0) - A01(r6, r0);
        } else {
            iArr[0] = 0;
        }
        if (r6.A0e()) {
            C25411Gw r12 = this.A01;
            if (r12 == null || r12.A01 != r6) {
                r12 = new C25411Gw(r6, new C30541bW(r6));
                this.A01 = r12;
            }
            AnonymousClass0VS r02 = r12.A00;
            iArr[1] = A00(view, r02) - A01(r6, r02);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
