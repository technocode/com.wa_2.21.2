package X;

import android.view.ViewTreeObserver;
import com.whatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.307  reason: invalid class name */
public class AnonymousClass307 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;

    public AnonymousClass307(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        this.A00 = changeNumberNotifyContacts;
    }

    public boolean onPreDraw() {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        changeNumberNotifyContacts.A08.getViewTreeObserver().removeOnPreDrawListener(this);
        if (changeNumberNotifyContacts.A08.canScrollVertically(1)) {
            changeNumberNotifyContacts.A02.setElevation((float) changeNumberNotifyContacts.A00);
            return false;
        }
        changeNumberNotifyContacts.A02.setElevation(0.0f);
        return false;
    }
}
