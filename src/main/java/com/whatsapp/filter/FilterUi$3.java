package com.whatsapp.filter;

import X.AnonymousClass008;
import X.AnonymousClass2OT;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.util.Log;

public class FilterUi$3 extends BottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass2OT A01;

    public FilterUi$3(AnonymousClass2OT r1) {
        this.A01 = r1;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A04(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.A00 = true;
        super.A04(coordinatorLayout, view, i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0067, code lost:
        if (r2.A03(r10.getRawX(), r10.getRawY()) != false) goto L_0x0069;
     */
    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.filter.FilterUi$3.A05(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, X.AbstractC07570Yg
    public boolean A06(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        StringBuilder A0S = AnonymousClass008.A0S("FilterUi/ onTouchEvent result: listener.onTouchedShouldIgnore:");
        A0S.append(this.A01.A0W.A03(motionEvent.getRawX(), motionEvent.getRawY()));
        Log.d(A0S.toString());
        return this.A00 && super.A06(coordinatorLayout, view, motionEvent);
    }
}
