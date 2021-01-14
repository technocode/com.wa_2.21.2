package X;

import android.text.Editable;
import com.whatsapp.notification.PopupNotification;

/* renamed from: X.2mN  reason: invalid class name and case insensitive filesystem */
public class C58712mN extends C07860Zy {
    public final /* synthetic */ PopupNotification A00;

    public C58712mN(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        PopupNotification popupNotification = this.A00;
        popupNotification.A0i.A02(true);
        String obj = editable.toString();
        C007003k r5 = popupNotification.A0N;
        if (r5 != null) {
            int length = obj.length();
            C04360Kb r1 = popupNotification.A0s;
            if (length != 0) {
                r1.A0D((AnonymousClass02N) r5.A02(AnonymousClass02N.class), 0);
            } else {
                r1.A0B((AnonymousClass02N) r5.A02(AnonymousClass02N.class));
            }
        }
        C002001d.A2U(popupNotification, popupNotification.A1K, popupNotification.A15, popupNotification.A1W, editable, popupNotification.A0M.getPaint(), 1.3f);
        boolean z = !C003701u.A0E(obj);
        popupNotification.A0B.setEnabled(z);
        if (popupNotification.A0C.getVisibility() == 8 && !z) {
            popupNotification.A0C.startAnimation(C27131Oe.A00(true));
            popupNotification.A0C.setVisibility(0);
            popupNotification.A0B.startAnimation(C27131Oe.A00(false));
            popupNotification.A0B.setVisibility(8);
        } else if (popupNotification.A0C.getVisibility() == 0 && z) {
            popupNotification.A0C.startAnimation(C27131Oe.A00(false));
            popupNotification.A0C.setVisibility(8);
            popupNotification.A0B.startAnimation(C27131Oe.A00(true));
            popupNotification.A0B.setVisibility(0);
        }
    }
}
