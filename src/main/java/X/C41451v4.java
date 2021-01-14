package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.SettingsGoogleDrive;
import com.whatsapp.util.Log;

/* renamed from: X.1v4  reason: invalid class name and case insensitive filesystem */
public class C41451v4 implements AbstractC09090cH {
    public int A00;
    public long A01 = -1;
    public long A02 = -1;
    public final /* synthetic */ SettingsGoogleDrive A03;

    public C41451v4(SettingsGoogleDrive settingsGoogleDrive) {
        this.A03 = settingsGoogleDrive;
    }

    public final void A00(int i, String str, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, int i2) {
        boolean z = false;
        if (i != this.A00) {
            z = true;
            if (i == 4) {
                Log.i("settings-gdrive/set-message/show-indeterminate");
                StringBuilder sb = new StringBuilder("settings-gdrive/progress-bar-state-change ");
                sb.append(this.A00);
                sb.append(" -> ");
                sb.append(4);
                Log.d(sb.toString());
            }
        }
        this.A00 = i;
        AnonymousClass02M r0 = ((ActivityC004702f) this.A03).A0F;
        r0.A02.post(new AnonymousClass1QU(this, i, z, str, onClickListener, i2, onClickListener2));
    }

    @Override // X.AbstractC09090cH
    public void ACZ(boolean z) {
        Log.e("settings-gdrive-observer/account-deletion-end/unexpected-state");
    }

    @Override // X.AbstractC09090cH
    public void ADJ() {
        Log.i("settings-gdrive-observer/backup-cancelled");
        A00(2, null, null, null, -1);
    }

    @Override // X.AbstractC09090cH
    public void ADK(boolean z) {
        AnonymousClass008.A1H("settings-gdrive-observer/backup-end ", z);
        A00(2, null, null, null, -1);
        if (z) {
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            if (settingsGoogleDrive.A0K != null) {
                settingsGoogleDrive.A0S.A03();
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void ADL(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/no-data-connection");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_error_data_network_not_available_message), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.AbstractC09090cH
    public void ADM(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/low-battery");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_backup_pending_on_low_battery), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.AbstractC09090cH
    public void ADN(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/sdcard-missing");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.gdrive_backup_error_sdcard_missing_summary), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.AbstractC09090cH
    public void ADO(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/backup-paused/sdcard-unmounted");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(3, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.msg_store_backup_skipped_due_to_unmounted_sdcard_summary), settingsGoogleDrive.A00, null, i);
    }

    @Override // X.AbstractC09090cH
    public void ADP(long j, long j2) {
        int i;
        String A06;
        Log.i("settings-gdrive-observer/backup-paused/no-wifi");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        if (settingsGoogleDrive.A0Z.A03(true) == 2) {
            A06 = ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_backup_pending_on_wifi_message_cellular_connection_available);
        } else {
            A06 = ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_backup_pending_on_wifi_message_no_data_connection_available);
        }
        A00(3, A06, settingsGoogleDrive.A00, null, i);
    }

    @Override // X.AbstractC09090cH
    public void ADQ(int i) {
        if (i >= 0) {
            AnonymousClass00E.A00();
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            AnonymousClass01X r8 = ((AnonymousClass2C0) settingsGoogleDrive).A01;
            A00(4, r8.A0D(R.string.settings_gdrive_backup_preparation_message_with_percentage_placeholder, r8.A0H().format(((double) i) / 100.0d)), settingsGoogleDrive.A00, null, i);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADR() {
        Log.i("settings-gdrive-observer/backup-prep-start");
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(4, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_backup_preparation_message), settingsGoogleDrive.A00, null, -1);
    }

    @Override // X.AbstractC09090cH
    public void ADS(long j, long j2) {
        if (j2 <= 0) {
            StringBuilder A0V = AnonymousClass008.A0V("settings-gdrive-observer/backup-progress incorrect invocation: ", j, "/");
            A0V.append(j2);
            Log.e(A0V.toString());
            return;
        }
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        AnonymousClass01X r9 = ((AnonymousClass2C0) settingsGoogleDrive).A01;
        String A1Y = C002001d.A1Y(r9, j);
        int i = (int) ((100 * j) / j2);
        if (((int) ((this.A02 * 100) / j2)) != i || !C002001d.A1Y(r9, j).equals(C002001d.A1Y(r9, this.A02))) {
            this.A02 = j;
            A00(3, r9.A0D(R.string.settings_gdrive_backup_progress_message_with_percentage, A1Y, C002001d.A1Y(r9, j2), r9.A0H().format(((double) i) / 100.0d)), settingsGoogleDrive.A00, null, i);
        }
    }

    @Override // X.AbstractC09090cH
    public void ADT() {
        Log.i("settings-gdrive-observer/backup-start");
        this.A02 = -1;
        ADQ(0);
    }

    @Override // X.AbstractC09090cH
    public void AFh(int i, Bundle bundle) {
        if (i != 10) {
            A00(2, null, null, null, -1);
        }
        AnonymousClass02M r2 = ((ActivityC004702f) this.A03).A0F;
        r2.A02.post(new RunnableEBaseShape1S0201000_I1(bundle, i, this, 10));
    }

    @Override // X.AbstractC09090cH
    public void AFi(int i, Bundle bundle) {
        if (i != 10) {
            A00(1, null, null, null, -1);
        }
        AnonymousClass02M r2 = ((ActivityC004702f) this.A03).A0F;
        r2.A02.post(new RunnableEBaseShape1S0201000_I1(bundle, i, this, 9));
    }

    @Override // X.AbstractC09090cH
    public void AFj(int i, Bundle bundle) {
        Log.e("settings-gdrive-observer/msgstore-download-error/unexpected-state");
    }

    @Override // X.AbstractC09090cH
    public void AHY() {
        Log.i("settings-gdrive-observer/restore-cancelled");
        AnonymousClass02M r2 = ((ActivityC004702f) this.A03).A0F;
        r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(this, 19));
        A00(2, null, null, null, -1);
        this.A01 = -1;
        this.A02 = -1;
    }

    @Override // X.AbstractC09090cH
    public void AHZ(boolean z, long j, long j2) {
        AnonymousClass008.A1H("settings-gdrive-observer/restore-end ", z);
        A00(2, null, null, null, -1);
        this.A01 = -1;
        this.A02 = -1;
        if (z) {
            SettingsGoogleDrive settingsGoogleDrive = this.A03;
            if (settingsGoogleDrive.A0K != null) {
                settingsGoogleDrive.A0S.A03();
            }
        }
    }

    @Override // X.AbstractC09090cH
    public void AHa(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/no-data-connection");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, ((AnonymousClass2C0) this.A03).A01.A06(R.string.settings_gdrive_restore_media_pending_on_data_network_not_available_message), null, null, i);
    }

    @Override // X.AbstractC09090cH
    public void AHb(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/low-battery");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, ((AnonymousClass2C0) this.A03).A01.A06(R.string.settings_gdrive_restore_media_pending_on_low_battery), null, new ViewOnClickEBaseShape4S0100000_I1_2(this, 9), i);
    }

    @Override // X.AbstractC09090cH
    public void AHc(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/sdcard-missing");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, ((AnonymousClass2C0) this.A03).A01.A06(R.string.gdrive_restore_error_sdcard_missing_summary), null, null, i);
    }

    @Override // X.AbstractC09090cH
    public void AHd(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/sdcard-unmounted");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        A00(3, ((AnonymousClass2C0) this.A03).A01.A06(R.string.gdrive_restore_error_sdcard_unmounted_summary), null, null, i);
    }

    @Override // X.AbstractC09090cH
    public void AHe(long j, long j2) {
        int i;
        Log.i("settings-gdrive-observer/restore-paused/no-wifi");
        if (j2 > 0) {
            i = (int) ((j * 100) / j2);
        } else {
            i = -1;
        }
        ViewOnClickEBaseShape4S0100000_I1_2 viewOnClickEBaseShape4S0100000_I1_2 = null;
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        if (settingsGoogleDrive.A0Z.A03(true) == 2) {
            Log.i("settings-gdrive-observer/restore-paused/cellular-available");
            viewOnClickEBaseShape4S0100000_I1_2 = new ViewOnClickEBaseShape4S0100000_I1_2(this, 10);
        }
        A00(3, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_restore_pending_on_wifi_not_available_message), null, viewOnClickEBaseShape4S0100000_I1_2, i);
    }

    @Override // X.AbstractC09090cH
    public void AHf(int i) {
        if (i >= 0) {
            AnonymousClass01X r8 = ((AnonymousClass2C0) this.A03).A01;
            A00(4, r8.A0D(R.string.settings_gdrive_restore_media_preparation_message_with_percentage_placeholder, r8.A0H().format(((double) i) / 100.0d)), null, null, i);
        }
    }

    @Override // X.AbstractC09090cH
    public void AHg() {
        Log.i("settings-gdrive-observer/restore-start");
        A00(4, ((AnonymousClass2C0) this.A03).A01.A06(R.string.settings_gdrive_restore_media_preparation_message), null, null, -1);
    }

    @Override // X.AbstractC09090cH
    public void AHh(long j, long j2, long j3) {
        AnonymousClass01X r12 = ((AnonymousClass2C0) this.A03).A01;
        String A1Y = C002001d.A1Y(r12, j);
        if (!A1Y.equals(C002001d.A1Y(r12, this.A01))) {
            this.A01 = j;
            A00(3, r12.A0D(R.string.settings_gdrive_restore_progress_message_with_percentage, A1Y, C002001d.A1Y(r12, j3), r12.A0H().format(((double) j) / ((double) j3))), null, null, (int) ((j * 100) / j3));
        }
    }

    @Override // X.AbstractC09090cH
    public void AHl(boolean z) {
        Log.e("settings-gdrive-observer/msgstore-download-end/unexpected-state");
    }

    @Override // X.AbstractC09090cH
    public void AHm(long j, long j2) {
        Log.e("settings-gdrive-observer/msgstore-download-progress/unexpected-state");
        StringBuilder sb = new StringBuilder("settings-gdrive-observer/msgstore-download-progress/downloaded: ");
        sb.append(j);
        sb.append(" total: ");
        AnonymousClass008.A1P(sb, j2);
    }

    @Override // X.AbstractC09090cH
    public void AHn() {
        Log.e("settings-gdrive-observer/msgstore-download-start/unexpected-state");
    }

    @Override // X.AbstractC09090cH
    public void AJo() {
        Log.i("settings-gdrive-observer/post-backup-scrub-start");
        SettingsGoogleDrive settingsGoogleDrive = this.A03;
        A00(4, ((AnonymousClass2C0) settingsGoogleDrive).A01.A06(R.string.settings_gdrive_backup_finishing_message), settingsGoogleDrive.A00, null, -1);
    }

    @Override // X.AbstractC09090cH
    public void ALU() {
        AnonymousClass02M r2 = ((ActivityC004702f) this.A03).A0F;
        r2.A02.post(new RunnableEBaseShape7S0100000_I1_2(this, 20));
    }
}
