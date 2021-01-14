package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.39K  reason: invalid class name */
public class AnonymousClass39K extends ViewOutlineProvider {
    public final /* synthetic */ int A00;

    public AnonymousClass39K(int i) {
        this.A00 = i;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.A00);
    }
}
