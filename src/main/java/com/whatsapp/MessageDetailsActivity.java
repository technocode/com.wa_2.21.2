package com.whatsapp;

import X.AbstractC007503q;
import X.AbstractC03640Hb;
import X.AbstractC03750Hm;
import X.AbstractC51572Zg;
import X.ActivityC004602e;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01K;
import X.AnonymousClass02J;
import X.AnonymousClass02N;
import X.AnonymousClass08B;
import X.AnonymousClass08C;
import X.AnonymousClass0AC;
import X.AnonymousClass0BP;
import X.AnonymousClass0CN;
import X.AnonymousClass0D1;
import X.AnonymousClass0L2;
import X.AnonymousClass0OY;
import X.AnonymousClass0YX;
import X.AnonymousClass1VY;
import X.AnonymousClass1t3;
import X.AnonymousClass1t4;
import X.AnonymousClass1t5;
import X.AnonymousClass2C0;
import X.AnonymousClass2IG;
import X.AnonymousClass31y;
import X.AnonymousClass3SQ;
import X.C000300f;
import X.C002001d;
import X.C014308b;
import X.C017009c;
import X.C02330Bo;
import X.C04350Ka;
import X.C04360Kb;
import X.C26741Mg;
import X.C26781Mk;
import X.C28301Tu;
import X.C48122Kz;
import X.C60352pI;
import X.C670036v;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MessageDetailsActivity extends ActivityC004602e implements AbstractC03750Hm, AbstractC03640Hb {
    public long A00;
    public BaseAdapter A01;
    public ListView A02;
    public AnonymousClass0YX A03;
    public AbstractC51572Zg A04;
    public AnonymousClass2IG A05;
    public AbstractC007503q A06;
    public boolean A07;
    public final C04350Ka A08 = C04350Ka.A00();
    public final C000300f A09 = C000300f.A00();
    public final C04360Kb A0A = C04360Kb.A00();
    public final C017009c A0B = C017009c.A00();
    public final AnonymousClass01A A0C = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0D = new AnonymousClass1t4(this);
    public final AnonymousClass08B A0E = AnonymousClass08B.A00;
    public final C014308b A0F = C014308b.A00();
    public final AnonymousClass08C A0G = AnonymousClass08C.A00();
    public final AnonymousClass0L2 A0H = AnonymousClass0L2.A01();
    public final AnonymousClass00S A0I = AnonymousClass00S.A00();
    public final AnonymousClass00G A0J = AnonymousClass00G.A01;
    public final AnonymousClass01K A0K = AnonymousClass01K.A00();
    public final AnonymousClass019 A0L = new AnonymousClass1t3(this);
    public final AnonymousClass0AC A0M = AnonymousClass0AC.A00;
    public final C02330Bo A0N = C02330Bo.A00();
    public final AnonymousClass02J A0O = AnonymousClass02J.A02();
    public final AnonymousClass31y A0P = AnonymousClass31y.A00();
    public final AnonymousClass0D1 A0Q = AnonymousClass0D1.A00();
    public final AnonymousClass0CN A0R = AnonymousClass0CN.A00();
    public final C670036v A0S = C670036v.A00();
    public final Runnable A0T = new RunnableEBaseShape6S0100000_I1_1(this, 46);
    public final ArrayList A0U = new ArrayList();

    public static CharSequence A04(MessageDetailsActivity messageDetailsActivity, long j) {
        return C002001d.A1F(((AnonymousClass2C0) messageDetailsActivity).A01, messageDetailsActivity.A0I.A06(j));
    }

    public final void A0T() {
        ArrayList arrayList = this.A0U;
        arrayList.clear();
        this.A00 = Long.MAX_VALUE;
        ConcurrentHashMap concurrentHashMap = this.A0N.A01(this.A06).A00;
        if (concurrentHashMap.size() == 0) {
            AnonymousClass02N r1 = this.A06.A0n.A00;
            if (AnonymousClass1VY.A0e(r1)) {
                concurrentHashMap.put(r1, new C48122Kz(0, 0, 0));
            }
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            C48122Kz r2 = (C48122Kz) entry.getValue();
            arrayList.add(new C26781Mk((UserJid) entry.getKey(), r2));
            long A012 = r2.A01(5);
            long A013 = r2.A01(13);
            long A014 = r2.A01(8);
            if (A012 != 0) {
                this.A00 = Math.min(this.A00, A012);
                i++;
            }
            if (A013 != 0) {
                this.A00 = Math.min(this.A00, A013);
                i3++;
            }
            if (A014 != 0) {
                this.A00 = Math.min(this.A00, A014);
                i2++;
            }
        }
        AbstractC007503q r5 = this.A06;
        AnonymousClass02N r12 = r5.A0n.A00;
        if (AnonymousClass1VY.A0Y(r12) || AnonymousClass1VY.A0T(r12)) {
            int i4 = r5.A06;
            if (i2 < i4 && r5.A0m == 2 && r5.A04 == 1) {
                arrayList.add(new AnonymousClass1t5(i4 - i2, 8));
            }
            if (i3 < i4) {
                arrayList.add(new AnonymousClass1t5(i4 - i3, 13));
            }
            if (i < i4) {
                arrayList.add(new AnonymousClass1t5(i4 - i, 5));
            }
        }
        Collections.sort(arrayList, new C26741Mg(this));
        BaseAdapter baseAdapter = this.A01;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
        }
        A0U();
    }

    public final void A0U() {
        ListView listView = this.A02;
        Runnable runnable = this.A0T;
        listView.removeCallbacks(runnable);
        long j = this.A00;
        if (j != Long.MAX_VALUE) {
            this.A02.postDelayed(runnable, (AnonymousClass0OY.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }

    @Override // X.AbstractC03750Hm
    public AnonymousClass0YX A5P() {
        return this.A05.A01(this);
    }

    @Override // X.AbstractC03640Hb
    public AnonymousClass0D1 A9D() {
        return this.A0Q;
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
            this.A0A.A09(this.A08, this.A06, A0G2);
            AbstractList abstractList = (AbstractList) A0G2;
            if (abstractList.size() != 1 || AnonymousClass1VY.A0b((Jid) abstractList.get(0))) {
                A0S(A0G2);
            } else {
                startActivity(Conversation.A04(this, this.A0C.A0A((AnonymousClass02N) abstractList.get(0))));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00bf, code lost:
        if (r2 != false) goto L_0x00c1;
     */
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r27) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.MessageDetailsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A03.A00();
        AnonymousClass2IG r1 = this.A05;
        AnonymousClass0YX r0 = r1.A00;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass0D1 r02 = r1.A01;
        if (r02 != null) {
            r02.A04();
        }
        AnonymousClass3SQ r03 = r1.A02;
        if (r03 != null) {
            r03.A07();
        }
        C28301Tu.A05();
        this.A02.removeCallbacks(this.A0T);
        this.A0E.A00(this.A0D);
        this.A0M.A00(this.A0L);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A0S.A01();
        if (C28301Tu.A07()) {
            C28301Tu.A02();
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        if (C28301Tu.A07()) {
            C28301Tu.A04();
        }
        AbstractC51572Zg r1 = this.A04;
        if (r1 instanceof C60352pI) {
            ((C60352pI) r1).A0o();
        }
    }
}
