package com.whatsapp.videoplayback;

import X.AnonymousClass01X;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;

public final class ExoPlayerErrorFrame extends FrameLayout {
    public View.OnClickListener A00;
    public View A01;
    public FrameLayout A02;
    public TextView A03;
    public final FrameLayout A04;
    public final CircularProgressBar A05;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();

    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A04 = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.wa_exoplayer_error_frame, this);
        this.A05 = (CircularProgressBar) findViewById(R.id.loading);
    }

    public int getErrorScreenVisibility() {
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return 8;
    }

    public void setLoadingViewVisibility(int i) {
        this.A05.setVisibility(i);
    }

    public void setOnRetryListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }
}
