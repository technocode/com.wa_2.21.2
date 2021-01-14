package X;

import com.whatsapp.MatchPhoneNumberFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1sw  reason: invalid class name and case insensitive filesystem */
public class C40281sw implements AnonymousClass30O {
    public final /* synthetic */ MatchPhoneNumberFragment A00;

    public C40281sw(MatchPhoneNumberFragment matchPhoneNumberFragment) {
        this.A00 = matchPhoneNumberFragment;
    }

    @Override // X.AnonymousClass30O
    public void AI3(int i) {
        this.A00.A00.sendEmptyMessage(3);
    }

    @Override // X.AnonymousClass30O
    public void AI4(String str) {
        MatchPhoneNumberFragment matchPhoneNumberFragment = this.A00;
        AnonymousClass01I r0 = matchPhoneNumberFragment.A02;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid != null) {
            String str2 = userJid.user;
            if (str2 != null) {
                int i = 2;
                if (str2.equals(str)) {
                    i = 1;
                }
                matchPhoneNumberFragment.A00.sendEmptyMessage(i);
                return;
            }
            throw null;
        }
        throw null;
    }
}
