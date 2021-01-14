package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.1Ke  reason: invalid class name and case insensitive filesystem */
public class C26271Ke extends ViewOutlineProvider {
    public final /* synthetic */ C26281Kf A00;

    public C26271Ke(C26281Kf r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        C26281Kf r2 = this.A00;
        outline.setAlpha(((float) r2.A0K) / 255.0f);
        Rect rect = new Rect();
        r2.A0Y.roundOut(rect);
        outline.setRoundRect(rect, (float) r2.A0J);
    }
}
