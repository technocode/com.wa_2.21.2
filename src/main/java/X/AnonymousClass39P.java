package X;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoCallParticipantView;
import com.whatsapp.voipcalling.VideoCallParticipantViewLayout;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.39P  reason: invalid class name */
public class AnonymousClass39P implements View.OnTouchListener {
    public double A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public AnonymousClass39O A0F;
    public final /* synthetic */ VideoCallParticipantViewLayout A0G;

    public AnonymousClass39P(VideoCallParticipantViewLayout videoCallParticipantViewLayout) {
        this.A0G = videoCallParticipantViewLayout;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        float f;
        float rawX;
        int i5;
        boolean z3 = view instanceof VideoCallParticipantView;
        AnonymousClass00E.A08(z3, "PipOnTouchListener can only work with VideoCallParticipantView");
        boolean z4 = false;
        if (!z3) {
            StringBuilder sb = new StringBuilder("VideoCallParticipantViewLayout/PipOnTouchListener/ ignore, wrong view ");
            sb.append(view);
            Log.i(sb.toString());
            return false;
        }
        int layoutMode = ((VideoCallParticipantView) view).getLayoutMode();
        if (layoutMode != 1) {
            StringBuilder A0S = AnonymousClass008.A0S("VideoCallParticipantViewLayout/PipOnTouchListener/ swallow the events when mode is ");
            A0S.append(layoutMode);
            Log.i(A0S.toString());
            return true;
        }
        VideoCallParticipantViewLayout videoCallParticipantViewLayout = this.A0G;
        AnonymousClass01X r0 = videoCallParticipantViewLayout.A0L;
        if (r0 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.A08 = videoCallParticipantViewLayout.getWidth();
                this.A07 = videoCallParticipantViewLayout.getHeight();
                this.A01 = motionEvent.getRawX();
                this.A02 = motionEvent.getRawY();
                if (r0.A0M()) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = marginLayoutParams.rightMargin;
                }
                this.A0A = i;
                this.A0B = marginLayoutParams.topMargin;
                this.A0D = view.getWidth();
                this.A0C = view.getHeight();
                AnonymousClass3UE r2 = videoCallParticipantViewLayout.A0F;
                if (r2 != null) {
                    VoipActivityV2 voipActivityV2 = r2.A00;
                    voipActivityV2.A1N = true;
                    if (voipActivityV2.A11 != null) {
                        voipActivityV2.A0n();
                    }
                }
                int i6 = videoCallParticipantViewLayout.A06;
                int i7 = videoCallParticipantViewLayout.A05;
                this.A00 = Math.sqrt((double) ((i7 * i7) + (i6 * i6)));
                this.A09 = 0;
                this.A0F = videoCallParticipantViewLayout.A02(this.A0D, this.A0C);
                this.A06 = 0.0f;
                this.A05 = 0.0f;
                this.A04 = 0.0f;
                this.A03 = 0.0f;
                this.A0E = 0;
                StringBuilder A0S2 = AnonymousClass008.A0S("VideoCallParticipantViewLayout/videoPipParticipantView/onTouch ACTION_DOWN downX: ");
                A0S2.append(this.A01);
                A0S2.append(", downY: ");
                A0S2.append(this.A02);
                A0S2.append(", leftMargin: ");
                A0S2.append(this.A0A);
                A0S2.append(", topMargin: ");
                AnonymousClass008.A1L(A0S2, this.A0B);
                return true;
            } else if (action != 1) {
                if (action != 2) {
                    return true;
                }
                if (this.A0F == null) {
                    Log.i("VideoCallParticipantViewLayout/videoPipParticipantView/onTouch ACTION_MOVE dispatched before ACTION_DOWN, ignore");
                    return true;
                }
                int i8 = this.A0A;
                if (r0.A0M()) {
                    f = motionEvent.getRawX();
                    rawX = this.A01;
                } else {
                    f = this.A01;
                    rawX = motionEvent.getRawX();
                }
                int rawY = this.A0B + ((int) (motionEvent.getRawY() - this.A02));
                AnonymousClass39O r5 = this.A0F;
                int max = Math.max(r5.A02, Math.min(r5.A00, i8 + ((int) (f - rawX))));
                int max2 = Math.max(r5.A03, Math.min(r5.A01, rawY));
                motionEvent.getEventTime();
                motionEvent.getRawX();
                motionEvent.getRawY();
                if (r0.A0M()) {
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    i5 = marginLayoutParams.leftMargin;
                }
                AnonymousClass0SE.A07(r0, view, max, max2, i5, marginLayoutParams.bottomMargin);
                this.A09 = Math.max(Math.max(Math.abs(max - this.A0A), Math.abs(max2 - this.A0B)), this.A09);
                long eventTime = motionEvent.getEventTime() - this.A0E;
                if (eventTime > 0) {
                    float f2 = (float) eventTime;
                    this.A05 = ((motionEvent.getRawX() - this.A03) * 1000.0f) / f2;
                    this.A06 = ((motionEvent.getRawY() - this.A04) * 1000.0f) / f2;
                }
                this.A03 = motionEvent.getRawX();
                this.A04 = motionEvent.getRawY();
                this.A0E = motionEvent.getEventTime();
                return true;
            } else if (this.A0F == null) {
                Log.i("videoPipParticipantView/onTouch ACTION_UP dispatched before ACTION_DOWN, ignore");
                return true;
            } else {
                int i9 = this.A09;
                double d = this.A00;
                if (((double) i9) < d / 60.0d) {
                    StringBuilder A0S3 = AnonymousClass008.A0S("videoPipParticipantView/onTouch ACTION_UP treat as click event  maxDistance: ");
                    A0S3.append(i9);
                    A0S3.append(", screenLength: ");
                    A0S3.append(d);
                    Log.i(A0S3.toString());
                    view.performClick();
                    AnonymousClass3UE r02 = videoCallParticipantViewLayout.A0F;
                    if (r02 != null) {
                        VoipActivityV2 voipActivityV22 = r02.A00;
                        voipActivityV22.A1N = false;
                        voipActivityV22.A0w();
                    }
                    return true;
                }
                float f3 = this.A05;
                float f4 = this.A06;
                float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
                boolean z5 = false;
                if (((double) sqrt) > d / 1.0d) {
                    z5 = true;
                }
                float rawX2 = motionEvent.getRawX();
                float rawY2 = motionEvent.getRawY();
                if (z5) {
                    double d2 = (double) ((this.A05 / sqrt) * 64.0f);
                    double d3 = (double) ((this.A06 / sqrt) * 64.0f);
                    while (rawX2 >= 0.0f && rawX2 <= ((float) this.A08) && rawY2 >= 0.0f && rawY2 <= ((float) this.A07)) {
                        rawX2 = (float) (((double) rawX2) + d2);
                        rawY2 = (float) (((double) rawY2) + d3);
                    }
                }
                if (!r0.A0M() ? rawX2 > ((float) (this.A08 / 2)) : rawX2 < ((float) (this.A08 / 2))) {
                    z = false;
                } else {
                    z = true;
                }
                if (rawY2 >= ((float) (this.A07 / 2))) {
                    z4 = true;
                }
                if (z == videoCallParticipantViewLayout.A0J && z4 == videoCallParticipantViewLayout.A0I) {
                    z2 = false;
                } else {
                    videoCallParticipantViewLayout.A0J = z;
                    videoCallParticipantViewLayout.A0I = z4;
                    z2 = true;
                }
                if (z2) {
                    videoCallParticipantViewLayout.A0K = true;
                }
                AnonymousClass39O A022 = videoCallParticipantViewLayout.A02(this.A0D, this.A0C);
                if (videoCallParticipantViewLayout.A0J) {
                    i2 = A022.A00;
                } else {
                    i2 = A022.A02;
                }
                if (videoCallParticipantViewLayout.A0I) {
                    i3 = A022.A01;
                } else {
                    i3 = A022.A03;
                }
                Point point = new Point(i2, i3);
                int i10 = point.x;
                if (r0.A0M()) {
                    i4 = marginLayoutParams.leftMargin;
                } else {
                    i4 = marginLayoutParams.rightMargin;
                }
                int i11 = i10 - i4;
                int i12 = point.y - marginLayoutParams.topMargin;
                double sqrt2 = Math.sqrt((double) ((i12 * i12) + (i11 * i11)));
                long max3 = (long) Math.max(200, (int) ((500.0d * sqrt2) / this.A00));
                StringBuilder A0S4 = AnonymousClass008.A0S("VideoCallParticipantViewLayout/videoPipParticipantView/onTouch ACTION_UP xVelocity: ");
                A0S4.append(this.A05);
                A0S4.append(", yVelocity: ");
                A0S4.append(this.A06);
                A0S4.append(", velocity: ");
                A0S4.append(sqrt);
                A0S4.append(", fling: ");
                A0S4.append(z5);
                A0S4.append(", finalRawX: ");
                A0S4.append(rawX2);
                A0S4.append(", finalRawY: ");
                A0S4.append(rawY2);
                A0S4.append(", window size: ");
                A0S4.append(videoCallParticipantViewLayout.A06);
                A0S4.append("x");
                A0S4.append(videoCallParticipantViewLayout.A05);
                A0S4.append("(");
                A0S4.append(this.A00);
                A0S4.append(")");
                A0S4.append(", container size: ");
                A0S4.append(this.A08);
                A0S4.append("x");
                A0S4.append(this.A07);
                A0S4.append(", pipAtRight: ");
                A0S4.append(z);
                A0S4.append(", pipAtBottom: ");
                A0S4.append(z4);
                A0S4.append(", moving distance: ");
                A0S4.append(sqrt2);
                A0S4.append(", duration: ");
                A0S4.append(max3);
                Log.i(A0S4.toString());
                videoCallParticipantViewLayout.A06(max3, i11, i12);
                return true;
            }
        } else {
            throw null;
        }
    }
}
