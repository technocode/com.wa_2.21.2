package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1bZ  reason: invalid class name and case insensitive filesystem */
public class C30571bZ implements AbstractC15900ov {
    public final /* synthetic */ RecyclerView A00;

    public C30571bZ(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public void A00(int i, int i2) {
        RecyclerView recyclerView = this.A00;
        int A01 = recyclerView.A0K.A01();
        for (int i3 = 0; i3 < A01; i3++) {
            AbstractC11910hD A012 = RecyclerView.A01(recyclerView.A0K.A04(i3));
            if (A012 != null && !A012.A0B() && A012.A05 >= i) {
                A012.A06(i2, false);
                recyclerView.A0z.A0D = true;
            }
        }
        ArrayList arrayList = recyclerView.A0x.A05;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC11910hD r1 = (AbstractC11910hD) arrayList.get(i4);
            if (r1 != null && r1.A05 >= i) {
                r1.A06(i2, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0l = true;
    }

    public void A01(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        int A01 = recyclerView.A0K.A01();
        int i5 = -1;
        int i6 = i;
        int i7 = i2;
        int i8 = 1;
        if (i < i2) {
            i7 = i;
            i6 = i2;
            i8 = -1;
        }
        for (int i9 = 0; i9 < A01; i9++) {
            AbstractC11910hD A012 = RecyclerView.A01(recyclerView.A0K.A04(i9));
            if (A012 != null && (i4 = A012.A05) >= i7 && i4 <= i6) {
                if (i4 == i) {
                    A012.A06(i2 - i, false);
                } else {
                    A012.A06(i8, false);
                }
                recyclerView.A0z.A0D = true;
            }
        }
        C16480ps r0 = recyclerView.A0x;
        int i10 = i;
        int i11 = i2;
        if (i >= i2) {
            i11 = i;
            i10 = i2;
            i5 = 1;
        }
        ArrayList arrayList = r0.A05;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            AbstractC11910hD r1 = (AbstractC11910hD) arrayList.get(i12);
            if (r1 != null && (i3 = r1.A05) >= i10 && i3 <= i11) {
                if (i3 == i) {
                    r1.A06(i2 - i, false);
                } else {
                    r1.A06(i5, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.A0l = true;
    }

    public void A02(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.A00;
        int A01 = recyclerView.A0K.A01();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < A01; i6++) {
            View A04 = recyclerView.A0K.A04(i6);
            AbstractC11910hD A012 = RecyclerView.A01(A04);
            if (A012 != null && !A012.A0B() && (i4 = A012.A05) >= i && i4 < i5) {
                A012.A04(2);
                if (obj == null) {
                    A012.A04(1024);
                } else if ((1024 & A012.A00) == 0) {
                    if (A012.A0E == null) {
                        ArrayList arrayList = new ArrayList();
                        A012.A0E = arrayList;
                        A012.A0F = Collections.unmodifiableList(arrayList);
                    }
                    A012.A0E.add(obj);
                }
                ((C16410pl) A04.getLayoutParams()).A01 = true;
            }
        }
        C16480ps r4 = recyclerView.A0x;
        ArrayList arrayList2 = r4.A05;
        int size = arrayList2.size();
        while (true) {
            size--;
            if (size >= 0) {
                AbstractC11910hD r1 = (AbstractC11910hD) arrayList2.get(size);
                if (r1 != null && (i3 = r1.A05) >= i && i3 < i5) {
                    r1.A04(2);
                    r4.A04(size);
                }
            } else {
                recyclerView.A0m = true;
                return;
            }
        }
    }

    public void A03(C15910ow r5) {
        int i = r5.A00;
        if (i == 1) {
            AnonymousClass0VT r3 = this.A00.A0S;
            int i2 = r5.A02;
            int i3 = r5.A01;
            if (r3 instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) r3).A17(i2, i3, 1);
            } else if (r3 instanceof GridLayoutManager) {
                ((GridLayoutManager) r3).A01.A00.clear();
            }
        } else if (i == 2) {
            AnonymousClass0VT r32 = this.A00.A0S;
            int i4 = r5.A02;
            int i5 = r5.A01;
            if (r32 instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) r32).A17(i4, i5, 2);
            } else if (r32 instanceof GridLayoutManager) {
                ((GridLayoutManager) r32).A01.A00.clear();
            }
        } else if (i == 4) {
            AnonymousClass0VT r33 = this.A00.A0S;
            int i6 = r5.A02;
            int i7 = r5.A01;
            if (r33 instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) r33).A17(i6, i7, 4);
            } else if (r33 instanceof GridLayoutManager) {
                ((GridLayoutManager) r33).A01.A00.clear();
            }
        } else if (i == 8) {
            AnonymousClass0VT r34 = this.A00.A0S;
            int i8 = r5.A02;
            int i9 = r5.A01;
            if (r34 instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) r34).A17(i8, i9, 8);
            } else if (r34 instanceof GridLayoutManager) {
                ((GridLayoutManager) r34).A01.A00.clear();
            }
        }
    }
}
