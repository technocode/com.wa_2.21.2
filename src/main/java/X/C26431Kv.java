package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Kv  reason: invalid class name and case insensitive filesystem */
public class C26431Kv extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ AnonymousClass2DH A01;

    public long getItemId(int i) {
        return (long) i;
    }

    public C26431Kv(AnonymousClass2DH r2) {
        this.A01 = r2;
    }

    public final void A00(SelectionCheckView selectionCheckView, boolean z) {
        AnonymousClass2DH r1 = this.A01;
        boolean z2 = r1.A0B;
        AnonymousClass01X r12 = ((AnonymousClass2C0) r1).A01;
        if (z2) {
            int i = R.string.status_contact_not_excluded_description;
            if (z) {
                i = R.string.status_contact_excluded_description;
            }
            selectionCheckView.setContentDescription(r12.A06(i));
            return;
        }
        int i2 = R.string.status_contact_not_selected_description;
        if (z) {
            i2 = R.string.status_contact_selected_description;
        }
        selectionCheckView.setContentDescription(r12.A06(i2));
    }

    public int getCount() {
        return this.A00.size();
    }

    public Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C26451Kx r0;
        View view2 = view;
        C007003k r7 = (C007003k) this.A00.get(i);
        if (view == null) {
            AnonymousClass2DH r2 = this.A01;
            view2 = r2.getLayoutInflater().inflate(R.layout.status_contact_picker_row, viewGroup, false);
            r0 = new C26451Kx(null);
            view2.setTag(r0);
            r0.A00 = (ImageView) view2.findViewById(R.id.contactpicker_row_photo);
            r0.A02 = new C11930hF(view2, R.id.contactpicker_row_name, r2.A0H, ((AnonymousClass2C0) r2).A01, r2.A0K);
            r0.A01 = (SelectionCheckView) view2.findViewById(R.id.selection_check);
            C002301g.A03(r0.A02.A00);
        } else {
            r0 = (C26451Kx) view2.getTag();
        }
        view2.setClickable(false);
        view2.setLongClickable(false);
        Jid A02 = r7.A02(UserJid.class);
        if (A02 != null) {
            r0.A03 = (UserJid) A02;
            AnonymousClass2DH r5 = this.A01;
            r5.A06.A02(r7, r0.A00);
            AnonymousClass0Q7.A0W(r0.A00, 2);
            r0.A02.A03(r7, r5.A08);
            boolean contains = r5.A0Q.contains(r7.A02(UserJid.class));
            if (r5.A0B) {
                r0.A01.setSelectionBackground(R.drawable.red_circle);
            } else {
                r0.A01.setSelectionBackground(R.drawable.teal_circle);
            }
            if (r5.A0P.remove(r7.A02(UserJid.class))) {
                r0.A01.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC26421Ku(this, r0, contains));
                view2.setAlpha(1.0f);
                return view2;
            } else if (r5.A0D.A0H((UserJid) r7.A02(UserJid.class))) {
                if (r5.A0B) {
                    r0.A01.A03(true, false);
                } else {
                    r0.A01.A03(false, false);
                }
                r0.A01.setContentDescription(((AnonymousClass2C0) r5).A01.A06(R.string.tap_unblock));
                view2.setAlpha(0.5f);
                return view2;
            } else {
                r0.A01.A03(contains, false);
                A00(r0.A01, contains);
                view2.setAlpha(1.0f);
                return view2;
            }
        } else {
            throw null;
        }
    }
}
