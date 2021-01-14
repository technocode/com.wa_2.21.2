package com.whatsapp.conversation.conversationrow.message;

import X.AbstractC007503q;
import X.AbstractC15630oP;
import X.AbstractC15640oQ;
import X.AbstractC43421yL;
import X.AbstractC658531u;
import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01I;
import X.AnonymousClass01K;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass08B;
import X.AnonymousClass0AC;
import X.AnonymousClass0AM;
import X.AnonymousClass0AO;
import X.AnonymousClass0BP;
import X.AnonymousClass0CG;
import X.AnonymousClass0CH;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0GW;
import X.AnonymousClass0L2;
import X.AnonymousClass0MB;
import X.AnonymousClass0S2;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass1VY;
import X.AnonymousClass21Q;
import X.AnonymousClass2C0;
import X.AnonymousClass2DW;
import X.AnonymousClass2Ie;
import X.AnonymousClass2It;
import X.AnonymousClass2Iu;
import X.AnonymousClass320;
import X.AnonymousClass322;
import X.AnonymousClass325;
import X.C000300f;
import X.C002101e;
import X.C014308b;
import X.C014508d;
import X.C014708f;
import X.C04350Ka;
import X.C04360Kb;
import X.C14360m9;
import X.C15650oR;
import X.C28301Tu;
import X.C51942aK;
import X.C51952aL;
import X.C51962aM;
import X.C59312nR;
import X.C59322nS;
import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.Main;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StarredMessagesActivity extends AnonymousClass2DW implements AbstractC43421yL, AbstractC15630oP {
    public MenuItem A00;
    public MenuItem A01;
    public AnonymousClass0YX A02;
    public C59312nR A03;
    public AnonymousClass02N A04;
    public String A05;
    public ArrayList A06;
    public final AbsListView.OnScrollListener A07 = new AnonymousClass2It(this);
    public final AnonymousClass01I A08 = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A09 = AnonymousClass0Z6.A00();
    public final C04350Ka A0A = C04350Ka.A00();
    public final C000300f A0B = C000300f.A00();
    public final C04360Kb A0C = C04360Kb.A00();
    public final AnonymousClass0DH A0D = AnonymousClass0DH.A00();
    public final AnonymousClass0BP A0E = new C51952aL(this);
    public final AnonymousClass08B A0F = AnonymousClass08B.A00;
    public final C014308b A0G = C014308b.A00();
    public final AnonymousClass0L2 A0H = AnonymousClass0L2.A01();
    public final AnonymousClass03P A0I = AnonymousClass03P.A00();
    public final AnonymousClass01K A0J = AnonymousClass01K.A00();
    public final AnonymousClass0GW A0K = AnonymousClass0GW.A00();
    public final AnonymousClass0AO A0L = AnonymousClass0AO.A00();
    public final AnonymousClass0AM A0M = AnonymousClass0AM.A00();
    public final AnonymousClass01T A0N = AnonymousClass01T.A00();
    public final AnonymousClass019 A0O = new C51942aK(this);
    public final AnonymousClass0AC A0P = AnonymousClass0AC.A00;
    public final C014508d A0Q = C014508d.A00();
    public final AnonymousClass0CG A0R = AnonymousClass0CG.A00();
    public final AnonymousClass00Y A0S = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A0T = AnonymousClass0EO.A00();
    public final AnonymousClass0CH A0U = AnonymousClass0CH.A00();
    public final AnonymousClass022 A0V = AnonymousClass022.A00();
    public final C014708f A0W = C014708f.A00();
    public final AbstractC658531u A0X = AbstractC658531u.A00();
    public final AnonymousClass320 A0Y = AnonymousClass320.A00();
    public final AnonymousClass322 A0Z = AnonymousClass322.A00();
    public final AnonymousClass325 A0a = AnonymousClass325.A00();
    public final AnonymousClass00T A0b = C002101e.A00();

    @Override // X.AbstractC43421yL
    public int A5Q() {
        return 1;
    }

    @Override // X.AbstractC43421yL
    public boolean ABf(AbstractC007503q r2) {
        return false;
    }

    public class UnstarAllDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
            AnonymousClass01X r2 = this.A00;
            r3.A01.A0E = r2.A06(R.string.unstar_all_confirmation);
            r3.A07(r2.A06(R.string.remove_star), new AnonymousClass2Ie(this));
            return AnonymousClass008.A03(r2, R.string.cancel, r3);
        }
    }

    public static void A04(StarredMessagesActivity starredMessagesActivity) {
        Bundle bundle;
        if (!TextUtils.isEmpty(starredMessagesActivity.A05)) {
            bundle = new Bundle();
            bundle.putString("query", starredMessagesActivity.A05);
        } else {
            bundle = null;
        }
        AbstractC15640oQ.A00(starredMessagesActivity).A02(0, bundle, starredMessagesActivity);
    }

    public final void A0Z() {
        if (this.A03.A02 == null) {
            findViewById(R.id.empty_view).setVisibility(8);
            findViewById(R.id.search_no_matches).setVisibility(8);
            findViewById(R.id.progress).setVisibility(0);
            return;
        }
        ArrayList arrayList = this.A06;
        if (arrayList == null || arrayList.isEmpty()) {
            findViewById(R.id.empty_view).setVisibility(0);
            findViewById(R.id.search_no_matches).setVisibility(8);
            findViewById(R.id.progress).setVisibility(8);
            return;
        }
        findViewById(R.id.empty_view).setVisibility(8);
        TextView textView = (TextView) findViewById(R.id.search_no_matches);
        textView.setVisibility(0);
        textView.setText(((AnonymousClass2C0) this).A01.A0D(R.string.search_no_results, this.A05));
        findViewById(R.id.progress).setVisibility(8);
    }

    @Override // X.AbstractC43421yL
    public ArrayList A8u() {
        return this.A06;
    }

    @Override // X.AbstractC15630oP
    public C15650oR AEk(int i, Bundle bundle) {
        return new C59322nS(this, bundle == null ? null : bundle.getString("query"), this.A04);
    }

    @Override // X.AbstractC15630oP
    public /* bridge */ /* synthetic */ void AHA(C15650oR r3, Object obj) {
        this.A03.A00((Cursor) obj);
        A0Z();
        if (!TextUtils.isEmpty(this.A05)) {
            return;
        }
        if (this.A03.isEmpty()) {
            MenuItem menuItem = this.A00;
            if (menuItem != null) {
                if (menuItem.isActionViewExpanded()) {
                    this.A00.collapseActionView();
                }
                this.A00.setVisible(false);
            }
            MenuItem menuItem2 = this.A01;
            if (menuItem2 != null) {
                menuItem2.setVisible(false);
                return;
            }
            return;
        }
        MenuItem menuItem3 = this.A00;
        if (menuItem3 != null) {
            menuItem3.setVisible(true);
        }
        MenuItem menuItem4 = this.A01;
        if (menuItem4 != null) {
            menuItem4.setVisible(true);
        }
    }

    @Override // X.AbstractC15630oP
    public void AHG(C15650oR r3) {
        this.A03.A00(null);
    }

    @Override // X.AnonymousClass2DW, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 2) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Collection A0V2 = A0V();
            if (!((AbstractCollection) A0V2).isEmpty()) {
                List A0G2 = AnonymousClass1VY.A0G(AnonymousClass02N.class, intent.getStringArrayListExtra("jids"));
                ArrayList arrayList = new ArrayList(A0V2);
                Collections.sort(arrayList, C14360m9.A00);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    this.A0C.A09(this.A0A, (AbstractC007503q) it.next(), A0G2);
                }
                AbstractList abstractList = (AbstractList) A0G2;
                if (abstractList.size() != 1 || AnonymousClass1VY.A0b((Jid) abstractList.get(0))) {
                    A0S(A0G2);
                } else {
                    startActivity(Conversation.A04(this, ((AnonymousClass2DW) this).A0F.A0A((AnonymousClass02N) abstractList.get(0))));
                }
            } else {
                Log.w("starred/forward/failed");
                ((ActivityC004702f) this).A0F.A06(R.string.message_forward_failed, 0);
            }
            A0W();
        }
    }

    @Override // X.AnonymousClass2DW, X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.starred_messages));
        A0F();
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            this.A0F.A01(this.A0E);
            this.A0P.A01(this.A0O);
            this.A02 = this.A0H.A03(this);
            AnonymousClass01I r0 = this.A08;
            r0.A04();
            if (r0.A00 != null) {
                C014508d r02 = this.A0Q;
                r02.A05();
                if (r02.A01 && this.A0W.A02()) {
                    this.A04 = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
                    AnonymousClass0AO r5 = this.A0L;
                    if (bundle != null) {
                        r5.A00 = bundle.getLong("ephemeral_session_start", -1);
                    }
                    this.A0K.A03(this.A04, StarredMessagesActivity.class.getName());
                    AnonymousClass21Q r1 = new AnonymousClass21Q();
                    if (this.A04 == null) {
                        r1.A00 = 1;
                    } else {
                        r1.A00 = 0;
                    }
                    this.A0S.A0B(r1, null, false);
                    setContentView(R.layout.starred_messages);
                    this.A03 = new C59312nR(this);
                    ListView A0T2 = A0T();
                    A0T2.setFastScrollEnabled(false);
                    A0T2.setScrollbarFadingEnabled(true);
                    A0T2.setOnScrollListener(this.A07);
                    A0U(this.A03);
                    AbstractC15640oQ.A00(this).A01(0, null, this);
                    A0Z();
                    return;
                }
            }
            Log.i("starred/create/no-me-or-msgstore-db");
            if (((ActivityC004702f) this).A0F != null) {
                startActivity(new Intent(this, Main.class));
                finish();
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r5 = ((AnonymousClass2C0) this).A01;
        MenuItem add = menu.add(0, R.id.menuitem_unstar_all, 0, r5.A06(R.string.unstar_all));
        this.A01 = add;
        add.setShowAsAction(0);
        this.A01.setVisible(!((ActivityC03630Ha) this).A00.isEmpty());
        if (this.A0M.A0O()) {
            AnonymousClass0S2 A092 = A09();
            if (A092 != null) {
                SearchView searchView = new SearchView(A092.A01(), null);
                ((TextView) searchView.findViewById(R.id.search_src_text)).setTextColor(getResources().getColor(R.color.search_text_color_dark));
                searchView.setQueryHint(r5.A06(R.string.search_hint));
                searchView.A0B = new C51962aM(this);
                MenuItem icon = menu.add(0, R.id.menuitem_search, 0, r5.A06(R.string.search)).setIcon(R.drawable.ic_action_search);
                this.A00 = icon;
                icon.setVisible(!((ActivityC03630Ha) this).A00.isEmpty());
                this.A00.setActionView(searchView);
                this.A00.setShowAsAction(10);
                this.A00.setOnActionExpandListener(new AnonymousClass2Iu(this));
            } else {
                throw null;
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.AnonymousClass2DW, X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A02.A00();
        this.A0F.A00(this.A0E);
        this.A0P.A00(this.A0O);
        C28301Tu.A05();
        if (isFinishing()) {
            this.A0K.A04(this.A04, StarredMessagesActivity.class.getName());
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_unstar_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        new UnstarAllDialogFragment().A0u(A04(), "UnstarAllDialogFragment");
        return true;
    }

    @Override // X.AnonymousClass2DW, X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
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
        this.A03.notifyDataSetChanged();
    }

    @Override // X.AnonymousClass2DW, X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A0L.A00);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        MenuItem menuItem = this.A00;
        if (menuItem == null) {
            return false;
        }
        menuItem.expandActionView();
        return false;
    }
}
