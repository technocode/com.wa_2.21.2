package X;

import com.whatsapp.notification.PopupNotification;
import com.whatsapp.notification.PopupNotificationViewPager;

/* renamed from: X.2mL  reason: invalid class name and case insensitive filesystem */
public class C58692mL implements AnonymousClass0XW {
    public final /* synthetic */ PopupNotification A00;

    public C58692mL(PopupNotification popupNotification) {
        this.A00 = popupNotification;
    }

    @Override // X.AnonymousClass0XW
    public void AIF(int i) {
        PopupNotification popupNotification;
        Integer num;
        if (i == 1) {
            this.A00.A0Y = true;
        } else if (i == 0 && (num = (popupNotification = this.A00).A0S) != null) {
            popupNotification.A0W.remove(num.intValue());
            if (popupNotification.A0S.intValue() >= popupNotification.A0W.size()) {
                popupNotification.A0S = Integer.valueOf(popupNotification.A0S.intValue() - 1);
            }
            popupNotification.A0H.A00.A06();
            PopupNotificationViewPager popupNotificationViewPager = popupNotification.A0Q;
            C08440b7 r1 = popupNotification.A0H;
            int intValue = popupNotification.A0S.intValue();
            popupNotificationViewPager.setAdapter(r1);
            popupNotificationViewPager.setCurrentItem(intValue);
            popupNotification.A0X(popupNotification.A0Q.getCurrentItem());
            if (popupNotification.A0W.size() == 1) {
                popupNotification.A0S();
            }
            popupNotification.A0S = null;
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIG(int i, float f, int i2) {
        PopupNotification popupNotification = this.A00;
        if (popupNotification.A0Y) {
            popupNotification.A0i.A02(true);
            AbstractC007503q r0 = popupNotification.A0R;
            if (r0 != null) {
                popupNotification.A0V.add(r0.A0n);
            }
            C007003k r2 = popupNotification.A0N;
            if (r2 != null) {
                popupNotification.A0T.add(r2.A02(AnonymousClass02N.class));
            }
        }
    }

    @Override // X.AnonymousClass0XW
    public void AIH(int i) {
        PopupNotification popupNotification = this.A00;
        if (popupNotification.A0S == null) {
            popupNotification.A0X(popupNotification.A0Q.getCurrentItem());
        }
    }
}
