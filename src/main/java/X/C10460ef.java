package X;

import android.view.View;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.0ef  reason: invalid class name and case insensitive filesystem */
public class C10460ef extends AnonymousClass0JW {
    public final int A00;
    public final int A01;
    public final AnonymousClass009 A02 = AnonymousClass009.A00();
    public final C000300f A03 = C000300f.A00();
    public final AnonymousClass00G A04 = AnonymousClass00G.A01;
    public final AnonymousClass03S A05 = AnonymousClass03S.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final AnonymousClass0XO A07 = AnonymousClass0XO.A00();
    public final C007703s A08 = C007703s.A00();
    public final WeakReference A09;

    public C10460ef(GalleryPickerFragment galleryPickerFragment, int i, int i2) {
        this.A09 = new WeakReference(galleryPickerFragment);
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A09.get();
        if (galleryPickerFragment != null) {
            for (List list : listArr) {
                if (galleryPickerFragment.A0A() != null) {
                    C53982eA r1 = galleryPickerFragment.A0A;
                    r1.A00.addAll(list);
                    ((AbstractC16300pa) r1).A01.A00();
                    if (galleryPickerFragment.A0A.A05() == 0) {
                        galleryPickerFragment.A0n();
                    } else {
                        View view = galleryPickerFragment.A07;
                        if (view != null) {
                            view.setVisibility(8);
                        }
                    }
                }
            }
        }
    }

    public final AbstractC48892Oe A04(int i, String str) {
        AnonymousClass00G r1 = this.A04;
        AnonymousClass009 r2 = this.A02;
        C000300f r3 = this.A03;
        AnonymousClass0XO r4 = this.A07;
        AnonymousClass03S r5 = this.A05;
        C007703s r6 = this.A08;
        AnonymousClass2PA r7 = new AnonymousClass2PA();
        r7.A01 = 2;
        r7.A00 = i;
        r7.A02 = 2;
        r7.A03 = str;
        return AnonymousClass2PB.A00(r1, r2, r3, r4, r5, r6, r7);
    }
}
