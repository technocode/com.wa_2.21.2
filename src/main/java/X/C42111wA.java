package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1wA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42111wA implements AbstractC665534u {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CatalogMediaCard A01;
    public final /* synthetic */ C48052Ks A02;
    public final /* synthetic */ UserJid A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ C42111wA(CatalogMediaCard catalogMediaCard, C48052Ks r2, UserJid userJid, List list, long j) {
        this.A01 = catalogMediaCard;
        this.A02 = r2;
        this.A03 = userJid;
        this.A04 = list;
        this.A00 = j;
    }

    @Override // X.AbstractC665534u
    public final void AEF(C665334s r16, View view) {
        CatalogMediaCard catalogMediaCard = this.A01;
        C48052Ks r4 = this.A02;
        UserJid userJid = this.A03;
        List list = this.A04;
        long j = this.A00;
        if (view.getTag(R.id.loaded_image_url) != null) {
            AnonymousClass0HL r2 = catalogMediaCard.A0D;
            String str = r4.A06;
            if (r2.A02(str) == null) {
                catalogMediaCard.A09.A0C(catalogMediaCard.A0I.A06(R.string.catalog_error_missing_product), 0);
                Log.w("CatalogMediaCard/MediaThumbnailOnClick/product no longer exists");
                return;
            }
            Intent intent = new Intent(catalogMediaCard.getContext(), ProductDetailActivity.class);
            intent.putExtra("is_from_product_detail_screen", C002001d.A0O(catalogMediaCard.getContext()) instanceof ProductDetailActivity);
            boolean A09 = catalogMediaCard.A0A.A09(userJid);
            Integer valueOf = Integer.valueOf(catalogMediaCard.A04.getThumbnailPixelSize());
            Integer valueOf2 = Integer.valueOf(catalogMediaCard.A04.getThumbnailPixelSize());
            Context context = catalogMediaCard.getContext();
            int i = 5;
            if (catalogMediaCard.A05 == null) {
                i = 4;
            }
            AnonymousClass2D8.A04(userJid, str, A09, valueOf, valueOf2, context, intent, i);
            catalogMediaCard.A0C.A02(2, 21, ((C48052Ks) list.get((int) j)).A06, userJid);
        }
    }
}
