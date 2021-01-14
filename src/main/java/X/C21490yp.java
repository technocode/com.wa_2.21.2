package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.0yp  reason: invalid class name and case insensitive filesystem */
public class C21490yp implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public Camera A02;
    public AnonymousClass0VV A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new C21470yn(this));
    public final C21120yD A05 = new C21120yD();
    public final C21950zb A06;
    public final C22170zz A07;
    public final Callable A08 = new CallableC21480yo(this);
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public C21490yp(C21950zb r4, C22170zz r5) {
        this.A06 = r4;
        this.A07 = r5;
    }

    public void A00(int i) {
        if (this.A0B && i != this.A09 && i <= this.A00 && i >= 0) {
            if (AnonymousClass100.A01()) {
                throw new RuntimeException("Attempting to zoom on the UI thread!");
            } else if (this.A0D) {
                synchronized (this) {
                    this.A01 = i;
                    if (!this.A0E) {
                        this.A0E = true;
                        this.A02.startSmoothZoom(i);
                    } else if (!this.A0C) {
                        this.A0C = true;
                        this.A02.stopSmoothZoom();
                    }
                }
            } else {
                try {
                    C33331gZ A002 = this.A06.A00(this.A03);
                    ((AbstractC22030zj) A002).A00.A01(AnonymousClass0VN.A0k, Integer.valueOf(i));
                    A002.A00();
                    onZoomChange(i, true, this.A02);
                } catch (Exception e) {
                    RuntimeException runtimeException = new RuntimeException(AnonymousClass008.A0F("Failed to set zoom level to: ", i), e);
                    synchronized (this) {
                        Handler handler = this.A04;
                        handler.sendMessage(handler.obtainMessage(2, runtimeException));
                    }
                }
            }
        }
    }

    public synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        int i2 = 0;
        if (this.A0D) {
            boolean z2 = false;
            if (!z) {
                z2 = true;
            }
            this.A0E = z2;
            if (z) {
                this.A0C = false;
                if (this.A0B && this.A01 != i) {
                    this.A07.A06(this.A08, "update_zoom_level");
                }
            }
        }
        Handler handler = this.A04;
        if (z) {
            i2 = 1;
        }
        handler.sendMessage(handler.obtainMessage(1, i, i2));
    }
}
