package X;

import java.util.ArrayList;

/* renamed from: X.1eK  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC32091eK extends AbstractC19160uZ {
    public static final ArrayList A0E = new ArrayList(5);
    public static final String[] A0F;
    public double A00 = 1.2d;
    public int A01;
    public int A02 = -1;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public C19390uw A0A = new C19390uw();
    public final C19480v6 A0B = new C19480v6();
    public final C19500v8 A0C;
    public final int[] A0D = new int[2];

    public abstract C19650vN A03(int i, int i2, int i3);

    static {
        String[] strArr = new String[20];
        A0F = strArr;
        int i = 0;
        do {
            strArr[i] = String.valueOf(i);
            i++;
        } while (i <= 19);
    }

    public AbstractC32091eK(C32031eE r3, C19500v8 r4) {
        super(r3);
        this.A0C = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0182  */
    @Override // X.AbstractC19160uZ
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.graphics.Canvas r36) {
        /*
        // Method dump skipped, instructions count: 490
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC32091eK.A02(android.graphics.Canvas):void");
    }

    public void A04() {
        if (!(this instanceof AnonymousClass28Y)) {
            C19500v8 r2 = this.A0C;
            C19650vN r1 = r2.A04;
            while (r1 != null) {
                C19650vN r0 = r1.A09;
                r1.A03();
                r1 = r0;
            }
            C19650vN A002 = C19650vN.A00(-1, -1);
            r2.A06 = A002;
            A002.A02 = 0;
            A002.A03 = 0;
            A002.A04 = 0;
            r2.A04 = A002;
            r2.A05 = A002;
            r2.A00 = 0;
            return;
        }
        AnonymousClass28Y r12 = (AnonymousClass28Y) this;
        if (r12.A03 != null) {
            ((AbstractC32091eK) r12).A01 = 0;
            ArrayList arrayList = AnonymousClass28Y.A06;
            arrayList.remove(r12);
            if (arrayList.isEmpty()) {
                r12.A07(false);
            }
            int[] iArr = ((AbstractC32091eK) r12).A0D;
            AnonymousClass28Y.A00(iArr);
            C19500v8 r13 = ((AbstractC32091eK) r12).A0C;
            r13.A01 = iArr[0];
            r13.A02 = iArr[1];
            r13.A01();
            return;
        }
        throw null;
    }

    public void A05() {
        int i = this.A02;
        if (i != -1 && super.A04) {
            C19500v8 r6 = this.A0C;
            r6.A03 = i;
            int i2 = 1 << i;
            for (int i3 = 0; i3 < i2; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    r6.A02(i3, i4, this.A02, this.A0A);
                    C19390uw r1 = this.A0A;
                    if (r1.A06 == null && r1.A03 != 1) {
                        A06(i3, i4, this.A02, 2);
                    }
                }
            }
        }
    }

    public void A06(int i, int i2, int i3, int i4) {
        int i5 = super.A08;
        C19650vN A002 = C19650vN.A00(i5, i5);
        A002.A02 = i;
        A002.A03 = i2;
        A002.A04 = i3;
        A002.A0C = 1;
        this.A0C.A03(A002);
        C19440v1.A02(new C32081eJ(this, i, i2, i3, i4, A002), A0F[i3]);
    }

    public void A07(boolean z) {
        int i;
        if (z) {
            C19500v8 r1 = this.A0C;
            if (r1.A03 == -1) {
                if (!(this instanceof AnonymousClass28Y)) {
                    i = -1;
                } else {
                    i = 1;
                }
                r1.A03 = i;
                A05();
                return;
            }
            return;
        }
        C19500v8 r12 = this.A0C;
        if (r12.A03 != -1) {
            r12.A03 = -1;
        }
    }
}
