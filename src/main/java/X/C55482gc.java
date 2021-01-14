package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import java.util.List;

/* renamed from: X.2gc  reason: invalid class name and case insensitive filesystem */
public class C55482gc extends AbstractC16300pa {
    public List A00;
    public final /* synthetic */ InviteGroupParticipantsActivity A01;

    public C55482gc(InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A01 = inviteGroupParticipantsActivity;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        return new C55472gb(this.A01.A00.inflate(R.layout.accept_invite_participant, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r7, int i) {
        C55472gb r72 = (C55472gb) r7;
        C007003k r4 = (C007003k) this.A00.get(i);
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = this.A01;
        TextView textView = r72.A01;
        if (inviteGroupParticipantsActivity != null) {
            if (!TextUtils.isEmpty(r4.A0F)) {
                textView.setText(r4.A0F);
                textView.setTextColor(C004302a.A00(inviteGroupParticipantsActivity, R.color.primary_text));
            } else if (r4.A0A()) {
                textView.setText(C014308b.A02(r4, false));
                textView.setSingleLine(false);
                textView.setTextColor(C004302a.A00(inviteGroupParticipantsActivity, R.color.primary_text));
            } else {
                String A08 = inviteGroupParticipantsActivity.A0E.A08((AnonymousClass02N) r4.A02(AnonymousClass02N.class));
                if (!TextUtils.isEmpty(A08)) {
                    textView.setSingleLine(false);
                    textView.setTextColor(C004302a.A00(inviteGroupParticipantsActivity, R.color.primary_text));
                } else if (!TextUtils.isEmpty(r4.A0O)) {
                    StringBuilder A0S = AnonymousClass008.A0S("~");
                    A0S.append(r4.A0O);
                    A08 = A0S.toString();
                    textView.setSingleLine(false);
                    textView.setTextColor(C004302a.A00(inviteGroupParticipantsActivity, R.color.secondary_text));
                } else {
                    A08 = inviteGroupParticipantsActivity.A0D.A0F(C12420i4.A00(r4));
                    textView.setSingleLine(true);
                    textView.setTextColor(C004302a.A00(inviteGroupParticipantsActivity, R.color.primary_text));
                }
                textView.setText(A08);
            }
            AnonymousClass0YX r5 = inviteGroupParticipantsActivity.A03;
            r5.A04(r4, r72.A00, false, new C12260ho(r5.A04.A01, r4));
            return;
        }
        throw null;
    }
}
