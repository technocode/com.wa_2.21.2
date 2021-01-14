package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import java.util.Map;

/* renamed from: X.1w1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42021w1 implements AbstractC27871Rx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C42231wM A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;
    public final /* synthetic */ boolean A06;

    public /* synthetic */ C42021w1(C42231wM r1, int i, Map map, String str, boolean z, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A05 = map;
        this.A04 = str;
        this.A06 = z;
        this.A01 = i2;
        this.A02 = i3;
    }

    @Override // X.AbstractC27871Rx
    public final void AHF(C42301wU r18, Bitmap bitmap, boolean z) {
        C42231wM r3 = this.A03;
        Map map = this.A05;
        String str = this.A04;
        boolean z2 = this.A06;
        int i = this.A01;
        int i2 = this.A02;
        if (r3.A01.getTag().equals(str)) {
            if (i == 0 || i2 == 0) {
                i = bitmap.getWidth();
                i2 = bitmap.getHeight();
                r3.A0C(i, i2, z2);
            }
            boolean z3 = false;
            if (i < i2) {
                z3 = true;
            }
            if (i == i2 || (z2 && z3)) {
                r3.A01.setImageBitmap(bitmap);
                return;
            }
            CatalogCarouselDetailImageView catalogCarouselDetailImageView = r3.A02;
            int A002 = C004302a.A00(catalogCarouselDetailImageView.getContext(), R.color.catalog_detail_image_default_background_color);
            AnonymousClass1S7 r12 = (AnonymousClass1S7) map.get(str);
            if (r12 != null) {
                CatalogCarouselDetailImageView.A00(catalogCarouselDetailImageView, r12, z3, r3.A01, bitmap, r3.A00);
            } else {
                catalogCarouselDetailImageView.A0A.ANC(new C11030fb(catalogCarouselDetailImageView, bitmap, r3.A00, r3.A01, A002, map, str), new Void[0]);
            }
        }
    }
}
