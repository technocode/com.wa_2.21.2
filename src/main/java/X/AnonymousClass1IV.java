package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.whatsapp.MessageReplyActivity;

/* renamed from: X.1IV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1IV implements InputFilter {
    public final /* synthetic */ MessageReplyActivity A00;

    public /* synthetic */ AnonymousClass1IV(MessageReplyActivity messageReplyActivity) {
        this.A00 = messageReplyActivity;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.A00.A09.A0P()) {
            return "";
        }
        return null;
    }
}
