package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.PushnameEmojiBlacklistDialogFragment;

/* renamed from: X.1Io  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC25851Io implements DialogInterface.OnClickListener {
    public final /* synthetic */ PushnameEmojiBlacklistDialogFragment A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ DialogInterface$OnClickListenerC25851Io(PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment, String str) {
        this.A00 = pushnameEmojiBlacklistDialogFragment;
        this.A01 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.A00.A0h(new Intent("android.intent.action.VIEW", Uri.parse(this.A01)));
    }
}
