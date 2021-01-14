package X;

import android.view.ViewTreeObserver;
import com.whatsapp.twofactor.SettingsTwoFactorAuthActivity;

/* renamed from: X.34k  reason: invalid class name and case insensitive filesystem */
public class ViewTreeObserver$OnPreDrawListenerC664634k implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ SettingsTwoFactorAuthActivity A00;

    public ViewTreeObserver$OnPreDrawListenerC664634k(SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity) {
        this.A00 = settingsTwoFactorAuthActivity;
    }

    public boolean onPreDraw() {
        SettingsTwoFactorAuthActivity settingsTwoFactorAuthActivity = this.A00;
        settingsTwoFactorAuthActivity.A05.getViewTreeObserver().removeOnPreDrawListener(this);
        if (settingsTwoFactorAuthActivity.A05.canScrollVertically(1)) {
            settingsTwoFactorAuthActivity.A03.setElevation((float) settingsTwoFactorAuthActivity.A00);
            return false;
        }
        settingsTwoFactorAuthActivity.A03.setElevation(0.0f);
        return false;
    }
}
