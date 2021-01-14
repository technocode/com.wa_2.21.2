package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.1Gt  reason: invalid class name and case insensitive filesystem */
public class C25381Gt extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass06Q A00;

    public C25381Gt(AnonymousClass06Q r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00.A01);
    }
}
