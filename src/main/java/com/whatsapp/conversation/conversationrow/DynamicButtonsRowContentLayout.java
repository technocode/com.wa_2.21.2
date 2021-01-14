package com.whatsapp.conversation.conversationrow;

import X.AbstractC007503q;
import X.AbstractC51572Zg;
import X.AnonymousClass1XN;
import X.C004302a;
import X.C05710Pt;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;

public class DynamicButtonsRowContentLayout extends LinearLayout {
    public final TextEmojiLabel A00 = ((TextEmojiLabel) findViewById(R.id.bottom_message));
    public final TextEmojiLabel A01 = ((TextEmojiLabel) findViewById(R.id.top_message));

    public DynamicButtonsRowContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        LinearLayout.inflate(context, R.layout.dynamic_reply_message_content, this);
    }

    public void A00(AbstractC51572Zg r6) {
        AbstractC007503q fMessage = r6.getFMessage();
        AnonymousClass1XN r0 = fMessage.A0A().A00;
        if (r0 != null) {
            String str = r0.A00;
            String str2 = r0.A01;
            if (!TextUtils.isEmpty(str)) {
                if (!TextUtils.isEmpty(str2)) {
                    TextEmojiLabel textEmojiLabel = this.A01;
                    r6.A0b(str, textEmojiLabel, fMessage, true);
                    setupContentView(textEmojiLabel);
                    TextEmojiLabel textEmojiLabel2 = this.A00;
                    textEmojiLabel2.A07 = null;
                    textEmojiLabel.setVisibility(0);
                    r6.A0b(str2, textEmojiLabel2, fMessage, false);
                    textEmojiLabel2.setTextSize(AbstractC51572Zg.A02(r6.getResources(), r6.A0n, -1));
                    textEmojiLabel2.setTextColor(C004302a.A00(r6.getContext(), R.color.conversation_row_date));
                    return;
                }
                TextEmojiLabel textEmojiLabel3 = this.A00;
                r6.A0b(str, textEmojiLabel3, fMessage, true);
                setupContentView(textEmojiLabel3);
                this.A01.setVisibility(8);
                textEmojiLabel3.setTextSize(r6.getTextFontSize());
                textEmojiLabel3.setTextColor(C004302a.A00(r6.getContext(), R.color.conversation_template_top_message_text_color));
            }
        }
    }

    private void setupContentView(TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A07 = new C05710Pt();
        textEmojiLabel.setAutoLinkMask(0);
        textEmojiLabel.setLinksClickable(false);
        textEmojiLabel.setFocusable(false);
        textEmojiLabel.setClickable(false);
        textEmojiLabel.setLongClickable(false);
    }
}
