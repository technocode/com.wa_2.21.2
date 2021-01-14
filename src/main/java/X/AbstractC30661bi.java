package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1bi  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC30661bi extends AbstractC16430pn {
    public Scroller A00;
    public RecyclerView A01;
    public final AbstractC16450pp A02 = new C30651bh(this);

    public View A00(AnonymousClass0VT r4) {
        if (!(this instanceof AnonymousClass244)) {
            AnonymousClass242 r2 = (AnonymousClass242) this;
            if (r2 instanceof AnonymousClass29Z) {
                return ((AnonymousClass29Z) r2).A00.A02(r4);
            }
            if (r4.A0e()) {
                AnonymousClass0VS r1 = r2.A01;
                if (r1 == null || r1.A02 != r4) {
                    r1 = new C30541bW(r4);
                    r2.A01 = r1;
                }
                return AnonymousClass242.A01(r4, r1);
            } else if (!r4.A0d()) {
                return null;
            } else {
                AnonymousClass0VS r12 = r2.A00;
                if (r12 == null || r12.A02 != r4) {
                    r12 = new C30531bV(r4);
                    r2.A00 = r12;
                }
                return AnonymousClass242.A01(r4, r12);
            }
        } else {
            AnonymousClass244 r22 = (AnonymousClass244) this;
            if (r22 instanceof C463129a) {
                return ((C463129a) r22).A00.A02(r4);
            }
            if (r4.A0e()) {
                AnonymousClass0VS r13 = r22.A01;
                if (r13 == null || r13.A02 != r4) {
                    r13 = new C30541bW(r4);
                    r22.A01 = r13;
                }
                return AnonymousClass244.A01(r4, r13);
            } else if (!r4.A0d()) {
                return null;
            } else {
                AnonymousClass0VS r14 = r22.A00;
                if (r14 == null || r14.A02 != r4) {
                    r14 = new C30531bV(r4);
                    r22.A00 = r14;
                }
                return AnonymousClass244.A01(r4, r14);
            }
        }
    }

    public void A01() {
        AnonymousClass0VT r1;
        View A002;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && (r1 = recyclerView.A0S) != null && (A002 = A00(r1)) != null) {
            int[] A03 = A03(r1, A002);
            int i = A03[0];
            if (i != 0 || A03[1] != 0) {
                this.A01.A0c(i, A03[1]);
            }
        }
    }

    public void A02(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A01;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A0m(this.A02);
                this.A01.A0T = null;
            }
            this.A01 = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.A0T == null) {
                recyclerView.A0l(this.A02);
                RecyclerView recyclerView3 = this.A01;
                recyclerView3.A0T = this;
                this.A00 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A01();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public int[] A03(AnonymousClass0VT r7, View view) {
        if (!(this instanceof AnonymousClass244)) {
            AnonymousClass242 r5 = (AnonymousClass242) this;
            if (r5 instanceof AnonymousClass29Z) {
                return ((AnonymousClass29Z) r5).A00.A03(r7, view);
            }
            int[] iArr = new int[2];
            if (r7.A0d()) {
                AnonymousClass0VS r1 = r5.A00;
                if (r1 == null || r1.A02 != r7) {
                    r1 = new C30531bV(r7);
                    r5.A00 = r1;
                }
                iArr[0] = AnonymousClass242.A00(r7, view, r1);
            } else {
                iArr[0] = 0;
            }
            if (r7.A0e()) {
                AnonymousClass0VS r12 = r5.A01;
                if (r12 == null || r12.A02 != r7) {
                    r12 = new C30541bW(r7);
                    r5.A01 = r12;
                }
                iArr[1] = AnonymousClass242.A00(r7, view, r12);
                return iArr;
            }
            iArr[1] = 0;
            return iArr;
        }
        AnonymousClass244 r52 = (AnonymousClass244) this;
        if (r52 instanceof C463129a) {
            return ((C463129a) r52).A00.A03(r7, view);
        }
        int[] iArr2 = new int[2];
        if (r7.A0d()) {
            AnonymousClass0VS r13 = r52.A00;
            if (r13 == null || r13.A02 != r7) {
                r13 = new C30531bV(r7);
                r52.A00 = r13;
            }
            iArr2[0] = AnonymousClass244.A00(r7, view, r13);
        } else {
            iArr2[0] = 0;
        }
        if (r7.A0e()) {
            AnonymousClass0VS r14 = r52.A01;
            if (r14 == null || r14.A02 != r7) {
                r14 = new C30541bW(r7);
                r52.A01 = r14;
            }
            iArr2[1] = AnonymousClass244.A00(r7, view, r14);
            return iArr2;
        }
        iArr2[1] = 0;
        return iArr2;
    }
}
