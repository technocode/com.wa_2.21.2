package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.3FF  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FF implements AbstractC61252ss {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;

    public /* synthetic */ AnonymousClass3FF(BrazilPayBloksActivity brazilPayBloksActivity, C28021Sn r2) {
        this.A01 = brazilPayBloksActivity;
        this.A00 = r2;
    }

    @Override // X.AbstractC61252ss
    public final void AGU(List list, C61072sS r6) {
        C28021Sn r3 = this.A00;
        if (r6 == null) {
            JSONArray A012 = C60842s5.A01(list);
            if (A012 != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("banks", A012.toString());
                if (r3.A00) {
                    AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
                    return;
                }
                return;
            }
            r3.A00("on_failure");
            return;
        }
        r3.A00("on_failure");
    }
}
