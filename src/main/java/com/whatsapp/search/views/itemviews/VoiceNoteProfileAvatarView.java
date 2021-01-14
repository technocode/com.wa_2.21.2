package com.whatsapp.search.views.itemviews;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import X.C002001d;
import X.C004302a;
import X.C07990aH;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;

public class VoiceNoteProfileAvatarView extends FrameLayout {
    public ImageView A00;
    public ImageView A01;
    public ImageView A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.voice_note_profile_avatar, this);
        this.A02 = (ImageView) AnonymousClass0Q7.A0D(this, R.id.picture);
        this.A00 = (ImageView) AnonymousClass0Q7.A0D(this, R.id.picture_in_group);
        this.A01 = (ImageView) AnonymousClass0Q7.A0D(this, R.id.mic_overlay);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A2X);
            View A0D = AnonymousClass0Q7.A0D(this, R.id.picture_frame);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, EditorInfoCompat.IME_FLAG_FORCE_ASCII);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            AnonymousClass0SE.A08(this.A03, A0D, dimensionPixelSize, dimensionPixelSize2, A0D.getPaddingRight(), dimensionPixelSize3);
            AnonymousClass0SE.A08(this.A03, this.A02, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4, dimensionPixelSize4);
            if (dimensionPixelSize5 != Integer.MIN_VALUE) {
                ViewGroup.LayoutParams layoutParams = this.A02.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                this.A02.setLayoutParams(layoutParams);
            }
            this.A01.setBackgroundDrawable(drawable);
            AnonymousClass0Q7.A0a(this.A01, colorStateList);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A01.getLayoutParams();
            AnonymousClass0SE.A07(this.A03, this.A01, dimensionPixelSize6, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, dimensionPixelSize7);
        }
    }

    public ImageView getGroupProfileImageView() {
        return this.A00;
    }

    public ImageView getProfileImageView() {
        return this.A02;
    }

    public void setMicColorTint(int i) {
        this.A01.setImageDrawable(C002001d.A0b(getContext(), R.drawable.mic_played, i));
    }

    public void setupMicBackgroudnColor(int i) {
        Context context = getContext();
        Drawable A032 = C004302a.A03(context, R.drawable.mic_background_incoming);
        if (A032 != null) {
            Drawable mutate = A032.mutate();
            ColorStateList A022 = C004302a.A02(context, i);
            this.A01.setBackgroundDrawable(mutate);
            AnonymousClass0Q7.A0a(this.A01, A022);
            return;
        }
        throw null;
    }
}
