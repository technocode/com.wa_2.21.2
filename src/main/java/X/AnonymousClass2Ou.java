package X;

import android.content.DialogInterface;
import android.net.Uri;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2Ou  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2Ou implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass2P5 A00;
    public final /* synthetic */ MediaPreviewActivity A01;

    public /* synthetic */ AnonymousClass2Ou(MediaPreviewActivity mediaPreviewActivity, AnonymousClass2P5 r2) {
        this.A01 = mediaPreviewActivity;
        this.A00 = r2;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        MediaPreviewActivity mediaPreviewActivity = this.A01;
        AnonymousClass2P5 r3 = this.A00;
        if (mediaPreviewActivity.A0T.size() > 1) {
            mediaPreviewActivity.A0E.setVisibility(0);
        }
        mediaPreviewActivity.A0B.setVisibility(0);
        mediaPreviewActivity.A04.setVisibility(0);
        if (mediaPreviewActivity.A0C.getTag().equals(Boolean.TRUE)) {
            mediaPreviewActivity.A0C.setVisibility(0);
        }
        mediaPreviewActivity.A0g(r3.A04, false);
        Uri A0T = mediaPreviewActivity.A0T();
        if (A0T != null) {
            AnonymousClass2PG A002 = mediaPreviewActivity.A14.A00(A0T);
            A002.A0A(r3.A06);
            A002.A0B(C006803i.A0M(r3.A07));
        } else {
            Log.e("mediapreviewactivity/captionentry/dismiss/current uri is null");
        }
        if (r3.A08) {
            mediaPreviewActivity.A0b();
        }
    }
}
