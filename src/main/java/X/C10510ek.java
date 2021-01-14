package X;

import com.whatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.0ek  reason: invalid class name and case insensitive filesystem */
public class C10510ek extends AnonymousClass0JW {
    public C04080Iy A00;
    public final C08680bX A01;
    public final AnonymousClass02N A02;
    public final WeakReference A03;

    public C10510ek(GalleryFragmentBase galleryFragmentBase, AnonymousClass02N r3, C08680bX r4) {
        this.A03 = new WeakReference(galleryFragmentBase);
        this.A02 = r3;
        this.A01 = r4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114 A[EDGE_INSN: B:55:0x0114->B:38:0x0114 ?: BREAK  , SYNTHETIC] */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(java.lang.Object r18) {
        /*
        // Method dump skipped, instructions count: 371
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10510ek.A03(java.lang.Object):void");
    }

    public void A04() {
        super.A00.cancel(true);
        synchronized (this) {
            C04080Iy r0 = this.A00;
            if (r0 != null) {
                r0.A01();
            }
        }
    }
}
