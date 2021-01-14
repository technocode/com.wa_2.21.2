package X;

import com.whatsapp.SettingsDataUsageActivity;
import java.util.TimerTask;

/* renamed from: X.1Na  reason: invalid class name and case insensitive filesystem */
public class C26881Na extends TimerTask {
    public final /* synthetic */ SettingsDataUsageActivity A00;

    public C26881Na(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A00 = settingsDataUsageActivity;
    }

    public void run() {
        SettingsDataUsageActivity settingsDataUsageActivity = this.A00;
        settingsDataUsageActivity.A04.post(new RunnableEBaseShape6S0100000_I1_1(settingsDataUsageActivity, 31));
    }
}
