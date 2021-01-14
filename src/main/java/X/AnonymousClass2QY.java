package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.ViewOnClickCListenerShape2S0300000_I1;
import java.util.ArrayList;

/* renamed from: X.2QY  reason: invalid class name */
public class AnonymousClass2QY extends BaseAdapter implements Filterable {
    public String A00;
    public ArrayList A01;
    public ArrayList A02 = new ArrayList();
    public boolean A03;
    public final Filter A04 = new AnonymousClass2QX(this.A05);
    public final /* synthetic */ GroupChatInfo A05;

    public boolean areAllItemsEnabled() {
        return false;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public boolean hasStableIds() {
        return true;
    }

    public AnonymousClass2QY(GroupChatInfo groupChatInfo) {
        this.A05 = groupChatInfo;
    }

    public void A00() {
        String charSequence;
        if (TextUtils.isEmpty(this.A00)) {
            GroupChatInfo groupChatInfo = this.A05;
            CharSequence charSequence2 = null;
            this.A02 = groupChatInfo.A0X;
            if (0 == 0) {
                charSequence = null;
            } else {
                charSequence = charSequence2.toString();
            }
            this.A00 = charSequence;
            this.A01 = AnonymousClass1YB.A03(charSequence, ((ChatInfoActivity) groupChatInfo).A0A);
            notifyDataSetChanged();
            return;
        }
        this.A04.filter(this.A00);
    }

    public int getCount() {
        ArrayList arrayList = this.A02;
        if (arrayList.size() <= 10) {
            return arrayList.size();
        }
        if (!this.A03) {
            return 11;
        }
        return arrayList.size();
    }

    public Filter getFilter() {
        return this.A04;
    }

    public Object getItem(int i) {
        return this.A02.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass2QZ r0;
        View view2 = view;
        if (view == null) {
            GroupChatInfo groupChatInfo = this.A05;
            view2 = groupChatInfo.getLayoutInflater().inflate(R.layout.group_chat_info_row, viewGroup, false);
            r0 = new AnonymousClass2QZ(null);
            r0.A04 = new C11930hF(view2, R.id.name, groupChatInfo.A0j, ((ChatInfoActivity) groupChatInfo).A0A, groupChatInfo.A1E);
            r0.A03 = (TextEmojiLabel) view2.findViewById(R.id.status);
            r0.A00 = (ImageView) view2.findViewById(R.id.avatar);
            r0.A01 = (TextView) view2.findViewById(R.id.owner);
            r0.A02 = (TextEmojiLabel) view2.findViewById(R.id.push_name);
            view2.setTag(r0);
        } else {
            r0 = (AnonymousClass2QZ) view2.getTag();
        }
        r0.A01.setVisibility(8);
        r0.A02.setVisibility(8);
        if (this.A03 || i != 10) {
            r0.A04.A00.setText((CharSequence) null);
            C11930hF r10 = r0.A04;
            GroupChatInfo groupChatInfo2 = this.A05;
            r10.A00.setTextColor(C004302a.A00(groupChatInfo2, R.color.list_item_title));
            r0.A03.setText((CharSequence) null);
            r0.A03.setTextColor(C004302a.A00(groupChatInfo2, R.color.list_item_sub_title));
            r0.A00.setClickable(true);
            C007003k r5 = (C007003k) this.A02.get(i);
            if (r5 != null) {
                AnonymousClass01I r9 = groupChatInfo2.A0a;
                if (r9.A09(r5.A09)) {
                    r0.A05 = null;
                    r0.A04.A00();
                    r0.A03.A02(groupChatInfo2.A0b.A01());
                    if (groupChatInfo2.A0v.A05(groupChatInfo2.A0S)) {
                        r0.A01.setVisibility(0);
                        r0.A01.setText(((ChatInfoActivity) groupChatInfo2).A0A.A06(R.string.group_admin));
                    }
                    AnonymousClass0YX r4 = groupChatInfo2.A0J;
                    r9.A04();
                    AnonymousClass0HR r2 = r9.A01;
                    if (r2 != null) {
                        r4.A02(r2, r0.A00);
                        r0.A00.setOnClickListener(null);
                        AnonymousClass0Q7.A0W(r0.A00, 2);
                        return view2;
                    }
                    throw null;
                }
                View A0D = AnonymousClass0Q7.A0D(view2, R.id.group_chat_info_layout);
                AnonymousClass01X r3 = ((ChatInfoActivity) groupChatInfo2).A0A;
                C002001d.A2w(r3, A0D, R.string.accessibility_action_click_more_actions_on_participant);
                UserJid userJid = (UserJid) r5.A02(UserJid.class);
                r0.A05 = r5;
                r0.A04.A03(r5, this.A01);
                ImageView imageView = r0.A00;
                StringBuilder sb = new StringBuilder();
                sb.append(((ChatInfoActivity) groupChatInfo2).A06.A01(R.string.transition_avatar));
                sb.append(AnonymousClass1VY.A0D(userJid));
                AnonymousClass0Q7.A0g(imageView, sb.toString());
                groupChatInfo2.A0J.A02(r5, r0.A00);
                C002001d.A2w(r3, r0.A00, R.string.accessibility_action_contact_picker_profile_photo_click);
                r0.A00.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I1(this, r0, r5, 5));
                if (groupChatInfo2.A1J.containsKey(userJid)) {
                    C11930hF r1 = r0.A04;
                    r1.A00.setTextColor(C004302a.A00(groupChatInfo2, R.color.conversations_text_gray));
                    r0.A03.setTextColor(C004302a.A00(groupChatInfo2, R.color.conversations_text_gray));
                    r0.A03.setText(r3.A06(R.string.tap_to_retry_add_participant));
                    return view2;
                }
                AnonymousClass01T r22 = groupChatInfo2.A0v;
                AnonymousClass02U r12 = groupChatInfo2.A0S;
                if (userJid != null) {
                    if (r22.A06(r12, userJid)) {
                        r0.A01.setVisibility(0);
                        r0.A01.setText(r3.A06(R.string.group_admin));
                    }
                    if (r5.A07() && r5.A0O != null) {
                        r0.A02.setVisibility(0);
                        TextEmojiLabel textEmojiLabel = r0.A02;
                        StringBuilder A0S = AnonymousClass008.A0S("~");
                        A0S.append(r5.A0O);
                        textEmojiLabel.A04(A0S.toString(), this.A01, false, 0);
                    }
                    if (r5.A0L != null) {
                        r0.A03.setVisibility(0);
                        r0.A03.A02(r5.A0L);
                        return view2;
                    }
                    r0.A03.setVisibility(8);
                    return view2;
                }
                throw null;
            }
            throw null;
        }
        int size = this.A02.size() - 10;
        C11930hF r11 = r0.A04;
        GroupChatInfo groupChatInfo3 = this.A05;
        r11.A00.setText(((ChatInfoActivity) groupChatInfo3).A0A.A0A(R.plurals.n_more, (long) size, Integer.valueOf(size)));
        C11930hF r52 = r0.A04;
        r52.A00.setTextColor(C004302a.A00(groupChatInfo3, R.color.list_item_sub_title));
        r0.A03.setVisibility(8);
        r0.A05 = null;
        r0.A00.setImageResource(R.drawable.ic_more_participants);
        r0.A00.setClickable(false);
        return view2;
    }

    public boolean isEnabled(int i) {
        C007003k r2 = (C007003k) this.A02.get(i);
        if (r2 != null) {
            return !this.A05.A0a.A09(r2.A09);
        }
        throw null;
    }
}
