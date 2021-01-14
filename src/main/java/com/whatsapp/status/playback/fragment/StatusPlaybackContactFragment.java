package com.whatsapp.status.playback.fragment;

import X.AbstractC007503q;
import X.AbstractC40751tm;
import X.AbstractC659532f;
import X.AbstractC71663Pv;
import X.ActivityC004602e;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02Z;
import X.AnonymousClass037;
import X.AnonymousClass08B;
import X.AnonymousClass08V;
import X.AnonymousClass0AC;
import X.AnonymousClass0BB;
import X.AnonymousClass0BP;
import X.AnonymousClass0FI;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0ML;
import X.AnonymousClass0XM;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YA;
import X.AnonymousClass0YX;
import X.AnonymousClass0ZC;
import X.AnonymousClass1VY;
import X.AnonymousClass31y;
import X.AnonymousClass32Y;
import X.AnonymousClass32Z;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C006803i;
import X.C007003k;
import X.C007303n;
import X.C014308b;
import X.C04350Ka;
import X.C04360Kb;
import X.C09810dZ;
import X.C12080hW;
import X.C659632g;
import X.C659832i;
import X.C71453Pa;
import X.C71543Pj;
import X.C71553Pk;
import X.C71563Pl;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.List;

public class StatusPlaybackContactFragment extends StatusPlaybackBaseFragment implements AnonymousClass0Y8, AnonymousClass0YA, AbstractC40751tm {
    public int A00;
    public int A01;
    public AnonymousClass0YX A02;
    public UserJid A03;
    public AbstractC007503q A04;
    public C09810dZ A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass08V A09;
    public final AnonymousClass02M A0A = AnonymousClass02M.A00();
    public final AnonymousClass01I A0B = AnonymousClass01I.A00();
    public final C04350Ka A0C = C04350Ka.A00();
    public final C000300f A0D = C000300f.A00();
    public final C04360Kb A0E = C04360Kb.A00();
    public final AnonymousClass01A A0F = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0G;
    public final AnonymousClass08B A0H = AnonymousClass08B.A00;
    public final C014308b A0I = C014308b.A00();
    public final AnonymousClass0L2 A0J = AnonymousClass0L2.A01();
    public final AnonymousClass00S A0K = AnonymousClass00S.A00();
    public final AnonymousClass01X A0L = AnonymousClass01X.A00();
    public final AnonymousClass01K A0M = AnonymousClass01K.A00();
    public final AnonymousClass019 A0N;
    public final AnonymousClass0AC A0O = AnonymousClass0AC.A00;
    public final AnonymousClass0BB A0P = AnonymousClass0BB.A00();
    public final AnonymousClass31y A0Q = AnonymousClass31y.A00();
    public final AnonymousClass0XM A0R = AnonymousClass0XM.A00();
    public final C659632g A0S;
    public final C659832i A0T;
    public final AnonymousClass00T A0U = C002101e.A00();

    public StatusPlaybackContactFragment() {
        if (C659632g.A00 == null) {
            synchronized (C659632g.class) {
                if (C659632g.A00 == null) {
                    C659632g.A00 = new C659632g();
                }
            }
        }
        this.A0S = C659632g.A00;
        this.A0T = new C659832i();
        this.A00 = 0;
        this.A09 = new C71543Pj(this);
        this.A0G = new C71553Pk(this);
        this.A0N = new C71563Pl(this);
    }

    public static boolean A00(StatusPlaybackContactFragment statusPlaybackContactFragment, int i, int i2) {
        List list = statusPlaybackContactFragment.A06;
        if (list == null) {
            return false;
        }
        if (statusPlaybackContactFragment.A00 < list.size() - 1) {
            statusPlaybackContactFragment.A10(statusPlaybackContactFragment.A00 + 1);
            statusPlaybackContactFragment.A12(statusPlaybackContactFragment.A0w(), i, i2);
            return true;
        }
        AnonymousClass32Z r1 = (AnonymousClass32Z) statusPlaybackContactFragment.A0A();
        if (r1 != null) {
            return r1.AGq(statusPlaybackContactFragment.A0n(), true, i, i2);
        }
        return false;
    }

    @Override // X.AnonymousClass037
    public void A0X() {
        super.A0U = true;
        this.A09.A06(-1);
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, X.AnonymousClass037
    public void A0b(Bundle bundle) {
        super.A0b(bundle);
        this.A0H.A01(this.A0G);
        this.A0O.A01(this.A0N);
        AnonymousClass00T r4 = this.A0U;
        r4.ANC(this.A05, new Void[0]);
        UserJid userJid = this.A03;
        if (!AnonymousClass02Z.A02(userJid)) {
            C007003k A0A2 = this.A0F.A0A(userJid);
            if (A0A2.A0a) {
                A0A2.A0a = false;
                r4.ANF(new RunnableEBaseShape9S0200000_I1_4(this, A0A2, 11));
            }
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.AnonymousClass037
    public void A0c() {
        super.A0c();
        this.A0H.A00(this.A0G);
        this.A0O.A00(this.A0N);
        C09810dZ r0 = this.A05;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        AnonymousClass0YX r02 = this.A02;
        if (r02 != null) {
            r02.A00();
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.AnonymousClass037
    public void A0d() {
        super.A0d();
        for (AbstractC659532f r1 : ((AbstractMap) this.A09.A05()).values()) {
            if (this.A0T == null) {
                throw null;
            } else if (r1 != null && r1.A03) {
                r1.A03();
            }
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.AnonymousClass037
    public void A0e() {
        super.A0e();
        for (AbstractC659532f r1 : ((AbstractMap) this.A09.A05()).values()) {
            if (this.A0T == null) {
                throw null;
            } else if (r1 != null && !r1.A03) {
                r1.A04();
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i == 2 && i2 == -1 && intent != null) {
            List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
            this.A0E.A09(this.A0C, this.A04, A0G2);
            AbstractList abstractList = (AbstractList) A0G2;
            if (abstractList.size() != 1 || AnonymousClass1VY.A0b((Jid) abstractList.get(0))) {
                ((ActivityC004602e) A0A()).A0S(A0G2);
            } else {
                A0h(Conversation.A05(A00(), (AnonymousClass02N) abstractList.get(0)));
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        C007303n A092;
        super.A0i(bundle);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            this.A03 = AnonymousClass1VY.A0B(bundle2.getString("jid"));
            this.A08 = ((AnonymousClass037) this).A06.getBoolean("unseen_only");
            if (bundle != null && (A092 = C006803i.A09(bundle, "")) != null) {
                this.A04 = this.A0M.A0J.A05(A092);
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        AbstractC007503q r0 = this.A04;
        if (r0 != null) {
            C006803i.A0T(bundle, r0.A0n, "");
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment, X.AnonymousClass037
    public void A0l(View view, Bundle bundle) {
        super.A0l(view, bundle);
        if (((AnonymousClass037) this).A06 != null) {
            AnonymousClass32Y A0t = A0t();
            UserJid userJid = this.A03;
            if (AnonymousClass02Z.A02(userJid) || AnonymousClass1VY.A0a(userJid)) {
                A0t.A02.setVisibility(8);
            } else {
                A0t.A02.setVisibility(0);
            }
            this.A02 = this.A0J.A03(A00());
            A0y();
            this.A05 = new C09810dZ(this, C006803i.A09(((AnonymousClass037) this).A06, ""), this.A08, this.A03);
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment
    public void A0p() {
        super.A0p();
        if (this.A06 != null) {
            int i = this.A00;
            this.A00 = -1;
            if (i == -1) {
                i = 0;
            }
            A10(i);
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment
    public void A0q() {
        super.A0q();
        AbstractC659532f A0w = A0w();
        if (A0w != null && A0w.A04) {
            A0w.A06();
        }
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackBaseFragment
    public void A0v(boolean z) {
        super.A0v(z);
        AbstractC659532f A0w = A0w();
        if (A0w != null) {
            ((AbstractC71663Pv) A0w).A0B().A06(z);
        }
    }

    public final AbstractC659532f A0w() {
        List list;
        int i = this.A00;
        if (i < 0 || (list = this.A06) == null || i >= list.size()) {
            return null;
        }
        return (AbstractC659532f) this.A09.A03(((AbstractC007503q) this.A06.get(this.A00)).A0n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [X.3c0] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AbstractC659532f A0x(X.AbstractC007503q r11) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment.A0x(X.03q):X.32f");
    }

    public final void A0y() {
        AnonymousClass32Y A0t = A0t();
        AnonymousClass01A r2 = this.A0F;
        UserJid userJid = this.A03;
        if (AnonymousClass02Z.A02(userJid)) {
            AnonymousClass01I r0 = this.A0B;
            r0.A04();
            userJid = r0.A03;
            if (userJid == null) {
                throw null;
            }
        }
        C007003k A0A2 = r2.A0A(userJid);
        AnonymousClass0YX r1 = this.A02;
        if (r1 != null) {
            r1.A02(A0A2, A0t.A09);
        }
        FrameLayout frameLayout = A0t.A07;
        AnonymousClass01X r12 = this.A0L;
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) frameLayout.findViewById(R.id.name);
        if (AnonymousClass02Z.A02(this.A03)) {
            textEmojiLabel.setText(r12.A06(R.string.my_status));
            textEmojiLabel.setCompoundDrawables(null, null, null, null);
            return;
        }
        textEmojiLabel.A04(this.A0I.A05(A0A2), null, false, 0);
        boolean A0a = AnonymousClass1VY.A0a(this.A03);
        if (!A0a) {
            textEmojiLabel.setCompoundDrawables(null, null, null, null);
        } else if (A0a) {
            textEmojiLabel.A01(R.drawable.ic_verified);
        } else if (A0a) {
            textEmojiLabel.A01(R.drawable.ic_verified_large);
        }
    }

    public final void A0z() {
        AnonymousClass0M4 r1;
        AnonymousClass32Y A0t = A0t();
        A0t.A0C.setCount(this.A06.size());
        A0t.A0C.A06.clear();
        if (AnonymousClass02Z.A02(this.A03)) {
            int i = 0;
            for (AbstractC007503q r2 : this.A06) {
                if ((r2 instanceof AnonymousClass0M3) && (r1 = ((AnonymousClass0M3) r2).A02) != null && !r1.A0P && !r1.A0a && (!(r2 instanceof AnonymousClass0ZC) || !AnonymousClass0FI.A0u((AnonymousClass0ML) r2))) {
                    A0t.A0C.A06.add(Integer.valueOf(i));
                }
                i++;
            }
        }
    }

    public final void A10(int i) {
        List list;
        boolean z;
        if (!(this.A00 == i || (list = this.A06) == null)) {
            if (list.isEmpty()) {
                StringBuilder sb = new StringBuilder("playbackFragment/setPageActive no-messages ");
                sb.append(this);
                Log.w(sb.toString());
                return;
            }
            this.A00 = i;
            AnonymousClass32Y A0t = A0t();
            A0t.A0C.setPosition(i);
            A0t.A0C.setProgressProvider(null);
            AbstractC007503q r5 = (AbstractC007503q) this.A06.get(i);
            AbstractC659532f A0x = A0x(r5);
            View view = A0t.A04;
            if (!(((AbstractC71663Pv) A0x).A0B() instanceof C71453Pa)) {
                z = true;
            } else {
                z = false;
            }
            int i2 = 4;
            if (z) {
                i2 = 0;
            }
            view.setVisibility(i2);
            View view2 = A0x.A00;
            if (A0t.A06.getChildCount() == 0 || A0t.A06.getChildAt(0) != view2) {
                A0t.A06.removeAllViews();
                A0t.A06.addView(view2);
            }
            for (AbstractC659532f r1 : ((AbstractMap) this.A09.A05()).values()) {
                if (!(r1 == A0x || r1 == null || !r1.A04)) {
                    r1.A06();
                }
            }
            A11(r5);
            if (this.A0T != null) {
                if (!A0x.A04) {
                    A0x.A05();
                }
                if (i < this.A06.size() - 1) {
                    A0x((AbstractC007503q) this.A06.get(i + 1));
                }
                if (i > 0) {
                    A0x((AbstractC007503q) this.A06.get(i - 1));
                    return;
                }
                return;
            }
            throw null;
        }
    }

    public final void A11(AbstractC007503q r7) {
        AnonymousClass0M4 r1;
        AnonymousClass32Y A0t = A0t();
        if (!AnonymousClass1VY.A0a(this.A03)) {
            A0t.A0A.setVisibility(0);
            if (!r7.A0n.A02) {
                A0t.A0A.setText(C002001d.A1F(this.A0L, this.A0K.A06(r7.A0E)));
            } else if (C12080hW.A00(r7.A08, 4) >= 0) {
                long j = r7.A0D;
                if (j <= 0) {
                    j = r7.A0E;
                }
                A0t.A0A.setText(C002001d.A1F(this.A0L, this.A0K.A06(j)));
            } else if (!(r7 instanceof AnonymousClass0M3) || (r1 = ((AnonymousClass0M3) r7).A02) == null || r1.A0P || r1.A0a) {
                A0t.A0A.setText(this.A0L.A06(R.string.sending_status_progress));
            } else {
                A0t.A0A.setText(this.A0L.A06(R.string.sending_status_failed));
            }
        } else {
            A0t.A0A.setVisibility(8);
        }
    }

    public final void A12(AbstractC659532f r3, int i, int i2) {
        for (AbstractC659532f r0 : ((AbstractMap) this.A09.A05()).values()) {
            if (r0 != r3) {
                C659832i.A00(r0, i);
            }
        }
        if (this.A0T == null) {
            throw null;
        } else if (r3 != null && !r3.A05) {
            AbstractC71663Pv r32 = (AbstractC71663Pv) r3;
            ((AbstractC659532f) r32).A05 = true;
            r32.A0M(i2, r32.A06);
        }
    }

    @Override // X.AnonymousClass0Y9
    public void AF4(DialogFragment dialogFragment, boolean z) {
        this.A07 = z;
        A0o();
    }

    @Override // com.whatsapp.status.playback.fragment.StatusPlaybackFragment, X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC659532f A0w = A0w();
        if (A0w != null) {
            A0w.A01();
        }
    }

    @Override // X.AnonymousClass037
    public String toString() {
        UserJid userJid = this.A03;
        if (userJid != null) {
            return userJid.getObfuscatedString();
        }
        Bundle bundle = ((AnonymousClass037) this).A06;
        if (bundle != null) {
            String string = bundle.getString("jid");
            if (string != null) {
                return string;
            }
            throw null;
        }
        throw null;
    }
}
