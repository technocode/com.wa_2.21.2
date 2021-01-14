package com.whatsapp.biz;

import X.AnonymousClass01X;
import X.C002001d;
import X.C004302a;
import X.C02590Cr;
import X.C07990aH;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.EllipsizedTextEmojiLabel;

public class BusinessProfileFieldView extends LinearLayout {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Drawable A03;
    public ImageView A04;
    public TextView A05;
    public TextView A06;
    public String A07;
    public boolean A08;
    public final AnonymousClass01X A09 = AnonymousClass01X.A00();
    public final C02590Cr A0A = C02590Cr.A00();

    public BusinessProfileFieldView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextUtils.TruncateAt truncateAt;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C07990aH.A0R, 0, 0);
            try {
                this.A03 = obtainStyledAttributes.getDrawable(2);
                this.A00 = obtainStyledAttributes.getInteger(0, 0);
                this.A08 = obtainStyledAttributes.getBoolean(3, false);
                ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(4);
                this.A01 = colorStateList;
                if (colorStateList == null) {
                    this.A01 = new ColorStateList(new int[][]{new int[0]}, new int[]{C004302a.A00(getContext(), R.color.primary_text)});
                }
                ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(5);
                this.A02 = colorStateList2;
                if (colorStateList2 == null) {
                    this.A02 = this.A01;
                }
                this.A07 = this.A09.A0B(1, obtainStyledAttributes);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.business_profile_field_layout, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.field_icon);
        this.A04 = imageView;
        if (this.A03 != null) {
            imageView.setVisibility(0);
            this.A04.setImageDrawable(this.A03);
        }
        this.A06 = (TextView) inflate.findViewById(R.id.field_textview);
        this.A05 = (TextView) inflate.findViewById(R.id.sub_field_textview);
        this.A06.setSingleLine(this.A08);
        this.A05.setSingleLine(this.A08);
        int i = this.A00;
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            truncateAt = TextUtils.TruncateAt.END;
        } else if (i != 4) {
            truncateAt = null;
        } else {
            truncateAt = TextUtils.TruncateAt.MARQUEE;
        }
        this.A06.setEllipsize(truncateAt);
        this.A05.setEllipsize(truncateAt);
        TextView textView = this.A06;
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = (EllipsizedTextEmojiLabel) textView;
        ellipsizedTextEmojiLabel.A00 = 180;
        ellipsizedTextEmojiLabel.A02 = R.color.primary_light;
        EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel2 = (EllipsizedTextEmojiLabel) this.A05;
        ellipsizedTextEmojiLabel2.A00 = 180;
        ellipsizedTextEmojiLabel2.A02 = R.color.primary_light;
        textView.setTextColor(this.A01);
    }

    public int getLayoutRes() {
        return R.layout.business_profile_field_layout;
    }

    public TextView getSubTextView() {
        return this.A05;
    }

    public String getText() {
        TextView textView = this.A06;
        if (textView != null) {
            return textView.getText().toString();
        }
        return null;
    }

    public TextView getTextView() {
        return this.A06;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A06.setEnabled(z);
        this.A05.setEnabled(z);
    }

    public void setIcon(int i) {
        this.A04.setVisibility(0);
        this.A04.setImageDrawable(C004302a.A03(getContext(), i));
    }

    public void setInputType(int i) {
        TextView textView = this.A06;
        if (textView != null) {
            textView.setInputType(i);
        }
    }

    public void setSubText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.A05.setText("");
            this.A05.setVisibility(8);
            return;
        }
        ((TextEmojiLabel) this.A05).A02(C002001d.A1H(charSequence, getContext(), this.A06.getPaint(), this.A0A));
        this.A05.setVisibility(0);
    }

    public void setText(CharSequence charSequence, View.OnClickListener onClickListener) {
        if (!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(this.A07)) {
            this.A06.setTextColor(this.A01);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = this.A07;
                this.A06.setTextColor(this.A02);
            }
            TextView textView = this.A06;
            ((EllipsizedTextEmojiLabel) textView).A03 = onClickListener;
            ((TextEmojiLabel) textView).A02(C002001d.A1H(charSequence, getContext(), this.A06.getPaint(), this.A0A));
            setVisibility(0);
            return;
        }
        this.A06.setText("");
        setVisibility(8);
    }

    public void setTextColor(int i) {
        this.A06.setTextColor(i);
        this.A01 = new ColorStateList(new int[][]{new int[0]}, new int[]{i});
    }
}
