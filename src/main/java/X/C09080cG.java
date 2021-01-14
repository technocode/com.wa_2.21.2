package X;

import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0cG  reason: invalid class name and case insensitive filesystem */
public final class C09080cG implements AbstractC09090cH, AbstractC000900m {
    public static volatile C09080cG A0M;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public BroadcastReceiver A04;
    public BroadcastReceiver A05;
    public BroadcastReceiver A06;
    public BroadcastReceiver A07;
    public String A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final AnonymousClass0HQ A0C;
    public final C003301q A0D;
    public final AnonymousClass04j A0E;
    public final AnonymousClass00G A0F;
    public final AnonymousClass03C A0G;
    public final AnonymousClass00D A0H;
    public final AnonymousClass01X A0I;
    public final AnonymousClass00T A0J;
    public final AtomicReference A0K = new AtomicReference(10);
    public volatile Notification A0L;

    @Override // X.AbstractC09090cH
    public void ACZ(boolean z) {
    }

    @Override // X.AbstractC09090cH
    public void AHl(boolean z) {
    }

    @Override // X.AbstractC09090cH
    public void AHm(long j, long j2) {
    }

    @Override // X.AbstractC09090cH
    public void AHn() {
    }

    @Override // X.AbstractC09090cH
    public void ALU() {
    }

    public C09080cG(AnonymousClass00G r3, AnonymousClass00T r4, AnonymousClass01X r5, AnonymousClass04j r6, AnonymousClass00D r7, AnonymousClass03C r8, C003301q r9, AnonymousClass0HQ r10) {
        this.A0F = r3;
        this.A0J = r4;
        this.A0I = r5;
        this.A0E = r6;
        this.A0H = r7;
        this.A0G = r8;
        this.A0D = r9;
        this.A0C = r10;
    }

    public static C09080cG A00() {
        if (A0M == null) {
            synchronized (C09080cG.class) {
                if (A0M == null) {
                    A0M = new C09080cG(AnonymousClass00G.A01, C002101e.A00(), AnonymousClass01X.A00(), AnonymousClass04j.A00(), AnonymousClass00D.A00(), AnonymousClass03C.A00(), C003301q.A02, AnonymousClass0HQ.A00());
                }
            }
        }
        return A0M;
    }

    public final PendingIntent A01(String str) {
        Intent intent = new Intent(str);
        intent.setPackage("com.whatsapp");
        return PendingIntent.getBroadcast(this.A0F.A00, 0, intent, 0);
    }

    public final AnonymousClass03E A02() {
        AnonymousClass00G r1 = this.A0F;
        AnonymousClass03E A002 = AnonymousClass0BS.A00(r1.A00);
        A002.A0J = "chat_history_backup@1";
        Application application = r1.A00;
        A002.A09 = PendingIntent.getActivity(application, 0, new Intent(application, SettingsGoogleDrive.class), 0);
        A002.A07.icon = R.drawable.notifybar;
        if (Build.VERSION.SDK_INT >= 21) {
            A002.A06 = 1;
        }
        return A002;
    }

    public void A03() {
        this.A0L = null;
        this.A0G.A04(null, 5, "GoogleDriveNotificationManager1");
    }

    public final void A04(String str, String str2, int i, int i2, boolean z, boolean z2, C14550mT r12) {
        this.A08 = str2;
        if (this.A09) {
            A03();
        }
        AnonymousClass03E A022 = A02();
        boolean z3 = true;
        if (i == 1) {
            A022.A05 = 0;
            A022.A04 = 0;
            A022.A0T = false;
        } else if (i == 2) {
            A022.A05 = 100;
            A022.A04 = i2;
            A022.A0T = true;
        } else if (i == 3) {
            A022.A05 = 100;
            A022.A04 = i2;
            A022.A0T = false;
        } else {
            throw new IllegalStateException(AnonymousClass008.A0F("unexpected value for progress bar style", i));
        }
        A022.A06(16, z2);
        A022.A06(2, z);
        A022.A0A(str);
        A022.A09(str2);
        this.A0A = z;
        if (r12 == null) {
            z3 = false;
        }
        this.A09 = z3;
        if (r12 != null) {
            A022.A0N.add(r12);
        }
        StringBuilder sb = new StringBuilder();
        if (i == 2) {
            sb.append("indeterminate");
        } else {
            sb.append(i2);
            sb.append('%');
        }
        Notification A012 = A022.A01();
        this.A0L = A012;
        StringBuilder A0a = AnonymousClass008.A0a("gdrive-notification-manager/update-notification title:", str, " text:", str2, " progress:");
        A0a.append((Object) sb);
        Log.d(A0a.toString());
        this.A0G.A03(null, 5, A012);
    }

    @Override // X.AbstractC09090cH
    public void ADJ() {
        A03();
    }

    @Override // X.AbstractC09090cH
    public void ADK(boolean z) {
        if (((Number) this.A0K.getAndSet(23)).intValue() != 23) {
            Log.i("gdrive-notification-manager/backup-end");
            this.A00 = 0;
            AnonymousClass01X r1 = this.A0I;
            int i = R.string.gdrive_backup_notification_title_finished_failed;
            if (z) {
                i = R.string.gdrive_backup_notification_title_finished_success;
            }
            A04(r1.A06(i), r1.A06(R.string.gdrive_backup_notification_string_finished), 1, -1, false, true, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADL(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-data-connection");
        if (((Number) this.A0K.getAndSet(17)).intValue() != 17) {
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_backup_title_paused), r1.A06(R.string.gdrive_media_restore_notification_string_paused_for_data_connection), 3, i, false, false, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADM(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-low-battery");
        if (((Number) this.A0K.getAndSet(18)).intValue() != 18) {
            if (this.A05 == null) {
                C27601Qq r2 = new C27601Qq(this);
                this.A05 = r2;
                this.A0F.A00.registerReceiver(r2, new IntentFilter("enable_backup_over_low_battery"));
            }
            AnonymousClass01X r3 = this.A0I;
            C14550mT r12 = new C14550mT(R.drawable.ic_action_refresh, r3.A06(R.string.gdrive_media_restore_notification_resume_now), A01("enable_backup_over_low_battery"));
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A04(r3.A06(R.string.gdrive_backup_title_paused), r3.A06(R.string.gdrive_media_restore_notification_string_paused_for_battery), 3, i, false, false, r12);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADN(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(20)).intValue() != 20) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-missing");
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_backup_title_paused), r1.A06(R.string.msg_store_backup_skipped_due_to_missing_sdcard_title), 3, i, false, false, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADO(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(19)).intValue() != 19) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-unmounted");
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_backup_title_paused), r1.A06(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title), 3, i, false, false, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADP(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(16)).intValue() != 16) {
            Log.i("gdrive-notification-manager/backup-paused-wifi-unavailable");
            if (this.A04 == null) {
                C27591Qp r2 = new C27591Qp(this);
                this.A04 = r2;
                this.A0F.A00.registerReceiver(r2, new IntentFilter("enable_backup_over_cellular"));
            }
            C14550mT r11 = null;
            if (this.A0E.A03(true) == 2) {
                r11 = new C14550mT(R.drawable.ic_action_refresh, this.A0I.A06(R.string.gdrive_media_restore_notification_resume_now), A01("enable_backup_over_cellular"));
            }
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_backup_title_paused), r1.A06(R.string.gdrive_media_restore_notification_string_paused_for_wifi), 3, i, false, false, r11);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADQ(int i) {
        AtomicReference atomicReference = this.A0K;
        boolean z = false;
        if (((Number) atomicReference.get()).intValue() != 12) {
            z = true;
        }
        if (((Number) atomicReference.getAndSet(12)).intValue() != 12 || System.currentTimeMillis() - this.A03 >= 200) {
            this.A03 = System.currentTimeMillis();
            AnonymousClass01X r7 = this.A0I;
            String A062 = r7.A06(R.string.gdrive_backup_title);
            if (i >= 0 || z) {
                A04(A062, r7.A0D(R.string.gdrive_backup_notification_string_preparation_message_with_percentage_placeholder, r7.A0H().format(((double) i) / 100.0d)), 2, -1, true, false, null);
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void ADR() {
        if (((Number) this.A0K.getAndSet(11)).intValue() != 11) {
            Log.i("gdrive-notification-manager/backup-prep-start");
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_backup_title), r1.A06(R.string.gdrive_backup_notification_string_preparation_message), 2, -1, true, false, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADS(long j, long j2) {
        int i;
        AtomicReference atomicReference = this.A0K;
        boolean z = false;
        if (((Number) atomicReference.get()).intValue() != 14) {
            z = true;
        }
        if (((Number) atomicReference.getAndSet(14)).intValue() != 14 || System.currentTimeMillis() - this.A03 >= 200) {
            this.A03 = System.currentTimeMillis();
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = 0;
            }
            if (i - this.A00 > 0 || z) {
                Log.i(String.format(Locale.ENGLISH, "gdrive-notification-manager/backup-progress %d/%d (%d)", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
                this.A00 = i;
                AnonymousClass01X r6 = this.A0I;
                String A062 = r6.A06(R.string.gdrive_backup_title);
                String A0D2 = r6.A0D(R.string.settings_gdrive_backup_progress_message_with_percentage, C002001d.A1Y(r6, j), C002001d.A1Y(r6, j2), r6.A0H().format(((double) i) / 100.0d));
                if (!A0D2.equals(this.A08)) {
                    A04(A062, A0D2, 3, i, true, false, null);
                }
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void ADT() {
        this.A0K.getAndSet(13);
    }

    @Override // X.AbstractC000900m
    public void AEa(AnonymousClass0JF r4) {
        this.A0J.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 5));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC09090cH
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AFh(int r19, android.os.Bundle r20) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09080cG.AFh(int, android.os.Bundle):void");
    }

    @Override // X.AbstractC09090cH
    public void AFi(int i, Bundle bundle) {
        if (i != 10 && ((Number) this.A0K.getAndSet(27)).intValue() != 27) {
            StringBuilder A0S = AnonymousClass008.A0S("gdrive-notification-manager/media-restore-error/");
            A0S.append(AnonymousClass0JJ.A05(i));
            Log.i(A0S.toString());
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_media_restore_title_failed), r1.A06(R.string.gdrive_backup_notification_string_finished), 1, -1, false, true, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void AFj(int i, Bundle bundle) {
        StringBuilder A0S = AnonymousClass008.A0S("gdrive-notification-manager/msgstore-restore-error/");
        A0S.append(AnonymousClass0JJ.A05(i));
        Log.i(A0S.toString());
    }

    @Override // X.AbstractC09090cH
    public void AHY() {
        A03();
    }

    @Override // X.AbstractC09090cH
    public void AHZ(boolean z, long j, long j2) {
        String A0D2;
        String str;
        if (((Number) this.A0K.getAndSet(33)).intValue() != 33) {
            StringBuilder A0S = AnonymousClass008.A0S("gdrive-notification-manager/restore-end/");
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            A0S.append(str);
            A0S.append(" total: ");
            A0S.append(j2);
            A0S.append(" failed: ");
            A0S.append(j);
            Log.i(A0S.toString());
        }
        if (j2 == 0) {
            A03();
            return;
        }
        AnonymousClass01X r6 = this.A0I;
        String A062 = r6.A06(R.string.gdrive_media_restore_title_finished);
        if (j > 0) {
            A0D2 = r6.A0D(R.string.gdrive_media_restore_notification_string_finished_with_failures, C002001d.A1Y(r6, j2 - j), C002001d.A1Y(r6, j));
        } else {
            A0D2 = r6.A0D(R.string.gdrive_media_restore_notification_string_finished_no_failures, C002001d.A1Y(r6, j2));
        }
        A04(A062, A0D2, 1, -1, false, true, null);
    }

    @Override // X.AbstractC09090cH
    public void AHa(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(29)).intValue() != 29) {
            Log.i("gdrive-notification-manager/restore-paused-data-unavailable");
            AnonymousClass01X r1 = this.A0I;
            String A062 = r1.A06(R.string.gdrive_media_restore_title_paused);
            String A063 = r1.A06(R.string.gdrive_media_restore_notification_string_paused_for_data_connection);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A04(A062, A063, 3, i, false, true, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHb(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(30)).intValue() != 30) {
            Log.i("gdrive-notification-manager/restore-paused-for-battery");
            if (this.A07 == null) {
                C27621Qs r2 = new C27621Qs(this);
                this.A07 = r2;
                this.A0F.A00.registerReceiver(r2, new IntentFilter("enable_restore_over_low_battery"));
            }
            AnonymousClass01X r22 = this.A0I;
            C14550mT r12 = new C14550mT(R.drawable.ic_action_refresh, r22.A06(R.string.gdrive_media_restore_notification_resume_now), A01("enable_restore_over_low_battery"));
            String A062 = r22.A06(R.string.gdrive_media_restore_title_paused);
            String A063 = r22.A06(R.string.gdrive_media_restore_notification_string_paused_for_battery);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A04(A062, A063, 3, i, false, true, r12);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHc(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(32)).intValue() != 32) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-missing");
            AnonymousClass01X r1 = this.A0I;
            String A062 = r1.A06(R.string.gdrive_media_restore_title_paused);
            String A063 = r1.A06(R.string.msg_store_backup_skipped_due_to_missing_sdcard_title);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A04(A062, A063, 3, i, false, true, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHd(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(31)).intValue() != 31) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-unmounted");
            A03();
            AnonymousClass01X r1 = this.A0I;
            String A062 = r1.A06(R.string.gdrive_media_restore_title_paused);
            String A063 = r1.A06(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_title);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A04(A062, A063, 3, i, false, true, null);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHe(long j, long j2) {
        int i;
        if (((Number) this.A0K.getAndSet(28)).intValue() != 28) {
            Log.i("gdrive-notification-manager/restore-paused-wifi-unavailable");
            if (this.A06 == null) {
                C27611Qr r2 = new C27611Qr(this);
                this.A06 = r2;
                this.A0F.A00.registerReceiver(r2, new IntentFilter("enable_restore_over_cellular"));
            }
            C14550mT r11 = null;
            if (this.A0E.A03(true) == 2) {
                r11 = new C14550mT(R.drawable.ic_action_refresh, this.A0I.A06(R.string.gdrive_media_restore_notification_resume_now), A01("enable_restore_over_cellular"));
            }
            AnonymousClass01X r1 = this.A0I;
            String A062 = r1.A06(R.string.gdrive_media_restore_title_paused);
            String A063 = r1.A06(R.string.gdrive_media_restore_notification_string_paused_for_wifi);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A04(A062, A063, 3, i, false, true, r11);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHf(int i) {
        AnonymousClass01X r8 = this.A0I;
        String A062 = r8.A06(R.string.gdrive_media_restore_title_running);
        AtomicReference atomicReference = this.A0K;
        if (((Number) atomicReference.get()).intValue() != 25 || System.currentTimeMillis() - this.A02 >= 200) {
            this.A02 = System.currentTimeMillis();
            boolean z = false;
            if (((Number) atomicReference.getAndSet(25)).intValue() != 25) {
                z = true;
            }
            if (i > 0 || z) {
                A04(A062, r8.A0D(R.string.gdrive_media_restore_notification_string_preparation_message_with_percentage_placeholder, r8.A0H().format(((double) i) / 100.0d)), 2, i, true, false, null);
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void AHg() {
        AnonymousClass01X r3 = this.A0I;
        String A062 = r3.A06(R.string.gdrive_media_restore_title_running);
        if (((Number) this.A0K.getAndSet(24)).intValue() != 24) {
            Log.i("gdrive-notification-manager/restore-prep-start");
        }
        A04(A062, r3.A06(R.string.gdrive_media_restore_notification_string_preparation_message), 2, -1, true, false, null);
    }

    @Override // X.AbstractC09090cH
    public synchronized void AHh(long j, long j2, long j3) {
        int i;
        String str;
        String A062 = this.A0I.A06(R.string.gdrive_media_restore_title_running);
        if (((Integer) this.A0K.get()).intValue() != 26 || System.currentTimeMillis() - this.A03 >= 200) {
            this.A03 = System.currentTimeMillis();
            if (((Integer) this.A0K.getAndSet(26)).intValue() != 26) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-notification-manager/restore-progress ");
                sb.append(j);
                sb.append("/");
                sb.append(j3);
                sb.append(" bytes (");
                sb.append(j2);
                sb.append(" bytes failed).");
                Log.i(sb.toString());
            }
            if (j3 > 0) {
                i = (int) ((100 * j) / j3);
            } else {
                i = -1;
            }
            this.A01 = i;
            if (j2 > 0) {
                AnonymousClass01X r7 = this.A0I;
                NumberFormat A0H2 = this.A0I.A0H();
                double d = (double) this.A01;
                Double.isNaN(d);
                str = r7.A0D(R.string.gdrive_media_restore_notification_string_with_failures_and_percentage, C002001d.A1Y(this.A0I, j), C002001d.A1Y(this.A0I, j3), A0H2.format(d / 100.0d));
            } else {
                AnonymousClass01X r72 = this.A0I;
                NumberFormat A0H3 = this.A0I.A0H();
                double d2 = (double) this.A01;
                Double.isNaN(d2);
                str = r72.A0D(R.string.gdrive_media_restore_notification_string_no_failures_with_placeholder, C002001d.A1Y(this.A0I, j), C002001d.A1Y(this.A0I, j3), A0H3.format(d2 / 100.0d));
            }
            if (!str.equals(this.A08)) {
                A04(A062, str, 3, this.A01, true, false, null);
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void AJo() {
        if (((Number) this.A0K.getAndSet(21)).intValue() != 21) {
            Log.i("gdrive-notification-manager/backup-scrub-start");
            AnonymousClass01X r1 = this.A0I;
            A04(r1.A06(R.string.gdrive_backup_title), r1.A06(R.string.settings_gdrive_backup_finishing_message), 2, -1, true, false, null);
        }
    }
}
