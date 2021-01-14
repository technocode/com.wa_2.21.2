package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.2Zj  reason: invalid class name and case insensitive filesystem */
public class C51602Zj extends AnonymousClass0JW {
    public AnonymousClass0BP A00;
    public final AnonymousClass08B A01;
    public final AnonymousClass0HN A02;
    public final UserJid A03;
    public final WeakReference A04;
    public final CountDownLatch A05 = new CountDownLatch(1);

    public C51602Zj(ActivityC004602e r3, AnonymousClass08B r4, AnonymousClass0HN r5, UserJid userJid) {
        this.A04 = new WeakReference(r3);
        this.A01 = r4;
        this.A02 = r5;
        this.A03 = userJid;
        this.A00 = new C51592Zi(this, userJid);
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A04.get();
        if (r2 != null) {
            r2.APv(0, R.string.loading_biz_profile);
        }
        this.A01.A01(this.A00);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        this.A01.A00(this.A00);
        ActivityC004702f r2 = (ActivityC004702f) this.A04.get();
        if (r2 != null) {
            r2.A0K.A00();
            r2.A0I(ContactInfoActivity.A04(this.A03, r2), false);
        }
    }
}
