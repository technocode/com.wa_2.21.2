package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.QuickContactActivity;

/* renamed from: X.1Ip  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnTouchListenerC25861Ip implements View.OnTouchListener {
    public final /* synthetic */ QuickContactActivity A00;

    public /* synthetic */ View$OnTouchListenerC25861Ip(QuickContactActivity quickContactActivity) {
        this.A00 = quickContactActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        QuickContactActivity quickContactActivity = this.A00;
        if (quickContactActivity.A02.A03 == 2) {
            quickContactActivity.A0X(true);
        }
        return true;
    }
}
