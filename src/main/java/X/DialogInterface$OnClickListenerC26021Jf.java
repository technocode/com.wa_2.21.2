package X;

import android.content.DialogInterface;
import com.whatsapp.StopLiveLocationDialogFragment;

/* renamed from: X.1Jf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC26021Jf implements DialogInterface.OnClickListener {
    public final /* synthetic */ StopLiveLocationDialogFragment A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ DialogInterface$OnClickListenerC26021Jf(StopLiveLocationDialogFragment stopLiveLocationDialogFragment, String str, String str2) {
        this.A00 = stopLiveLocationDialogFragment;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        StopLiveLocationDialogFragment stopLiveLocationDialogFragment = this.A00;
        String str = this.A01;
        String str2 = this.A02;
        AnonymousClass01S r1 = stopLiveLocationDialogFragment.A01;
        AnonymousClass02N A012 = AnonymousClass02N.A01(str2);
        if (A012 != null) {
            r1.A0Z(str, A012);
            return;
        }
        throw null;
    }
}
