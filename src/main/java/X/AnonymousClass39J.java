package X;

import android.graphics.Point;
import android.view.SurfaceHolder;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;

/* renamed from: X.39J  reason: invalid class name */
public class AnonymousClass39J implements SurfaceHolder.Callback {
    public final /* synthetic */ C72723Tz A00;

    public AnonymousClass39J(C72723Tz r1) {
        this.A00 = r1;
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder A0S = AnonymousClass008.A0S("voip/VideoPort/surfaceChanged port = ");
        C72723Tz r4 = this.A00;
        A0S.append(r4.hashCode());
        A0S.append(", format: 0x");
        A0S.append(Integer.toHexString(i));
        A0S.append(", size: ");
        A0S.append(i2);
        A0S.append("x");
        A0S.append(i3);
        Log.i(A0S.toString());
        if (r4 != null) {
            AnonymousClass00E.A01();
            Log.i("voip/video/SurfaceViewVideoPort/setWindowSize enter");
            int intValue = ((Number) r4.A02(new CallableC672737x(r4, i2, i3), -100)).intValue();
            AnonymousClass39S r2 = r4.A02;
            if (r2 != null) {
                AnonymousClass3U1 r22 = (AnonymousClass3U1) r2;
                StringBuilder sb = new StringBuilder();
                sb.append(r22.A00.A07);
                sb.append("onPortWindowSizeChanged ");
                sb.append(r4.hashCode());
                sb.append(" for ");
                AnonymousClass39R r23 = r22.A00;
                AnonymousClass008.A1Q(sb, r23.A03);
                if (!(r23 instanceof AnonymousClass3UN)) {
                    AnonymousClass3UM r24 = (AnonymousClass3UM) r23;
                    if (!r24.A09()) {
                        Voip.setVideoDisplayPort(r24.A03.getRawString(), r24.A01);
                    }
                } else {
                    VideoPort videoPort = r23.A01;
                    Point point = new Point(0, 0);
                    if (videoPort != null) {
                        point = videoPort.getWindowSize();
                    }
                    Voip.setVideoPreviewSize(point.x, point.y);
                }
            }
            AnonymousClass008.A0v("voip/video/SurfaceViewVideoPort/setWindowSize with result ", intValue);
            return;
        }
        throw null;
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        StringBuilder A0S = AnonymousClass008.A0S("voip/VideoPort/surfaceCreated port = ");
        C72723Tz r1 = this.A00;
        A0S.append(r1.hashCode());
        Log.i(A0S.toString());
        r1.A04();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        StringBuilder A0S = AnonymousClass008.A0S("voip/VideoPort/surfaceDestroyed port = ");
        C72723Tz r1 = this.A00;
        A0S.append(r1.hashCode());
        Log.i(A0S.toString());
        r1.A03();
    }
}
