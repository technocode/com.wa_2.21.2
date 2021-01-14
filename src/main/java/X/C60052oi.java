package X;

import com.whatsapp.group.NewGroup;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2oi  reason: invalid class name and case insensitive filesystem */
public class C60052oi extends C54832fZ {
    public final /* synthetic */ NewGroup A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60052oi(NewGroup newGroup, AnonymousClass00S r13, AnonymousClass0C4 r14, AnonymousClass01K r15, AnonymousClass0EO r16, AnonymousClass01R r17, AnonymousClass0A8 r18, AnonymousClass2CD r19, String str, List list) {
        super(r13, r14, r15, r16, r17, r18, r19, str, list, null);
        this.A00 = newGroup;
    }

    @Override // X.AnonymousClass1NN, X.C54832fZ
    public void A00() {
        Log.i("newgroup/CreateGroupResponseHandler/onTimeout");
        super.A00();
        AnonymousClass02M r2 = ((ActivityC004702f) this.A00).A0F;
        r2.A02.post(new RunnableEBaseShape10S0100000_I1_5(this, 14));
    }

    @Override // X.AnonymousClass1W0
    public void ANA(Jid jid) {
        AnonymousClass02U r4 = (AnonymousClass02U) jid;
        NewGroup newGroup = this.A00;
        newGroup.A0c.set(r4);
        if (newGroup.A0H.A02(newGroup.A0S).exists()) {
            AnonymousClass02M r2 = ((ActivityC004702f) newGroup).A0F;
            r2.A02.post(new RunnableEBaseShape8S0200000_I1_3(this, r4, 14));
        }
        super.A01(r4);
    }
}
