package X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0dD  reason: invalid class name and case insensitive filesystem */
public final class C09600dD {
    public final AnonymousClass00D A00;
    public final AnonymousClass00Y A01;

    public C09600dD(AnonymousClass00Y r1, AnonymousClass00D r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A00(int i) {
        C44051zQ r2 = new C44051zQ();
        r2.A00 = Integer.valueOf(i);
        r2.A01 = 13;
        this.A01.A09(r2, 1);
        AnonymousClass00Y.A01(r2, "");
    }

    public boolean A01(C000300f r12, Context context) {
        int i;
        if (r12.A0D(AbstractC000400g.A2M) && context.getPackageManager().getLaunchIntentForPackage("com.whatsapp.w4b") == null) {
            AnonymousClass00D r5 = this.A00;
            SharedPreferences sharedPreferences = r5.A00;
            if (AnonymousClass0OY.A00(System.currentTimeMillis(), sharedPreferences.getLong("biz_app_cross_sell_banner_notif_time", -1) * 1000) < sharedPreferences.getInt("biz_app_cross_sell_banner_expiry_days", 0) && sharedPreferences.getInt("biz_app_cross_sell_banner_dismiss_count", 0) < 1 && sharedPreferences.getInt("biz_app_cross_sell_banner_click_count", 0) < 2) {
                if (r5.A0n(86400000, "biz_app_upsell_banner_timestamp")) {
                    if (sharedPreferences.getInt("biz_app_cross_sell_banner_consecutive_days", 0) >= 2) {
                        AnonymousClass008.A0k(r5, "biz_app_cross_sell_banner_consecutive_days", 0);
                        AnonymousClass008.A0k(r5, "biz_app_cross_sell_banner_cool_off_days", sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0) + 1);
                    } else if (sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0) >= 5) {
                        AnonymousClass008.A0k(r5, "biz_app_cross_sell_banner_cool_off_days", 0);
                    } else {
                        int i2 = sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0);
                        if (i2 <= 0 || i2 > 5) {
                            AnonymousClass008.A0k(r5, "biz_app_cross_sell_banner_total_days", sharedPreferences.getInt("biz_app_cross_sell_banner_total_days", 0) + 1);
                            AnonymousClass008.A0k(r5, "biz_app_cross_sell_banner_consecutive_days", sharedPreferences.getInt("biz_app_cross_sell_banner_consecutive_days", 0) + 1);
                        } else {
                            AnonymousClass008.A0k(r5, "biz_app_cross_sell_banner_cool_off_days", sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0) + 1);
                        }
                    }
                    r5.A0B("biz_app_upsell_banner_timestamp");
                }
                if (sharedPreferences.getInt("biz_app_cross_sell_banner_total_days", 0) >= 4 || ((i = sharedPreferences.getInt("biz_app_cross_sell_banner_cool_off_days", 0)) > 0 && i <= 5)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
