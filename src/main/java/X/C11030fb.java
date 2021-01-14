package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.biz.catalog.CatalogCarouselDetailImageView;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Map;

/* renamed from: X.0fb  reason: invalid class name and case insensitive filesystem */
public class C11030fb extends AnonymousClass0JW {
    public int A00;
    public Bitmap A01;
    public View A02;
    public ThumbnailButton A03;
    public String A04;
    public Map A05;
    public final /* synthetic */ CatalogCarouselDetailImageView A06;

    public C11030fb(CatalogCarouselDetailImageView catalogCarouselDetailImageView, Bitmap bitmap, View view, ThumbnailButton thumbnailButton, int i, Map map, String str) {
        this.A06 = catalogCarouselDetailImageView;
        this.A02 = view;
        this.A03 = thumbnailButton;
        this.A01 = bitmap;
        this.A00 = i;
        this.A05 = map;
        this.A04 = str;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass1S7 r3 = (AnonymousClass1S7) obj;
        this.A05.put(this.A04, r3);
        CatalogCarouselDetailImageView catalogCarouselDetailImageView = this.A06;
        boolean z = false;
        if (this.A01.getWidth() < this.A01.getHeight()) {
            z = true;
        }
        CatalogCarouselDetailImageView.A00(catalogCarouselDetailImageView, r3, z, this.A03, this.A01, this.A02);
    }
}
