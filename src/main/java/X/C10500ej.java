package X;

import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.0ej  reason: invalid class name and case insensitive filesystem */
public class C10500ej extends AnonymousClass0JW {
    public int A00;
    public C04080Iy A01;
    public final AnonymousClass01X A02;
    public final AnonymousClass01K A03 = AnonymousClass01K.A00();
    public final C08680bX A04;
    public final C014608e A05;
    public final C08650bU A06;
    public final AnonymousClass02N A07;
    public final WeakReference A08;

    public C10500ej(GalleryFragmentBase galleryFragmentBase, AnonymousClass02N r4, C08680bX r5) {
        AnonymousClass01X A002 = AnonymousClass01X.A00();
        this.A02 = A002;
        this.A05 = C014608e.A01;
        this.A06 = new C08650bU(A002);
        this.A08 = new WeakReference(galleryFragmentBase);
        this.A07 = r4;
        this.A04 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A08.get();
        if (galleryFragmentBase != null) {
            for (List list : listArr) {
                StringBuilder sb = new StringBuilder();
                sb.append(galleryFragmentBase.A0F);
                sb.append("/report bucket ");
                sb.append(this.A00);
                sb.append(" ");
                sb.append(list.size());
                Log.i(sb.toString());
                if (this.A00 == 0) {
                    galleryFragmentBase.A0G.clear();
                    ((AbstractC16300pa) galleryFragmentBase.A03).A01.A00();
                }
                this.A00 = list.size() + this.A00;
                galleryFragmentBase.A0G.addAll(list);
                ((AbstractC16300pa) galleryFragmentBase.A03).A01.A00();
            }
        }
    }

    public void A04() {
        super.A00.cancel(true);
        synchronized (this) {
            C04080Iy r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
        }
    }
}
