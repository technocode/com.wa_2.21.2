package X;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.26s  reason: invalid class name and case insensitive filesystem */
public class C458826s implements AbstractC36671mc {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public C458826s(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    @Override // X.AnonymousClass1D6
    public void AI6(AppBarLayout appBarLayout, int i) {
        int i2;
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        collapsingToolbarLayout.A00 = i;
        C06730Um r0 = collapsingToolbarLayout.A0F;
        if (r0 != null) {
            i2 = r0.A04();
        } else {
            i2 = 0;
        }
        int childCount = collapsingToolbarLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = collapsingToolbarLayout.getChildAt(i3);
            AnonymousClass1DA r2 = (AnonymousClass1DA) childAt.getLayoutParams();
            AnonymousClass1DC A002 = CollapsingToolbarLayout.A00(childAt);
            int i4 = r2.A01;
            if (i4 == 1) {
                int i5 = -i;
                int height = ((collapsingToolbarLayout.getHeight() - CollapsingToolbarLayout.A00(childAt).A01) - childAt.getHeight()) - ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (i5 < 0) {
                    i5 = 0;
                } else if (i5 > height) {
                    i5 = height;
                }
                A002.A01(i5);
            } else if (i4 == 2) {
                A002.A01(Math.round(((float) (-i)) * r2.A00));
            }
        }
        collapsingToolbarLayout.A03();
        if (collapsingToolbarLayout.A0B != null && i2 > 0) {
            collapsingToolbarLayout.postInvalidateOnAnimation();
        }
        collapsingToolbarLayout.A0M.A08(((float) Math.abs(i)) / ((float) ((collapsingToolbarLayout.getHeight() - collapsingToolbarLayout.getMinimumHeight()) - i2)));
    }
}
