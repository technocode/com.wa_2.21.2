package X;

import android.view.ViewGroup;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2fd  reason: invalid class name and case insensitive filesystem */
public class C54872fd extends AbstractC16300pa {
    public ArrayList A00;
    public List A01 = new ArrayList();
    public final /* synthetic */ GroupAdminPickerActivity A02;

    public C54872fd(GroupAdminPickerActivity groupAdminPickerActivity) {
        this.A02 = groupAdminPickerActivity;
    }

    @Override // X.AbstractC16300pa
    public int A05() {
        return this.A01.size();
    }

    @Override // X.AbstractC16300pa
    public AbstractC11910hD A06(ViewGroup viewGroup, int i) {
        GroupAdminPickerActivity groupAdminPickerActivity = this.A02;
        return new C54882fe(groupAdminPickerActivity, groupAdminPickerActivity.getLayoutInflater().inflate(R.layout.group_chat_info_row, viewGroup, false));
    }

    @Override // X.AbstractC16300pa
    public void A07(AbstractC11910hD r7, int i) {
        C54882fe r72 = (C54882fe) r7;
        C007003k r3 = (C007003k) this.A01.get(i);
        r72.A01.setVisibility(8);
        r72.A04.A03(r3, this.A00);
        this.A02.A07.A02(r3, r72.A00);
        if (!r3.A07() || r3.A0O == null) {
            r72.A02.setVisibility(8);
        } else {
            TextEmojiLabel textEmojiLabel = r72.A02;
            textEmojiLabel.setVisibility(0);
            StringBuilder A0S = AnonymousClass008.A0S("~");
            A0S.append(r3.A0O);
            textEmojiLabel.A04(A0S.toString(), this.A00, false, 0);
        }
        if (r3.A0L != null) {
            TextEmojiLabel textEmojiLabel2 = r72.A03;
            textEmojiLabel2.setVisibility(0);
            textEmojiLabel2.A02(r3.A0L);
        } else {
            r72.A03.setVisibility(8);
        }
        r72.A0H.setTag(r3.A02(UserJid.class));
    }
}
