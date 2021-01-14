package X;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector;

/* renamed from: X.0n2  reason: invalid class name and case insensitive filesystem */
public class HandlerC14880n2 extends Handler {
    public final /* synthetic */ C30111ak A00;

    public HandlerC14880n2(C30111ak r1) {
        this.A00 = r1;
    }

    public void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            C30111ak r0 = this.A00;
            r0.A0K.onShowPress(r0.A09);
        } else if (i == 2) {
            C30111ak r2 = this.A00;
            r2.A0J.removeMessages(3);
            r2.A0E = false;
            r2.A0F = true;
            r2.A0K.onLongPress(r2.A09);
        } else if (i == 3) {
            C30111ak r22 = this.A00;
            GestureDetector.OnDoubleTapListener onDoubleTapListener = r22.A08;
            if (onDoubleTapListener == null) {
                return;
            }
            if (!r22.A0I) {
                onDoubleTapListener.onSingleTapConfirmed(r22.A09);
            } else {
                r22.A0E = true;
            }
        } else {
            StringBuilder sb = new StringBuilder("Unknown message ");
            sb.append(message);
            throw new RuntimeException(sb.toString());
        }
    }
}
