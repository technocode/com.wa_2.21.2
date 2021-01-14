package X;

import android.content.Intent;
import com.google.android.search.verification.client.R;
import com.whatsapp.ViewSharedContactArrayActivity;
import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fN  reason: invalid class name and case insensitive filesystem */
public class C10890fN extends AnonymousClass0JW {
    public WeakReference A00;
    public final AnonymousClass0CO A01 = AnonymousClass0CO.A00();
    public final C000300f A02 = C000300f.A00();
    public final C017009c A03 = C017009c.A00();
    public final AnonymousClass01A A04 = AnonymousClass01A.A00();
    public final AnonymousClass00G A05 = AnonymousClass00G.A01;
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final AnonymousClass02N A07;
    public final List A08;

    public C10890fN(PhoneContactsSelector phoneContactsSelector, AnonymousClass02N r3, List list) {
        this.A00 = new WeakReference(phoneContactsSelector);
        this.A07 = r3;
        this.A08 = list;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        ActivityC004702f r2 = (ActivityC004702f) this.A00.get();
        if (r2 != null) {
            r2.APv(R.string.processing, R.string.register_wait_message);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ArrayList<String> arrayList = (ArrayList) obj;
        ActivityC004702f r5 = (ActivityC004702f) this.A00.get();
        if (r5 != null) {
            Intent intent = r5.getIntent();
            AnonymousClass02N r10 = this.A07;
            C007303n A062 = AnonymousClass0FI.A06(intent.getBundleExtra("quoted_message"));
            AnonymousClass02U A032 = AnonymousClass02U.A03(intent.getStringExtra("quoted_group_jid"));
            boolean booleanExtra = intent.getBooleanExtra("has_number_from_url", false);
            Intent intent2 = new Intent(r5, ViewSharedContactArrayActivity.class);
            intent2.putExtra("edit_mode", true);
            intent2.putExtra("jid", AnonymousClass1VY.A0D(r10));
            intent2.putExtra("quoted_message", AnonymousClass0FI.A04(A062));
            intent2.putExtra("quoted_group_jid", AnonymousClass1VY.A0D(A032));
            intent2.putExtra("has_number_from_url", booleanExtra);
            intent2.putStringArrayListExtra("vcard_array", arrayList);
            r5.A0H(intent2, 8);
            r5.A0K.A00();
        }
    }
}
