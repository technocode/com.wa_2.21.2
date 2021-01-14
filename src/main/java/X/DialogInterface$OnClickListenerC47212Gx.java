package X;

import android.content.DialogInterface;
import com.whatsapp.conversation.CapturePictureOrVideoDialogFragment;

/* renamed from: X.2Gx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC47212Gx implements DialogInterface.OnClickListener {
    public final /* synthetic */ CapturePictureOrVideoDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC47212Gx(CapturePictureOrVideoDialogFragment capturePictureOrVideoDialogFragment) {
        this.A00 = capturePictureOrVideoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AbstractC03700Hh r1 = this.A00.A00;
        if (r1 == null) {
            return;
        }
        if (i == 0) {
            r1.AKv();
        } else if (i == 1) {
            r1.AJ8();
        }
    }
}
