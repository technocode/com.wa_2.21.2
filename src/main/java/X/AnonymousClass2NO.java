package X;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.2NO  reason: invalid class name */
public class AnonymousClass2NO implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass2NP A01;

    public AnonymousClass2NO(AnonymousClass2NP r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public boolean onPreDraw() {
        AnonymousClass2NP r2 = this.A01;
        if (r2 != null) {
            AnonymousClass00E.A01();
            if (r2.A01) {
                this.A00.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
            }
            r2.A00 = SystemClock.elapsedRealtime();
            return true;
        }
        throw null;
    }
}
