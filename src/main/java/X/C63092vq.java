package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape1S0300000_I1;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2vq  reason: invalid class name and case insensitive filesystem */
public class C63092vq extends ArrayAdapter {
    public List A00;
    public final LayoutInflater A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63092vq(PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, Context context, List list) {
        super(context, (int) R.layout.group_chat_info_row, list);
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = LayoutInflater.from(context);
        this.A00 = new ArrayList(list);
    }

    public int getCount() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.ArrayAdapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C63082vp r0;
        AnonymousClass0QW r1;
        View view2 = view;
        if (view == null) {
            view2 = this.A01.inflate(R.layout.group_chat_info_row, viewGroup, false);
            r0 = new C63082vp(null);
            PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity = this.A02;
            r0.A03 = new C11930hF(view2, R.id.name, paymentGroupParticipantPickerActivity.A0E, ((AnonymousClass2C0) paymentGroupParticipantPickerActivity).A01, paymentGroupParticipantPickerActivity.A0I);
            r0.A00 = (ImageView) view2.findViewById(R.id.avatar);
            r0.A02 = (TextEmojiLabel) view2.findViewById(R.id.group_participant_picker_push_name);
            r0.A01 = (TextView) view2.findViewById(R.id.status);
            view2.setTag(r0);
        } else {
            r0 = (C63082vp) view2.getTag();
        }
        r0.A03.A00.setText((CharSequence) null);
        r0.A03.A00.setTextColor(C004302a.A00(getContext(), R.color.list_item_title));
        r0.A03.A00.setAlpha(1.0f);
        r0.A02.setVisibility(8);
        r0.A01.setVisibility(8);
        TextView textView = r0.A01;
        PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity2 = this.A02;
        AnonymousClass01X r5 = ((AnonymousClass2C0) paymentGroupParticipantPickerActivity2).A01;
        textView.setText(r5.A06(R.string.participant_cant_receive_payments));
        C007003k r4 = (C007003k) this.A00.get(i);
        if (r4 != null) {
            r0.A04 = r4;
            r0.A03.A03(r4, null);
            ImageView imageView = r0.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(paymentGroupParticipantPickerActivity2.A0A.A01(R.string.transition_avatar));
            sb.append(AnonymousClass1VY.A0D(r4.A09));
            AnonymousClass0Q7.A0g(imageView, sb.toString());
            paymentGroupParticipantPickerActivity2.A02.A02(r4, r0.A00);
            r0.A00.setOnClickListener(new ViewOnClickEBaseShape1S0300000_I1(this, r4, r0, 14));
            if (!paymentGroupParticipantPickerActivity2.A0H.A06((UserJid) r4.A02(UserJid.class))) {
                r0.A03.A00.setAlpha(0.5f);
                r0.A01.setVisibility(0);
                AnonymousClass0QW r12 = r4.A08;
                if (r12 != null && !TextUtils.isEmpty(r12.A01)) {
                    r0.A01.setText(r5.A06(R.string.contact_cant_receive_payments));
                }
            } else if (paymentGroupParticipantPickerActivity2.A08.A0H((UserJid) r4.A02(UserJid.class))) {
                r0.A03.A00.setAlpha(0.5f);
                r0.A01.setVisibility(0);
                r0.A01.setText(r5.A06(R.string.unblock_to_send_payments));
            }
            if (r4.A0O == null || ((r1 = r4.A08) != null && !TextUtils.isEmpty(r1.A01))) {
                return view2;
            }
            r0.A02.setVisibility(0);
            TextEmojiLabel textEmojiLabel = r0.A02;
            StringBuilder A0S = AnonymousClass008.A0S("~");
            A0S.append(r4.A0O);
            textEmojiLabel.A02(A0S.toString());
            return view2;
        }
        throw null;
    }
}
