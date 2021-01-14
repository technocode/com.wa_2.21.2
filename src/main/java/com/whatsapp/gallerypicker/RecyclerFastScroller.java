package com.whatsapp.gallerypicker;

import X.AbstractC16300pa;
import X.AbstractC16320pc;
import X.AnonymousClass2PO;
import X.C53672de;
import X.C54232eZ;
import X.C54242ea;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;

public class RecyclerFastScroller extends FrameLayout {
    public int A00;
    public int A01 = 1500;
    public View A02;
    public View A03;
    public CoordinatorLayout A04;
    public AbstractC16300pa A05;
    public RecyclerView A06;
    public AppBarLayout A07;
    public C53672de A08;
    public boolean A09 = true;
    public boolean A0A;
    public final AbstractC16320pc A0B = new C54232eZ(this);
    public final Runnable A0C = new RunnableEBaseShape9S0100000_I1_4(this, 45);

    public RecyclerFastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void A00() {
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null && this.A09) {
            Runnable runnable = this.A0C;
            recyclerView.removeCallbacks(runnable);
            this.A06.postDelayed(runnable, (long) this.A01);
        }
    }

    public final void A01() {
        requestLayout();
        if (this.A03.getVisibility() != 0) {
            this.A03.setVisibility(0);
            float f = 1.0f;
            if (this.A0A) {
                f = -1.0f;
            }
            TranslateAnimation translateAnimation = new TranslateAnimation(1, f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(200);
            this.A03.startAnimation(translateAnimation);
        }
        A00();
    }

    public int getHideDelay() {
        return this.A01;
    }

    public static int getVisibleHeight(RecyclerFastScroller recyclerFastScroller) {
        if (recyclerFastScroller.A04 == null || recyclerFastScroller.A07 == null) {
            return recyclerFastScroller.getHeight();
        }
        return Math.min(recyclerFastScroller.getHeight(), (recyclerFastScroller.A04.getHeight() - recyclerFastScroller.A07.getHeight()) + recyclerFastScroller.A00);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int totalScrollRange;
        super.onLayout(z, i, i2, i3, i4);
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() + this.A00;
            int computeVerticalScrollRange = this.A06.computeVerticalScrollRange();
            AppBarLayout appBarLayout = this.A07;
            if (appBarLayout == null) {
                totalScrollRange = 0;
            } else {
                totalScrollRange = appBarLayout.getTotalScrollRange();
            }
            int paddingBottom = this.A06.getPaddingBottom() + computeVerticalScrollRange + totalScrollRange;
            int visibleHeight = getVisibleHeight(this);
            float f = ((float) computeVerticalScrollOffset) / ((float) (paddingBottom - visibleHeight));
            View view = this.A03;
            if (view != null) {
                float height = f * ((float) (visibleHeight - view.getHeight()));
                if (this.A0A) {
                    View view2 = this.A03;
                    int i5 = (int) height;
                    view2.layout(0, i5, view2.getWidth(), this.A03.getHeight() + i5);
                } else {
                    int i6 = (int) height;
                    this.A03.layout(getRight() - this.A03.getWidth(), i6, getRight(), this.A03.getHeight() + i6);
                }
                View view3 = this.A02;
                if (view3 == null) {
                    return;
                }
                if (this.A0A) {
                    int right = this.A03.getRight();
                    int bottom = ((this.A03.getBottom() + this.A03.getTop()) - this.A02.getHeight()) >> 1;
                    int right2 = this.A03.getRight();
                    int top = this.A03.getTop();
                    view3.layout(right, bottom, this.A02.getWidth() + right2, (this.A02.getHeight() + (this.A03.getBottom() + top)) >> 1);
                    return;
                }
                int left = this.A03.getLeft() - this.A02.getWidth();
                int top2 = this.A03.getTop();
                int left2 = this.A03.getLeft();
                int top3 = this.A03.getTop();
                view3.layout(left, ((this.A03.getBottom() + top2) - this.A02.getHeight()) >> 1, left2, (this.A02.getHeight() + (this.A03.getBottom() + top3)) >> 1);
            }
        }
    }

    public void setAdapter(AbstractC16300pa r3) {
        AbstractC16300pa r0 = this.A05;
        if (r0 != r3) {
            if (r0 != null) {
                r0.A01.unregisterObserver(this.A0B);
            }
            if (r3 != null) {
                r3.A01.registerObserver(this.A0B);
            }
            this.A05 = r3;
        }
    }

    public void setHideDelay(int i) {
        this.A01 = i;
    }

    public void setHidingEnabled(boolean z) {
        this.A09 = z;
        if (z) {
            A00();
        }
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.A06 = recyclerView;
        recyclerView.A0l(new C54242ea(this));
        AbstractC16300pa r0 = recyclerView.A0N;
        if (r0 != null) {
            setAdapter(r0);
        }
    }

    public void setRtl(boolean z) {
        this.A0A = z;
    }

    public void setThumbView(View view) {
        View view2 = this.A03;
        if (view2 != null) {
            removeView(view2);
        }
        this.A03 = view;
        view.setVisibility(4);
        this.A03.setOnTouchListener(new AnonymousClass2PO(this));
        addView(this.A03, -2, -2);
    }
}
