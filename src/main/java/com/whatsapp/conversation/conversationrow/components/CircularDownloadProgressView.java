package com.whatsapp.conversation.conversationrow.components;

import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.C002001d;
import X.C004302a;
import X.C04420Kh;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.WaImageView;

public class CircularDownloadProgressView extends FrameLayout {
    public int A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public View.OnClickListener A03;
    public final CircularProgressBar A04;
    public final WaImageView A05;
    public final AnonymousClass01X A06;
    public final C04420Kh A07;

    public CircularDownloadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnonymousClass01X A002;
        C04420Kh r1 = null;
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A06 = A002;
        this.A07 = !isInEditMode() ? C04420Kh.A00() : r1;
        FrameLayout.inflate(context, R.layout.circular_download_progress, this);
        this.A05 = (WaImageView) AnonymousClass0Q7.A0D(this, R.id.control_btn);
        CircularProgressBar circularProgressBar = (CircularProgressBar) AnonymousClass0Q7.A0D(this, R.id.progressbar);
        this.A04 = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A04.A0C = C004302a.A00(getContext(), R.color.media_message_progress_determinate);
        this.A04.A0B = getContext().getResources().getColor(R.color.black_alpha_15);
    }

    public void setStatus(int i) {
        this.A00 = i;
        AnonymousClass01X r4 = this.A06;
        if (r4 != null) {
            WaImageView waImageView = this.A05;
            C002001d.A2j(waImageView);
            int i2 = this.A00;
            if (i2 == 0 || i2 == 1) {
                setVisibility(0);
                waImageView.setImageResource(R.drawable.inline_audio_cancel);
                waImageView.setOnClickListener(this.A01);
                C002001d.A2w(r4, waImageView, R.string.cancel);
                int i3 = this.A00;
                Context context = getContext();
                if (i3 == 0) {
                    waImageView.setContentDescription(context.getString(R.string.tb_button_uploading));
                } else {
                    waImageView.setContentDescription(context.getString(R.string.tb_button_downloading));
                }
            } else if (i2 == 2) {
                setVisibility(8);
            } else {
                setVisibility(0);
                if (this.A00 == 3) {
                    waImageView.setImageResource(R.drawable.inline_audio_upload);
                    waImageView.setContentDescription(r4.A06(R.string.retry));
                    waImageView.setOnClickListener(this.A03);
                    return;
                }
                waImageView.setImageResource(R.drawable.inline_audio_download);
                waImageView.setContentDescription(r4.A06(R.string.button_download));
                waImageView.setOnClickListener(this.A02);
            }
        }
    }
}
