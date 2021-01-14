package X;

import com.whatsapp.voipcalling.Voip;
import org.json.JSONObject;

/* renamed from: X.2gO  reason: invalid class name and case insensitive filesystem */
public class C55342gO extends AbstractC28771Vr {
    public final C28701Vk A00;
    public final AnonymousClass0Yz A01;
    public final AnonymousClass0Z0 A02;

    public C55342gO(AnonymousClass0Yz r1, C28701Vk r2, AnonymousClass0Z0 r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    public String A00(C28831Vx r4, JSONObject jSONObject) {
        if (!this.A00.A03(r4, jSONObject.getJSONObject("payload").getString("call_id")).equals(Voip.getCurrentCallId())) {
            return AbstractC28771Vr.A00(17, "There is no call with that call id");
        }
        AnonymousClass0Z0 r0 = this.A02;
        r0.A00.obtainMessage(1, this.A01).sendToTarget();
        return AbstractC28771Vr.A01(null);
    }
}
