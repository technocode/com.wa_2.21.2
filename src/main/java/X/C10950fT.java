package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0fT  reason: invalid class name and case insensitive filesystem */
public class C10950fT extends AnonymousClass0JW {
    public final AnonymousClass01A A00;
    public final AnonymousClass0HN A01;
    public final AnonymousClass01Q A02;
    public final WeakReference A03;

    public C10950fT(ContactPickerFragment contactPickerFragment, AnonymousClass01A r3, AnonymousClass0HN r4, AnonymousClass01Q r5) {
        this.A03 = new WeakReference(contactPickerFragment);
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        AnonymousClass0QK r6 = (AnonymousClass0QK) obj;
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A03.get();
        if (contactPickerFragment != null && contactPickerFragment.A0U()) {
            contactPickerFragment.A0H.A00.A0O(false);
            Log.d("contactpicker/finish_sync_all_in_contactpicker");
            contactPickerFragment.A0u();
            int ordinal = r6.ordinal();
            if (ordinal == 0) {
                contactPickerFragment.A0H.APo(R.string.coldsync_no_network);
            } else if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                if (contactPickerFragment.A1M.A03()) {
                    contactPickerFragment.A14.A06(R.string.coldsync_nochange_msg, 0);
                }
            } else if (ordinal == 4 || ordinal == 6) {
                contactPickerFragment.A0H.APo(R.string.coldsync_failed_msg);
                AnonymousClass0HN r2 = contactPickerFragment.A1I;
                if (r2 != null) {
                    AnonymousClass0Hz r0 = new AnonymousClass0Hz(EnumC03840Hy.BACKGROUND_FULL);
                    r0.A02();
                    r0.A06 = true;
                    r2.A02(r0.A01(), true);
                    return;
                }
                throw null;
            }
        }
    }

    public final void A04() {
        List A0A = this.A02.A0A();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((AbstractCollection) A0A).iterator();
        while (it.hasNext()) {
            AnonymousClass02N r2 = (AnonymousClass02N) it.next();
            if (this.A00.A0A(r2).A08 != null || !AnonymousClass1VY.A0e(r2)) {
                AnonymousClass008.A11("contactpicker/missingnames/skip/jid ", r2);
            } else {
                StringBuilder sb = new StringBuilder("contactpicker/missingnames/jid ");
                sb.append(r2);
                Log.d(sb.toString());
                arrayList.add(r2);
            }
        }
        StringBuilder A0S = AnonymousClass008.A0S("contactpicker/missingnames/count ");
        A0S.append(arrayList.size());
        Log.d(A0S.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AnonymousClass02N r4 = (AnonymousClass02N) it2.next();
            Iterator it3 = this.A00.A04.A0E(r4).iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                StringBuilder sb2 = new StringBuilder("contactpicker/missingnames/");
                sb2.append(r4);
                sb2.append("/");
                sb2.append(next);
                Log.d(sb2.toString());
            }
        }
        if (arrayList.size() > 0) {
            Object obj = arrayList.get(0);
            ArrayList A0E = this.A00.A0E();
            Iterator it4 = A0E.iterator();
            while (it4.hasNext()) {
                C007003k r22 = (C007003k) it4.next();
                Jid jid = r22.A09;
                if (jid != null && jid.equals(obj)) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("contactpicker/firstmissingjid ");
                    A0S2.append(r22.toString());
                    Log.d(A0S2.toString());
                }
            }
            A0E.clear();
        }
    }
}
