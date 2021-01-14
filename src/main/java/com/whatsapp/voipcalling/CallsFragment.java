package com.whatsapp.voipcalling;

import X.AbstractC06100Rs;
import X.AbstractC06110Rt;
import X.AbstractC07520Xz;
import X.AbstractC09300ce;
import X.AbstractC675238y;
import X.ActivityC004802g;
import X.ActivityC004902h;
import X.AnonymousClass00E;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass0BP;
import X.AnonymousClass0FS;
import X.AnonymousClass0FT;
import X.AnonymousClass0Fh;
import X.AnonymousClass0JO;
import X.AnonymousClass0JW;
import X.AnonymousClass0L1;
import X.AnonymousClass0L2;
import X.AnonymousClass0LH;
import X.AnonymousClass0LW;
import X.AnonymousClass0MB;
import X.AnonymousClass0OY;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QM;
import X.AnonymousClass0QP;
import X.AnonymousClass0XB;
import X.AnonymousClass0Y2;
import X.AnonymousClass0Y6;
import X.AnonymousClass0YX;
import X.AnonymousClass1VY;
import X.AnonymousClass31y;
import X.AnonymousClass390;
import X.AnonymousClass3TO;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C004302a;
import X.C007003k;
import X.C014308b;
import X.C02780Dk;
import X.C05270Nw;
import X.C09040cC;
import X.C09190cR;
import X.C09200cS;
import X.C09260ca;
import X.C09280cc;
import X.C09290cd;
import X.C09310cf;
import X.C09320cg;
import X.C11140fm;
import X.C11150fn;
import X.C11160fo;
import X.C11260fz;
import X.C671337i;
import X.C72483Ta;
import X.C72503Tc;
import X.C72673Tu;
import X.DialogInterface$OnClickListenerC671237h;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape1S0100000_I0_1;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.HomeActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.base.WaListFragment;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class CallsFragment extends WaListFragment implements AnonymousClass0Y2, AbstractC07520Xz, AnonymousClass0Y6 {
    public MenuItem A00;
    public AbstractC06110Rt A01;
    public C09190cR A02 = C09190cR.A00();
    public C000300f A03 = C000300f.A00();
    public AnonymousClass0YX A04;
    public AnonymousClass0YX A05;
    public C11150fn A06;
    public C11160fo A07;
    public CharSequence A08;
    public ArrayList A09;
    public ArrayList A0A = new ArrayList();
    public LinkedHashMap A0B = new LinkedHashMap();
    public boolean A0C = true;
    public boolean A0D;
    public final AbstractC06100Rs A0E = new C09320cg(this);
    public final C02780Dk A0F = C02780Dk.A02();
    public final AnonymousClass02M A0G = AnonymousClass02M.A00();
    public final C09040cC A0H = C09040cC.A00();
    public final AnonymousClass01A A0I = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0J = new C09280cc(this);
    public final AnonymousClass08B A0K = AnonymousClass08B.A00;
    public final C014308b A0L = C014308b.A00();
    public final AnonymousClass0L2 A0M = AnonymousClass0L2.A01();
    public final AnonymousClass03P A0N = AnonymousClass03P.A00();
    public final AnonymousClass00S A0O = AnonymousClass00S.A00();
    public final AnonymousClass03S A0P = AnonymousClass03S.A00();
    public final AnonymousClass01X A0Q = AnonymousClass01X.A00();
    public final AnonymousClass0FS A0R = AnonymousClass0FS.A00();
    public final AnonymousClass01T A0S = AnonymousClass01T.A00();
    public final AnonymousClass31y A0T = AnonymousClass31y.A00();
    public final AnonymousClass00T A0U = C002101e.A00();
    public final AbstractC09300ce A0V = new C09290cd(this);
    public final AnonymousClass0FT A0W = AnonymousClass0FT.A00;
    public final AnonymousClass0LH A0X = new C09310cf(this);
    public final AnonymousClass0JO A0Y = AnonymousClass0JO.A00;
    public final C09200cS A0Z = C09200cS.A00();
    public final AnonymousClass0Fh A0a = AnonymousClass0Fh.A00();
    public final Runnable A0b = new RunnableEBaseShape4S0100000_I0_4(this, 40);
    public final HashSet A0c = new HashSet();
    public final Set A0d = new HashSet();

    @Override // X.AbstractC07520Xz
    public void ANS(C007003k r1) {
    }

    @Override // X.AbstractC07520Xz
    public void AP1(boolean z) {
    }

    @Override // X.AbstractC07520Xz
    public void AP2(boolean z) {
    }

    @Override // X.AbstractC07520Xz
    public boolean AQO() {
        return true;
    }

    public static String A00(List list, GroupJid groupJid, AnonymousClass01A r10, C014308b r11, AnonymousClass01T r12, AnonymousClass01X r13) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < 3 && i < list.size()) {
            C007003k A092 = r10.A09((AnonymousClass02N) list.get(i));
            if (A092 != null) {
                arrayList.add(r11.A04(A092));
            }
            i++;
        }
        String A1h = C002001d.A1h(groupJid, list, r10, r12, r11);
        if (A1h != null) {
            return A1h;
        }
        if (list.size() <= 3) {
            return C002001d.A1g(r13, false, arrayList);
        }
        return r13.A0A(R.plurals.group_voip_call_participants_label, (long) (list.size() - 1), arrayList.get(0), Integer.valueOf(list.size() - 1));
    }

    public static List A01(C11260fz r6, AnonymousClass01A r7, C014308b r8, ArrayList arrayList, C000300f r10) {
        AbstractList abstractList;
        AnonymousClass0QM r0 = (AnonymousClass0QM) r6.A03.get(0);
        List A042 = r0.A04();
        C09260ca r5 = r0.A09;
        UserJid userJid = r5.A01;
        int i = 0;
        while (true) {
            abstractList = (AbstractList) A042;
            if (i < abstractList.size() && !((AnonymousClass0QP) abstractList.get(i)).A02.equals(userJid)) {
                i++;
            } else if (i != 0 && i < abstractList.size()) {
                Object obj = abstractList.get(i);
                abstractList.remove(i);
                abstractList.add(0, obj);
            }
        }
        Object obj2 = abstractList.get(i);
        abstractList.remove(i);
        abstractList.add(0, obj2);
        int i2 = !r5.A03 ? 1 : 0;
        if (abstractList.size() > 0) {
            Collections.sort(abstractList.subList(i2, abstractList.size()), new C72673Tu(r10, r7, r8, arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < abstractList.size(); i3++) {
            arrayList2.add(((AnonymousClass0QP) abstractList.get(i3)).A02);
        }
        return arrayList2;
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.calls, viewGroup, false);
        HomeActivity.A07(inflate, this, A02().getDimensionPixelSize(R.dimen.conversations_row_height));
        return inflate;
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        HashSet hashSet;
        Log.i("voip/CallsFragment/onActivityCreated");
        super.A0U = true;
        A0I();
        A0n();
        ListView listView = ((ListFragment) this).A04;
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnItemClickListener(new C11140fm(this));
        A0n();
        ((ListFragment) this).A04.setOnItemLongClickListener(new C671337i(this));
        if (!(bundle == null || (hashSet = (HashSet) bundle.getSerializable("SelectedCallGroupIds")) == null)) {
            HashSet hashSet2 = this.A0c;
            hashSet2.clear();
            hashSet2.addAll(hashSet);
            if (!hashSet2.isEmpty()) {
                this.A01 = ((ActivityC004802g) A0A()).A0B(this.A0E);
            }
        }
        View view = super.A0A;
        if (view != null) {
            view.findViewById(R.id.init_calls_progress).setVisibility(0);
            C11150fn r0 = new C11150fn(this);
            this.A06 = r0;
            A0o(r0);
            this.A0K.A01(this.A0J);
            this.A0W.A01(this.A0V);
            this.A0Y.A01(this.A0X);
            A0r();
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        Log.i("voip/CallsFragment/onDestroy");
        super.A0U = true;
        this.A0K.A00(this.A0J);
        this.A0W.A00(this.A0V);
        this.A0Y.A00(this.A0X);
        this.A05.A00();
        this.A04.A00();
        AnonymousClass02M r0 = this.A0G;
        r0.A02.removeCallbacks(this.A0b);
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        Log.i("voip/CallsFragment/onPause");
        super.A0U = true;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        Log.i("voip/CallsFragment/onResume");
        super.A0U = true;
        if (this.A0B.isEmpty()) {
            A0s();
        }
    }

    @Override // X.AnonymousClass037
    public void A0f() {
        super.A0U = true;
        A0u();
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (i != 10) {
            if (i == 150 && i2 == -1) {
                this.A0D = true;
                A0t();
            }
        } else if (i2 == -1) {
            UserJid nullable = UserJid.getNullable(intent.getStringExtra("contact"));
            if (nullable != null) {
                int intExtra = intent.getIntExtra("call_type", 1);
                if (intExtra == 1 || intExtra == 2) {
                    C09200cS r4 = this.A0Z;
                    C007003k A0A2 = this.A0I.A0A(nullable);
                    ActivityC004902h A0B2 = A0B();
                    boolean z = false;
                    if (intExtra == 2) {
                        z = true;
                    }
                    r4.A01(A0A2, A0B2, 3, false, z);
                    return;
                }
                return;
            }
            throw null;
        }
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        Log.i("voip/CallsFragment/onCreate");
        AnonymousClass0L2 r3 = this.A0M;
        this.A05 = r3.A03(A00());
        this.A04 = new AnonymousClass0YX(r3, A02().getDimensionPixelSize(R.dimen.small_avatar_size), 0.0f);
        boolean z = false;
        if (bundle != null) {
            z = bundle.getBoolean("request_sync", false);
        }
        this.A0D = z;
        super.A0i(bundle);
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        bundle.putSerializable("SelectedCallGroupIds", this.A0c);
        bundle.putBoolean("request_sync", this.A0D);
    }

    @Override // X.AnonymousClass037
    public void A0k(Menu menu, MenuInflater menuInflater) {
        menu.add(3, R.id.menuitem_clear_call_log, 0, R.string.clear_call_log);
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_call) {
            AHO();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_clear_call_log) {
            return false;
        } else {
            boolean z = false;
            if (((AnonymousClass037) this).A04 >= 4) {
                z = true;
            }
            if (z) {
                new ClearCallLogDialogFragment().A0u(super.A0H, null);
            }
            return true;
        }
    }

    public final void A0q() {
        AnonymousClass390 r2;
        HashSet hashSet = this.A0c;
        if (!hashSet.isEmpty()) {
            this.A0d.clear();
            int i = 0;
            while (true) {
                A0n();
                if (i < ((ListFragment) this).A04.getChildCount()) {
                    A0n();
                    View childAt = ((ListFragment) this).A04.getChildAt(i);
                    if (!(childAt == null || (r2 = (AnonymousClass390) childAt.getTag()) == null || r2.A00.A6u() != 2)) {
                        AnonymousClass3TO r22 = (AnonymousClass3TO) r2;
                        if (hashSet.contains(((C72483Ta) ((AnonymousClass390) r22).A00).A00.A03())) {
                            r22.A01.setBackgroundResource(0);
                            r22.A09.A03(false, true);
                        }
                    }
                    i++;
                } else {
                    hashSet.clear();
                    return;
                }
            }
        }
    }

    public final void A0r() {
        C11160fo r0 = this.A07;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        AbstractC06110Rt r02 = this.A01;
        if (r02 != null) {
            r02.A01();
        }
        C11160fo r2 = new C11160fo(this);
        this.A07 = r2;
        this.A0U.ANC(r2, new Void[0]);
    }

    public final void A0s() {
        View view = super.A0A;
        if (view == null) {
            return;
        }
        if (this.A0B.isEmpty()) {
            if (this.A07 != null) {
                view.findViewById(R.id.init_calls_progress).setVisibility(0);
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                view.findViewById(R.id.welcome_calls_message).setVisibility(8);
                view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
            } else if (this.A0I.A03() > 0) {
                view.findViewById(R.id.init_calls_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                view.findViewById(R.id.welcome_calls_message).setVisibility(0);
                view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                TextView textView = (TextView) view.findViewById(R.id.welcome_calls_message);
                textView.setContentDescription(A0A().getString(R.string.accessible_welcome_calls_message));
                textView.setText(C05270Nw.A00(A0A().getString(R.string.welcome_calls_message), C002001d.A0b(A01(), R.drawable.ic_new_call_tip, R.color.primary_text), textView.getPaint()));
            } else {
                if (this.A0P.A03()) {
                    ViewGroup viewGroup = (ViewGroup) AnonymousClass0Q7.A0D(view, R.id.calls_empty_no_contacts);
                    if (viewGroup.getChildCount() == 0) {
                        EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A00());
                        viewGroup.addView(emptyTellAFriendView);
                        emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickEBaseShape1S0100000_I0_1(this, 22));
                    }
                    viewGroup.setVisibility(0);
                    view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
                } else {
                    ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.contacts_empty_permission_denied);
                    if (viewGroup2.getChildCount() == 0) {
                        A0A().getLayoutInflater().inflate(R.layout.empty_contacts_permissions_needed, viewGroup2, true);
                        viewGroup2.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0((Object) this, 17));
                    }
                    viewGroup2.setVisibility(0);
                    view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
                }
                view.findViewById(R.id.init_calls_progress).setVisibility(8);
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                view.findViewById(R.id.welcome_calls_message).setVisibility(8);
            }
        } else if (!TextUtils.isEmpty(this.A08)) {
            view.findViewById(R.id.init_calls_progress).setVisibility(8);
            view.findViewById(R.id.search_no_matches).setVisibility(0);
            ((TextView) view.findViewById(R.id.search_no_matches)).setText(A0A().getString(R.string.search_no_results, this.A08));
            view.findViewById(R.id.welcome_calls_message).setVisibility(8);
            view.findViewById(R.id.calls_empty_no_contacts).setVisibility(8);
            view.findViewById(R.id.contacts_empty_permission_denied).setVisibility(8);
        }
    }

    public final void A0t() {
        Intent intent = new Intent(A0A(), ContactPicker.class);
        intent.putExtra("call_picker", true);
        intent.putExtra("request_sync", this.A0D);
        A0M(intent, 10, null);
        this.A0D = false;
    }

    public final void A0u() {
        AnonymousClass02M r0 = this.A0G;
        Runnable runnable = this.A0b;
        Handler handler = r0.A02;
        handler.removeCallbacks(runnable);
        LinkedHashMap linkedHashMap = this.A0B;
        if (!linkedHashMap.isEmpty() && A0A() != null) {
            handler.postDelayed(runnable, (AnonymousClass0OY.A01(((C11260fz) this.A0B.get(linkedHashMap.keySet().iterator().next())).A01()) - System.currentTimeMillis()) + 1000);
        }
    }

    public void A0v(C11260fz r12, AnonymousClass3TO r13) {
        String A032 = r12.A03();
        HashSet hashSet = this.A0c;
        if (hashSet.contains(A032)) {
            hashSet.remove(A032);
            if (hashSet.isEmpty() && this.A01 != null) {
                A0q();
                AbstractC06110Rt r0 = this.A01;
                if (r0 != null) {
                    r0.A00();
                }
            }
            r13.A01.setBackgroundResource(0);
            SelectionCheckView selectionCheckView = r13.A09;
            selectionCheckView.setVisibility(8);
            selectionCheckView.A03(false, true);
        } else {
            hashSet.add(A032);
            if (this.A01 == null) {
                ActivityC004902h A0A2 = A0A();
                if (A0A2 instanceof ActivityC004802g) {
                    this.A01 = ((ActivityC004802g) A0A2).A0B(this.A0E);
                }
            }
            r13.A01.setBackgroundResource(R.color.home_row_selection);
            SelectionCheckView selectionCheckView2 = r13.A09;
            selectionCheckView2.setVisibility(0);
            selectionCheckView2.A03(true, true);
        }
        AbstractC06110Rt r02 = this.A01;
        if (r02 != null) {
            r02.A01();
        }
        if (!hashSet.isEmpty()) {
            C002001d.A2R(A0A(), this.A0N, this.A0Q.A0A(R.plurals.n_items_selected, (long) hashSet.size(), Integer.valueOf(hashSet.size())));
        }
    }

    public void A0w(AbstractC675238y r6, AnonymousClass390 r7) {
        int A6u = r6.A6u();
        if (A6u == 2) {
            C11260fz r4 = ((C72483Ta) r6).A00;
            if (r4.A03.isEmpty()) {
                AnonymousClass00E.A08(false, "voip/CallsFragment/onListItemClicked empty call group");
                return;
            }
            AnonymousClass3TO r72 = (AnonymousClass3TO) r7;
            if (this.A01 != null) {
                A0v(r4, r72);
            } else if (!r4.A04()) {
                ArrayList arrayList = new ArrayList();
                Iterator it = r4.A03.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AnonymousClass0QM) it.next()).A03());
                }
                Intent intent = new Intent(A00(), CallLogActivity.class);
                if (r4.A02() != null) {
                    intent.putExtra("jid", AnonymousClass1VY.A0D(r4.A02().A09));
                }
                intent.putExtra("calls", arrayList);
                A0h(intent);
            } else {
                Context A012 = A01();
                Parcelable A032 = ((AnonymousClass0QM) r4.A03.get(0)).A03();
                Intent intent2 = new Intent(A012, GroupCallLogActivity.class);
                intent2.putExtra("call_log_key", A032);
                A012.startActivity(intent2);
            }
        } else if (A6u == 1) {
            A0h(Conversation.A05(A00(), ((C72503Tc) r6).A00));
        }
    }

    @Override // X.AbstractC07520Xz
    public void A23(AnonymousClass0XB r3) {
        this.A08 = r3.A01;
        this.A06.getFilter().filter(this.A08);
    }

    @Override // X.AnonymousClass0Y6
    public void A3h() {
        this.A0C = false;
    }

    @Override // X.AnonymousClass0Y6
    public void A41() {
        this.A0C = true;
    }

    @Override // X.AnonymousClass0Y2
    public String A4o() {
        return A0A().getString(R.string.room_create);
    }

    @Override // X.AnonymousClass0Y2
    public Drawable A4p() {
        if (!this.A02.A07()) {
            return null;
        }
        Context A002 = A00();
        if (A002 != null) {
            return C002001d.A0b(A002, R.drawable.ic_room, R.color.fabSecondaryContent);
        }
        throw null;
    }

    @Override // X.AnonymousClass0Y2
    public String A7B() {
        return A0A().getString(R.string.menuitem_new_call);
    }

    @Override // X.AnonymousClass0Y2
    public Drawable A7C() {
        Context A002 = A00();
        if (A002 != null) {
            return C004302a.A03(A002, R.drawable.ic_action_new_call);
        }
        throw null;
    }

    @Override // X.AnonymousClass0Y2
    public void ADE() {
        C09190cR r4 = this.A02;
        AnonymousClass0LW r3 = super.A0H;
        DialogFragment A042 = r4.A04(null, 2);
        if (A042 != null) {
            C002001d.A2o(r3, A042);
        } else {
            r4.A06(null, 2);
        }
    }

    @Override // X.AnonymousClass0Y2
    public void AHO() {
        if (AnonymousClass0Fh.A01()) {
            Log.w("voip/CallsFragment try to start outgoing call from active voip call");
            this.A0G.A06(R.string.error_call_disabled_during_call, 0);
        } else if (this.A0P.A03()) {
            A0t();
        } else {
            RequestPermissionActivity.A0F(this, R.string.permission_contacts_access_on_new_call_request, R.string.permission_contacts_access_on_new_call);
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        AbstractC06110Rt r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
    }

    public class ClearCallLogDialogFragment extends WaDialogFragment {
        public final AnonymousClass02M A00 = AnonymousClass02M.A00();
        public final AnonymousClass0FS A01;
        public final AnonymousClass0L1 A02;
        public final AnonymousClass00T A03 = C002101e.A00();
        public final AnonymousClass0FT A04;

        public ClearCallLogDialogFragment() {
            AnonymousClass01X.A00();
            this.A04 = AnonymousClass0FT.A00;
            this.A01 = AnonymousClass0FS.A00();
            this.A02 = AnonymousClass0L1.A00();
        }

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            DialogInterface$OnClickListenerC671237h r1 = new DialogInterface$OnClickListenerC671237h(this);
            AnonymousClass0MB r2 = new AnonymousClass0MB(A0A());
            r2.A01(R.string.clear_call_log_ask);
            r2.A04(R.string.ok, r1);
            r2.A03(R.string.cancel, null);
            return r2.A00();
        }
    }
}
