package X;

import android.widget.CompoundButton;
import com.whatsapp.SettingsSecurity;

/* renamed from: X.1JQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1JQ implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ SettingsSecurity A00;

    public /* synthetic */ AnonymousClass1JQ(SettingsSecurity settingsSecurity) {
        this.A00 = settingsSecurity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        SettingsSecurity settingsSecurity = this.A00;
        settingsSecurity.A04.ANF(new RunnableEBaseShape1S0110000_I1(settingsSecurity, z, 2));
    }
}
