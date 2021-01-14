package com.whatsapp.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchDiscardLayout extends FrameLayout {
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public TouchDiscardLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
