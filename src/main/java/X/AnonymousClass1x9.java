package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.InfoCard;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1x9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1x9 implements AnonymousClass0SG {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ InfoCard A01;
    public final /* synthetic */ ProductDetailActivity A02;

    public /* synthetic */ AnonymousClass1x9(ProductDetailActivity productDetailActivity, Bundle bundle, InfoCard infoCard) {
        this.A02 = productDetailActivity;
        this.A00 = bundle;
        this.A01 = infoCard;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        ProductDetailActivity productDetailActivity = this.A02;
        Bundle bundle = this.A00;
        InfoCard infoCard = this.A01;
        C28231Tk r11 = (C28231Tk) obj;
        C42791xI r6 = productDetailActivity.A03;
        if (!r6.A00 && (r11 == null || (r6.A07.A0D(AbstractC000400g.A0c) && !r11.A08))) {
            C42651x3 r1 = r6.A08;
            r1.A05.A00(r1);
            r6.A00 = true;
        }
        CatalogMediaCard catalogMediaCard = ((AnonymousClass2D8) productDetailActivity).A09;
        if (catalogMediaCard != null) {
            int i = ((AnonymousClass2D8) productDetailActivity).A01;
            if ((i == 1 || i == 5 || i == 6 || i == 7) && !((AnonymousClass2D8) productDetailActivity).A0F) {
                catalogMediaCard.setVisibility(0);
                CatalogMediaCard catalogMediaCard2 = ((AnonymousClass2D8) productDetailActivity).A09;
                UserJid userJid = ((AnonymousClass2D8) productDetailActivity).A0C;
                boolean z = false;
                if (bundle != null) {
                    z = true;
                }
                catalogMediaCard2.setup(userJid, z, ((AnonymousClass2D8) productDetailActivity).A0D, false, r11);
                View findViewById = productDetailActivity.findViewById(R.id.layout_frame);
                View findViewById2 = productDetailActivity.findViewById(R.id.product_detail_container);
                int A002 = C004302a.A00(productDetailActivity, R.color.chat_info_activity);
                findViewById.setBackgroundColor(A002);
                productDetailActivity.findViewById(R.id.divider).setVisibility(0);
                ((AnonymousClass2D8) productDetailActivity).A09.setBackgroundColor(A002);
                findViewById2.setBackgroundColor(A002);
                findViewById2.setPadding(findViewById2.getPaddingLeft(), findViewById2.getPaddingTop(), findViewById2.getPaddingRight(), productDetailActivity.getResources().getDimensionPixelOffset(R.dimen.info_screen_card_spacing));
            } else {
                catalogMediaCard.setVisibility(8);
            }
        }
        if (infoCard != null && !productDetailActivity.A05.A09(((AnonymousClass2D8) productDetailActivity).A0C)) {
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) productDetailActivity.findViewById(R.id.contact_details);
            if (r11 != null && textEmojiLabel != null) {
                if (TextUtils.isEmpty(r11.A03)) {
                    textEmojiLabel.setVisibility(8);
                    return;
                }
                textEmojiLabel.A02(r11.A03);
                textEmojiLabel.setVisibility(0);
            }
        }
    }
}
