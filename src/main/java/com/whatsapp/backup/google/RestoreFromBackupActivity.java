package com.whatsapp.backup.google;

import X.AbstractC005802u;
import X.AbstractC03860Ib;
import X.AbstractC09090cH;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass009;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass03A;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass088;
import X.AnonymousClass0CL;
import X.AnonymousClass0GE;
import X.AnonymousClass0GY;
import X.AnonymousClass0GZ;
import X.AnonymousClass0HM;
import X.AnonymousClass0HP;
import X.AnonymousClass0HQ;
import X.AnonymousClass0IZ;
import X.AnonymousClass0JJ;
import X.AnonymousClass0LW;
import X.AnonymousClass0M9;
import X.AnonymousClass0O6;
import X.AnonymousClass0QB;
import X.AnonymousClass0S2;
import X.AnonymousClass1QS;
import X.AnonymousClass1QT;
import X.AnonymousClass1R0;
import X.AnonymousClass1R1;
import X.AnonymousClass1R4;
import X.AnonymousClass1V1;
import X.AnonymousClass2C0;
import X.AnonymousClass2OC;
import X.AnonymousClass30L;
import X.AnonymousClass325;
import X.C002001d;
import X.C002101e;
import X.C003301q;
import X.C003701u;
import X.C004302a;
import X.C014508d;
import X.C02290Bk;
import X.C02660Cy;
import X.C11040fc;
import X.C27511Qh;
import X.C28051Sr;
import X.C41431v2;
import X.C41701vU;
import X.C460127k;
import X.ServiceConnectionC27671Qy;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Dialog;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.Main;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SettingsChat;
import com.whatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class RestoreFromBackupActivity extends AnonymousClass0GE implements AbstractC005802u, AnonymousClass1R4 {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public Button A04;
    public ProgressBar A05;
    public TextView A06;
    public TextView A07;
    public C11040fc A08;
    public C27511Qh A09;
    public GoogleBackupService A0A;
    public GoogleDriveRestoreAnimationView A0B;
    public C41701vU A0C;
    public AnonymousClass1V1 A0D;
    public AnonymousClass30L A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final ServiceConnection A0J = new ServiceConnectionC27671Qy(this);
    public final ConditionVariable A0K = new ConditionVariable(false);
    public final ConditionVariable A0L = new ConditionVariable(false);
    public final ConditionVariable A0M = new ConditionVariable(false);
    public final AnonymousClass009 A0N = AnonymousClass009.A00();
    public final AnonymousClass088 A0O = AnonymousClass088.A00();
    public final AnonymousClass0CL A0P = AnonymousClass0CL.A00();
    public final AnonymousClass0GZ A0Q = AnonymousClass0GZ.A00();
    public final AnonymousClass0HQ A0R = AnonymousClass0HQ.A00();
    public final AnonymousClass0JJ A0S = AnonymousClass0JJ.A03();
    public final AbstractC09090cH A0T = new C460127k(this);
    public final AnonymousClass1R0 A0U = AnonymousClass1R0.A00();
    public final AbstractC03860Ib A0V = new C41431v2(this);
    public final C003301q A0W = C003301q.A02;
    public final AnonymousClass00C A0X = AnonymousClass00C.A00();
    public final AnonymousClass04j A0Y = AnonymousClass04j.A00();
    public final AnonymousClass00G A0Z = AnonymousClass00G.A01;
    public final AnonymousClass03S A0a = AnonymousClass03S.A00();
    public final C014508d A0b = C014508d.A00();
    public final AnonymousClass0GY A0c = AnonymousClass0GY.A00();
    public final AnonymousClass0M9 A0d = AnonymousClass0M9.A01();
    public final AnonymousClass2OC A0e = AnonymousClass2OC.A00();
    public final C02660Cy A0f = C02660Cy.A00();
    public final AnonymousClass022 A0g = AnonymousClass022.A00();
    public final AnonymousClass0HM A0h = AnonymousClass0HM.A00();
    public final AnonymousClass0HP A0i = AnonymousClass0HP.A00();
    public final AnonymousClass325 A0j = AnonymousClass325.A00();
    public final AnonymousClass03A A0k = AnonymousClass03A.A00();
    public final AnonymousClass0IZ A0l = AnonymousClass0IZ.A01();
    public final AnonymousClass00T A0m = C002101e.A00();
    public final List A0n = new ArrayList();
    public final Set A0o = Collections.newSetFromMap(new ConcurrentHashMap());
    public final AtomicBoolean A0p = new AtomicBoolean(false);
    public final AtomicBoolean A0q = new AtomicBoolean(false);
    public final AtomicBoolean A0r = new AtomicBoolean(true);

    public RestoreFromBackupActivity() {
        super(true);
    }

    public static String A04(int i) {
        switch (i) {
            case 21:
                return "new";
            case 22:
                return "restore-from-gdrive";
            case 23:
                return "restore-from-local";
            case 24:
                return "restoring-from-gdrive";
            case 25:
                return "return-from-auth";
            case 26:
                return "msgstore-restored";
            case 27:
                return "restoring-from-local";
            default:
                throw new IllegalStateException(AnonymousClass008.A0F("Unknown state: ", i));
        }
    }

    public final long A0W() {
        Log.d("gdrive-activity/lastbackup/look at files");
        long A082 = ((AnonymousClass0GE) this).A0E.A08();
        if (A082 != -1) {
            AnonymousClass008.A0z("gdrive-activity/lastbackup/fromfiles/set to ", A082);
        }
        return A082;
    }

    public void A0X() {
        String A0B2;
        StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/skip-restore user declined to restore backup from ");
        C27511Qh r0 = this.A09;
        if (r0 == null) {
            A0B2 = "<unset account>";
        } else {
            A0B2 = AnonymousClass0JJ.A0B(r0.A05);
        }
        A0S2.append(A0B2);
        Log.i(A0S2.toString());
        Log.i("gdrive-activity/skip-restore/stopping-approx-transfer-size-calc-thread");
        this.A0p.set(true);
        AnonymousClass00D r2 = ((ActivityC004702f) this).A0J;
        r2.A0Q(0);
        r2.A0I();
        r2.A0m(0);
        AnonymousClass008.A0n(r2, "gdrive_include_videos_in_backup", false);
        RunnableEBaseShape7S0100000_I1_2 runnableEBaseShape7S0100000_I1_2 = new RunnableEBaseShape7S0100000_I1_2(this, 11);
        if (C003701u.A0D()) {
            this.A0m.ANF(runnableEBaseShape7S0100000_I1_2);
        } else {
            ((RestoreFromBackupActivity) runnableEBaseShape7S0100000_I1_2.A00).A0R.A09(0);
        }
        GoogleBackupService googleBackupService = this.A0A;
        if (googleBackupService != null) {
            googleBackupService.A03(10);
        } else {
            Log.e("gdrive-activity/skip-restore/google-drive-service-object-is-null");
        }
        String A0D2 = r2.A0D();
        if (A0D2 != null) {
            Intent intent = new Intent("action_remove_backup_info");
            intent.putExtra("account_name", A0D2);
            intent.putExtra("remove_account_name", true);
            AnonymousClass0JJ.A0G(this, intent);
        }
        setResult(2);
        A0d();
    }

    public final void A0Y() {
        AnonymousClass00E.A01();
        AnonymousClass008.A0e(this, R.id.restore_actions_view, 0);
        AnonymousClass008.A0e(this, R.id.restore_general_info, 0);
        AnonymousClass008.A0e(this, R.id.calculating_progress_view, 0);
        AnonymousClass008.A0e(this, R.id.google_drive_looking_for_backup_view, 0);
        AnonymousClass008.A0e(this, R.id.google_drive_restore_animation_view, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_progress, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_progress_info, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_restore_view, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_media_will_be_downloaded_later_notice, 8);
        AnonymousClass008.A0e(this, R.id.msgrestore_result_box, 8);
        View findViewById = findViewById(R.id.nextBtn);
        if (findViewById != null) {
            findViewById.setVisibility(8);
            File databasePath = getDatabasePath("msgstore.db");
            if (databasePath.exists()) {
                if (!databasePath.delete()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-activity/show-msgstore-downloading-view/restore-failed ");
                    sb.append(databasePath);
                    sb.append(" exists but cannot be deleted, message restore might fail");
                    Log.w(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("gdrive-activity/show-msgstore-downloading-view/restore-failed ");
                    sb2.append(databasePath);
                    sb2.append(" deleted");
                    Log.i(sb2.toString());
                }
            }
            this.A0c.A01();
            A0k(false);
            return;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.A01 != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Z() {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A0Z():void");
    }

    public final void A0a() {
        Log.i("gdrive-activity/set-skip-restore/");
        this.A0I = true;
    }

    public final void A0b() {
        AnonymousClass00E.A01();
        Log.i("gdrive-activity/show-msgstore-downloading-view");
        AnonymousClass008.A0e(this, R.id.restore_actions_view, 8);
        AnonymousClass008.A0e(this, R.id.restore_general_info, 8);
        AnonymousClass008.A0e(this, R.id.calculating_progress_view, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_restore_animation_view, 0);
        this.A05.setVisibility(0);
        this.A05.setIndeterminate(true);
        C28051Sr.A1V(this.A05, C004302a.A00(this, R.color.media_message_progress_determinate));
        this.A07.setVisibility(0);
        this.A06 = (TextView) findViewById(R.id.google_drive_media_will_be_downloaded_later_notice);
        long j = this.A02;
        if (j == 0) {
            j = ((ActivityC004702f) this).A0J.A00.getLong("gdrive_approx_media_download_size", 0);
            this.A02 = j;
        }
        if (j > 0) {
            AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
            String A1Y = C002001d.A1Y(r4, j);
            this.A06.setText(r4.A0D(R.string.activity_gdrive_media_will_be_downloaded_later_notice, A1Y));
            this.A06.setVisibility(0);
        }
    }

    public final void A0c() {
        Log.i("gdrive-activity/show-restore-for-local-backup");
        AnonymousClass008.A0e(this, R.id.google_drive_looking_for_backup_view, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_restore_view, 0);
        this.A0L.open();
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        setTitle(r4.A06(R.string.activity_google_drive_restore_title));
        AnonymousClass008.A0e(this, R.id.calculating_progress_view, 8);
        AnonymousClass008.A0e(this, R.id.gdrive_restore_size_info, 8);
        AnonymousClass008.A0e(this, R.id.calculating_transfer_size_progress_bar, 8);
        String str = (String) C002001d.A1F(r4, A0W());
        TextView textView = (TextView) findViewById(R.id.gdrive_restore_info);
        if (textView != null) {
            textView.setText(r4.A0D(R.string.local_restore_info_calculating, str));
            this.A03.setVisibility(8);
            if (this.A0B == null) {
                this.A0B = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.A0m.ANF(new RunnableEBaseShape1S1200000_I1(this, atomicBoolean, str, 11));
            TextView textView2 = (TextView) findViewById(R.id.restore_general_info);
            if (textView2 != null) {
                boolean A012 = AnonymousClass00C.A01();
                int i = R.string.shared_internal_storage_restore_general_info;
                if (A012) {
                    i = R.string.sdcard_restore_general_info;
                }
                textView2.setText(r4.A06(i));
                View findViewById = findViewById(R.id.dont_restore);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 6));
                    this.A04.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, atomicBoolean, 14));
                    return;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void A0d() {
        Log.i("gdrive-activity/show-new-user-settings");
        A0a();
        A0V(false);
        ((ActivityC004702f) this).A0J.A0T(System.currentTimeMillis() + 604800000);
    }

    public final void A0e() {
        Log.i("gdrive-activity/restore-messages");
        C27511Qh r0 = this.A09;
        if (r0 == null || !r0.A01) {
            AnonymousClass0JJ.A0G(this, new Intent("action_restore"));
        } else {
            this.A0T.AHl(true);
        }
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(this, 17));
    }

    public final void A0f(int i) {
        Bundle A012 = AnonymousClass008.A01("dialog_id", i);
        AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
        A012.putString("message", r2.A06(R.string.dont_restore_message));
        A012.putBoolean("cancelable", true);
        A012.putString("positive_button", r2.A06(R.string.msg_store_do_not_restore));
        A012.putString("negative_button", r2.A06(R.string.cancel));
        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
        promptDialogFragment.A0N(A012);
        if (!AnonymousClass0JJ.A0H(this)) {
            AnonymousClass0LW A042 = A04();
            if (A042 != null) {
                AnonymousClass0QB r1 = new AnonymousClass0QB(A042);
                r1.A0A(0, promptDialogFragment, null, 1);
                r1.A01();
                return;
            }
            throw null;
        }
    }

    public final void A0g(int i, AnonymousClass1V1 r6) {
        Integer num;
        this.A0C.A00 = i;
        this.A0D = r6;
        StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/state ");
        A0S2.append(A04(i));
        A0S2.append(" ");
        A0S2.append(r6);
        Log.i(A0S2.toString());
        AnonymousClass00D r2 = ((ActivityC004702f) this).A0J;
        int i2 = this.A0C.A00;
        AnonymousClass1V1 r0 = this.A0D;
        if (r0 != null) {
            num = Integer.valueOf(r0.A00);
        } else {
            num = null;
        }
        SharedPreferences.Editor edit = r2.A00.edit();
        edit.putInt("gdrive_activity_state", i2);
        if (num != null) {
            edit.putInt("gdrive_activity_msgstore_init_key", num.intValue());
        } else {
            edit.remove("gdrive_activity_msgstore_init_key");
        }
        edit.apply();
    }

    public void A0h(long j, long j2) {
        String A0D2;
        AnonymousClass00E.A00();
        this.A01 = j;
        this.A02 = j2;
        ((ActivityC004702f) this).A0J.A00.edit().putLong("gdrive_approx_media_download_size", j2).apply();
        AnonymousClass008.A1P(new StringBuilder("washaredpreferences/save-gdrive-media-download-transfer-size/"), j2);
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        if (i <= 0) {
            A0D2 = r4.A06(R.string.gdrive_backup_size_info_with_nothing_to_download);
        } else {
            A0D2 = r4.A0D(R.string.gdrive_backup_size_info, C002001d.A1Y(r4, j));
        }
        this.A0L.block();
        StringBuilder sb = new StringBuilder("gdrive-activity/update-restore-info/ total download size: ");
        sb.append(j);
        sb.append(" media download size: ");
        AnonymousClass008.A1P(sb, j2);
        AnonymousClass02M r2 = ((ActivityC004702f) this).A0F;
        r2.A02.post(new RunnableEBaseShape1S1100000_I1(this, A0D2, 9));
    }

    public final void A0i(C27511Qh r15) {
        long j;
        StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/show-restore-for-gdrive-backup/");
        String str = r15.A05;
        A0S2.append(AnonymousClass0JJ.A0B(str));
        Log.i(A0S2.toString());
        long j2 = r15.A04;
        long j3 = r15.A00;
        if (!TextUtils.isEmpty(null)) {
            AnonymousClass008.A18("gdrive-activity/show-restore/", null);
        }
        AnonymousClass008.A0e(this, R.id.google_drive_looking_for_backup_view, 8);
        AnonymousClass008.A0e(this, R.id.google_drive_restore_view, 0);
        this.A0L.open();
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        setTitle(r4.A06(R.string.activity_google_drive_restore_title));
        if (this.A0B == null) {
            this.A0B = (GoogleDriveRestoreAnimationView) findViewById(R.id.google_drive_restore_animation_view);
        }
        if (r15.A01) {
            TextView textView = (TextView) findViewById(R.id.restore_general_info);
            if (textView != null) {
                boolean A012 = AnonymousClass00C.A01();
                int i = R.string.shared_internal_storage_restore_general_info;
                if (A012) {
                    i = R.string.sdcard_restore_general_info;
                }
                textView.setText(r4.A06(i));
            } else {
                throw null;
            }
        } else {
            TextView textView2 = (TextView) findViewById(R.id.restore_general_info);
            if (textView2 != null) {
                textView2.setText(r4.A06(R.string.gdrive_restore_general_info));
            } else {
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(r4.A06(R.string.gdrive_backup_last_modified_date_unavailable));
        StringBuilder sb2 = new StringBuilder();
        if (j2 > 0) {
            sb.setLength(0);
            sb.append(C002001d.A1F(r4, j2));
        }
        if (r15.A01) {
            j = 0;
        } else {
            j = j3;
        }
        this.A01 = j;
        if (j3 >= 0) {
            sb2.setLength(0);
            sb2.append(C002001d.A1Y(r4, j3));
        }
        if (!r15.A03) {
            sb.setLength(0);
            sb.append(C002001d.A1F(r4, A0W()));
            Log.i("gdrive-activity/show-restore-for-gdrive-backup/local message backup will be used. showing local backup timestamp");
        }
        TextView textView3 = (TextView) findViewById(R.id.gdrive_restore_info);
        if (textView3 != null) {
            boolean z = r15.A01;
            int i2 = R.string.gdrive_restore_info;
            if (z) {
                i2 = R.string.local_restore_info;
            }
            textView3.setText(r4.A0D(i2, str, sb.toString(), sb2.toString()));
            this.A03.setVisibility(8);
            View findViewById = findViewById(R.id.dont_restore);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 4));
                this.A04.setOnClickListener(new AnonymousClass1QS(this, str, r15, j3));
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A0j(boolean z) {
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.activity_google_drive_restore_title));
        if (((ActivityC004702f) this).A0J.A00.getBoolean("gdrive_restore_overwrite_local_files", false)) {
            StringBuilder sb = new StringBuilder("gdrive-activity/msgstore-download/finished, success: ");
            sb.append(z);
            sb.append(", now, restoring it.");
            Log.i(sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/msgstore-download/not performed since we are using local, success: ");
            sb2.append(z);
            sb2.append(", now, restoring it.");
            Log.i(sb2.toString());
        }
        ((AnonymousClass0GE) this).A00.A03(z, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r12.A03() == false) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k(boolean r44) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.RestoreFromBackupActivity.A0k(boolean):void");
    }

    public final void A0l(boolean z) {
        if (!(!this.A0a.A06())) {
            C02290Bk r1 = ((AnonymousClass0GE) this).A0E;
            if (r1.A06() > 0) {
                r1.A00 = 3;
                A0g(23, null);
                A0c();
                return;
            }
            r1.A00 = 4;
            A0a();
            A0V(false);
        } else if (z) {
            A0m(true, false, 6);
        } else {
            ((AnonymousClass0GE) this).A0E.A00 = 4;
            A0a();
            A0V(false);
        }
    }

    public final void A0m(boolean z, boolean z2, int i) {
        if (!z) {
            RequestPermissionActivity.A0A(this, R.string.permission_contacts_access_on_gdrive_restore_request, R.string.permission_contacts_access_on_gdrive_restore, true, i);
        } else if (z2) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = R.string.permission_storage_contacts_on_gdrive_restore_v30;
            if (i2 < 30) {
                i3 = R.string.permission_storage_contacts_on_gdrive_restore;
            }
            if (isFinishing()) {
                Log.d("request/permission/activity/requestContactAndStorageAccess/activity is finishing: do nothing");
                return;
            }
            startActivityForResult(new Intent(this, RequestPermissionActivity.class).putExtra("drawable_ids", new int[]{R.drawable.permission_contacts, R.drawable.permission_plus, R.drawable.permission_storage}).putExtra("permissions", new String[]{"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}).putExtra("message_id", R.string.permission_storage_contacts_on_gdrive_restore_request).putExtra("perm_denial_message_id", i3).putExtra("force_ui", true), i);
        } else {
            int i4 = Build.VERSION.SDK_INT;
            int i5 = R.string.permission_storage_need_write_access_on_restore_from_backup_v30;
            if (i4 < 30) {
                i5 = R.string.permission_storage_need_write_access_on_restore_from_backup;
            }
            RequestPermissionActivity.A0B(this, R.string.permission_storage_need_write_access_on_restore_from_backup_request, i5, true, i);
        }
    }

    public final boolean A0n() {
        return this.A0o.size() < this.A0n.size() || this.A0r.get();
    }

    public final boolean A0o(String str, int i) {
        AnonymousClass00E.A00();
        StringBuilder sb = new StringBuilder("gdrive-activity/auth-request account being used is ");
        sb.append(AnonymousClass0JJ.A0B(str));
        Log.i(sb.toString());
        this.A0m.ANF(new RunnableEBaseShape0S1101000_I1(this, str, i, 0));
        Log.i("gdrive-activity/auth-request blocking on tokenReceived");
        this.A0M.block(100000);
        return this.A0F != null;
    }

    @Override // X.AbstractC005802u
    public void AF5(int i) {
        if (i == 10 || i == 11) {
            AnonymousClass008.A0v("gdrive-activity/dialog-negative-click/dialog-id/", i);
        } else if (i == 12) {
            Log.i("gdrive-activity/restore-media-on-cellular-dialog Wi-Fi unavailable and user agreed to restore media on cellular.");
            ((ActivityC004702f) this).A0J.A00.edit().putString("gdrive_media_restore_network_setting", String.valueOf(1)).apply();
            Log.i("gdrive-activity/restore-media");
            AnonymousClass0JJ.A0G(this, new Intent("action_restore_media"));
            Log.i("gdrive-activity/msgstore-download-finish setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
            setResult(3);
            finish();
        } else if (i == 14) {
            Log.i("gdrive-activity/no-local-or-gdrive-backup-found-dialog no google drive backups found and user is not interested in adding an account for that either.");
            A0d();
            setResult(1);
        } else if (i == 16) {
            Log.i("gdrive-activity/one-time-setup-is-taking-too-long/user-decided-to-cancel");
            AnonymousClass1R1.A02();
            this.A0q.set(true);
            if (((AnonymousClass0GE) this).A0E.A06() > 0) {
                A0g(23, null);
                A0c();
                return;
            }
            A0a();
            A0V(false);
        } else if (i == 18) {
            Log.i("gdrive-activity/failed-to-restore-messages-from-selected-backup/user-decided-to-continue");
            A0a();
            A0V(false);
            A0Z();
        } else if (i == 19) {
            Log.i("gdrive-activity/failed-to-restore-messages/internal-storage-out-of-free-space/user-decided-to-skip");
            A0a();
            A0V(false);
        } else if (i != 20) {
            throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
        } else if (A0n()) {
            Log.i("gdrive-activity/msgstore-jid-mismatch/restore-from-older");
            A0Y();
        } else {
            Log.i("gdrive-activity/msgstore-jid-mismatch/skip");
            A0V(false);
            A0Z();
        }
    }

    @Override // X.AbstractC005802u
    public void AF6(int i) {
        if (i == 13) {
            Log.i("gdrive-activity/insufficient-space-dialog/neutral-click");
            return;
        }
        throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
    }

    @Override // X.AbstractC005802u
    public void AF7(int i) {
        if (i == 10) {
            Log.i("gdrive-activity/show-restore user declined to restore from local backup");
            setResult(2);
            A0d();
        } else if (i == 11) {
            Log.i("gdrive-activity/user-confirmed-skip-restore");
            A0X();
        } else if (i == 12) {
            Log.i("gdrive-activity/restore-media-on-cellular-dialog, Wi-Fi unavailable and user declined to restore media on cellular.");
            setResult(3);
            finish();
        } else if (i == 13) {
            Log.i("gdrive-activity/insufficient-storage-for-restore/user-decided-to-visit-storage-settings");
            startActivity(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"));
        } else if (i == 14) {
            Log.i("gdrive-activity/one-time-setup no google drive backups found and user decided to add an account or give permission to an existing one.");
            Account[] accountsByType = AccountManager.get(this).getAccountsByType("com.google");
            int length = accountsByType.length;
            int i2 = length + 1;
            String[] strArr = new String[i2];
            for (int i3 = 0; i3 < length; i3++) {
                strArr[i3] = accountsByType[i3].name;
            }
            int i4 = i2 - 1;
            AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
            strArr[i4] = r5.A06(R.string.google_account_picker_add_account);
            String[] strArr2 = new String[i2];
            boolean[] zArr = new boolean[i2];
            List list = this.A0n;
            list.clear();
            for (int i5 = 0; i5 < length; i5++) {
                list.add(accountsByType[i5]);
                if (this.A0o.contains(accountsByType[i5])) {
                    strArr2[i5] = r5.A06(R.string.google_drive_no_backup_found);
                    zArr[i5] = false;
                } else {
                    strArr2[i5] = null;
                    zArr[i5] = true;
                }
            }
            zArr[i4] = true;
            SingleChoiceListDialogFragment singleChoiceListDialogFragment = new SingleChoiceListDialogFragment();
            Bundle A012 = AnonymousClass008.A01("dialog_id", 17);
            A012.putString("title", r5.A06(R.string.google_account_picker_title));
            A012.putStringArray("multi_line_list_items_key", strArr);
            A012.putStringArray("multi_line_list_item_values_key", strArr2);
            A012.putBooleanArray("list_item_enabled_key", zArr);
            A012.putString("disabled_item_toast_key", r5.A06(R.string.gdrive_no_backup_found));
            singleChoiceListDialogFragment.A0N(A012);
            if (!AnonymousClass0JJ.A0H(this)) {
                singleChoiceListDialogFragment.A0u(A04(), null);
            }
        } else if (i == 15) {
            Log.i("gdrive-activity/google-play-services-is-broken/user-decided-to-skip");
            setResult(1);
            finish();
        } else if (i == 16) {
            Log.i("gdrive-activity/one-time-setup-taking-too-long/user-decided-to-wait");
        } else if (i == 18) {
            Log.i("gdrive-activity/failed-to-restore-from-selected-backup/restore-from-older");
            A0Y();
        } else if (i == 19) {
            this.A0c.A01();
            A0Y();
        } else if (i == 20) {
            Log.i("gdrive-activity/msgstore-jid-mistmatch/user-decided-to-reregister");
            AnonymousClass022 r1 = this.A0g;
            Log.i("register/phone/clear-reg-preferences");
            SharedPreferences.Editor edit = r1.A01(AnonymousClass0HM.A01(this, RegisterPhone.class)).edit();
            edit.clear();
            if (!edit.commit()) {
                Log.w("register/phone/failed-to-clear-reg-preferences");
            }
            this.A0h.A0B();
            Intent intent = new Intent(this, Main.class);
            intent.setFlags(268435456);
            startActivity(intent);
            System.exit(0);
        } else {
            throw new IllegalStateException(AnonymousClass008.A0F("unexpected dialog box: ", i));
        }
    }

    @Override // X.AnonymousClass1R4
    public void AF8(int i) {
        if (i == 17) {
            Log.i("gdrive-activity/user-dismissed-account-selector-dialog-dismissed");
            A0k(true);
            return;
        }
        throw new IllegalStateException(AnonymousClass008.A0F("Unexpected dialog id:", i));
    }

    @Override // X.AnonymousClass1R4
    public void AKA(int i, int i2, String[] strArr) {
        if (i != 17) {
            throw new IllegalStateException(AnonymousClass008.A0H("Unexpected dialogId: ", i, " index:", i2));
        } else if (strArr[i2].equals(((AnonymousClass2C0) this).A01.A06(R.string.google_account_picker_add_account))) {
            AnonymousClass0JJ.A00.execute(new RunnableEBaseShape6S0200000_I1_1(this, AccountManager.get(this).addAccount("com.google", null, null, null, this, null, null), 19));
            Log.i("gdrive-activity/show-accounts/waiting-for-add-account-activity-to-return");
        } else {
            Intent intent = new Intent();
            intent.putExtra("authAccount", strArr[i2]);
            onActivityResult(3, -1, intent);
        }
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1566$RestoreFromBackupActivity(View view) {
        GoogleBackupService googleBackupService = this.A0A;
        if (googleBackupService != null) {
            googleBackupService.A03(10);
            A0e();
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1568$RestoreFromBackupActivity(View view) {
        startActivity(new Intent("android.intent.action.VIEW", this.A0Q.A01()));
    }

    public /* synthetic */ void lambda$displayDriveErrorsDuringMessageStoreDownload$1569$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-skip-gdrive-restore-dialog");
        A0f(11);
    }

    public /* synthetic */ void lambda$showRestorePanelForUsersWithGoogleDriveBackups$1551$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-skip-gdrive-restore-dialog");
        A0f(11);
    }

    public /* synthetic */ void lambda$showRestorePanelForUsersWithOnlyLocalBackup$1556$RestoreFromBackupActivity(View view) {
        Log.i("gdrive-activity/show-local-restore-skip-dialog");
        A0f(10);
    }

    @Override // X.AnonymousClass0GE, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 5) {
            StringBuilder sb = new StringBuilder("gdrive-activity/request-permissions/result/");
            sb.append(i2);
            Log.i(sb.toString());
            A0k(true);
        } else if (i == 6) {
            StringBuilder sb2 = new StringBuilder("gdrive-activity/request-permissions-non-gps/result/");
            sb2.append(i2);
            Log.i(sb2.toString());
            A0l(false);
        } else if (i == 2) {
            StringBuilder sb3 = new StringBuilder("gdrive-activity/request-to-fix-google-play-services/result/");
            sb3.append(i2);
            Log.i(sb3.toString());
            A0k(false);
        } else if (i == 1) {
            if (i2 != -1) {
                return;
            }
            if (intent != null) {
                this.A0F = intent.getStringExtra("authtoken");
                this.A0M.open();
                this.A0m.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 14));
                return;
            }
            throw null;
        } else if (i == 3) {
            if (i2 != -1) {
                StringBuilder sb4 = new StringBuilder("gdrive-activity/activity-result/account-picker-request/");
                sb4.append(i2);
                Log.e(sb4.toString());
                A0a();
                A0V(false);
            } else if (intent == null) {
                throw null;
            } else if (intent.getExtras() != null) {
                String string = intent.getExtras().getString("authAccount");
                StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/activity-result accountName is ");
                A0S2.append(AnonymousClass0JJ.A0B(string));
                Log.d(A0S2.toString());
                if (string == null) {
                    Log.e("gdrive-activity/activity-result/account-picker-returned-null-account");
                } else {
                    this.A0m.ANF(new RunnableEBaseShape1S1100000_I1(this, string, 10));
                }
            } else {
                throw null;
            }
        } else if (i == 4) {
            StringBuilder sb5 = new StringBuilder("gdrive-activity/activity-result/account-added-request/");
            sb5.append(i2);
            Log.i(sb5.toString());
            Intent intent2 = new Intent(this, RestoreFromBackupActivity.class);
            intent2.setAction("action_show_restore_one_time_setup");
            startActivity(intent2);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass0GE, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        AnonymousClass00D r5;
        Bundle bundle2;
        super.onCreate(bundle);
        AnonymousClass00T r13 = this.A0m;
        AnonymousClass0M9 r14 = this.A0d;
        AnonymousClass01X r15 = ((AnonymousClass2C0) this).A01;
        this.A0E = new AnonymousClass30L(r13, r14, r15, this.A0e, this.A0f);
        this.A0C = (C41701vU) new AnonymousClass0O6(this).A00(C41701vU.class);
        AnonymousClass0HQ r7 = this.A0R;
        if (!r7.A06()) {
            Log.i("gdrive-activity/no-google-drive-access-possible");
            setResult(0);
            finish();
            return;
        }
        setContentView(R.layout.activity_google_drive_restore);
        Toolbar toolbar = (Toolbar) findViewById(R.id.title_toolbar);
        if (!ViewConfiguration.get(getApplicationContext()).hasPermanentMenuKey()) {
            A0C(toolbar);
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                A092.A0A(false);
                A092.A0D(false);
            }
        }
        setTitle(r15.A06(R.string.activity_google_drive_title));
        C28051Sr.A1V((ProgressBar) findViewById(R.id.gdrive_looking_for_backup_progress_bar), C004302a.A00(this, R.color.primary_light));
        C28051Sr.A1V((ProgressBar) findViewById(R.id.calculating_transfer_size_progress_bar), C004302a.A00(this, R.color.primary_light));
        View findViewById = findViewById(R.id.google_drive_progress);
        if (findViewById != null) {
            this.A05 = (ProgressBar) findViewById;
            View findViewById2 = findViewById(R.id.google_drive_progress_info);
            if (findViewById2 != null) {
                this.A07 = (TextView) findViewById2;
                View findViewById3 = findViewById(R.id.gdrive_restore_password_protected);
                if (findViewById3 != null) {
                    this.A03 = findViewById3;
                    View findViewById4 = findViewById(R.id.perform_restore);
                    if (findViewById4 != null) {
                        this.A04 = (Button) findViewById4;
                        this.A0H = getApplicationContext().bindService(new Intent(getApplicationContext(), GoogleBackupService.class), this.A0J, 1);
                        if (Build.VERSION.SDK_INT < 23) {
                            C002001d.A2m((ImageView) findViewById(R.id.gdrive_restore_password_protected_icon), C004302a.A00(this, R.color.backupRestoreSecondaryText));
                        }
                        int i = 21;
                        if (bundle == null) {
                            Log.d("gdrive-activity/resetting state");
                            this.A0C.A00 = 21;
                            this.A0D = null;
                            r5 = ((ActivityC004702f) this).A0J;
                            r5.A00.edit().remove("gdrive_activity_state").remove("gdrive_activity_msgstore_init_key").apply();
                        } else {
                            Log.d("gdrive-activity/loading state");
                            r5 = ((ActivityC004702f) this).A0J;
                            SharedPreferences sharedPreferences = r5.A00;
                            Pair pair = new Pair(Integer.valueOf(sharedPreferences.getInt("gdrive_activity_state", -1)), Integer.valueOf(sharedPreferences.getInt("gdrive_activity_msgstore_init_key", -1)));
                            C41701vU r8 = this.A0C;
                            int intValue = ((Number) pair.first).intValue();
                            if (intValue != -1) {
                                i = intValue;
                            }
                            r8.A00 = i;
                            if (i == 26) {
                                int intValue2 = ((Number) pair.second).intValue();
                                if (intValue2 == -1) {
                                    this.A0D = AnonymousClass1V1.A00(0);
                                } else {
                                    this.A0D = AnonymousClass1V1.A00(intValue2);
                                }
                            } else {
                                this.A0D = null;
                            }
                        }
                        if (this.A0C.A00 == 24 && !r7.A0a.get()) {
                            Log.i("gdrive-activity/create/it looks like restoring from gdrive has been completed but we missed it, let's try again");
                            A0g(22, this.A0D);
                        }
                        if (bundle == null) {
                            bundle2 = null;
                        } else {
                            bundle2 = bundle.getBundle("restore_account_data");
                        }
                        StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/create/state/");
                        A0S2.append(A04(this.A0C.A00));
                        Log.i(A0S2.toString());
                        int i2 = this.A0C.A00;
                        switch (i2) {
                            case 21:
                                Intent intent = getIntent();
                                if (intent.getAction() == null) {
                                    Log.e("gdrive-activity/create no action provided.");
                                    finish();
                                    return;
                                }
                                onNewIntent(intent);
                                return;
                            case 22:
                                if (bundle2 != null) {
                                    this.A09 = C27511Qh.A00(bundle2);
                                    A0g(22, null);
                                    A0i(this.A09);
                                    r13.ANF(new RunnableEBaseShape6S0200000_I1_1(this, bundle, 17));
                                    return;
                                }
                                throw new IllegalStateException("restore_account_data cannot be null");
                            case 23:
                                A0g(23, null);
                                A0c();
                                return;
                            case 24:
                                if (bundle2 != null) {
                                    this.A09 = C27511Qh.A00(bundle2);
                                    A0g(22, null);
                                    A0i(this.A09);
                                    A0g(24, null);
                                    A0b();
                                    boolean z = false;
                                    if (r5.A06() == 3) {
                                        z = true;
                                    }
                                    if (!z) {
                                        Log.i("gdrive-activity/create/gdrive-msgstore-download-not-pending");
                                        A0j(true);
                                        return;
                                    }
                                    Log.i("gdrive-activity/create/gdrive-msgstore-download-pending");
                                    return;
                                }
                                throw new IllegalStateException("restore_account_data cannot be null");
                            case 25:
                                if (bundle2 != null) {
                                    this.A09 = C27511Qh.A00(bundle2);
                                    return;
                                }
                                return;
                            case 26:
                                AnonymousClass1V1 r2 = this.A0D;
                                if (bundle2 != null) {
                                    this.A09 = C27511Qh.A00(bundle2);
                                    A0g(22, null);
                                    A0i(this.A09);
                                } else {
                                    A0g(23, null);
                                    A0c();
                                }
                                A0b();
                                StringBuilder sb = new StringBuilder("gdrive-activity/create/msgstore-init-status/");
                                sb.append(r2);
                                Log.i(sb.toString());
                                A0U(r2);
                                return;
                            case 27:
                                A0g(23, null);
                                A0c();
                                A0b();
                                A0j(true);
                                A0g(27, null);
                                return;
                            default:
                                StringBuilder A0S3 = AnonymousClass008.A0S("Unknown state: ");
                                A0S3.append(i2);
                                throw new IllegalStateException(A0S3.toString());
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A06(R.string.registration_help));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        this.A0G = true;
        GoogleBackupService googleBackupService = this.A0A;
        if (googleBackupService != null) {
            googleBackupService.A0J.A01(this.A0T);
        }
        if (this.A0H) {
            getApplicationContext().unbindService(this.A0J);
            this.A0A = null;
        }
        this.A0E.A00();
        super.onDestroy();
    }

    @Override // X.ActivityC004902h
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent.getAction() == null) {
            Log.e("gdrive-activity/new-intent action is null");
            return;
        }
        String action = intent.getAction();
        if (action.hashCode() != -1725923122 || !action.equals("action_show_restore_one_time_setup")) {
            StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/new-intent unexpected action: ");
            A0S2.append(intent.getAction());
            Log.e(A0S2.toString());
            finish();
            return;
        }
        int A002 = AnonymousClass0IZ.A00(this.A0Z.A00);
        AnonymousClass01X r9 = ((AnonymousClass2C0) this).A01;
        Dialog A022 = AnonymousClass0JJ.A02(r9, A002, this, 2, new AnonymousClass1QT(this), false);
        if (A022 != null && !AnonymousClass0JJ.A0H(this)) {
            boolean z = ((ActivityC004702f) this).A0J.A00.getBoolean("new_jid", false);
            AnonymousClass008.A1H("gdrive-util/is-new-jid/", z);
            if (!z) {
                Log.i("gdrive-activity/google-play-service-unavailable/existing-user");
                A022.show();
                return;
            }
        }
        AnonymousClass00D r10 = ((ActivityC004702f) this).A0J;
        if (r10.A0D() == null) {
            A0k(false);
            return;
        }
        boolean z2 = false;
        if (r10.A06() == 3) {
            z2 = true;
        }
        if (z2) {
            Log.i("gdrive-activity/create/continue-msgstore-download");
            AnonymousClass008.A0e(this, R.id.google_drive_looking_for_backup_view, 8);
            View findViewById = findViewById(R.id.google_drive_restore_view);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                A0b();
                String A0D2 = r10.A0D();
                if (A0D2 != null) {
                    long A0A2 = r10.A0A(A0D2);
                    long A092 = r10.A09(A0D2);
                    CharSequence A062 = r9.A06(R.string.gdrive_backup_last_modified_date_unavailable);
                    if (A092 > 0) {
                        A062 = C002001d.A1F(r9, A092);
                    }
                    SharedPreferences sharedPreferences = r10.A00;
                    if (!sharedPreferences.getBoolean("gdrive_restore_overwrite_local_files", false)) {
                        A062 = C002001d.A1F(r9, A0W());
                    }
                    String A1Y = C002001d.A1Y(r9, A0A2);
                    if (this.A09 == null) {
                        this.A09 = new C27511Qh(A0D2, A092, A0A2, sharedPreferences.getBoolean("gdrive_restore_overwrite_local_files", false), false, sharedPreferences.getBoolean("gdrive_last_restore_file_is_password_protected", false));
                    }
                    TextView textView = (TextView) findViewById(R.id.gdrive_restore_info);
                    if (textView != null) {
                        textView.setText(r9.A0D(R.string.gdrive_restore_info, A0D2, A062, A1Y));
                        this.A03.setVisibility(8);
                        A0e();
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        } else if (r10.A03() != 0) {
            Log.i("gdrive-activity/create/msgstore-download-already-finished, restoring");
            AnonymousClass008.A0e(this, R.id.google_drive_looking_for_backup_view, 8);
            AnonymousClass008.A0e(this, R.id.google_drive_restore_view, 0);
            TextView textView2 = (TextView) findViewById(R.id.gdrive_restore_info);
            if (textView2 != null) {
                textView2.setText(SettingsChat.A06(r9, ((AnonymousClass0GE) this).A0E));
                r10.A00.getBoolean("gdrive_last_restore_file_is_password_protected", false);
                this.A03.setVisibility(8);
                A0b();
                A0j(true);
                return;
            }
            throw null;
        } else {
            A0d();
            setResult(2);
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        AnonymousClass0HP r6 = this.A0i;
        String str = "one-time-restore";
        r6.A02(str);
        AnonymousClass30L r4 = this.A0E;
        AnonymousClass1V1 r0 = this.A0D;
        if (r0 != null) {
            int i = r0.A00;
            if (i == 3) {
                str = "one-time-restore-jid-mismatch";
            } else if (i == 4) {
                str = "one-time-restore-integrity-check-failed";
            }
        }
        int A002 = AnonymousClass0IZ.A00(this.A0Z.A00);
        if (A002 != 0) {
            if (A002 == 1) {
                str = AnonymousClass008.A0K(str, "-no-gs");
            } else if (A002 == 2) {
                str = AnonymousClass008.A0K(str, "-update-gs");
            } else if (A002 != 3) {
                str = AnonymousClass008.A0K(str, "-gs-invalid");
            } else {
                str = AnonymousClass008.A0K(str, "-gs-disabled");
            }
        }
        r4.A01(this, r6, str);
        return true;
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        C27511Qh r1 = this.A09;
        if (r1 != null) {
            StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/save-state/restore-account-data/ ");
            A0S2.append(r1);
            Log.i(A0S2.toString());
            C27511Qh r4 = this.A09;
            synchronized (r4) {
                bundle2 = new Bundle();
                bundle2.putString("account_name", r4.A05);
                bundle2.putLong("total_backup_size", r4.A00);
                bundle2.putLong("last_modified", r4.A04);
                bundle2.putBoolean("overwrite_local_files", r4.A03);
                bundle2.putBoolean("is_download_size_zero", r4.A01);
                bundle2.putBoolean("is_password_protected", r4.A02);
            }
            bundle.putBundle("restore_account_data", bundle2);
        }
        AnonymousClass008.A1P(AnonymousClass008.A0S("gdrive-activity/save-state/total-download-size/"), this.A01);
        bundle.putLong("total_download_size", this.A01);
        AnonymousClass008.A1P(new StringBuilder("gdrive-activity/save-state/media-download-size/"), this.A02);
        bundle.putLong("media_download_size", this.A02);
    }

    @Override // android.app.Activity
    public void setTitle(int i) {
        TextView textView = (TextView) findViewById(R.id.title_toolbar_text);
        if (textView != null) {
            textView.setText(((AnonymousClass2C0) this).A01.A06(i));
            return;
        }
        throw null;
    }
}
