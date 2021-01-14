package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashSet;

/* renamed from: X.3L8  reason: invalid class name */
public class AnonymousClass3L8 implements AnonymousClass09O {
    public final AnonymousClass009 A00;
    public final C000300f A01;
    public final C42851xO A02;
    public final AnonymousClass00D A03;
    public final AnonymousClass09H A04;

    public AnonymousClass3L8(AnonymousClass009 r1, C000300f r2, AnonymousClass09H r3, AnonymousClass00D r4, C42851xO r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A02.A00.A00();
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r4) {
        this.A02.A00.A01(C002001d.A0E(r4));
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r13) {
        AnonymousClass0M5 A0B = r13.A0B();
        AnonymousClass0M5.A01(A0B, "list");
        if (A0B.A0F("matched").equals("false")) {
            HashSet hashSet = new HashSet();
            AnonymousClass0M5[] r10 = A0B.A03;
            if (r10 != null) {
                for (AnonymousClass0M5 r8 : r10) {
                    AnonymousClass0M5.A01(r8, "item");
                    hashSet.add(r8.A08(UserJid.class, "jid", this.A00));
                }
            }
            if (TextUtils.equals(A0B.A0G("c_dhash", null), this.A03.A00.getString("block_list_v2_dhash", null))) {
                Log.w("blocklistv2setprotocolhelper/onSuccess/only dhash mis-match.");
                this.A02.A00(false, hashSet, A0B.A0G("dhash", null));
                return;
            }
            Log.w("blocklistv2setprotocolhelper/onSuccess/dhash and c_dhash mis-match.");
            this.A02.A00(true, hashSet, null);
            return;
        }
        Log.d("blocklistv2setprotocolhelper/onSuccess/dhash match.");
        this.A02.A00.A02(A0B.A0G("dhash", null));
    }
}
