package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape2S0300000_I1;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2Eu  reason: invalid class name and case insensitive filesystem */
public class C46762Eu extends ArrayAdapter {
    public List A00 = new ArrayList();
    public boolean A01;
    public final Activity A02;
    public final LayoutInflater A03;
    public final AnonymousClass1PN A04;
    public final C014308b A05;
    public final AnonymousClass0YX A06;
    public final AnonymousClass01X A07;
    public final AnonymousClass31y A08;
    public final AnonymousClass00T A09;

    public int getViewTypeCount() {
        return 1;
    }

    public C46762Eu(Activity activity, AnonymousClass00T r4, C014308b r5, AnonymousClass01X r6, AnonymousClass1PN r7, AnonymousClass31y r8, AnonymousClass0YX r9) {
        super(activity, (int) R.layout.participant_list_row, (List) null);
        this.A02 = activity;
        this.A09 = r4;
        this.A05 = r5;
        this.A07 = r6;
        this.A04 = r7;
        this.A08 = r8;
        this.A06 = r9;
        this.A03 = LayoutInflater.from(activity);
    }

    public int getCount() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        if (this.A01 || list.size() <= 10) {
            return this.A00.size();
        }
        return 11;
    }

    @Override // android.widget.ArrayAdapter
    public Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C46782Ew r0;
        View view2 = view;
        if (view == null) {
            view2 = this.A03.inflate(R.layout.participant_list_row, viewGroup, false);
            r0 = new C46782Ew(null);
            r0.A03 = new C11930hF(view2, R.id.name, this.A05, this.A07, this.A08);
            r0.A02 = (TextEmojiLabel) view2.findViewById(R.id.status);
            r0.A01 = (ImageView) view2.findViewById(R.id.avatar);
            r0.A00 = view2.findViewById(R.id.divider);
            view2.setTag(r0);
        } else {
            r0 = (C46782Ew) view2.getTag();
        }
        if (i == getCount() - 1) {
            r0.A00.setVisibility(8);
        } else {
            r0.A00.setVisibility(0);
        }
        if (this.A01 || i != 10) {
            C007003k r7 = (C007003k) this.A00.get(i);
            if (r7 != null) {
                C11930hF r4 = r0.A03;
                r4.A00.setTextColor(C004302a.A00(this.A02, R.color.list_item_title));
                r0.A03.A03(r7, null);
                ImageView imageView = r0.A01;
                StringBuilder sb = new StringBuilder();
                sb.append(this.A04.A01(R.string.transition_avatar));
                Jid jid = r7.A09;
                if (jid != null) {
                    sb.append(jid.getRawString());
                    AnonymousClass0Q7.A0g(imageView, sb.toString());
                    r0.A02.setVisibility(0);
                    r0.A02.setTag(r7.A09);
                    C014308b r3 = this.A05;
                    String str = (String) r3.A05.get(r7.A02(AnonymousClass02X.class));
                    if (str != null) {
                        r0.A02.setText(str);
                    } else {
                        r0.A02.setText("");
                        this.A09.ANC(new AnonymousClass2XE((AnonymousClass02U) r7.A02(AnonymousClass02U.class), r0.A02), new Void[0]);
                    }
                    this.A06.A02(r7, r0.A01);
                    r0.A01.setClickable(true);
                    r0.A01.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I1(this, r0, r7, 1));
                    return view2;
                }
                throw null;
            }
            throw null;
        }
        int size = this.A00.size() - 10;
        C11930hF r9 = r0.A03;
        r9.A00.setText(this.A07.A0A(R.plurals.n_more, (long) size, Integer.valueOf(size)));
        C11930hF r32 = r0.A03;
        r32.A00.setTextColor(C004302a.A00(this.A02, R.color.list_item_sub_title));
        r0.A02.setVisibility(8);
        r0.A01.setImageResource(R.drawable.ic_more_participants);
        r0.A01.setClickable(false);
        return view2;
    }
}
