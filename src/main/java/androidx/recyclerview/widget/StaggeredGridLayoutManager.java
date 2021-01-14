package androidx.recyclerview.widget;

import X.AbstractC07830Zt;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0VR;
import X.AnonymousClass0VS;
import X.AnonymousClass0VT;
import X.C07890a3;
import X.C15050nJ;
import X.C16200pQ;
import X.C16400pk;
import X.C16410pl;
import X.C16480ps;
import X.C16550pz;
import X.C16570q1;
import X.C16580q2;
import X.C16600q4;
import X.C16610q5;
import X.C30671bj;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends AnonymousClass0VT implements AbstractC07830Zt {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public AnonymousClass0VS A07;
    public AnonymousClass0VS A08;
    public C16580q2 A09;
    public C16600q4 A0A;
    public BitSet A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int[] A0I;
    public C16610q5[] A0J;
    public final Rect A0K;
    public final C16200pQ A0L;
    public final C16550pz A0M;
    public final Runnable A0N;

    public StaggeredGridLayoutManager() {
        this.A06 = -1;
        this.A0F = false;
        this.A0G = false;
        this.A03 = -1;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A09 = new C16580q2();
        this.A01 = 2;
        this.A0K = new Rect();
        this.A0M = new C16550pz(this);
        this.A0C = false;
        this.A0H = true;
        this.A0N = new RunnableEBaseShape0S0100000_I0_0(this, 22);
        this.A02 = 1;
        A14(2);
        this.A0L = new C16200pQ();
        this.A07 = AnonymousClass0VS.A00(this, this.A02);
        this.A08 = AnonymousClass0VS.A00(this, 1 - this.A02);
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A06 = -1;
        this.A0F = false;
        this.A0G = false;
        this.A03 = -1;
        this.A04 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A09 = new C16580q2();
        this.A01 = 2;
        this.A0K = new Rect();
        this.A0M = new C16550pz(this);
        this.A0C = false;
        this.A0H = true;
        this.A0N = new RunnableEBaseShape0S0100000_I0_0(this, 22);
        C16400pk A072 = AnonymousClass0VT.A07(context, attributeSet, i, i2);
        int i3 = A072.A00;
        if (i3 == 0 || i3 == 1) {
            A0c(null);
            if (i3 != this.A02) {
                this.A02 = i3;
                AnonymousClass0VS r1 = this.A07;
                this.A07 = this.A08;
                this.A08 = r1;
                A0K();
            }
            A14(A072.A01);
            boolean z = A072.A02;
            A0c(null);
            C16600q4 r12 = this.A0A;
            if (!(r12 == null || r12.A07 == z)) {
                r12.A07 = z;
            }
            this.A0F = z;
            A0K();
            this.A0L = new C16200pQ();
            this.A07 = AnonymousClass0VS.A00(this, this.A02);
            this.A08 = AnonymousClass0VS.A00(this, 1 - this.A02);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public static final int A0A(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    @Override // X.AnonymousClass0VT
    public int A0j(C16480ps r3, AnonymousClass0VR r4) {
        if (this.A02 == 1) {
            return this.A06;
        }
        return super.A0j(r3, r4);
    }

    @Override // X.AnonymousClass0VT
    public int A0k(C16480ps r2, AnonymousClass0VR r3) {
        if (this.A02 == 0) {
            return this.A06;
        }
        return super.A0k(r2, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r11.A02 == 0) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        if (A1J() != false) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009f, code lost:
        if (A1J() != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        if (r11.A02 == 1) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0123 A[LOOP:3: B:95:0x0123->B:104:0x013a, LOOP_START, PHI: r1 
      PHI: (r1v2 int) = (r1v1 int), (r1v3 int) binds: [B:81:0x00fd, B:104:0x013a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AnonymousClass0VT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0l(android.view.View r12, int r13, X.C16480ps r14, X.AnonymousClass0VR r15) {
        /*
        // Method dump skipped, instructions count: 325
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0l(android.view.View, int, X.0ps, X.0VR):android.view.View");
    }

    @Override // X.AnonymousClass0VT
    public void A0m(int i) {
        super.A0m(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C16610q5 r2 = this.A0J[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    @Override // X.AnonymousClass0VT
    public void A0n(int i) {
        super.A0n(i);
        for (int i2 = 0; i2 < this.A06; i2++) {
            C16610q5 r2 = this.A0J[i2];
            int i3 = r2.A01;
            if (i3 != Integer.MIN_VALUE) {
                r2.A01 = i3 + i;
            }
            int i4 = r2.A00;
            if (i4 != Integer.MIN_VALUE) {
                r2.A00 = i4 + i;
            }
        }
    }

    @Override // X.AnonymousClass0VT
    public void A0o(Rect rect, int i, int i2) {
        int A002;
        int A003;
        int A0E2 = A0E() + A0D();
        int A0C2 = A0C() + A0F();
        if (this.A02 == 1) {
            A003 = AnonymousClass0VT.A00(i2, rect.height() + A0C2, super.A07.getMinimumHeight());
            A002 = AnonymousClass0VT.A00(i, (this.A05 * this.A06) + A0E2, super.A07.getMinimumWidth());
        } else {
            A002 = AnonymousClass0VT.A00(i, rect.width() + A0E2, super.A07.getMinimumWidth());
            A003 = AnonymousClass0VT.A00(i2, (this.A05 * this.A06) + A0C2, super.A07.getMinimumHeight());
        }
        super.A07.setMeasuredDimension(A002, A003);
    }

    @Override // X.AnonymousClass0VT
    public void A0p(C16480ps r2, AnonymousClass0VR r3) {
        A1G(r2, r3, true);
    }

    @Override // X.AnonymousClass0VT
    public void A0q(C16480ps r5, AnonymousClass0VR r6, View view, C07890a3 r8) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C30671bj)) {
            super.A0T(view, r8);
            return;
        }
        C30671bj r1 = (C30671bj) layoutParams;
        if (this.A02 == 0) {
            C16610q5 r0 = r1.A00;
            if (r0 == null) {
                i3 = -1;
            } else {
                i3 = r0.A04;
            }
            boolean z = r1.A01;
            if (z) {
                i4 = this.A06;
            } else {
                i4 = 1;
            }
            r8.A08(C15050nJ.A00(i3, i4, -1, -1, z));
            return;
        }
        C16610q5 r02 = r1.A00;
        if (r02 == null) {
            i = -1;
        } else {
            i = r02.A04;
        }
        boolean z2 = r1.A01;
        if (z2) {
            i2 = this.A06;
        } else {
            i2 = 1;
        }
        r8.A08(C15050nJ.A00(-1, -1, i, i2, z2));
    }

    public int A0r() {
        if (A0A() != 0) {
            return AnonymousClass0VT.A06(A0I(0));
        }
        return 0;
    }

    public int A0s() {
        int A0A2 = A0A();
        if (A0A2 == 0) {
            return 0;
        }
        return AnonymousClass0VT.A06(A0I(A0A2 - 1));
    }

    public final int A0t(int i) {
        int A022 = this.A0J[0].A02(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A023 = this.A0J[i2].A02(i);
            if (A023 > A022) {
                A022 = A023;
            }
        }
        return A022;
    }

    public final int A0u(int i) {
        int A032 = this.A0J[0].A03(i);
        for (int i2 = 1; i2 < this.A06; i2++) {
            int A033 = this.A0J[i2].A03(i);
            if (A033 < A032) {
                A032 = A033;
            }
        }
        return A032;
    }

    public int A0v(int i, C16480ps r6, AnonymousClass0VR r7) {
        if (A0A() == 0 || i == 0) {
            return 0;
        }
        A18(i, r7);
        C16200pQ r2 = this.A0L;
        int A0w = A0w(r6, r2, r7);
        if (r2.A00 >= A0w) {
            i = A0w;
            if (i < 0) {
                i = -A0w;
            }
        }
        this.A07.A0C(-i);
        this.A0D = this.A0G;
        r2.A00 = 0;
        A1D(r6, r2);
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r6 >= r22.A00()) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0334  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0w(X.C16480ps r20, X.C16200pQ r21, X.AnonymousClass0VR r22) {
        /*
        // Method dump skipped, instructions count: 873
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A0w(X.0ps, X.0pQ, X.0VR):int");
    }

    public final int A0x(AnonymousClass0VR r7) {
        if (A0A() == 0) {
            return 0;
        }
        return AnonymousClass0N2.A0C(r7, this.A07, A12(!this.A0H), A11(!this.A0H), this, this.A0H);
    }

    public final int A0y(AnonymousClass0VR r8) {
        if (A0A() == 0) {
            return 0;
        }
        return AnonymousClass0N2.A0E(r8, this.A07, A12(!this.A0H), A11(!this.A0H), this, this.A0H, this.A0G);
    }

    public final int A0z(AnonymousClass0VR r7) {
        if (A0A() == 0) {
            return 0;
        }
        return AnonymousClass0N2.A0D(r7, this.A07, A12(!this.A0H), A11(!this.A0H), this, this.A0H);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (A1J() == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A10() {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A10():android.view.View");
    }

    public View A11(boolean z) {
        int A042 = this.A07.A04();
        int A022 = this.A07.A02();
        View view = null;
        for (int A0A2 = A0A() - 1; A0A2 >= 0; A0A2--) {
            View A0I2 = A0I(A0A2);
            int A092 = this.A07.A09(A0I2);
            int A062 = this.A07.A06(A0I2);
            if (A062 > A042 && A092 < A022) {
                if (A062 <= A022 || !z) {
                    return A0I2;
                }
                if (view == null) {
                    view = A0I2;
                }
            }
        }
        return view;
    }

    public View A12(boolean z) {
        int A042 = this.A07.A04();
        int A022 = this.A07.A02();
        int A0A2 = A0A();
        View view = null;
        for (int i = 0; i < A0A2; i++) {
            View A0I2 = A0I(i);
            int A092 = this.A07.A09(A0I2);
            if (this.A07.A06(A0I2) > A042 && A092 < A022) {
                if (A092 >= A042 || !z) {
                    return A0I2;
                }
                if (view == null) {
                    view = A0I2;
                }
            }
        }
        return view;
    }

    public final void A13() {
        if (this.A02 == 1 || !A1J()) {
            this.A0G = this.A0F;
        } else {
            this.A0G = !this.A0F;
        }
    }

    public void A14(int i) {
        A0c(null);
        if (i != this.A06) {
            this.A09.A02();
            A0K();
            this.A06 = i;
            this.A0B = new BitSet(i);
            C16610q5[] r2 = new C16610q5[i];
            this.A0J = r2;
            for (int i2 = 0; i2 < i; i2++) {
                r2[i2] = new C16610q5(this, i2);
            }
            A0K();
        }
    }

    public final void A15(int i) {
        C16200pQ r4 = this.A0L;
        r4.A04 = i;
        boolean z = this.A0G;
        int i2 = 1;
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        if (z != z2) {
            i2 = -1;
        }
        r4.A03 = i2;
    }

    public final void A16(int i, int i2) {
        for (int i3 = 0; i3 < this.A06; i3++) {
            C16610q5[] r1 = this.A0J;
            if (!r1[i3].A03.isEmpty()) {
                A1H(r1[i3], i, i2);
            }
        }
    }

    public final void A17(int i, int i2, int i3) {
        int A0r;
        int i4;
        int i5;
        int A0s;
        if (this.A0G) {
            A0r = A0s();
        } else {
            A0r = A0r();
        }
        if (i3 == 8) {
            i4 = i2 + 1;
            if (i >= i2) {
                i4 = i + 1;
                i5 = i2;
            }
            i5 = i;
        } else {
            i4 = i + i2;
            i5 = i;
        }
        this.A09.A05(i5);
        if (i3 == 1) {
            this.A09.A06(i, i2);
        } else if (i3 == 2) {
            this.A09.A07(i, i2);
        } else if (i3 == 8) {
            this.A09.A07(i, 1);
            this.A09.A06(i2, 1);
        }
        if (i4 > A0r) {
            if (this.A0G) {
                A0s = A0r();
            } else {
                A0s = A0s();
            }
            if (i5 <= A0s) {
                A0K();
            }
        }
    }

    public void A18(int i, AnonymousClass0VR r6) {
        int A0r;
        int i2;
        if (i > 0) {
            A0r = A0s();
            i2 = 1;
        } else {
            A0r = A0r();
            i2 = -1;
        }
        C16200pQ r1 = this.A0L;
        r1.A07 = true;
        A19(A0r, r6);
        A15(i2);
        r1.A01 = A0r + r1.A03;
        r1.A00 = Math.abs(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A19(int r8, X.AnonymousClass0VR r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A19(int, X.0VR):void");
    }

    public final void A1A(View view, int i, int i2) {
        Rect rect = this.A0K;
        A0R(view, rect);
        C16410pl r4 = (C16410pl) view.getLayoutParams();
        int A0A2 = A0A(i, ((ViewGroup.MarginLayoutParams) r4).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) r4).rightMargin + rect.right);
        int A0A3 = A0A(i2, ((ViewGroup.MarginLayoutParams) r4).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) r4).bottomMargin + rect.bottom);
        if (A0h(view, A0A2, A0A3, r4)) {
            view.measure(A0A2, A0A3);
        }
    }

    public final void A1B(C16480ps r7, int i) {
        for (int A0A2 = A0A() - 1; A0A2 >= 0; A0A2--) {
            View A0I2 = A0I(A0A2);
            if (this.A07.A09(A0I2) >= i && this.A07.A0B(A0I2) >= i) {
                C30671bj r4 = (C30671bj) A0I2.getLayoutParams();
                if (r4.A01) {
                    for (int i2 = 0; i2 < this.A06; i2++) {
                        if (this.A0J[i2].A03.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.A06; i3++) {
                        this.A0J[i3].A09();
                    }
                } else if (r4.A00.A03.size() != 1) {
                    r4.A00.A09();
                } else {
                    return;
                }
                A0U(A0I2, r7);
            } else {
                return;
            }
        }
    }

    public final void A1C(C16480ps r6, int i) {
        while (A0A() > 0) {
            View A0I2 = A0I(0);
            if (this.A07.A06(A0I2) <= i && this.A07.A0A(A0I2) <= i) {
                C30671bj r1 = (C30671bj) A0I2.getLayoutParams();
                if (r1.A01) {
                    for (int i2 = 0; i2 < this.A06; i2++) {
                        if (this.A0J[i2].A03.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.A06; i3++) {
                        this.A0J[i3].A0A();
                    }
                } else {
                    C16610q5 r12 = r1.A00;
                    if (r12.A03.size() != 1) {
                        r12.A0A();
                    } else {
                        return;
                    }
                }
                A0U(A0I2, r6);
            } else {
                return;
            }
        }
    }

    public final void A1D(C16480ps r6, C16200pQ r7) {
        int min;
        int min2;
        if (r7.A07 && !r7.A06) {
            if (r7.A00 != 0) {
                int i = 1;
                if (r7.A04 == -1) {
                    int i2 = r7.A05;
                    int A032 = this.A0J[0].A03(i2);
                    while (i < this.A06) {
                        int A033 = this.A0J[i].A03(i2);
                        if (A033 > A032) {
                            A032 = A033;
                        }
                        i++;
                    }
                    int i3 = i2 - A032;
                    if (i3 < 0) {
                        min2 = r7.A02;
                    } else {
                        min2 = r7.A02 - Math.min(i3, r7.A00);
                    }
                    A1B(r6, min2);
                    return;
                }
                int i4 = r7.A02;
                int A022 = this.A0J[0].A02(i4);
                while (i < this.A06) {
                    int A023 = this.A0J[i].A02(i4);
                    if (A023 < A022) {
                        A022 = A023;
                    }
                    i++;
                }
                int i5 = A022 - r7.A02;
                if (i5 < 0) {
                    min = r7.A05;
                } else {
                    min = Math.min(i5, r7.A00) + r7.A05;
                }
                A1C(r6, min);
            } else if (r7.A04 == -1) {
                A1B(r6, r7.A02);
            } else {
                A1C(r6, r7.A05);
            }
        }
    }

    public final void A1E(C16480ps r4, AnonymousClass0VR r5, boolean z) {
        int A022;
        int A0t = A0t(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        if (A0t != Integer.MIN_VALUE && (A022 = this.A07.A02() - A0t) > 0) {
            int i = A022 - (-A0v(-A022, r4, r5));
            if (z && i > 0) {
                this.A07.A0C(i);
            }
        }
    }

    public final void A1F(C16480ps r4, AnonymousClass0VR r5, boolean z) {
        int A042;
        int A0u = A0u(Integer.MAX_VALUE);
        if (A0u != Integer.MAX_VALUE && (A042 = A0u - this.A07.A04()) > 0) {
            int A0v = A042 - A0v(A042, r4, r5);
            if (z && A0v > 0) {
                this.A07.A0C(-A0v);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c9, code lost:
        if (r11.A0G != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01ed, code lost:
        if (r2 != r11.A0G) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ef, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0404, code lost:
        if (A1I() != false) goto L_0x0406;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1G(X.C16480ps r12, X.AnonymousClass0VR r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1065
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A1G(X.0ps, X.0VR, boolean):void");
    }

    public final void A1H(C16610q5 r5, int i, int i2) {
        int i3 = r5.A02;
        if (i == -1) {
            int i4 = r5.A01;
            if (i4 == Integer.MIN_VALUE) {
                r5.A07();
                i4 = r5.A01;
            }
            if (i4 + i3 <= i2) {
                this.A0B.set(r5.A04, false);
                return;
            }
            return;
        }
        int i5 = r5.A00;
        if (i5 == Integer.MIN_VALUE) {
            r5.A06();
            i5 = r5.A00;
        }
        if (i5 - i3 >= i2) {
            this.A0B.set(r5.A04, false);
        }
    }

    public boolean A1I() {
        int A0r;
        int A0s;
        if (A0A() == 0 || this.A01 == 0 || !super.A0B) {
            return false;
        }
        if (this.A0G) {
            A0r = A0s();
            A0s = A0r();
        } else {
            A0r = A0r();
            A0s = A0s();
        }
        if (A0r == 0 && A10() != null) {
            this.A09.A02();
            super.A0F = true;
            A0K();
            return true;
        } else if (!this.A0C) {
            return false;
        } else {
            int i = 1;
            if (this.A0G) {
                i = -1;
            }
            int i2 = A0s + 1;
            C16570q1 A012 = this.A09.A01(A0r, i2, i);
            if (A012 == null) {
                this.A0C = false;
                this.A09.A04(i2);
                return false;
            }
            C16570q1 A013 = this.A09.A01(A0r, A012.A01, -i);
            if (A013 == null) {
                this.A09.A04(A012.A01);
            } else {
                this.A09.A04(A013.A01 + 1);
            }
            super.A0F = true;
            A0K();
            return true;
        }
    }

    public boolean A1J() {
        return AnonymousClass0Q7.A05(super.A07) == 1;
    }

    public final boolean A1K(int i) {
        if (this.A02 == 0) {
            boolean z = false;
            if (i == -1) {
                z = true;
            }
            if (z == this.A0G) {
                return false;
            }
            return true;
        }
        boolean z2 = false;
        if (i == -1) {
            z2 = true;
        }
        boolean z3 = false;
        if (z2 == this.A0G) {
            z3 = true;
        }
        if (z3 != A1J()) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC07830Zt
    public PointF A2v(int i) {
        int i2 = -1;
        if (A0A() != 0) {
            boolean z = false;
            if (i < A0r()) {
                z = true;
            }
            if (z == this.A0G) {
                i2 = 1;
            }
        } else if (this.A0G) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (this.A02 == 0) {
            pointF.x = (float) i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = (float) i2;
        return pointF;
    }
}
