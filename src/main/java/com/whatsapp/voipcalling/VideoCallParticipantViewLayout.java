package com.whatsapp.voipcalling;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01X;
import X.AnonymousClass0SE;
import X.AnonymousClass39M;
import X.AnonymousClass39N;
import X.AnonymousClass39O;
import X.AnonymousClass39Q;
import X.AnonymousClass3UE;
import X.C000300f;
import X.C677039w;
import X.C72723Tz;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class VideoCallParticipantViewLayout extends FrameLayout implements AnonymousClass39Q {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public ValueAnimator A07;
    public Bitmap A08;
    public View.OnClickListener A09;
    public View.OnClickListener A0A;
    public View.OnClickListener A0B;
    public View.OnLongClickListener A0C;
    public View.OnTouchListener A0D;
    public View.OnTouchListener A0E;
    public AnonymousClass3UE A0F;
    public Boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public final AnonymousClass01X A0L;
    public final VideoCallParticipantView A0M;
    public final VideoCallParticipantView A0N;
    public final Map A0O;

    public VideoCallParticipantViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnonymousClass01X A002;
        C000300f.A00();
        if (isInEditMode()) {
            A002 = null;
        } else {
            A002 = AnonymousClass01X.A00();
        }
        this.A0L = A002;
        this.A0O = new HashMap();
        this.A0K = false;
        this.A03 = getResources().getDimensionPixelSize(R.dimen.call_pip_min_margin);
        this.A00 = 0.225f;
        this.A0I = true;
        this.A0J = true;
        VideoCallParticipantView videoCallParticipantView = new VideoCallParticipantView(context, null);
        this.A0M = videoCallParticipantView;
        videoCallParticipantView.setVisibility(8);
        addView(this.A0M, new ViewGroup.MarginLayoutParams(-1, -1));
        VideoCallParticipantView videoCallParticipantView2 = new VideoCallParticipantView(context, null);
        this.A0N = videoCallParticipantView2;
        videoCallParticipantView2.setVisibility(8);
        this.A0N.A0C.setZOrderMediaOverlay(true);
        addView(this.A0N, new ViewGroup.MarginLayoutParams(-1, -1));
        this.A01 = 0;
        this.A0H = !C677039w.A00;
    }

    public ViewGroup.MarginLayoutParams A00(Point point) {
        Point point2;
        int i;
        int i2;
        int i3;
        if (getWidth() == 0 || getHeight() == 0 || point == null || point.x == 0 || point.y == 0) {
            Log.i("voip/VideoCallParticipantViewLayout/calculatePipLayoutParamsForVideo cancelled");
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        int i4 = point.x;
        int i5 = point.y;
        int min = Math.min(i4, i5);
        int max = Math.max(i4, i5);
        int min2 = Math.min(width, height);
        if (i4 < i5) {
            width = height;
        }
        float f = (float) min;
        int min3 = (int) (((float) min2) * Math.min(this.A00, ((((float) width) * 0.5f) * f) / ((float) (max * min2))));
        int i6 = (int) (((float) min3) / (f / ((float) max)));
        if (i4 < i5) {
            point2 = new Point(min3, i6);
        } else {
            point2 = new Point(i6, min3);
        }
        AnonymousClass39O A022 = A02(point2.x, point2.y);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(point2.x, point2.y);
        boolean z = this.A0J;
        if (z) {
            i = A022.A00;
        } else {
            i = A022.A02;
        }
        marginLayoutParams.leftMargin = i;
        if (z) {
            i2 = A022.A02;
        } else {
            i2 = A022.A00;
        }
        marginLayoutParams.rightMargin = i2;
        if (this.A0I) {
            i3 = A022.A01;
        } else {
            i3 = A022.A03;
        }
        marginLayoutParams.topMargin = i3;
        marginLayoutParams.bottomMargin = 0;
        return marginLayoutParams;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r4 >= r6) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.whatsapp.voipcalling.VideoCallParticipantView A01(int r8) {
        /*
            r7 = this;
            int r6 = r7.getChildCount()
            int r5 = r7.A01
            int r4 = r6 - r5
            int r4 = r4 + r8
            if (r4 < 0) goto L_0x000e
            r3 = 1
            if (r4 < r6) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            java.lang.String r2 = "VideoCallParticipantView, wrong index = "
            java.lang.String r1 = ", total count = "
            java.lang.String r0 = ", active count = "
            java.lang.StringBuilder r0 = X.AnonymousClass008.A0U(r2, r8, r1, r6, r0)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00E.A08(r3, r0)
            android.view.View r0 = r7.getChildAt(r4)
            com.whatsapp.voipcalling.VideoCallParticipantView r0 = (com.whatsapp.voipcalling.VideoCallParticipantView) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VideoCallParticipantViewLayout.A01(int):com.whatsapp.voipcalling.VideoCallParticipantView");
    }

    public AnonymousClass39O A02(int i, int i2) {
        int i3 = this.A03;
        return new AnonymousClass39O(i3, (getWidth() - i) - this.A03, this.A04 + i3, ((getHeight() - i2) - this.A03) - this.A02);
    }

    public void A03() {
        Boolean bool = this.A0G;
        if (bool != null && bool.booleanValue()) {
            for (C72723Tz r0 : this.A0O.values()) {
                r0.getSurfaceHolder().setSizeFromLayout();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if ((r12 % 2) != 0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(int r12, int r13, int r14, int r15, int r16) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VideoCallParticipantViewLayout.A04(int, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        if ((r9 % 2) != 0) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 215
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VideoCallParticipantViewLayout.A05(int, boolean):void");
    }

    public void A06(long j, int i, int i2) {
        StringBuilder sb = new StringBuilder("VideoCallParticipantViewLayout/animatePiPView with duration: ");
        sb.append(j);
        sb.append(", xOffset: ");
        sb.append(i);
        sb.append(", yOffset: ");
        sb.append(i2);
        sb.append(", final size: ");
        sb.append(0);
        sb.append("x");
        sb.append(0);
        Log.i(sb.toString());
        if (j <= 0 || !this.A0H) {
            AnonymousClass3UE r0 = this.A0F;
            if (r0 != null) {
                VoipActivityV2 voipActivityV2 = r0.A00;
                voipActivityV2.A1N = false;
                voipActivityV2.A0w();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A07 = ofFloat;
        ofFloat.setDuration(j);
        this.A07.addUpdateListener(new AnonymousClass39M(this, j, i, i2));
        this.A07.addListener(new AnonymousClass39N(this));
        this.A07.start();
    }

    public final void A07(VideoCallParticipantView videoCallParticipantView) {
        videoCallParticipantView.setLayoutMode(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView.getLayoutParams();
        if (!(marginLayoutParams.width == -1 && marginLayoutParams.height == -1 && marginLayoutParams.topMargin == 0 && marginLayoutParams.leftMargin == 0 && marginLayoutParams.bottomMargin == 0 && marginLayoutParams.rightMargin == 0)) {
            AnonymousClass01X r3 = this.A0L;
            if (r3 != null) {
                AnonymousClass0SE.A07(r3, videoCallParticipantView, 0, 0, 0, 0);
            }
            marginLayoutParams.height = -1;
            marginLayoutParams.width = -1;
            videoCallParticipantView.setLayoutParams(marginLayoutParams);
        }
        videoCallParticipantView.A02();
    }

    public final void A08(VideoCallParticipantView videoCallParticipantView) {
        if (videoCallParticipantView.getLayoutMode() == 1) {
            videoCallParticipantView.setOnTouchListener(this.A0E);
            videoCallParticipantView.setOnClickListener(this.A0B);
        } else {
            videoCallParticipantView.setOnClickListener(this.A0A);
            videoCallParticipantView.setOnTouchListener(this.A0D);
            videoCallParticipantView.setOnLongClickListener(this.A0C);
        }
        videoCallParticipantView.A0M.setOnClickListener(this.A09);
    }

    @Override // X.AnonymousClass39Q
    public VideoPort A9h(VideoCallParticipantView videoCallParticipantView) {
        Map map = this.A0O;
        C72723Tz r1 = (C72723Tz) map.get(videoCallParticipantView);
        if (r1 != null) {
            return r1;
        }
        C72723Tz r12 = new C72723Tz(videoCallParticipantView.A0C);
        map.put(videoCallParticipantView, r12);
        return r12;
    }

    @Override // X.AnonymousClass39Q
    public void AQy(VideoCallParticipantView videoCallParticipantView, Point point) {
        boolean z = true;
        if (videoCallParticipantView.getLayoutMode() == 1) {
            VideoCallParticipantView videoCallParticipantView2 = this.A0N;
            boolean z2 = false;
            if (videoCallParticipantView == videoCallParticipantView2) {
                z2 = true;
            }
            AnonymousClass00E.A08(z2, "only pipView can be in Pip mode");
            if (videoCallParticipantView == videoCallParticipantView2) {
                if (videoCallParticipantView2.getLayoutMode() != 1) {
                    z = false;
                }
                AnonymousClass00E.A08(z, "pipView is not in Pip mode");
                ViewGroup.MarginLayoutParams A002 = A00(point);
                if (A002 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) videoCallParticipantView2.getLayoutParams();
                    marginLayoutParams.height = A002.height;
                    marginLayoutParams.width = A002.width;
                    AnonymousClass01X r0 = this.A0L;
                    if (r0 == null || !r0.A0M()) {
                        marginLayoutParams.setMargins(A002.rightMargin, A002.topMargin, A002.leftMargin, A002.bottomMargin);
                    } else {
                        marginLayoutParams.setMargins(A002.leftMargin, A002.topMargin, A002.rightMargin, A002.bottomMargin);
                    }
                    StringBuilder A0S = AnonymousClass008.A0S("voip/VideoCallParticipantViewLayout/updatePipLayoutParams leftMargin: ");
                    A0S.append(marginLayoutParams.leftMargin);
                    A0S.append(", topMargin: ");
                    A0S.append(marginLayoutParams.topMargin);
                    A0S.append(", Pip size: ");
                    A0S.append(marginLayoutParams.width);
                    A0S.append("x");
                    A0S.append(marginLayoutParams.height);
                    A0S.append(", container size: ");
                    A0S.append(getWidth());
                    A0S.append("x");
                    A0S.append(getHeight());
                    Log.i(A0S.toString());
                    videoCallParticipantView2.setLayoutParams(marginLayoutParams);
                    videoCallParticipantView2.A02();
                }
            }
        }
    }

    public void setCommonViewListeners(View.OnTouchListener onTouchListener, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, View.OnLongClickListener onLongClickListener) {
        this.A0D = onTouchListener;
        this.A0A = onClickListener;
        this.A0C = onLongClickListener;
        this.A09 = onClickListener2;
        for (int i = 0; i < this.A01; i++) {
            A08(A01(i));
        }
    }
}
