package X;

import android.content.DialogInterface;
import com.whatsapp.stickers.ConfirmPackDeleteDialogFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.32s  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC660632s implements DialogInterface.OnClickListener {
    public final /* synthetic */ ConfirmPackDeleteDialogFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ DialogInterface$OnClickListenerC660632s(ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment, String str) {
        this.A00 = confirmPackDeleteDialogFragment;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass339 r1;
        ConfirmPackDeleteDialogFragment confirmPackDeleteDialogFragment = this.A00;
        String str = this.A01;
        if (i == -1) {
            try {
                r1 = (AnonymousClass339) confirmPackDeleteDialogFragment.A00();
                if (r1 != null) {
                    r1.ALQ();
                }
            } catch (ClassCastException unused) {
                r1 = null;
            }
            WeakReference weakReference = new WeakReference(r1);
            C03570Gt r4 = confirmPackDeleteDialogFragment.A01;
            AnonymousClass3Q5 r12 = new AnonymousClass3Q5(weakReference);
            Log.d("StickerRepository/uninstallStickerPackAsync/begin");
            r4.A0R.ANC(new AnonymousClass3QW(r4.A0G, r4, r12), str);
            confirmPackDeleteDialogFragment.A0w(false, false);
        }
    }
}
