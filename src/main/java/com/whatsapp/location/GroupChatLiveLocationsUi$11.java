package com.whatsapp.location;

import X.AbstractView$OnCreateContextMenuListenerC56112i5;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class GroupChatLiveLocationsUi$11 extends BottomSheetBehavior {
    public final /* synthetic */ AbstractView$OnCreateContextMenuListenerC56112i5 A00;

    public GroupChatLiveLocationsUi$11(AbstractView$OnCreateContextMenuListenerC56112i5 r1) {
        this.A00 = r1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A05(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return this.A00.A0a.A0B == 5 && super.A05(coordinatorLayout, view, motionEvent);
    }
}
