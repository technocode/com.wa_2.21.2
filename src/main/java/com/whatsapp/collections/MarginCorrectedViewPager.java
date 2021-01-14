package com.whatsapp.collections;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.whatsapp.util.Log;

public class MarginCorrectedViewPager extends ViewPager {
    public boolean A00 = true;

    public MarginCorrectedViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e("Exception while intercepting touch event", e);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5 = this.A0K;
        super.onSizeChanged(i - i5, i2, i3 - i5, i4);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A00) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setScrollEnabled(boolean z) {
        this.A00 = z;
    }
}
