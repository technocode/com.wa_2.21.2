package com.whatsapp;

import X.AbstractC000400g;
import X.AbstractC004502c;
import X.AbstractC07200Wh;
import X.AbstractC07520Xz;
import X.AbstractC27051Nt;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02Z;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass09E;
import X.AnonymousClass0AC;
import X.AnonymousClass0BB;
import X.AnonymousClass0BP;
import X.AnonymousClass0CH;
import X.AnonymousClass0HJ;
import X.AnonymousClass0JW;
import X.AnonymousClass0K9;
import X.AnonymousClass0KB;
import X.AnonymousClass0L2;
import X.AnonymousClass0L4;
import X.AnonymousClass0M3;
import X.AnonymousClass0OY;
import X.AnonymousClass0Q7;
import X.AnonymousClass0XB;
import X.AnonymousClass0Y2;
import X.AnonymousClass0Y8;
import X.AnonymousClass0YA;
import X.AnonymousClass0YX;
import X.AnonymousClass0Yj;
import X.AnonymousClass1Ny;
import X.AnonymousClass1VC;
import X.AnonymousClass1VY;
import X.AnonymousClass31y;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C015408m;
import X.C02270Bi;
import X.C02580Cq;
import X.C02590Cr;
import X.C03120Ew;
import X.C04380Kd;
import X.C05270Nw;
import X.C09040cC;
import X.C09140cM;
import X.C09150cN;
import X.C09160cO;
import X.C09170cP;
import X.C09180cQ;
import X.C09510d4;
import X.C09520d5;
import X.C09530d6;
import X.C10780fB;
import X.C10800fE;
import X.C10810fF;
import X.C10820fG;
import X.C10830fH;
import X.C12060hU;
import X.C25981Jb;
import X.C26011Je;
import X.C27021Nq;
import X.C28051Sr;
import X.C39081qv;
import X.C40791tq;
import X.C40811ts;
import X.C43471yQ;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaListFragment;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StatusesFragment extends WaListFragment implements AnonymousClass0Y2, AbstractC07520Xz, AnonymousClass0Y8, AnonymousClass0YA {
    public AnimatorSet A00;
    public ValueAnimator A01;
    public View A02;
    public C40791tq A03;
    public C10830fH A04;
    public C09150cN A05 = new C09150cN();
    public C10820fG A06;
    public AnonymousClass0YX A07;
    public C09510d4 A08;
    public C10810fF A09;
    public CharSequence A0A;
    public List A0B;
    public List A0C = new ArrayList();
    public List A0D = new ArrayList();
    public List A0E = new ArrayList();
    public Set A0F = new HashSet();
    public boolean A0G;
    public boolean A0H = true;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K;
    public final AnonymousClass0L4 A0L = AnonymousClass0L4.A00();
    public final AnonymousClass02M A0M = AnonymousClass02M.A00();
    public final AnonymousClass01I A0N = AnonymousClass01I.A00();
    public final C000300f A0O = C000300f.A00();
    public final C04380Kd A0P = C04380Kd.A00();
    public final C09040cC A0Q = C09040cC.A00();
    public final AnonymousClass0HJ A0R = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0S = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0T = new C09160cO(this);
    public final AnonymousClass08B A0U = AnonymousClass08B.A00;
    public final C014308b A0V = C014308b.A00();
    public final AnonymousClass0L2 A0W = AnonymousClass0L2.A01();
    public final AbstractC07200Wh A0X = new C09180cQ(this);
    public final AnonymousClass00C A0Y = AnonymousClass00C.A00();
    public final AnonymousClass03P A0Z = AnonymousClass03P.A00();
    public final AnonymousClass00S A0a = AnonymousClass00S.A00();
    public final AnonymousClass00G A0b = AnonymousClass00G.A01;
    public final AnonymousClass03S A0c = AnonymousClass03S.A00();
    public final AnonymousClass00D A0d = AnonymousClass00D.A00();
    public final AnonymousClass01X A0e = AnonymousClass01X.A00();
    public final AnonymousClass019 A0f = new C09170cP(this);
    public final AnonymousClass0AC A0g = AnonymousClass0AC.A00;
    public final C03120Ew A0h = C03120Ew.A00();
    public final AnonymousClass09E A0i = AnonymousClass09E.A00();
    public final C02590Cr A0j = C02590Cr.A00();
    public final AnonymousClass00Y A0k = AnonymousClass00Y.A00();
    public final AnonymousClass022 A0l = AnonymousClass022.A00();
    public final AnonymousClass0BB A0m = AnonymousClass0BB.A00();
    public final AnonymousClass31y A0n = AnonymousClass31y.A00();
    public final AnonymousClass0K9 A0o = AnonymousClass0K9.A00();
    public final AnonymousClass0KB A0p = AnonymousClass0KB.A00();
    public final C09140cM A0q = C09140cM.A00();
    public final C02580Cq A0r = C02580Cq.A01();
    public final AnonymousClass00T A0s = C002101e.A00();
    public final Runnable A0t = new RunnableEBaseShape2S0100000_I0_2(this, 2);
    public final Runnable A0u = new RunnableEBaseShape1S0100000_I0_1(this, 44);
    public final List A0v = new ArrayList();
    public final List A0w = new ArrayList();

    @Override // X.AnonymousClass0Y9
    public void AF4(DialogFragment dialogFragment, boolean z) {
    }

    @Override // X.AbstractC07520Xz
    public void ANS(C007003k r1) {
    }

    @Override // X.AbstractC07520Xz
    public boolean AQO() {
        return true;
    }

    public static void A00(StatusesFragment statusesFragment, int i, int i2, Object[] objArr) {
        AbstractC004502c r0 = (AbstractC004502c) statusesFragment.A0A();
        if (r0 != null) {
            r0.APq(i, i2, objArr);
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.statuses, viewGroup, false);
        HomeActivity.A07(inflate, this, A02().getDimensionPixelSize(R.dimen.statuses_fragment_empty_footer_height));
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        boolean z;
        String str;
        Log.i("statusesFragment/onActivityCreated");
        super.A0U = true;
        A0I();
        A0n();
        ListView listView = ((ListFragment) this).A04;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new C10780fB(this));
        listView.setOnItemLongClickListener(new C25981Jb(this));
        if (this.A0d.A00.getBoolean("show_statuses_education", true)) {
            C015408m r6 = this.A0i.A03;
            C02270Bi r4 = new C02270Bi();
            synchronized (r6.A04) {
                Map map = r6.A05;
                if (map.containsKey("status_distribution")) {
                    str = (String) map.get("status_distribution");
                    z = true;
                } else {
                    z = false;
                    str = null;
                }
            }
            if (z) {
                r4.A08(str);
            } else {
                r6.A03.ANF(new RunnableEBaseShape0S1200000_I0(r6, r4, "status_distribution", 12));
            }
            C43471yQ r1 = C43471yQ.A00;
            AnonymousClass0Yj r2 = new AnonymousClass0Yj();
            r2.A09(r4, new C10800fE(r2, r1));
            r2.A03(A0E(), new C39081qv(this));
        }
        View view = super.A0A;
        if (view != null) {
            view.findViewById(R.id.init_statuses_progress).setVisibility(0);
            Context A002 = A00();
            if (A002 != null) {
                this.A09 = new C10810fF(A002);
                C10820fG r0 = new C10820fG(this);
                this.A06 = r0;
                A0o(r0);
                this.A0U.A01(this.A0T);
                this.A0g.A01(this.A0f);
                A0q();
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        Log.i("statusesFragment/onDestroy");
        super.A0U = true;
        C09510d4 r1 = this.A08;
        AnonymousClass0K9 r0 = r1.A04;
        r0.A00.A00(r1.A02);
        this.A07.A00();
        this.A0U.A00(this.A0T);
        this.A0g.A00(this.A0f);
        AnonymousClass02M r12 = this.A0M;
        Runnable runnable = this.A0t;
        Handler handler = r12.A02;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks(this.A0u);
        C10830fH r02 = this.A04;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
        }
        C40791tq r03 = this.A03;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
        }
        A0t();
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        Log.i("statusesFragment/onPause");
        this.A0p.A04.A02(this);
        super.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        Log.i("statusesFragment/onResume");
        super.A0U = true;
        this.A0p.A04.A03(this, new C09530d6(this));
    }

    @Override // X.AnonymousClass037
    public void A0f() {
        Log.i("statusesFragment/onStart");
        super.A0U = true;
        if (this.A0L.A02) {
            A0s();
        }
        A0v();
        AnonymousClass02M r0 = this.A0M;
        r0.A02.removeCallbacks(this.A0u);
        this.A0s.ANF(new RunnableEBaseShape1S0100000_I0_1(this, 36));
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        AnonymousClass1Ny r0;
        if (i != 33) {
            if (i == 35) {
                if (this.A0G) {
                    C09510d4 r4 = this.A08;
                    AnonymousClass0K9 r02 = r4.A04;
                    r02.A01.post(new RunnableEBaseShape4S0100000_I0_4(r02.A03, 22));
                    C09520d5 r1 = r4.A03;
                    r1.A01 = true;
                    r1.A00 = false;
                    r4.A00();
                }
                this.A0P.A01();
                if (this.A0G) {
                    AnonymousClass0KB r03 = this.A0p;
                    if (intent != null) {
                        AnonymousClass00D r3 = r03.A01;
                        boolean z = r3.A00.getBoolean("is_status_sharing_with_fb_disabled", false);
                        boolean booleanExtra = intent.getBooleanExtra("feature_disabled", z);
                        if (booleanExtra != z) {
                            AnonymousClass008.A0n(r3, "is_status_sharing_with_fb_disabled", booleanExtra);
                        }
                    }
                }
            } else if (i != 151) {
            } else {
                if (i2 == -1) {
                    A0x(this.A0G);
                } else if (i2 == 0 && (r0 = this.A0P.A00) != null) {
                    r0.A01 = 4;
                }
            }
        } else if (i2 == -1) {
            A0u();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        if (r6.getBoolean("SHARE_CTA_VISIBILITY_SI_KEY", false) == false) goto L_0x002b;
     */
    @Override // X.AnonymousClass037
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(android.os.Bundle r6) {
        /*
            r5 = this;
            java.lang.String r0 = "statusesFragment/onCreate"
            com.whatsapp.util.Log.i(r0)
            X.0L2 r1 = r5.A0W
            android.content.Context r0 = r5.A00()
            X.0YX r0 = r1.A03(r0)
            r5.A07 = r0
            super.A0i(r6)
            X.00f r1 = r5.A0O
            X.01l r0 = X.AbstractC000400g.A2P
            boolean r0 = r1.A0D(r0)
            r5.A0K = r0
            r4 = 0
            if (r6 == 0) goto L_0x002b
            java.lang.String r0 = "SHARE_CTA_VISIBILITY_SI_KEY"
            boolean r0 = r6.getBoolean(r0, r4)
            r3 = 1
            if (r0 != 0) goto L_0x002c
        L_0x002b:
            r3 = 0
        L_0x002c:
            X.0K9 r2 = r5.A0o
            X.0Kd r0 = r5.A0P
            X.0d4 r1 = new X.0d4
            r1.<init>(r2, r0, r3)
            r5.A08 = r1
            X.0K9 r0 = r1.A04
            X.3PH r1 = r1.A02
            X.0KA r0 = r0.A00
            r0.A01(r1)
            if (r6 == 0) goto L_0x004a
            java.lang.String r0 = "WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY"
            boolean r0 = r6.getBoolean(r0, r4)
            r5.A0G = r0
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.StatusesFragment.A0i(android.os.Bundle):void");
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        bundle.putBoolean("WAS_FB_SHARE_BUTTON_ATTEMPTED_SI_KEY", this.A0G);
        bundle.putBoolean("SHARE_CTA_VISIBILITY_SI_KEY", this.A08.A03.A00);
    }

    @Override // X.AnonymousClass037
    public void A0k(Menu menu, MenuInflater menuInflater) {
        menu.add(2, R.id.menuitem_status_privacy, 0, this.A0e.A06(R.string.status_privacy));
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_status) {
            A0u();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            A0h(new Intent(A00(), StatusPrivacyActivity.class));
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_new_text_status) {
            return false;
        } else {
            Intent intent = new Intent(A00(), TextStatusComposerActivity.class);
            intent.putExtra("origin", 4);
            A0h(intent);
            return true;
        }
    }

    public void A0q() {
        C10830fH r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10830fH r2 = new C10830fH(this);
        this.A04 = r2;
        this.A0s.ANC(r2, new Void[0]);
    }

    public final void A0r() {
        View view = super.A0A;
        if (view == null) {
            return;
        }
        if (this.A05.A00()) {
            if (this.A04 != null) {
                view.findViewById(R.id.init_statuses_progress).setVisibility(0);
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
                view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
            } else if (this.A0S.A03() > 0) {
                view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                view.findViewById(R.id.welcome_statuses_message).setVisibility(0);
                view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                TextView textView = (TextView) view.findViewById(R.id.welcome_statuses_message);
                Context context = textView.getContext();
                String A062 = this.A0e.A06(R.string.welcome_statuses_message);
                Drawable A032 = C004302a.A03(context, R.drawable.ic_new_status_tip);
                if (A032 != null) {
                    textView.setText(C05270Nw.A00(A062, C002001d.A0e(A032, C004302a.A00(context, R.color.secondary_text)), textView.getPaint()));
                    return;
                }
                throw null;
            } else {
                if (this.A0c.A03()) {
                    ViewGroup viewGroup = (ViewGroup) AnonymousClass0Q7.A0D(view, R.id.statuses_empty_no_contacts);
                    if (viewGroup.getChildCount() == 0) {
                        EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A00());
                        viewGroup.addView(emptyTellAFriendView);
                        emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 42));
                    }
                    viewGroup.setVisibility(0);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                } else {
                    ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.contacts_empty_permission_denied);
                    if (viewGroup2.getChildCount() == 0) {
                        ActivityC004902h A0A2 = A0A();
                        if (A0A2 != null) {
                            A0A2.getLayoutInflater().inflate(R.layout.empty_contacts_permissions_needed, viewGroup2, true);
                            viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0((Object) this, 8));
                        } else {
                            throw null;
                        }
                    }
                    viewGroup2.setVisibility(0);
                    view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
                }
                view.findViewById(R.id.init_statuses_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
            }
        } else if (!TextUtils.isEmpty(this.A0A)) {
            view.findViewById(R.id.init_statuses_progress).setVisibility(8);
            view.findViewById(R.id.search_no_matches).setVisibility(0);
            ((TextView) view.findViewById(R.id.search_no_matches)).setText(this.A0e.A0D(R.string.search_no_results, this.A0A));
            view.findViewById(R.id.welcome_statuses_message).setVisibility(8);
            view.findViewById(R.id.statuses_empty_no_contacts).setVisibility(8);
            view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
        }
    }

    public final void A0s() {
        if (this.A0J) {
            C04380Kd r3 = this.A0P;
            r3.A00 = new AnonymousClass1Ny(r3.A08.nextLong());
            if (this.A04 == null) {
                r3.A02(this.A05.A02.size());
            }
        }
    }

    public final void A0t() {
        for (Uri uri : this.A0E) {
            this.A0b.A00.revokeUriPermission(uri, 1);
        }
        this.A0E.clear();
    }

    public final void A0u() {
        Intent A062 = RequestPermissionActivity.A06(A00(), this.A0c, 33);
        if (A062 == null) {
            AnonymousClass00C r1 = this.A0Y;
            if (r1.A09(this.A0X)) {
                if (r1.A02() < ((long) ((this.A0O.A06(AbstractC000400g.A3a) << 10) << 10))) {
                    AnonymousClass00Y r3 = this.A0k;
                    ActivityC004902h A0A2 = A0A();
                    AbstractC004502c r12 = (AbstractC004502c) A0A2;
                    if (r12 != null) {
                        C28051Sr.A1Z(r3, A0A2, r12, 5);
                        return;
                    }
                    throw null;
                }
                if (this.A02 != null) {
                    AnonymousClass008.A0n(this.A0d, "show_statuses_education", false);
                    this.A02.setVisibility(8);
                }
                Intent intent = new Intent(A00(), CameraActivity.class);
                intent.putExtra("jid", C12060hU.A00.getRawString());
                intent.putExtra("origin", 4);
                A0h(intent);
                return;
            }
            return;
        }
        A0M(A062, 33, null);
    }

    public final void A0v() {
        AnonymousClass02M r0 = this.A0M;
        Runnable runnable = this.A0t;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        if (!(this.A05.A00() || A0A() == null)) {
            C09150cN r6 = this.A05;
            long j = 0;
            for (AnonymousClass1VC r02 : r6.A02) {
                long j2 = r02.A07;
                if (j2 > j) {
                    j = j2;
                }
            }
            for (AnonymousClass1VC r03 : r6.A03) {
                long j3 = r03.A07;
                if (j3 > j) {
                    j = j3;
                }
            }
            for (AnonymousClass1VC r04 : r6.A01) {
                long j4 = r04.A07;
                if (j4 > j) {
                    j = j4;
                }
            }
            AnonymousClass1VC r05 = r6.A00;
            if (r05 != null) {
                long j5 = r05.A07;
                if (j5 > j) {
                    j = j5;
                }
            }
            handler.postDelayed(runnable, (AnonymousClass0OY.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }

    public final void A0w(ImageView imageView) {
        if (this.A0H) {
            imageView.setImageDrawable(A02().getDrawable(R.drawable.ic_chevron_down));
        } else {
            imageView.setImageDrawable(A02().getDrawable(R.drawable.ic_chevron_up));
        }
    }

    public final void A0x(boolean z) {
        AnonymousClass0KB r2;
        boolean A022;
        AnonymousClass1Ny r0;
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            this.A0G = z;
            if (z) {
                r2 = this.A0p;
                A022 = r2.A02(new ArrayList(this.A08.A04.A03.values()), A0A2, this, r2.A02);
            } else {
                r2 = this.A0p;
                A022 = r2.A02(new ArrayList(this.A08.A04.A03.values()), A0A2, this, r2.A03);
            }
            if (!A022 && !r2.A00.A06() && (r0 = this.A0P.A00) != null) {
                r0.A01 = 4;
            }
        }
    }

    public final void A0y(boolean z, Animator.AnimatorListener animatorListener) {
        View view;
        ValueAnimator ofInt;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.A06.getCount(); i++) {
            if (this.A06.getItemViewType(i) == 0) {
                C40811ts r4 = (C40811ts) ((AbstractC27051Nt) this.A06.A03.A0C.get(i));
                AnonymousClass0BB r2 = this.A0m;
                UserJid userJid = r4.A01.A0A;
                if (r2.A08(userJid).A0G && !AnonymousClass02Z.A02(userJid) && (view = r4.A00) != null) {
                    if (z) {
                        view.measure(0, 0);
                    }
                    int measuredHeight = view.getMeasuredHeight();
                    int[] iArr = new int[2];
                    if (z) {
                        iArr[0] = 0;
                        iArr[1] = measuredHeight;
                        ofInt = ValueAnimator.ofInt(iArr);
                    } else {
                        iArr[0] = measuredHeight;
                        iArr[1] = 0;
                        ofInt = ValueAnimator.ofInt(iArr);
                    }
                    ofInt.addListener(new C27021Nq(view, measuredHeight));
                    ofInt.addUpdateListener(new C26011Je(view, z));
                    arrayList.add(ofInt);
                }
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.setInterpolator(new DecelerateInterpolator());
        this.A00.setDuration(250L);
        this.A00.addListener(animatorListener);
        this.A00.playTogether(arrayList);
        this.A00.start();
    }

    @Override // X.AbstractC07520Xz
    public void A23(AnonymousClass0XB r3) {
        this.A0A = r3.A01;
        this.A06.getFilter().filter(this.A0A);
    }

    @Override // X.AnonymousClass0Y2
    public String A4o() {
        return this.A0e.A06(R.string.menuitem_new_text_status);
    }

    @Override // X.AnonymousClass0Y2
    public Drawable A4p() {
        Context A002 = A00();
        if (A002 != null) {
            return C002001d.A0b(A002, R.drawable.ic_text_status_compose, R.color.fabSecondaryContent);
        }
        throw null;
    }

    @Override // X.AnonymousClass0Y2
    public String A7B() {
        return this.A0e.A06(R.string.menuitem_new_status);
    }

    @Override // X.AnonymousClass0Y2
    public Drawable A7C() {
        return C002001d.A0b(A01(), R.drawable.ic_camera, R.color.white);
    }

    @Override // X.AnonymousClass0Y2
    public void ADE() {
        Intent intent = new Intent(A00(), TextStatusComposerActivity.class);
        intent.putExtra("origin", 4);
        A0h(intent);
    }

    @Override // X.AnonymousClass0Y2
    public void AHO() {
        A0u();
    }

    @Override // X.AbstractC07520Xz
    public void AP1(boolean z) {
        this.A0I = z;
        this.A06.getFilter().filter(this.A0A);
    }

    @Override // X.AbstractC07520Xz
    public void AP2(boolean z) {
        this.A0J = z;
        if (z) {
            AnonymousClass00D r1 = this.A0d;
            r1.A00.edit().putLong("status_tab_last_opened_time", this.A0a.A05()).apply();
            A0s();
            return;
        }
        C09510d4 r6 = this.A08;
        if (r6.A03.A00) {
            AnonymousClass0K9 r0 = r6.A04;
            r0.A01.post(new RunnableEBaseShape4S0100000_I0_4(r0.A03, 22));
            AnonymousClass1Ny r02 = r6.A01.A00;
            if (r02 != null) {
                r02.A00 = 1;
            }
            C09520d5 r03 = r6.A03;
            r03.A01 = false;
            r03.A00 = false;
            r6.A00();
        }
        this.A0P.A01();
        if (this.A0K) {
            this.A0H = true;
            this.A06.getFilter().filter(this.A0A);
        }
        C09140cM r62 = this.A0q;
        if (r62 != null) {
            Log.i("statusdownload/cancel-all-status-downloads");
            AnonymousClass0CH r3 = r62.A02;
            Iterator it = ((AbstractCollection) r3.A04()).iterator();
            while (it.hasNext()) {
                AnonymousClass0M3 r12 = (AnonymousClass0M3) it.next();
                if (AnonymousClass1VY.A0b(r12.A0n.A00)) {
                    r3.A08(r12, false, false);
                }
            }
            r62.A03.clear();
            r62.A00 = null;
            r62.A01 = null;
            return;
        }
        throw null;
    }
}
