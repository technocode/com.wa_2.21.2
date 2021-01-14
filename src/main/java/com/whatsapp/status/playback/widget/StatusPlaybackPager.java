package com.whatsapp.status.playback.widget;

import X.AnonymousClass3Q0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.whatsapp.collections.MarginCorrectedViewPager;

public class StatusPlaybackPager extends MarginCorrectedViewPager {
    public boolean A00 = true;

    public StatusPlaybackPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0H(true, AnonymousClass3Q0.A00);
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1 && motionEvent.getActionMasked() == 2) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (!(i == i3 && i2 == i4)) {
            if (!(i3 == 0 && i4 == 0)) {
                int childCount = getChildCount();
                for (int i5 = 0; i5 < childCount; i5++) {
                    getChildAt(i5).setRotation(0.0f);
                }
            }
        }
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // com.whatsapp.collections.MarginCorrectedViewPager
    public void setScrollEnabled(boolean z) {
        this.A00 = z;
    }
}
