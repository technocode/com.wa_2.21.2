package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.2hs  reason: invalid class name and case insensitive filesystem */
public class C55982hs implements AbstractC24481Az {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A01;

    @Override // X.AbstractC24481Az
    public View A6o(AnonymousClass1BR r2) {
        return null;
    }

    public C55982hs(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A01 = groupChatLiveLocationsActivity2;
        View inflate = groupChatLiveLocationsActivity2.getLayoutInflater().inflate(R.layout.live_location_map_info_window, (ViewGroup) null, false);
        this.A00 = inflate;
        AnonymousClass0Q7.A0X(inflate, 3);
    }

    @Override // X.AbstractC24481Az
    public View A6q(AnonymousClass1BR r17) {
        TextEmojiLabel textEmojiLabel;
        AnonymousClass1M5 r1;
        C49842Sk r0 = (C49842Sk) r17.A01();
        if (r0 != null) {
            C02900Dx r6 = r0.A02;
            View view = this.A00;
            GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A01;
            C014308b r13 = groupChatLiveLocationsActivity2.A0H;
            AnonymousClass01X r14 = ((AnonymousClass2C0) groupChatLiveLocationsActivity2).A01;
            C11930hF r10 = new C11930hF(view, R.id.name_in_group_tv, r13, r14, groupChatLiveLocationsActivity2.A0U);
            TextView textView = (TextView) view.findViewById(R.id.participant_info);
            View findViewById = view.findViewById(R.id.info_btn);
            AnonymousClass01I r02 = groupChatLiveLocationsActivity2.A0D;
            UserJid userJid = r6.A06;
            if (r02.A09(userJid)) {
                int A002 = C004302a.A00(groupChatLiveLocationsActivity2, R.color.live_location_bubble_me_text);
                textEmojiLabel = r10.A00;
                textEmojiLabel.setTextColor(A002);
                r10.A00();
                findViewById.setVisibility(8);
            } else {
                AnonymousClass02U A02 = AnonymousClass02U.A02(groupChatLiveLocationsActivity2.A08.A0e);
                if (A02 == null || (r1 = (AnonymousClass1M5) groupChatLiveLocationsActivity2.A0N.A01(A02).A01.get(userJid)) == null) {
                    int A003 = C004302a.A00(groupChatLiveLocationsActivity2, R.color.live_location_bubble_unknown_text);
                    textEmojiLabel = r10.A00;
                    textEmojiLabel.setTextColor(A003);
                } else {
                    int A05 = C28051Sr.A05(groupChatLiveLocationsActivity2.getResources(), r1);
                    textEmojiLabel = r10.A00;
                    textEmojiLabel.setTextColor(A05);
                }
                r10.A03(groupChatLiveLocationsActivity2.A0F.A0A(userJid), null);
                findViewById.setVisibility(0);
            }
            C002301g.A03(textEmojiLabel);
            String str = "";
            int i = r6.A03;
            if (i != -1) {
                StringBuilder A0S = AnonymousClass008.A0S(str);
                A0S.append(r14.A0A(R.plurals.location_accuracy, (long) i, Integer.valueOf(i)));
                str = A0S.toString();
            }
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
                textView.setVisibility(0);
                return view;
            }
            textView.setVisibility(8);
            return view;
        }
        throw null;
    }
}
