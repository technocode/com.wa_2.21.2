package X;

import android.content.Context;
import android.view.View;
import android.widget.AbsListView;

/* renamed from: X.1sT  reason: invalid class name and case insensitive filesystem */
public class C40011sT implements AnonymousClass0XW {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C26621Lq A01;
    public final /* synthetic */ AnonymousClass01X A02;
    public final /* synthetic */ AnonymousClass022 A03;

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
    }

    public C40011sT(C26621Lq r1, AnonymousClass01X r2, Context context, AnonymousClass022 r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = context;
        this.A03 = r4;
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        C26621Lq r3 = this.A01;
        View findViewWithTag = r3.A0A.findViewWithTag(Integer.valueOf(r3.A00));
        if (findViewWithTag != null) {
            ((AbsListView) findViewWithTag).setOnScrollListener(null);
        }
        if (this.A02.A0M()) {
            r3.A00 = i;
        } else {
            int length = (r3.A0D.length - 1) - i;
            r3.A00 = length;
            i = length;
        }
        r3.A03(i);
        View findViewWithTag2 = r3.A0A.findViewWithTag(Integer.valueOf(r3.A00));
        if (findViewWithTag2 != null) {
            ((AbsListView) findViewWithTag2).setOnScrollListener(r3.A0K);
            findViewWithTag2.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC26511Lf(this, findViewWithTag2));
        }
    }
}
