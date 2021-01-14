package X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.whatsapp.stickers.StickerStoreDialogFragment;

/* renamed from: X.333  reason: invalid class name */
public final /* synthetic */ class AnonymousClass333 implements DialogInterface.OnKeyListener {
    public final /* synthetic */ StickerStoreDialogFragment A00;

    public /* synthetic */ AnonymousClass333(StickerStoreDialogFragment stickerStoreDialogFragment) {
        this.A00 = stickerStoreDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        StickerStoreDialogFragment stickerStoreDialogFragment = this.A00;
        if (i != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
            return false;
        }
        stickerStoreDialogFragment.A0w(false, false);
        return true;
    }
}
