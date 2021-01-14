package com.whatsapp.profile;

import X.AnonymousClass01X;
import X.C002001d;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public class ProfileSettingsRowIconText extends LinearLayout {
    public TextEmojiLabel A00;
    public WaImageView A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public ProfileSettingsRowIconText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(8388627);
        LayoutInflater.from(context).inflate(R.layout.profile_settings_row_icon_text_description, (ViewGroup) this, true);
        this.A01 = (WaImageView) findViewById(R.id.profile_settings_row_icon);
        this.A02 = (WaImageView) findViewById(R.id.profile_settings_row_icon_placeholder);
        this.A03 = (WaImageView) findViewById(R.id.profile_settings_row_secondary_icon);
        this.A05 = (WaTextView) findViewById(R.id.profile_settings_row_text);
        this.A00 = (TextEmojiLabel) findViewById(R.id.profile_settings_row_subtext);
        this.A04 = (WaTextView) findViewById(R.id.profile_settings_row_description);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A1j);
        try {
            setPrimaryIcon(obtainStyledAttributes.getDrawable(1));
            int color = obtainStyledAttributes.getColor(2, -1);
            if (color != -1) {
                C002001d.A2m(this.A01, color);
            }
            setSecondaryIcon(obtainStyledAttributes.getDrawable(3));
            int color2 = obtainStyledAttributes.getColor(4, -1);
            if (color2 != -1) {
                C002001d.A2m(this.A03, color2);
            }
            setText(this.A06.A0B(6, obtainStyledAttributes));
            setSubText(this.A06.A0B(5, obtainStyledAttributes));
            setDescription(this.A06.A0B(0, obtainStyledAttributes));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void A00() {
        if (this.A01.getVisibility() == 0 && this.A04.getVisibility() == 0) {
            this.A02.setVisibility(4);
        } else {
            this.A02.setVisibility(8);
        }
    }

    public void setDescription(CharSequence charSequence) {
        WaTextView waTextView = this.A04;
        if (charSequence == null) {
            waTextView.setVisibility(8);
        } else {
            waTextView.setVisibility(0);
        }
        A00();
        this.A04.setText(charSequence);
    }

    public void setPrimaryIcon(Drawable drawable) {
        WaImageView waImageView = this.A01;
        if (drawable == null) {
            waImageView.setVisibility(8);
        } else {
            waImageView.setVisibility(0);
        }
        A00();
        this.A01.setImageDrawable(drawable);
        this.A02.setImageDrawable(drawable);
    }

    public void setSecondaryIcon(Drawable drawable) {
        WaImageView waImageView = this.A03;
        if (drawable == null) {
            waImageView.setVisibility(8);
        } else {
            waImageView.setVisibility(0);
        }
        this.A03.setImageDrawable(drawable);
    }

    public void setSubText(CharSequence charSequence) {
        TextEmojiLabel textEmojiLabel = this.A00;
        if (charSequence == null) {
            textEmojiLabel.setVisibility(8);
        } else {
            textEmojiLabel.setVisibility(0);
        }
        this.A00.A04(charSequence, null, false, 0);
    }

    public void setText(CharSequence charSequence) {
        WaTextView waTextView = this.A05;
        if (charSequence == null) {
            waTextView.setVisibility(8);
        } else {
            waTextView.setVisibility(0);
        }
        this.A05.setText(charSequence);
    }
}
