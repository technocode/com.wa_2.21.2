package X;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0pI  reason: invalid class name and case insensitive filesystem */
public final class RunnableC16120pI extends RunnableEmptyBase implements Runnable {
    public static Comparator A04 = new C16100pG();
    public static final ThreadLocal A05 = new ThreadLocal();
    public long A00;
    public long A01;
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();

    public static final AbstractC11910hD A00(RecyclerView recyclerView, int i, long j) {
        int A012 = recyclerView.A0K.A01();
        for (int i2 = 0; i2 < A012; i2++) {
            AbstractC11910hD A013 = RecyclerView.A01(recyclerView.A0K.A04(i2));
            if (A013.A05 == i && !A013.A08()) {
                return null;
            }
        }
        C16480ps r3 = recyclerView.A0x;
        try {
            recyclerView.A09++;
            AbstractC11910hD A014 = r3.A01(i, j);
            if (A014 != null) {
                if ((A014.A00 & 1) == 0 || A014.A08()) {
                    r3.A0A(A014, false);
                } else {
                    r3.A05(A014.A0H);
                }
            }
            return A014;
        } finally {
            recyclerView.A0s(false);
        }
    }

    public void A01(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C30451bN r0 = recyclerView.A0L;
        r0.A01 = i;
        r0.A02 = i2;
    }

    public void run() {
        WeakReference weakReference;
        RecyclerView recyclerView;
        C16110pH r0;
        try {
            C002601j.A01("RV Prefetch");
            ArrayList arrayList = this.A02;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView2 = (RecyclerView) this.A02.get(i);
                    if (recyclerView2.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView2.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    long nanos = TimeUnit.MILLISECONDS.toNanos(j) + this.A00;
                    int size2 = this.A02.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size2; i3++) {
                        RecyclerView recyclerView3 = (RecyclerView) this.A02.get(i3);
                        if (recyclerView3.getWindowVisibility() == 0) {
                            recyclerView3.A0L.A01(recyclerView3, false);
                            i2 += recyclerView3.A0L.A00;
                        }
                    }
                    this.A03.ensureCapacity(i2);
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        RecyclerView recyclerView4 = (RecyclerView) this.A02.get(i5);
                        if (recyclerView4.getWindowVisibility() == 0) {
                            C30451bN r13 = recyclerView4.A0L;
                            int abs = Math.abs(r13.A02) + Math.abs(r13.A01);
                            for (int i6 = 0; i6 < (r13.A00 << 1); i6 += 2) {
                                ArrayList arrayList2 = this.A03;
                                if (i4 >= arrayList2.size()) {
                                    r0 = new C16110pH();
                                    arrayList2.add(r0);
                                } else {
                                    r0 = (C16110pH) arrayList2.get(i4);
                                }
                                int[] iArr = r13.A03;
                                int i7 = iArr[i6 + 1];
                                boolean z = false;
                                if (i7 <= abs) {
                                    z = true;
                                }
                                r0.A04 = z;
                                r0.A02 = abs;
                                r0.A00 = i7;
                                r0.A03 = recyclerView4;
                                r0.A01 = iArr[i6];
                                i4++;
                            }
                        }
                    }
                    Collections.sort(this.A03, A04);
                    int i8 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.A03;
                        if (i8 >= arrayList3.size()) {
                            break;
                        }
                        C16110pH r8 = (C16110pH) arrayList3.get(i8);
                        if (r8.A03 == null) {
                            break;
                        }
                        AbstractC11910hD A002 = A00(r8.A03, r8.A01, r8.A04 ? Long.MAX_VALUE : nanos);
                        if (!(A002 == null || (weakReference = A002.A0D) == null || (A002.A00 & 1) == 0 || A002.A08() || (recyclerView = (RecyclerView) weakReference.get()) == null)) {
                            if (recyclerView.A0e && recyclerView.A0K.A01() != 0) {
                                recyclerView.A0P();
                            }
                            C30451bN r6 = recyclerView.A0L;
                            r6.A01(recyclerView, true);
                            if (r6.A00 != 0) {
                                try {
                                    C002601j.A01("RV Nested Prefetch");
                                    AnonymousClass0VR r5 = recyclerView.A0z;
                                    AbstractC16300pa r02 = recyclerView.A0N;
                                    r5.A04 = 1;
                                    r5.A03 = r02.A05();
                                    r5.A09 = false;
                                    r5.A0E = false;
                                    r5.A0A = false;
                                    for (int i9 = 0; i9 < (r6.A00 << 1); i9 += 2) {
                                        A00(recyclerView, r6.A03[i9], nanos);
                                    }
                                } finally {
                                    C002601j.A00();
                                }
                            }
                        }
                        r8.A04 = false;
                        r8.A02 = 0;
                        r8.A00 = 0;
                        r8.A03 = null;
                        r8.A01 = 0;
                        i8++;
                    }
                    return;
                }
            }
            this.A01 = 0;
            C002601j.A00();
        } finally {
            this.A01 = 0;
            C002601j.A00();
        }
    }
}
