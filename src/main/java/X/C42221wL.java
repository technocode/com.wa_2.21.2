package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1wL  reason: invalid class name and case insensitive filesystem */
public class C42221wL extends AbstractC16300pa {
    public final Map A00 = new HashMap();
    public final /* synthetic */ CatalogCarouselDetailImageView A01;

    public C42221wL(CatalogCarouselDetailImageView catalogCarouselDetailImageView) {
        this.A01 = catalogCarouselDetailImageView;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A01.A04.A0A.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A01;
        return new C42231wM(catalogCarouselDetailImageView, LayoutInflater.from(catalogCarouselDetailImageView.getContext()).inflate(R.layout.product_catalog_detail_image, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r18, int i) {
        C42231wM r4 = (C42231wM) r18;
        Map map = this.A00;
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = r4.A02;
        if (!catalogCarouselDetailImageView.A04.A0A.isEmpty()) {
            C48052Ks r1 = catalogCarouselDetailImageView.A04;
            if (!r1.A00()) {
                boolean z = false;
                if (r1.A0A.size() > 1) {
                    z = true;
                }
                if (catalogCarouselDetailImageView.A04.A0A.get(i) != null) {
                    C48072Ku r12 = (C48072Ku) catalogCarouselDetailImageView.A04.A0A.get(i);
                    int i2 = r12.A01;
                    int i3 = r12.A00;
                    if (!(i2 == 0 || i3 == 0)) {
                        r4.A0C(i2, i3, z);
                    }
                    String A012 = AnonymousClass1S6.A01(catalogCarouselDetailImageView.A04.A06, i);
                    if (!A012.equals(r4.A01.getTag())) {
                        r4.A01.setImageResource(R.color.light_gray);
                    }
                    r4.A01.setTag(A012);
                    catalogCarouselDetailImageView.A03.A01(r12, 1, new C42021w1(r4, i, map, A012, z, i2, i3), null, r4.A01);
                } else {
                    r4.A01.setImageResource(R.color.light_gray);
                }
                if (catalogCarouselDetailImageView.A06) {
                    ThumbnailButton thumbnailButton = r4.A01;
                    if (!z) {
                        thumbnailButton.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(r4, i, 0));
                        return;
                    } else {
                        thumbnailButton.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(r4, i, 1));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        ThumbnailButton thumbnailButton2 = r4.A01;
        thumbnailButton2.setBackgroundResource(R.color.light_gray);
        thumbnailButton2.setImageResource(R.drawable.ic_product_image_loading);
        thumbnailButton2.setScaleType(ImageView.ScaleType.CENTER);
    }
}
