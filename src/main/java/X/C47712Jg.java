package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ViewHolder;
import java.util.ArrayList;

/* renamed from: X.2Jg  reason: invalid class name and case insensitive filesystem */
public class C47712Jg extends BaseAdapter implements Filterable {
    public AnonymousClass0XB A00 = new AnonymousClass0XB();
    public ArrayList A01 = new ArrayList();
    public final Filter A02 = new C47702Jf(this);
    public final /* synthetic */ ConversationsFragment A03;

    public int getViewTypeCount() {
        return 2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public C47712Jg(ConversationsFragment conversationsFragment) {
        this.A03 = conversationsFragment;
    }

    public int getCount() {
        return this.A03.A0T.size();
    }

    public Filter getFilter() {
        return this.A02;
    }

    public Object getItem(int i) {
        return this.A03.A0T.get(i);
    }

    public long getItemId(int i) {
        return (long) this.A03.A0T.get(i).hashCode();
    }

    public int getItemViewType(int i) {
        return this.A03.A0T.get(i) instanceof C11610gd ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        AbstractC11990hN r0;
        View view2 = view;
        if (viewGroup != null) {
            ConversationsFragment conversationsFragment = this.A03;
            AbstractC10770fA r7 = (AbstractC10770fA) conversationsFragment.A0T.get(i);
            if (r7 != null) {
                if (view != null && (view2.getTag() instanceof ViewHolder)) {
                    ViewHolder viewHolder2 = (ViewHolder) view2.getTag();
                    if (!C006803i.A0q(viewHolder2.A02, r7) && (r0 = viewHolder2.A01) != null) {
                        r0.A00();
                    }
                }
                if (r7 instanceof C11610gd) {
                    if (view == null) {
                        ActivityC004902h A0A = conversationsFragment.A0A();
                        if (A0A != null) {
                            view2 = A0A.getLayoutInflater().inflate(R.layout.list_section, viewGroup, false);
                        } else {
                            throw null;
                        }
                    }
                    TextView textView = (TextView) view2.findViewById(R.id.title);
                    C002301g.A03(textView);
                    textView.setText(((C11610gd) r7).A00);
                    return view2;
                }
                if (view == null) {
                    view2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.conversations_row, viewGroup, false);
                    viewHolder = new ViewHolder(viewGroup.getContext(), view2, conversationsFragment.A15, conversationsFragment.A0f, conversationsFragment.A0e, conversationsFragment.A16, conversationsFragment.A1B, conversationsFragment.A0g, conversationsFragment.A1g, conversationsFragment.A0r, conversationsFragment.A0s, conversationsFragment.A0c, conversationsFragment.A1G, conversationsFragment.A0v, conversationsFragment.A19, null, conversationsFragment.A0b, conversationsFragment.A1M, conversationsFragment.A1n, conversationsFragment.A1j, conversationsFragment.A0H, conversationsFragment.A10, conversationsFragment.A0n, conversationsFragment.A0h, conversationsFragment);
                } else {
                    viewHolder = (ViewHolder) view2.getTag();
                }
                view2.setTag(viewHolder);
                ((AnonymousClass037) conversationsFragment).A0K.A00(viewHolder);
                conversationsFragment.A0n();
                boolean z = false;
                if (((ListFragment) conversationsFragment).A04.getFirstVisiblePosition() == 0) {
                    z = true;
                }
                viewHolder.A0F(r7, z, viewGroup.getContext(), conversationsFragment.A0A(), conversationsFragment.A0P, false);
                ConversationsFragment.A03(conversationsFragment.A19, view2);
                return view2;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        if (super.isEmpty()) {
            return this.A03.A00 == 0 || !TextUtils.isEmpty(this.A00.A01);
        }
        return false;
    }
}
