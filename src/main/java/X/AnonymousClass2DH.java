package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.search.verification.client.R;
import com.whatsapp.ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2DH  reason: invalid class name */
public abstract class AnonymousClass2DH extends ActivityC03630Ha {
    public MenuItem A00;
    public MenuItem A01;
    public C26431Kv A02;
    public C39521rf A03;
    public C39541rh A04;
    public AnonymousClass0YP A05;
    public AnonymousClass0YX A06;
    public String A07;
    public ArrayList A08;
    public List A09 = new ArrayList();
    public Set A0A = new HashSet();
    public boolean A0B = true;
    public final Handler A0C;
    public final AnonymousClass0GG A0D;
    public final AnonymousClass01A A0E;
    public final AnonymousClass0BP A0F;
    public final AnonymousClass08B A0G;
    public final C014308b A0H;
    public final AnonymousClass0L2 A0I;
    public final AnonymousClass03S A0J;
    public final AnonymousClass31y A0K;
    public final AnonymousClass325 A0L;
    public final AnonymousClass00T A0M;
    public final Runnable A0N;
    public final Set A0O = new HashSet();
    public final Set A0P;
    public final Set A0Q = new HashSet();

    public AnonymousClass2DH() {
        HashSet hashSet = new HashSet();
        this.A0P = hashSet;
        this.A0N = new RunnableEBaseShape6S0100000_I1_1(hashSet, 44);
        this.A0C = new Handler(Looper.getMainLooper());
        this.A0M = C002101e.A00();
        this.A0L = AnonymousClass325.A00();
        this.A0I = AnonymousClass0L2.A01();
        this.A0E = AnonymousClass01A.A00();
        this.A0H = C014308b.A00();
        this.A0D = AnonymousClass0GG.A00();
        this.A0K = AnonymousClass31y.A00();
        this.A0J = AnonymousClass03S.A00();
        this.A0G = AnonymousClass08B.A00;
        this.A0F = new C39501rd(this);
    }

    public static void A04(AnonymousClass2DH r3) {
        C39521rf r0 = r3.A03;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            r3.A03 = null;
        }
        C39521rf r2 = new C39521rf(r3, r3.A08, r3.A09);
        r3.A03 = r2;
        r3.A0M.ANC(r2, new Void[0]);
    }

    public void A0V() {
        A0W();
        ListView listView = (ListView) findViewById(16908298);
        View view = new View(this);
        view.setLayoutParams(new AbsListView.LayoutParams(1, getResources().getDimensionPixelSize(R.dimen.actionbar_height)));
        listView.addFooterView(view, null, false);
        C26431Kv r0 = new C26431Kv(this);
        this.A02 = r0;
        listView.setAdapter((ListAdapter) r0);
        listView.setOnItemClickListener(new C25571Hm(this));
        A0Y();
    }

    public final void A0W() {
        C39541rh r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C39521rf r02 = this.A03;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A03 = null;
        }
        C39541rh r2 = new C39541rh(this, this.A0Q);
        this.A04 = r2;
        this.A0M.ANC(r2, new Void[0]);
    }

    public final void A0X() {
        Set set = this.A0O;
        Set set2 = this.A0Q;
        if (!set.containsAll(set2) || !set2.containsAll(set)) {
            APm(new ContentDistributionRecipientsPickerActivity$DiscardChangesConfirmationDialogFragment());
        } else {
            finish();
        }
    }

    public final void A0Y() {
        Set set;
        AnonymousClass01X r6;
        String A0A2;
        if (this.A0B) {
            set = this.A0Q;
            if (set.isEmpty()) {
                r6 = ((AnonymousClass2C0) this).A01;
                A0A2 = r6.A06(R.string.no_contacts_excluded);
            } else {
                r6 = ((AnonymousClass2C0) this).A01;
                A0A2 = r6.A0A(R.plurals.status_contacts_excluded, (long) set.size(), Integer.valueOf(set.size()));
            }
        } else {
            set = this.A0Q;
            if (set.isEmpty()) {
                r6 = ((AnonymousClass2C0) this).A01;
                A0A2 = r6.A06(R.string.no_contacts_selected);
            } else {
                r6 = ((AnonymousClass2C0) this).A01;
                A0A2 = r6.A0A(R.plurals.status_contacts_selected, (long) set.size(), Integer.valueOf(set.size()));
            }
        }
        MenuItem menuItem = this.A01;
        if (menuItem != null) {
            int size = set.size();
            int size2 = this.A0A.size();
            int i = R.string.select_all;
            if (size == size2) {
                i = R.string.unselect_all;
            }
            menuItem.setTitle(r6.A06(i));
        }
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A07(A0A2);
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("statusrecipients/permissions denied");
            finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A05.A05()) {
            this.A05.A04(true);
        } else {
            A0X();
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int i;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().addFlags(EditorInfoCompat.IME_FLAG_FORCE_ASCII);
        }
        super.onCreate(bundle);
        setContentView(R.layout.status_contact_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        this.A06 = this.A0I.A03(this);
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        this.A05 = new AnonymousClass0YP(this, r4, findViewById(R.id.search_holder), toolbar, new C39511re(this));
        this.A0B = getIntent().getBooleanExtra("is_black_list", true);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            boolean z = this instanceof GroupAddBlacklistPickerActivity;
            if (this.A0B) {
                if (!z) {
                    i = R.string.status_recipients_black_list;
                } else {
                    i = R.string.group_add_permission_blacklist;
                }
            } else if (!z) {
                i = R.string.status_recipients_white_list;
            } else {
                i = 0;
            }
            A092.A08(r4.A06(i));
            if (bundle != null) {
                List A0G2 = AnonymousClass1VY.A0G(UserJid.class, bundle.getStringArrayList("selected_jids"));
                if (!((AbstractCollection) A0G2).isEmpty()) {
                    this.A0Q.addAll(A0G2);
                }
            } else if (!this.A0J.A03()) {
                RequestPermissionActivity.A08(this, R.string.permission_contacts_access_on_new_broadcast_request, R.string.permission_contacts_access_on_new_broadcast);
            }
            findViewById(R.id.done).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 1));
            if (!(this instanceof GroupAddBlacklistPickerActivity)) {
                A0V();
            } else {
                GroupAddBlacklistPickerActivity groupAddBlacklistPickerActivity = (GroupAddBlacklistPickerActivity) this;
                groupAddBlacklistPickerActivity.A01.A02().A03(groupAddBlacklistPickerActivity, new C54722fO(groupAddBlacklistPickerActivity));
            }
            findViewById(16908292).setVisibility(0);
            findViewById(R.id.init_contacts_progress).setVisibility(0);
            this.A0G.A01(this.A0F);
            return;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r4 = ((AnonymousClass2C0) this).A01;
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, r4.A06(R.string.search)).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new MenuItem$OnActionExpandListenerC26411Kt(this));
        this.A00.setVisible(!this.A09.isEmpty());
        MenuItem icon2 = menu.add(0, R.id.menuitem_select_all, 0, r4.A06(R.string.select_all)).setIcon(R.drawable.ic_action_select_all);
        this.A01 = icon2;
        icon2.setShowAsAction(2);
        MenuItem menuItem = this.A01;
        int size = this.A0Q.size();
        int size2 = this.A0A.size();
        int i = R.string.select_all;
        if (size == size2) {
            i = R.string.unselect_all;
        }
        menuItem.setTitle(r4.A06(i));
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0G.A00(this.A0F);
        this.A06.A00();
        C39541rh r0 = this.A04;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A04 = null;
        }
        C39521rf r02 = this.A03;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A03 = null;
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId == R.id.menuitem_select_all) {
            Set set = this.A0Q;
            if (set.size() == this.A0A.size()) {
                set.clear();
            } else {
                for (int i = 0; i < this.A02.getCount(); i++) {
                    set.add(((C007003k) this.A02.A00.get(i)).A02(UserJid.class));
                }
            }
            this.A02.notifyDataSetChanged();
            A0Y();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            A0X();
            return true;
        }
    }

    @Override // X.ActivityC03630Ha
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A05.A02(bundle);
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Set set = this.A0Q;
        if (!set.isEmpty()) {
            bundle.putStringArrayList("selected_jids", AnonymousClass1VY.A0F(set));
        }
        this.A05.A03(bundle);
    }

    public boolean onSearchRequested() {
        this.A05.A01();
        return false;
    }
}
