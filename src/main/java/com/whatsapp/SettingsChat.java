package com.whatsapp;

import X.AbstractC07200Wh;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02J;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass088;
import X.AnonymousClass0AR;
import X.AnonymousClass0BB;
import X.AnonymousClass0BG;
import X.AnonymousClass0HO;
import X.AnonymousClass0HQ;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0OY;
import X.AnonymousClass0OZ;
import X.AnonymousClass0SA;
import X.AnonymousClass0SB;
import X.AnonymousClass1J6;
import X.AnonymousClass1ND;
import X.AnonymousClass1U0;
import X.AnonymousClass1U3;
import X.AnonymousClass1VY;
import X.AnonymousClass20M;
import X.AnonymousClass20N;
import X.AnonymousClass2C0;
import X.C002001d;
import X.C002101e;
import X.C002701k;
import X.C006803i;
import X.C014308b;
import X.C02290Bk;
import X.C26821Ms;
import X.C38871qa;
import X.C40621tZ;
import X.C40631ta;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.settings.SettingsRowIconText;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

public class SettingsChat extends AnonymousClass0SA implements AnonymousClass0SB {
    public static AnonymousClass1ND A0V;
    public int A00;
    public TextView A01;
    public SwitchCompat A02;
    public SwitchCompat A03;
    public C26821Ms A04;
    public SettingsRowIconText A05;
    public SettingsRowIconText A06;
    public SettingsRowIconText A07;
    public boolean A08;
    public String[] A09;
    public String[] A0A;
    public String[] A0B;
    public String[] A0C;
    public final AnonymousClass088 A0D = AnonymousClass088.A00();
    public final AnonymousClass01I A0E = AnonymousClass01I.A00();
    public final AnonymousClass0HQ A0F = AnonymousClass0HQ.A00();
    public final C014308b A0G = C014308b.A00();
    public final AbstractC07200Wh A0H = new C40621tZ(this);
    public final AnonymousClass1U0 A0I = new C38871qa(this);
    public final AnonymousClass00C A0J = AnonymousClass00C.A00();
    public final AnonymousClass03P A0K = AnonymousClass03P.A00();
    public final AnonymousClass03S A0L = AnonymousClass03S.A00();
    public final AnonymousClass0HO A0M = AnonymousClass0HO.A00();
    public final C02290Bk A0N = C02290Bk.A02();
    public final C002701k A0O = C002701k.A00();
    public final AnonymousClass00Y A0P = AnonymousClass00Y.A00();
    public final AnonymousClass0AR A0Q = AnonymousClass0AR.A00();
    public final AnonymousClass0BB A0R = AnonymousClass0BB.A00();
    public final AnonymousClass02J A0S = AnonymousClass02J.A02();
    public final AnonymousClass00T A0T = C002101e.A00();
    public final Set A0U = new HashSet();

    public static Dialog A04(Context context, AnonymousClass01X r3) {
        AnonymousClass1ND r1 = new AnonymousClass1ND(context);
        A0V = r1;
        r1.setTitle(r3.A06(R.string.msg_store_backup_db_title));
        A0V.setMessage(r3.A06(R.string.settings_backup_db_now_message));
        A0V.setIndeterminate(true);
        A0V.setCancelable(false);
        return A0V;
    }

    public static Dialog A05(Context context, AnonymousClass01X r7) {
        int i;
        int i2;
        AnonymousClass1J6 r3;
        if (AnonymousClass00C.A01()) {
            boolean equals = "unmounted".equals(Environment.getExternalStorageState());
            i2 = R.string.msg_store_backup_skipped_due_to_missing_sdcard_title;
            i = R.string.msg_store_backup_skipped_due_to_missing_sdcard_summary;
            if (equals) {
                i2 = R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title;
                i = R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_summary;
                r3 = new AnonymousClass1J6(context);
            }
            r3 = null;
        } else {
            i2 = R.string.msg_store_backup_skipped;
            i = R.string.no_media_message_shared_storage;
            r3 = null;
        }
        AnonymousClass0MB r2 = new AnonymousClass0MB(context);
        String A062 = r7.A06(i2);
        AnonymousClass0MC r1 = r2.A01;
        r1.A0I = A062;
        r1.A0E = r7.A06(i);
        r2.A07(r7.A06(R.string.ok), null);
        if (r3 != null) {
            r2.A07(r7.A06(R.string.btn_storage_settings), r3);
        }
        return r2.A00();
    }

    public static String A06(AnonymousClass01X r8, C02290Bk r9) {
        Log.d("settings-chat/lastbackup/look at files");
        long A082 = r9.A08();
        if (A082 != -1) {
            AnonymousClass008.A0z("settings-chat/lastbackup/fromfiles/set to ", A082);
        }
        if (A082 == 0) {
            return r8.A06(R.string.never);
        }
        if (A082 == -1) {
            return r8.A06(R.string.unknown);
        }
        if (AnonymousClass0OY.A00(System.currentTimeMillis(), A082) == 0) {
            return AnonymousClass0OZ.A00(r8, A082);
        }
        return (String) C002001d.A1F(r8, A082);
    }

    public final int A0V(String[] strArr) {
        int A022 = C006803i.A02(super.A0J.A00.getString("interface_font_size", "0"), 0);
        for (int i = 0; i < strArr.length; i++) {
            if (A022 == Integer.valueOf(strArr[i]).intValue()) {
                return i;
            }
        }
        return -1;
    }

    public final void A0W() {
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        String A062 = A06(r5, this.A0N);
        if (this.A05 != null) {
            if (this.A0F.A06()) {
                this.A05.setSubText(null);
            } else if (this.A0L.A06()) {
                this.A05.setSubText(r5.A0D(R.string.settings_msg_store_last_backup, A062));
            } else {
                this.A05.setSubText(r5.A06(R.string.settings_msg_store_cannot_backup));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        if (r9 != 1) goto L_0x005d;
     */
    @Override // X.AnonymousClass0SB
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKB(int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 317
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.AKB(int, int):void");
    }

    public void lambda$loadLanguagePicker$1355$SettingsChat(View view) {
        this.A0P.A0B(new AnonymousClass20N(), null, false);
        A0U(2, R.string.settings_language, this.A00, this.A0B);
    }

    public void lambda$onCreate$1346$SettingsChat(View view) {
        C26821Ms r0 = this.A04;
        int A002 = r0.A00();
        String[] A0N2 = r0.A01.A0N(C26821Ms.A02);
        SingleSelectionDialogFragment singleSelectionDialogFragment = new SingleSelectionDialogFragment();
        Bundle A003 = SingleSelectionDialogFragment.A00(3, A002, R.string.settings_theme_dialog_title, A0N2);
        A003.putBoolean("showConfirmation", true);
        singleSelectionDialogFragment.A0N(A003);
        APm(singleSelectionDialogFragment);
    }

    public /* synthetic */ void lambda$onCreate$1347$SettingsChat(View view) {
        this.A02.toggle();
        super.A0J.A0c(this.A02.isChecked());
    }

    public /* synthetic */ void lambda$onCreate$1348$SettingsChat(View view) {
        A0T(1, R.string.settings_font_size, A0V(this.A0A), R.array.font_size);
    }

    public void lambda$onCreate$1349$SettingsChat(View view) {
        this.A03.toggle();
        boolean isChecked = this.A03.isChecked();
        AnonymousClass0BB r3 = this.A0R;
        int i = 1;
        if (isChecked) {
            i = 2;
        }
        AnonymousClass0BG A092 = r3.A09("individual_chat_defaults");
        if (i != A092.A00) {
            A092.A00 = i;
            r3.A0H(A092);
        }
        if (isChecked) {
            this.A0T.ANF(new RunnableEBaseShape0S0100000_I0_0(this.A0D, 40));
        }
    }

    public /* synthetic */ void lambda$onCreate$1350$SettingsChat(View view) {
        AnonymousClass1VY.A0N(((ActivityC004702f) this).A0G, this, null, this, 17);
    }

    public /* synthetic */ void lambda$onCreate$1351$SettingsChat(View view) {
        AnonymousClass00C r9 = this.A0J;
        if (r9.A09(this.A0H)) {
            AnonymousClass0HO r5 = this.A0M;
            AnonymousClass0AR r6 = this.A0Q;
            r5.A02(3000, new C40631ta(this, ((AnonymousClass2C0) this).A01, r5, r6, this, new RunnableEBaseShape1S0100000_I0_1(this, 47), r9, this.A0L));
        }
    }

    public /* synthetic */ void lambda$onCreate$1352$SettingsChat(View view) {
        startActivity(new Intent(this, SettingsGoogleDrive.class));
    }

    public /* synthetic */ void lambda$onCreate$1353$SettingsChat(View view) {
        startActivity(new Intent(this, SettingsChatHistory.class));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    @Override // X.ActivityC004902h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, android.content.Intent r7) {
        /*
        // Method dump skipped, instructions count: 132
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onConfigurationChanged(Configuration configuration) {
        if (!this.A08) {
            super.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x016a, code lost:
        if (r2 == 2) goto L_0x016c;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 476
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.SettingsChat.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 600) {
            return A04(this, ((AnonymousClass2C0) this).A01);
        }
        if (i != 602) {
            return super.onCreateDialog(i);
        }
        return A05(this, ((AnonymousClass2C0) this).A01);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        AnonymousClass00C r0 = this.A0J;
        AnonymousClass1U0 r1 = this.A0I;
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
        AnonymousClass00C r0 = this.A0J;
        AnonymousClass1U0 r1 = this.A0I;
        if (r0 != null) {
            if (r1 != null) {
                r0.A07.add(r1);
            }
            AnonymousClass01X r6 = ((AnonymousClass2C0) this).A01;
            String A062 = A06(r6, this.A0N);
            if (this.A05 != null) {
                if (this.A0F.A06()) {
                    this.A05.setSubText(null);
                } else if (this.A0L.A06()) {
                    this.A05.setSubText(r6.A0D(R.string.settings_msg_store_last_backup, A062));
                } else {
                    this.A05.setSubText(r6.A06(R.string.settings_msg_store_cannot_backup));
                }
            }
            AnonymousClass01I r02 = this.A0E;
            r02.A04();
            Me me = r02.A00;
            if (me == null) {
                this.A06.setVisibility(8);
                return;
            }
            AnonymousClass1U3 r7 = new AnonymousClass1U3(me.cc, me.number, r6.A05, r6.A04);
            if (r7.A01 == 0) {
                this.A06.setVisibility(8);
            } else if (!r7.A03.equals("US") || this.A0O.A0E(292)) {
                this.A06.setVisibility(0);
                String[] strArr = r7.A04;
                strArr[0] = r6.A0D(R.string.device_default_language_with_placeholder, strArr[0]);
                String[] strArr2 = r7.A04;
                this.A0B = strArr2;
                this.A0C = r7.A05;
                int i = r7.A00;
                this.A00 = i;
                this.A06.setSubText(strArr2[i]);
                this.A06.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 36));
                String str = r7.A02;
                if (!str.isEmpty()) {
                    AnonymousClass20M r12 = new AnonymousClass20M();
                    r12.A00 = str;
                    this.A0P.A0B(r12, null, false);
                }
            }
        } else {
            throw null;
        }
    }
}
