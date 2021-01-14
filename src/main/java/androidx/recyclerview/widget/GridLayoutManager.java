package androidx.recyclerview.widget;

import X.AbstractC16130pJ;
import X.AnonymousClass008;
import X.AnonymousClass0VR;
import X.AnonymousClass0VT;
import X.C07890a3;
import X.C15050nJ;
import X.C16410pl;
import X.C16480ps;
import X.C30461bO;
import X.C30471bP;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;

public class GridLayoutManager extends LinearLayoutManager {
    public int A00 = -1;
    public AbstractC16130pJ A01 = new C30461bO();
    public boolean A02 = false;
    public int[] A03;
    public View[] A04;
    public final Rect A05 = new Rect();
    public final SparseIntArray A06 = new SparseIntArray();
    public final SparseIntArray A07 = new SparseIntArray();

    public GridLayoutManager(int i) {
        super(1);
        A1N(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A1N(AnonymousClass0VT.A07(context, attributeSet, i, i2).A01);
    }

    @Override // X.AnonymousClass0VT
    public int A0j(C16480ps r3, AnonymousClass0VR r4) {
        if (((LinearLayoutManager) this).A01 == 1) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A1I(r3, r4, A002 - 1) + 1;
    }

    @Override // X.AnonymousClass0VT
    public int A0k(C16480ps r3, AnonymousClass0VR r4) {
        if (((LinearLayoutManager) this).A01 == 0) {
            return this.A00;
        }
        int A002 = r4.A00();
        if (A002 < 1) {
            return 0;
        }
        return A1I(r3, r4, A002 - 1) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (A1H() == false) goto L_0x0063;
     */
    @Override // X.AnonymousClass0VT, androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0l(android.view.View r24, int r25, X.C16480ps r26, X.AnonymousClass0VR r27) {
        /*
        // Method dump skipped, instructions count: 288
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.A0l(android.view.View, int, X.0ps, X.0VR):android.view.View");
    }

    @Override // X.AnonymousClass0VT
    public void A0o(Rect rect, int i, int i2) {
        int A002;
        int A003;
        if (this.A03 == null) {
            super.A0o(rect, i, i2);
        }
        int A0E = A0E() + A0D();
        int A0C = A0C() + A0F();
        if (((LinearLayoutManager) this).A01 == 1) {
            A003 = AnonymousClass0VT.A00(i2, rect.height() + A0C, ((AnonymousClass0VT) this).A07.getMinimumHeight());
            int[] iArr = this.A03;
            A002 = AnonymousClass0VT.A00(i, iArr[iArr.length - 1] + A0E, ((AnonymousClass0VT) this).A07.getMinimumWidth());
        } else {
            A002 = AnonymousClass0VT.A00(i, rect.width() + A0E, ((AnonymousClass0VT) this).A07.getMinimumWidth());
            int[] iArr2 = this.A03;
            A003 = AnonymousClass0VT.A00(i2, iArr2[iArr2.length - 1] + A0C, ((AnonymousClass0VT) this).A07.getMinimumHeight());
        }
        ((AnonymousClass0VT) this).A07.setMeasuredDimension(A002, A003);
    }

    @Override // X.AnonymousClass0VT, androidx.recyclerview.widget.LinearLayoutManager
    public void A0p(C16480ps r7, AnonymousClass0VR r8) {
        if (r8.A09) {
            int A0A = A0A();
            for (int i = 0; i < A0A; i++) {
                C30471bP r3 = (C30471bP) A0I(i).getLayoutParams();
                int A012 = ((C16410pl) r3).A00.A01();
                this.A07.put(A012, r3.A01);
                this.A06.put(A012, r3.A00);
            }
        }
        super.A0p(r7, r8);
        this.A07.clear();
        this.A06.clear();
    }

    @Override // X.AnonymousClass0VT
    public void A0q(C16480ps r7, AnonymousClass0VR r8, View view, C07890a3 r10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C30471bP)) {
            super.A0T(view, r10);
            return;
        }
        C30471bP r2 = (C30471bP) layoutParams;
        int A1I = A1I(r7, r8, ((C16410pl) r2).A00.A01());
        boolean z = true;
        if (((LinearLayoutManager) this).A01 == 0) {
            int i = r2.A00;
            int i2 = r2.A01;
            int i3 = this.A00;
            if (i3 <= 1 || i2 != i3) {
                z = false;
            }
            r10.A08(C15050nJ.A00(i, i2, A1I, 1, z));
            return;
        }
        int i4 = r2.A00;
        int i5 = r2.A01;
        int i6 = this.A00;
        if (i6 <= 1 || i5 != i6) {
            z = false;
        }
        r10.A08(C15050nJ.A00(A1I, 1, i4, i5, z));
    }

    public final int A1I(C16480ps r9, AnonymousClass0VR r10, int i) {
        if (!r10.A09) {
            AbstractC16130pJ r6 = this.A01;
            int i2 = this.A00;
            int A002 = r6.A00(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int A003 = r6.A00(i5);
                i3 += A003;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = A003;
                }
            }
            if (i3 + A002 > i2) {
                return i4 + 1;
            }
            return i4;
        }
        int A004 = r9.A00(i);
        if (A004 == -1) {
            AnonymousClass008.A0x("Cannot find span size for pre layout position. ", i, "GridLayoutManager");
            return 0;
        }
        AbstractC16130pJ r62 = this.A01;
        int i6 = this.A00;
        int A005 = r62.A00(A004);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < A004; i9++) {
            int A006 = r62.A00(i9);
            i7 += A006;
            if (i7 == i6) {
                i8++;
                i7 = 0;
            } else if (i7 > i6) {
                i8++;
                i7 = A006;
            }
        }
        if (i7 + A005 > i6) {
            return i8 + 1;
        }
        return i8;
    }

    public final int A1J(C16480ps r4, AnonymousClass0VR r5, int i) {
        if (!r5.A09) {
            return this.A01.A01(i, this.A00);
        }
        int i2 = this.A06.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A002 = r4.A00(i);
        if (A002 != -1) {
            return this.A01.A01(A002, this.A00);
        }
        AnonymousClass008.A0x("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
        return 0;
    }

    public final int A1K(C16480ps r4, AnonymousClass0VR r5, int i) {
        if (!r5.A09) {
            return this.A01.A00(i);
        }
        int i2 = this.A07.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int A002 = r4.A00(i);
        if (A002 != -1) {
            return this.A01.A00(A002);
        }
        AnonymousClass008.A0x("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
        return 1;
    }

    public final void A1L() {
        View[] viewArr = this.A04;
        if (viewArr == null || viewArr.length != this.A00) {
            this.A04 = new View[this.A00];
        }
    }

    public final void A1M() {
        int A0C;
        int A0F;
        if (((LinearLayoutManager) this).A01 == 1) {
            A0C = ((AnonymousClass0VT) this).A03 - A0E();
            A0F = A0D();
        } else {
            A0C = ((AnonymousClass0VT) this).A00 - A0C();
            A0F = A0F();
        }
        A1O(A0C - A0F);
    }

    public void A1N(int i) {
        if (i != this.A00) {
            this.A02 = true;
            if (i >= 1) {
                this.A00 = i;
                this.A01.A00.clear();
                A0K();
                return;
            }
            throw new IllegalArgumentException(AnonymousClass008.A0F("Span count should be at least 1. Provided ", i));
        }
    }

    public final void A1O(int i) {
        int i2;
        int length;
        int[] iArr = this.A03;
        int i3 = this.A00;
        if (!(iArr != null && (length = iArr.length) == i3 + 1 && iArr[length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.A03 = iArr;
    }

    public final void A1P(View view, int i, int i2, boolean z) {
        C16410pl r2 = (C16410pl) view.getLayoutParams();
        if (z) {
            if (AnonymousClass0VT.A09(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) r2).width) && AnonymousClass0VT.A09(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) r2).height)) {
                return;
            }
        } else if (!A0h(view, i, i2, r2)) {
            return;
        }
        view.measure(i, i2);
    }

    public final void A1Q(View view, int i, boolean z) {
        int i2;
        int A012;
        int A013;
        C30471bP r5 = (C30471bP) view.getLayoutParams();
        Rect rect = r5.A03;
        int i3 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) r5).topMargin + ((ViewGroup.MarginLayoutParams) r5).bottomMargin;
        int i4 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) r5).leftMargin + ((ViewGroup.MarginLayoutParams) r5).rightMargin;
        int i5 = r5.A00;
        int i6 = r5.A01;
        if (((LinearLayoutManager) this).A01 != 1 || !A1H()) {
            int[] iArr = this.A03;
            i2 = iArr[i6 + i5] - iArr[i5];
        } else {
            int[] iArr2 = this.A03;
            int i7 = this.A00 - i5;
            i2 = iArr2[i7] - iArr2[i7 - i6];
        }
        if (((LinearLayoutManager) this).A01 == 1) {
            A013 = AnonymousClass0VT.A01(i2, i, i4, ((ViewGroup.MarginLayoutParams) r5).width, false);
            A012 = AnonymousClass0VT.A01(((LinearLayoutManager) this).A06.A05(), ((AnonymousClass0VT) this).A01, i3, ((ViewGroup.MarginLayoutParams) r5).height, true);
        } else {
            A012 = AnonymousClass0VT.A01(i2, i, i3, ((ViewGroup.MarginLayoutParams) r5).height, false);
            A013 = AnonymousClass0VT.A01(((LinearLayoutManager) this).A06.A05(), ((AnonymousClass0VT) this).A04, i4, ((ViewGroup.MarginLayoutParams) r5).width, true);
        }
        A1P(view, A013, A012, z);
    }
}
