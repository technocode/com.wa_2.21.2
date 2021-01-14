package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.util.ViewOnClickCListenerShape2S0300000_I1;
import java.util.List;

/* renamed from: X.2Ey  reason: invalid class name and case insensitive filesystem */
public class C46802Ey extends ArrayAdapter {
    public final /* synthetic */ ListChatInfo A00;

    public int getViewTypeCount() {
        return 2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46802Ey(ListChatInfo listChatInfo, Context context, List list) {
        super(context, (int) R.layout.participant_list_row, list);
        this.A00 = listChatInfo;
    }

    public int getCount() {
        return this.A00.A0c.size();
    }

    public int getItemViewType(int i) {
        C007003k r0 = (C007003k) getItem(i);
        if (r0 != null) {
            return r0.A07() ? 1 : 0;
        }
        throw null;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C46812Ez r0;
        View view2 = view;
        String str = null;
        if (view == null) {
            C007003k r02 = (C007003k) getItem(i);
            if (r02 != null) {
                boolean A07 = r02.A07();
                int i2 = R.layout.group_chat_info_row_unknown_contact;
                if (!A07) {
                    i2 = R.layout.group_chat_info_row;
                }
                ListChatInfo listChatInfo = this.A00;
                view2 = listChatInfo.getLayoutInflater().inflate(i2, viewGroup, false);
                r0 = new C46812Ez(null);
                r0.A02 = new C11930hF(view2, R.id.name, listChatInfo.A0H, ((ChatInfoActivity) listChatInfo).A0A, listChatInfo.A0Z);
                r0.A01 = (TextEmojiLabel) view2.findViewById(R.id.status);
                r0.A00 = (ImageView) view2.findViewById(R.id.avatar);
                view2.setTag(r0);
            } else {
                throw null;
            }
        } else {
            r0 = (C46812Ez) view2.getTag();
        }
        Object item = getItem(i);
        if (item != null) {
            C007003k r6 = (C007003k) item;
            r0.A03 = r6;
            r0.A02.A03(r6, null);
            ImageView imageView = r0.A00;
            StringBuilder sb = new StringBuilder();
            ListChatInfo listChatInfo2 = this.A00;
            sb.append(((ChatInfoActivity) listChatInfo2).A06.A01(R.string.transition_avatar));
            sb.append(AnonymousClass1VY.A0D(r6.A09));
            AnonymousClass0Q7.A0g(imageView, sb.toString());
            listChatInfo2.A08.A02(r6, r0.A00);
            r0.A00.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I1(this, r0, r6, 2));
            if (r6.A07()) {
                r0.A01.setVisibility(0);
                TextEmojiLabel textEmojiLabel = r0.A01;
                String str2 = r6.A0O;
                if (str2 != null) {
                    StringBuilder A0S = AnonymousClass008.A0S("~");
                    A0S.append(str2);
                    str = A0S.toString();
                }
                textEmojiLabel.A02(str);
                return view2;
            } else if (r6.A0L != null) {
                r0.A01.setVisibility(0);
                r0.A01.A02(r6.A0L);
                return view2;
            } else {
                r0.A01.setVisibility(8);
                return view2;
            }
        } else {
            throw null;
        }
    }
}
