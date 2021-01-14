package com.whatsapp.components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public class ConversationListRowHeaderView extends LinearLayout {
    public TextEmojiLabel A00;
    public WaTextView A01;

    public ConversationListRowHeaderView(Context context) {
        super(context);
        A00(context);
    }

    public ConversationListRowHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public final void A00(Context context) {
        LinearLayout.inflate(context, R.layout.conversation_list_row_header, this);
        this.A00 = (TextEmojiLabel) findViewById(R.id.conversations_row_contact_name);
        this.A01 = (WaTextView) findViewById(R.id.conversations_row_date);
        setOrientation(0);
    }

    public TextEmojiLabel getContactNameView() {
        return this.A00;
    }

    public WaTextView getDateView() {
        return this.A01;
    }
}
