package com.whatsapp.status.playback.page;

import X.AbstractC71663Pv;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.util.Log;

public class StatusPlaybackPageItem$1 extends BottomSheetBehavior {
    public float A00;
    public boolean A01;
    public final /* synthetic */ AbstractC71663Pv A02;

    public StatusPlaybackPageItem$1(AbstractC71663Pv r1) {
        this.A02 = r1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A01 = true;
        super.A04(coordinatorLayout, view, i);
        return true;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!this.A01 && view.isShown()) {
            StringBuilder sb = new StringBuilder("playbackPage/onInterceptTouchEvent called before onLayoutChild; page=");
            sb.append(this);
            sb.append("; host=");
            sb.append(this.A02.A0I.A00);
            Log.d(sb.toString());
            return false;
        } else if (motionEvent.getPointerCount() >= 2) {
            return false;
        } else {
            boolean A05 = super.A05(coordinatorLayout, view, motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A00 = motionEvent.getY();
            } else if (actionMasked == 2 && this.A00 < motionEvent.getY() && this.A0B == 4) {
                return false;
            } else {
                return A05;
            }
            return A05;
        }
    }
}
