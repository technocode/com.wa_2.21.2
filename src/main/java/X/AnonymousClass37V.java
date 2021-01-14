package X;

import android.content.Context;
import android.graphics.Matrix;
import android.media.MediaPlayer;
import android.view.Surface;
import android.view.TextureView;
import android.widget.MediaController;

/* renamed from: X.37V  reason: invalid class name */
public class AnonymousClass37V extends TextureView implements MediaController.MediaPlayerControl {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = -1;
    public int A03 = 0;
    public int A04;
    public int A05;
    public MediaPlayer.OnCompletionListener A06;
    public MediaPlayer.OnErrorListener A07;
    public MediaPlayer.OnPreparedListener A08;
    public MediaPlayer A09;
    public Surface A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final Matrix A0I = new Matrix();

    public AnonymousClass37V(Context context) {
        super(context);
        A00();
    }

    public void A00() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.A09 = mediaPlayer;
        mediaPlayer.setOnVideoSizeChangedListener(new C669036j(this));
        this.A09.setOnErrorListener(new C668736g(this));
        this.A09.setOnPreparedListener(new C668936i(this));
        this.A09.setOnCompletionListener(new C668836h(this));
        setSurfaceTextureListener(new AnonymousClass37U(this));
    }

    public boolean A01() {
        int i;
        return (this.A09 == null || (i = this.A00) == -1 || i == 0 || i == 1) ? false : true;
    }

    public boolean canPause() {
        return this.A0C;
    }

    public boolean canSeekBackward() {
        return this.A0D;
    }

    public boolean canSeekForward() {
        return this.A0E;
    }

    public int getAudioSessionId() {
        AnonymousClass00E.A08(false, "Not implemented");
        return 0;
    }

    public int getBufferPercentage() {
        AnonymousClass00E.A08(false, "Not implemented");
        return 0;
    }

    public int getCurrentPosition() {
        if (!A01()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        throw null;
    }

    public int getDuration() {
        if (!A01()) {
            return -1;
        }
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        throw null;
    }

    public boolean isPlaying() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                return mediaPlayer.isPlaying();
            }
            throw null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 4) {
            mediaPlayer.start();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 3) {
            mediaPlayer.pause();
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 4) {
            mediaPlayer.start();
        }
    }

    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.A05 != 0 && this.A04 != 0) {
            if (this.A01 != 1) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                int i3 = this.A05;
                int i4 = i3 * measuredHeight;
                int i5 = this.A04;
                int i6 = i5 * measuredWidth;
                if (i4 > i6) {
                    measuredHeight = i6 / i3;
                } else {
                    measuredWidth = i4 / i5;
                }
                setMeasuredDimension(measuredWidth, measuredHeight);
                return;
            }
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            Matrix matrix = this.A0I;
            matrix.reset();
            int i7 = this.A05;
            int i8 = i7 * measuredHeight2;
            int i9 = this.A04;
            int i10 = i9 * measuredWidth2;
            float f2 = 1.0f;
            if (i8 > i10) {
                f2 = (((float) i7) * ((float) measuredHeight2)) / ((float) i10);
                f = 1.0f;
            } else {
                f = (((float) i9) * ((float) measuredWidth2)) / ((float) i8);
            }
            matrix.setScale(f2, f, (float) (measuredWidth2 >> 1), (float) (measuredHeight2 >> 1));
            setTransform(matrix);
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null && this.A00 == 3) {
            mediaPlayer.pause();
        }
    }

    public void pause() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer == null) {
                throw null;
            } else if (mediaPlayer.isPlaying()) {
                this.A09.pause();
                this.A00 = 4;
            }
        }
        this.A03 = 4;
    }

    public void seekTo(int i) {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo(i);
                this.A02 = -1;
                return;
            }
            throw null;
        }
        this.A02 = i;
    }

    public void setLooping(boolean z) {
        this.A0F = z;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(z);
        }
    }

    public void setMute(boolean z) {
        this.A0G = z;
        MediaPlayer mediaPlayer = this.A09;
        if (mediaPlayer != null) {
            float f = 1.0f;
            if (z) {
                f = 0.0f;
            }
            mediaPlayer.setVolume(f, f);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.A06 = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.A07 = onErrorListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.A08 = onPreparedListener;
    }

    public void setScaleType(int i) {
        int i2 = this.A01;
        this.A01 = i;
        if (i2 != i) {
            requestLayout();
        }
    }

    public void setVideoPath(String str) {
        this.A0B = str;
    }

    public void start() {
        if (A01()) {
            MediaPlayer mediaPlayer = this.A09;
            if (mediaPlayer != null) {
                mediaPlayer.start();
                this.A00 = 3;
            } else {
                throw null;
            }
        } else if (this.A09 == null) {
            A00();
        }
        this.A03 = 3;
    }
}
