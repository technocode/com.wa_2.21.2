package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1wn  reason: invalid class name and case insensitive filesystem */
public final class C42491wn implements AbstractC03690Hg {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C02780Dk A02;
    public final /* synthetic */ AnonymousClass02M A03;
    public final /* synthetic */ C41191ud A04;
    public final /* synthetic */ C42391wd A05;
    public final /* synthetic */ UserJid A06;
    public final /* synthetic */ Class A07 = CatalogListActivity.class;

    public C42491wn(UserJid userJid, AnonymousClass02M r3, C42391wd r4, C02780Dk r5, Context context, int i, C41191ud r8) {
        this.A06 = userJid;
        this.A03 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A01 = context;
        this.A00 = i;
        this.A04 = r8;
    }

    @Override // X.AbstractC03690Hg
    public void AFu(UserJid userJid, int i) {
        if (C006803i.A0q(this.A06, userJid)) {
            AnonymousClass02M r3 = this.A03;
            r3.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, this.A05, 40));
            this.A04.A00(Boolean.FALSE);
        }
    }

    @Override // X.AbstractC03690Hg
    public void AFv(UserJid userJid) {
        UserJid userJid2 = this.A06;
        if (C006803i.A0q(userJid2, userJid)) {
            AnonymousClass02M r3 = this.A03;
            r3.A02.post(new RunnableEBaseShape6S0200000_I1_1(this, this.A05, 39));
            C02780Dk r5 = this.A02;
            Context context = this.A01;
            Class cls = this.A07;
            Integer valueOf = Integer.valueOf(this.A00);
            Intent intent = new Intent(context, cls);
            intent.putExtra("cache_jid", userJid2.getRawString());
            intent.putExtra("source", valueOf);
            r5.A05(context, intent);
            this.A04.A00(Boolean.TRUE);
        }
    }
}
