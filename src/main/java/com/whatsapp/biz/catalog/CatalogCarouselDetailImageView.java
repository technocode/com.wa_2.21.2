package com.whatsapp.biz.catalog;

import X.AnonymousClass00T;
import X.AnonymousClass1PN;
import X.AnonymousClass1S0;
import X.AnonymousClass1S7;
import X.C002101e;
import X.C27831Rq;
import X.C42221wL;
import X.C48052Ks;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.jid.UserJid;

public class CatalogCarouselDetailImageView extends FrameLayout {
    public RecyclerView A00;
    public CarouselScrollbarView A01;
    public C42221wL A02;
    public AnonymousClass1S0 A03;
    public C48052Ks A04;
    public UserJid A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass1PN A08 = AnonymousClass1PN.A00();
    public final C27831Rq A09 = C27831Rq.A00();
    public final AnonymousClass00T A0A = C002101e.A00();

    public CatalogCarouselDetailImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static void A00(CatalogCarouselDetailImageView catalogCarouselDetailImageView, AnonymousClass1S7 r3, boolean z, ThumbnailButton thumbnailButton, Bitmap bitmap, View view) {
        if (catalogCarouselDetailImageView != null) {
            int[] iArr = {r3.A01, r3.A00};
            if (z) {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, iArr));
            } else {
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr));
            }
            thumbnailButton.setImageBitmap(bitmap);
            return;
        }
        throw null;
    }
}
