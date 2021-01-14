package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.Conversation;
import com.whatsapp.stickers.StickerInfoDialogFragment;
import com.whatsapp.stickers.StickerStorePackPreviewActivity;
import com.whatsapp.util.Log;

/* renamed from: X.32z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC661332z implements DialogInterface.OnClickListener {
    public final /* synthetic */ StickerInfoDialogFragment A00;

    public /* synthetic */ DialogInterface$OnClickListenerC661332z(StickerInfoDialogFragment stickerInfoDialogFragment) {
        this.A00 = stickerInfoDialogFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C29241Xq r1;
        String str;
        StickerInfoDialogFragment stickerInfoDialogFragment = this.A00;
        AnonymousClass33I r2 = stickerInfoDialogFragment.A0B;
        if (r2 != null && (r1 = stickerInfoDialogFragment.A09) != null) {
            if (!r2.A06 || (str = r2.A00) == null) {
                String str2 = r2.A03;
                if (str2 != null) {
                    try {
                        stickerInfoDialogFragment.A0F.A05(stickerInfoDialogFragment.A00(), new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                    } catch (ActivityNotFoundException unused) {
                        Log.e("StickerInfoDialogFragment/onClickListener failed to open playstore link");
                    }
                } else if (r2.A04) {
                    String str3 = r2.A00;
                    Intent intent = new Intent(stickerInfoDialogFragment.A00(), StickerStorePackPreviewActivity.class);
                    intent.putExtra("sticker_pack_id", str3);
                    stickerInfoDialogFragment.A0h(intent);
                } else {
                    stickerInfoDialogFragment.A0x(r2, r1);
                }
            } else if (stickerInfoDialogFragment.A0A() instanceof Conversation) {
                stickerInfoDialogFragment.A0I.A02(str);
            } else {
                Intent intent2 = new Intent(stickerInfoDialogFragment.A00(), StickerStorePackPreviewActivity.class);
                intent2.putExtra("sticker_pack_id", str);
                stickerInfoDialogFragment.A0h(intent2);
            }
        }
    }
}
