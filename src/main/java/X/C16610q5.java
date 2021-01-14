package X;

import android.view.View;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* renamed from: X.0q5  reason: invalid class name and case insensitive filesystem */
public class C16610q5 {
    public int A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    public int A02 = 0;
    public ArrayList A03 = new ArrayList();
    public final int A04;
    public final /* synthetic */ StaggeredGridLayoutManager A05;

    public C16610q5(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.A05 = staggeredGridLayoutManager;
        this.A04 = i;
    }

    public int A00() {
        if (this.A05.A0F) {
            return A04(this.A03.size() - 1, -1);
        }
        return A04(0, this.A03.size());
    }

    public int A01() {
        if (this.A05.A0F) {
            return A04(0, this.A03.size());
        }
        return A04(this.A03.size() - 1, -1);
    }

    public int A02(int i) {
        int i2 = this.A00;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A06();
        return this.A00;
    }

    public int A03(int i) {
        int i2 = this.A01;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.A03.size() == 0) {
            return i;
        }
        A07();
        return this.A01;
    }

    public int A04(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        int A042 = staggeredGridLayoutManager.A07.A04();
        int A022 = staggeredGridLayoutManager.A07.A02();
        int i3 = -1;
        if (i2 > i) {
            i3 = 1;
        }
        while (i != i2) {
            View view = (View) this.A03.get(i);
            int A09 = staggeredGridLayoutManager.A07.A09(view);
            int A06 = staggeredGridLayoutManager.A07.A06(view);
            boolean z = false;
            boolean z2 = false;
            if (A09 <= A022) {
                z2 = true;
            }
            if (A06 >= A042) {
                z = true;
            }
            if (z2 && z && (A09 < A042 || A06 > A022)) {
                return AnonymousClass0VT.A06(view);
            }
            i += i3;
        }
        return -1;
    }

    public View A05(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.A03.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.A03.get(size);
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
                if (staggeredGridLayoutManager.A0F && AnonymousClass0VT.A06(view2) >= i) {
                    break;
                } else if (staggeredGridLayoutManager.A0F || AnonymousClass0VT.A06(view2) > i) {
                    if (!view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                } else {
                    return view;
                }
            }
        } else {
            int size2 = this.A03.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) this.A03.get(i3);
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.A05;
                if ((staggeredGridLayoutManager2.A0F && AnonymousClass0VT.A06(view3) <= i) || ((!staggeredGridLayoutManager2.A0F && AnonymousClass0VT.A06(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    public void A06() {
        C16570q1 A002;
        int i;
        ArrayList arrayList = this.A03;
        View view = (View) arrayList.get(arrayList.size() - 1);
        C30671bj r2 = (C30671bj) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A00 = staggeredGridLayoutManager.A07.A06(view);
        if (r2.A01 && (A002 = staggeredGridLayoutManager.A09.A00(((C16410pl) r2).A00.A01())) != null && A002.A00 == 1) {
            int i2 = this.A00;
            int i3 = this.A04;
            int[] iArr = A002.A03;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.A00 = i2 + i;
        }
    }

    public void A07() {
        C16570q1 A002;
        int i = 0;
        View view = (View) this.A03.get(0);
        C30671bj r2 = (C30671bj) view.getLayoutParams();
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.A05;
        this.A01 = staggeredGridLayoutManager.A07.A09(view);
        if (r2.A01 && (A002 = staggeredGridLayoutManager.A09.A00(((C16410pl) r2).A00.A01())) != null && A002.A00 == -1) {
            int i2 = this.A01;
            int i3 = this.A04;
            int[] iArr = A002.A03;
            if (iArr != null) {
                i = iArr[i3];
            }
            this.A01 = i2 - i;
        }
    }

    public void A08() {
        this.A03.clear();
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        this.A02 = 0;
    }

    public void A09() {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        View view = (View) arrayList.remove(size - 1);
        C30671bj r1 = (C30671bj) view.getLayoutParams();
        r1.A00 = null;
        if (((C16410pl) r1).A00.A09() || r1.A00()) {
            this.A02 -= this.A05.A07.A07(view);
        }
        if (size == 1) {
            this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public void A0A() {
        View view = (View) this.A03.remove(0);
        C30671bj r1 = (C30671bj) view.getLayoutParams();
        r1.A00 = null;
        if (this.A03.size() == 0) {
            this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (((C16410pl) r1).A00.A09() || r1.A00()) {
            this.A02 -= this.A05.A07.A07(view);
        }
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
    }

    public void A0B(View view) {
        C30671bj r3 = (C30671bj) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(view);
        this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        if (arrayList.size() == 1) {
            this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (((C16410pl) r3).A00.A09() || r3.A00()) {
            this.A02 = this.A05.A07.A07(view) + this.A02;
        }
    }

    public void A0C(View view) {
        C30671bj r3 = (C30671bj) view.getLayoutParams();
        r3.A00 = this;
        ArrayList arrayList = this.A03;
        arrayList.add(0, view);
        this.A01 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        if (arrayList.size() == 1) {
            this.A00 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        }
        if (((C16410pl) r3).A00.A09() || r3.A00()) {
            this.A02 = this.A05.A07.A07(view) + this.A02;
        }
    }
}
