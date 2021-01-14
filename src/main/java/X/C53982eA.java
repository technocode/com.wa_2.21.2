package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.util.ArrayList;

/* renamed from: X.2eA  reason: invalid class name and case insensitive filesystem */
public class C53982eA extends AbstractC16300pa {
    public final ArrayList A00 = new ArrayList();
    public final /* synthetic */ GalleryPickerFragment A01;

    public C53982eA(GalleryPickerFragment galleryPickerFragment) {
        this.A01 = galleryPickerFragment;
        A04(true);
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A00.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        GalleryPickerFragment galleryPickerFragment = this.A01;
        return new View$OnClickListenerC54012eD(galleryPickerFragment, galleryPickerFragment.A05().inflate(R.layout.gallery_picker_item, (ViewGroup) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    @Override // X.AbstractC16300pa
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AbstractC11910hD r10, int r11) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53982eA.A07(X.0hD, int):void");
    }
}
