package X;

import android.view.ViewTreeObserver;
import com.whatsapp.biz.profile.ParallaxImageLayout;

/* renamed from: X.1ST  reason: invalid class name */
public class AnonymousClass1ST implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ ParallaxImageLayout A00;

    public AnonymousClass1ST(ParallaxImageLayout parallaxImageLayout) {
        this.A00 = parallaxImageLayout;
    }

    public void onGlobalLayout() {
        ParallaxImageLayout parallaxImageLayout = this.A00;
        parallaxImageLayout.A09.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        if (!parallaxImageLayout.A0D) {
            int measuredWidth = ((int) (((float) parallaxImageLayout.getMeasuredWidth()) * 0.5625f)) - parallaxImageLayout.getMeasuredWidth();
            parallaxImageLayout.A09.setSelectionFromTop(0, measuredWidth);
            parallaxImageLayout.setScrollPos(measuredWidth);
        }
    }
}
