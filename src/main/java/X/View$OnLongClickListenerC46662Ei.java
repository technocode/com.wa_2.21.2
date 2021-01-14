package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.2Ei  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class View$OnLongClickListenerC46662Ei implements View.OnLongClickListener {
    public final /* synthetic */ C46772Ev A00;
    public final /* synthetic */ ContactInfoActivity A01;

    public /* synthetic */ View$OnLongClickListenerC46662Ei(ContactInfoActivity contactInfoActivity, C46772Ev r2) {
        this.A01 = contactInfoActivity;
        this.A00 = r2;
    }

    public final boolean onLongClick(View view) {
        ContactInfoActivity contactInfoActivity = this.A01;
        C46772Ev r2 = this.A00;
        ClipboardManager A05 = ((ActivityC004702f) contactInfoActivity).A0I.A05();
        if (A05 == null) {
            return true;
        }
        String str = r2.A02;
        A05.setPrimaryClip(ClipData.newPlainText(str, str));
        ((ActivityC004702f) contactInfoActivity).A0F.A0C(((ChatInfoActivity) contactInfoActivity).A0A.A06(R.string.phone_copied), 0);
        return true;
    }
}
