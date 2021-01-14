package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.2hq  reason: invalid class name and case insensitive filesystem */
public class C55962hq implements AbstractC19080uO {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity A01;

    @Override // X.AbstractC19080uO
    public View A6n(C32311eg r2) {
        return null;
    }

    public C55962hq(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A01 = groupChatLiveLocationsActivity;
        View inflate = groupChatLiveLocationsActivity.getLayoutInflater().inflate(R.layout.live_location_map_info_window, (ViewGroup) null, false);
        this.A00 = inflate;
        AnonymousClass0Q7.A0X(inflate, 3);
    }

    @Override // X.AbstractC19080uO
    public View A6p(C32311eg r17) {
        TextEmojiLabel textEmojiLabel;
        AnonymousClass1M5 r1;
        C02900Dx r6 = ((C49842Sk) r17.A0L).A02;
        View view = this.A00;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A01;
        C014308b r13 = groupChatLiveLocationsActivity.A0G;
        AnonymousClass01X r14 = ((AnonymousClass2C0) groupChatLiveLocationsActivity).A01;
        C11930hF r10 = new C11930hF(view, R.id.name_in_group_tv, r13, r14, groupChatLiveLocationsActivity.A0T);
        TextView textView = (TextView) view.findViewById(R.id.participant_info);
        View findViewById = view.findViewById(R.id.info_btn);
        AnonymousClass01I r0 = groupChatLiveLocationsActivity.A0C;
        UserJid userJid = r6.A06;
        if (r0.A09(userJid)) {
            int A002 = C004302a.A00(groupChatLiveLocationsActivity, R.color.live_location_bubble_me_text);
            textEmojiLabel = r10.A00;
            textEmojiLabel.setTextColor(A002);
            r10.A00();
            findViewById.setVisibility(8);
        } else {
            AnonymousClass02U A02 = AnonymousClass02U.A02(groupChatLiveLocationsActivity.A07.A0e);
            if (A02 == null || (r1 = (AnonymousClass1M5) groupChatLiveLocationsActivity.A0M.A01(A02).A01.get(userJid)) == null) {
                int A003 = C004302a.A00(groupChatLiveLocationsActivity, R.color.live_location_bubble_unknown_text);
                textEmojiLabel = r10.A00;
                textEmojiLabel.setTextColor(A003);
            } else {
                int A05 = C28051Sr.A05(groupChatLiveLocationsActivity.getResources(), r1);
                textEmojiLabel = r10.A00;
                textEmojiLabel.setTextColor(A05);
            }
            r10.A03(groupChatLiveLocationsActivity.A0E.A0A(userJid), null);
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
}
