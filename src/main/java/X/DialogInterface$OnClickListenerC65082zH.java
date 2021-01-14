package X;

import android.content.DialogInterface;
import com.whatsapp.registration.EULA;

/* renamed from: X.2zH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC65082zH implements DialogInterface.OnClickListener {
    public final /* synthetic */ EULA A00;

    public /* synthetic */ DialogInterface$OnClickListenerC65082zH(EULA eula) {
        this.A00 = eula;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        EULA eula = this.A00;
        C002001d.A2N(eula, 6);
        if (C007603r.A07()) {
            C002001d.A2O(eula, 8);
        } else {
            eula.A00 = 0;
        }
    }
}
