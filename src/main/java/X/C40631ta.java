package X;

import android.app.Activity;
import com.google.android.search.verification.client.R;
import com.whatsapp.SettingsChat;
import com.whatsapp.util.Log;
import java.util.Locale;

/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public final class C40631ta implements AbstractC47932Kg {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AbstractC004502c A01;
    public final /* synthetic */ AnonymousClass00C A02;
    public final /* synthetic */ AnonymousClass03S A03;
    public final /* synthetic */ AnonymousClass01X A04;
    public final /* synthetic */ AnonymousClass0HO A05;
    public final /* synthetic */ AnonymousClass0AR A06;
    public final /* synthetic */ Runnable A07;

    public C40631ta(Activity activity, AnonymousClass01X r2, AnonymousClass0HO r3, AnonymousClass0AR r4, AbstractC004502c r5, Runnable runnable, AnonymousClass00C r7, AnonymousClass03S r8) {
        this.A00 = activity;
        this.A04 = r2;
        this.A05 = r3;
        this.A06 = r4;
        this.A01 = r5;
        this.A07 = runnable;
        this.A02 = r7;
        this.A03 = r8;
    }

    @Override // X.AbstractC47932Kg
    public void ACe(int i) {
        String A0E;
        this.A05.A0G.A01(this);
        Activity activity = this.A00;
        C002001d.A2N(activity, 600);
        SettingsChat.A0V = null;
        if (i == 3) {
            AnonymousClass0HY.A08(activity.getApplicationContext());
            byte[] A0C = C007603r.A0C(16);
            byte[] A0H = AnonymousClass0HY.A0H(A0C);
            if (A0H != null) {
                this.A06.A0T(A0H, A0C, null);
                this.A01.APo(R.string.msg_store_backup_failed_try_again_later);
                Log.w("settings/backup/failed/missing-or-mismatch");
                return;
            }
            this.A01.APo(R.string.msg_store_backup_failed);
            Log.w("settings/backup/failed/null");
        } else if (i == 0) {
            this.A07.run();
        } else if (i == 2) {
            AbstractC004502c r4 = this.A01;
            if (AnonymousClass00C.A01()) {
                StringBuilder sb = new StringBuilder();
                AnonymousClass01X r1 = this.A04;
                AnonymousClass008.A0o(r1, R.string.msg_store_backup_failed_out_of_space, sb, " ");
                A0E = AnonymousClass008.A0E(r1, R.string.remove_files_from_sd_card, sb);
            } else {
                StringBuilder sb2 = new StringBuilder();
                AnonymousClass01X r12 = this.A04;
                AnonymousClass008.A0o(r12, R.string.msg_store_backup_failed_out_of_space_shared_storage, sb2, " ");
                A0E = AnonymousClass008.A0E(r12, R.string.remove_files_from_shared_storage, sb2);
            }
            r4.APr(A0E);
        } else if (i == 1) {
            this.A01.APo(R.string.msg_store_backup_failed);
            Log.w("settings/backup/failed/null");
        } else if (!this.A03.A06()) {
            Log.i("settings/backup/failed/missing-permissions");
            this.A01.APo(R.string.msg_store_backup_failed);
        }
    }

    @Override // X.AbstractC47932Kg
    public void ADW() {
        C002001d.A2O(this.A00, 600);
    }

    @Override // X.AbstractC47932Kg
    public void AIu(int i) {
        AnonymousClass1ND r10 = SettingsChat.A0V;
        if (r10 != null) {
            AnonymousClass01X r8 = this.A04;
            r10.setMessage(r8.A0D(R.string.settings_backup_db_now_message_with_progress_percentage_placeholder, r8.A0H().format(((double) i) / 100.0d)));
        }
        if (i % 10 == 0) {
            Log.i(String.format(Locale.ENGLISH, "settings/backup/msgstore/progress/%d%%", Integer.valueOf(i)));
            return;
        }
        String.format(Locale.ENGLISH, "settings/backup/msgstore/progress/%d%%", Integer.valueOf(i));
    }
}
