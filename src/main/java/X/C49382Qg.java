package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.R;
import com.whatsapp.group.NewGroup;
import java.util.List;

/* renamed from: X.2Qg  reason: invalid class name and case insensitive filesystem */
public class C49382Qg extends ArrayAdapter {
    public final LayoutInflater A00 = LayoutInflater.from(this.A01);
    public final /* synthetic */ NewGroup A01;

    public long getItemId(int i) {
        return (long) (i << 10);
    }

    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C49382Qg(NewGroup newGroup, Context context, List list) {
        super(context, (int) R.layout.selected_contact, list);
        this.A01 = newGroup;
    }

    public int getCount() {
        return this.A01.A0C.size();
    }

    @Override // android.widget.ArrayAdapter
    public Object getItem(int i) {
        return this.A01.A0C.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        NewGroup newGroup = this.A01;
        C007003k r3 = (C007003k) newGroup.A0C.get(i);
        if (r3 != null) {
            if (view == null) {
                view = this.A00.inflate(R.layout.selected_contact, viewGroup, false);
            }
            ((TextView) AnonymousClass0Q7.A0D(view, R.id.contact_name)).setText(newGroup.A0G.A08(r3, false));
            AnonymousClass0Q7.A0D(view, R.id.close).setVisibility(8);
            ImageView imageView = (ImageView) AnonymousClass0Q7.A0D(view, R.id.contact_row_photo);
            newGroup.A09.A02(r3, imageView);
            AnonymousClass0Q7.A0W(imageView, 2);
            AnonymousClass01X r4 = ((AnonymousClass2C0) newGroup).A01;
            AnonymousClass0Q7.A0d(view, new AnonymousClass0Q9(new AnonymousClass0Q8[]{new AnonymousClass0Q8(1, R.string.new_group_contact_content_description)}, r4));
            return view;
        }
        throw null;
    }
}
