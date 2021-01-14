package X;

import android.app.Dialog;
import com.google.android.search.verification.client.R;
import com.whatsapp.Me;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.1wl  reason: invalid class name and case insensitive filesystem */
public class C42471wl implements AbstractC03690Hg {
    public final /* synthetic */ AnonymousClass2DB A00;

    public C42471wl(AnonymousClass2DB r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC03690Hg
    public void AFu(UserJid userJid, int i) {
        AnonymousClass2DB r1 = this.A00;
        if (C006803i.A0q(userJid, r1.A03)) {
            if (i == 404 && r1 == null) {
                throw null;
            }
            AbstractC42511wp r3 = r1.A01;
            if (r3 != null) {
                if (i == 404) {
                    r3.A00 = 1;
                } else if (i == 406) {
                    AnonymousClass2DB r5 = r3.A06;
                    AnonymousClass01I r2 = r3.A03;
                    AnonymousClass01X r6 = r3.A07;
                    WeakReference weakReference = C27851Ru.A00;
                    if (weakReference == null || weakReference.get() == null || !((Dialog) weakReference.get()).isShowing()) {
                        r2.A04();
                        Me me = r2.A00;
                        AnonymousClass0MB r22 = new AnonymousClass0MB(r5);
                        String A06 = r6.A06(R.string.catalog_hidden);
                        AnonymousClass0MC r0 = r22.A01;
                        r0.A0E = A06;
                        r0.A0J = true;
                        r22.A07(r6.A06(R.string.cancel), null);
                        r22.A06(r6.A06(R.string.register_user_support_button), new DialogInterface$OnClickListenerC27751Rg(r5, me));
                        AnonymousClass0MD A002 = r22.A00();
                        C27851Ru.A00 = new WeakReference(A002);
                        A002.show();
                    }
                } else {
                    AnonymousClass008.A0w("business-catalog-list-adapter/request-catalog/fetch-catalog-error/error: ", i);
                    r3.A00 = 2;
                }
                ((AbstractC16300pa) r3).A01.A00();
                return;
            }
            throw null;
        }
    }

    @Override // X.AbstractC03690Hg
    public void AFv(UserJid userJid) {
        AnonymousClass2DB r2 = this.A00;
        if (C006803i.A0q(userJid, r2.A03)) {
            r2.A04 = true;
            r2.invalidateOptionsMenu();
            if (!r2.A05) {
                r2.A05 = true;
                r2.A07.A03(4, 23, null, r2.A03, (Integer) r2.getIntent().getSerializableExtra("source"));
            }
            AbstractC42511wp r0 = r2.A01;
            r0.A0A(userJid);
            r0.A09();
            ((AbstractC16300pa) r0).A01.A00();
        }
    }
}
