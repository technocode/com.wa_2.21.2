package X;

import android.graphics.Point;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.0eh  reason: invalid class name and case insensitive filesystem */
public class C10480eh extends AnonymousClass0JW {
    public final AbstractC48952Ok A00;
    public final WeakReference A01;
    public final boolean A02;

    public C10480eh(MediaGalleryFragmentBase mediaGalleryFragmentBase, AbstractC48952Ok r3, boolean z) {
        this.A01 = new WeakReference(mediaGalleryFragmentBase);
        this.A00 = r3;
        this.A02 = z;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AbstractC48892Oe r8 = (AbstractC48892Oe) obj;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A01.get();
        if (mediaGalleryFragmentBase != null) {
            boolean z = this.A02;
            ActivityC004902h A0A = mediaGalleryFragmentBase.A0A();
            if (A0A != null) {
                mediaGalleryFragmentBase.A08 = r8;
                r8.registerContentObserver(mediaGalleryFragmentBase.A0G);
                mediaGalleryFragmentBase.A0p();
                Point point = new Point();
                A0A.getWindowManager().getDefaultDisplay().getSize(point);
                int i = mediaGalleryFragmentBase.A02;
                boolean z2 = true;
                if (!(i == 0 || i == 1)) {
                    z2 = false;
                }
                if (z2) {
                    int i2 = point.y;
                    int i3 = point.x;
                    int dimensionPixelSize = mediaGalleryFragmentBase.A02().getDimensionPixelSize(R.dimen.gallery_picker_item_thumb_size);
                    int i4 = ((i2 * i3) / (dimensionPixelSize * dimensionPixelSize)) + 1;
                    AbstractC48952Ok A0n = mediaGalleryFragmentBase.A0n();
                    if (A0n != null) {
                        C10470eg r2 = new C10470eg(mediaGalleryFragmentBase, A0n, i4, z);
                        mediaGalleryFragmentBase.A0B = r2;
                        mediaGalleryFragmentBase.A0M.ANC(r2, new Void[0]);
                    }
                } else {
                    mediaGalleryFragmentBase.A00 = r8.getCount();
                    mediaGalleryFragmentBase.A06.A01.A00();
                    mediaGalleryFragmentBase.A0u(false);
                }
                mediaGalleryFragmentBase.A0r();
            }
        }
    }
}
