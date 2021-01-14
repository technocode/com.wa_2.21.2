package com.whatsapp.biz.catalog;

import X.AbstractC03690Hg;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0HL;
import X.AnonymousClass1S0;
import X.AnonymousClass1S3;
import X.AnonymousClass1S6;
import X.AnonymousClass2D8;
import X.AnonymousClass3Ot;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C017009c;
import X.C02780Dk;
import X.C27831Rq;
import X.C27881Ry;
import X.C28231Tk;
import X.C42111wA;
import X.C42121wB;
import X.C42141wD;
import X.C42351wZ;
import X.C42391wd;
import X.C48052Ks;
import X.C665334s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.biz.product.view.activity.ProductDetailActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.ArrayList;
import java.util.List;

public class CatalogMediaCard extends FrameLayout {
    public int A00;
    public AnonymousClass1S0 A01;
    public C28231Tk A02;
    public UserJid A03;
    public MediaCard A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public final C02780Dk A08 = C02780Dk.A02();
    public final AnonymousClass02M A09 = AnonymousClass02M.A00();
    public final AnonymousClass01I A0A = AnonymousClass01I.A00();
    public final C017009c A0B = C017009c.A00();
    public final C27831Rq A0C = C27831Rq.A00();
    public final AnonymousClass0HL A0D = AnonymousClass0HL.A00();
    public final C27881Ry A0E = C27881Ry.A00();
    public final AnonymousClass1S3 A0F = AnonymousClass1S3.A00();
    public final AbstractC03690Hg A0G = new C42351wZ(this);
    public final C42391wd A0H = C42391wd.A00;
    public final AnonymousClass01X A0I = AnonymousClass01X.A00();
    public final AnonymousClass3Ot A0J = AnonymousClass3Ot.A00();
    public final AnonymousClass00T A0K = C002101e.A00();

    public CatalogMediaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        MediaCard mediaCard = (MediaCard) LayoutInflater.from(getContext()).inflate(R.layout.business_product_catalog_card, (ViewGroup) this, true).findViewById(R.id.product_catalog_media_card_view);
        this.A04 = mediaCard;
        mediaCard.setTopShadowVisibility(0);
        this.A04.setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.A01 = new AnonymousClass1S0(this.A0E);
        this.A04.A01(5, null);
        this.A0H.A01(this.A0G);
    }

    public final void A00() {
        if (C002001d.A0O(getContext()) instanceof ProductDetailActivity) {
            AnonymousClass2D8 r2 = (AnonymousClass2D8) getContext();
            r2.A0F = true;
            CatalogMediaCard catalogMediaCard = r2.A09;
            if (catalogMediaCard != null) {
                catalogMediaCard.setVisibility(8);
            }
            EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = r2.A0A;
            if (ellipsizedTextEmojiLabel != null) {
                ellipsizedTextEmojiLabel.A00 = Integer.MAX_VALUE;
            }
        }
    }

    public void A01(UserJid userJid) {
        int i;
        ArrayList arrayList = new ArrayList();
        AnonymousClass0HL r5 = this.A0D;
        synchronized (r5) {
            List<C48052Ks> A042 = r5.A04(userJid);
            i = 7;
            if (A042 != null) {
                for (C48052Ks r0 : A042) {
                    i = (i * 31) + r0.hashCode();
                }
            }
        }
        if (i != this.A00) {
            this.A00 = i;
            if (!r5.A06(userJid)) {
                C28231Tk r1 = this.A02;
                if (r1 != null && r1.A09) {
                    r1.A09 = false;
                    this.A0K.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 38));
                }
                Log.w("CatalogMediaCard/onFetchCatalogSuccess/Error: no products");
                if (!this.A06) {
                    this.A04.setError(this.A0I.A06(R.string.catalog_error_no_products));
                }
                A00();
            } else {
                C28231Tk r12 = this.A02;
                if (r12 != null && !r12.A09) {
                    r12.A09 = true;
                    this.A0K.ANF(new RunnableEBaseShape7S0100000_I1_2(this, 37));
                }
                String A062 = this.A0I.A06(R.string.business_product_catalog_image_description);
                List A043 = r5.A04(userJid);
                int i2 = 0;
                for (int i3 = 0; i3 < A043.size() && i2 < 6; i3++) {
                    long j = (long) i3;
                    C48052Ks r11 = (C48052Ks) A043.get(i3);
                    if (AnonymousClass1S6.A03(r11) && !r11.A06.equals(this.A05)) {
                        i2++;
                        arrayList.add(new C665334s(null, null, A062, AnonymousClass008.A0K("thumb-transition-", AnonymousClass1S6.A01(r11.A06, 0)), new C42111wA(this, r11, userJid, A043, j), new C42121wB(this, r11)));
                    }
                }
                if (i2 == 0) {
                    A00();
                }
                this.A04.A02(arrayList, 5);
            }
            C28231Tk r02 = this.A02;
            if (r02 != null && (r02.A09 || r5.A06(userJid))) {
                setVisibility(0);
            } else if (!this.A06) {
                setVisibility(8);
            } else {
                MediaCard mediaCard = this.A04;
                ViewOnClickCListenerShape11S0100000_I1_0 viewOnClickCListenerShape11S0100000_I1_0 = new ViewOnClickCListenerShape11S0100000_I1_0(this, 32);
                mediaCard.A04.removeAllViews();
                mediaCard.A01(4, viewOnClickCListenerShape11S0100000_I1_0);
            }
            if (!this.A07) {
                this.A07 = true;
                this.A0C.A02(1, 20, null, userJid);
            }
        }
    }

    public void setup(UserJid userJid, boolean z, String str, boolean z2, C28231Tk r9) {
        boolean z3;
        this.A03 = userJid;
        this.A05 = str;
        this.A06 = z2;
        if (str != null) {
            this.A04.setTitle(this.A0I.A06(R.string.carousel_from_product_message_title));
            this.A04.setTitleTextColor(C004302a.A00(getContext(), R.color.catalog_detail_description_color));
            this.A04.setLeftPadding(getContext().getResources().getDimensionPixelSize(R.dimen.product_detail_container_padding_horizontal));
        }
        this.A02 = r9;
        if (z) {
            AnonymousClass0HL r2 = this.A0D;
            synchronized (r2) {
                z3 = false;
                if (r2.A00.get(userJid) != null) {
                    z3 = true;
                }
            }
            if (z3) {
                A01(userJid);
                this.A04.setSeeMoreClickListener(new C42141wD(this, z2, userJid));
            }
        }
        int thumbnailPixelSize = this.A04.getThumbnailPixelSize();
        this.A0E.A01 = thumbnailPixelSize;
        C28231Tk r0 = this.A02;
        if (r0 == null || !r0.A09) {
            if (!z2) {
                setVisibility(8);
            } else {
                this.A04.setMediaInfo(getContext().getString(R.string.business_product_catalog_create));
            }
        }
        this.A0F.A03(userJid, thumbnailPixelSize);
        this.A04.setSeeMoreClickListener(new C42141wD(this, z2, userJid));
    }
}
