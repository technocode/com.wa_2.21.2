package X;

import android.media.MediaPlayer;

/* renamed from: X.36j  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C669036j implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ AnonymousClass37V A00;

    public /* synthetic */ C669036j(AnonymousClass37V r1) {
        this.A00 = r1;
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        AnonymousClass37V r6 = this.A00;
        r6.A05 = i;
        r6.A04 = i2;
        if (!(i == 0 || i2 == 0)) {
            int width = r6.getWidth();
            int height = r6.getHeight();
            int i3 = r6.A05;
            int i4 = i3 * height;
            int i5 = r6.A04;
            int i6 = i5 * width;
            if (i4 > i6) {
                height = i6 / i3;
            } else {
                width = i4 / i5;
            }
            int width2 = r6.getWidth();
            r6.setTop((r6.getHeight() - height) >> 1);
            r6.setBottom(r6.getTop() + height);
            r6.setLeft((width2 - width) >> 1);
            r6.setRight(r6.getLeft() + width);
        }
        r6.requestLayout();
    }
}
