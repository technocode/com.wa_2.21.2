package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.0oE  reason: invalid class name and case insensitive filesystem */
public class C15530oE extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;

    public C15530oE(Rect rect) {
        this.A00 = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.A00;
    }
}
