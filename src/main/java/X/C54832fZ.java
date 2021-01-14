package X;

import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.group.NewGroup;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2fZ  reason: invalid class name and case insensitive filesystem */
public class C54832fZ extends AnonymousClass1NN implements AnonymousClass1XK, AnonymousClass1W0, AbstractC29101Xb {
    public AnonymousClass2CD A00;
    public String A01;
    public List A02;
    public final AnonymousClass00S A03;
    public final AnonymousClass0A8 A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0EO A06;
    public final AnonymousClass1Xa A07;
    public final AnonymousClass01R A08;
    public final AnonymousClass0C4 A09;

    public C54832fZ(AnonymousClass00S r4, AnonymousClass0C4 r5, AnonymousClass01K r6, AnonymousClass0EO r7, AnonymousClass01R r8, AnonymousClass0A8 r9, AnonymousClass2CD r10, String str, List list, AnonymousClass1Xa r13) {
        this.A03 = r4;
        this.A09 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A04 = r9;
        this.A00 = r10;
        this.A01 = str;
        this.A02 = list;
        this.A07 = r13;
        StringBuilder sb = new StringBuilder("GroupResponseHandler - gid:");
        sb.append(r10);
        sb.append(" subject:");
        String str2 = "";
        sb.append(str == null ? str2 : str);
        sb.append(" pa:");
        AnonymousClass008.A1S(sb, list != null ? Arrays.deepToString(list.toArray()) : str2);
    }

    @Override // X.AnonymousClass1NN
    public void A00() {
        Log.i("groupmgr/group_request/timeout/type: 14");
        super.A01 = true;
        AnonymousClass0EO r0 = this.A06;
        r0.A0k.remove(this.A00);
        this.A05.A0J(this.A08.A03(this.A00, this.A03.A05(), 3, this.A01, this.A02));
        AnonymousClass1Xa r02 = this.A07;
        if (r02 != null) {
            this.A09.A0E(r02.A01, 500);
        }
        this.A04.A07(this.A00, false);
    }

    public void A01(AnonymousClass02U r4) {
        super.A02.cancel();
        super.A00 = true;
        StringBuilder sb = new StringBuilder("groupmgr/request success : ");
        sb.append(r4);
        sb.append(" | ");
        sb.append(14);
        Log.i(sb.toString());
        AnonymousClass1Xa r0 = this.A07;
        if (r0 != null) {
            this.A09.A0E(r0.A01, 200);
        }
        this.A04.A07(this.A00, false);
    }

    @Override // X.AnonymousClass1XK
    public void AN9(int i) {
        StringBuilder A0T = AnonymousClass008.A0T("groupmgr/request failed : ", i, " | ");
        A0T.append(this.A00);
        A0T.append(" | ");
        A0T.append(14);
        Log.e(A0T.toString());
        super.A02.cancel();
        AnonymousClass0EO r0 = this.A06;
        r0.A0k.remove(this.A00);
        if (i == 406) {
            AnonymousClass0EO.A02(2003, this.A01);
        } else if (i == 429) {
            AnonymousClass0EO.A02(2004, this.A01);
        } else if (i != 500) {
            AnonymousClass0EO.A02(2001, this.A01);
        } else {
            AnonymousClass0EO.A02(2002, this.A01);
        }
        this.A05.A0J(this.A08.A03(this.A00, this.A03.A05(), 3, this.A01, this.A02));
        AnonymousClass1Xa r02 = this.A07;
        if (r02 != null) {
            this.A09.A0E(r02.A01, i);
        }
        this.A04.A07(this.A00, false);
    }

    @Override // X.AbstractC29101Xb
    public void ANB(C64502yI r6) {
        if (this instanceof C60052oi) {
            NewGroup newGroup = ((C60052oi) this).A00;
            if (newGroup.A0E.A0D(AbstractC000400g.A18)) {
                Map map = r6.A02;
                if (map.size() > 0) {
                    Set keySet = map.keySet();
                    Intent A042 = InviteGroupParticipantsActivity.A04(newGroup, r6);
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("jids", AnonymousClass1VY.A0F(keySet));
                    bundle.putParcelable("invite_intent", A042);
                    newGroup.A01 = bundle;
                }
            }
        }
    }
}
