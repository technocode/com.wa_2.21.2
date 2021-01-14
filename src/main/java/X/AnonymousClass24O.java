package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: X.24O  reason: invalid class name */
public class AnonymousClass24O implements AbstractC30871c5 {
    public final ViewGroupOverlay A00;

    public AnonymousClass24O(ViewGroup viewGroup) {
        this.A00 = viewGroup.getOverlay();
    }

    @Override // X.AbstractC30871c5
    public void A1f(View view) {
        this.A00.add(view);
    }

    @Override // X.AbstractC30871c5
    public void AMa(View view) {
        this.A00.remove(view);
    }
}
