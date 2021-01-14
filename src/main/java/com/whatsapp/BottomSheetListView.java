package com.whatsapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

public class BottomSheetListView extends ListView {
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public BottomSheetListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (getChildCount() > 0 && !(getFirstVisiblePosition() == 0 && getChildAt(0).getTop() == 0 && getLastVisiblePosition() != getChildCount())) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(motionEvent);
    }
}
