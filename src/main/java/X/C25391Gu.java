package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.1Gu  reason: invalid class name and case insensitive filesystem */
public class C25391Gu extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            outline.setAlpha(1.0f);
            return;
        }
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
