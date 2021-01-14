package com.whatsapp.payments.ui;

import X.AbstractActivityC29861aJ;
import X.AnonymousClass0Fh;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import X.C018809u;
import X.C69353Gs;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.QrScannerView;

public final class IndiaUpiQrCodeScanActivity extends AbstractActivityC29861aJ {
    public final C018809u A00 = C018809u.A00("IndiaUpiQrCodeScanActivity", "payment", "IN");
    public final AnonymousClass0Fh A01 = AnonymousClass0Fh.A00();

    @Override // X.AnonymousClass2C0, X.AbstractActivityC29861aJ, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        A0A().A0H(5);
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(getLayoutInflater().inflate(R.layout.india_upi_qr_code_scanner, (ViewGroup) null, false));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A08(((AnonymousClass2C0) this).A01.A06(R.string.menuitem_scan_qr));
            A09.A0A(true);
        }
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A0O(false);
            QrScannerView qrScannerView = (QrScannerView) findViewById(R.id.camera);
            ((AbstractActivityC29861aJ) this).A04 = qrScannerView;
            qrScannerView.A06 = new C69353Gs(this);
            findViewById(R.id.overlay).setVisibility(0);
            if (((AbstractActivityC29861aJ) this).A07) {
                ((AbstractActivityC29861aJ) this).A04.A04.setOneShotPreviewCallback(((AbstractActivityC29861aJ) this).A08);
            }
            A0T();
            return;
        }
        throw null;
    }
}
