package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.text.TextUtils;
import android.view.View;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.32S  reason: invalid class name */
public final /* synthetic */ class AnonymousClass32S implements View.OnLongClickListener {
    public final /* synthetic */ C71453Pa A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ AnonymousClass32S(C71453Pa r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public final boolean onLongClick(View view) {
        C71453Pa r4 = this.A00;
        String str = this.A01;
        ClipboardManager A05 = ((AnonymousClass32V) r4).A02.A05();
        if (A05 == null) {
            ((AnonymousClass32V) r4).A01.A06(R.string.view_contact_unsupport, 0);
            return true;
        } else if (TextUtils.isEmpty(str)) {
            return true;
        } else {
            try {
                A05.setPrimaryClip(ClipData.newPlainText(str, str));
                ((AnonymousClass32V) r4).A01.A06(R.string.link_copied_confirmation, 0);
                return true;
            } catch (NullPointerException e) {
                Log.e("invitelink/copy/npe", e);
                ((AnonymousClass32V) r4).A01.A06(R.string.view_contact_unsupport, 0);
                return true;
            }
        }
    }
}
