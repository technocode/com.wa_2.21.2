package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* renamed from: X.1md  reason: invalid class name and case insensitive filesystem */
public class C36681md implements AnonymousClass0TF {
    public final /* synthetic */ CollapsingToolbarLayout A00;

    public C36681md(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.A00 = collapsingToolbarLayout;
    }

    @Override // X.AnonymousClass0TF
    public C06730Um ACw(View view, C06730Um r6) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.A00;
        if (collapsingToolbarLayout != null) {
            C06730Um r1 = null;
            if (collapsingToolbarLayout.getFitsSystemWindows()) {
                r1 = r6;
            }
            if (!C002001d.A3b(collapsingToolbarLayout.A0F, r1)) {
                collapsingToolbarLayout.A0F = r1;
                collapsingToolbarLayout.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 20) {
                return new C06730Um(((WindowInsets) r6.A00).consumeSystemWindowInsets());
            }
            return null;
        }
        throw null;
    }
}
