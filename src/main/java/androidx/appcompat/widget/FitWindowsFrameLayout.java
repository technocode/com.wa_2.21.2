package androidx.appcompat.widget;

import X.AnonymousClass0TG;
import X.AnonymousClass0TH;
import X.AnonymousClass0TI;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout implements AnonymousClass0TG {
    public AnonymousClass0TI A00;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        AnonymousClass0TI r0 = this.A00;
        if (r0 != null) {
            rect.top = ((AnonymousClass0TH) r0).A00.A0I(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // X.AnonymousClass0TG
    public void setOnFitSystemWindowsListener(AnonymousClass0TI r1) {
        this.A00 = r1;
    }
}
