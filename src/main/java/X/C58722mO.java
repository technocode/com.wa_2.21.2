package X;

import android.view.KeyEvent;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.2mO  reason: invalid class name and case insensitive filesystem */
public class C58722mO implements AbstractC26561Lk {
    public final /* synthetic */ PopupNotification A00;

    public C58722mO(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A0M.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        PopupNotification popupNotification = this.A00;
        if (!popupNotification.A0K.A0P()) {
            C002001d.A2l(popupNotification.A0M, iArr, 0);
        }
    }
}
