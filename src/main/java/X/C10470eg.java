package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0eg  reason: invalid class name and case insensitive filesystem */
public class C10470eg extends AnonymousClass0JW {
    public int A00;
    public int A01;
    public final int A02;
    public final AnonymousClass02M A03 = AnonymousClass02M.A00();
    public final AnonymousClass01X A04;
    public final AbstractC48952Ok A05;
    public final C08650bU A06;
    public final WeakReference A07;
    public final boolean A08;

    public C10470eg(MediaGalleryFragmentBase mediaGalleryFragmentBase, AbstractC48952Ok r4, int i, boolean z) {
        AnonymousClass01X A002 = AnonymousClass01X.A00();
        this.A04 = A002;
        this.A06 = new C08650bU(A002);
        this.A07 = new WeakReference(mediaGalleryFragmentBase);
        this.A05 = r4;
        this.A02 = i;
        this.A08 = z;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Log.d("mediagalleryfragmentbase/load sections task finished");
        MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A07.get();
        if (mediaGalleryFragmentBase != null) {
            mediaGalleryFragmentBase.A0u(false);
        }
    }
}
