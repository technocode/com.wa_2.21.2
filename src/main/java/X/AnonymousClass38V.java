package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheet;

/* renamed from: X.38V  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38V implements View.OnTouchListener {
    public final /* synthetic */ VoipCallControlBottomSheet A00;

    public /* synthetic */ AnonymousClass38V(VoipCallControlBottomSheet voipCallControlBottomSheet) {
        this.A00 = voipCallControlBottomSheet;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.A00.A1B(motionEvent);
        return true;
    }
}
