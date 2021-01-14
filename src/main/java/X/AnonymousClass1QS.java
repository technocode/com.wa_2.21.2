package X;

import android.os.Bundle;
import android.view.View;
import com.facebook.redex.ViewOnClickEmptyBase;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;

/* renamed from: X.1QS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1QS extends ViewOnClickEmptyBase implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C27511Qh A01;
    public final /* synthetic */ RestoreFromBackupActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass1QS(RestoreFromBackupActivity restoreFromBackupActivity, String str, C27511Qh r3, long j) {
        this.A02 = restoreFromBackupActivity;
        this.A03 = str;
        this.A01 = r3;
        this.A00 = j;
    }

    public final void onClick(View view) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A02;
        String str = this.A03;
        C27511Qh r11 = this.A01;
        long j = this.A00;
        AnonymousClass00C r6 = restoreFromBackupActivity.A0X;
        if (r6.A02() < restoreFromBackupActivity.A01) {
            StringBuilder A0S = AnonymousClass008.A0S("gdrive-activity/show-restore insufficient storage, available: ");
            A0S.append(r6.A02());
            A0S.append(" required: ");
            AnonymousClass008.A1P(A0S, restoreFromBackupActivity.A01);
            AnonymousClass01X r4 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
            boolean A012 = AnonymousClass00C.A01();
            int i = R.string.gdrive_insufficient_shared_storage_message;
            if (A012) {
                i = R.string.gdrive_insufficient_sdcard_storage_message;
            }
            String A0D = r4.A0D(i, C002001d.A1Y(r4, restoreFromBackupActivity.A01));
            Bundle A013 = AnonymousClass008.A01("dialog_id", 13);
            A013.putString("title", r4.A06(R.string.gdrive_insufficient_sdcard_storage_title));
            A013.putString("message", A0D);
            A013.putString("positive_button", r4.A06(R.string.btn_storage_settings));
            A013.putString("neutral_button", r4.A06(R.string.ok));
            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
            promptDialogFragment.A0N(A013);
            promptDialogFragment.A0u(restoreFromBackupActivity.A04(), null);
            return;
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("gdrive-activity/show-restore starting restore from ");
        A0S2.append(AnonymousClass0JJ.A0B(str));
        Log.i(A0S2.toString());
        Log.i("gdrive-activity/show-restore/stopping-approx-transfer-size-calc-thread");
        restoreFromBackupActivity.A0p.set(true);
        restoreFromBackupActivity.A0b();
        restoreFromBackupActivity.A0m.ANF(new RunnableEBaseShape0S1200100_I1(restoreFromBackupActivity, str, j, r11, 0));
    }
}
