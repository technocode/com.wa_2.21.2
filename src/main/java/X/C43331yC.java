package X;

import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.util.HashMap;
import java.util.Stack;

/* renamed from: X.1yC  reason: invalid class name and case insensitive filesystem */
public class C43331yC {
    public static String A03;
    public static HashMap A04;
    public final AnonymousClass1T6 A00;
    public final AnonymousClass01X A01;
    public final AnonymousClass00Y A02;

    public C43331yC(AnonymousClass00Y r1, AnonymousClass1T6 r2, AnonymousClass01X r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass2DC A00(C011106q r2) {
        return (AnonymousClass2DC) ((C010706m) r2.A00.get(R.id.bloks_global_bloks_host)).A02;
    }

    public final void A01(C011106q r8, AnonymousClass2DC r9, HashMap hashMap, AbstractC009505y r11) {
        Object remove = hashMap.remove("clear_backstack");
        Object remove2 = hashMap.remove("get_params_from_stack");
        Object remove3 = hashMap.remove("camera_permission");
        AnonymousClass1T6 r4 = this.A00;
        Stack stack = r4.A02;
        stack.peek();
        HashMap hashMap2 = new HashMap((HashMap) stack.peek());
        if (remove2 != null) {
            hashMap2.putAll(hashMap);
            hashMap = hashMap2;
        }
        if (remove != null) {
            AnonymousClass0LW A042 = r9.A04();
            for (int i = 0; i < A042.A03(); i++) {
                A042.A0C();
                stack.size();
                HashMap hashMap3 = r4.A01;
                hashMap3.size();
                AnonymousClass1T6.A00(hashMap3);
                stack.pop();
            }
        }
        HashMap hashMap4 = r4.A01;
        AnonymousClass1T6.A00(hashMap4);
        stack.add(new HashMap());
        r4.A01(hashMap);
        if (r11 != null) {
            hashMap4.put("backpress", new C28021Sn(r8, r4.A00, r11));
        }
        if (remove3 != null) {
            r9.A2c();
        }
    }

    public void A02(C011106q r6, String str, HashMap hashMap, AbstractC009505y r9) {
        AnonymousClass2DC A002 = A00(r6);
        A01(r6, A002, hashMap, null);
        if (r9 != null) {
            AnonymousClass1T6 r1 = this.A00;
            r1.A01.put("dialog", new C28021Sn(r6, r1.A00, r9));
        }
        AnonymousClass0LW r3 = ((C010706m) r6.A00.get(R.id.bloks_global_bloks_host)).A01;
        DialogFragment dialogFragment = (DialogFragment) r3.A0Q.A01("bloks-dialog");
        if (dialogFragment != null) {
            dialogFragment.A0w(false, false);
        }
        A002.A4y(str, hashMap).A0u(r3, "bloks-dialog");
    }

    public void A03(C011106q r6, String str, HashMap hashMap, AbstractC009505y r9) {
        A03 = str;
        A04 = hashMap;
        AnonymousClass2DC A002 = A00(r6);
        Bundle extras = A002.getIntent().getExtras();
        if (extras != null) {
            extras.putString("screen_name", str);
        }
        A01(r6, A002, hashMap, r9);
        A002.A01 = A002.A4y(str, hashMap);
        AnonymousClass0LW r0 = ((C010706m) r6.A00.get(R.id.bloks_global_bloks_host)).A01;
        if (r0 != null) {
            AnonymousClass0QB r2 = new AnonymousClass0QB(r0);
            r2.A06(R.id.bloks_fragment_container, A002.A01, null);
            r2.A08(str);
            r2.A00();
            return;
        }
        throw null;
    }
}
