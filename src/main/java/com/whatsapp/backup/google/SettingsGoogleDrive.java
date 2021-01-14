package com.whatsapp.backup.google;

import X.AbstractC000900m;
import X.AbstractC005802u;
import X.AbstractC07200Wh;
import X.AbstractC09090cH;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass088;
import X.AnonymousClass0AR;
import X.AnonymousClass0HO;
import X.AnonymousClass0HQ;
import X.AnonymousClass0IZ;
import X.AnonymousClass0JJ;
import X.AnonymousClass0LW;
import X.AnonymousClass0OY;
import X.AnonymousClass0OZ;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass1ND;
import X.AnonymousClass1QW;
import X.AnonymousClass1R2;
import X.AnonymousClass1R4;
import X.AnonymousClass1U0;
import X.AnonymousClass2C0;
import X.AnonymousClass325;
import X.C002001d;
import X.C002101e;
import X.C003301q;
import X.C004302a;
import X.C006803i;
import X.C02290Bk;
import X.C02300Bl;
import X.C04600Kz;
import X.C09080cG;
import X.C28051Sr;
import X.C40631ta;
import X.C41301uo;
import X.C41311up;
import X.C41331ur;
import X.C41441v3;
import X.C41451v4;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SettingsChat;
import com.whatsapp.WaTextView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;

public class SettingsGoogleDrive extends ActivityC004602e implements AbstractC005802u, AnonymousClass1R4 {
    public static final int[] A0i = {R.string.settings_gdrive_backup_frequency_option_off, R.string.settings_gdrive_backup_frequency_option_manual, R.string.settings_gdrive_backup_frequency_option_daily, R.string.settings_gdrive_backup_frequency_option_weekly, R.string.settings_gdrive_backup_frequency_option_monthly};
    public static final int[] A0j = {0, 4, 1, 2, 3};
    public static final int[] A0k = {R.string.settings_gdrive_backup_network_setting_option_wifi, R.string.settings_gdrive_backup_network_setting_option_wifi_and_cellular};
    public static final int[] A0l = {R.string.settings_gdrive_backup_network_setting_option_wifi_summary, R.string.settings_gdrive_backup_network_setting_option_wifi_and_cellular};
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public Button A0A;
    public ImageView A0B;
    public ImageView A0C;
    public ProgressBar A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public SwitchCompat A0I;
    public WaTextView A0J;
    public GoogleBackupService A0K = null;
    public boolean A0L;
    public String[] A0M;
    public final ServiceConnection A0N = new AnonymousClass1R2(this);
    public final ConditionVariable A0O = new ConditionVariable(false);
    public final ConditionVariable A0P = new ConditionVariable(false);
    public final AnonymousClass088 A0Q = AnonymousClass088.A00();
    public final AnonymousClass0HQ A0R = AnonymousClass0HQ.A00();
    public final C09080cG A0S = C09080cG.A00();
    public final AbstractC09090cH A0T = new C41451v4(this);
    public final AbstractC000900m A0U = new C41301uo(this);
    public final C003301q A0V = C003301q.A02;
    public final AbstractC07200Wh A0W = new C41441v3(this);
    public final AnonymousClass1U0 A0X = new C41311up(this);
    public final AnonymousClass00C A0Y = AnonymousClass00C.A00();
    public final AnonymousClass04j A0Z = AnonymousClass04j.A00();
    public final AnonymousClass03S A0a = AnonymousClass03S.A00();
    public final AnonymousClass0HO A0b = AnonymousClass0HO.A00();
    public final C02290Bk A0c = C02290Bk.A02();
    public final AnonymousClass0AR A0d = AnonymousClass0AR.A00();
    public final AnonymousClass325 A0e = AnonymousClass325.A00();
    public final AnonymousClass0IZ A0f = AnonymousClass0IZ.A01();
    public final AnonymousClass00T A0g = C002101e.A00();
    public volatile boolean A0h;

    public class AuthRequestDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass1ND r3 = new AnonymousClass1ND(A00());
            AnonymousClass01X r2 = this.A00;
            r3.setTitle(r2.A06(R.string.settings_gdrive_authenticating_with_google_servers_title));
            r3.setIndeterminate(true);
            r3.setMessage(r2.A06(R.string.settings_gdrive_authenticating_with_google_servers_message));
            r3.setCancelable(true);
            r3.setOnCancelListener(new AnonymousClass1QW(this));
            return r3;
        }
    }

    public final int A0T() {
        int A032 = super.A0J.A03();
        int i = 0;
        while (true) {
            int[] iArr = A0j;
            if (i >= iArr.length) {
                AnonymousClass008.A0u("settings-gdrive/get-backup-freq-index/", A032);
                return 0;
            } else if (iArr[i] == A032) {
                return i;
            } else {
                i++;
            }
        }
    }

    public void A0U() {
        if (!(this instanceof GoogleDriveNewUserSetupActivity)) {
            View findViewById = findViewById(R.id.include_video_settings_summary);
            if (findViewById != null) {
                TextView textView = (TextView) findViewById;
                AnonymousClass00D r6 = super.A0J;
                String A0D2 = r6.A0D();
                String str = null;
                long j = -1;
                if (!TextUtils.isEmpty(A0D2)) {
                    SharedPreferences sharedPreferences = r6.A00;
                    StringBuilder sb = new StringBuilder("gdrive_last_successful_backup_video_size:");
                    sb.append(A0D2);
                    j = sharedPreferences.getLong(sb.toString(), -1);
                }
                if (j > 0) {
                    textView.setVisibility(0);
                    str = C002001d.A1V(((AnonymousClass2C0) this).A01, R.plurals.settings_gdrive_video_size_already_uploaded_plural, j, false);
                } else if (this.A0I.isChecked()) {
                    textView.setVisibility(0);
                    AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
                    AnonymousClass088 r3 = this.A0Q;
                    str = C002001d.A1V(r4, R.plurals.settings_gdrive_video_size_to_be_uploaded_plural, C006803i.A03(r3.A04().A0L, new C41331ur(r6, ((ActivityC004702f) this).A0G, r3)), false);
                } else {
                    textView.setVisibility(8);
                }
                textView.setText(str);
                return;
            }
            throw null;
        }
    }

    public void A0V() {
        AnonymousClass00E.A01();
        if (!AnonymousClass0JJ.A0H(this)) {
            AnonymousClass00D r2 = super.A0J;
            if (AnonymousClass0JJ.A0I(r2)) {
                Log.i("settings-gdrive/account-selector/backup/running");
                APo(R.string.settings_gdrive_please_wait_for_backup_to_finish_before_account_change);
            } else if (AnonymousClass0JJ.A0J(r2)) {
                Log.i("settings-gdrive/account-selector/restore/running");
                APo(R.string.settings_gdrive_please_wait_for_restore_to_finish_before_account_change);
            } else {
                AnonymousClass03S r1 = this.A0a;
                if (r1.A02("android.permission.GET_ACCOUNTS") != 0 || !r1.A03()) {
                    A0H(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_contacts_small).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"}).putExtra("message_id", R.string.permission_contacts_access_for_gdrive_backup_request).putExtra("perm_denial_message_id", R.string.permission_contacts_access_for_gdrive_backup), 150);
                    return;
                }
                String A0D2 = r2.A0D();
                Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
                int length = accountsByType.length;
                if (length > 0) {
                    AnonymousClass008.A1L(AnonymousClass008.A0S("settings-gdrive/account-selector/starting-account-picker/num-accounts/"), length);
                    int i = -1;
                    int i2 = length + 1;
                    String[] strArr = new String[i2];
                    for (int i3 = 0; i3 < length; i3++) {
                        strArr[i3] = accountsByType[i3].name;
                        if (A0D2 != null && A0D2.equals(strArr[i3])) {
                            i = i3;
                        }
                    }
                    AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
                    strArr[i2 - 1] = r6.A06(R.string.google_account_picker_add_account);
                    SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
                    Bundle A012 = AnonymousClass008.A01("dialog_id", 17);
                    A012.putString("title", r6.A06(R.string.google_account_picker_title));
                    A012.putInt("selected_item_index", i);
                    A012.putStringArray("multi_line_list_items_key", strArr);
                    singleChoiceListDialogFragment.A0N(A012);
                    AnonymousClass0LW A042 = A04();
                    if (A042.A0Q.A01("account-picker") != null) {
                        return;
                    }
                    if (A042 != null) {
                        AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                        r0.A0A(0, singleChoiceListDialogFragment, "account-picker", 1);
                        r0.A01();
                        return;
                    }
                    throw null;
                }
                Log.i("settings-gdrive/account-selector/no-account-found/start-add-account-activity");
                A0Z();
            }
        }
    }

    public final void A0W() {
        AnonymousClass00C r9 = this.A0Y;
        if (r9.A09(this.A0W)) {
            GoogleBackupService googleBackupService = this.A0K;
            if (googleBackupService != null) {
                googleBackupService.A03(10);
            }
            AnonymousClass0HO r5 = this.A0b;
            AnonymousClass0AR r6 = this.A0d;
            r5.A02(3000, new C40631ta(this, ((AnonymousClass2C0) this).A01, r5, r6, this, new RunnableEBaseShape7S0100000_I1_2(this, 29), r9, this.A0a));
        }
    }

    public final void A0X() {
        long j;
        Object A1F;
        AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
        String A062 = SettingsChat.A06(r6, this.A0c);
        AnonymousClass00D r8 = super.A0J;
        String A0D2 = r8.A0D();
        if (A0D2 != null) {
            j = r8.A09(A0D2);
        } else {
            j = 0;
        }
        long j2 = -1;
        if (j == 0) {
            A1F = r6.A06(R.string.never);
        } else if (j == -1) {
            A1F = r6.A06(R.string.unknown);
        } else if (AnonymousClass0OY.A00(System.currentTimeMillis(), j) == 0) {
            A1F = AnonymousClass0OZ.A00(r6, j);
        } else {
            A1F = C002001d.A1F(r6, j);
        }
        if (A0D2 != null) {
            j2 = r8.A0A(A0D2);
        }
        if (this.A0A != null) {
            TextView textView = (TextView) findViewById(R.id.local_backup_time);
            if (textView != null) {
                textView.setText(r6.A0D(R.string.local_backup_time, A062));
                TextView textView2 = (TextView) findViewById(R.id.gdrive_backup_time);
                if (textView2 != null) {
                    textView2.setText(r6.A0D(R.string.google_drive_backup_time, A1F));
                    if (j2 > 0) {
                        View findViewById = findViewById(R.id.gdrive_backup_size);
                        if (findViewById != null) {
                            findViewById.setVisibility(0);
                            TextView textView3 = (TextView) findViewById(R.id.gdrive_backup_size);
                            if (textView3 != null) {
                                textView3.setText(r6.A0D(R.string.google_drive_backup_size, C002001d.A1Y(r6, j2)));
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        View findViewById2 = findViewById(R.id.gdrive_backup_size);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(8);
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        A0U();
    }

    public final void A0Y() {
        this.A0g.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 26));
    }

    public final void A0Z() {
        this.A0g.ANF(new RunnableEBaseShape6S0200000_I1_1(this, AccountManager.get(this).addAccount("com.google", null, null, null, this, null, null), 22));
    }

    public final void A0a() {
        GoogleBackupService googleBackupService = this.A0K;
        if (googleBackupService != null) {
            googleBackupService.A03(10);
        }
        Intent intent = new Intent("action_backup");
        intent.putExtra("backup_mode", "user_initiated");
        AnonymousClass0JJ.A0G(this, intent);
    }

    public final void A0b(String str) {
        AnonymousClass00E.A00();
        StringBuilder sb = new StringBuilder("settings-gdrive/auth-request account being used is ");
        sb.append(AnonymousClass0JJ.A0B(str));
        Log.i(sb.toString());
        AuthRequestDialogFragment authRequestDialogFragment = new AuthRequestDialogFragment();
        this.A0h = false;
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        RunnableEBaseShape6S0200000_I1_1 runnableEBaseShape6S0200000_I1_1 = new RunnableEBaseShape6S0200000_I1_1(this, authRequestDialogFragment, 23);
        Handler handler = r2.A02;
        handler.post(runnableEBaseShape6S0200000_I1_1);
        ConditionVariable conditionVariable = this.A0P;
        conditionVariable.close();
        this.A0g.ANF(new RunnableEBaseShape1S1200000_I1(this, authRequestDialogFragment, str, 12));
        Log.i("settings-gdrive/auth-request blocking on tokenReceived");
        C04600Kz r22 = new C04600Kz("settings-gdrive/fetch-auth-token");
        conditionVariable.block(30000);
        handler.post(new RunnableEBaseShape6S0200000_I1_1(this, r22, 21));
    }

    public final void A0c(String str) {
        StringBuilder A0S2 = AnonymousClass008.A0S("setting-gdrive/activity-result/account-picker accountName is ");
        A0S2.append(AnonymousClass0JJ.A0B(str));
        Log.i(A0S2.toString());
        if (str != null) {
            this.A0g.ANF(new RunnableEBaseShape1S1100000_I1(this, str, 16));
        } else if (super.A0J.A0D() == null) {
            Log.i("setting-gdrive/activity-result/account-picker accountName is null");
            if (!(this instanceof GoogleDriveNewUserSetupActivity)) {
                super.A0J.A0m(0);
                this.A0F.setText(this.A0M[A0T()]);
                return;
            }
            GoogleDriveNewUserSetupActivity googleDriveNewUserSetupActivity = (GoogleDriveNewUserSetupActivity) this;
            ((ActivityC004702f) googleDriveNewUserSetupActivity).A0J.A0m(0);
            if (googleDriveNewUserSetupActivity.A00 != 0) {
                googleDriveNewUserSetupActivity.A0h(false);
                googleDriveNewUserSetupActivity.A0f();
                googleDriveNewUserSetupActivity.A00 = -1;
            }
        }
    }

    public final void A0d(String str, String str2) {
        this.A0P.open();
        DialogFragment dialogFragment = (DialogFragment) A04().A0Q.A01("auth_request_dialog");
        if (dialogFragment != null) {
            dialogFragment.A0r();
        }
        if (str != null) {
            AnonymousClass00D r1 = super.A0J;
            if (!TextUtils.equals(r1.A0D(), str2)) {
                AnonymousClass008.A0m(r1, "gdrive_account_name", str2);
                GoogleBackupService googleBackupService = this.A0K;
                if (googleBackupService != null) {
                    Log.i("gdrive-service/reset");
                    googleBackupService.A03 = null;
                }
                StringBuilder A0S2 = AnonymousClass008.A0S("settings-gdrive/activity-result new accountName is ");
                A0S2.append(AnonymousClass0JJ.A0B(str2));
                Log.i(A0S2.toString());
                Intent intent = new Intent("action_fetch_backup_info");
                intent.putExtra("account_name", str2);
                AnonymousClass0JJ.A0G(this, intent);
                this.A0E.setText(str2);
                A0X();
            } else {
                StringBuilder A0S3 = AnonymousClass008.A0S("settings-gdrive/activity-result account unchanged, token received for ");
                A0S3.append(AnonymousClass0JJ.A0B(str2));
                Log.i(A0S3.toString());
            }
        }
        this.A0g.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 22));
    }

    @Override // X.AbstractC005802u
    public void AF5(int i) {
        switch (i) {
            case 12:
                Log.i("settings-gdrive/cancel-media-restore-dialog/user-decided-not-to-cancel");
                return;
            case 13:
                Log.i("settings-gdrive/perform-backup user declined to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                return;
            case 14:
            default:
                throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
            case 15:
                Log.i("settings-gdrive/user-declined-to-restore-media-over-cellular");
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                Log.i("settings-gdrive/user-declined-to-backup-over-cellular");
                return;
        }
    }

    @Override // X.AbstractC005802u
    public void AF6(int i) {
        throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
    }

    @Override // X.AbstractC005802u
    public void AF7(int i) {
        switch (i) {
            case 12:
                GoogleBackupService googleBackupService = this.A0K;
                if (googleBackupService != null) {
                    googleBackupService.A01();
                    return;
                } else {
                    Log.e("settings-gdrive/cancel-media-restore google drive service object is null, unexpected.");
                    return;
                }
            case 13:
                Log.i("settings-gdrive/perform-backup user decided to perform Google Drive backup over cellular (when the settings say Wi-Fi only)");
                AnonymousClass0HQ r3 = this.A0R;
                r3.A03 = true;
                r3.A0X.ANF(new RunnableEBaseShape7S0100000_I1_2(r3, 7));
                A0a();
                return;
            case 14:
                Log.i("settings-gdrive/google-play-services-is-broken");
                super.A0J.A0m(0);
                this.A0F.setText(this.A0M[A0T()]);
                return;
            case 15:
                Log.i("settings-gdrive/user-confirmed-media-restore-over-cellular");
                AnonymousClass0HQ r32 = this.A0R;
                r32.A0R.A00.edit().putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
                r32.A02();
                r32.A0X.ANF(new RunnableEBaseShape7S0100000_I1_2(r32, 7));
                return;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                Log.i("settings-gdrive/user-confirmed-backup-over-cellular");
                AnonymousClass0HQ r33 = this.A0R;
                r33.A03 = true;
                r33.A0X.ANF(new RunnableEBaseShape7S0100000_I1_2(r33, 7));
                return;
            default:
                throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
        }
    }

    @Override // X.AnonymousClass1R4
    public void AF8(int i) {
        StringBuilder sb = new StringBuilder("settings-gdrive/dialogId-");
        sb.append(i);
        sb.append("-dismissed");
        Log.i(sb.toString());
    }

    @Override // X.AnonymousClass1R4
    public void AKA(int i, int i2, String[] strArr) {
        if (i == 10) {
            int[] iArr = A0j;
            if (i2 > iArr.length) {
                AnonymousClass008.A0u("settings-gdrive/change-freq/unexpected-choice/", i2);
                return;
            }
            AnonymousClass008.A1L(AnonymousClass008.A0T("settings-gdrive/change-freq/index:", i2, "/value:"), iArr[i2]);
            AnonymousClass00D r8 = super.A0J;
            int A032 = r8.A03();
            int i3 = iArr[i2];
            if (!r8.A0m(i3)) {
                Log.e("settings-gdrive/change-freq failed to set the new frequency.");
                return;
            }
            this.A0F.setText(this.A0M[i2]);
            if (i3 != 0) {
                if (A032 == 0 && !AnonymousClass0JJ.A0I(r8) && !AnonymousClass0JJ.A0J(r8)) {
                    this.A04.performClick();
                }
            } else if (r8.A00.getLong("gdrive_next_prompt_for_setup_timestamp", -1) < System.currentTimeMillis() + 2592000000L) {
                r8.A0T(System.currentTimeMillis() + 2592000000L);
            }
        } else if (i == 11) {
            String A062 = ((AnonymousClass2C0) this).A01.A06(A0l[i2]);
            AnonymousClass008.A18("settings-gdrive/backup-network/", A062);
            this.A0H.setText(A062);
            this.A0g.ANF(new RunnableEBaseShape1S0101000_I1(this, i2, 8));
        } else if (i != 17) {
            throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
        } else if (strArr[i2].equals(((AnonymousClass2C0) this).A01.A06(R.string.google_account_picker_add_account))) {
            A0Z();
        } else {
            A0c(strArr[i2]);
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringBackup$1610$SettingsGoogleDrive(View view) {
        A0V();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringBackup$1612$SettingsGoogleDrive(View view) {
        String A0D2 = super.A0J.A0D();
        if (A0D2 == null) {
            A0V();
        } else {
            this.A0g.ANF(new RunnableEBaseShape1S1100000_I1(this, A0D2, 15));
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringBackup$1613$SettingsGoogleDrive(View view) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com/settings/storage?emr=0&authuser=-1&utm_source=whatsapp")));
        } catch (ActivityNotFoundException e) {
            Log.e("settings-gdrive/display-backup-error/banner-tapped/unable-to-display-url", e);
            AnonymousClass02M r4 = ((ActivityC004702f) this).A0F;
            String A0D2 = ((AnonymousClass2C0) this).A01.A0D(R.string.unable_to_display_url, "http://www.google.com/settings/storage?emr=0&authuser=-1&utm_source=whatsapp");
            if (this != null) {
                APr(A0D2);
            } else {
                r4.A0G(A0D2, 0);
            }
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1618$SettingsGoogleDrive(View view) {
        this.A0g.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 28));
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1619$SettingsGoogleDrive(View view) {
        A0Y();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1620$SettingsGoogleDrive(View view) {
        A0Y();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1621$SettingsGoogleDrive(View view) {
        A0Y();
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMediaRestore$1623$SettingsGoogleDrive(View view) {
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_restore_media_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_restore_media;
        }
        RequestPermissionActivity.A09(this, i2, R.string.permission_storage_need_write_access_on_restore_media_request);
    }

    public /* synthetic */ void lambda$setupListeners$1592$SettingsGoogleDrive(View view) {
        A0W();
    }

    public /* synthetic */ void lambda$setupListeners$1593$SettingsGoogleDrive(View view) {
        GoogleBackupService googleBackupService = this.A0K;
        if (googleBackupService != null) {
            googleBackupService.A01();
            this.A0B.setVisibility(8);
            return;
        }
        Log.e("settings-gdrive/cancel-backup google drive service object is null, unexpected.");
    }

    public void lambda$setupListeners$1594$SettingsGoogleDrive(View view) {
        Bundle A012 = AnonymousClass008.A01("dialog_id", 12);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        A012.putString("message", r2.A06(R.string.gdrive_cancel_media_restore_message));
        A012.putString("positive_button", r2.A06(R.string.skip));
        A012.putString("negative_button", r2.A06(R.string.cancel));
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0N(A012);
        AnonymousClass0LW A042 = A04();
        if (A042 != null) {
            AnonymousClass0QB r22 = new AnonymousClass0QB(A042);
            r22.A0A(0, promptDialogFragment, null, 1);
            r22.A01();
            return;
        }
        throw null;
    }

    public void lambda$setupListeners$1595$SettingsGoogleDrive(View view) {
        if (view == this.A04) {
            A0V();
        } else if (view == this.A08) {
            Log.i("settings-gdrive/show-network-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A012 = AnonymousClass008.A01("dialog_id", 11);
            AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
            A012.putString("title", r1.A06(R.string.settings_gdrive_network_settings_title));
            A012.putStringArray("items", r1.A0N(A0k));
            A012.putInt("selected_item_index", super.A0J.A04());
            singleChoiceListDialogFragment.A0N(A012);
            if (!AnonymousClass0JJ.A0H(this)) {
                AnonymousClass0LW A042 = A04();
                if (A042 != null) {
                    AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                    r0.A0A(0, singleChoiceListDialogFragment, null, 1);
                    r0.A01();
                    return;
                }
                throw null;
            }
        } else if (view == this.A06) {
            Log.i("settings-gdrive/show-freq-pref");
            SingleChoiceListDialogFragment singleChoiceListDialogFragment2 = new SingleChoiceListDialogFragment();
            Bundle A013 = AnonymousClass008.A01("dialog_id", 10);
            A013.putString("title", ((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_options_title));
            A013.putStringArray("items", this.A0M);
            A013.putInt("selected_item_index", A0T());
            singleChoiceListDialogFragment2.A0N(A013);
            if (!AnonymousClass0JJ.A0H(this)) {
                AnonymousClass0LW A043 = A04();
                if (A043 != null) {
                    AnonymousClass0QB r02 = new AnonymousClass0QB(A043);
                    r02.A0A(0, singleChoiceListDialogFragment2, null, 1);
                    r02.A01();
                    return;
                }
                throw null;
            }
        } else if (view == this.A07) {
            AnonymousClass00D r2 = super.A0J;
            if (AnonymousClass0JJ.A0I(r2)) {
                APo(R.string.settings_gdrive_please_wait_for_backup_to_finish_before_change);
                return;
            }
            if (AnonymousClass0JJ.A0J(r2)) {
                APo(R.string.settings_gdrive_please_wait_for_media_restore_to_finish_before_account_change);
            } else {
                this.A0I.toggle();
            }
            AnonymousClass008.A0n(r2, "gdrive_include_videos_in_backup", this.A0I.isChecked());
            A0U();
        } else {
            throw new IllegalArgumentException("Can't handle the click event for the pref view");
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        AnonymousClass008.A0y("settings-gdrive/activity-result request: ", i, " result: ", i2);
        super.onActivityResult(i, i2, intent);
        String str2 = null;
        if (i != 1) {
            if (i == 2) {
                if (intent != null) {
                    str = intent.getStringExtra("authAccount");
                } else {
                    str = null;
                }
                if (i2 == -1) {
                    str2 = str;
                }
                A0c(str2);
            } else if (i != 100) {
                if (i != 150) {
                    if (i == 151 && i2 == -1) {
                        if (this.A0K != null && super.A0J.A05() == 23) {
                            this.A0K.A03(10);
                        }
                        AnonymousClass00D r1 = super.A0J;
                        if (AnonymousClass0JJ.A0J(r1) || AnonymousClass0JJ.A0I(r1)) {
                            AnonymousClass0HQ r3 = this.A0R;
                            r3.A0X.ANF(new RunnableEBaseShape2S0100000_I0_2(r3, 6));
                            return;
                        }
                        A0W();
                    }
                } else if (i2 == -1) {
                    A0V();
                }
            } else if (C02300Bl.A00() != null) {
                this.A0J.setText(((AnonymousClass2C0) this).A01.A06(R.string.settings_gdrive_backup_password_protect_value_disabled));
            } else {
                throw null;
            }
        } else if (i2 != -1) {
            DialogFragment dialogFragment = (DialogFragment) A04().A0Q.A01("auth_request_dialog");
            if (dialogFragment != null) {
                dialogFragment.A0r();
            }
        } else if (intent != null) {
            A0d(intent.getStringExtra("authtoken"), intent.getStringExtra("authAccount"));
        } else {
            throw null;
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (isTaskRoot()) {
            startActivity(new Intent(this, Main.class));
        }
        finish();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        setTitle(r5.A06(R.string.settings_backup));
        setContentView(R.layout.activity_settings_google_drive);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            View findViewById = findViewById(R.id.google_drive_backup_error_info_view);
            if (findViewById != null) {
                this.A05 = findViewById;
                this.A04 = findViewById(R.id.settings_gdrive_change_account_view);
                AnonymousClass00D r6 = super.A0J;
                String A0D2 = r6.A0D();
                if (A0D2 == null) {
                    A0D2 = r5.A06(R.string.settings_gdrive_account_name_missing_value);
                }
                View findViewById2 = findViewById(R.id.settings_gdrive_account_name_summary);
                if (findViewById2 != null) {
                    TextView textView = (TextView) findViewById2;
                    this.A0E = textView;
                    textView.setText(A0D2);
                    this.A0A = (Button) findViewById(R.id.google_drive_backup_now_btn);
                    AnonymousClass0HQ r3 = this.A0R;
                    if (r3.A0Y.get() || AnonymousClass0JJ.A0J(r6)) {
                        this.A0A.setVisibility(8);
                    }
                    this.A0G = (TextView) findViewById(R.id.google_drive_backup_now_btn_info);
                    int i = R.string.settings_gdrive_backup_general_info_sdcard_short;
                    TextView textView2 = (TextView) findViewById(R.id.gdrive_backup_general_info);
                    if (textView2 != null) {
                        if (!AnonymousClass00C.A01()) {
                            i = R.string.settings_gdrive_backup_general_info_shared_storage_short;
                        }
                        textView2.setText(r5.A06(i));
                        ProgressBar progressBar = (ProgressBar) findViewById(R.id.google_drive_progress);
                        this.A0D = progressBar;
                        C28051Sr.A1V(progressBar, C004302a.A00(this, R.color.media_message_progress_determinate));
                        this.A0B = (ImageView) findViewById(R.id.cancel_download);
                        this.A0C = (ImageView) findViewById(R.id.resume_download);
                        this.A06 = findViewById(R.id.settings_gdrive_change_frequency_view);
                        this.A0F = (TextView) findViewById(R.id.settings_gdrive_backup_options_summary);
                        int[] iArr = A0i;
                        int length = iArr.length;
                        this.A0M = new String[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            if (iArr[i2] == R.string.settings_gdrive_backup_frequency_option_manual) {
                                this.A0M[i2] = r5.A0D(R.string.settings_gdrive_backup_frequency_option_manual, r5.A06(R.string.backup));
                            } else {
                                this.A0M[i2] = r5.A06(iArr[i2]);
                            }
                        }
                        this.A0F.setText(this.A0M[A0T()]);
                        this.A08 = findViewById(R.id.settings_gdrive_network_settings_view);
                        this.A0H = (TextView) findViewById(R.id.settings_gdrive_network_settings_summary);
                        this.A07 = findViewById(R.id.settings_gdrive_backup_optional_media);
                        this.A09 = findViewById(R.id.settings_gdrive_password_protect_backups);
                        this.A0J = (WaTextView) findViewById(R.id.settings_gdrive_password_protect_backups_value);
                        this.A09.setVisibility(8);
                        this.A0H.setText(r5.A06(A0l[r6.A04()]));
                        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id.include_video_setting);
                        this.A0I = switchCompat;
                        switchCompat.setChecked(r6.A00.getBoolean("gdrive_include_videos_in_backup", false));
                        ViewOnClickEBaseShape4S0100000_I1_2 viewOnClickEBaseShape4S0100000_I1_2 = new ViewOnClickEBaseShape4S0100000_I1_2(this, 14);
                        this.A03 = viewOnClickEBaseShape4S0100000_I1_2;
                        this.A00 = new ViewOnClickEBaseShape4S0100000_I1_2(this, 17);
                        this.A01 = new ViewOnClickEBaseShape4S0100000_I1_2(this, 16);
                        this.A0A.setOnClickListener(viewOnClickEBaseShape4S0100000_I1_2);
                        ViewOnClickEBaseShape4S0100000_I1_2 viewOnClickEBaseShape4S0100000_I1_22 = new ViewOnClickEBaseShape4S0100000_I1_2(this, 18);
                        this.A04.setOnClickListener(viewOnClickEBaseShape4S0100000_I1_22);
                        A0X();
                        this.A08.setOnClickListener(viewOnClickEBaseShape4S0100000_I1_22);
                        this.A06.setOnClickListener(viewOnClickEBaseShape4S0100000_I1_22);
                        this.A07.setOnClickListener(viewOnClickEBaseShape4S0100000_I1_22);
                        this.A0V.A01(this.A0U);
                        bindService(new Intent(this, GoogleBackupService.class), this.A0N, 1);
                        if (!r3.A06()) {
                            Log.i("settings-gdrive/create google drive access not allowed.");
                            finish();
                        }
                        if (!((bundle != null && bundle.getBoolean("intent_already_parsed", false)) || (intent = getIntent()) == null || intent.getAction() == null)) {
                            onNewIntent(intent);
                        }
                        int A062 = C002001d.A06(this, R.attr.settingsIconColor, R.color.settings_icon);
                        C002001d.A2m((ImageView) findViewById(R.id.last_backup_icon), A062);
                        C002001d.A2m((ImageView) findViewById(R.id.gdrive_icon), A062);
                        C002001d.A2m((ImageView) findViewById(R.id.backup_settings_icon), A062);
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return SettingsChat.A04(this, ((AnonymousClass2C0) this).A01);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        return SettingsChat.A05(this, ((AnonymousClass2C0) this).A01);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A0L = true;
        GoogleBackupService googleBackupService = this.A0K;
        if (googleBackupService != null) {
            googleBackupService.A0J.A01(this.A0T);
            this.A0K = null;
        }
        unbindService(this.A0N);
        this.A0V.A00(this.A0U);
        super.onDestroy();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String action = intent.getAction();
        AnonymousClass008.A18("settings-gdrive/new-intent/action/", action);
        if (action != null) {
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1074883521) {
                if (hashCode == 996064514 && action.equals("action_perform_media_restore_over_cellular")) {
                    c = 0;
                }
            } else if (action.equals("action_perform_backup_over_cellular")) {
                c = 1;
            }
            if (c == 0) {
                Bundle A012 = AnonymousClass008.A01("dialog_id", 15);
                AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
                A012.putString("message", r1.A06(R.string.google_drive_confirm_media_restore_over_cellular_message));
                A012.putBoolean("cancelable", false);
                A012.putString("positive_button", r1.A06(R.string.google_drive_resume_button_label));
                A012.putString("negative_button", r1.A06(R.string.not_now));
                PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                promptDialogFragment.A0N(A012);
                AnonymousClass0LW A042 = A04();
                if (A042 != null) {
                    AnonymousClass0QB r0 = new AnonymousClass0QB(A042);
                    r0.A0A(0, promptDialogFragment, "action_perform_media_restore_over_cellular", 1);
                    r0.A01();
                    return;
                }
                throw null;
            } else if (c != 1) {
                StringBuilder A0S2 = AnonymousClass008.A0S("settings-gdrive/new-intent/unexpected-action/");
                A0S2.append(intent.getAction());
                Log.e(A0S2.toString());
            } else {
                Bundle A013 = AnonymousClass008.A01("dialog_id", 16);
                AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
                A013.putString("message", r5.A06(R.string.google_drive_confirm_backup_over_cellular_message));
                A013.putBoolean("cancelable", false);
                A013.putString("positive_button", r5.A06(R.string.google_drive_resume_button_label));
                A013.putString("negative_button", r5.A06(R.string.not_now));
                PromptDialogFragment promptDialogFragment2 = new PromptDialogFragment();
                promptDialogFragment2.A0N(A013);
                AnonymousClass0LW A043 = A04();
                if (A043 != null) {
                    AnonymousClass0QB r02 = new AnonymousClass0QB(A043);
                    r02.A0A(0, promptDialogFragment2, "action_perform_backup_over_cellular", 1);
                    r02.A01();
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        AnonymousClass00C r0 = this.A0Y;
        AnonymousClass1U0 r1 = this.A0X;
        if (r0 != null) {
            if (r1 != null) {
                r0.A07.remove(r1);
            }
            super.onPause();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        AnonymousClass00C r0 = this.A0Y;
        AnonymousClass1U0 r1 = this.A0X;
        if (r0 != null) {
            if (r1 != null) {
                r0.A07.add(r1);
            }
            A0X();
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("intent_already_parsed", true);
    }
}
