package X;

import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Is  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25891Is extends RunnableEmptyBase implements Runnable {
    public final /* synthetic */ AnonymousClass0XK A00;
    public final /* synthetic */ Jid A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ RunnableC25891Is(AnonymousClass0XK r1, String str, String str2, Jid jid) {
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = jid;
    }

    public final void run() {
        AnonymousClass0XK r4 = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        Jid jid = this.A01;
        if (r4.A1J.A03()) {
            if (TextUtils.isEmpty(str) || C002001d.A3f(str, AnonymousClass2NU.A01)) {
                StringBuilder sb = new StringBuilder("app/xmpp/recv/web_action/set_push_name/error/is_biz/");
                sb.append(false);
                Log.w(sb.toString());
                r4.A13.A0E(str2, 400);
            } else {
                r4.A17.A01(str, new AnonymousClass1Xa(str2));
            }
        }
        r4.A0B.A09(str2, jid, "web");
        AnonymousClass0C4 r0 = r4.A1K;
        r0.A08();
        r0.A09();
    }
}
