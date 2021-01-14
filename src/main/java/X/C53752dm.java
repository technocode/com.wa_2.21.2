package X;

import android.text.TextUtils;
import com.whatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2dm  reason: invalid class name and case insensitive filesystem */
public class C53752dm implements AnonymousClass0YR {
    public final /* synthetic */ MediaGalleryActivity A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C53752dm(MediaGalleryActivity mediaGalleryActivity) {
        this.A00 = mediaGalleryActivity;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        MediaGalleryActivity mediaGalleryActivity = this.A00;
        if (TextUtils.equals(mediaGalleryActivity.A0B, str)) {
            return false;
        }
        mediaGalleryActivity.A0B = str;
        mediaGalleryActivity.A0C = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) mediaGalleryActivity).A01);
        AbstractC48922Oh A04 = MediaGalleryActivity.A04(mediaGalleryActivity);
        if (A04 == null) {
            return false;
        }
        C08680bX r1 = mediaGalleryActivity.A09;
        r1.A04(mediaGalleryActivity.A0C);
        r1.A09 = str;
        r1.A03 = null;
        A04.AJp(r1);
        return false;
    }
}
