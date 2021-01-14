package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.group.NewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2YH  reason: invalid class name */
public class AnonymousClass2YH implements AbstractC06100Rs {
    public final /* synthetic */ ContactPickerFragment A00;

    @Override // X.AbstractC06100Rs
    public boolean AIh(AbstractC06110Rt r2, Menu menu) {
        return false;
    }

    public AnonymousClass2YH(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r12, MenuItem menuItem) {
        int i;
        if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            ContactPickerFragment contactPickerFragment = this.A00;
            int A06 = contactPickerFragment.A18.A06(AbstractC000400g.A2u);
            if (A06 <= 0 || contactPickerFragment.A1q.size() <= A06) {
                contactPickerFragment.A0h(new Intent(contactPickerFragment.A00(), ListMembersSelector.class).putExtra("selected", AnonymousClass1VY.A0F(contactPickerFragment.A1q.keySet())));
            } else {
                contactPickerFragment.A0H.APr(contactPickerFragment.A1O.A0A(R.plurals.broadcast_reach_limit, (long) A06, Integer.valueOf(A06)));
            }
            contactPickerFragment.A0H.A00();
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            ContactPickerFragment contactPickerFragment2 = this.A00;
            int A062 = contactPickerFragment2.A18.A06(AbstractC000400g.A3i) - 1;
            if (A062 <= 0 || contactPickerFragment2.A1q.size() <= (i = A062 - 1)) {
                NewGroup.A04(contactPickerFragment2.A0A(), 4, AnonymousClass1VY.A0F(contactPickerFragment2.A1q.keySet()));
            } else {
                contactPickerFragment2.A0H.APr(contactPickerFragment2.A1O.A0A(R.plurals.groupchat_reach_limit, (long) i, Integer.valueOf(i)));
            }
            contactPickerFragment2.A0H.A00();
            return false;
        } else if (menuItem.getItemId() == R.id.menuitem_share) {
            ContactPickerFragment contactPickerFragment3 = this.A00;
            boolean z = contactPickerFragment3.A0o().getBoolean("skip_preview", false);
            ArrayList arrayList = contactPickerFragment3.A0d;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (contactPickerFragment3.A1k.A05((Uri) it.next()) != 1) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                contactPickerFragment3.A16(null);
                return false;
            }
            C002001d.A2O(contactPickerFragment3.A0A(), 1);
            return false;
        }
        return false;
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r7, Menu menu) {
        ContactPickerFragment contactPickerFragment = this.A00;
        if (contactPickerFragment.A0t || contactPickerFragment.A0z || contactPickerFragment.A0x) {
            menu.add(0, R.id.menuitem_share, 0, contactPickerFragment.A1O.A06(R.string.send)).setIcon(R.drawable.input_send).setShowAsAction(2);
            return true;
        }
        AnonymousClass01X r2 = contactPickerFragment.A1O;
        menu.add(0, R.id.menuitem_new_broadcast, 0, r2.A06(R.string.new_broadcast)).setShowAsAction(2);
        menu.add(0, R.id.menuitem_new_group, 0, r2.A06(R.string.menuitem_groupchat)).setShowAsAction(2);
        return true;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r7) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Set set = contactPickerFragment.A1s;
        set.clear();
        Map map = contactPickerFragment.A1q;
        set.addAll(map.keySet());
        Handler handler = contactPickerFragment.A10;
        Runnable runnable = contactPickerFragment.A1n;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        map.clear();
        contactPickerFragment.A0I.notifyDataSetChanged();
        contactPickerFragment.A0C = null;
    }
}
