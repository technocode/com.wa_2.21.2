package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.375  reason: invalid class name */
public class AnonymousClass375 extends ViewOutlineProvider {
    public boolean A00;

    public void getOutline(View view, Outline outline) {
        if (this.A00) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 10.0f);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
    }
}
