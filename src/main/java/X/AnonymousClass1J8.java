package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsChatHistory;

/* renamed from: X.1J8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1J8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SettingsChatHistory A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass1J8(SettingsChatHistory settingsChatHistory, boolean z) {
        this.A00 = settingsChatHistory;
        this.A01 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SettingsChatHistory settingsChatHistory = this.A00;
        boolean z = this.A01;
        C002001d.A2N(settingsChatHistory, 5);
        settingsChatHistory.APv(R.string.processing, R.string.register_wait_message);
        settingsChatHistory.A09.ANF(new RunnableEBaseShape1S0110000_I1(settingsChatHistory, z, 1));
    }
}
