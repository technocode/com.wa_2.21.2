package X;

import com.whatsapp.SettingsDataUsageActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1te  reason: invalid class name and case insensitive filesystem */
public class C40671te extends AnonymousClass0JW {
    public final /* synthetic */ SettingsDataUsageActivity A00;

    public C40671te(SettingsDataUsageActivity settingsDataUsageActivity) {
        this.A00 = settingsDataUsageActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            SettingsDataUsageActivity settingsDataUsageActivity = this.A00;
            if (settingsDataUsageActivity.A03 == -1) {
                Log.i("settings-data-usage-activity/load storage data/cache data fetched");
                long longValue = number.longValue();
                settingsDataUsageActivity.A03 = longValue;
                settingsDataUsageActivity.A0F.setText(C002001d.A1b(((AnonymousClass2C0) settingsDataUsageActivity).A01, longValue));
            }
        }
    }
}
