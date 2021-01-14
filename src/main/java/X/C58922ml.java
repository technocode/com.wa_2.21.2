package X;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ml  reason: invalid class name and case insensitive filesystem */
public class C58922ml extends AbstractC47092Gl implements SectionIndexer {
    public List A00;
    public List A01;
    public List A02 = new ArrayList();
    public List A03 = new ArrayList();
    public final Context A04;
    public final AnonymousClass0HJ A05;
    public final AnonymousClass0YX A06;
    public final AnonymousClass01X A07;

    public C58922ml(Context context, List list, AnonymousClass0HJ r4, AnonymousClass0YX r5, AnonymousClass01X r6) {
        this.A00 = list;
        this.A04 = context;
        this.A05 = r4;
        this.A06 = r5;
        this.A01 = list;
        this.A07 = r6;
    }

    public int getCount() {
        return this.A00.size();
    }

    public Object getItem(int i) {
        return this.A00.get(i);
    }

    public int getPositionForSection(int i) {
        List list = this.A02;
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return ((Number) list.get(i)).intValue();
    }

    public int getSectionForPosition(int i) {
        return C28051Sr.A04(i, this.A01, this.A03, this.A02);
    }

    public Object[] getSections() {
        return this.A03.toArray(new String[1]);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C47112Gn r0;
        AnonymousClass2GM r2 = (AnonymousClass2GM) this.A00.get(i);
        if (r2 == null) {
            throw null;
        } else if (r2 instanceof AnonymousClass2YY) {
            if (view == null) {
                view = LayoutInflater.from(this.A04).inflate(R.layout.list_section, viewGroup, false);
                AnonymousClass0Q7.A0W(view, 2);
            }
            TextView textView = (TextView) view.findViewById(R.id.title);
            C002301g.A03(textView);
            textView.setText(((AnonymousClass2YY) r2).A00);
            return view;
        } else {
            C007003k A5O = r2.A5O();
            if (view == null) {
                view = LayoutInflater.from(this.A04).inflate(R.layout.phone_contact_row, viewGroup, false);
                r0 = new C47112Gn(view);
                view.setTag(r0);
            } else {
                r0 = (C47112Gn) view.getTag();
            }
            AnonymousClass0HJ r3 = this.A05;
            ImageView imageView = r0.A00;
            r3.A05(imageView, R.drawable.avatar_contact);
            this.A06.A02(A5O, imageView);
            r0.A02.A02(A5O.A0F);
            TextEmojiLabel textEmojiLabel = r0.A03;
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.A02(C12420i4.A00(A5O));
            return view;
        }
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A0S = C28051Sr.A0S(this.A01, this.A07);
        this.A03 = (List) A0S.first;
        this.A02 = (List) A0S.second;
    }
}
