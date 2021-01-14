package X;

import com.whatsapp.SettingsNetworkUsage;
import java.util.TimerTask;

/* renamed from: X.1Nc  reason: invalid class name and case insensitive filesystem */
public class C26901Nc extends TimerTask {
    public final /* synthetic */ SettingsNetworkUsage A00;

    public C26901Nc(SettingsNetworkUsage settingsNetworkUsage) {
        this.A00 = settingsNetworkUsage;
    }

    public void run() {
        SettingsNetworkUsage settingsNetworkUsage = this.A00;
        settingsNetworkUsage.A00.post(new RunnableEBaseShape6S0100000_I1_1(settingsNetworkUsage, 32));
    }
}
