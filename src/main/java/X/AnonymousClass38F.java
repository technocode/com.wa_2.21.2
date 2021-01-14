package X;

import android.content.DialogInterface;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.38F  reason: invalid class name */
public final /* synthetic */ class AnonymousClass38F implements DialogInterface.OnClickListener {
    public final /* synthetic */ VoipActivityV2.E2EEInfoDialogFragment A00;

    public /* synthetic */ AnonymousClass38F(VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment) {
        this.A00 = e2EEInfoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        VoipActivityV2.E2EEInfoDialogFragment e2EEInfoDialogFragment = this.A00;
        if (e2EEInfoDialogFragment.A0U()) {
            e2EEInfoDialogFragment.A0r();
        }
    }
}
