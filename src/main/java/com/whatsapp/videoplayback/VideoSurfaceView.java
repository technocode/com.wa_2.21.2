package com.whatsapp.videoplayback;

import X.AnonymousClass008;
import X.AnonymousClass37N;
import X.AnonymousClass37O;
import X.AnonymousClass37P;
import X.AnonymousClass37Q;
import X.AnonymousClass37R;
import X.AnonymousClass37S;
import X.C006803i;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.whatsapp.GifHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class VideoSurfaceView extends SurfaceView implements MediaController.MediaPlayerControl {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03 = -1;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public MediaPlayer.OnCompletionListener A09;
    public MediaPlayer.OnErrorListener A0A;
    public MediaPlayer.OnPreparedListener A0B;
    public MediaPlayer A0C = null;
    public Uri A0D;
    public SurfaceHolder A0E = null;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final MediaPlayer.OnBufferingUpdateListener A0K = new AnonymousClass37R(this);
    public final MediaPlayer.OnCompletionListener A0L = new AnonymousClass37P(this);
    public final MediaPlayer.OnErrorListener A0M = new AnonymousClass37Q(this);
    public final MediaPlayer.OnPreparedListener A0N = new AnonymousClass37O(this);
    public final MediaPlayer.OnVideoSizeChangedListener A0O = new AnonymousClass37N(this);
    public final SurfaceHolder.Callback A0P = new AnonymousClass37S(this);

    public VideoSurfaceView(Context context) {
        super(context);
        A01();
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public void A00() {
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0C.release();
            this.A0C = null;
            this.A02 = 0;
            this.A06 = 0;
        }
    }

    public final void A01() {
        this.A08 = 0;
        this.A07 = 0;
        getHolder().addCallback(this.A0P);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.A02 = 0;
        this.A06 = 0;
    }

    public final void A02() {
        Uri uri = this.A0D;
        if (uri != null && this.A0E != null) {
            File A0B2 = C006803i.A0B(uri);
            if (A0B2 == null || !A0B2.exists() || !GifHelper.A02(A0B2)) {
                Intent intent = new Intent("com.android.music.musicservicecommand");
                intent.putExtra("command", "pause");
                getContext().sendBroadcast(intent);
            }
            A03(false);
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.A0C = mediaPlayer;
                int i = this.A00;
                if (i != 0) {
                    mediaPlayer.setAudioSessionId(i);
                } else {
                    this.A00 = mediaPlayer.getAudioSessionId();
                }
                if (this.A0J) {
                    this.A0C.setVolume(0.0f, 0.0f);
                }
                if (this.A0I) {
                    this.A0C.setLooping(true);
                }
                this.A0C.setOnPreparedListener(this.A0N);
                this.A0C.setOnVideoSizeChangedListener(this.A0O);
                this.A0C.setOnCompletionListener(this.A0L);
                this.A0C.setOnErrorListener(this.A0M);
                this.A0C.setOnBufferingUpdateListener(this.A0K);
                this.A01 = 0;
                this.A0C.setDataSource(getContext(), this.A0D, (Map<String, String>) null);
                this.A0C.setDisplay(this.A0E);
                this.A0C.setAudioStreamType(3);
                this.A0C.setScreenOnWhilePlaying(true);
                this.A0C.prepareAsync();
                this.A02 = 1;
            } catch (IOException | IllegalArgumentException e) {
                StringBuilder A0S = AnonymousClass008.A0S("videoview/ Unable to open content: ");
                A0S.append(this.A0D);
                Log.w(A0S.toString(), e);
                this.A02 = -1;
                this.A06 = -1;
                this.A0M.onError(this.A0C, 1, 0);
            }
        }
    }

    public final void A03(boolean z) {
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.A0C.release();
            this.A0C = null;
            this.A02 = 0;
            if (z) {
                this.A06 = 0;
            }
        }
    }

    public boolean A04() {
        int i;
        return (this.A0C == null || (i = this.A02) == -1 || i == 0 || i == 1) ? false : true;
    }

    public boolean canPause() {
        return this.A0F;
    }

    public boolean canSeekBackward() {
        return this.A0G;
    }

    public boolean canSeekForward() {
        return this.A0H;
    }

    public int getAudioSessionId() {
        if (this.A00 == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.A00 = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.A00;
    }

    public int getBufferPercentage() {
        if (this.A0C != null) {
            return this.A01;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (!A04()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        throw null;
    }

    public int getDuration() {
        if (!A04()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        throw null;
    }

    public boolean isPlaying() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
            throw null;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoSurfaceView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoSurfaceView.class.getName());
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = SurfaceView.getDefaultSize(this.A08, i);
        int defaultSize2 = SurfaceView.getDefaultSize(this.A07, i2);
        if (this.A08 > 0 && this.A07 > 0) {
            int mode = View.MeasureSpec.getMode(i);
            defaultSize = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            defaultSize2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                int i4 = this.A08 * defaultSize2;
                int i5 = this.A07 * defaultSize;
                if (i4 < i5) {
                    Log.d("videoview/ image too wide, correcting");
                    defaultSize = (this.A08 * defaultSize2) / this.A07;
                } else if (i4 > i5) {
                    Log.d("videoview/ image too tall, correcting");
                    i3 = (this.A07 * defaultSize) / this.A08;
                }
            } else if (mode == 1073741824) {
                int i6 = (this.A07 * defaultSize) / this.A08;
                if (mode2 != Integer.MIN_VALUE || i6 <= defaultSize2) {
                    defaultSize2 = i6;
                }
            } else if (mode2 == 1073741824) {
                int i7 = (this.A08 * defaultSize2) / this.A07;
                if (mode != Integer.MIN_VALUE || i7 <= defaultSize) {
                    defaultSize = i7;
                }
            } else {
                int i8 = this.A08;
                int i9 = this.A07;
                if (mode2 != Integer.MIN_VALUE || i9 <= defaultSize2) {
                    defaultSize2 = i9;
                } else {
                    i8 = (i8 * defaultSize2) / i9;
                }
                if (mode != Integer.MIN_VALUE || i8 <= defaultSize) {
                    defaultSize = i8;
                } else {
                    i3 = (i9 * defaultSize) / i8;
                }
            }
            defaultSize2 = i3;
        }
        AnonymousClass008.A0y("videoview/setMeasuredDimension: ", defaultSize, "x", defaultSize2);
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void pause() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer == null) {
                throw null;
            } else if (mediaPlayer.isPlaying()) {
                this.A0C.pause();
                this.A02 = 4;
            }
        }
        this.A06 = 4;
    }

    public void seekTo(int i) {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i);
                this.A03 = -1;
                return;
            }
            throw null;
        }
        this.A03 = i;
    }

    public void setLooping(boolean z) {
        this.A0I = z;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0J = z;
        MediaPlayer mediaPlayer = this.A0C;
        if (mediaPlayer != null) {
            float f = 1.0f;
            if (z) {
                f = 0.0f;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A09 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A0A = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A0B = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        this.A0D = uri;
        this.A03 = -1;
        A02();
        requestLayout();
        invalidate();
    }

    public void start() {
        if (A04()) {
            MediaPlayer mediaPlayer = this.A0C;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                this.A02 = 3;
            } else {
                throw null;
            }
        }
        this.A06 = 3;
    }
}
