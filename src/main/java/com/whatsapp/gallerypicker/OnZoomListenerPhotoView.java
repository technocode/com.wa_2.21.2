package com.whatsapp.gallerypicker;

import X.AnonymousClass2PN;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.mediaview.PhotoView;

public class OnZoomListenerPhotoView extends PhotoView {
    public AnonymousClass2PN A00;

    public OnZoomListenerPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onDoubleTap(MotionEvent motionEvent) {
        return super.onDoubleTap(motionEvent);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return super.onScaleBegin(scaleGestureDetector);
    }

    @Override // com.whatsapp.mediaview.PhotoView
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        super.onScaleEnd(scaleGestureDetector);
    }

    public void setOnZoomListener(AnonymousClass2PN r1) {
        this.A00 = r1;
    }
}
