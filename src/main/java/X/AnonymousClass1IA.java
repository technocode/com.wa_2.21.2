package X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.1IA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IA implements View.OnTouchListener {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C26621Lq A01;

    public /* synthetic */ AnonymousClass1IA(C26621Lq r1, Handler handler) {
        this.A01 = r1;
        this.A00 = handler;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C26621Lq r4 = this.A01;
        Handler handler = this.A00;
        int action = motionEvent.getAction();
        if (action == 0) {
            AbstractC26561Lk r0 = r4.A0B;
            if (r0 == null) {
                return true;
            }
            r0.ADI();
            handler.sendEmptyMessageDelayed(0, (long) C26621Lq.A0W);
            return true;
        } else if (action == 1) {
            handler.removeMessages(0);
            return true;
        } else if (action != 3) {
            return false;
        } else {
            handler.removeMessages(0);
            return true;
        }
    }
}
