package com.whatsapp.status.playback.page;

import X.AbstractC71663Pv;
import X.AnonymousClass0Q7;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class StatusPlaybackPageItem$3 extends BottomSheetBehavior {
    public final /* synthetic */ AbstractC71663Pv A00;

    public StatusPlaybackPageItem$3(AbstractC71663Pv r1) {
        this.A00 = r1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.A04(coordinatorLayout, view, i);
        AnonymousClass0Q7.A0U(view, -view.getTop());
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.A00.A00.A0B != 3 && motionEvent.getPointerCount() < 2 && super.A05(coordinatorLayout, view, motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.A00.A00.A0B == 3) {
            return false;
        }
        try {
            return super.A06(coordinatorLayout, view, motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
