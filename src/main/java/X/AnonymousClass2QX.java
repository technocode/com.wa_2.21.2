package X;

import android.text.TextUtils;
import android.widget.Filter;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.2QX  reason: invalid class name */
public class AnonymousClass2QX extends Filter {
    public final /* synthetic */ GroupChatInfo A00;

    public AnonymousClass2QX(GroupChatInfo groupChatInfo) {
        this.A00 = groupChatInfo;
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (!TextUtils.isEmpty(charSequence)) {
            arrayList = new ArrayList();
            String charSequence2 = charSequence.toString();
            GroupChatInfo groupChatInfo = this.A00;
            AnonymousClass01X r5 = ((ChatInfoActivity) groupChatInfo).A0A;
            ArrayList A03 = AnonymousClass1YB.A03(charSequence2, r5);
            boolean contains = charSequence.toString().toLowerCase().contains(r5.A06(R.string.group_admin).toLowerCase());
            Iterator it = groupChatInfo.A0X.iterator();
            while (it.hasNext()) {
                C007003k r3 = (C007003k) it.next();
                if (!groupChatInfo.A0j.A0G(r3, A03, true) && !AnonymousClass1YB.A04(r3.A0O, A03, r5, true)) {
                    if (contains) {
                        AnonymousClass01T r2 = groupChatInfo.A0v;
                        AnonymousClass02U r1 = groupChatInfo.A0S;
                        Jid A02 = r3.A02(UserJid.class);
                        if (A02 == null) {
                            throw null;
                        } else if (!r2.A06(r1, (UserJid) A02)) {
                        }
                    } else {
                        continue;
                    }
                }
                arrayList.add(r3);
            }
        } else {
            arrayList = this.A00.A0X;
        }
        filterResults.values = arrayList;
        filterResults.count = arrayList.size();
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        ArrayList arrayList;
        String charSequence2;
        Object obj = filterResults.values;
        if (obj == null) {
            arrayList = this.A00.A0X;
        } else {
            arrayList = (ArrayList) obj;
        }
        GroupChatInfo groupChatInfo = this.A00;
        AnonymousClass2QY r2 = groupChatInfo.A0M;
        r2.A02 = arrayList;
        if (charSequence == null) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence.toString();
        }
        r2.A00 = charSequence2;
        r2.A01 = AnonymousClass1YB.A03(charSequence2, ((ChatInfoActivity) r2.A05).A0A);
        r2.notifyDataSetChanged();
        TextView textView = (TextView) groupChatInfo.findViewById(R.id.search_no_matches);
        if (textView == null) {
            return;
        }
        if (!arrayList.isEmpty() || TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(((ChatInfoActivity) groupChatInfo).A0A.A0D(R.string.search_no_results, charSequence));
    }
}
