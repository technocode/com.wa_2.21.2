package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0oz  reason: invalid class name and case insensitive filesystem */
public class C15940oz {
    public final C15920ox A00 = new C15920ox();
    public final AbstractC15930oy A01;
    public final List A02 = new ArrayList();

    public C15940oz(AbstractC15930oy r2) {
        this.A01 = r2;
    }

    public int A00() {
        return ((C30561bY) this.A01).A00.getChildCount() - this.A02.size();
    }

    public int A01() {
        return ((C30561bY) this.A01).A00.getChildCount();
    }

    public final int A02(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C30561bY) this.A01).A00.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C15920ox r1 = this.A00;
            int A002 = i - (i2 - r1.A00(i2));
            if (A002 != 0) {
                i2 += A002;
            } else {
                while (r1.A06(i2)) {
                    i2++;
                }
                return i2;
            }
        }
        return -1;
    }

    public View A03(int i) {
        return ((C30561bY) this.A01).A00.getChildAt(A02(i));
    }

    public View A04(int i) {
        return ((C30561bY) this.A01).A00.getChildAt(i);
    }

    public void A05(int i) {
        AbstractC11910hD A012;
        int A022 = A02(i);
        this.A00.A07(A022);
        RecyclerView recyclerView = ((C30561bY) this.A01).A00;
        View childAt = recyclerView.getChildAt(A022);
        if (!(childAt == null || (A012 = RecyclerView.A01(childAt)) == null)) {
            if (!A012.A0A() || A012.A0B()) {
                A012.A04(256);
            } else {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(A012);
                throw new IllegalArgumentException(AnonymousClass008.A0D(recyclerView, sb));
            }
        }
        recyclerView.detachViewFromParent((RecyclerView) A022);
    }

    public final void A06(View view) {
        this.A02.add(view);
        C30561bY r0 = (C30561bY) this.A01;
        if (r0 != null) {
            AbstractC11910hD A012 = RecyclerView.A01(view);
            if (A012 != null) {
                RecyclerView recyclerView = r0.A00;
                int i = A012.A04;
                if (i != -1) {
                    A012.A07 = i;
                } else {
                    A012.A07 = A012.A0H.getImportantForAccessibility();
                }
                recyclerView.A0p(A012, 4);
                return;
            }
            return;
        }
        throw null;
    }

    public final void A07(View view) {
        if (this.A02.remove(view)) {
            C30561bY r0 = (C30561bY) this.A01;
            if (r0 != null) {
                AbstractC11910hD A012 = RecyclerView.A01(view);
                if (A012 != null) {
                    r0.A00.A0p(A012, A012.A07);
                    A012.A07 = 0;
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public void A08(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int A022;
        if (i < 0) {
            A022 = ((C30561bY) this.A01).A00.getChildCount();
        } else {
            A022 = A02(i);
        }
        this.A00.A05(A022, z);
        if (z) {
            A06(view);
        }
        C30561bY r3 = (C30561bY) this.A01;
        if (r3 != null) {
            AbstractC11910hD A012 = RecyclerView.A01(view);
            if (A012 != null) {
                if (A012.A0A() || A012.A0B()) {
                    A012.A00 &= -257;
                } else {
                    StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                    sb.append(A012);
                    throw new IllegalArgumentException(AnonymousClass008.A0D(r3.A00, sb));
                }
            }
            r3.A00.attachViewToParent(view, A022, layoutParams);
            return;
        }
        throw null;
    }

    public void A09(View view, int i, boolean z) {
        int A022;
        if (i < 0) {
            A022 = ((C30561bY) this.A01).A00.getChildCount();
        } else {
            A022 = A02(i);
        }
        this.A00.A05(A022, z);
        if (z) {
            A06(view);
        }
        RecyclerView recyclerView = ((C30561bY) this.A01).A00;
        recyclerView.addView(view, A022);
        AbstractC11910hD A012 = RecyclerView.A01(view);
        AbstractC16300pa r0 = recyclerView.A0N;
        if (!(r0 == null || A012 == null)) {
            r0.A03(A012);
        }
        List list = recyclerView.A0a;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AbstractC16420pm) recyclerView.A0a.get(size)).AE4(view);
                } else {
                    return;
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.toString());
        sb.append(", hidden list:");
        sb.append(this.A02.size());
        return sb.toString();
    }
}
