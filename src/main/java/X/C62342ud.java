package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.payments.ui.IndiaUpiDebitCardVerifActivity;

/* renamed from: X.2ud  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62342ud implements TextView.OnEditorActionListener {
    public final /* synthetic */ IndiaUpiDebitCardVerifActivity A00;

    public /* synthetic */ C62342ud(IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity) {
        this.A00 = indiaUpiDebitCardVerifActivity;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        IndiaUpiDebitCardVerifActivity indiaUpiDebitCardVerifActivity = this.A00;
        if (i != 6) {
            return false;
        }
        indiaUpiDebitCardVerifActivity.A0e();
        return true;
    }
}
