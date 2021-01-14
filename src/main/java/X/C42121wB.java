package X;

import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaCard;

/* renamed from: X.1wB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42121wB implements AbstractC665634v {
    public final /* synthetic */ CatalogMediaCard A00;
    public final /* synthetic */ C48052Ks A01;

    public /* synthetic */ C42121wB(CatalogMediaCard catalogMediaCard, C48052Ks r2) {
        this.A00 = catalogMediaCard;
        this.A01 = r2;
    }

    @Override // X.AbstractC665634v
    public final void AFy(C60662pu r9, int i) {
        CatalogMediaCard catalogMediaCard = this.A00;
        C48052Ks r1 = this.A01;
        if (!r1.A00()) {
            r9.setTag(r1.A06);
            catalogMediaCard.A01.A01((C48072Ku) r1.A0A.get(0), 2, new C42131wC(r9), new C42101w9(r9), r9);
            return;
        }
        r9.setBackgroundResource(R.color.light_gray);
        r9.setImageResource(R.drawable.ic_product_image_loading);
        r9.setScaleType(ImageView.ScaleType.CENTER);
    }
}
