package com.whatsapp.camera;

import X.AnonymousClass0YW;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class CameraUi$10 extends CameraBottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass0YW A01;

    public CameraUi$10(AnonymousClass0YW r1) {
        this.A01 = r1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A00 = true;
        super.A04(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!this.A00 || !super.A05(coordinatorLayout, view, motionEvent)) {
            return false;
        }
        return motionEvent.getPointerCount() < 2 || motionEvent.getY() > ((float) this.A01.A03.getTop());
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.A00 && super.A06(coordinatorLayout, view, motionEvent);
    }
}
