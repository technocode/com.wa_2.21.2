package X;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: X.0oI  reason: invalid class name and case insensitive filesystem */
public class C15570oI extends Transition.EpicenterCallback {
    public final /* synthetic */ Rect A00;

    public C15570oI(Rect rect) {
        this.A00 = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.A00;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}
