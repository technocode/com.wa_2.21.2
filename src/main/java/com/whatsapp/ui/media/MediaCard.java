package com.whatsapp.ui.media;

import X.AbstractC665434t;
import X.AbstractC665634v;
import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import X.C004302a;
import X.C06470Tj;
import X.C07990aH;
import X.C60662pu;
import X.C665334s;
import X.ViewTreeObserver$OnGlobalLayoutListenerC665234r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape9S0100000_I1_7;
import com.google.android.search.verification.client.R;
import com.whatsapp.InfoCard;
import com.whatsapp.components.button.ThumbnailButton;
import java.util.Iterator;
import java.util.List;

public class MediaCard extends InfoCard {
    public View A00;
    public HorizontalScrollView A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public AbstractC665434t A0B;
    public final AnonymousClass01X A0C = AnonymousClass01X.A00();

    /* JADX INFO: finally extract failed */
    public MediaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.media_card, (ViewGroup) this, true);
        this.A0A = (TextView) findViewById(R.id.media_card_title);
        this.A08 = (TextView) findViewById(R.id.media_card_empty_title);
        this.A09 = (TextView) findViewById(R.id.media_card_info);
        this.A07 = (TextView) findViewById(R.id.media_card_empty_info);
        this.A04 = (LinearLayout) findViewById(R.id.media_card_thumbs);
        this.A00 = findViewById(R.id.title_container);
        this.A01 = (HorizontalScrollView) findViewById(R.id.media_card_scroller);
        this.A06 = (TextView) findViewById(R.id.media_card_error);
        this.A05 = (RelativeLayout) findViewById(R.id.media_card_thumb_container);
        this.A03 = (LinearLayout) findViewById(R.id.media_card_empty);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C07990aH.A1O, 0, 0);
            try {
                String A0B2 = this.A0C.A0B(1, obtainStyledAttributes);
                String A0B3 = this.A0C.A0B(0, obtainStyledAttributes);
                obtainStyledAttributes.recycle();
                this.A0A.setText(A0B2);
                AnonymousClass0Q7.A0N(this.A0A);
                this.A08.setText(A0B2);
                setMediaInfo(A0B3);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public void A01(int i, View.OnClickListener onClickListener) {
        for (int i2 = 0; i2 < i; i2++) {
            int thumbnailPixelSize = getThumbnailPixelSize();
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_padding);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
            layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            ThumbnailButton thumbnailButton = new ThumbnailButton(getContext());
            thumbnailButton.setBackgroundColor(getResources().getColor(R.color.light_gray));
            thumbnailButton.setLayoutParams(layoutParams);
            if (onClickListener != null) {
                thumbnailButton.setOnClickListener(onClickListener);
            }
            this.A04.addView(thumbnailButton);
        }
    }

    public void A02(List list, int i) {
        if (list.size() == 0) {
            this.A03.setVisibility(0);
            this.A00.setVisibility(8);
            this.A05.setVisibility(8);
            this.A06.setVisibility(8);
            return;
        }
        this.A03.setVisibility(8);
        this.A00.setVisibility(0);
        this.A05.setVisibility(0);
        this.A06.setVisibility(8);
        int thumbnailPixelSize = getThumbnailPixelSize();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_padding);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(thumbnailPixelSize, thumbnailPixelSize);
        layoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        this.A04.removeAllViews();
        if (this.A02 == null) {
            ImageView imageView = new ImageView(getContext());
            this.A02 = imageView;
            imageView.setBackgroundResource(R.drawable.selector_orange_gradient);
            this.A02.setLayoutParams(layoutParams);
            ImageView imageView2 = this.A02;
            AnonymousClass01X r2 = this.A0C;
            imageView2.setImageDrawable(new C06470Tj(r2, C004302a.A03(getContext(), R.drawable.group_info_chevron_right)));
            this.A02.setContentDescription(r2.A06(R.string.more));
            this.A02.setScaleType(ImageView.ScaleType.CENTER);
            if (this.A0B != null) {
                this.A02.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(this, 10));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C665334s r5 = (C665334s) it.next();
            C60662pu r22 = new C60662pu(getContext());
            r22.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r22.setLayoutParams(layoutParams);
            r22.A00 = (float) (thumbnailPixelSize / 6);
            r22.A03 = 5;
            AnonymousClass0Q7.A0g(r22, r5.A05);
            String str = r5.A04;
            if (str != null) {
                r22.A09 = str;
            }
            String str2 = r5.A03;
            if (str2 != null) {
                r22.setContentDescription(str2);
            }
            Drawable drawable = r5.A00;
            if (drawable != null) {
                r22.A07 = drawable;
            }
            if (r5.A01 != null) {
                r22.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r5, 8));
            }
            AbstractC665634v r0 = r5.A02;
            if (r0 != null) {
                r0.AFy(r22, thumbnailPixelSize);
            }
            this.A04.addView(r22);
        }
        AnonymousClass01X r1 = this.A0C;
        AnonymousClass0SE.A0B(r1, this.A04);
        if (r1.A02().A06) {
            this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC665234r(this));
        }
        if (list.size() >= i) {
            this.A04.addView(this.A02);
        }
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.medium_thumbnail_size);
    }

    public void setError(String str) {
        this.A04.setVisibility(8);
        this.A06.setText(str);
        this.A06.setVisibility(0);
    }

    public void setLeftPadding(int i) {
        View view = this.A00;
        view.setPadding(i, view.getPaddingTop(), this.A00.getPaddingRight(), this.A00.getPaddingBottom());
        LinearLayout linearLayout = this.A04;
        linearLayout.setPadding(i, linearLayout.getPaddingTop(), this.A04.getPaddingRight(), this.A04.getPaddingBottom());
        TextView textView = this.A06;
        textView.setPadding(i, textView.getPaddingTop(), this.A06.getPaddingRight(), this.A06.getPaddingBottom());
    }

    public void setMediaInfo(String str) {
        this.A09.setText(str);
        this.A07.setText(str);
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass01X r1 = this.A0C;
            AnonymousClass0SE.A0C(r1, this.A09);
            AnonymousClass0SE.A0C(r1, this.A07);
        }
    }

    public void setSeeMoreClickListener(AbstractC665434t r4) {
        this.A0B = r4;
        ImageView imageView = this.A02;
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r4, 9));
        }
        this.A0A.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r4, 13));
        this.A09.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r4, 14));
        this.A08.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r4, 11));
        this.A07.setOnClickListener(new ViewOnClickEBaseShape9S0100000_I1_7(r4, 12));
    }

    public void setTitle(String str) {
        this.A0A.setText(str);
        this.A08.setText(str);
    }

    public void setTitleTextColor(int i) {
        this.A0A.setTextColor(i);
    }

    public void setTopShadowVisibility(int i) {
        int i2;
        int paddingLeft = getPaddingLeft();
        if (i == 0) {
            i2 = getContext().getResources().getDimensionPixelSize(R.dimen.info_screen_card_spacing);
        } else {
            i2 = 0;
        }
        setPadding(paddingLeft, i2, getPaddingRight(), getPaddingBottom());
    }
}
