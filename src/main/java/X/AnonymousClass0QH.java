package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape0S0100000_I0_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.EditBroadcastRecipientsSelector;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.Me;
import com.whatsapp.UnblockDialogFragment;
import com.whatsapp.WaImageButton;
import com.whatsapp.components.FloatingActionButton;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.filter.SmoothScrollLinearLayoutManager;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupMembersSelector;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape10S0100000_I0;
import com.whatsapp.voipcalling.GroupCallParticipantPicker;
import com.whatsapp.voipcalling.GroupCallParticipantPickerSheet;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0QH  reason: invalid class name */
public abstract class AnonymousClass0QH extends ActivityC03630Ha {
    public int A00;
    public int A01;
    public AnimatorSet A02;
    public ValueAnimator A03;
    public MenuItem A04;
    public View A05;
    public View A06;
    public ViewGroup A07;
    public ListView A08;
    public RecyclerView A09;
    public AnonymousClass0YP A0A;
    public WaImageButton A0B;
    public WaImageButton A0C;
    public FloatingActionButton A0D;
    public AnonymousClass0YX A0E;
    public AnonymousClass2GV A0F;
    public C10910fP A0G;
    public C10900fO A0H;
    public String A0I;
    public ArrayList A0J;
    public List A0K = new ArrayList();
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public final AnonymousClass0GG A0O;
    public final AnonymousClass01I A0P = AnonymousClass01I.A00();
    public final C09040cC A0Q = C09040cC.A00();
    public final AnonymousClass01A A0R;
    public final AnonymousClass0BP A0S;
    public final AnonymousClass08B A0T;
    public final C014308b A0U;
    public final AnonymousClass0L2 A0V;
    public final AnonymousClass2YT A0W = new AnonymousClass2YT(this);
    public final AnonymousClass03S A0X;
    public final AnonymousClass31y A0Y;
    public final AnonymousClass00T A0Z = C002101e.A00();
    public final ArrayList A0a = new ArrayList();
    public final List A0b = new ArrayList();

    public AnonymousClass0QH() {
        C04360Kb.A00();
        this.A0V = AnonymousClass0L2.A01();
        this.A0R = AnonymousClass01A.A00();
        this.A0U = C014308b.A00();
        this.A0O = AnonymousClass0GG.A00();
        this.A0Y = AnonymousClass31y.A00();
        this.A0X = AnonymousClass03S.A00();
        this.A0M = true;
        this.A0T = AnonymousClass08B.A00;
        this.A0S = new AnonymousClass2YP(this);
    }

    public int A0V() {
        if (this instanceof GroupCallParticipantPicker) {
            return 7;
        }
        if (this instanceof NotifyContactsSelector) {
            return Integer.MAX_VALUE;
        }
        if (this instanceof GroupMembersSelector) {
            return ((ActivityC004702f) this).A0G.A06(AbstractC000400g.A3i) - 1;
        }
        if (this instanceof EditGroupAdminsSelector) {
            int size = this.A0K.size();
            if (size == 0) {
                return Integer.MAX_VALUE;
            }
            return Math.min((((ActivityC004702f) this).A0G.A06(AbstractC000400g.A3i) - 1) - 1, size);
        } else if (this instanceof ListMembersSelector) {
            int A062 = ((ActivityC004702f) this).A0G.A06(AbstractC000400g.A2u);
            if (A062 == 0) {
                return Integer.MAX_VALUE;
            }
            return A062;
        } else if (!(this instanceof AddGroupParticipantsSelector)) {
            int A063 = ((ActivityC004702f) this).A0G.A06(AbstractC000400g.A2u);
            if (A063 == 0) {
                return Integer.MAX_VALUE;
            }
            return A063;
        } else {
            AddGroupParticipantsSelector addGroupParticipantsSelector = (AddGroupParticipantsSelector) this;
            return (((ActivityC004702f) addGroupParticipantsSelector).A0G.A06(AbstractC000400g.A3i) - 1) - addGroupParticipantsSelector.A01.size();
        }
    }

    public final List A0W() {
        List<C007003k> list = this.A0b;
        ArrayList arrayList = new ArrayList(list.size());
        for (C007003k r1 : list) {
            arrayList.add(r1.A02(UserJid.class));
        }
        return arrayList;
    }

    public void A0X() {
        AnonymousClass0VT r0;
        RecyclerView recyclerView = this.A09;
        if (recyclerView != null && (r0 = recyclerView.A0S) != null) {
            int A0A2 = r0.A0A();
            View A0I2 = this.A09.A0S.A0I(0);
            if (A0A2 != 0 && A0I2 != null) {
                int width = this.A09.getWidth();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0I2.getLayoutParams();
                int width2 = A0I2.getWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int paddingRight = this.A09.getPaddingRight();
                if (A0A2 < this.A0b.size()) {
                    int i = A0A2 * width2;
                    if (paddingRight == 0 && width >= i - marginLayoutParams.leftMargin && width <= i + marginLayoutParams.rightMargin) {
                        RecyclerView recyclerView2 = this.A09;
                        recyclerView2.setPadding(recyclerView2.getPaddingLeft(), this.A09.getPaddingTop(), width2 >> 1, this.A09.getPaddingBottom());
                    }
                } else if (paddingRight > 0) {
                    RecyclerView recyclerView3 = this.A09;
                    recyclerView3.setPadding(recyclerView3.getPaddingLeft(), this.A09.getPaddingTop(), 0, this.A09.getPaddingBottom());
                }
            }
        }
    }

    public void A0Y() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList arrayList = new ArrayList();
            groupCallParticipantPicker.A0k(arrayList, groupCallParticipantPicker.A0W());
            if (groupCallParticipantPicker.A02.A02(arrayList, groupCallParticipantPicker, ((Number) groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")).intValue(), false, false, null) == 0) {
                groupCallParticipantPicker.setResult(-1);
                groupCallParticipantPicker.finish();
            }
        }
    }

    public void A0Z() {
        if (this instanceof GroupCallParticipantPicker) {
            GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
            ArrayList arrayList = new ArrayList();
            groupCallParticipantPicker.A0k(arrayList, groupCallParticipantPicker.A0W());
            if (groupCallParticipantPicker.A02.A02(arrayList, groupCallParticipantPicker, ((Number) groupCallParticipantPicker.getIntent().getSerializableExtra("call_from_ui")).intValue(), false, true, null) == 0) {
                groupCallParticipantPicker.setResult(-1);
                groupCallParticipantPicker.finish();
            }
        }
    }

    public final void A0a() {
        C10910fP r0 = this.A0G;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
            this.A0G = null;
        }
        C10910fP r2 = new C10910fP(this, this.A0J, this.A0K);
        this.A0G = r2;
        this.A0Z.ANC(r2, new Void[0]);
    }

    public final void A0b() {
        C10900fO r0 = this.A0H;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        C10910fP r02 = this.A0G;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0G = null;
        }
        C10900fO r2 = new C10900fO(this, this.A0b);
        this.A0H = r2;
        this.A0Z.ANC(r2, new Void[0]);
    }

    public final void A0c() {
        boolean z;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_list_action_fab_1_margin_right);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.selected_list_action_fab_2_margin_right);
        ValueAnimator valueAnimator = this.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.A03.end();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, this.A01);
        ofInt.addUpdateListener(new AnonymousClass2GX(this));
        ofInt.addListener(new AnonymousClass2GW(this));
        ofInt.setDuration(240L);
        AnimatorSet animatorSet = new AnimatorSet();
        this.A02 = animatorSet;
        if (!(this instanceof GroupCallParticipantPicker)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i = dimensionPixelSize + this.A00;
            AnonymousClass01X r2 = ((AnonymousClass2C0) this).A01;
            int i2 = -1;
            int i3 = 1;
            if (r2.A0M()) {
                i3 = -1;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.A0B, "translationX", (float) (i * i3));
            ofFloat.setDuration(240L).setInterpolator(new DecelerateInterpolator());
            ofFloat.setStartDelay(50);
            int i4 = dimensionPixelSize2 + this.A00;
            if (!r2.A0M()) {
                i2 = 1;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.A0C, "translationX", (float) (i4 * i2));
            ofFloat2.setDuration(240L).setInterpolator(new DecelerateInterpolator());
            this.A02.play(ofFloat).with(ofFloat2).after(ofInt);
        } else {
            animatorSet.play(ofInt);
        }
        this.A02.start();
    }

    public final void A0d() {
        View findViewById = findViewById(R.id.contacts_empty_permission_denied);
        View findViewById2 = findViewById(R.id.contacts_empty);
        View findViewById3 = findViewById(R.id.search_no_matches);
        View findViewById4 = findViewById(R.id.init_contacts_progress);
        if (!this.A0X.A03()) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (this.A0H != null) {
            findViewById4.setVisibility(0);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.A0I)) {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
            findViewById3.setVisibility(0);
            ((TextView) findViewById3).setText(((AnonymousClass2C0) this).A01.A0D(R.string.search_no_results, this.A0I));
        } else {
            findViewById4.setVisibility(8);
            findViewById.setVisibility(8);
            findViewById2.setVisibility(0);
            findViewById3.setVisibility(8);
        }
        int size = this.A0b.size();
        A0g(size);
        A0f(size);
    }

    public final void A0e() {
        if (this.A05.getVisibility() == 0 || !this.A0N) {
            this.A07.setVisibility(8);
        } else {
            this.A07.setVisibility(0);
        }
    }

    public void A0f(int i) {
        boolean z;
        if (this instanceof AddGroupParticipantsSelector) {
            FloatingActionButton floatingActionButton = this.A0D;
            if (i == 0) {
                floatingActionButton.A04(true);
            } else {
                floatingActionButton.A05(true);
            }
        } else if (!this.A0K.isEmpty() || !this.A0b.isEmpty()) {
            if (!(this instanceof GroupCallParticipantPicker)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.A0D.A05(true);
            }
        } else {
            this.A0D.A04(true);
        }
    }

    public void A0g(int i) {
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            int A0V2 = A0V();
            boolean z = false;
            if (A0V2 > 0) {
                z = true;
            }
            AnonymousClass00E.A08(z, "Max contacts must be positive");
            if (A0V2 == Integer.MAX_VALUE) {
                A092.A07(((AnonymousClass2C0) this).A01.A0A(R.plurals.n_contacts_selected, (long) i, Integer.valueOf(i)));
                return;
            }
            A092.A07(((AnonymousClass2C0) this).A01.A0A(R.plurals.n_of_m_contacts_selected, (long) i, Integer.valueOf(i), Integer.valueOf(A0V2)));
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0h(X.AnonymousClass2GY r8, X.C007003k r9) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QH.A0h(X.2GY, X.03k):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0197, code lost:
        if (r5 >= 0) goto L_0x0199;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0i(X.C007003k r10) {
        /*
        // Method dump skipped, instructions count: 609
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QH.A0i(X.03k):void");
    }

    public void A0j(C007003k r7) {
        if (this instanceof GroupCallParticipantPicker) {
            String A0D2 = ((AnonymousClass2C0) this).A01.A0D(R.string.unblock_before_add_group_call, this.A0U.A08(r7, false));
            AnonymousClass0GG r2 = this.A0O;
            Jid A022 = r7.A02(UserJid.class);
            if (A022 != null) {
                UnblockDialogFragment.A00(A0D2, R.string.blocked_title, false, new C39141r1(r2, this, (UserJid) A022)).A0u(A04(), null);
                return;
            }
            throw null;
        } else if (this instanceof GroupMembersSelector) {
            String A0D3 = ((AnonymousClass2C0) this).A01.A0D(R.string.unblock_before_add_group, this.A0U.A08(r7, false));
            AnonymousClass0GG r22 = this.A0O;
            Jid A023 = r7.A02(UserJid.class);
            if (A023 != null) {
                APm(UnblockDialogFragment.A00(A0D3, R.string.blocked_title, false, new C39141r1(r22, this, (UserJid) A023)));
                return;
            }
            throw null;
        } else if (this instanceof ListMembersSelector) {
            String A0D4 = ((AnonymousClass2C0) this).A01.A0D(R.string.unblock_before_add_broadcast, this.A0U.A08(r7, false));
            AnonymousClass0GG r23 = this.A0O;
            Jid A024 = r7.A02(UserJid.class);
            if (A024 != null) {
                APm(UnblockDialogFragment.A00(A0D4, R.string.blocked_title, false, new C39141r1(r23, this, (UserJid) A024)));
                return;
            }
            throw null;
        } else if (this instanceof AddGroupParticipantsSelector) {
            String A0D5 = ((AnonymousClass2C0) this).A01.A0D(R.string.unblock_before_add_group, this.A0U.A08(r7, false));
            AnonymousClass0GG r24 = this.A0O;
            Jid A025 = r7.A02(UserJid.class);
            if (A025 != null) {
                UnblockDialogFragment.A00(A0D5, R.string.blocked_title, false, new C39141r1(r24, this, (UserJid) A025)).A0u(A04(), null);
                return;
            }
            throw null;
        } else if (this instanceof EditBroadcastRecipientsSelector) {
            String string = getString(R.string.unblock_before_add_broadcast, this.A0U.A08(r7, false));
            AnonymousClass0GG r25 = this.A0O;
            Jid A026 = r7.A02(UserJid.class);
            if (A026 != null) {
                APm(UnblockDialogFragment.A00(string, R.string.blocked_title, false, new C39141r1(r25, this, (UserJid) A026)));
                return;
            }
            throw null;
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

    public /* synthetic */ void lambda$onCreate$965$MultipleContactPicker(View view) {
        A0Y();
    }

    public /* synthetic */ void lambda$onCreate$966$MultipleContactPicker(View view) {
        A0Z();
    }

    public /* synthetic */ void lambda$onCreate$968$MultipleContactPicker(View view) {
        this.A0Q.A02(this, 9);
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        if (this.A0A.A05()) {
            this.A0A.A04(true);
        } else {
            finish();
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C007003k r1 = (C007003k) A0T().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).position);
        if (menuItem.getItemId() != 0) {
            return super.onContextItemSelected(menuItem);
        }
        AnonymousClass0GG r2 = this.A0O;
        Jid A022 = r1.A02(UserJid.class);
        if (A022 != null) {
            r2.A07(this, null, (UserJid) A022);
            return true;
        }
        throw null;
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        boolean z;
        int dimensionPixelSize;
        boolean z2;
        int dimensionPixelSize2;
        Drawable A0b2;
        Drawable A0b3;
        int i3;
        int i4;
        View view;
        String A0D2;
        boolean z3;
        Drawable drawable;
        int i5;
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        if (!(this instanceof GroupCallParticipantPickerSheet)) {
            i = R.layout.multiple_contact_picker;
        } else {
            i = R.layout.group_call_participant_picker_sheet;
        }
        setContentView(layoutInflater.inflate(i, (ViewGroup) null));
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        A0C(toolbar);
        AnonymousClass0S2 A092 = A09();
        if (A092 != null) {
            A092.A0A(true);
            A092.A0B(true);
            this.A0E = this.A0V.A03(this);
            AnonymousClass01X r14 = ((AnonymousClass2C0) this).A01;
            this.A0A = new AnonymousClass0YP(this, r14, findViewById(R.id.search_holder), toolbar, new AnonymousClass2YQ(this));
            if (!(this instanceof GroupCallParticipantPicker)) {
                if (this instanceof NotifyContactsSelector) {
                    i2 = R.string.change_number_notification;
                } else if (this instanceof GroupMembersSelector) {
                    i2 = R.string.new_group;
                } else if (this instanceof EditGroupAdminsSelector) {
                    i2 = R.string.edit_group_admins;
                } else if (this instanceof ListMembersSelector) {
                    i2 = R.string.new_list;
                } else if (!(this instanceof AddGroupParticipantsSelector)) {
                    i2 = R.string.edit_broadcast_recipients;
                } else {
                    i2 = R.string.add_paticipants;
                }
            } else if (!(((GroupCallParticipantPicker) this) instanceof GroupCallParticipantPickerSheet)) {
                i2 = R.string.new_group_call;
            } else {
                i2 = R.string.menuitem_new_call;
            }
            setTitle(r14.A06(i2));
            ListView A0T2 = A0T();
            this.A08 = A0T2;
            if (!(this instanceof GroupCallParticipantPicker)) {
                z = true;
            } else {
                z = false;
            }
            A0T2.setFastScrollAlwaysVisible(z);
            this.A08.setScrollBarStyle(33554432);
            List list = this.A0b;
            list.clear();
            if (bundle != null) {
                AbstractCollection abstractCollection = (AbstractCollection) AnonymousClass1VY.A0G(UserJid.class, bundle.getStringArrayList("selected_jids"));
                if (!abstractCollection.isEmpty()) {
                    Iterator it = abstractCollection.iterator();
                    while (it.hasNext()) {
                        C007003k A093 = this.A0R.A09((AnonymousClass02N) it.next());
                        if (A093 != null) {
                            A093.A0V = true;
                            list.add(A093);
                        }
                    }
                }
            } else {
                this.A0L = AnonymousClass1VY.A0G(UserJid.class, getIntent().getStringArrayListExtra("selected"));
            }
            A0b();
            this.A06 = findViewById(R.id.selected_items_divider);
            this.A09 = (RecyclerView) findViewById(R.id.selected_items);
            this.A00 = getResources().getDimensionPixelSize(R.dimen.selected_contacts_list_action_fab_size);
            RecyclerView recyclerView = this.A09;
            if (!(this instanceof GroupCallParticipantPicker)) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.selected_contacts_list_left_padding);
            }
            recyclerView.setPadding(dimensionPixelSize, this.A09.getPaddingTop(), this.A09.getPaddingRight(), this.A09.getPaddingBottom());
            if (!(this instanceof GroupCallParticipantPicker)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A09.getLayoutParams();
                int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.selected_contact_list_with_fab_margin_right);
                if (r14.A0M()) {
                    layoutParams.rightMargin = dimensionPixelSize3;
                } else {
                    layoutParams.leftMargin = dimensionPixelSize3;
                }
                this.A09.setLayoutParams(layoutParams);
            }
            int dimensionPixelSize4 = getResources().getDimensionPixelSize(R.dimen.selected_contacts_top_offset);
            this.A09.A0j(new AnonymousClass2YR(dimensionPixelSize4));
            SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager = new SmoothScrollLinearLayoutManager(0);
            smoothScrollLinearLayoutManager.A1A(0);
            this.A09.setLayoutManager(smoothScrollLinearLayoutManager);
            this.A09.setAdapter(this.A0W);
            this.A09.setItemAnimator(new C58912mk());
            this.A08.setOnScrollListener(new AnonymousClass2GU(this));
            this.A08.setFastScrollEnabled(true);
            this.A08.setScrollbarFadingEnabled(true);
            boolean z4 = r14.A02().A06;
            ListView listView = this.A08;
            if (z4) {
                listView.setVerticalScrollbarPosition(1);
                this.A08.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0);
            } else {
                listView.setVerticalScrollbarPosition(2);
                this.A08.setPadding(getResources().getDimensionPixelSize(R.dimen.contact_list_padding_left), 0, getResources().getDimensionPixelSize(R.dimen.contact_list_padding_right), 0);
            }
            this.A08.setOnItemClickListener(new AnonymousClass2GG(this));
            if (!(this instanceof GroupCallParticipantPicker)) {
                dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height);
            } else {
                dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.selected_contacts_layout_height_big);
            }
            this.A01 = dimensionPixelSize2;
            View findViewById = findViewById(R.id.selected_list);
            this.A05 = findViewById;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams2.height = this.A01;
            this.A05.setLayoutParams(layoutParams2);
            this.A05.setVisibility(4);
            this.A0B = (WaImageButton) findViewById(R.id.selected_list_action_fab_1);
            this.A0C = (WaImageButton) findViewById(R.id.selected_list_action_fab_2);
            if (!z2) {
                this.A0B.setVisibility(8);
                this.A0C.setVisibility(8);
            } else {
                this.A0B.setVisibility(0);
                this.A0C.setVisibility(0);
                WaImageButton waImageButton = this.A0B;
                if (!(this instanceof GroupCallParticipantPicker)) {
                    A0b2 = null;
                } else {
                    A0b2 = C002001d.A0b(this, R.drawable.ic_groupcall_voice, R.color.voipGroupCallPickerButtonTint);
                }
                waImageButton.setImageDrawable(A0b2);
                WaImageButton waImageButton2 = this.A0C;
                if (!(this instanceof GroupCallParticipantPicker)) {
                    A0b3 = null;
                } else {
                    A0b3 = C002001d.A0b(this, R.drawable.ic_groupcall_video, R.color.voipGroupCallPickerButtonTint);
                }
                waImageButton2.setImageDrawable(A0b3);
                WaImageButton waImageButton3 = this.A0B;
                if (!(this instanceof GroupCallParticipantPicker)) {
                    i3 = 0;
                } else {
                    i3 = R.string.audio_call;
                }
                waImageButton3.setContentDescription(r14.A06(i3));
                WaImageButton waImageButton4 = this.A0C;
                if (!(this instanceof GroupCallParticipantPicker)) {
                    i4 = 0;
                } else {
                    i4 = R.string.video_call;
                }
                waImageButton4.setContentDescription(r14.A06(i4));
                this.A0B.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 47));
                this.A0C.setOnClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 48));
                AnonymousClass0SE.A07(r14, this.A0B, 0, dimensionPixelSize4, -this.A00, dimensionPixelSize4);
                AnonymousClass0SE.A07(r14, this.A0C, 0, dimensionPixelSize4, -this.A00, dimensionPixelSize4);
                this.A09.postDelayed(new RunnableEBaseShape2S0100000_I0_2(this, 25), 200);
            }
            this.A07 = (ViewGroup) findViewById(R.id.warning);
            if (!(this instanceof GroupCallParticipantPicker)) {
                view = null;
            } else {
                GroupCallParticipantPicker groupCallParticipantPicker = (GroupCallParticipantPicker) this;
                if (!(groupCallParticipantPicker instanceof GroupCallParticipantPickerSheet)) {
                    view = null;
                    if (C002001d.A3L(((ActivityC004702f) groupCallParticipantPicker).A0G)) {
                        view = groupCallParticipantPicker.getLayoutInflater().inflate(R.layout.group_call_participant_picker_joinable_warning, (ViewGroup) null);
                        TextView textView = (TextView) view.findViewById(R.id.group_participant_warning_text);
                        Spanned fromHtml = Html.fromHtml(((AnonymousClass2C0) groupCallParticipantPicker).A01.A0A(R.plurals.voip_joinable_new_group_call_warning, (long) 7, 7));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
                        URLSpan[] uRLSpanArr = (URLSpan[]) fromHtml.getSpans(0, fromHtml.length(), URLSpan.class);
                        if (uRLSpanArr != null) {
                            for (URLSpan uRLSpan : uRLSpanArr) {
                                if ("learn_more_link".equals(uRLSpan.getURL())) {
                                    Log.i("GroupCallParticipantPicker/getCustomWarningLayout/learn_more_link link found");
                                    int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                                    int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                                    int spanFlags = spannableStringBuilder.getSpanFlags(uRLSpan);
                                    spannableStringBuilder.removeSpan(uRLSpan);
                                    spannableStringBuilder.setSpan(new C74333af(groupCallParticipantPicker, groupCallParticipantPicker), spanStart, spanEnd, spanFlags);
                                }
                            }
                        }
                        textView.setText(spannableStringBuilder);
                        textView.setMovementMethod(new C05710Pt());
                    }
                } else {
                    view = null;
                }
            }
            if (view != null) {
                this.A0N = true;
                this.A07.removeAllViews();
                this.A07.addView(view);
            } else {
                if (!(this instanceof ListMembersSelector)) {
                    A0D2 = "";
                } else {
                    ListMembersSelector listMembersSelector = (ListMembersSelector) this;
                    AnonymousClass01I r0 = listMembersSelector.A00;
                    r0.A04();
                    Me me = r0.A00;
                    AnonymousClass01X r5 = ((AnonymousClass2C0) listMembersSelector).A01;
                    String str = me.cc;
                    A0D2 = r5.A0D(R.string.broadcast_to_recipients_note, r5.A0F(AnonymousClass0JE.A0C(str, me.jabber_id.substring(str.length()))).replace(' ', (char) 160));
                }
                this.A0N = !TextUtils.isEmpty(A0D2);
                ((TextView) findViewById(R.id.warning_text)).setText(A0D2);
            }
            A0e();
            AnonymousClass2GV r02 = new AnonymousClass2GV(this, this, this.A0a);
            this.A0F = r02;
            A0U(r02);
            View findViewById2 = findViewById(R.id.next_btn);
            if (findViewById2 != null) {
                FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById2;
                this.A0D = floatingActionButton;
                if (!(this instanceof GroupCallParticipantPicker)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (!(this instanceof GroupCallParticipantPicker)) {
                        drawable = !(this instanceof NotifyContactsSelector) ? !(this instanceof GroupMembersSelector) ? !(this instanceof EditGroupAdminsSelector) ? !(this instanceof ListMembersSelector) ? !(this instanceof AddGroupParticipantsSelector) ? C004302a.A03(this, R.drawable.ic_fab_check) : C004302a.A03(this, R.drawable.ic_fab_check) : C004302a.A03(this, R.drawable.ic_fab_check) : C004302a.A03(this, R.drawable.ic_fab_check) : new C06470Tj(((AnonymousClass2C0) this).A01, C004302a.A03(this, R.drawable.ic_fab_next)) : C004302a.A03(this, R.drawable.ic_fab_check);
                    } else {
                        drawable = null;
                    }
                    floatingActionButton.setImageDrawable(drawable);
                    FloatingActionButton floatingActionButton2 = this.A0D;
                    if (!(this instanceof GroupCallParticipantPicker)) {
                        i5 = !(this instanceof NotifyContactsSelector) ? !(this instanceof GroupMembersSelector) ? !(this instanceof EditGroupAdminsSelector) ? !(this instanceof ListMembersSelector) ? !(this instanceof AddGroupParticipantsSelector) ? R.string.done : R.string.done : R.string.create : R.string.done : R.string.next : R.string.done;
                    } else {
                        i5 = 0;
                    }
                    floatingActionButton2.setContentDescription(r14.A06(i5));
                    this.A0D.setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 11));
                }
                ((EmptyTellAFriendView) findViewById(R.id.contacts_empty)).setInviteButtonClickListener(new ViewOnClickEBaseShape0S0100000_I0_0(this, 46));
                findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape10S0100000_I0(this, 12));
                registerForContextMenu(this.A08);
                A0d();
                return;
            }
            throw null;
        }
        throw null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C007003k r5 = (C007003k) A0T().getItemAtPosition(((AdapterView.AdapterContextMenuInfo) contextMenuInfo).position);
        if (this.A0O.A0H((UserJid) r5.A02(UserJid.class))) {
            super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            contextMenu.add(0, 0, 0, ((AnonymousClass2C0) this).A01.A0D(R.string.block_list_menu_unblock, this.A0U.A08(r5, false)));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, R.id.menuitem_search, 0, ((AnonymousClass2C0) this).A01.A06(R.string.search)).setIcon(R.drawable.ic_action_search);
        this.A04 = icon;
        icon.setShowAsAction(2);
        this.A04.setVisible(!this.A0K.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A0K.clear();
        this.A0a.clear();
        AnonymousClass0YX r0 = this.A0E;
        if (r0 != null) {
            r0.A00();
            this.A0E = null;
        }
        C10900fO r02 = this.A0H;
        if (r02 != null) {
            ((AnonymousClass0JW) r02).A00.cancel(true);
            this.A0H = null;
        }
        C10910fP r03 = this.A0G;
        if (r03 != null) {
            ((AnonymousClass0JW) r03).A00.cancel(true);
            this.A0G = null;
        }
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

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onPause() {
        super.onPause();
        this.A0T.A00(this.A0S);
    }

    @Override // X.ActivityC03630Ha
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A0A.A02(bundle);
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A0T.A01(this.A0S);
        this.A0F.notifyDataSetChanged();
    }

    @Override // X.ActivityC004802g, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        List<C007003k> list = this.A0b;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C007003k r1 : list) {
                arrayList.add(r1.A02(UserJid.class));
            }
            bundle.putStringArrayList("selected_jids", AnonymousClass1VY.A0F(arrayList));
        }
        this.A0A.A03(bundle);
    }

    public boolean onSearchRequested() {
        this.A0A.A01();
        return false;
    }
}
