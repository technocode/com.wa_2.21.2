package com.whatsapp.conversation.conversationrow;

import X.AbstractC59162nB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;

public class ConversationRowImageAlbum$AlbumGridFrame extends FrameLayout {
    public int A00;

    public ConversationRowImageAlbum$AlbumGridFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.conversation_video_thumb_padding);
    }

    public void onMeasure(int i, int i2) {
        int A04;
        int mode = View.MeasureSpec.getMode(i);
        if (isInEditMode()) {
            A04 = 800;
        } else {
            A04 = (AbstractC59162nB.A04(getContext()) * 72) / 100;
        }
        if (mode != 0) {
            A04 = Math.min(A04, View.MeasureSpec.getSize(i));
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((A04 - this.A00) >> 1, 1073741824);
        int i3 = 0;
        do {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec);
            i3++;
        } while (i3 < 4);
        setMeasuredDimension(A04, A04);
    }
}
