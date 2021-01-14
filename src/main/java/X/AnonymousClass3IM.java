package X;

import android.content.Context;
import android.text.Editable;
import com.whatsapp.MentionableEntry;

/* renamed from: X.3IM  reason: invalid class name */
public class AnonymousClass3IM extends C07860Zy {
    public final /* synthetic */ AnonymousClass3IN A00;

    public AnonymousClass3IM(AnonymousClass3IN r1) {
        this.A00 = r1;
    }

    @Override // X.C07860Zy
    public void afterTextChanged(Editable editable) {
        AnonymousClass3IN r0 = this.A00;
        Context context = r0.A06;
        C02590Cr r2 = r0.A0A;
        AnonymousClass03P r3 = r0.A08;
        AnonymousClass022 r4 = r0.A0B;
        MentionableEntry mentionableEntry = r0.A03;
        if (mentionableEntry != null) {
            C002001d.A2U(context, r2, r3, r4, editable, mentionableEntry.getPaint(), 1.3f);
            return;
        }
        throw null;
    }
}
