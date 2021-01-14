package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.SystemStatusActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1rY  reason: invalid class name and case insensitive filesystem */
public class C39451rY extends AnonymousClass0JW {
    public WeakReference A00;
    public HashMap A01;
    public final Bundle A02;
    public final AnonymousClass04j A03;
    public final AnonymousClass03P A04;
    public final AnonymousClass03S A05;
    public final AnonymousClass01X A06;
    public final AnonymousClass0KP A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public C39451rY(ActivityC004702f r2, AnonymousClass03P r3, AnonymousClass01X r4, AnonymousClass04j r5, AnonymousClass03S r6, AnonymousClass0KP r7, boolean z, boolean z2, boolean z3, String str, Bundle bundle) {
        this.A00 = new WeakReference(r2);
        this.A04 = r3;
        this.A06 = r4;
        this.A07 = r7;
        this.A03 = r5;
        this.A05 = r6;
        this.A0A = z;
        this.A09 = z2;
        this.A0B = z3;
        this.A08 = str;
        this.A02 = bundle;
    }

    @Override // X.AnonymousClass0JW
    public void A01() {
        Activity activity = (Activity) this.A00.get();
        if (activity != null) {
            C002001d.A2O(activity, 122);
        }
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        String str;
        ActivityC004702f r10 = (ActivityC004702f) this.A00.get();
        if (r10 != null && !r10.AB1()) {
            C002001d.A2N(r10, 122);
            if (!this.A03.A05()) {
                Log.i("checksystemstatus/no-connectivity");
                AnonymousClass01X r3 = this.A06;
                r10.APr(r3.A0D(R.string.register_check_connectivity, r3.A06(R.string.connectivity_self_help_instructions)));
                return;
            }
            HashMap hashMap = this.A01;
            int i = null;
            if (hashMap == null || hashMap.size() == 0) {
                Log.i("checksystemstatus/no-server-status");
                if (this.A0A) {
                    C002001d.A2O(r10, 123);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                boolean z = this.A09;
                if (z) {
                    str = "chat";
                } else {
                    str = "reg";
                }
                String A0O = AnonymousClass008.A0O(sb, str, "-unknown");
                if (z) {
                    i = 1;
                }
                Intent A0R = C002001d.A0R(r10, this.A08, A0O, i, null, null, this.A02);
                if (C002001d.A3C()) {
                    r10.A0H(A0R, 17);
                } else {
                    r10.A0I(A0R, this.A0B);
                }
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                boolean z2 = true;
                boolean z3 = true;
                for (Object obj2 : hashMap.keySet()) {
                    if ("version".equals(obj2)) {
                        Object obj3 = this.A01.get(obj2);
                        if (obj3 != null) {
                            z3 = ((Boolean) obj3).booleanValue();
                        } else {
                            throw null;
                        }
                    } else if ("email".equals(obj2)) {
                        Object obj4 = this.A01.get(obj2);
                        if (obj4 != null) {
                            z2 = ((Boolean) obj4).booleanValue();
                        } else {
                            throw null;
                        }
                    } else {
                        Object obj5 = this.A01.get(obj2);
                        if (obj5 == null) {
                            throw null;
                        } else if (!((Boolean) obj5).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                }
                if (arrayList.size() != 0 || !z3 || this.A0A) {
                    String str2 = this.A08;
                    if (this.A09) {
                        i = 1;
                    }
                    boolean z4 = this.A0A;
                    Bundle bundle = this.A02;
                    Intent intent = new Intent(r10, SystemStatusActivity.class);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.from", str2);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.email", z2);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.version", z3);
                    intent.putStringArrayListExtra("com.whatsapp.SystemStatusActivity.serverfeaturesunavailable", arrayList);
                    intent.putExtra("com.whatsapp.SystemStatusActivity.statusonly", z4);
                    if (i != null) {
                        intent.putExtra("com.whatsapp.SystemStatusActivity.type", i);
                    }
                    if (bundle != null) {
                        intent.putExtra("com.whatsapp.SystemStatusActivity.describeProblemBundle", bundle);
                    }
                    r10.A0I(intent, false);
                    return;
                }
                Intent A0R2 = C002001d.A0R(r10, this.A08, null, this.A09 ? 1 : null, null, null, this.A02);
                if (C002001d.A3C()) {
                    r10.A0H(A0R2, 17);
                } else {
                    r10.A0I(A0R2, this.A0B);
                }
            }
        }
    }
}
