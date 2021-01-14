package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.HandlerThread;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.WindowManager;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.1ew  reason: invalid class name and case insensitive filesystem */
public class TextureView$SurfaceTextureListenerC32431ew implements TextureView.SurfaceTextureListener {
    public int A00;
    public int A01 = -1;
    public int A02 = -1;
    public int A03;
    public int A04;
    public AbstractC19770va A05;
    public AbstractC19820vf A06;
    public AbstractC19830vg A07;
    public C32371eq A08;
    public C21960zc A09;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final HandlerThread A0E;
    public final OrientationEventListener A0F;
    public final TextureView A0G;
    public final C32391es A0H = new C32391es(this);
    public final C32401et A0I = new C32401et(this);
    public final C19860vj A0J;
    public final C32451ey A0K;
    public final EnumC21070y8 A0L;
    public final AbstractC21080y9 A0M;
    public final C21120yD A0N = new C21120yD();
    public final AbstractC21140yF A0O = new C32381er(this);
    public final AbstractC21150yG A0P = new C32411eu(this);
    public final AbstractC33031g5 A0Q = new C454424v(this);
    public final AbstractC33031g5 A0R = new C454524w(this);
    public final Object A0S = new Object();
    public final String A0T;
    public volatile AbstractC19840vh A0U;
    public volatile boolean A0V;

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: X.1gA */
    /* JADX WARN: Multi-variable type inference failed */
    public TextureView$SurfaceTextureListenerC32431ew(Context context, C32451ey r11, boolean z) {
        C33171gJ r1;
        AnonymousClass0VV r0;
        EnumC21070y8 r8 = EnumC21070y8.CAMERA2;
        EnumC21070y8 r7 = EnumC21070y8.CAMERA1;
        this.A0D = context.getApplicationContext();
        this.A0T = "WhatsAppCamera";
        this.A0L = z ? r8 : r7;
        this.A0K = r11;
        this.A0J = new C19860vj();
        HandlerThread handlerThread = new HandlerThread("Simple-Lite-Camera-Callback-Thread");
        this.A0E = handlerThread;
        handlerThread.start();
        C21110yC A002 = C21110yC.A00();
        Context context2 = this.A0D;
        EnumC21070y8 r4 = this.A0L;
        if (A002 != null) {
            if (r4 == r7) {
                C22170zz r5 = A002.A01;
                C22150zx r42 = A002.A00;
                if (C33081gA.A0e == null) {
                    synchronized (C33081gA.class) {
                        if (C33081gA.A0e == null) {
                            C33081gA.A0e = new C33081gA(r5, r42, context2);
                        }
                    }
                } else if (C33081gA.A0e.A0R != r5) {
                    throw new RuntimeException("ThreadManager instance has changed!");
                } else if (C33081gA.A0e.A0Q != r42) {
                    throw new RuntimeException("SessionManager instance has changed!");
                }
                C33081gA r12 = C33081gA.A0e;
                r12.A0D = true;
                r1 = r12;
            } else if (r4 != r8) {
                StringBuilder sb = new StringBuilder("Invalid Camera API: ");
                sb.append(r4);
                throw new RuntimeException(sb.toString());
            } else if (context2 != null) {
                C22170zz r52 = A002.A01;
                C22150zx r43 = A002.A00;
                if (C33171gJ.A0o == null) {
                    synchronized (C33171gJ.class) {
                        if (C33171gJ.A0o == null) {
                            C33171gJ.A0o = new C33171gJ(r52, r43, context2);
                        }
                    }
                } else if (C33171gJ.A0o.A0b != r52) {
                    throw new RuntimeException("ThreadManager instance has changed!");
                } else if (C33171gJ.A0o.A0a != r43) {
                    throw new RuntimeException("SessionManager instance has changed!");
                }
                C33171gJ r13 = C33171gJ.A0o;
                r13.A0J = true;
                r1 = r13;
            } else {
                throw new NullPointerException("Context must be provided for Camera2.");
            }
            this.A0M = r1;
            if (0 == 0) {
                r0 = AnonymousClass0VV.BACK;
            } else if (0 == 1) {
                r0 = AnonymousClass0VV.FRONT;
            } else {
                throw new RuntimeException(AnonymousClass008.A0F("Could not convert camera facing to optic: ", 0));
            }
            this.A00 = !r1.AAF(r0) ? 1 : 0;
            this.A0C = true;
            TextureView textureView = new TextureView(this.A0D);
            this.A0G = textureView;
            textureView.setSurfaceTextureListener(this);
            this.A0F = new C19850vi(this, this.A0D);
            return;
        }
        throw null;
    }

    public final int A00() {
        WindowManager windowManager = (WindowManager) this.A0D.getSystemService("window");
        if (windowManager != null) {
            return windowManager.getDefaultDisplay().getRotation();
        }
        return 0;
    }

    public final AnonymousClass0VO A01() {
        AbstractC21080y9 r1 = this.A0M;
        if (r1 == null || !r1.isConnected()) {
            return null;
        }
        try {
            return r1.A5B();
        } catch (C21100yB unused) {
            return null;
        }
    }

    public void A02(int i) {
        if (this.A00 != 1) {
            C22010zh r2 = new C22010zh();
            r2.A01(AnonymousClass0VN.A09, Integer.valueOf(AnonymousClass0N2.A02(i)));
            this.A0M.AC9(r2.A00(), new AnonymousClass254());
        }
    }

    public void A03(AbstractC19820vf r3) {
        if (!this.A0C) {
            AbstractC21080y9 r1 = this.A0M;
            if (r1.isConnected()) {
                if (r3 != null) {
                    r1.A1q(this.A0P);
                } else if (this.A06 != null) {
                    r1.AMf(this.A0P);
                }
            }
        }
        this.A06 = r3;
    }

    public final void A04(C21960zc r4) {
        AbstractC21080y9 r2 = this.A0M;
        if (r2.isConnected() && r4 != null) {
            int A002 = A00();
            if (this.A02 == A002) {
                this.A0J.A00(15, new Object[]{this, this.A09, Integer.valueOf(this.A04), Integer.valueOf(this.A03)});
                return;
            }
            this.A02 = A002;
            r2.AOt(A002, new C454224t(this));
        }
    }

    public final boolean A05() {
        AnonymousClass0VO A012 = A01();
        return A012 != null && ((Boolean) A012.A00(AnonymousClass0VO.A0J)).booleanValue();
    }

    @Override // java.lang.Object
    public void finalize() {
        if (Build.VERSION.SDK_INT >= 18) {
            this.A0E.quitSafely();
        } else {
            this.A0E.quit();
        }
        super.finalize();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C32451ey r0 = this.A0K;
        r0.A05 = i;
        r0.A03 = i2;
        synchronized (r0.A0A) {
            r0.A0C = surfaceTexture;
            r0.A09.countDown();
        }
        onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C19870vk r0;
        C32451ey r4 = this.A0K;
        synchronized (r4.A0A) {
            if (r4.A0C != null) {
                r4.A0B = null;
                r4.A0C = null;
                r4.A09 = new CountDownLatch(1);
            }
            if (C32451ey.A0E && (r0 = r4.A0D) != null) {
                r0.A03(null, 0);
            }
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C32451ey r0 = this.A0K;
        r0.A05 = i;
        r0.A03 = i2;
        this.A04 = i;
        this.A03 = i2;
        A04(this.A09);
    }
}
