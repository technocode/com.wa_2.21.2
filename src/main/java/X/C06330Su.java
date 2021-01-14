package X;

import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.0Su  reason: invalid class name and case insensitive filesystem */
public final class C06330Su {
    public int A00 = -1;
    public WeakReference A01;

    public C06330Su(View view) {
        this.A01 = new WeakReference(view);
    }

    public void A00() {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public void A01() {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public void A02(float f) {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public void A03(float f) {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public void A04(long j) {
        View view = (View) this.A01.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void A05(View view, AbstractC14990nD r4) {
        if (r4 != null) {
            view.animate().setListener(new C14970nB(r4, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public void A06(AbstractC14990nD r2) {
        View view = (View) this.A01.get();
        if (view != null) {
            A05(view, r2);
        }
    }

    public void A07(AbstractC15000nE r4) {
        View view = (View) this.A01.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            C14980nC r1 = null;
            if (r4 != null) {
                r1 = new C14980nC(r4, view);
            }
            view.animate().setUpdateListener(r1);
        }
    }
}
