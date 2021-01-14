package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass00D;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass0Fh;
import X.AnonymousClass3MH;
import X.C002001d;
import X.C37251nt;
import X.C64852yu;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickEBaseShape8S0100000_I1_6;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaFragment;
import com.whatsapp.qrcode.QrEducationDialogFragment;
import com.whatsapp.qrcode.QrScannerOverlay;
import com.whatsapp.qrcode.QrScannerView;

public class QrScanCodeFragment extends WaFragment {
    public Handler A00;
    public HandlerThread A01;
    public View A02;
    public ImageView A03;
    public QrScannerOverlay A04;
    public QrScannerView A05;
    public String A06;
    public boolean A07 = false;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Camera.PreviewCallback A0B = new C64852yu(this);
    public final C37251nt A0C = new C37251nt();
    public final AnonymousClass02M A0D = AnonymousClass02M.A00();
    public final AnonymousClass00D A0E = AnonymousClass00D.A00();
    public final AnonymousClass01X A0F = AnonymousClass01X.A00();
    public final AnonymousClass0Fh A0G = AnonymousClass0Fh.A00();
    public final Runnable A0H = new RunnableEBaseShape12S0100000_I1_7(this, 17);
    public final Runnable A0I = new RunnableEBaseShape12S0100000_I1_7(this, 16);

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.contact_qr_scan_code, viewGroup, false);
        this.A05 = (QrScannerView) inflate.findViewById(R.id.camera);
        this.A04 = (QrScannerOverlay) inflate.findViewById(R.id.overlay);
        this.A02 = inflate.findViewById(R.id.qr_scan_from_gallery);
        this.A03 = (ImageView) inflate.findViewById(R.id.qr_scan_flash);
        this.A08 = this.A0E.A00.getBoolean("contact_qr_education", true);
        this.A03.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 16));
        this.A02.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 15));
        QrScannerView qrScannerView = this.A05;
        qrScannerView.A06 = new AnonymousClass3MH(this);
        qrScannerView.setContentDescription(A0F(R.string.contact_qr_scan_a_qr_code));
        C002001d.A2w(this.A0F, this.A05, R.string.accessibility_action_camera_focus);
        this.A05.setOnClickListener(new ViewOnClickEBaseShape8S0100000_I1_6(this, 14));
        A0p();
        HandlerThread handlerThread = new HandlerThread("QrDecode");
        this.A01 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.A01.getLooper());
        this.A00 = handler;
        this.A05.A05 = handler;
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        this.A01.quit();
        AnonymousClass02M r0 = this.A0D;
        r0.A02.removeCallbacks(this.A0H);
        this.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        this.A0U = true;
        AnonymousClass02M r0 = this.A0D;
        r0.A02.removeCallbacks(this.A0H);
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        this.A0U = true;
        if (this.A0A && !this.A09 && !this.A08) {
            AnonymousClass02M r0 = this.A0D;
            r0.A02.postDelayed(this.A0H, 15000);
        }
    }

    public void A0n() {
        AnonymousClass02M r1 = this.A0D;
        Runnable runnable = this.A0I;
        Handler handler = r1.A02;
        handler.removeCallbacks(runnable);
        this.A0A = true;
        A0p();
        Runnable runnable2 = this.A0H;
        handler.removeCallbacks(runnable2);
        if (this.A08) {
            if (A0W()) {
                C002001d.A2o(A0C(), new QrEducationDialogFragment());
                this.A07 = true;
            }
        } else if (!this.A09) {
            handler.postDelayed(runnable2, 15000);
        }
    }

    public final void A0o() {
        if (this.A05.A08) {
            boolean z = false;
            this.A03.setVisibility(0);
            QrScannerView qrScannerView = this.A05;
            Camera camera = qrScannerView.A04;
            if (camera != null && qrScannerView.A08) {
                z = "torch".equals(camera.getParameters().getFlashMode());
                qrScannerView.A09 = z;
            }
            ImageView imageView = this.A03;
            int i = R.drawable.flash_off;
            if (z) {
                i = R.drawable.flash_on;
            }
            imageView.setImageResource(i);
            ImageView imageView2 = this.A03;
            AnonymousClass01X r1 = this.A0F;
            int i2 = R.string.flash_off_action;
            if (!z) {
                i2 = R.string.flash_on_action;
            }
            imageView2.setContentDescription(r1.A06(i2));
            return;
        }
        this.A03.setVisibility(8);
    }

    public final void A0p() {
        QrScannerView qrScannerView = this.A05;
        if (qrScannerView != null) {
            int i = 0;
            int i2 = 8;
            if (this.A0A) {
                i2 = 0;
            }
            qrScannerView.setVisibility(i2);
            QrScannerOverlay qrScannerOverlay = this.A04;
            if (!this.A0A) {
                i = 8;
            }
            qrScannerOverlay.setVisibility(i);
        }
    }
}
