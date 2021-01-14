package com.whatsapp.chatinfo;

import X.AbstractC000400g;
import X.AbstractC658531u;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass0A8;
import X.AnonymousClass0AC;
import X.AnonymousClass0BP;
import X.AnonymousClass0EO;
import X.AnonymousClass0EP;
import X.AnonymousClass0Eg;
import X.AnonymousClass0HN;
import X.AnonymousClass0IA;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0OP;
import X.AnonymousClass0Q7;
import X.AnonymousClass0TX;
import X.AnonymousClass0YX;
import X.AnonymousClass1M5;
import X.AnonymousClass1VY;
import X.AnonymousClass2UT;
import X.AnonymousClass2XF;
import X.AnonymousClass2XG;
import X.AnonymousClass2XH;
import X.AnonymousClass2d6;
import X.AnonymousClass31y;
import X.AnonymousClass325;
import X.C002001d;
import X.C004302a;
import X.C006803i;
import X.C007003k;
import X.C014308b;
import X.C02360Br;
import X.C02590Cr;
import X.C02600Cs;
import X.C03930Ii;
import X.C04360Kb;
import X.C05340Od;
import X.C06170Sb;
import X.C06470Tj;
import X.C09060cE;
import X.C09110cJ;
import X.C12420i4;
import X.C28051Sr;
import X.C41111uU;
import X.C46712En;
import X.C46792Ex;
import X.C46802Ey;
import X.C46812Ez;
import X.C49352Qd;
import X.C51002Wy;
import X.C51012Wz;
import X.C53492dM;
import X.C58782mW;
import X.DialogInterface$OnClickListenerC46682Ek;
import X.DialogInterface$OnClickListenerC46692El;
import X.DialogInterface$OnClickListenerC46702Em;
import X.ViewTreeObserver$OnGlobalLayoutListenerC46672Ej;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.EditBroadcastRecipientsSelector;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListChatInfo extends ChatInfoActivity {
    public View A00;
    public ListView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public ChatInfoLayout A05;
    public C46802Ey A06;
    public C58782mW A07;
    public AnonymousClass0YX A08;
    public C007003k A09;
    public C007003k A0A;
    public C09110cJ A0B;
    public final AnonymousClass01I A0C = AnonymousClass01I.A00();
    public final C04360Kb A0D = C04360Kb.A00();
    public final AnonymousClass01A A0E = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0F = new AnonymousClass2XF(this);
    public final AnonymousClass08B A0G = AnonymousClass08B.A00;
    public final C014308b A0H = C014308b.A00();
    public final AnonymousClass0L2 A0I = AnonymousClass0L2.A01();
    public final AnonymousClass0HN A0J = AnonymousClass0HN.A00();
    public final AnonymousClass03S A0K = AnonymousClass03S.A00();
    public final AnonymousClass0A8 A0L = AnonymousClass0A8.A00;
    public final AnonymousClass0EP A0M = AnonymousClass0EP.A00();
    public final AnonymousClass01T A0N = AnonymousClass01T.A00();
    public final AnonymousClass019 A0O = new AnonymousClass2XG(this);
    public final AnonymousClass0AC A0P = AnonymousClass0AC.A00;
    public final C03930Ii A0Q = C03930Ii.A00();
    public final C53492dM A0R = C53492dM.A00();
    public final AnonymousClass00Y A0S = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A0T = AnonymousClass0Eg.A00();
    public final AnonymousClass0EO A0U = AnonymousClass0EO.A00();
    public final AnonymousClass0IA A0V = AnonymousClass0IA.A00();
    public final C02360Br A0W = C02360Br.A00();
    public final AnonymousClass022 A0X = AnonymousClass022.A00();
    public final AbstractC658531u A0Y = AbstractC658531u.A00();
    public final AnonymousClass31y A0Z = AnonymousClass31y.A00();
    public final AnonymousClass325 A0a = AnonymousClass325.A00();
    public final C09060cE A0b = C09060cE.A01();
    public final ArrayList A0c = new ArrayList();

    public static void A04(C007003k r3, Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, ListChatInfo.class);
        intent.putExtra("gid", AnonymousClass1VY.A0D(r3.A09));
        intent.putExtra("circular_transition", true);
        activity.startActivity(intent, bundle);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void A0b(long j) {
        super.A0b(j);
        View findViewById = findViewById(R.id.actions_card);
        int i = 0;
        if (j == 0) {
            i = 8;
        }
        findViewById.setVisibility(i);
        A0i();
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void A0f(ArrayList arrayList) {
        super.A0f(arrayList);
        if (arrayList == null || arrayList.isEmpty()) {
            findViewById(R.id.header_bottom_shadow).setVisibility(0);
        } else {
            findViewById(R.id.header_bottom_shadow).setVisibility(8);
        }
    }

    public AnonymousClass0OP A0g() {
        Jid A022 = this.A09.A02(AnonymousClass0OP.class);
        StringBuilder A0S2 = AnonymousClass008.A0S("jid is not broadcast jid: ");
        A0S2.append(this.A09.A02(AnonymousClass0OP.class));
        AnonymousClass00E.A04(A022, A0S2.toString());
        return (AnonymousClass0OP) A022;
    }

    public final void A0h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.A0c.iterator();
        while (it.hasNext()) {
            arrayList.add(((C007003k) it.next()).A02(UserJid.class));
        }
        Intent intent = new Intent(this, EditBroadcastRecipientsSelector.class);
        intent.putExtra("selected", AnonymousClass1VY.A0F(arrayList));
        startActivityForResult(intent, 12);
    }

    public final void A0i() {
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.starred_messages_separator).setVisibility(8);
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.participants_search).setVisibility(8);
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.mute_layout).setVisibility(8);
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.notifications_layout).setVisibility(8);
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.notifications_separator).setVisibility(8);
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.media_visibility_layout).setVisibility(8);
        AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.media_visibility_separator).setVisibility(8);
    }

    public final void A0j() {
        ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.encryption_info_view);
        listItemWithRightIcon.setDescription(((ChatInfoActivity) this).A0A.A06(R.string.group_info_encrypted));
        listItemWithRightIcon.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 47));
        listItemWithRightIcon.setVisibility(0);
    }

    public final void A0k() {
        long A042 = C006803i.A04(this.A09.A0J, Long.MIN_VALUE);
        int i = (A042 > Long.MIN_VALUE ? 1 : (A042 == Long.MIN_VALUE ? 0 : -1));
        TextView textView = this.A02;
        if (i == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(C002001d.A1d(((ChatInfoActivity) this).A0A, A042, R.string.group_creation_time_today, R.string.group_creation_time_yesterday, R.string.group_creation_time, new Object[0]));
            this.A02.setVisibility(0);
        }
        C58782mW r0 = this.A07;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        A0Y();
        A0O(true);
        C58782mW r2 = new C58782mW(this, this.A09);
        this.A07 = r2;
        ((ChatInfoActivity) this).A0H.ANC(r2, new Void[0]);
    }

    public final void A0l() {
        if (TextUtils.isEmpty(this.A09.A0F)) {
            ChatInfoLayout chatInfoLayout = this.A05;
            AnonymousClass01X r7 = ((ChatInfoActivity) this).A0A;
            ArrayList arrayList = this.A0c;
            chatInfoLayout.setTitleText(r7.A0A(R.plurals.broadcast_n_recipients, (long) arrayList.size(), Integer.valueOf(arrayList.size())));
            return;
        }
        this.A05.setTitleText(this.A0H.A08(this.A09, false));
    }

    public final void A0m() {
        TextView textView = this.A04;
        AnonymousClass01X r7 = ((ChatInfoActivity) this).A0A;
        ArrayList arrayList = this.A0c;
        textView.setText(r7.A0A(R.plurals.recipients_title, (long) arrayList.size(), Integer.valueOf(arrayList.size())));
        A0n();
        Collections.sort(arrayList, new C49352Qd(this.A0C, this.A0H));
        this.A06.notifyDataSetChanged();
        A0l();
    }

    public final void A0n() {
        int A062 = ((ActivityC004702f) this).A0G.A06(AbstractC000400g.A2u);
        ArrayList arrayList = this.A0c;
        if (arrayList.size() <= (A062 * 9) / 10 || A062 == 0) {
            this.A03.setVisibility(8);
            return;
        }
        this.A03.setVisibility(0);
        this.A03.setText(((ChatInfoActivity) this).A0A.A0D(R.string.participants_count, Integer.valueOf(arrayList.size()), Integer.valueOf(A062)));
    }

    public final void A0o(boolean z) {
        C007003k r5 = this.A0A;
        boolean z2 = false;
        if (r5 == null) {
            ((ActivityC004702f) this).A0F.A06(R.string.group_add_contact_failed, 0);
            return;
        }
        C09060cE r3 = this.A0b;
        String str = null;
        if (r3 != null) {
            String A002 = C12420i4.A00(r5);
            if (r5.A08()) {
                if (r3.A00 != null) {
                    str = r5.A04();
                    z2 = true;
                } else {
                    throw null;
                }
            }
            try {
                startActivityForResult(C09060cE.A00(A002, str, z, z2), 10);
                this.A0B.A02(z, 9);
            } catch (ActivityNotFoundException unused) {
                C002001d.A2O(this, 4);
            }
        } else {
            throw null;
        }
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void finishAfterTransition() {
        if (AnonymousClass2UT.A00) {
            this.A00.setTransitionName(null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A00);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A01);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public /* synthetic */ void lambda$onCreate$1806$ListChatInfo(View view) {
        A0h();
    }

    public /* synthetic */ void lambda$onCreate$1808$ListChatInfo(View view) {
        C002001d.A2O(this, 3);
    }

    public /* synthetic */ void lambda$onCreate$1809$ListChatInfo(View view) {
        C002001d.A2O(this, 2);
    }

    public /* synthetic */ void lambda$onCreate$1810$ListChatInfo(View view) {
        startActivity(new Intent(this, StarredMessagesActivity.class).putExtra("jid", A0g().getRawString()));
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 10:
            case 11:
                this.A0J.A06();
                this.A0B.A00();
                return;
            case 12:
                if (i2 == -1) {
                    List A0G2 = AnonymousClass1VY.A0G(UserJid.class, intent.getStringArrayListExtra("contacts"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = this.A0c;
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((C007003k) it.next()).A02(UserJid.class));
                    }
                    AbstractCollection abstractCollection = (AbstractCollection) A0G2;
                    Iterator it2 = abstractCollection.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (!hashSet.contains(next)) {
                            arrayList.add(next);
                        }
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        Jid A022 = ((C007003k) it3.next()).A02(UserJid.class);
                        if (!abstractCollection.contains(A022)) {
                            arrayList2.add(A022);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        AnonymousClass0EO r9 = this.A0U;
                        AnonymousClass0OP A0g = A0g();
                        if (r9 != null) {
                            AnonymousClass00E.A05(arrayList);
                            C05340Od A012 = r9.A0T.A01(A0g);
                            ArrayList arrayList4 = new ArrayList(arrayList.size());
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                UserJid userJid = (UserJid) it4.next();
                                arrayList4.add(new AnonymousClass1M5(userJid, C05340Od.A01(r9.A0W.A06(userJid)), 0, false));
                            }
                            A012.A08(arrayList4);
                            r9.A0C.A05.remove(A0g);
                            if (arrayList.size() == 1) {
                                AnonymousClass0EO.A02(2, r9.A0f.A07(null, A0g, r9.A0G.A05(), 4, (UserJid) arrayList.get(0)));
                            } else {
                                AnonymousClass0EO.A02(2, r9.A0f.A08(null, A0g, r9.A0G.A05(), 12, null, arrayList, A012, 0));
                            }
                            Iterator it5 = arrayList.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(this.A0E.A0A((AnonymousClass02N) it5.next()));
                            }
                        } else {
                            throw null;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        this.A0U.A0D(A0g(), arrayList2);
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            arrayList3.remove(this.A0E.A0A((AnonymousClass02N) it6.next()));
                        }
                    }
                    this.A0W.A04(A0g(), false);
                    A0m();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        C007003k r1 = ((C46812Ez) ((AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo()).targetView.getTag()).A03;
        this.A0A = r1;
        int itemId = menuItem.getItemId();
        if (itemId != 0) {
            if (itemId == 1) {
                startActivity(Conversation.A04(this, r1));
                return true;
            } else if (itemId == 2) {
                A0o(true);
                return true;
            } else if (itemId == 3) {
                A0o(false);
                return true;
            } else if (itemId == 5) {
                C002001d.A2O(this, 6);
                return true;
            } else if (itemId != 6) {
                return false;
            } else {
                Intent intent = new Intent(this, IdentityVerificationActivity.class);
                intent.putExtra("jid", AnonymousClass1VY.A0D(this.A0A.A02(UserJid.class)));
                startActivity(intent);
                return true;
            }
        } else if (r1.A08 == null) {
            return true;
        } else {
            ContactInfoActivity.A07(r1, this, null);
            return true;
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        UserJid nullable;
        A0A().A0H(5);
        super.onCreate(bundle);
        this.A0B = new C09110cJ(this.A0S, ((ActivityC004702f) this).A0G, ((ActivityC004702f) this).A0I, this.A0K);
        this.A08 = this.A0I.A03(this);
        AnonymousClass0TX.A0C(this);
        AnonymousClass01X r9 = ((ChatInfoActivity) this).A0A;
        setTitle(r9.A06(R.string.list_info));
        setContentView(R.layout.groupchat_info);
        this.A05 = (ChatInfoLayout) findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.A09();
        A0C(toolbar);
        A09().A0A(true);
        toolbar.setNavigationIcon(new C06470Tj(r9, C004302a.A03(this, R.drawable.ic_back_shadow)));
        this.A01 = A0T();
        View inflate = getLayoutInflater().inflate(R.layout.groupchat_info_header, (ViewGroup) this.A01, false);
        AnonymousClass0Q7.A0W(inflate, 2);
        this.A01.addHeaderView(inflate, null, false);
        this.A00 = findViewById(R.id.header);
        this.A05.A01();
        this.A05.setColor(C004302a.A00(this, R.color.primary));
        this.A05.A03(getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        View inflate2 = getLayoutInflater().inflate(R.layout.groupchat_info_footer, (ViewGroup) this.A01, false);
        this.A01.addFooterView(inflate2, null, false);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setVisibility(4);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        linearLayout.setPadding(0, 0, 0, point.y);
        this.A01.addFooterView(linearLayout, null, false);
        AnonymousClass0OP A022 = AnonymousClass0OP.A02(getIntent().getStringExtra("gid"));
        if (A022 == null) {
            Log.e("list_chat_info/on_create: exiting due to null listChat jid object");
            finish();
            return;
        }
        AnonymousClass01A r6 = this.A0E;
        this.A09 = r6.A0A(A022);
        ArrayList arrayList = this.A0c;
        this.A06 = new C46802Ey(this, this, arrayList);
        this.A00 = findViewById(R.id.header);
        this.A01.setOnScrollListener(new C46792Ex(this));
        this.A01.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC46672Ej(this));
        this.A01.setOnItemClickListener(new C46712En(this));
        StringBuilder sb = new StringBuilder("list_chat_info/");
        sb.append(this.A09.toString());
        Log.d(sb.toString());
        View findViewById = findViewById(R.id.add_participant_layout);
        ((TextView) findViewById.findViewById(R.id.add_participant_text)).setText(r9.A06(R.string.edit_broadcast_recipients));
        findViewById.findViewById(R.id.invite_via_link_button).setVisibility(8);
        findViewById.findViewById(R.id.invite_via_link_separator).setVisibility(8);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 39));
        A0i();
        this.A02 = (TextView) findViewById(R.id.conversation_contact_status);
        C51012Wz r1 = new C51012Wz(this);
        MediaCard mediaCard = (MediaCard) findViewById(R.id.media_card_view);
        mediaCard.setSeeMoreClickListener(r1);
        mediaCard.setTopShadowVisibility(8);
        this.A01.setAdapter((ListAdapter) this.A06);
        registerForContextMenu(this.A01);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("list_chat_info/");
        sb2.append(this.A09.toString());
        Log.d(sb2.toString());
        findViewById(R.id.change_subject_btn).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 41));
        TextView textView = (TextView) findViewById(R.id.participants_title);
        this.A04 = textView;
        textView.setText(r9.A0A(R.plurals.recipients_title, (long) arrayList.size(), Integer.valueOf(arrayList.size())));
        this.A03 = (TextView) findViewById(R.id.participants_info);
        A0n();
        A0Z(R.drawable.avatar_broadcast_large, R.color.avatar_broadcast_large);
        ((TextView) findViewById(R.id.exit_group_text)).setText(r9.A06(R.string.delete_list));
        ((ImageView) findViewById(R.id.exit_group_icon)).setImageResource(R.drawable.ic_action_delete);
        View findViewById2 = findViewById(R.id.exit_group_btn);
        findViewById2.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 40));
        AnonymousClass0Q7.A0d(findViewById2, new C41111uU());
        findViewById(R.id.report_group).setVisibility(8);
        HashSet A023 = this.A0N.A01(A0g()).A03().A02();
        AnonymousClass01I r0 = this.A0C;
        r0.A04();
        A023.remove(r0.A03);
        Iterator it = A023.iterator();
        while (it.hasNext()) {
            C007003k A0A2 = r6.A0A((AnonymousClass02N) it.next());
            if (!arrayList.contains(A0A2)) {
                arrayList.add(A0A2);
            }
        }
        A0l();
        A0k();
        A0m();
        A0j();
        findViewById(R.id.starred_messages_layout).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 42));
        this.A0G.A01(this.A0F);
        this.A0P.A01(this.A0O);
        if (!(bundle == null || (nullable = UserJid.getNullable(bundle.getString("selected_jid"))) == null)) {
            this.A0A = r6.A0A(nullable);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            if (getIntent().getBooleanExtra("circular_transition", false)) {
                this.A00.setTransitionName(((ChatInfoActivity) this).A06.A01(R.string.transition_photo));
            } else {
                findViewById(R.id.picture).setTransitionName(((ChatInfoActivity) this).A06.A01(R.string.transition_photo));
            }
        }
        this.A05.A04(inflate, inflate2, linearLayout, this.A06);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        C007003k r2 = ((C46812Ez) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A03;
        if (r2 != null) {
            String A042 = this.A0H.A04(r2);
            AnonymousClass01X r4 = ((ChatInfoActivity) this).A0A;
            contextMenu.add(0, 1, 0, r4.A0D(R.string.message_contact_name, A042));
            if (r2.A08 == null) {
                contextMenu.add(0, 2, 0, r4.A06(R.string.add_contact));
                contextMenu.add(0, 3, 0, r4.A06(R.string.add_exist));
            } else {
                contextMenu.add(0, 0, 0, r4.A0D(R.string.view_contact_name, A042));
            }
            if (this.A0c.size() > 2) {
                contextMenu.add(0, 5, 0, r4.A0D(R.string.remove_contact_name_from_list, A042));
            }
            contextMenu.add(0, 6, 0, r4.A06(R.string.verify_identity));
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        AnonymousClass01X r9;
        String A0D2;
        if (i == 2) {
            C014308b r3 = this.A0H;
            if (TextUtils.isEmpty(r3.A08(this.A09, false))) {
                r9 = ((ChatInfoActivity) this).A0A;
                A0D2 = r9.A06(R.string.delete_list_unnamed_dialog_title);
            } else {
                r9 = ((ChatInfoActivity) this).A0A;
                A0D2 = r9.A0D(R.string.delete_list_dialog_title, r3.A08(this.A09, false));
            }
            return C28051Sr.A0Y(this, super.A0M, r9, super.A0J, new AnonymousClass2XH(this), A0D2, false, R.string.delete, 1).A00();
        } else if (i == 3) {
            C51002Wy r0 = new C51002Wy(this);
            AnonymousClass0Eg r8 = this.A0T;
            AnonymousClass02M r92 = ((ActivityC004702f) this).A0F;
            C06170Sb r10 = ((ActivityC004602e) this).A0H;
            C02590Cr r11 = super.A0M;
            C02600Cs r12 = super.A0L;
            C03930Ii r13 = this.A0Q;
            AnonymousClass03P r14 = ((ActivityC004702f) this).A0I;
            AnonymousClass01X r15 = ((ChatInfoActivity) this).A0A;
            C53492dM r4 = this.A0R;
            AnonymousClass00D r32 = super.A0J;
            AnonymousClass022 r2 = this.A0X;
            C007003k A082 = this.A0E.A08(A0g());
            if (A082 != null) {
                return new AnonymousClass2d6(this, r8, r92, r10, r11, r12, r13, r14, r15, r4, r32, r2, 3, R.string.edit_list_name_dialog_title, A082.A0F, r0, ((ActivityC004702f) this).A0G.A06(AbstractC000400g.A40), 0, 0, 16385);
            }
            throw null;
        } else if (i == 4) {
            Log.w("listchatinfo/add existing contact: activity not found, probably tablet");
            AnonymousClass0MB r33 = new AnonymousClass0MB(this);
            AnonymousClass01X r22 = ((ChatInfoActivity) this).A0A;
            r33.A01.A0E = r22.A06(R.string.activity_not_found);
            r33.A07(r22.A06(R.string.ok), new DialogInterface$OnClickListenerC46682Ek(this));
            return r33.A00();
        } else if (i != 6) {
            return super.onCreateDialog(i);
        } else {
            C007003k r6 = this.A0A;
            if (r6 == null) {
                return super.onCreateDialog(i);
            }
            AnonymousClass01X r34 = ((ChatInfoActivity) this).A0A;
            String A0D3 = r34.A0D(R.string.remove_recipient_dialog_title, this.A0H.A08(r6, false));
            AnonymousClass0MB r23 = new AnonymousClass0MB(this);
            CharSequence A1J = C002001d.A1J(A0D3, this, super.A0M);
            AnonymousClass0MC r02 = r23.A01;
            r02.A0E = A1J;
            r02.A0J = true;
            r23.A05(r34.A06(R.string.cancel), new DialogInterface$OnClickListenerC46692El(this));
            r23.A07(r34.A06(R.string.ok), new DialogInterface$OnClickListenerC46702Em(this));
            return r23.A00();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, ((ChatInfoActivity) this).A0A.A06(R.string.add_broadcast_recipient)).setIcon(R.drawable.ic_action_add_person_shadow).setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        this.A08.A00();
        this.A0G.A00(this.A0F);
        this.A0P.A00(this.A0O);
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 1) {
            if (itemId != 2) {
                if (itemId != 16908332) {
                    return super.onOptionsItemSelected(menuItem);
                }
                AnonymousClass0TX.A0B(this);
            }
            return true;
        }
        A0h();
        return true;
    }

    @Override // X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C007003k r0 = this.A0A;
        if (r0 != null) {
            bundle.putString("selected_jid", AnonymousClass1VY.A0D(r0.A09));
        }
    }
}
