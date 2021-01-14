package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.2Fv  reason: invalid class name and case insensitive filesystem */
public class C46942Fv extends ViewOutlineProvider {
    public void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
