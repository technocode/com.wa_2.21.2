package com.whatsapp;

import X.AbstractC26871Mz;
import X.C38851qY;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.collections.MarginCorrectedViewPager;

public class PhotoViewPager extends MarginCorrectedViewPager {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public AbstractC26871Mz A04;

    public PhotoViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0H(true, C38851qY.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 > 1) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r0 > 1) goto L_0x001a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071 A[ADDED_TO_REGION] */
    @Override // com.whatsapp.collections.MarginCorrectedViewPager, androidx.viewpager.widget.ViewPager
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.PhotoViewPager.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnInterceptTouchListener(AbstractC26871Mz r1) {
        this.A04 = r1;
    }
}
