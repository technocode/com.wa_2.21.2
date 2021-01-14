package X;

import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2NP  reason: invalid class name */
public class AnonymousClass2NP {
    public long A00 = SystemClock.elapsedRealtime();
    public boolean A01 = false;
    public final C53362cx A02 = new C53362cx(this);
    public final Set A03 = new HashSet();

    public AnonymousClass2NP(Window window) {
        View decorView = window.getDecorView();
        decorView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass2NO(this, decorView));
    }
}
