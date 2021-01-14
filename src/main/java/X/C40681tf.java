package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsDataUsageActivity;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1tf  reason: invalid class name and case insensitive filesystem */
public class C40681tf extends AnonymousClass0JW {
    public final AtomicBoolean A00 = new AtomicBoolean(false);
    public final /* synthetic */ SettingsDataUsageActivity A01;

    public C40681tf(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A01 = settingsDataUsageActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        Log.i("settings-data-usage-activity/load storage size task/started");
        SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
        if (settingsDataUsageActivity.A03 == -1) {
            settingsDataUsageActivity.A0F.setText(((AnonymousClass2C0) settingsDataUsageActivity).A01.A06(R.string.calculating));
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Number number = (Number) obj;
        Log.i("settings-data-usage-activity/load storage size task/fetch completed");
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A01;
            long longValue = number.longValue();
            settingsDataUsageActivity.A03 = longValue;
            settingsDataUsageActivity.A0F.setText(C002001d.A1b(((AnonymousClass2C0) settingsDataUsageActivity).A01, longValue));
        }
    }
}
