package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.1ma  reason: invalid class name and case insensitive filesystem */
public class C36651ma implements AnonymousClass0TF {
    public final /* synthetic */ AppBarLayout A00;

    public C36651ma(AppBarLayout appBarLayout) {
        this.A00 = appBarLayout;
    }

    @Override // X.AnonymousClass0TF
    public C06730Um ACw(View view, C06730Um r5) {
        AppBarLayout appBarLayout = this.A00;
        C06730Um r1 = null;
        if (appBarLayout != null) {
            if (appBarLayout.getFitsSystemWindows()) {
                r1 = r5;
            }
            if (!C002001d.A3b(appBarLayout.A04, r1)) {
                appBarLayout.A04 = r1;
                appBarLayout.A03 = -1;
                appBarLayout.A00 = -1;
                appBarLayout.A01 = -1;
            }
            return r5;
        }
        throw null;
    }
}
