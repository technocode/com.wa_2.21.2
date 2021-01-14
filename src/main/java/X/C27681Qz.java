package X;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.backup.google.PromptDialogFragment;
import com.whatsapp.backup.google.RestoreFromBackupActivity;

/* renamed from: X.1Qz  reason: invalid class name and case insensitive filesystem */
public class C27681Qz extends ClickableSpan {
    public final /* synthetic */ RestoreFromBackupActivity A00;

    public C27681Qz(RestoreFromBackupActivity restoreFromBackupActivity) {
        this.A00 = restoreFromBackupActivity;
    }

    public void onClick(View view) {
        RestoreFromBackupActivity restoreFromBackupActivity = this.A00;
        if (restoreFromBackupActivity != null) {
            Bundle A01 = AnonymousClass008.A01("dialog_id", 16);
            AnonymousClass01X r2 = ((AnonymousClass2C0) restoreFromBackupActivity).A01;
            A01.putString("message", r2.A06(R.string.gdrive_one_time_setup_taking_too_long_message));
            A01.putBoolean("cancelable", false);
            A01.putString("positive_button", r2.A06(R.string.ok));
            A01.putString("negative_button", r2.A06(R.string.skip));
            PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
            promptDialogFragment.A0N(A01);
            if (!AnonymousClass0JJ.A0H(restoreFromBackupActivity)) {
                AnonymousClass0LW A04 = restoreFromBackupActivity.A04();
                if (A04 != null) {
                    AnonymousClass0QB r22 = new AnonymousClass0QB(A04);
                    r22.A0A(0, promptDialogFragment, "one-time-setup-taking-too-long", 1);
                    r22.A01();
                    return;
                }
                throw null;
            }
            return;
        }
        throw null;
    }
}
