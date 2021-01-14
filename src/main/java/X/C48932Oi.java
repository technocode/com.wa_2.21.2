package X;

import android.database.ContentObserver;
import android.os.Handler;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2Oi  reason: invalid class name and case insensitive filesystem */
public class C48932Oi extends ContentObserver {
    public final /* synthetic */ MediaGalleryFragmentBase A00;

    public boolean deliverSelfNotifications() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48932Oi(MediaGalleryFragmentBase mediaGalleryFragmentBase, Handler handler) {
        super(handler);
        this.A00 = mediaGalleryFragmentBase;
    }

    public void onChange(boolean z) {
        AnonymousClass008.A1H("mediagalleryfragmentbase/onchange ", z);
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00;
        AbstractC48892Oe r0 = mediaGalleryFragmentBase.A08;
        if (r0 != null) {
            if (!z) {
                r0.AMq();
                mediaGalleryFragmentBase.A0r();
            }
            mediaGalleryFragmentBase.A00 = mediaGalleryFragmentBase.A08.getCount();
        }
        mediaGalleryFragmentBase.A06.A01.A00();
    }
}
