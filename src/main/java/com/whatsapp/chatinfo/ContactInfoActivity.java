package com.whatsapp.chatinfo;

import X.AbstractC658931z;
import X.AbstractView$OnClickListenerC08330av;
import X.ActivityC004702f;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01J;
import X.AnonymousClass01P;
import X.AnonymousClass01S;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass03S;
import X.AnonymousClass08B;
import X.AnonymousClass09V;
import X.AnonymousClass0A8;
import X.AnonymousClass0AC;
import X.AnonymousClass0AQ;
import X.AnonymousClass0BB;
import X.AnonymousClass0BG;
import X.AnonymousClass0BP;
import X.AnonymousClass0BR;
import X.AnonymousClass0CC;
import X.AnonymousClass0CO;
import X.AnonymousClass0ED;
import X.AnonymousClass0EF;
import X.AnonymousClass0ES;
import X.AnonymousClass0GG;
import X.AnonymousClass0HK;
import X.AnonymousClass0HN;
import X.AnonymousClass0I5;
import X.AnonymousClass0L2;
import X.AnonymousClass0Q7;
import X.AnonymousClass0S2;
import X.AnonymousClass0TX;
import X.AnonymousClass0YX;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass2UT;
import X.AnonymousClass2X7;
import X.AnonymousClass2X9;
import X.AnonymousClass2XA;
import X.AnonymousClass2XB;
import X.AnonymousClass2XC;
import X.AnonymousClass2XD;
import X.AnonymousClass31y;
import X.AnonymousClass325;
import X.AnonymousClass36W;
import X.C004302a;
import X.C006803i;
import X.C006903j;
import X.C007003k;
import X.C014308b;
import X.C016909b;
import X.C017009c;
import X.C02770Dj;
import X.C03490Gl;
import X.C04360Kb;
import X.C06470Tj;
import X.C09050cD;
import X.C09060cE;
import X.C09110cJ;
import X.C09200cS;
import X.C41721vX;
import X.C41741vZ;
import X.C46642Eg;
import X.C46652Eh;
import X.C46762Eu;
import X.C50992Wx;
import X.C58772mV;
import X.C71433Oy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickEBaseShape1S0101000_I1;
import com.facebook.redex.ViewOnClickEBaseShape4S0100000_I1_2;
import com.google.android.search.verification.client.R;
import com.whatsapp.ChatMediaVisibilityDialog;
import com.whatsapp.Conversation;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.SettingsJidNotificationActivity;
import com.whatsapp.ViewProfilePhoto;
import com.whatsapp.biz.catalog.CatalogMediaCard;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape11S0100000_I1_0;
import java.util.AbstractCollection;
import java.util.List;
import java.util.UnknownFormatConversionException;

public class ContactInfoActivity extends ChatInfoActivity {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public ImageView A07;
    public LinearLayout A08;
    public ListView A09;
    public TextView A0A;
    public C41741vZ A0B;
    public ChatInfoLayout A0C;
    public C46762Eu A0D;
    public C58772mV A0E;
    public AnonymousClass0YX A0F;
    public C007003k A0G;
    public MediaCard A0H;
    public C09110cJ A0I;
    public AnonymousClass36W A0J;
    public CharSequence A0K;
    public final Handler A0L;
    public final CompoundButton.OnCheckedChangeListener A0M;
    public final AnonymousClass0GG A0N;
    public final C09050cD A0O = C09050cD.A00();
    public final AnonymousClass0CO A0P;
    public final AnonymousClass01I A0Q = AnonymousClass01I.A00();
    public final C03490Gl A0R = C03490Gl.A00();
    public final AnonymousClass0I5 A0S;
    public final AnonymousClass0ES A0T;
    public final C04360Kb A0U = C04360Kb.A00();
    public final AnonymousClass01J A0V = AnonymousClass01J.A00();
    public final C017009c A0W;
    public final AnonymousClass01A A0X = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0Y;
    public final AnonymousClass08B A0Z;
    public final C014308b A0a;
    public final AnonymousClass0L2 A0b = AnonymousClass0L2.A01();
    public final AnonymousClass0HK A0c;
    public final AnonymousClass0HN A0d;
    public final AnonymousClass00S A0e = AnonymousClass00S.A00();
    public final AnonymousClass00G A0f = AnonymousClass00G.A01;
    public final AnonymousClass03S A0g;
    public final AnonymousClass09V A0h;
    public final C006903j A0i = C006903j.A00();
    public final AnonymousClass0AQ A0j;
    public final AnonymousClass0BR A0k;
    public final AnonymousClass0A8 A0l;
    public final AnonymousClass019 A0m;
    public final AnonymousClass0AC A0n;
    public final C016909b A0o;
    public final AnonymousClass01P A0p;
    public final AnonymousClass0CC A0q;
    public final AnonymousClass00Y A0r = AnonymousClass00Y.A00();
    public final AnonymousClass0ED A0s;
    public final AnonymousClass0EF A0t;
    public final AnonymousClass01S A0u;
    public final C02770Dj A0v = C02770Dj.A00();
    public final AnonymousClass0BB A0w;
    public final C71433Oy A0x;
    public final AnonymousClass31y A0y;
    public final AbstractC658931z A0z = AbstractC658931z.A00();
    public final AnonymousClass325 A10 = AnonymousClass325.A00();
    public final C09060cE A11;
    public final AbstractView$OnClickListenerC08330av A12 = new ViewOnClickCListenerShape11S0100000_I1_0(this, 44);
    public final C09200cS A13 = C09200cS.A00();
    public final Runnable A14;

    public ContactInfoActivity() {
        if (C71433Oy.A00 == null) {
            synchronized (C71433Oy.class) {
                if (C71433Oy.A00 == null) {
                    C71433Oy.A00 = new C71433Oy();
                }
            }
        }
        this.A0x = C71433Oy.A00;
        this.A0a = C014308b.A00();
        this.A0S = AnonymousClass0I5.A00();
        this.A0N = AnonymousClass0GG.A00();
        this.A0P = AnonymousClass0CO.A00();
        this.A0y = AnonymousClass31y.A00();
        this.A0w = AnonymousClass0BB.A00();
        this.A0o = C016909b.A00();
        this.A11 = C09060cE.A01();
        this.A0h = AnonymousClass09V.A00();
        this.A0d = AnonymousClass0HN.A00();
        this.A0T = AnonymousClass0ES.A00();
        this.A0g = AnonymousClass03S.A00();
        this.A0p = AnonymousClass01P.A00();
        this.A0q = AnonymousClass0CC.A00();
        this.A0W = C017009c.A00();
        this.A0u = AnonymousClass01S.A00();
        this.A0c = AnonymousClass0HK.A00();
        this.A0j = AnonymousClass0AQ.A00();
        this.A0M = new C46642Eg(this);
        this.A0l = AnonymousClass0A8.A00;
        this.A0k = new AnonymousClass2X9(this);
        this.A0Z = AnonymousClass08B.A00;
        this.A0Y = new AnonymousClass2XA(this);
        this.A0n = AnonymousClass0AC.A00;
        this.A0m = new AnonymousClass2XB(this);
        this.A0s = new AnonymousClass2XC(this);
        this.A0t = new AnonymousClass2XD(this);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A14 = new RunnableEBaseShape8S0100000_I1_3(this, 23);
    }

    public static Intent A04(UserJid userJid, Context context) {
        Intent intent = new Intent(context, ContactInfoActivity.class);
        intent.putExtra("jid", userJid.getRawString());
        intent.putExtra("circular_transition", true);
        return intent;
    }

    public static void A06(ContactInfoActivity contactInfoActivity, Bitmap bitmap) {
        if (bitmap != null) {
            contactInfoActivity.A0c(bitmap);
            return;
        }
        boolean A0a2 = AnonymousClass1VY.A0a(contactInfoActivity.A0h());
        int i = R.drawable.avatar_contact_large;
        if (A0a2) {
            i = R.drawable.avatar_server_psa_large;
        }
        contactInfoActivity.A0Z(i, R.color.avatar_contact_large);
    }

    public static void A07(C007003k r1, Activity activity, Bundle bundle) {
        Jid A022 = r1.A02(UserJid.class);
        if (A022 != null) {
            activity.startActivity(A04((UserJid) A022, activity), bundle);
            return;
        }
        throw null;
    }

    public final long A0g() {
        long j = this.A0G.A07;
        if (j == 0) {
            return 60000;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.A0e.A06(j);
        if (currentTimeMillis < 60000) {
            return 500;
        }
        return currentTimeMillis < 3600000 ? 5000 : 20000;
    }

    public UserJid A0h() {
        Jid A022 = this.A0G.A02(UserJid.class);
        if (A022 != null) {
            return (UserJid) A022;
        }
        throw null;
    }

    public final void A0i() {
        if (this.A0G != null) {
            TextView textView = (TextView) findViewById(R.id.block_contact_text);
            ImageView imageView = (ImageView) findViewById(R.id.block_contact_icon);
            if (this.A0N.A0H(A0h())) {
                imageView.setColorFilter(C004302a.A00(this, R.color.contactInfoFooterUnblock));
                textView.setTextColor(C004302a.A00(this, R.color.contactInfoFooterUnblock));
                textView.setText(((ChatInfoActivity) this).A0A.A06(R.string.unblock));
                return;
            }
            imageView.setColorFilter(C004302a.A00(this, R.color.red_button_text));
            textView.setTextColor(C004302a.A00(this, R.color.red_button_text));
            textView.setText(((ChatInfoActivity) this).A0A.A06(R.string.block));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        if (r4.A0F(r14.A0G) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e3, code lost:
        if (android.text.TextUtils.isEmpty(r9) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r14.A0G.A0A() == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0j() {
        /*
        // Method dump skipped, instructions count: 841
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ContactInfoActivity.A0j():void");
    }

    public final void A0k() {
        if (this.A0G != null) {
            findViewById(R.id.actions_card).setVisibility(0);
            A0e(this.A0w.A08(A0h()), AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.mute_layout), this.A0M);
        }
    }

    public final void A0l() {
        ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.ephemeral_msg_view);
        if (!((ActivityC004702f) this).A0G.A0C() || this.A0p.A02(A0h())) {
            listItemWithRightIcon.setVisibility(8);
            return;
        }
        int A022 = this.A0i.A02(A0h());
        String A0G2 = C006803i.A0G(((ChatInfoActivity) this).A0A, A022, false);
        listItemWithRightIcon.setVisibility(0);
        listItemWithRightIcon.setOnClickListener(new ViewOnClickEBaseShape1S0101000_I1(this, A022, 3));
        listItemWithRightIcon.setDescription(A0G2);
    }

    public final void A0m() {
        View findViewById = findViewById(R.id.live_location_card);
        if (findViewById != null) {
            View findViewById2 = findViewById(R.id.live_location_info);
            if (findViewById2 != null) {
                TextView textView = (TextView) findViewById2;
                AnonymousClass01S r1 = this.A0u;
                boolean A0e2 = r1.A0e(A0h());
                int size = ((AbstractCollection) r1.A0B(A0h())).size();
                if (size != 0 || A0e2) {
                    findViewById.setVisibility(0);
                    if (!A0e2 || size != 0) {
                        AnonymousClass01X r3 = ((ChatInfoActivity) this).A0A;
                        String A0E2 = r3.A0E(this.A0a.A08(this.A0G, false));
                        if (A0e2) {
                            textView.setText(r3.A0D(R.string.contact_info_live_location_description_you_and_friend_are_sharing, A0E2));
                            return;
                        }
                        textView.setText(r3.A0D(R.string.contact_info_live_location_description_friend_is_sharing, A0E2));
                        return;
                    }
                    textView.setText(((ChatInfoActivity) this).A0A.A06(R.string.contact_info_live_location_description_you_are_sharing));
                    return;
                }
                findViewById.setVisibility(8);
                return;
            }
            throw null;
        }
        throw null;
    }

    public final void A0n() {
        if (this.A0G != null) {
            AnonymousClass0BG A082 = this.A0w.A08(A0h());
            View findViewById = findViewById(R.id.notifications_info);
            int i = 8;
            if (A082.A0H) {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }

    public final void A0o() {
        TextView textView = (TextView) findViewById(R.id.status_info);
        long j = this.A0G.A07;
        if (j != 0) {
            try {
                CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(this.A0e.A06(j), System.currentTimeMillis(), 0, 0);
                if (!TextUtils.equals(this.A0K, relativeTimeSpanString)) {
                    this.A0K = relativeTimeSpanString;
                    textView.setText(relativeTimeSpanString);
                }
            } catch (UnknownFormatConversionException e) {
                Log.e(e);
                textView.setText("");
            }
        } else {
            textView.setText("");
        }
    }

    public final void A0p(List list) {
        C46762Eu r0 = this.A0D;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        if (this.A0D.getCount() == 0) {
            findViewById(R.id.groups_card).setVisibility(8);
            findViewById(R.id.list_bottom_shadow).setVisibility(8);
            return;
        }
        findViewById(R.id.groups_card).setVisibility(0);
        findViewById(R.id.list_bottom_shadow).setVisibility(0);
        ((TextView) findViewById(R.id.groups_info)).setText(((ChatInfoActivity) this).A0A.A0G().format((long) this.A0D.A00.size()));
    }

    public final void A0q(boolean z, boolean z2) {
        AnonymousClass0AQ r2 = this.A0j;
        UserJid nullable = UserJid.getNullable(getIntent().getStringExtra("jid"));
        if (nullable != null) {
            C007003k A022 = r2.A02(nullable);
            this.A0G = A022;
            if (!A022.A08()) {
                View view = this.A00;
                if (view != null) {
                    view.setVisibility(8);
                    this.A0H.setTopShadowVisibility(8);
                    findViewById(R.id.header_bottom_shadow).setVisibility(8);
                    return;
                }
                return;
            }
            if (this.A00 == null) {
                ViewStub viewStub = (ViewStub) this.A04.findViewById(R.id.business_details_card_stub);
                viewStub.setLayoutResource(R.layout.business_details_card);
                View inflate = viewStub.inflate();
                this.A00 = inflate;
                this.A0B = new C41741vZ(this, inflate, this.A0G);
                this.A0H.setTopShadowVisibility(0);
                findViewById(R.id.header_bottom_shadow).setVisibility(0);
            }
            C41741vZ r3 = this.A0B;
            if (r3 != null) {
                r3.A0F.A03(r3.A00(), new C41721vX(r3, z, z2, this.A0G, this.A12));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void finishAfterTransition() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A03.setTransitionName(null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A03);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A09);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public /* synthetic */ void lambda$onCreate$1786$ContactInfoActivity(View view) {
        startActivity(new Intent(this, StarredMessagesActivity.class).putExtra("jid", A0h().getRawString()));
    }

    public void lambda$onCreate$1787$ContactInfoActivity(View view) {
        if (this.A0G.A0R) {
            if (!((ChatInfoActivity) this).A04) {
                Intent intent = new Intent(this, ViewProfilePhoto.class);
                intent.putExtra("jid", A0h().getRawString());
                if (Build.VERSION.SDK_INT >= 21) {
                    intent.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
                }
                startActivity(intent, AnonymousClass2UT.A01(this, this.A07, ((ChatInfoActivity) this).A06.A01(R.string.transition_photo)));
            }
        } else if (!AnonymousClass1VY.A0a(A0h())) {
            ((ActivityC004702f) this).A0F.A06(R.string.no_profile_photo, 0);
            this.A0T.A03(A0h(), this.A0G.A02, 2, null);
        }
    }

    public /* synthetic */ void lambda$onCreate$1788$ContactInfoActivity(View view) {
        startActivityForResult(new Intent(getApplicationContext(), SettingsJidNotificationActivity.class).putExtra("jid", A0h().getRawString()), 12);
    }

    public void lambda$onCreate$1789$ContactInfoActivity(View view) {
        AnonymousClass02N A0V2 = A0V();
        if (A0V2 != null) {
            ChatMediaVisibilityDialog chatMediaVisibilityDialog = new ChatMediaVisibilityDialog();
            Bundle bundle = new Bundle();
            bundle.putString("chatJid", A0V2.getRawString());
            chatMediaVisibilityDialog.A0N(bundle);
            APm(chatMediaVisibilityDialog);
            return;
        }
        throw null;
    }

    public /* synthetic */ void lambda$updateContact$1794$ContactInfoActivity(View view) {
        startActivity(new Intent(getApplicationContext(), Conversation.class).putExtra("jid", A0h().getRawString()).addFlags(335544320));
    }

    public /* synthetic */ void lambda$updateContact$1796$ContactInfoActivity(View view) {
        this.A13.A01(this.A0G, this, 6, true, false);
    }

    public /* synthetic */ void lambda$updateContact$1797$ContactInfoActivity(View view) {
        this.A13.A01(this.A0G, this, 6, true, true);
    }

    public /* synthetic */ void lambda$updatePhones$1804$ContactInfoActivity(View view) {
        this.A13.A01(this.A0G, this, 6, true, true);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A0d.A06();
            this.A0I.A00();
        } else if (i == 12) {
            A0n();
        } else if (i == 100 && i2 == -1) {
            A0q(false, false);
        }
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A0I = new C09110cJ(this.A0r, ((ActivityC004702f) this).A0G, ((ActivityC004702f) this).A0I, this.A0g);
        this.A0J = new AnonymousClass36W(this.A0Q, this.A0X, this.A0o, this.A0h);
        if (UserJid.getNullable(getIntent().getStringExtra("jid")) == null) {
            Log.e("contactinfo/on_create: exiting due to null jid");
            finish();
            return;
        }
        AnonymousClass0TX.A0C(this);
        AnonymousClass01X r12 = ((ChatInfoActivity) this).A0A;
        setTitle(r12.A06(R.string.contact_info));
        ((ChatInfoActivity) this).A0D.A01 = 2;
        this.A0F = this.A0b.A03(this);
        ChatInfoLayout chatInfoLayout = (ChatInfoLayout) getLayoutInflater().inflate(R.layout.contact_info, (ViewGroup) null, false);
        this.A0C = chatInfoLayout;
        setContentView(chatInfoLayout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.A09();
        A0C(toolbar);
        AnonymousClass0S2 A092 = A09();
        boolean z = true;
        if (A092 != null) {
            A092.A0A(true);
        }
        toolbar.setNavigationIcon(new C06470Tj(r12, C004302a.A03(this, R.drawable.ic_back_shadow)));
        this.A09 = A0T();
        View inflate = getLayoutInflater().inflate(R.layout.contact_info_header, this.A09, false);
        this.A04 = inflate;
        AnonymousClass0Q7.A0W(inflate, 2);
        this.A09.addHeaderView(this.A04, null, false);
        this.A03 = findViewById(R.id.header);
        this.A0C.A01();
        this.A0C.A03(getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        View inflate2 = getLayoutInflater().inflate(R.layout.contact_info_footer, this.A09, false);
        this.A02 = inflate2;
        ListView listView = this.A09;
        FrameLayout frameLayout = new FrameLayout(inflate2.getContext());
        frameLayout.addView(inflate2);
        AnonymousClass0Q7.A0W(frameLayout, 2);
        listView.addFooterView(frameLayout, null, false);
        this.A08 = new LinearLayout(this);
        Point point = new Point();
        getWindowManager().getDefaultDisplay().getSize(point);
        this.A08.setPadding(0, 0, 0, point.y);
        this.A09.addFooterView(this.A08, null, false);
        AnonymousClass0Q7.A0W(this.A08, 2);
        this.A07 = (ImageView) findViewById(R.id.picture);
        C50992Wx r1 = new C50992Wx(this);
        MediaCard mediaCard = (MediaCard) findViewById(R.id.media_card_view);
        this.A0H = mediaCard;
        mediaCard.setSeeMoreClickListener(r1);
        this.A09.setOnItemClickListener(new C46652Eh(this));
        AnonymousClass00T r10 = ((ChatInfoActivity) this).A0H;
        C014308b r11 = this.A0a;
        AnonymousClass1PN r13 = ((ChatInfoActivity) this).A06;
        C46762Eu r8 = new C46762Eu(this, r10, r11, r12, r13, this.A0y, this.A0F);
        this.A0D = r8;
        if (bundle != null) {
            r8.A01 = bundle.getBoolean("groups_in_common_list_expanded", false);
        }
        this.A09.setAdapter((ListAdapter) this.A0D);
        A0p(null);
        A0b(0);
        findViewById(R.id.starred_messages_layout).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 33));
        A0a(0);
        findViewById(R.id.payment_transactions_layout).setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 45));
        A0O(true);
        this.A05 = findViewById(R.id.status_card);
        this.A0A = (TextView) findViewById(R.id.status_and_phone_title);
        View findViewById = findViewById(R.id.groups_in_common);
        AnonymousClass0Q7.A0N(this.A0A);
        AnonymousClass0Q7.A0N(findViewById);
        this.A06 = findViewById(R.id.status_separator);
        A0j();
        boolean z2 = false;
        if (bundle != null) {
            z2 = true;
        }
        A0q(true, z2);
        this.A0C.setOnPhotoClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 38));
        View findViewById2 = findViewById(R.id.live_location_card);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 46));
            AnonymousClass01S r14 = this.A0u;
            r14.A0V(this.A0s);
            AnonymousClass0EF r3 = this.A0t;
            List list = r14.A0X;
            if (!list.contains(r3)) {
                list.add(r3);
            }
            A0m();
            A0n();
            findViewById(R.id.notifications_layout).setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 32));
            View findViewById3 = findViewById(R.id.media_visibility_layout);
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new ViewOnClickEBaseShape4S0100000_I1_2(this, 37));
                A0l();
                A0k();
                View findViewById4 = findViewById(R.id.vcards_layout);
                View findViewById5 = findViewById(R.id.mute_separator);
                if (this.A0G.A09() || AnonymousClass1VY.A0T(this.A0G.A09) || AnonymousClass1VY.A0a(A0h()) || this.A0G.A08 != null || this.A0J.A00(A0h()).size() <= 0) {
                    z = false;
                }
                if (z) {
                    findViewById4.setVisibility(0);
                    findViewById5.setVisibility(0);
                    findViewById4.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 43));
                } else {
                    findViewById4.setVisibility(8);
                    findViewById5.setVisibility(8);
                    findViewById4.setOnClickListener(null);
                }
                A0i();
                this.A0n.A01(this.A0m);
                this.A0Z.A01(this.A0Y);
                this.A0l.A00(this.A0k);
                View findViewById6 = findViewById(R.id.report_contact_btn);
                if (findViewById6 != null) {
                    findViewById6.setOnClickListener(new ViewOnClickCListenerShape11S0100000_I1_0(this, 41));
                    View findViewById7 = findViewById(R.id.block_contact_btn);
                    if (findViewById7 != null) {
                        findViewById7.setOnClickListener(new AnonymousClass2X7(this));
                        if (AnonymousClass1VY.A0a(A0h())) {
                            findViewById(R.id.block_contact_card).setVisibility(8);
                            findViewById(R.id.report_contact_card).setVisibility(8);
                        }
                        if (Build.VERSION.SDK_INT >= 21) {
                            if (getIntent().getBooleanExtra("circular_transition", false)) {
                                this.A03.setTransitionName(r13.A01(R.string.transition_photo));
                            } else {
                                findViewById(R.id.picture).setTransitionName(r13.A01(R.string.transition_photo));
                            }
                        }
                        r10.ANF(new RunnableEBaseShape8S0100000_I1_3(this, 21));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass01X r1;
        if (this.A0G != null) {
            if (AnonymousClass1VY.A0a(A0h())) {
                return super.onCreateOptionsMenu(menu);
            }
            C007003k r12 = this.A0G;
            if (r12.A08 != null || r12.A0A()) {
                menu.add(0, 7, 0, ((ChatInfoActivity) this).A0A.A06(R.string.share_contact));
            }
            if (this.A0G.A08 != null) {
                AnonymousClass01X r3 = ((ChatInfoActivity) this).A0A;
                r1 = r3;
                menu.add(0, 6, 0, r3.A06(R.string.edit_contact_in_address_book));
                menu.add(0, 1, 0, r3.A06(R.string.view_contact_in_address_book));
            } else {
                r1 = ((ChatInfoActivity) this).A0A;
                menu.add(0, 3, 0, r1.A06(R.string.add_contact));
            }
            menu.add(0, 5, 0, r1.A06(R.string.verify_identity));
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        CatalogMediaCard catalogMediaCard;
        super.onDestroy();
        AnonymousClass01S r2 = this.A0u;
        r2.A0W.remove(this.A0s);
        r2.A0X.remove(this.A0t);
        this.A0Z.A00(this.A0Y);
        this.A0l.A01(this.A0k);
        this.A0n.A00(this.A0m);
        this.A0F.A00();
        this.A0L.removeCallbacks(this.A14);
        this.A07.setImageDrawable(null);
        C41741vZ r0 = this.A0B;
        if (r0 != null && (catalogMediaCard = r0.A07) != null) {
            catalogMediaCard.A01.A00();
            catalogMediaCard.A0H.A00(catalogMediaCard.A0G);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e9, code lost:
        throw r0;
     */
    @Override // X.ActivityC004702f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r15) {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ContactInfoActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        this.A0S.A06(A0h());
        C41741vZ r0 = this.A0B;
        if (r0 != null && r0.A00() != null) {
            C41741vZ r2 = this.A0B;
            r2.A01(r2.A00(), true);
        }
    }

    @Override // X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("groups_in_common_list_expanded", this.A0D.A01);
    }
}
