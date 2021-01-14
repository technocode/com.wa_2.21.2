package X;

import com.whatsapp.MentionPickerView;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.1sy  reason: invalid class name and case insensitive filesystem */
public class C40301sy extends AnonymousClass0JW {
    public final AnonymousClass01K A00 = AnonymousClass01K.A00();
    public final UserJid A01;
    public final CharSequence A02;
    public final /* synthetic */ MentionPickerView A03;

    public C40301sy(MentionPickerView mentionPickerView, UserJid userJid, CharSequence charSequence) {
        this.A03 = mentionPickerView;
        this.A01 = userJid;
        this.A02 = charSequence;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Set set = (Set) obj;
        MentionPickerView mentionPickerView = this.A03;
        mentionPickerView.A05 = true;
        AnonymousClass1t2 r3 = mentionPickerView.A02;
        if (r3.A04 == null) {
            r3.A04 = new C26701Mc(r3.A0B, r3.A0E);
        }
        r3.A04.A00 = set;
        mentionPickerView.A02.getFilter().filter(this.A02);
    }
}
