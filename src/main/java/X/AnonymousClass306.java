package X;

import android.view.ViewTreeObserver;
import android.widget.Switch;
import com.whatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.306  reason: invalid class name */
public class AnonymousClass306 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;
    public final /* synthetic */ boolean A01;

    public AnonymousClass306(ChangeNumberNotifyContacts changeNumberNotifyContacts, boolean z) {
        this.A00 = changeNumberNotifyContacts;
        this.A01 = z;
    }

    public boolean onPreDraw() {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        changeNumberNotifyContacts.A04.getViewTreeObserver().removeOnPreDrawListener(this);
        Switch r2 = changeNumberNotifyContacts.A09;
        boolean z = this.A01;
        r2.setChecked(!z);
        changeNumberNotifyContacts.A09.setChecked(z);
        return false;
    }
}
