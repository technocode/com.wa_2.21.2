package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.39j  reason: invalid class name and case insensitive filesystem */
public class C676239j extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public C676239j(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null || motionEvent.getY() - motionEvent2.getY() <= 100.0f || Math.abs(f2) <= 100.0f) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        Log.i("VoipCallControlBottomSheet/SwipeUpListener/onFling/show call control sheet");
        VoipCallControlBottomSheet voipCallControlBottomSheet = this.A00;
        BottomSheetBehavior bottomSheetBehavior = voipCallControlBottomSheet.A09;
        if (bottomSheetBehavior != null) {
            int i = bottomSheetBehavior.A0B;
            if (i == 5) {
                voipCallControlBottomSheet.A14();
                voipCallControlBottomSheet.A1F(true);
                voipCallControlBottomSheet.A09.A0D(4);
            } else if (i == 4) {
                bottomSheetBehavior.A0D(3);
                return true;
            }
        }
        return true;
    }
}
