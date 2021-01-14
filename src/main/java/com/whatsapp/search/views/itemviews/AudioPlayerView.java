package com.whatsapp.search.views.itemviews;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass0Q7;
import X.AnonymousClass0SE;
import X.AnonymousClass311;
import X.C002001d;
import X.C004302a;
import X.C06470Tj;
import X.C07990aH;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.google.android.search.verification.client.R;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.VoiceNoteSeekBar;

public class AudioPlayerView extends LinearLayout {
    public ImageButton A00;
    public CircularProgressBar A01;
    public VoiceNoteSeekBar A02;
    public final AnonymousClass01X A03 = AnonymousClass01X.A00();

    public AudioPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(context, R.layout.message_audio_player, this);
        setOrientation(0);
        setGravity(17);
        this.A00 = (ImageButton) AnonymousClass0Q7.A0D(this, R.id.control_btn);
        this.A02 = (VoiceNoteSeekBar) AnonymousClass0Q7.A0D(this, R.id.audio_seekbar);
        CircularProgressBar circularProgressBar = (CircularProgressBar) AnonymousClass0Q7.A0D(this, R.id.progress_bar_1);
        this.A01 = circularProgressBar;
        circularProgressBar.setMax(100);
        this.A01.A0C = C004302a.A00(context, R.color.media_message_progress_determinate);
        this.A01.A0B = 536870912;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C07990aH.A0L);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            View findViewById = findViewById(R.id.controls);
            if (findViewById != null) {
                AnonymousClass0SE.A08(this.A03, findViewById, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), dimensionPixelSize3, findViewById.getPaddingBottom());
                View findViewById2 = findViewById(R.id.audio_seekbar);
                if (findViewById2 != null) {
                    findViewById2.setPadding(findViewById2.getPaddingLeft(), dimensionPixelSize2, findViewById2.getPaddingRight(), dimensionPixelSize);
                    if (dimensionPixelSize4 > 0) {
                        AnonymousClass0SE.A05(this.A03, findViewById2, dimensionPixelSize4, ((ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams()).rightMargin);
                    }
                    View findViewById3 = findViewById(R.id.control_button_container);
                    if (findViewById3 != null) {
                        if (dimensionPixelSize5 > 0) {
                            ViewGroup.LayoutParams layoutParams = findViewById3.getLayoutParams();
                            layoutParams.height = dimensionPixelSize5;
                            layoutParams.width = dimensionPixelSize5;
                            findViewById3.setLayoutParams(layoutParams);
                        }
                        if (dimensionPixelSize6 > 0) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
                            AnonymousClass0SE.A05(this.A03, findViewById3, dimensionPixelSize6, marginLayoutParams.rightMargin);
                            findViewById3.setLayoutParams(marginLayoutParams);
                        }
                        if (dimensionPixelSize7 > 0) {
                            ViewGroup.LayoutParams layoutParams2 = this.A01.getLayoutParams();
                            layoutParams2.height = dimensionPixelSize7;
                            layoutParams2.width = dimensionPixelSize7;
                            this.A01.setLayoutParams(layoutParams2);
                            return;
                        }
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    public ProgressBar getProgressBar() {
        return this.A01;
    }

    public int getSeekbarProgress() {
        return this.A02.getProgress();
    }

    public void setOnControlButtonClickListener(View.OnClickListener onClickListener) {
        this.A00.setOnClickListener(onClickListener);
    }

    public void setOnControlButtonLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A00.setOnLongClickListener(onLongClickListener);
    }

    public void setPlayButtonState(int i) {
        if (i == 0) {
            ImageButton imageButton = this.A00;
            AnonymousClass01X r2 = this.A03;
            imageButton.setImageDrawable(new C06470Tj(r2, C004302a.A03(getContext(), R.drawable.inline_audio_play)));
            this.A00.setContentDescription(r2.A06(R.string.play));
        } else if (i == 1) {
            this.A00.setImageResource(R.drawable.inline_audio_pause);
            this.A00.setContentDescription(this.A03.A06(R.string.pause));
        } else if (i == 2) {
            this.A00.setImageResource(R.drawable.inline_audio_upload);
            this.A00.setContentDescription(this.A03.A06(R.string.button_upload));
        } else if (i == 3) {
            this.A00.setImageResource(R.drawable.inline_audio_download);
            this.A00.setContentDescription(this.A03.A06(R.string.button_download));
        } else if (i == 4) {
            this.A00.setImageResource(R.drawable.inline_audio_cancel);
            this.A00.setContentDescription(this.A03.A06(R.string.cancel));
        } else {
            throw new IllegalStateException(AnonymousClass008.A0F("setPlayButtonState: Did not handle playstate: ", i));
        }
    }

    public void setPlaybackListener(AnonymousClass311 r2) {
        this.A02.setOnSeekBarChangeListener(r2);
    }

    public void setSeekbarColor(int i) {
        this.A02.setProgressColor(i);
    }

    public void setSeekbarContentDescription(long j) {
        AnonymousClass01X r5 = this.A03;
        String A1X = C002001d.A1X(r5, j);
        this.A02.setContentDescription(r5.A0D(R.string.voice_message_time_elapsed, A1X));
    }

    public void setSeekbarLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.A02.setOnLongClickListener(onLongClickListener);
    }

    public void setSeekbarMax(int i) {
        this.A02.setMax(i);
    }

    public void setSeekbarProgress(int i) {
        this.A02.setProgress(i);
    }
}
