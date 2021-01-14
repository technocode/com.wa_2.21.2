package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2w7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC63252w7 implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass3IE A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ View$OnLongClickListenerC63252w7(AnonymousClass3IE r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        AnonymousClass3IE r4 = this.A00;
        String str = this.A01;
        ClipboardManager A05 = r4.A0F.A05();
        if (A05 == null) {
            r4.A0C.A06(R.string.view_contact_unsupport, 0);
            return true;
        }
        try {
            A05.setPrimaryClip(ClipData.newPlainText(str, str));
            r4.A0C.A06(R.string.transaction_payment_method_id_copied, 0);
            return true;
        } catch (NullPointerException e) {
            r4.A0R.A08("getTransactionIdRow paymentTransactionID", e);
            r4.A0C.A06(R.string.view_contact_unsupport, 0);
            return true;
        }
    }
}
