package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.MuteDialogFragment;
import java.util.List;

/* renamed from: X.1Ih  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25781Ih implements DialogInterface.OnClickListener {
    public final /* synthetic */ MuteDialogFragment A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ DialogInterface$OnClickListenerC25781Ih(MuteDialogFragment muteDialogFragment, List list) {
        this.A00 = muteDialogFragment;
        this.A01 = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Bundle bundle;
        AnonymousClass02N A012;
        MuteDialogFragment muteDialogFragment = this.A00;
        if (this.A01 == null && (bundle = ((AnonymousClass037) muteDialogFragment).A06) != null && (A012 = AnonymousClass02N.A01(bundle.getString("jid"))) != null) {
            muteDialogFragment.A08.A05(A012);
        }
    }
}
