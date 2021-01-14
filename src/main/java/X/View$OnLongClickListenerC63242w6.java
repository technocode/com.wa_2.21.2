package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2w6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC63242w6 implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass3XM A00;
    public final /* synthetic */ C73773Yq A01;

    public /* synthetic */ View$OnLongClickListenerC63242w6(C73773Yq r1, AnonymousClass3XM r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final boolean onLongClick(View view) {
        C73773Yq r4 = this.A01;
        AnonymousClass3XM r3 = this.A00;
        ClipboardManager A05 = r4.A0F.A05();
        if (A05 == null) {
            r4.A0C.A06(R.string.view_contact_unsupport, 0);
            return true;
        }
        try {
            String str = r3.A06.A07;
            A05.setPrimaryClip(ClipData.newPlainText(str, str));
            r4.A0C.A06(R.string.upi_mandate_number_copied, 0);
            return true;
        } catch (NullPointerException unused) {
            r4.A0C.A06(R.string.view_contact_unsupport, 0);
            return true;
        }
    }
}
