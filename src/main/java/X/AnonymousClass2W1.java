package X;

import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.2W1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2W1 implements View.OnTouchListener {
    public final /* synthetic */ PopupNotification A00;

    public /* synthetic */ AnonymousClass2W1(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupNotification popupNotification = this.A00;
        if (!popupNotification.A0O.A01()) {
            popupNotification.A0K.A0E(popupNotification.A0C, motionEvent, false);
        }
        return false;
    }
}
