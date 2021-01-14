package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity;

/* renamed from: X.2uz  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC62562uz implements View.OnLongClickListener {
    public final /* synthetic */ IndiaUpiPaymentSettingsActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ View$OnLongClickListenerC62562uz(IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity, String str) {
        this.A00 = indiaUpiPaymentSettingsActivity;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        IndiaUpiPaymentSettingsActivity indiaUpiPaymentSettingsActivity = this.A00;
        String str = this.A01;
        ClipboardManager A05 = ((ActivityC004702f) indiaUpiPaymentSettingsActivity).A0I.A05();
        if (A05 != null) {
            A05.setPrimaryClip(ClipData.newPlainText(str, str));
            ((ActivityC004702f) indiaUpiPaymentSettingsActivity).A0F.A0C(((AnonymousClass2C0) indiaUpiPaymentSettingsActivity).A01.A06(R.string.vpa_copied_to_clipboard), 1);
        }
        return true;
    }
}
