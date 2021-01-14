package X;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.components.CircularRevealView;

/* renamed from: X.2Gw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnTouchListenerC47202Gw implements View.OnTouchListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass2HD A01;

    public /* synthetic */ View$OnTouchListenerC47202Gw(AnonymousClass2HD r1, Activity activity) {
        this.A01 = r1;
        this.A00 = activity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass2HD r3 = this.A01;
        if (motionEvent.getAction() != 4) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            float y = motionEvent.getY();
            FrameLayout frameLayout = r3.A09;
            if (y >= ((float) frameLayout.getTop()) && motionEvent.getY() <= ((float) frameLayout.getBottom())) {
                float x = motionEvent.getX();
                CircularRevealView circularRevealView = r3.A0C;
                if (x >= ((float) circularRevealView.getLeft()) && motionEvent.getX() <= ((float) circularRevealView.getRight())) {
                    return false;
                }
            }
        }
        r3.dismiss();
        return true;
    }
}
