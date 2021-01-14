package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.2W0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2W0 implements TextView.OnEditorActionListener {
    public final /* synthetic */ PopupNotification A00;

    public /* synthetic */ AnonymousClass2W0(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        PopupNotification popupNotification = this.A00;
        if (i != 4) {
            return false;
        }
        popupNotification.A0V();
        return true;
    }
}
