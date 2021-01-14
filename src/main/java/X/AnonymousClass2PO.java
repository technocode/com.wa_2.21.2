package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.gallerypicker.RecyclerFastScroller;
import com.whatsapp.util.Log;

/* renamed from: X.2PO  reason: invalid class name */
public class AnonymousClass2PO implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public final /* synthetic */ RecyclerFastScroller A03;

    public AnonymousClass2PO(RecyclerFastScroller recyclerFastScroller) {
        this.A03 = recyclerFastScroller;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int totalScrollRange;
        int i;
        AppBarLayout appBarLayout;
        if (motionEvent.getActionMasked() == 0) {
            RecyclerFastScroller recyclerFastScroller = this.A03;
            recyclerFastScroller.A03.setPressed(true);
            C53672de r0 = recyclerFastScroller.A08;
            if (r0 != null) {
                r0.A00();
            }
            View view2 = recyclerFastScroller.A02;
            if (!(view2 == null || view2.getVisibility() == 0)) {
                recyclerFastScroller.A02.setVisibility(0);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(100);
                recyclerFastScroller.A02.startAnimation(alphaAnimation);
            }
            recyclerFastScroller.A06.A0R();
            recyclerFastScroller.A06.startNestedScroll(2);
            this.A00 = (float) RecyclerFastScroller.getVisibleHeight(recyclerFastScroller);
            this.A01 = motionEvent.getY() + ((float) recyclerFastScroller.A03.getTop());
            this.A02 = recyclerFastScroller.A00;
        } else if (motionEvent.getActionMasked() == 2) {
            RecyclerFastScroller recyclerFastScroller2 = this.A03;
            View view3 = recyclerFastScroller2.A02;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            int visibleHeight = RecyclerFastScroller.getVisibleHeight(recyclerFastScroller2);
            float f = this.A00;
            float f2 = (float) visibleHeight;
            float y = (f - f2) + motionEvent.getY() + ((float) recyclerFastScroller2.A03.getTop());
            float f3 = (y - this.A01) / f;
            int computeVerticalScrollRange = recyclerFastScroller2.A06.computeVerticalScrollRange();
            AppBarLayout appBarLayout2 = recyclerFastScroller2.A07;
            if (appBarLayout2 == null) {
                totalScrollRange = 0;
            } else {
                totalScrollRange = appBarLayout2.getTotalScrollRange();
            }
            int i2 = (int) (f3 * ((float) (computeVerticalScrollRange + totalScrollRange)));
            if (!(recyclerFastScroller2.A04 == null || (appBarLayout = recyclerFastScroller2.A07) == null)) {
                appBarLayout.getLayoutParams();
            }
            if (!(recyclerFastScroller2.A06 == null || recyclerFastScroller2.A03 == null)) {
                int abs = Math.abs(i2);
                if (abs > RecyclerFastScroller.getVisibleHeight(recyclerFastScroller2)) {
                    int min = (int) ((Math.min(Math.max(0.0f, y), f2) * ((float) recyclerFastScroller2.A06.A0N.A05())) / f2);
                    recyclerFastScroller2.A06.A0X(min);
                    if (min != 0) {
                        i = abs % visibleHeight;
                    } else {
                        i = 0;
                    }
                } else {
                    i = (i2 + this.A02) - recyclerFastScroller2.A00;
                }
                try {
                    recyclerFastScroller2.A06.scrollBy(0, i);
                } catch (Throwable th) {
                    Log.e(th);
                }
            }
            this.A01 = y;
            this.A02 = recyclerFastScroller2.A00;
            return true;
        } else if (motionEvent.getActionMasked() == 1) {
            this.A01 = -1.0f;
            RecyclerFastScroller recyclerFastScroller3 = this.A03;
            recyclerFastScroller3.A06.stopNestedScroll();
            recyclerFastScroller3.A03.setPressed(false);
            recyclerFastScroller3.A00();
            View view4 = recyclerFastScroller3.A02;
            if (!(view4 == null || view4.getVisibility() == 4)) {
                recyclerFastScroller3.A02.setVisibility(4);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(300);
                recyclerFastScroller3.A02.startAnimation(alphaAnimation2);
                return true;
            }
        }
        return true;
    }
}
