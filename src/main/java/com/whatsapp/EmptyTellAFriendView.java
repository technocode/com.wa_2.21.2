package com.whatsapp;

import X.AnonymousClass00D;
import X.AnonymousClass0Q7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.google.android.search.verification.client.R;
import com.whatsapp.components.Button;

public class EmptyTellAFriendView extends ScrollView {
    public WaTextView A00;
    public Button A01;
    public final AnonymousClass00D A02 = AnonymousClass00D.A00();

    public EmptyTellAFriendView(Context context) {
        super(context);
        A00();
    }

    public EmptyTellAFriendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public final void A00() {
        ScrollView.inflate(getContext(), R.layout.empty_tell_a_friend, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.A01 = (Button) AnonymousClass0Q7.A0D(this, R.id.invite_button_tell_a_friend);
        this.A00 = (WaTextView) AnonymousClass0Q7.A0D(this, R.id.subtitle_tell_a_friend);
        boolean equals = "91".equals(this.A02.A0F());
        WaTextView waTextView = this.A00;
        int i = R.string.welcome_available_platforms_consumer;
        if (equals) {
            i = R.string.welcome_available_platforms_india_consumer;
        }
        waTextView.setText(i);
    }

    public void setInviteButtonClickListener(View.OnClickListener onClickListener) {
        this.A01.setOnClickListener(onClickListener);
    }
}
