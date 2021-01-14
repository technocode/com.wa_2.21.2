package X;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.00D  reason: invalid class name */
public class AnonymousClass00D {
    public static final String A04 = AnonymousClass008.A0O(new StringBuilder(), AnonymousClass020.A02, "_light");
    public static volatile AnonymousClass00D A05;
    public final SharedPreferences A00;
    public final AnonymousClass021 A01;
    public final Object A02 = new Object();
    public final Object A03 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x03be A[LOOP:1: B:15:0x03b8->B:17:0x03be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x03dd A[LOOP:2: B:19:0x03d7->B:21:0x03dd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x03f7 A[LOOP:3: B:23:0x03f1->B:25:0x03f7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0458 A[LOOP:4: B:28:0x0452->B:30:0x0458, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0556 A[LOOP:5: B:33:0x0550->B:35:0x0556, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass00D(X.AnonymousClass021 r16, X.AnonymousClass00G r17, X.AnonymousClass022 r18) {
        /*
        // Method dump skipped, instructions count: 1394
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass00D.<init>(X.021, X.00G, X.022):void");
    }

    public static AnonymousClass00D A00() {
        if (A05 == null) {
            synchronized (AnonymousClass00D.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass00D(new AnonymousClass021(), AnonymousClass00G.A01, AnonymousClass022.A00());
                }
            }
        }
        return A05;
    }

    public static List A01() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass02R("security_notifications", 1));
        arrayList.add(new AnonymousClass02R("input_enter_send", 1));
        arrayList.add(new AnonymousClass02R("interface_font_size", 2));
        arrayList.add(new AnonymousClass02R("settings_language", 2));
        arrayList.add(new AnonymousClass02R("conversation_sound", 1));
        arrayList.add(new AnonymousClass02R("autodownload_wifi_mask", 0));
        arrayList.add(new AnonymousClass02R("autodownload_cellular_mask", 0));
        arrayList.add(new AnonymousClass02R("autodownload_roaming_mask", 0));
        arrayList.add(new AnonymousClass02R("voip_low_data_usage", 1));
        return arrayList;
    }

    public static final List A02(String str, SharedPreferences sharedPreferences) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : sharedPreferences.getAll().keySet()) {
            if (str2.startsWith(str)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public int A03() {
        try {
            return Integer.parseInt(this.A00.getString("interface_gdrive_backup_frequency", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.e("wa-shared-preferences/get-backup-freq", e);
            return 0;
        }
    }

    public int A04() {
        try {
            return Integer.parseInt(this.A00.getString("interface_gdrive_backup_network_setting", String.valueOf(0)));
        } catch (NumberFormatException e) {
            Log.w("wa-shared-preferences/get-backup-network-settings", e);
            return 0;
        }
    }

    public int A05() {
        return this.A00.getInt("gdrive_error_code", 10);
    }

    public int A06() {
        return this.A00.getInt("gdrive_state", 0);
    }

    public int A07() {
        SharedPreferences sharedPreferences = this.A00;
        int i = 1;
        if (Build.VERSION.SDK_INT >= 29) {
            i = -1;
        }
        return sharedPreferences.getInt("night_mode", i);
    }

    public int A08() {
        int i = this.A00.getInt("reg_attempts_generate_code", 0) + 1;
        AnonymousClass008.A0k(this, "reg_attempts_generate_code", i);
        return i;
    }

    public long A09(String str) {
        if (str == null) {
            Log.w("wa-shared-preferences/get-backup-timestamp accountName passed is null.");
            return 0;
        }
        SharedPreferences sharedPreferences = this.A00;
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb.append(str);
        long j = sharedPreferences.getLong(sb.toString(), 0);
        if (j == 0) {
            j = sharedPreferences.getLong("gdrive_last_successful_backup_timestamp", 0);
            if (j != 0) {
                A0U(str, j);
                sharedPreferences.edit().remove("gdrive_last_successful_backup_timestamp").apply();
            }
        }
        return j;
    }

    public long A0A(String str) {
        SharedPreferences sharedPreferences = this.A00;
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        return sharedPreferences.getLong(sb.toString(), -1);
    }

    public long A0B(String str) {
        if (this.A01 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass008.A0l(this, str, currentTimeMillis);
            return currentTimeMillis;
        }
        throw null;
    }

    public Integer A0C() {
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences.getBoolean("need_to_get_groups", false)) {
            return 3;
        }
        if (sharedPreferences.contains("get_groups_params")) {
            return Integer.valueOf(sharedPreferences.getInt("get_groups_params", 0));
        }
        return null;
    }

    public String A0D() {
        return this.A00.getString("gdrive_account_name", null);
    }

    public String A0E() {
        String string = this.A00.getString("perf_device_id", null);
        if (string != null) {
            return string;
        }
        String obj = UUID.randomUUID().toString();
        AnonymousClass008.A0m(this, "perf_device_id", obj);
        return obj;
    }

    public String A0F() {
        return this.A00.getString("cc", "");
    }

    public String A0G() {
        return this.A00.getString("registration_jid", null);
    }

    public String A0H() {
        return this.A00.getString("ph", "");
    }

    public void A0I() {
        this.A00.edit().remove("gdrive_already_downloaded_bytes").remove("gdrive_restore_overwrite_local_files").remove("gdrive_restore_start_timestamp").remove("gdrive_media_restore_network_setting").remove("gdrive_approx_media_download_size").apply();
    }

    public void A0J() {
        Log.i("wa-shared-preferences/cleangcmregsettings");
        this.A00.edit().remove("c2dm_reg_id").remove("c2dm_app_vers").remove("saved_gcm_token_server_unreg").apply();
    }

    public void A0K() {
        this.A00.edit().remove("pref_fail_too_many").remove("pref_no_route_sms").remove("pref_no_route_voice").remove("pref_fail_too_many_attempts").remove("pref_fail_too_many_guesses").apply();
    }

    public void A0L() {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putInt("joinable_call_education_shown_count", sharedPreferences.getInt("joinable_call_education_shown_count", 0) + 1).apply();
    }

    public void A0M() {
        this.A00.edit().remove("gdpr_report_expiration_timestamp").remove("gdpr_report_timestamp").remove("gdpr_report_state").apply();
    }

    public void A0N(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/setdeletechat ");
        sb.append(i);
        Log.d(sb.toString());
        this.A00.edit().putInt("delete_chat_count", i).apply();
    }

    public void A0O(int i) {
        this.A00.edit().putInt("external_dir_migration_stage", i).commit();
    }

    public void A0P(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/getgroupsparams ");
        sb.append(i);
        Log.i(sb.toString());
        this.A00.edit().remove("need_to_get_groups").putInt("get_groups_params", i).apply();
    }

    public void A0Q(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-preferences/set-gdrive-state/");
        sb.append(i);
        Log.i(sb.toString());
        this.A00.edit().putInt("gdrive_state", i).apply();
    }

    public void A0R(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-prefs/setlogincountwithmsgs ");
        sb.append(i);
        Log.d(sb.toString());
        this.A00.edit().putInt("logins_with_messages", i).apply();
    }

    public void A0S(int i) {
        StringBuilder sb = new StringBuilder("wa-shared-prefs/setNumNotificationChannelsCreated ");
        sb.append(i);
        Log.d(sb.toString());
        this.A00.edit().putInt("num_notification_channels_created", i).apply();
    }

    public void A0T(long j) {
        StringBuilder A0V = AnonymousClass008.A0V("wa-shared-prefs/save-gdrive-user-prompt-again-timestamp/", j, " ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        A0V.append(simpleDateFormat.format(instance.getTime()));
        Log.i(A0V.toString());
        this.A00.edit().putLong("gdrive_next_prompt_for_setup_timestamp", j).apply();
    }

    public void A0U(String str, long j) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("wa-shared-preferences/set-backup-timestamp last successful backup timestamp is set to ");
            sb.append(j);
            sb.append(" but accountName associated is null, ignoring.");
            Log.e(sb.toString());
            return;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb2 = new StringBuilder("gdrive_last_successful_backup_timestamp:");
        sb2.append(str);
        edit.putLong(sb2.toString(), j).apply();
    }

    public void A0V(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-total-backup-size account name is null");
            return;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_total_size:");
        sb.append(str);
        edit.putLong(sb.toString(), j).apply();
    }

    public void A0W(String str, long j) {
        if (str == null) {
            Log.e("wa-shared-preferences/set-backup-video-size account name is null");
            return;
        }
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_video_size:");
        sb.append(str);
        edit.putLong(sb.toString(), j).apply();
    }

    public void A0X(String str, String str2) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (str == null) {
            edit.remove("my_current_status");
            edit.remove("my_current_status_hash");
        } else {
            edit.putString("my_current_status", str);
            if (TextUtils.isEmpty(str2)) {
                edit.remove("my_current_status_hash");
            } else {
                edit.putString("my_current_status_hash", str2);
            }
        }
        edit.apply();
    }

    public void A0Y(String str, String str2) {
        SharedPreferences.Editor edit = this.A00.edit();
        StringBuilder sb = new StringBuilder("downloadable_category_local_info_json_");
        sb.append(str);
        edit.putString(sb.toString(), str2).apply();
    }

    public void A0Z(String str, String str2) {
        this.A00.edit().putString("cc", str).putString("ph", str2).apply();
    }

    public void A0a(String str, String str2, long j, long j2, long j3, long j4) {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putString("registration_wipe_type", str).putString("registration_wipe_token", str2).putLong("registration_wipe_wait", j).putLong("registration_wipe_expiry", j2).putLong("registration_wipe_server_time", j3).apply();
        sharedPreferences.edit().putLong("registration_wipe_info_timestamp", j4).apply();
    }

    public void A0b(boolean z) {
        SharedPreferences.Editor remove = this.A00.edit().remove("external_dir_migration_attempt_n").remove("ext_dir_migration_rescan_time").remove("ext_dir_migration_move_time").remove("ext_dir_migration_start_time");
        if (!z) {
            remove.remove("external_dir_migration_stage");
        }
        remove.commit();
    }

    public void A0c(boolean z) {
        StringBuilder sb = new StringBuilder("wa-shared-prefs/setenter-is-send ");
        sb.append(z);
        Log.d(sb.toString());
        this.A00.edit().putBoolean("input_enter_send", z).apply();
    }

    public void A0d(boolean z) {
        AnonymousClass008.A1H("wa-shared-prefs/setshouldgetprekeydigest/", z);
        synchronized (this.A02) {
            this.A00.edit().putBoolean("need_to_get_pre_key_digest", z).apply();
        }
    }

    public void A0e(boolean z) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (z) {
            edit.putBoolean("show_post_reg_logged_out_dialog", true);
        } else {
            edit.remove("show_post_reg_logged_out_dialog");
        }
        edit.apply();
    }

    public void A0f(boolean z) {
        SharedPreferences.Editor edit = this.A00.edit();
        if (z) {
            edit.putBoolean("show_pre_reg_do_not_share_code_warning", true);
        } else {
            edit.remove("show_pre_reg_do_not_share_code_warning");
        }
        edit.apply();
    }

    public void A0g(boolean z) {
        AnonymousClass008.A1H("wa-shared-prefs/setsignalprotocolstoreisnew/", z);
        synchronized (this.A03) {
            this.A00.edit().putBoolean("signal_protocol_store_is_new", z).apply();
        }
    }

    public void A0h(boolean z) {
        this.A00.edit().putBoolean("underage_account_banned", z).apply();
        StringBuilder sb = new StringBuilder("wa-shared-prefs/setUnderageAccountBanned ");
        sb.append(z);
        Log.d(sb.toString());
    }

    public void A0i(boolean z, long j) {
        SharedPreferences sharedPreferences = this.A00;
        sharedPreferences.edit().putBoolean("spam_banned", z).apply();
        sharedPreferences.edit().putLong("spam_banned_expiry_timestamp", j).apply();
        AnonymousClass008.A1Z(new StringBuilder("wa-shared-prefs/setspambanned "), z);
    }

    public void A0j(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A00.edit().putBoolean("pref_fail_too_many", z).putBoolean("pref_no_route_sms", z2).putBoolean("pref_no_route_voice", z3).putBoolean("pref_fail_too_many_attempts", z4).putBoolean("pref_fail_too_many_guesses", z5).apply();
    }

    public boolean A0k() {
        return this.A00.getBoolean("read_receipts_enabled", true);
    }

    public boolean A0l() {
        boolean z;
        synchronized (this.A03) {
            z = this.A00.getBoolean("signal_protocol_store_is_new", false);
        }
        return z;
    }

    public boolean A0m(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            this.A00.edit().putString("interface_gdrive_backup_frequency", String.valueOf(i)).apply();
            return true;
        }
        AnonymousClass008.A0u("wa-shared-preferences/set-backup-freq/", i);
        return false;
    }

    public boolean A0n(long j, String str) {
        long j2 = this.A00.getLong(str, -1);
        if (j2 == -1) {
            return true;
        }
        if (this.A01 == null) {
            throw null;
        } else if (System.currentTimeMillis() <= j2 + j) {
            return false;
        } else {
            return true;
        }
    }
}
