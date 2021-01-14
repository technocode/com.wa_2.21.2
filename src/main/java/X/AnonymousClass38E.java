package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38E  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38E implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoipActivityV2.E2EEInfoDialogFragment A00;

    public /* synthetic */ AnonymousClass38E(VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment) {
        this.A00 = e2EEInfoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment = this.A00;
        e2EEInfoDialogFragment.A00.A05(e2EEInfoDialogFragment.A00(), new Intent("android.intent.action.VIEW", e2EEInfoDialogFragment.A02.A03("general", "28030015", null)));
        if (e2EEInfoDialogFragment.A0U()) {
            e2EEInfoDialogFragment.A0r();
        }
    }
}
