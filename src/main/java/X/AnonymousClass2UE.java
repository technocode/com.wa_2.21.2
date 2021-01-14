package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.mediaview.MediaViewFragment;

/* renamed from: X.2UE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2UE implements DialogInterface.OnClickListener {
    public final /* synthetic */ MediaViewFragment A00;

    public /* synthetic */ AnonymousClass2UE(MediaViewFragment mediaViewFragment) {
        this.A00 = mediaViewFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MediaViewFragment mediaViewFragment = this.A00;
        Intent intent = new Intent("android.intent.action.VIEW", mediaViewFragment.A12.A03("android", "about-view-once", null));
        intent.addFlags(268435456);
        mediaViewFragment.A0Y.A05(mediaViewFragment.A01(), intent);
    }
}
