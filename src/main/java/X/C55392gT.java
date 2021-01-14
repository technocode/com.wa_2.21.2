package X;

import android.util.Pair;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2gT  reason: invalid class name and case insensitive filesystem */
public class C55392gT implements AnonymousClass09O {
    public final /* synthetic */ AnonymousClass2RT A00;
    public final /* synthetic */ C08580bN A01;

    public C55392gT(AnonymousClass2RT r1, C08580bN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AnonymousClass09O
    public void AEv(String str) {
        this.A01.A08(Boolean.FALSE);
    }

    @Override // X.AnonymousClass09O
    public void AFd(String str, AnonymousClass0M5 r4) {
        this.A01.A08(Boolean.FALSE);
    }

    @Override // X.AnonymousClass09O
    public void AKk(String str, AnonymousClass0M5 r10) {
        AnonymousClass2RT r5 = this.A00;
        AnonymousClass009 r7 = r5.A00;
        AnonymousClass0M5 A0D = r10.A0E("privacy").A0D("list");
        if (A0D != null) {
            HashSet hashSet = new HashSet();
            String A0G = A0D.A0G("dhash", null);
            for (AnonymousClass0M5 r2 : A0D.A0H("user")) {
                hashSet.add(r2.A09(UserJid.class, "jid", r7));
            }
            Pair pair = new Pair(hashSet, A0G);
            AnonymousClass2RT.A01(r5, (Set) pair.first, (String) pair.second);
        }
        this.A01.A08(Boolean.TRUE);
    }
}
