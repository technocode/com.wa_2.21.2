package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsChatHistory;

/* renamed from: X.1tb  reason: invalid class name and case insensitive filesystem */
public class C40641tb implements AnonymousClass35T {
    public final /* synthetic */ SettingsChatHistory A00;

    public C40641tb(SettingsChatHistory settingsChatHistory) {
        this.A00 = settingsChatHistory;
    }

    @Override // X.AnonymousClass35T
    public void AHs() {
        C002001d.A2N(this.A00, 3);
    }

    @Override // X.AnonymousClass35T
    public void AIc(boolean z, boolean z2) {
        SettingsChatHistory settingsChatHistory = this.A00;
        C002001d.A2N(settingsChatHistory, 3);
        settingsChatHistory.APv(R.string.processing, R.string.register_wait_message);
        settingsChatHistory.A09.ANC(new C40661td(settingsChatHistory, settingsChatHistory.A02, z, z2), new Void[0]);
    }
}
