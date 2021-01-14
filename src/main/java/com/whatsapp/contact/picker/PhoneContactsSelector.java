package com.whatsapp.contact.picker;

import X.ActivityC004702f;
import X.ActivityC03630Ha;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass0CO;
import X.AnonymousClass0HJ;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0S2;
import X.AnonymousClass0YP;
import X.AnonymousClass0YX;
import X.AnonymousClass2C0;
import X.AnonymousClass2GH;
import X.AnonymousClass2GZ;
import X.AnonymousClass2YV;
import X.AnonymousClass2YW;
import X.AnonymousClass2YX;
import X.AnonymousClass325;
import X.C002101e;
import X.C004302a;
import X.C017009c;
import X.C06470Tj;
import X.C09040cC;
import X.C10870fL;
import X.C10880fM;
import X.C12310ht;
import X.C47002Gb;
import X.C58912mk;
import X.MenuItem$OnActionExpandListenerC46992Ga;
import X.animation.Animation$AnimationListenerC47022Gd;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import java.util.ArrayList;
import java.util.List;

public class PhoneContactsSelector extends ActivityC03630Ha {
    public MenuItem A00;
    public View A01;
    public View A02;
    public ListView A03;
    public RecyclerView A04;
    public AnonymousClass0YP A05;
    public AnonymousClass0YX A06;
    public C47002Gb A07;
    public C10880fM A08;
    public C10870fL A09;
    public AnonymousClass2YX A0A = new AnonymousClass2YX(this);
    public AnonymousClass02N A0B;
    public String A0C;
    public ArrayList A0D;
    public boolean A0E;
    public boolean A0F;
    public final AnonymousClass0CO A0G = AnonymousClass0CO.A00();
    public final C09040cC A0H = C09040cC.A00();
    public final C017009c A0I = C017009c.A00();
    public final AnonymousClass0HJ A0J = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0K = AnonymousClass01A.A00();
    public final AnonymousClass0L2 A0L = AnonymousClass0L2.A01();
    public final AnonymousClass00G A0M = AnonymousClass00G.A01;
    public final AnonymousClass03S A0N = AnonymousClass03S.A00();
    public final AnonymousClass325 A0O = AnonymousClass325.A00();
    public final AnonymousClass00T A0P = C002101e.A00();
    public final ArrayList A0Q = new ArrayList();
    public final ArrayList A0R = new ArrayList();
    public final List A0S = new ArrayList();

    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x03bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0436, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x043a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x04e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04e8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04f6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04fd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0500, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0501, code lost:
        if (r10 != null) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0506, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0509, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x050d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x033a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x033e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0377, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x037b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x03b8, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A04(X.AnonymousClass00G r33, X.C000300f r34, X.AnonymousClass01A r35, X.AnonymousClass01X r36, X.AnonymousClass0CO r37, X.C017009c r38, X.C12310ht r39) {
        /*
        // Method dump skipped, instructions count: 1294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.picker.PhoneContactsSelector.A04(X.00G, X.00f, X.01A, X.01X, X.0CO, X.09c, X.0ht):java.lang.String");
    }

    public static void A05(PhoneContactsSelector phoneContactsSelector) {
        C10880fM r0 = phoneContactsSelector.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            phoneContactsSelector.A08 = null;
        }
        C10880fM r2 = new C10880fM(phoneContactsSelector, phoneContactsSelector.A0D, phoneContactsSelector.A0R);
        phoneContactsSelector.A08 = r2;
        phoneContactsSelector.A0P.ANC(r2, new Void[0]);
    }

    public final void A0V() {
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        if (!this.A0N.A03()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (this.A09 != null) {
            findViewById4.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.A0C)) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            ((TextView) findViewById3).setText(((AnonymousClass2C0) this).A01.A0D(R.string.search_no_results, this.A0C));
        } else {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(8);
        }
    }

    public final void A0W() {
        if (this.A01.getVisibility() == 0 || !this.A0F) {
            this.A02.setVisibility(8);
        } else {
            this.A02.setVisibility(0);
        }
    }

    public final void A0X(int i) {
        A09().A07(((AnonymousClass2C0) this).A01.A0A(R.plurals.n_contacts_selected, (long) i, Integer.valueOf(i)));
    }

    public final void A0Y(C12310ht r12) {
        List list;
        SelectionCheckView selectionCheckView = (SelectionCheckView) this.A03.findViewWithTag(r12);
        if (r12.A03) {
            r12.A03 = false;
            list = this.A0S;
            int indexOf = list.indexOf(r12);
            if (list.remove(r12)) {
                this.A0A.A01.A03(indexOf, 1);
            }
        } else {
            list = this.A0S;
            if (list.size() == 257) {
                ((ActivityC004702f) this).A0F.A0C(((AnonymousClass2C0) this).A01.A0A(R.plurals.contact_array_message_reach_limit, 257, 257), 1);
                if (selectionCheckView != null) {
                    selectionCheckView.A03(false, false);
                    return;
                }
                return;
            }
            TextView textView = (TextView) findViewById(R.id.search_holder).findViewById(R.id.search_src_text);
            if (textView != null) {
                textView.setText("");
            }
            r12.A03 = true;
            if (list.add(r12)) {
                this.A0A.A01.A02(list.size() - 1, 1);
            }
        }
        if (selectionCheckView != null) {
            selectionCheckView.A03(r12.A03, false);
        }
        if (list.isEmpty()) {
            this.A01.setVisibility(4);
            A0W();
            if (!this.A0F) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height)));
                translateAnimation.setDuration(240);
                translateAnimation.setAnimationListener(new animation.Animation$AnimationListenerC47022Gd(this, 0));
                this.A03.startAnimation(translateAnimation);
            }
        } else if (this.A01.getVisibility() != 0) {
            if (this.A02.getVisibility() != 0) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height);
                this.A01.setVisibility(0);
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) dimensionPixelSize);
                translateAnimation2.setDuration(240);
                translateAnimation2.setAnimationListener(new animation.Animation$AnimationListenerC47022Gd(this, dimensionPixelSize));
                this.A03.startAnimation(translateAnimation2);
            } else {
                this.A02.setVisibility(8);
                this.A01.setVisibility(0);
            }
        } else if (r12.A03) {
            this.A04.A0X(list.size() - 1);
        }
        A0X(list.size());
        if (r12.A02 == null) {
            this.A0P.ANF(new RunnableEBaseShape7S0200000_I1_2(this, r12, 14));
        }
    }

    @Override // X.ActivityC004702f
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public /* synthetic */ void lambda$onCreate$757$PhoneContactsSelector(View view) {
        this.A0H.A02(this, 10);
    }

    @Override // X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 8) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1, intent);
            finish();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A0E) {
            this.A0E = false;
            AnonymousClass00E.A01();
            ArrayList arrayList = this.A0Q;
            arrayList.clear();
            arrayList.addAll(this.A0R);
            C47002Gb r0 = this.A07;
            if (r0 != null) {
                r0.notifyDataSetChanged();
            }
            this.A05.A04(true);
            return;
        }
        super.onBackPressed();
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.multiple_contact_picker);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            this.A06 = this.A0L.A03(this);
            AnonymousClass01X r8 = ((AnonymousClass2C0) this).A01;
            this.A05 = new AnonymousClass0YP(this, r8, findViewById(R.id.search_holder), toolbar, new AnonymousClass2YV(this));
            setTitle(r8.A06(R.string.contacts_to_send));
            this.A0B = AnonymousClass02N.A01(getIntent().getStringExtra("jid"));
            ListView A0T = A0T();
            this.A03 = A0T;
            A0T.setFastScrollAlwaysVisible(true);
            this.A03.setScrollBarStyle(33554432);
            C10870fL r0 = this.A09;
            if (r0 != null) {
                ((AnonymousClass0JW) r0).A00.cancel(true);
            }
            C10880fM r02 = this.A08;
            if (r02 != null) {
                ((AnonymousClass0JW) r02).A00.cancel(true);
                this.A08 = null;
            }
            C10870fL r2 = new C10870fL(this);
            this.A09 = r2;
            this.A0P.ANC(r2, new Void[0]);
            List list = this.A0S;
            list.clear();
            this.A04 = (RecyclerView) findViewById(R.id.selected_items);
            this.A04.A0j(new AnonymousClass2YW(getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset)));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1A(0);
            this.A04.setLayoutManager(linearLayoutManager);
            this.A04.setAdapter(this.A0A);
            this.A04.setItemAnimator(new C58912mk());
            this.A03.setOnScrollListener(new AnonymousClass2GZ(this));
            this.A03.setFastScrollEnabled(true);
            this.A03.setScrollbarFadingEnabled(true);
            boolean z = r8.A02().A06;
            ListView listView = this.A03;
            if (z) {
                listView.setVerticalScrollbarPosition(1);
                this.A03.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0);
            } else {
                listView.setVerticalScrollbarPosition(2);
                this.A03.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0);
            }
            this.A03.setOnItemClickListener(new AnonymousClass2GH(this));
            A0X(list.size());
            this.A01 = findViewById(R.id.selected_list);
            if (list.isEmpty()) {
                this.A01.setVisibility(4);
            }
            this.A02 = findViewById(R.id.warning);
            TextView textView = (TextView) findViewById(R.id.warning_text);
            textView.setText("");
            this.A0F = !TextUtils.isEmpty(textView.getText());
            A0W();
            C47002Gb r03 = new C47002Gb(this, this, this.A0Q);
            this.A07 = r03;
            A0U(r03);
            View findViewById = findViewById(R.id.next_btn);
            if (findViewById != null) {
                ImageView imageView = (ImageView) findViewById;
                imageView.setImageDrawable(new C06470Tj(r8, C004302a.A03(this, R.drawable.ic_fab_next)));
                imageView.setContentDescription(r8.A06(R.string.next));
                imageView.setVisibility(0);
                imageView.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 1));
                ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 7));
                findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 2));
                registerForContextMenu(this.A03);
                if (bundle == null && !this.A0N.A03()) {
                    RequestPermissionActivity.A08(this, R.string.permission_contacts_access_on_new_group_request, R.string.permission_contacts_access_on_new_group);
                }
                A0V();
                return;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A06(R.string.search)).setIcon(R.drawable.ic_action_search);
        this.A00 = icon;
        icon.setShowAsAction(10);
        this.A00.setOnActionExpandListener(new MenuItem$OnActionExpandListenerC46992Ga(this));
        this.A00.setVisible(!this.A0R.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        C10880fM r0 = this.A08;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A08 = null;
        }
        C10870fL r02 = this.A09;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A09 = null;
        }
        this.A0R.clear();
        this.A0Q.clear();
        this.A06.A00();
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menuitem_search) {
            onSearchRequested();
            return true;
        } else if (itemId != 16908332) {
            return true;
        } else {
            finish();
            return true;
        }
    }

    public boolean onSearchRequested() {
        this.A05.A01();
        this.A0E = true;
        return false;
    }
}
