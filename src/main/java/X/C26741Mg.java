package X;

import android.text.TextUtils;
import com.whatsapp.MessageDetailsActivity;
import com.whatsapp.jid.UserJid;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Mg  reason: invalid class name and case insensitive filesystem */
public class C26741Mg implements Comparator {
    public Map A00 = new HashMap(this.A02.A0U.size());
    public final C26381Kq A01;
    public final /* synthetic */ MessageDetailsActivity A02;

    public C26741Mg(MessageDetailsActivity messageDetailsActivity) {
        this.A02 = messageDetailsActivity;
        this.A01 = new C26381Kq(messageDetailsActivity.A0F, ((AnonymousClass2C0) messageDetailsActivity).A01);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        C26781Mk r6 = (C26781Mk) obj;
        C26781Mk r7 = (C26781Mk) obj2;
        int A002 = C12080hW.A00(r7.A00(), r6.A00());
        if (A002 != 0) {
            return A002;
        }
        UserJid userJid = r6.A01;
        if (userJid != null) {
            UserJid userJid2 = r7.A01;
            if (userJid2 == null) {
                return -1;
            }
            C007003k r3 = (C007003k) this.A00.get(userJid);
            if (r3 == null) {
                r3 = this.A02.A0C.A0A(userJid);
                this.A00.put(userJid, r3);
            }
            C007003k r2 = (C007003k) this.A00.get(userJid2);
            if (r2 == null) {
                r2 = this.A02.A0C.A0A(userJid2);
                this.A00.put(userJid2, r2);
            }
            boolean z = !TextUtils.isEmpty(r3.A0F);
            if (z == (!TextUtils.isEmpty(r2.A0F))) {
                return this.A01.compare(r3, r2);
            }
            if (z) {
                return -1;
            }
            return 1;
        } else if (r7.A01 == null) {
            return 0;
        } else {
            return 1;
        }
    }
}
