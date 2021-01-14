package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsChatHistory;

/* renamed from: X.1tc  reason: invalid class name and case insensitive filesystem */
public class C40651tc implements AnonymousClass35S {
    public final /* synthetic */ SettingsChatHistory A00;

    @Override // X.AnonymousClass35S
    public void AHs() {
    }

    public C40651tc(SettingsChatHistory settingsChatHistory) {
        this.A00 = settingsChatHistory;
    }

    @Override // X.AnonymousClass35S
    public void AIb(boolean z) {
        SettingsChatHistory settingsChatHistory = this.A00;
        settingsChatHistory.APv(R.string.processing, R.string.register_wait_message);
        settingsChatHistory.A09.ANF(new RunnableEBaseShape1S0110000_I1(this, z, 0));
    }
}
