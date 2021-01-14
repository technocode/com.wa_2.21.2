package X;

import com.whatsapp.payments.ui.BrazilPayBloksActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.3FG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FG implements AbstractC48012Ko {
    public final /* synthetic */ C28021Sn A00;
    public final /* synthetic */ BrazilPayBloksActivity A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ HashMap A03;

    public /* synthetic */ AnonymousClass3FG(BrazilPayBloksActivity brazilPayBloksActivity, ArrayList arrayList, C28021Sn r3, HashMap hashMap) {
        this.A01 = brazilPayBloksActivity;
        this.A02 = arrayList;
        this.A00 = r3;
        this.A03 = hashMap;
    }

    @Override // X.AbstractC48012Ko
    public final void ACf(List list) {
        BrazilPayBloksActivity brazilPayBloksActivity = this.A01;
        ArrayList arrayList = this.A02;
        C28021Sn r3 = this.A00;
        HashMap hashMap = this.A03;
        JSONArray A032 = brazilPayBloksActivity.A0A.A03(arrayList);
        if (C60842s5.A02(arrayList)) {
            AnonymousClass1PT.A04(null, -233, r3);
            return;
        }
        if (A032 != null) {
            hashMap.put("verify_methods", A032.toString());
        }
        if (r3.A00) {
            AnonymousClass008.A0f(r3, "on_success", hashMap, r3.A03);
        }
    }
}
