package com.whatsapp.biz.catalog;

import X.AnonymousClass27n;
import X.C05710Pt;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

public class EllipsizedTextEmojiLabel extends TextEmojiLabel {
    public int A00;
    public int A01;
    public int A02 = R.color.link_color;
    public View.OnClickListener A03;
    public CharSequence A04;
    public List A05;

    public EllipsizedTextEmojiLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A07 = new C05710Pt();
    }

    @Override // com.whatsapp.TextEmojiLabel
    public void A04(CharSequence charSequence, List list, boolean z, int i) {
        this.A04 = charSequence;
        this.A05 = list;
        this.A01 = i;
        int codePointCount = Character.codePointCount(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (codePointCount > this.A00) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(this.A0A.A06(R.string.read_more));
            spannableStringBuilder2.setSpan(new AnonymousClass27n(this, getContext(), this.A02), 0, spannableStringBuilder2.length(), 18);
            int i2 = 0;
            for (int i3 = 0; i3 < this.A00; i3++) {
                i2 += Character.charCount(Character.codePointAt(charSequence, i2));
            }
            spannableStringBuilder = spannableStringBuilder.delete(i2, spannableStringBuilder.length()).append((CharSequence) "... ").append((CharSequence) spannableStringBuilder2);
        }
        super.A04(spannableStringBuilder, list, true, i);
    }

    public void setEllipsizeLength(int i) {
        this.A00 = i;
    }

    public void setOnTextExpandClickListener(View.OnClickListener onClickListener) {
        this.A03 = onClickListener;
    }

    public void setReadMoreColor(int i) {
        this.A02 = i;
    }
}
