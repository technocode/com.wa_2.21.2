package com.whatsapp.conversation.conversationrow;

import X.C004302a;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;

public class ConversationRowAudioPreview extends FrameLayout {
    public ImageView A00 = ((ImageView) findViewById(R.id.icon));
    public TextView A01 = ((TextView) findViewById(R.id.duration));
    public WaveformVisualizerView A02 = ((WaveformVisualizerView) findViewById(R.id.visualizer));

    public ConversationRowAudioPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        FrameLayout.inflate(context, R.layout.conversation_row_audio_preview, this);
        ((ImageView) findViewById(R.id.picture)).setImageDrawable(C004302a.A03(context, R.drawable.audio_message_thumb));
    }

    public void A00() {
        this.A02.setVisibility(8);
        this.A00.setVisibility(0);
    }

    public void A01() {
        this.A02.setVisibility(0);
        this.A00.setVisibility(8);
    }

    public void setDuration(String str) {
        this.A01.setText(str);
    }
}
