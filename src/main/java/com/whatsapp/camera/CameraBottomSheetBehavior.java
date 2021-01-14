package com.whatsapp.camera;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class CameraBottomSheetBehavior extends BottomSheetBehavior {
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public void A03(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        if (this.A0B != 4) {
            super.A03(coordinatorLayout, view, view2, i);
        }
    }
}
