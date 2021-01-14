package X;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.CatalogHeader;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import com.whatsapp.util.ViewOnClickCListenerShape2S0300000_I1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.1wX  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC42331wX extends AbstractC11910hD {
    public final C02780Dk A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass01A A02;

    public AbstractC42331wX(AnonymousClass01I r1, C02780Dk r2, AnonymousClass01A r3, View view) {
        super(view);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public void A0C(UserJid userJid, int i) {
        C05910Qz r5;
        String str;
        if (this instanceof C463829w) {
            C463829w r3 = (C463829w) this;
            FrameLayout frameLayout = r3.A01;
            if (i == 0) {
                frameLayout.setPadding(0, (int) r3.A0H.getResources().getDimension(R.dimen.product_catalog_list_thumb_margin_vertical), 0, 0);
            } else {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            C48052Ks r4 = (C48052Ks) r3.A08.A09.get(i);
            C48052Ks r0 = r3.A00;
            if (r0 == null || !r0.equals(r4)) {
                r3.A00 = r4;
                r3.A05.A02(r4.A08);
                String str2 = r4.A03;
                if (!C003701u.A0E(str2)) {
                    TextEmojiLabel textEmojiLabel = r3.A04;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.A04(str2, null, true, 0);
                } else {
                    r3.A04.setVisibility(8);
                }
                BigDecimal bigDecimal = r4.A09;
                if (bigDecimal == null || (r5 = r4.A01) == null) {
                    r3.A03.setVisibility(8);
                } else {
                    TextView textView = r3.A03;
                    textView.setVisibility(0);
                    textView.setText(r5.A03(r3.A09, bigDecimal, true));
                }
                r3.A0H.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I1(r3, userJid, r4, 0));
                ImageView imageView = r3.A02;
                imageView.setBackgroundResource(R.color.light_gray);
                imageView.setImageResource(R.drawable.ic_product_image_loading);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                List list = r4.A0A;
                if (list.isEmpty()) {
                    Log.w("CatalogListAdapterBaseProductViewHolder/bindViewInSection/no-product-images");
                }
                if (!r4.A00() && !list.isEmpty()) {
                    r3.A07.A01((C48072Ku) list.get(0), 2, C42061w5.A00, null, imageView);
                }
            }
        } else if (!(this instanceof AnonymousClass27m)) {
            C463729v r9 = (C463729v) this;
            r9.A0H.setVisibility(0);
            ProgressBar progressBar = r9.A03;
            progressBar.setVisibility(8);
            LinearLayout linearLayout = r9.A02;
            linearLayout.setVisibility(8);
            Button button = r9.A01;
            button.setVisibility(8);
            TextView textView2 = r9.A04;
            textView2.setVisibility(8);
            int i2 = r9.A00;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        progressBar.setVisibility(4);
                        linearLayout.setVisibility(0);
                        textView2.setVisibility(0);
                        textView2.setText(r9.A06.A06(R.string.catalog_error_retrieving_products));
                        return;
                    } else if (i2 != 3) {
                        return;
                    }
                }
                progressBar.setVisibility(4);
                if (!((AbstractC42331wX) r9).A01.A09(userJid)) {
                    linearLayout.setVisibility(0);
                    AnonymousClass0J9 A0C = r9.A07.A02.A0C(userJid);
                    if (A0C == null) {
                        str = null;
                    } else {
                        str = A0C.A08;
                    }
                    C007003k A0A = ((AbstractC42331wX) r9).A02.A0A(userJid);
                    AnonymousClass01X r32 = r9.A06;
                    Object[] objArr = new Object[1];
                    if (C003701u.A0E(str)) {
                        str = r9.A05.A08(A0A, false);
                    }
                    objArr[0] = str;
                    textView2.setText(r32.A0D(R.string.business_product_catalog_end_of_results_title, objArr));
                    button.setText(r32.A06(R.string.business_product_catalog_end_of_results_button));
                    button.setVisibility(0);
                    textView2.setVisibility(0);
                    button.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(A0A));
                    return;
                }
                return;
            }
            progressBar.setVisibility(0);
            linearLayout.setVisibility(4);
        } else {
            AnonymousClass27m r33 = (AnonymousClass27m) this;
            CatalogHeader catalogHeader = r33.A00;
            catalogHeader.setUp(userJid);
            if (!((AbstractC42331wX) r33).A01.A09(userJid)) {
                catalogHeader.setOnTextClickListener(new ViewOnClickCListenerShape4S0200000_I1(r33, userJid, 11));
            }
        }
    }
}
