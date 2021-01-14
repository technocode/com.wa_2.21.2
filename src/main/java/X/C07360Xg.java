package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.0Xg  reason: invalid class name and case insensitive filesystem */
public class C07360Xg implements AnonymousClass0C0 {
    public static volatile C07360Xg A05;
    public final AnonymousClass0DH A00;
    public final C014508d A01;
    public final AnonymousClass0EO A02;
    public final AnonymousClass0AR A03;
    public final C04510Kq A04;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{8};
    }

    public C07360Xg(AnonymousClass0AR r1, AnonymousClass0DH r2, AnonymousClass0EO r3, C04510Kq r4, C014508d r5) {
        this.A03 = r1;
        this.A00 = r2;
        this.A02 = r3;
        this.A04 = r4;
        this.A01 = r5;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        C64522yK r1;
        if (8 != i) {
            return false;
        }
        C64172xk r12 = (C64172xk) message.obj;
        String str = r12.A01;
        if ("groups".equals(str)) {
            if (this.A01.A00) {
                Log.i("DirtyBitHandler/onGroupsDirty call refetchGroups");
                AnonymousClass0EO r13 = this.A02;
                r13.A03.set(true);
                if (r13.A0l) {
                    return true;
                }
                r13.A0M(true, true, 3);
                return true;
            }
            Log.i("DirtyBitHandler/onGroupsDirty/no-db-access/skip");
            return true;
        } else if ("account_sync".equals(str)) {
            if (this.A01.A00) {
                C04510Kq r2 = this.A04;
                Set set = r12.A02;
                C64512yJ r4 = new C64512yJ();
                if (set.isEmpty()) {
                    r4.A05 = true;
                    r4.A03 = true;
                    r4.A04 = true;
                    r4.A02 = true;
                    r4.A01 = true;
                    r1 = new C64522yK(r4);
                } else {
                    r4.A02 = set.contains("device");
                    r4.A05 = set.contains("status");
                    r4.A03 = set.contains("picture");
                    r4.A04 = set.contains("privacy");
                    r4.A01 = set.contains("blocklist");
                    r1 = new C64522yK(r4);
                }
                r2.A01(r1, true, false);
                return true;
            }
            Log.i("DirtyBitHandler/onAccountDirty/no-db-access/skip");
            return true;
        } else if ("syncd_app_state".equals(str)) {
            Log.i("OnDirtyMessageHandler/onSyncDDirty");
            AnonymousClass0DH r3 = this.A00;
            Long l = r12.A00;
            if (r3.A0K()) {
                r3.A09.A01(AbstractC48162Ld.A08);
                r3.A0B();
            }
            r3.A0L.A0P("syncd_app_state", l);
            return true;
        } else {
            StringBuilder A0S = AnonymousClass008.A0S("OnDirtyMessageHandler/onDirty received unknown dirty bit category: ");
            A0S.append(str);
            Log.w(A0S.toString());
            this.A03.A0P(str, null);
            return true;
        }
    }
}
