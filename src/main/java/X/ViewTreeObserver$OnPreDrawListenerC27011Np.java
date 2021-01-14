package X;

import android.view.ViewTreeObserver;
import androidx.fragment.app.ListFragment;
import com.whatsapp.StatusesFragment;

/* renamed from: X.1Np  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC27011Np implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ StatusesFragment A00;

    public ViewTreeObserver$OnPreDrawListenerC27011Np(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    public boolean onPreDraw() {
        StatusesFragment statusesFragment = this.A00;
        statusesFragment.A0n();
        ((ListFragment) statusesFragment).A04.getViewTreeObserver().removeOnPreDrawListener(this);
        statusesFragment.A0y(true, new C27001No(this));
        return false;
    }
}
