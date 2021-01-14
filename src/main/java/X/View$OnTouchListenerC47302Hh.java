package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.2Hh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnTouchListenerC47302Hh implements View.OnTouchListener {
    public final /* synthetic */ AbstractC51572Zg A00;

    public /* synthetic */ View$OnTouchListenerC47302Hh(AbstractC51572Zg r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AbstractC51572Zg r3 = this.A00;
        int action = motionEvent.getAction();
        if (action == 0) {
            r3.setChildPressed(true);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            r3.setChildPressed(false);
            return false;
        }
    }
}
