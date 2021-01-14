package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;

/* renamed from: X.2wN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63412wN implements TextView.OnEditorActionListener {
    public final /* synthetic */ IndiaUpiDisplaySecureQrCodeView A00;

    public /* synthetic */ C63412wN(IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView) {
        this.A00 = indiaUpiDisplaySecureQrCodeView;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = this.A00;
        if (i != 6) {
            return false;
        }
        C69703Ib r2 = indiaUpiDisplaySecureQrCodeView.A0C;
        r2.A03.A07(indiaUpiDisplaySecureQrCodeView.A0B.getText().toString());
        return true;
    }
}
