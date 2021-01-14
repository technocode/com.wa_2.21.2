package com.facebook.redex;

import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass0JJ;
import X.AnonymousClass1OY;
import X.AnonymousClass21P;
import X.AnonymousClass2C0;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.biz.BusinessHoursView;
import com.whatsapp.util.Log;

public class ViewOnClickEBaseShape0S0110000_I1 extends ViewOnClickEmptyBase implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public ViewOnClickEBaseShape0S0110000_I1(Object obj, boolean z, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1OY) this.A00).A01.A0N(false, this.A01, false);
                return;
            case 1:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                if (!this.A01) {
                    AnonymousClass00D r1 = ((ActivityC004702f) restoreFromBackupActivity).A0J;
                    r1.A0Q(0);
                    r1.A0I();
                    Log.i("gdrive-activity/msgstore-download-finish no media to restore, setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
                    restoreFromBackupActivity.setResult(3);
                    restoreFromBackupActivity.finish();
                    return;
                } else if (restoreFromBackupActivity.A0Y.A03(true) != 1) {
                    Bundle A012 = AnonymousClass008.A01("dialog_id", 12);
                    AnonymousClass01X r2 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
                    A012.putString("message", r2.A06(R.string.gdrive_messages_restore_succeeded_media_will_be_restored_on_wifi));
                    A012.putBoolean("cancelable", false);
                    A012.putString("positive_button", r2.A06(R.string.ok));
                    A012.putString("negative_button", r2.A06(R.string.gdrive_restore_now));
                    PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                    promptDialogFragment.A0N(A012);
                    promptDialogFragment.A0u(restoreFromBackupActivity.A04(), null);
                    return;
                } else {
                    Log.i("gdrive-activity/msgstore-download-finish, Wi-Fi available, starting media restore.");
                    Log.i("gdrive-activity/restore-media");
                    AnonymousClass0JJ.A0G(restoreFromBackupActivity, new Intent("action_restore_media"));
                    Log.i("gdrive-activity/msgstore-download-finish setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
                    restoreFromBackupActivity.setResult(3);
                    restoreFromBackupActivity.finish();
                    return;
                }
            case 2:
                BusinessHoursView businessHoursView = (BusinessHoursView) this.A00;
                if (this.A01 && !businessHoursView.A02) {
                    AnonymousClass21P r3 = new AnonymousClass21P();
                    r3.A00 = 4;
                    businessHoursView.A04.A0B(r3, null, false);
                }
                businessHoursView.A02 = !businessHoursView.A02;
                businessHoursView.A00();
                return;
            default:
                return;
        }
    }
}
