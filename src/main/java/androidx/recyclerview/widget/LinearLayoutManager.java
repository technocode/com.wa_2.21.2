package androidx.recyclerview.widget;

import X.AbstractC07830Zt;
import X.AbstractC07840Zv;
import X.AnonymousClass008;
import X.AnonymousClass0N2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0VR;
import X.AnonymousClass0VS;
import X.AnonymousClass0VT;
import X.C16210pR;
import X.C16220pS;
import X.C16230pT;
import X.C16250pV;
import X.C16400pk;
import X.C16410pl;
import X.C16480ps;
import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;

public class LinearLayoutManager extends AnonymousClass0VT implements AbstractC07830Zt, AbstractC07840Zv {
    public int A00 = 2;
    public int A01 = 1;
    public int A02 = -1;
    public int A03 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public C16230pT A04;
    public C16250pV A05 = null;
    public AnonymousClass0VS A06;
    public boolean A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = true;
    public boolean A0B = false;
    public final C16210pR A0C = new C16210pR();
    public final C16220pS A0D = new C16220pS();

    public LinearLayoutManager(int i) {
        A1A(i);
        A0c(null);
        if (false != this.A08) {
            this.A08 = false;
            A0K();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C16400pk A072 = AnonymousClass0VT.A07(context, attributeSet, i, i2);
        A1A(A072.A00);
        boolean z = A072.A02;
        A0c(null);
        if (z != this.A08) {
            this.A08 = z;
            A0K();
        }
        boolean z2 = A072.A03;
        if (!(this instanceof GridLayoutManager)) {
            A0c(null);
            if (this.A0B != z2) {
                this.A0B = z2;
                A0K();
            }
        } else if (!z2) {
            A0c(null);
            if (this.A0B) {
                this.A0B = false;
                A0K();
            }
        } else {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
    }

    @Override // X.AnonymousClass0VT
    public View A0H(int i) {
        int A0A2 = A0A();
        if (A0A2 == 0) {
            return null;
        }
        int A062 = i - AnonymousClass0VT.A06(A0I(0));
        if (A062 >= 0 && A062 < A0A2) {
            View A0I = A0I(A062);
            if (AnonymousClass0VT.A06(A0I) == i) {
                return A0I;
            }
        }
        return super.A0H(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006c A[RETURN] */
    @Override // X.AnonymousClass0VT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0l(android.view.View r7, int r8, X.C16480ps r9, X.AnonymousClass0VR r10) {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0l(android.view.View, int, X.0ps, X.0VR):android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x033c, code lost:
        if (r4.A01() != 0) goto L_0x033e;
     */
    @Override // X.AnonymousClass0VT
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p(X.C16480ps r18, X.AnonymousClass0VR r19) {
        /*
        // Method dump skipped, instructions count: 1274
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0p(X.0ps, X.0VR):void");
    }

    public int A0r() {
        View A14 = A14(0, A0A(), true, false);
        if (A14 == null) {
            return -1;
        }
        return AnonymousClass0VT.A06(A14);
    }

    public int A0s() {
        View A14 = A14(0, A0A(), false, true);
        if (A14 == null) {
            return -1;
        }
        return AnonymousClass0VT.A06(A14);
    }

    public int A0t() {
        View A14 = A14(A0A() - 1, -1, true, false);
        if (A14 != null) {
            return AnonymousClass0VT.A06(A14);
        }
        return -1;
    }

    public int A0u() {
        View A14 = A14(A0A() - 1, -1, false, true);
        if (A14 != null) {
            return AnonymousClass0VT.A06(A14);
        }
        return -1;
    }

    public int A0v(int i) {
        if (i == 1) {
            return (this.A01 != 1 && A1H()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.A01 != 1 && A1H()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130 && this.A01 == 1) {
                        return 1;
                    }
                    return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else if (this.A01 != 0) {
                    return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                } else {
                    return 1;
                }
            } else if (this.A01 != 1) {
                return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                return -1;
            }
        } else if (this.A01 != 0) {
            return EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        } else {
            return -1;
        }
    }

    public int A0w(int i, C16480ps r7, AnonymousClass0VR r8) {
        if (A0A() == 0 || i == 0) {
            return 0;
        }
        this.A04.A0B = true;
        A18();
        int i2 = -1;
        if (i > 0) {
            i2 = 1;
        }
        int abs = Math.abs(i);
        A1E(i2, abs, true, r8);
        C16230pT r0 = this.A04;
        int A0x = A0x(r7, r0, r8, false) + r0.A07;
        if (A0x < 0) {
            return 0;
        }
        if (abs > A0x) {
            i = i2 * A0x;
        }
        this.A06.A0C(-i);
        this.A04.A04 = i;
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: androidx.recyclerview.widget.GridLayoutManager */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0243  */
    public int A0x(X.C16480ps r31, X.C16230pT r32, X.AnonymousClass0VR r33, boolean r34) {
        /*
        // Method dump skipped, instructions count: 1055
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A0x(X.0ps, X.0pT, X.0VR, boolean):int");
    }

    public final int A0y(AnonymousClass0VR r8) {
        if (A0A() == 0) {
            return 0;
        }
        A18();
        return AnonymousClass0N2.A0C(r8, this.A06, A17(!this.A0A), A16(!this.A0A), this, this.A0A);
    }

    public final int A0z(AnonymousClass0VR r9) {
        if (A0A() == 0) {
            return 0;
        }
        A18();
        return AnonymousClass0N2.A0E(r9, this.A06, A17(!this.A0A), A16(!this.A0A), this, this.A0A, this.A09);
    }

    public final int A10(AnonymousClass0VR r8) {
        if (A0A() == 0) {
            return 0;
        }
        A18();
        return AnonymousClass0N2.A0D(r8, this.A06, A17(!this.A0A), A16(!this.A0A), this, this.A0A);
    }

    public final View A11() {
        return A0I(this.A09 ? 0 : A0A() - 1);
    }

    public final View A12() {
        return A0I(this.A09 ? A0A() - 1 : 0);
    }

    public View A13(int i, int i2) {
        A18();
        if (i2 <= i && i2 >= i) {
            return A0I(i);
        }
        int i3 = 4161;
        int i4 = 4097;
        if (this.A06.A09(A0I(i)) < this.A06.A04()) {
            i3 = 16644;
            i4 = 16388;
        }
        if (this.A01 == 0) {
            return super.A08.A00(i, i2, i3, i4);
        }
        return super.A09.A00(i, i2, i3, i4);
    }

    public View A14(int i, int i2, boolean z, boolean z2) {
        A18();
        int i3 = 320;
        int i4 = 320;
        if (z) {
            i4 = 24579;
        }
        if (!z2) {
            i3 = 0;
        }
        if (this.A01 == 0) {
            return super.A08.A00(i, i2, i4, i3);
        }
        return super.A09.A00(i, i2, i4, i3);
    }

    public View A15(C16480ps r9, AnonymousClass0VR r10, int i, int i2, int i3) {
        if (!(this instanceof GridLayoutManager)) {
            A18();
            int A042 = this.A06.A04();
            int A022 = this.A06.A02();
            int i4 = -1;
            if (i2 > i) {
                i4 = 1;
            }
            View view = null;
            View view2 = null;
            while (i != i2) {
                View A0I = A0I(i);
                int A062 = AnonymousClass0VT.A06(A0I);
                if (A062 >= 0 && A062 < i3) {
                    if (((C16410pl) A0I.getLayoutParams()).A00.A09()) {
                        if (view2 == null) {
                            view2 = A0I;
                        }
                    } else if (this.A06.A09(A0I) < A022 && this.A06.A06(A0I) >= A042) {
                        return A0I;
                    } else {
                        if (view == null) {
                            view = A0I;
                        }
                    }
                }
                i += i4;
            }
            return view == null ? view2 : view;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this;
        gridLayoutManager.A18();
        int A043 = ((LinearLayoutManager) gridLayoutManager).A06.A04();
        int A023 = ((LinearLayoutManager) gridLayoutManager).A06.A02();
        int i5 = -1;
        if (i2 > i) {
            i5 = 1;
        }
        View view3 = null;
        View view4 = null;
        while (i != i2) {
            View A0I2 = gridLayoutManager.A0I(i);
            int A063 = AnonymousClass0VT.A06(A0I2);
            if (A063 >= 0 && A063 < i3 && gridLayoutManager.A1J(r9, r10, A063) == 0) {
                if (((C16410pl) A0I2.getLayoutParams()).A00.A09()) {
                    if (view4 == null) {
                        view4 = A0I2;
                    }
                } else if (((LinearLayoutManager) gridLayoutManager).A06.A09(A0I2) < A023 && ((LinearLayoutManager) gridLayoutManager).A06.A06(A0I2) >= A043) {
                    return A0I2;
                } else {
                    if (view3 == null) {
                        view3 = A0I2;
                    }
                }
            }
            i += i5;
        }
        return view3 == null ? view4 : view3;
    }

    public final View A16(boolean z) {
        if (this.A09) {
            return A14(0, A0A(), z, true);
        }
        return A14(A0A() - 1, -1, z, true);
    }

    public final View A17(boolean z) {
        if (this.A09) {
            return A14(A0A() - 1, -1, z, true);
        }
        return A14(0, A0A(), z, true);
    }

    public void A18() {
        if (this.A04 == null) {
            this.A04 = new C16230pT();
        }
    }

    public final void A19() {
        if (this.A01 == 1 || !A1H()) {
            this.A09 = this.A08;
        } else {
            this.A09 = !this.A08;
        }
    }

    public void A1A(int i) {
        if (i == 0 || i == 1) {
            A0c(null);
            if (i != this.A01 || this.A06 == null) {
                AnonymousClass0VS A002 = AnonymousClass0VS.A00(this, i);
                this.A06 = A002;
                this.A0C.A02 = A002;
                this.A01 = i;
                A0K();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass008.A0F("invalid orientation:", i));
    }

    public void A1B(int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        C16250pV r1 = this.A05;
        if (r1 != null) {
            r1.A01 = -1;
        }
        A0K();
    }

    public final void A1C(int i, int i2) {
        this.A04.A00 = this.A06.A02() - i2;
        C16230pT r3 = this.A04;
        int i3 = 1;
        if (this.A09) {
            i3 = -1;
        }
        r3.A03 = i3;
        r3.A01 = i;
        r3.A05 = 1;
        r3.A06 = i2;
        r3.A07 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public final void A1D(int i, int i2) {
        this.A04.A00 = i2 - this.A06.A04();
        C16230pT r3 = this.A04;
        r3.A01 = i;
        int i3 = -1;
        if (this.A09) {
            i3 = 1;
        }
        r3.A03 = i3;
        r3.A05 = -1;
        r3.A06 = i2;
        r3.A07 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.A01() != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1E(int r7, int r8, boolean r9, X.AnonymousClass0VR r10) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.A1E(int, int, boolean, X.0VR):void");
    }

    public final void A1F(C16480ps r3, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    View A0I = A0I(i3);
                    A0L(i3);
                    r3.A05(A0I);
                }
                return;
            }
            while (i > i2) {
                View A0I2 = A0I(i);
                A0L(i);
                r3.A05(A0I2);
                i--;
            }
        }
    }

    public final void A1G(C16480ps r7, C16230pT r8) {
        if (r8.A0B && !r8.A09) {
            int i = r8.A05;
            int i2 = r8.A07;
            if (i == -1) {
                int A0A2 = A0A();
                if (i2 >= 0) {
                    int A012 = this.A06.A01() - i2;
                    if (!this.A09) {
                        int i3 = A0A2 - 1;
                        for (int i4 = i3; i4 >= 0; i4--) {
                            View A0I = A0I(i4);
                            if (this.A06.A09(A0I) < A012 || this.A06.A0B(A0I) < A012) {
                                A1F(r7, i3, i4);
                                return;
                            }
                        }
                        return;
                    }
                    for (int i5 = 0; i5 < A0A2; i5++) {
                        View A0I2 = A0I(i5);
                        if (this.A06.A09(A0I2) < A012 || this.A06.A0B(A0I2) < A012) {
                            A1F(r7, 0, i5);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int A0A3 = A0A();
                if (this.A09) {
                    int i6 = A0A3 - 1;
                    for (int i7 = i6; i7 >= 0; i7--) {
                        View A0I3 = A0I(i7);
                        if (this.A06.A06(A0I3) > i2 || this.A06.A0A(A0I3) > i2) {
                            A1F(r7, i6, i7);
                            return;
                        }
                    }
                    return;
                }
                for (int i8 = 0; i8 < A0A3; i8++) {
                    View A0I4 = A0I(i8);
                    if (this.A06.A06(A0I4) > i2 || this.A06.A0A(A0I4) > i2) {
                        A1F(r7, 0, i8);
                        return;
                    }
                }
            }
        }
    }

    public boolean A1H() {
        return AnonymousClass0Q7.A05(super.A07) == 1;
    }

    @Override // X.AbstractC07830Zt
    public PointF A2v(int i) {
        if (A0A() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < AnonymousClass0VT.A06(A0I(0))) {
            z = true;
        }
        if (z != this.A09) {
            i2 = -1;
        }
        float f = (float) i2;
        if (this.A01 == 0) {
            return new PointF(f, 0.0f);
        }
        return new PointF(0.0f, f);
    }

    @Override // X.AbstractC07840Zv
    public void AM7(View view, View view2, int i, int i2) {
        RecyclerView recyclerView;
        if (this.A05 == null && (recyclerView = super.A07) != null) {
            recyclerView.A0r("Cannot drop a view during a scroll or layout calculation");
        }
        A18();
        A19();
        int A062 = AnonymousClass0VT.A06(view);
        int A063 = AnonymousClass0VT.A06(view2);
        char c = 65535;
        if (A062 < A063) {
            c = 1;
        }
        if (this.A09) {
            if (c == 1) {
                A1B(A063, this.A06.A02() - (this.A06.A07(view) + this.A06.A09(view2)));
            } else {
                A1B(A063, this.A06.A02() - this.A06.A06(view2));
            }
        } else if (c == 65535) {
            A1B(A063, this.A06.A09(view2));
        } else {
            A1B(A063, this.A06.A06(view2) - this.A06.A07(view));
        }
    }
}
