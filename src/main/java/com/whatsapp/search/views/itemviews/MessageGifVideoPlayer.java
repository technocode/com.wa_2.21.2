package com.whatsapp.search.views.itemviews;

import X.AnonymousClass00T;
import X.AnonymousClass0M3;
import X.AnonymousClass0ZB;
import X.AnonymousClass316;
import X.AnonymousClass317;
import X.AnonymousClass318;
import X.AnonymousClass3OQ;
import X.C002101e;
import X.C49232Po;
import X.C656530u;
import X.C74913bm;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;

public class MessageGifVideoPlayer extends TextureView {
    public MediaPlayer.OnErrorListener A00 = C656530u.A00;
    public MediaPlayer.OnPreparedListener A01 = new AnonymousClass317(this);
    public MediaPlayer A02;
    public Surface A03;
    public C49232Po A04;
    public AnonymousClass0ZB A05;
    public AnonymousClass318 A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = false;
    public boolean A0C = false;
    public final TextureView.SurfaceTextureListener A0D = new AnonymousClass316(this);
    public final AnonymousClass00T A0E = C002101e.A00();

    public MessageGifVideoPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r3 < r2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r3 < r2) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer r8) {
        /*
            X.2Po r1 = r8.A04
            if (r1 == 0) goto L_0x003f
            int r0 = r1.A02
            float r7 = (float) r0
            int r0 = r1.A01
            float r6 = (float) r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            int r0 = r8.getWidth()
            float r5 = (float) r0
            int r0 = r8.getHeight()
            float r4 = (float) r0
            float r3 = r7 / r6
            float r2 = r5 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
        L_0x002f:
            float r2 = r2 / r3
        L_0x0030:
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r4 = r4 / r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.setScale(r1, r2, r5, r4)
            r8.setTransform(r0)
        L_0x003f:
            return
        L_0x0040:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x004d
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005b
            goto L_0x002f
        L_0x004d:
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x005b
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0057:
            r1 = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0030
        L_0x005b:
            float r3 = r3 / r2
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.MessageGifVideoPlayer.A00(com.whatsapp.search.views.itemviews.MessageGifVideoPlayer):void");
    }

    public static /* synthetic */ boolean A01(int i) {
        return false;
    }

    public final void A02() {
        if (this.A0C && this.A02 != null && this.A09) {
            AnonymousClass318 r0 = this.A06;
            if (r0 != null) {
                C74913bm.A00(((AnonymousClass3OQ) r0).A00, false);
            }
            setVisibility(0);
            this.A02.start();
            this.A0A = true;
        }
    }

    public final void A03() {
        this.A09 = false;
        if (this.A0B) {
            this.A08 = true;
        } else if (!this.A0C) {
            this.A07 = true;
        } else {
            setSurfaceTextureListener(this.A0D);
            this.A0E.ANF(new RunnableEBaseShape12S0100000_I1_7(this, 34));
        }
    }

    public final void A04() {
        MediaPlayer mediaPlayer;
        setVisibility(8);
        AnonymousClass318 r0 = this.A06;
        if (r0 != null) {
            C74913bm.A00(((AnonymousClass3OQ) r0).A00, true);
        }
        if (this.A0A && (mediaPlayer = this.A02) != null) {
            mediaPlayer.pause();
            this.A02.seekTo(0);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A02();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A04();
    }

    public void setMessage(AnonymousClass0ZB r2) {
        if ((this.A05 != r2 || this.A02 == null) && ((AnonymousClass0M3) r2).A02 != null) {
            this.A05 = r2;
            A03();
        }
    }

    public void setPlayingListener(AnonymousClass318 r1) {
        this.A06 = r1;
    }

    public void setScrolling(boolean z) {
        this.A0B = z;
        if (!z && this.A08) {
            this.A08 = false;
            A03();
        }
    }

    public void setShouldPlay(boolean z) {
        if (this.A0C != z) {
            this.A0C = z;
            if (!z) {
                if (this.A0A && this.A02 != null) {
                    A04();
                }
            } else if (this.A07) {
                A03();
            } else if (this.A09) {
                A02();
            }
        }
    }
}
