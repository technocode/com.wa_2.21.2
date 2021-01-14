package X;

import android.content.DialogInterface;
import com.whatsapp.twofactor.SetEmailFragment;
import com.whatsapp.util.Log;

/* renamed from: X.34h  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34h implements DialogInterface.OnClickListener {
    public final /* synthetic */ SetEmailFragment.ConfirmSkipEmailDialog A00;

    public /* synthetic */ AnonymousClass34h(SetEmailFragment.ConfirmSkipEmailDialog confirmSkipEmailDialog) {
        this.A00 = confirmSkipEmailDialog;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        SetEmailFragment setEmailFragment = (SetEmailFragment) this.A00.A09();
        if (setEmailFragment != null) {
            Log.i("setemailfragment/do-skip");
            setEmailFragment.A03.setText("");
            setEmailFragment.A05.A0U();
            return;
        }
        throw null;
    }
}
