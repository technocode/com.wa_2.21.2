package X;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.ChatMediaVisibilityDialog;

/* renamed from: X.1Hf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25501Hf implements DialogInterface.OnClickListener {
    public final /* synthetic */ ChatMediaVisibilityDialog A00;

    public /* synthetic */ DialogInterface$OnClickListenerC25501Hf(ChatMediaVisibilityDialog chatMediaVisibilityDialog) {
        this.A00 = chatMediaVisibilityDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ChatMediaVisibilityDialog chatMediaVisibilityDialog = this.A00;
        int i2 = chatMediaVisibilityDialog.A01;
        if (i2 != chatMediaVisibilityDialog.A00) {
            AnonymousClass0BB r2 = chatMediaVisibilityDialog.A05;
            AnonymousClass0BG A09 = r2.A09(chatMediaVisibilityDialog.A02.getRawString());
            if (i2 != A09.A00) {
                A09.A00 = i2;
                r2.A0H(A09);
            }
        }
        ((DialogFragment) chatMediaVisibilityDialog).A03.dismiss();
    }
}
