package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.ChangeNumber;

/* renamed from: X.3Mb  reason: invalid class name and case insensitive filesystem */
public class C70703Mb implements AnonymousClass30O {
    public final /* synthetic */ ChangeNumber A00;

    public C70703Mb(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    @Override // X.AnonymousClass30O
    public void AI3(int i) {
        this.A00.A08.sendEmptyMessage(3);
    }

    @Override // X.AnonymousClass30O
    public void AI4(String str) {
        String str2;
        ChangeNumber changeNumber = this.A00;
        AnonymousClass01I r0 = changeNumber.A0B;
        r0.A04();
        UserJid userJid = r0.A03;
        if (userJid == null || (str2 = userJid.user) == null || !str2.equals(str)) {
            changeNumber.A08.sendEmptyMessage(2);
        } else {
            changeNumber.A08.sendEmptyMessage(1);
        }
    }
}
