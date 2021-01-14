package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

/* renamed from: X.29w  reason: invalid class name and case insensitive filesystem */
public class C463829w extends AbstractC42331wX {
    public C48052Ks A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final TextView A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final C27831Rq A06;
    public final AnonymousClass1S0 A07;
    public final AbstractC42511wp A08;
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();

    public C463829w(AnonymousClass02M r2, AnonymousClass01I r3, C02780Dk r4, AnonymousClass01A r5, AnonymousClass0HL r6, C27831Rq r7, View view, AnonymousClass1S0 r9, AbstractC42511wp r10) {
        super(r3, r4, r5, view);
        this.A01 = (FrameLayout) view.findViewById(R.id.catalog_item_view);
        this.A02 = (ImageView) view.findViewById(R.id.catalog_list_product_image);
        this.A05 = (TextEmojiLabel) view.findViewById(R.id.catalog_list_product_title);
        this.A03 = (TextView) view.findViewById(R.id.catalog_list_product_price);
        this.A04 = (TextEmojiLabel) view.findViewById(R.id.catalog_list_product_description);
        this.A07 = r9;
        this.A08 = r10;
        this.A06 = r7;
    }
}
