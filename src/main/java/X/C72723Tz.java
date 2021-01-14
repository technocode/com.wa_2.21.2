package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.3Tz  reason: invalid class name and case insensitive filesystem */
public final class C72723Tz implements VideoPort {
    public HandlerThread A00;
    public SurfaceHolder.Callback A01 = new AnonymousClass39J(this);
    public AnonymousClass39S A02;
    public AnonymousClass3C1 A03;
    public boolean A04;
    public final Handler A05;
    public final SurfaceView A06;
    public final GlVideoRenderer A07;

    public C72723Tz(SurfaceView surfaceView) {
        AnonymousClass00E.A01();
        this.A06 = surfaceView;
        this.A07 = new GlVideoRenderer();
        StringBuilder A0S = AnonymousClass008.A0S("VideoPort_");
        A0S.append(surfaceView.hashCode());
        HandlerThread handlerThread = new HandlerThread(A0S.toString());
        this.A00 = handlerThread;
        handlerThread.start();
        this.A05 = new Handler(this.A00.getLooper());
        surfaceView.getHolder().addCallback(this.A01);
        A04();
    }

    public static boolean A00(AnonymousClass3C1 r1) {
        return r1 == null || !r1.A08();
    }

    public final int A01() {
        AnonymousClass3C1 r0 = this.A03;
        if (r0 != null) {
            return r0.A09() ? 0 : -3;
        }
        throw null;
    }

    public final Object A02(Callable callable, Object obj) {
        if (Thread.currentThread() == this.A00) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            Exchanger exchanger = new Exchanger();
            if (!this.A05.post(new RunnableEBaseShape2S0300000_I1(this, exchanger, callable, 43))) {
                return obj;
            }
            try {
                return exchanger.exchange(null);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final void A03() {
        AnonymousClass00E.A01();
        Log.i("voip/video/SurfaceViewVideoPort/closePort enter");
        if (!this.A04) {
            Log.i("voip/video/SurfaceViewVideoPort/closePort already closed");
            return;
        }
        AnonymousClass39S r0 = this.A02;
        if (r0 != null) {
            ((AnonymousClass3U1) r0).A01(this);
        }
        int intValue = ((Number) A02(new CallableC672937z(this), -100)).intValue();
        this.A04 = false;
        AnonymousClass008.A0v("voip/video/SurfaceViewVideoPort/closePort with result ", intValue);
    }

    public final void A04() {
        AnonymousClass00E.A01();
        Log.i("voip/video/SurfaceViewVideoPort/openPort enter");
        if (this.A04) {
            Log.i("voip/video/SurfaceViewVideoPort/openPort already opened");
            return;
        }
        Surface surface = this.A06.getHolder().getSurface();
        if (surface == null || !surface.isValid()) {
            Log.i("voip/video/SurfaceViewVideoPort/openPort no surface");
            return;
        }
        this.A04 = true;
        int intValue = ((Number) A02(new CallableC672837y(this, surface), -100)).intValue();
        AnonymousClass39S r0 = this.A02;
        if (r0 != null) {
            ((AnonymousClass3U1) r0).A00(this);
        }
        AnonymousClass008.A0v("voip/video/SurfaceViewVideoPort/openPort exit with result ", intValue);
    }

    public final void A05() {
        if (this.A03 != null) {
            this.A07.release();
            try {
                this.A03.A03();
                this.A03.A06();
                this.A03.A05();
            } catch (Exception e) {
                Log.e(e);
            }
            this.A03 = null;
        }
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public AnonymousClass39I createSurfaceTexture() {
        return (AnonymousClass39I) A02(AnonymousClass382.A00, null);
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public Context getContext() {
        return this.A06.getContext();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public SurfaceHolder getSurfaceHolder() {
        return this.A06.getHolder();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public Point getWindowSize() {
        return (Point) A02(new AnonymousClass383(this), new Point(0, 0));
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public void release() {
        AnonymousClass00E.A01();
        this.A06.getHolder().removeCallback(this.A01);
        A03();
        HandlerThread handlerThread = this.A00;
        if (handlerThread != null) {
            handlerThread.quit();
            this.A00 = null;
        }
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public void releaseSurfaceTexture(AnonymousClass39I r3) {
        A02(new CallableC672637w(this, r3), -100);
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5) {
        return ((Number) A02(new AnonymousClass381(this, j, i, i2, i3, i4, i5), -100)).intValue();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int renderTexture(AnonymousClass39I r3, int i, int i2) {
        return ((Number) A02(new CallableC672537v(this, r3, i, i2), -100)).intValue();
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int resetBlackScreen() {
        Log.i("voip/video/SurfaceViewVideoPort/resetBlackScreen enter");
        int intValue = ((Number) A02(new AnonymousClass380(this), -100)).intValue();
        AnonymousClass008.A0v("voip/video/SurfaceViewVideoPort/resetBlackScreen with result ", intValue);
        return intValue;
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public void setListener(AnonymousClass39S r3) {
        AnonymousClass00E.A01();
        Log.i("voip/video/SurfaceViewVideoPort/setListener enter");
        AnonymousClass39S r1 = this.A02;
        if (r3 == r1) {
            Log.i("voip/video/SurfaceViewVideoPort/setListener not changed");
            return;
        }
        if (this.A04 && r1 != null) {
            ((AnonymousClass3U1) r1).A01(this);
        }
        this.A02 = r3;
        if (this.A04 && r3 != null) {
            ((AnonymousClass3U1) r3).A00(this);
        }
        Log.i("voip/video/SurfaceViewVideoPort/setListener exit");
    }

    @Override // com.whatsapp.voipcalling.VideoPort
    public int setScaleType(int i) {
        Log.i("voip/video/SurfaceViewVideoPort/setScaleType enter");
        int intValue = ((Number) A02(new AnonymousClass384(this, i), -100)).intValue();
        AnonymousClass008.A0v("voip/video/SurfaceViewVideoPort/setScaleType with result ", intValue);
        return intValue;
    }
}
