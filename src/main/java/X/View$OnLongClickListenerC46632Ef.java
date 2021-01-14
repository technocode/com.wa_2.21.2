package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.2Ef  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC46632Ef implements View.OnLongClickListener {
    public final /* synthetic */ ContactInfoActivity A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ View$OnLongClickListenerC46632Ef(ContactInfoActivity contactInfoActivity, String str) {
        this.A00 = contactInfoActivity;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        ContactInfoActivity contactInfoActivity = this.A00;
        String str = this.A01;
        ClipboardManager A05 = ((ActivityC004702f) contactInfoActivity).A0I.A05();
        if (A05 == null) {
            return true;
        }
        A05.setPrimaryClip(ClipData.newPlainText(str, str));
        ((ActivityC004702f) contactInfoActivity).A0F.A0C(((ChatInfoActivity) contactInfoActivity).A0A.A06(R.string.phone_copied), 0);
        return true;
    }
}
