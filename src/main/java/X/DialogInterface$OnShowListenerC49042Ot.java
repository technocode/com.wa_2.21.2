package X;

import android.content.DialogInterface;
import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2Ot  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnShowListenerC49042Ot implements DialogInterface.OnShowListener {
    public final /* synthetic */ MediaPreviewActivity A00;

    public /* synthetic */ DialogInterface$OnShowListenerC49042Ot(MediaPreviewActivity mediaPreviewActivity) {
        this.A00 = mediaPreviewActivity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        MediaPreviewActivity mediaPreviewActivity = this.A00;
        mediaPreviewActivity.A0E.setVisibility(8);
        mediaPreviewActivity.A0B.setVisibility(8);
        mediaPreviewActivity.A04.setVisibility(8);
        if (mediaPreviewActivity.A0C.getVisibility() == 0) {
            mediaPreviewActivity.A0C.clearAnimation();
            mediaPreviewActivity.A0C.setVisibility(8);
            mediaPreviewActivity.A0C.setTag(Boolean.TRUE);
            return;
        }
        mediaPreviewActivity.A0C.setTag(Boolean.FALSE);
    }
}
