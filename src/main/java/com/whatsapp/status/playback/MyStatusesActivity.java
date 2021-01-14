package com.whatsapp.status.playback;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC07200Wh;
import X.AbstractC658531u;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass008;
import X.AnonymousClass00C;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass09E;
import X.AnonymousClass0AC;
import X.AnonymousClass0CG;
import X.AnonymousClass0CH;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0JW;
import X.AnonymousClass0K9;
import X.AnonymousClass0KB;
import X.AnonymousClass0OY;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0Z6;
import X.AnonymousClass1Ny;
import X.AnonymousClass1VY;
import X.AnonymousClass2C0;
import X.AnonymousClass31y;
import X.AnonymousClass320;
import X.AnonymousClass322;
import X.AnonymousClass325;
import X.AnonymousClass32F;
import X.AnonymousClass32K;
import X.AnonymousClass3PI;
import X.AnonymousClass3PK;
import X.AnonymousClass3PM;
import X.AnonymousClass3PN;
import X.AnonymousClass3PO;
import X.C000300f;
import X.C002101e;
import X.C004302a;
import X.C006803i;
import X.C007303n;
import X.C008805h;
import X.C014308b;
import X.C02330Bo;
import X.C02580Cq;
import X.C03120Ew;
import X.C04350Ka;
import X.C04360Kb;
import X.C04380Kd;
import X.C04420Kh;
import X.C05270Nw;
import X.C06470Tj;
import X.C09510d4;
import X.C09820da;
import X.C09830db;
import X.C10810fF;
import X.C12060hU;
import X.C13380k9;
import X.C14360m9;
import X.C28051Sr;
import X.C74083a4;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.camera.CameraActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape14S0100000_I1_3;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyStatusesActivity extends ActivityC03630Ha {
    public AbstractC06100Rs A00;
    public AbstractC06110Rt A01;
    public C13380k9 A02;
    public AbstractC007503q A03;
    public C09510d4 A04;
    public C09830db A05;
    public AnonymousClass32K A06;
    public C10810fF A07;
    public List A08;
    public boolean A09;
    public final Handler A0A;
    public final View.OnClickListener A0B;
    public final View.OnClickListener A0C;
    public final AnonymousClass01I A0D;
    public final AnonymousClass0Z6 A0E;
    public final C04350Ka A0F;
    public final C000300f A0G;
    public final C04380Kd A0H;
    public final C04360Kb A0I;
    public final AnonymousClass0DH A0J;
    public final AnonymousClass01A A0K;
    public final C014308b A0L;
    public final AbstractC07200Wh A0M;
    public final AnonymousClass00C A0N;
    public final AnonymousClass03P A0O;
    public final AnonymousClass00S A0P;
    public final AnonymousClass03S A0Q;
    public final AnonymousClass01K A0R;
    public final AnonymousClass01T A0S;
    public final AnonymousClass019 A0T;
    public final AnonymousClass0AC A0U;
    public final C02330Bo A0V;
    public final AnonymousClass0CG A0W;
    public final C03120Ew A0X;
    public final AnonymousClass09E A0Y;
    public final AnonymousClass00Y A0Z;
    public final AnonymousClass0EO A0a;
    public final C04420Kh A0b;
    public final AnonymousClass0CH A0c;
    public final AnonymousClass022 A0d;
    public final AbstractC658531u A0e;
    public final AnonymousClass31y A0f;
    public final AnonymousClass320 A0g;
    public final AnonymousClass322 A0h;
    public final AnonymousClass325 A0i;
    public final AnonymousClass0K9 A0j;
    public final AnonymousClass0KB A0k;
    public final C02580Cq A0l;
    public final AnonymousClass00T A0m;
    public final Runnable A0n;
    public final Runnable A0o;
    public final Runnable A0p;
    public final HashMap A0q;
    public final HashMap A0r;
    public final Map A0s = new LinkedHashMap();
    public final Set A0t;

    public MyStatusesActivity() {
        HashSet hashSet = new HashSet();
        this.A0t = hashSet;
        this.A0n = new RunnableEBaseShape12S0100000_I1_7(hashSet, 39);
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0q = new HashMap();
        this.A0r = new HashMap();
        this.A0P = AnonymousClass00S.A00();
        this.A0E = AnonymousClass0Z6.A00();
        this.A0g = AnonymousClass320.A00();
        this.A0D = AnonymousClass01I.A00();
        this.A0F = C04350Ka.A00();
        this.A0m = C002101e.A00();
        this.A0i = AnonymousClass325.A00();
        this.A0Z = AnonymousClass00Y.A00();
        this.A0G = C000300f.A00();
        this.A0Y = AnonymousClass09E.A00();
        this.A0J = AnonymousClass0DH.A00();
        this.A0I = C04360Kb.A00();
        this.A0e = AbstractC658531u.A00();
        this.A0K = AnonymousClass01A.A00();
        this.A0V = C02330Bo.A00();
        this.A0O = AnonymousClass03P.A00();
        this.A0L = C014308b.A00();
        this.A0R = AnonymousClass01K.A00();
        this.A0a = AnonymousClass0EO.A00();
        this.A0f = AnonymousClass31y.A00();
        this.A0N = AnonymousClass00C.A00();
        this.A0l = C02580Cq.A01();
        this.A0h = AnonymousClass322.A00();
        this.A0X = C03120Ew.A00();
        this.A0j = AnonymousClass0K9.A00();
        this.A0W = AnonymousClass0CG.A00();
        this.A0Q = AnonymousClass03S.A00();
        this.A0c = AnonymousClass0CH.A00();
        this.A0H = C04380Kd.A00();
        this.A0k = AnonymousClass0KB.A00();
        this.A0b = C04420Kh.A00();
        this.A0S = AnonymousClass01T.A00();
        this.A0d = AnonymousClass022.A00();
        this.A0U = AnonymousClass0AC.A00;
        this.A0T = new AnonymousClass3PM(this);
        this.A0o = new RunnableEBaseShape12S0100000_I1_7(this, 38);
        this.A0p = new RunnableEBaseShape12S0100000_I1_7(this, 37);
        this.A08 = new ArrayList();
        this.A0M = new AnonymousClass3PO(this);
        this.A0C = new ViewOnClickCListenerShape14S0100000_I1_3(this, 2);
        this.A0B = new ViewOnClickCListenerShape14S0100000_I1_3(this, 3);
    }

    public static void A04(MyStatusesActivity myStatusesActivity, AbstractC007503q r6, boolean z) {
        HashMap hashMap = myStatusesActivity.A0r;
        C007303n r3 = r6.A0n;
        AnonymousClass0JW r0 = (AnonymousClass0JW) hashMap.remove(r3);
        if (r0 != null) {
            if (z) {
                r0.A00.cancel(true);
            } else {
                return;
            }
        }
        C09820da r2 = new C09820da(myStatusesActivity, r6);
        hashMap.put(r3, r2);
        myStatusesActivity.A0m.ANC(r2, new Void[0]);
    }

    public final void A0V() {
        for (Uri uri : this.A08) {
            revokeUriPermission(uri, 1);
        }
        this.A08.clear();
    }

    public final void A0W() {
        if (RequestPermissionActivity.A0K(this, this.A0Q, 33)) {
            AnonymousClass00C r1 = this.A0N;
            if (r1.A09(this.A0M)) {
                if (r1.A02() < ((long) ((this.A0G.A06(AbstractC000400g.A3a) << 10) << 10))) {
                    C28051Sr.A1Z(this.A0Z, this, this, 5);
                    return;
                }
                Intent intent = new Intent(this, CameraActivity.class);
                intent.putExtra("jid", C12060hU.A00.getRawString());
                intent.putExtra("origin", 4);
                startActivity(intent);
            }
        }
    }

    public final void A0X() {
        long j;
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        Runnable runnable = this.A0o;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        if (!this.A06.isEmpty()) {
            AnonymousClass32K r1 = this.A06;
            if (r1.A00.isEmpty()) {
                j = 0;
            } else {
                j = ((AbstractC007503q) r1.A00.get(0)).A0E;
            }
            handler.postDelayed(runnable, (AnonymousClass0OY.A01(j) - System.currentTimeMillis()) + 1000);
        }
    }

    public void A0Y(AbstractC007503q r6, View view) {
        Map map = this.A0s;
        C007303n r4 = r6.A0n;
        if (map.containsKey(r4)) {
            map.remove(r4);
            view.setBackgroundResource(0);
        } else {
            map.put(r4, r6);
            view.setBackgroundResource(R.color.home_row_selection);
        }
        if (map.isEmpty()) {
            AbstractC06110Rt r0 = this.A01;
            if (r0 != null) {
                r0.A00();
            }
        } else {
            AbstractC06110Rt r3 = this.A01;
            if (r3 == null) {
                r3 = A0B(this.A00);
                this.A01 = r3;
            }
            r3.A04(((AnonymousClass2C0) this).A01.A0G().format((long) map.size()));
            this.A01.A01();
        }
        this.A0t.add(r4);
        Handler handler = this.A0A;
        Runnable runnable = this.A0n;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        this.A06.notifyDataSetChanged();
    }

    public final void A0Z(List list, boolean z) {
        AnonymousClass0KB r1;
        boolean A022;
        AnonymousClass1Ny r0;
        this.A09 = z;
        if (z) {
            r1 = this.A0k;
            A022 = r1.A02(list, this, null, r1.A02);
        } else {
            r1 = this.A0k;
            A022 = r1.A02(list, this, null, r1.A03);
        }
        if (!A022 && !r1.A00.A06() && (r0 = this.A0H.A00) != null) {
            r0.A01 = 4;
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKm(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 0);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.primary_dark));
        }
    }

    @Override // X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02s
    public void AKn(AbstractC06110Rt r3) {
        Toolbar toolbar = ((ActivityC004702f) this).A07;
        if (toolbar != null) {
            AnonymousClass0Q7.A0W(toolbar, 4);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setStatusBarColor(C004302a.A00(this, R.color.action_mode_dark));
        }
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        AbstractC06110Rt r0;
        AnonymousClass1Ny r02;
        super.onActivityResult(i, i2, intent);
        if (i != 2) {
            if (i != 33) {
                if (i == 35) {
                    if (i2 == -1 && (r0 = this.A01) != null) {
                        r0.A00();
                    }
                    if (this.A09) {
                        AnonymousClass0KB r03 = this.A0k;
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
                        Map map = this.A0s;
                        if (!map.isEmpty()) {
                            ArrayList arrayList = new ArrayList(map.values());
                            map.clear();
                            A0Z(arrayList, this.A09);
                        }
                    } else if (i2 == 0 && (r02 = this.A0H.A00) != null) {
                        r02.A01 = 4;
                    }
                }
            } else if (i2 == -1) {
                A0W();
            }
        } else if (i2 == -1) {
            ArrayList arrayList2 = new ArrayList();
            Map map2 = this.A0s;
            if (!map2.isEmpty()) {
                arrayList2.addAll(map2.values());
            } else {
                AbstractC007503q r04 = this.A03;
                if (r04 != null) {
                    arrayList2.add(r04);
                }
            }
            if (!arrayList2.isEmpty()) {
                List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
                ArrayList arrayList3 = new ArrayList(arrayList2);
                Collections.sort(arrayList3, C14360m9.A00);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    this.A0I.A09(this.A0F, (AbstractC007503q) it.next(), A0G2);
                }
                AbstractList abstractList = (AbstractList) A0G2;
                if (abstractList.size() != 1 || AnonymousClass1VY.A0b((Jid) abstractList.get(0))) {
                    A0S(A0G2);
                } else {
                    startActivity(Conversation.A04(this, this.A0K.A0A((AnonymousClass02N) abstractList.get(0))));
                }
            } else {
                Log.w("mystatuses/forward/failed");
                ((ActivityC004702f) this).A0F.A06(R.string.message_forward_failed, 0);
            }
            AbstractC06110Rt r05 = this.A01;
            if (r05 != null) {
                r05.A00();
            }
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        Log.i("myStatusesActivity/onCreate");
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        AnonymousClass01X r1 = ((AnonymousClass2C0) this).A01;
        setTitle(r1.A06(R.string.my_status));
        A0F();
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            setContentView(R.layout.my_statuses);
            findViewById(R.id.root_view).setSystemUiVisibility(1280);
            ((ActivityC004702f) this).A06.setFitsSystemWindows(true);
            this.A04 = new C09510d4(this.A0j, this.A0H, false);
            AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
            AnonymousClass0Z6 r02 = this.A0E;
            AnonymousClass320 r03 = this.A0g;
            AnonymousClass01I r04 = this.A0D;
            AnonymousClass00T r3 = this.A0m;
            this.A00 = new C74083a4(this, this, r0, r02, r03, r04, r3, this.A0i, this.A0Z, this.A0G, this.A0J, this.A0I, this.A0e, ((ActivityC004602e) this).A04, this.A0K, this.A0O, this.A0L, r1, this.A0a, this.A0f, this.A0h, this.A0W, this.A0c, this.A0b, this.A0S, this.A0d);
            this.A07 = new C10810fF(this);
            this.A06 = new AnonymousClass32K(this);
            ListView A0T2 = A0T();
            A0T2.setDivider(new C06470Tj(r1, C004302a.A03(this, R.drawable.conversations_list_divider)));
            A0T2.setFastScrollEnabled(false);
            View inflate = getLayoutInflater().inflate(R.layout.conversations_tip_row, (ViewGroup) A0T2, false);
            inflate.setPadding(0, 0, 0, getResources().getDimensionPixelSize(R.dimen.conversations_row_height));
            A0T2.addFooterView(inflate, null, false);
            ((TextView) inflate.findViewById(R.id.conversations_row_tip_tv)).setText(r1.A0D(R.string.status_expire_explanation_with_placeholder, 24));
            A0T2.setAdapter((ListAdapter) this.A06);
            A0T2.setOnItemClickListener(new AnonymousClass3PN(this));
            A0T2.setOnItemLongClickListener(new AnonymousClass32F(this));
            TextView textView = (TextView) findViewById(16908292);
            textView.setText(C05270Nw.A00(r1.A06(R.string.welcome_statuses_message), C004302a.A03(this, R.drawable.ic_new_status_tip), textView.getPaint()));
            findViewById(R.id.fab).setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 0));
            findViewById(R.id.fab_aux).setOnClickListener(new ViewOnClickCListenerShape14S0100000_I1_3(this, 1));
            View findViewById = findViewById(R.id.progress);
            if (findViewById != null) {
                findViewById.setVisibility(0);
                C09830db r05 = this.A05;
                if (r05 != null) {
                    ((AnonymousClass0JW) r05).A00.cancel(true);
                }
                C09830db r12 = new C09830db(this);
                this.A05 = r12;
                r3.ANC(r12, new Void[0]);
                this.A0U.A01(this.A0T);
                return;
            }
            throw null;
        }
        throw null;
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i != 13) {
            return super.onCreateDialog(i);
        }
        Map map = this.A0s;
        if (map.isEmpty()) {
            Log.e("mediagallery/dialog/delete no messages");
            return super.onCreateDialog(i);
        }
        StringBuilder A0S2 = AnonymousClass008.A0S("mediagallery/dialog/delete/");
        A0S2.append(map.size());
        Log.i(A0S2.toString());
        return C008805h.A07(this, ((ActivityC004702f) this).A0F, super.A0M, this.A0I, ((AnonymousClass2C0) this).A01, new ArrayList(map.values()), new AnonymousClass3PK(this));
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        Log.i("myStatusesActivity/onDestroy");
        super.onDestroy();
        this.A0U.A00(this.A0T);
        C09830db r0 = this.A05;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        HashMap hashMap = this.A0r;
        for (AnonymousClass0JW r02 : hashMap.values()) {
            r02.A00.cancel(true);
        }
        A0V();
        hashMap.clear();
        AnonymousClass02M r1 = ((ActivityC004702f) this).A0F;
        Runnable runnable = this.A0o;
        Handler handler = r1.A02;
        handler.removeCallbacks(runnable);
        handler.removeCallbacks(this.A0p);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        Log.i("myStatusesActivity/onPause");
        this.A0k.A04.A02(this);
        super.onPause();
    }

    @Override // X.ActivityC03630Ha
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null) {
            List<C007303n> A0N2 = C006803i.A0N(bundle);
            if (A0N2 != null) {
                Map map = this.A0s;
                map.clear();
                for (C007303n r1 : A0N2) {
                    map.put(r1, this.A0R.A0J.A05(r1));
                }
                AbstractC06110Rt r3 = this.A01;
                if (r3 == null) {
                    r3 = A0B(this.A00);
                    this.A01 = r3;
                }
                r3.A04(((AnonymousClass2C0) this).A01.A0G().format((long) map.size()));
                this.A01.A01();
                this.A06.notifyDataSetChanged();
            }
            C007303n A092 = C006803i.A09(bundle, "");
            if (A092 != null) {
                this.A03 = this.A0R.A0J.A05(A092);
            }
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        Log.i("myStatusesActivity/onResume");
        super.onResume();
        this.A0k.A04.A03(this, new AnonymousClass3PI(this));
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Map map = this.A0s;
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC007503q r0 : map.values()) {
                arrayList.add(r0.A0n);
            }
            C006803i.A0U(bundle, arrayList);
        }
        AbstractC007503q r02 = this.A03;
        if (r02 != null) {
            C006803i.A0T(bundle, r02.A0n, "");
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onStart() {
        Log.i("myStatusesActivity/onStart");
        super.onStart();
        A0X();
        AnonymousClass02M r0 = ((ActivityC004702f) this).A0F;
        r0.A02.removeCallbacks(this.A0p);
        this.A0m.ANF(new RunnableEBaseShape4S0100000_I0_4(this, 23));
    }

    @Override // X.ActivityC004802g, X.ActivityC004902h
    public void onStop() {
        Log.i("myStatusesActivity/onStop");
        super.onStop();
    }
}
