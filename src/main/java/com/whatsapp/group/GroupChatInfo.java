package com.whatsapp.group;

import X.AbstractC000400g;
import X.AbstractC49342Qc;
import X.AbstractC658531u;
import X.ActivityC004602e;
import X.ActivityC004702f;
import X.ActivityC004902h;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00Y;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01P;
import X.AnonymousClass01S;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass022;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass08B;
import X.AnonymousClass0A8;
import X.AnonymousClass0AC;
import X.AnonymousClass0AR;
import X.AnonymousClass0BB;
import X.AnonymousClass0BG;
import X.AnonymousClass0BP;
import X.AnonymousClass0BR;
import X.AnonymousClass0C4;
import X.AnonymousClass0DG;
import X.AnonymousClass0ED;
import X.AnonymousClass0EF;
import X.AnonymousClass0EO;
import X.AnonymousClass0EV;
import X.AnonymousClass0EY;
import X.AnonymousClass0EZ;
import X.AnonymousClass0Eg;
import X.AnonymousClass0HN;
import X.AnonymousClass0I5;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass0TX;
import X.AnonymousClass0YX;
import X.AnonymousClass1PN;
import X.AnonymousClass1VY;
import X.AnonymousClass2QF;
import X.AnonymousClass2QG;
import X.AnonymousClass2QH;
import X.AnonymousClass2QI;
import X.AnonymousClass2QJ;
import X.AnonymousClass2QK;
import X.AnonymousClass2QL;
import X.AnonymousClass2QM;
import X.AnonymousClass2QN;
import X.AnonymousClass2QO;
import X.AnonymousClass2QP;
import X.AnonymousClass2QW;
import X.AnonymousClass2QY;
import X.AnonymousClass2QZ;
import X.AnonymousClass2Ra;
import X.AnonymousClass2UT;
import X.AnonymousClass2d6;
import X.AnonymousClass31y;
import X.AnonymousClass325;
import X.C000300f;
import X.C002001d;
import X.C004302a;
import X.C006803i;
import X.C006903j;
import X.C007003k;
import X.C014308b;
import X.C02590Cr;
import X.C02600Cs;
import X.C02770Dj;
import X.C03490Gl;
import X.C03930Ii;
import X.C04360Kb;
import X.C04490Ko;
import X.C05720Pu;
import X.C06170Sb;
import X.C06470Tj;
import X.C09060cE;
import X.C09110cJ;
import X.C10340eT;
import X.C28051Sr;
import X.C49322Qa;
import X.C49332Qb;
import X.C53492dM;
import X.C54712fN;
import X.C54752fR;
import X.C54762fS;
import X.C54772fT;
import X.C54802fW;
import X.C54812fX;
import X.C54892ff;
import X.C54912fh;
import X.C54922fi;
import X.C54932fj;
import X.C54942fk;
import X.C54952fl;
import X.C55412gV;
import X.C59992oc;
import X.C60002od;
import X.C60552pg;
import X.C666435f;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.Slide;
import android.transition.TransitionSet;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.ViewOnClickEBaseShape6S0100000_I1_4;
import com.google.android.search.verification.client.R;
import com.whatsapp.ChatMediaVisibilityDialog;
import com.whatsapp.HomeActivity;
import com.whatsapp.ListItemWithRightIcon;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.ViewProfilePhoto;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.chatinfo.ChatInfoLayout;
import com.whatsapp.contact.picker.AddGroupParticipantsSelector;
import com.whatsapp.crop.CropImage;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.text.ReadMoreTextView;
import com.whatsapp.ui.media.MediaCard;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape13S0100000_I1_2;
import com.whatsapp.util.ViewOnClickCListenerShape2S0101000_I1;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class GroupChatInfo extends ChatInfoActivity implements AnonymousClass2Ra {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public LinearLayout A0C;
    public ListView A0D;
    public TextView A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public ChatInfoLayout A0I;
    public AnonymousClass0YX A0J;
    public C007003k A0K;
    public C007003k A0L;
    public AnonymousClass2QY A0M;
    public C60002od A0N;
    public C49322Qa A0O;
    public C54952fl A0P;
    public C49332Qb A0Q;
    public C55412gV A0R;
    public AnonymousClass02U A0S;
    public ReadMoreTextView A0T;
    public MediaCard A0U;
    public C09110cJ A0V;
    public AnonymousClass0JW A0W;
    public ArrayList A0X = new ArrayList();
    public final CompoundButton.OnCheckedChangeListener A0Y = new AnonymousClass2QW(this);
    public final AnonymousClass02M A0Z = AnonymousClass02M.A00();
    public final AnonymousClass01I A0a = AnonymousClass01I.A00();
    public final C03490Gl A0b = C03490Gl.A00();
    public final AnonymousClass0I5 A0c = AnonymousClass0I5.A00();
    public final AnonymousClass0EY A0d = AnonymousClass0EY.A00();
    public final C000300f A0e = C000300f.A00();
    public final C04360Kb A0f = C04360Kb.A00();
    public final AnonymousClass01A A0g = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0h = new C54912fh(this);
    public final AnonymousClass08B A0i = AnonymousClass08B.A00;
    public final C014308b A0j = C014308b.A00();
    public final AnonymousClass0EV A0k = AnonymousClass0EV.A00();
    public final AnonymousClass0L2 A0l = AnonymousClass0L2.A01();
    public final AnonymousClass0HN A0m = AnonymousClass0HN.A00();
    public final AnonymousClass04j A0n = AnonymousClass04j.A00();
    public final AnonymousClass03P A0o = AnonymousClass03P.A00();
    public final AnonymousClass00S A0p = AnonymousClass00S.A00();
    public final AnonymousClass03S A0q = AnonymousClass03S.A00();
    public final AnonymousClass0DG A0r = AnonymousClass0DG.A00();
    public final C006903j A0s = C006903j.A00();
    public final AnonymousClass0BR A0t = new C54922fi(this);
    public final AnonymousClass0A8 A0u = AnonymousClass0A8.A00;
    public final AnonymousClass01T A0v = AnonymousClass01T.A00();
    public final AnonymousClass0AC A0w = AnonymousClass0AC.A00;
    public final C04490Ko A0x = C04490Ko.A00();
    public final AnonymousClass01P A0y = AnonymousClass01P.A00();
    public final C03930Ii A0z = C03930Ii.A00();
    public final C53492dM A10 = C53492dM.A00();
    public final AnonymousClass00Y A11 = AnonymousClass00Y.A00();
    public final AnonymousClass0Eg A12 = AnonymousClass0Eg.A00();
    public final AnonymousClass0EO A13 = AnonymousClass0EO.A00();
    public final AbstractC49342Qc A14 = new C54772fT(this);
    public final AnonymousClass0EZ A15 = AnonymousClass0EZ.A01;
    public final AnonymousClass0ED A16 = new C54932fj(this);
    public final AnonymousClass0EF A17 = new C54942fk(this);
    public final AnonymousClass01S A18 = AnonymousClass01S.A00();
    public final C02770Dj A19 = C02770Dj.A00();
    public final AnonymousClass0AR A1A = AnonymousClass0AR.A00();
    public final AnonymousClass022 A1B = AnonymousClass022.A00();
    public final AnonymousClass0BB A1C = AnonymousClass0BB.A00();
    public final AbstractC658531u A1D = AbstractC658531u.A00();
    public final AnonymousClass31y A1E = AnonymousClass31y.A00();
    public final AnonymousClass325 A1F = AnonymousClass325.A00();
    public final C09060cE A1G = C09060cE.A01();
    public final C666435f A1H = C666435f.A00();
    public final AnonymousClass0C4 A1I = AnonymousClass0C4.A00();
    public final HashMap A1J = new HashMap();

    public class DescriptionConflictDialogFragment extends WaDialogFragment {
        public final AnonymousClass01X A00 = AnonymousClass01X.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            ActivityC004902h A0A = A0A();
            if (A0A != null) {
                AnonymousClass0MB r3 = new AnonymousClass0MB(A0A);
                AnonymousClass01X r2 = this.A00;
                String A06 = r2.A06(R.string.group_error_description_conflict);
                AnonymousClass0MC r1 = r3.A01;
                r1.A0E = A06;
                r1.A0J = true;
                r3.A05(r2.A06(R.string.cancel), new AnonymousClass2QF(this));
                r3.A07(r2.A06(R.string.retry), new AnonymousClass2QG(this));
                return r3.A00();
            }
            throw null;
        }
    }

    public class ExitGroupDialogFragment extends WaDialogFragment {
        public final AnonymousClass02M A00 = AnonymousClass02M.A00();
        public final AnonymousClass01A A01 = AnonymousClass01A.A00();
        public final C014308b A02 = C014308b.A00();
        public final AnonymousClass04j A03 = AnonymousClass04j.A00();
        public final AnonymousClass01X A04 = AnonymousClass01X.A00();
        public final AnonymousClass0A8 A05 = AnonymousClass0A8.A00;
        public final C02590Cr A06 = C02590Cr.A00();
        public final AnonymousClass0EO A07 = AnonymousClass0EO.A00();
        public final AnonymousClass0AR A08 = AnonymousClass0AR.A00();
        public final AnonymousClass0BB A09 = AnonymousClass0BB.A00();
        public final AnonymousClass0C4 A0A = AnonymousClass0C4.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r6;
            String A0A2;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                AnonymousClass02U A032 = AnonymousClass02U.A03(bundle2.getString("jid"));
                if (A032 != null) {
                    C007003k A0A3 = this.A01.A0A(A032);
                    int i = ((AnonymousClass037) this).A06.getInt("unsent_count");
                    if (i == 0) {
                        r6 = this.A04;
                        A0A2 = r6.A0D(R.string.exit_group_dialog_title, this.A02.A08(A0A3, false));
                    } else {
                        r6 = this.A04;
                        A0A2 = r6.A0A(R.plurals.exit_group_with_unsent_dialog_title, (long) i, this.A02.A08(A0A3, false), Integer.valueOf(i));
                    }
                    ActivityC004902h A0A4 = A0A();
                    if (A0A4 != null) {
                        AnonymousClass0MB r2 = new AnonymousClass0MB(A0A4);
                        CharSequence A1J = C002001d.A1J(A0A2, A0A(), this.A06);
                        AnonymousClass0MC r0 = r2.A01;
                        r0.A0E = A1J;
                        r0.A0J = true;
                        r2.A05(r6.A06(R.string.cancel), new AnonymousClass2QH(this));
                        r2.A07(r6.A06(R.string.exit), new AnonymousClass2QI(this, A032));
                        if (!this.A09.A08(A032).A09()) {
                            r2.A06(r6.A06(R.string.mute_instead), new AnonymousClass2QJ(this, A032));
                        }
                        return r2.A00();
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
    }

    public static void A04(C007003k r3, Activity activity) {
        Intent intent = new Intent(activity, GroupChatInfo.class);
        intent.putExtra("gid", AnonymousClass1VY.A0D(r3.A09));
        intent.putExtra("show_description", true);
        activity.startActivity(intent);
    }

    public static void A05(C007003k r3, Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, GroupChatInfo.class);
        intent.putExtra("gid", AnonymousClass1VY.A0D(r3.A09));
        intent.putExtra("circular_transition", true);
        activity.startActivity(intent, bundle);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void A0f(ArrayList arrayList) {
        super.A0f(arrayList);
        if (this.A01.getVisibility() != 8 || (arrayList != null && !arrayList.isEmpty() && this.A0v.A04(this.A0S))) {
            findViewById(R.id.header_bottom_shadow).setVisibility(8);
        } else {
            findViewById(R.id.header_bottom_shadow).setVisibility(0);
        }
    }

    public AnonymousClass02U A0g() {
        C007003k r1 = this.A0K;
        if (r1 == null) {
            return null;
        }
        return (AnonymousClass02U) r1.A02(AnonymousClass02U.class);
    }

    public final void A0h() {
        if (!(!((ActivityC004702f) this).A0B)) {
            startActivity(new Intent(getApplicationContext(), HomeActivity.class).addFlags(603979776));
        }
    }

    public final void A0i() {
        int A062 = this.A13.A06(this.A0S);
        if (this.A0X.size() < A062) {
            AnonymousClass02U r1 = this.A0S;
            Intent intent = new Intent(this, AddGroupParticipantsSelector.class);
            intent.putExtra("gid", r1.getRawString());
            startActivityForResult(intent, 12);
            return;
        }
        AnonymousClass0MB r7 = new AnonymousClass0MB(this);
        AnonymousClass01X r8 = ((ChatInfoActivity) this).A0A;
        String A063 = r8.A06(R.string.alert);
        AnonymousClass0MC r6 = r7.A01;
        r6.A0I = A063;
        r6.A0E = r8.A0A(R.plurals.groupchat_reach_limit, (long) A062, Integer.valueOf(A062));
        r7.A07(r8.A06(R.string.ok), null);
        r7.A00().show();
    }

    public final void A0j() {
        this.A0K = this.A0g.A0A(this.A0S);
        A0m();
        A0u();
        A0k();
        A0l();
        A0q();
        A0p();
        int i = 8;
        this.A0Q.A00.setVisibility(8);
        boolean A052 = this.A0v.A05(this.A0S);
        A0s();
        A0r();
        A0w(A052);
        View findViewById = findViewById(R.id.add_participant_layout);
        if (findViewById != null) {
            if (A052) {
                i = 0;
            }
            findViewById.setVisibility(i);
            invalidateOptionsMenu();
            this.A0M.A00();
            return;
        }
        throw null;
    }

    public final void A0k() {
        ListItemWithRightIcon listItemWithRightIcon = (ListItemWithRightIcon) AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.encryption_info_view);
        boolean z = this.A0K.A0S;
        int i = R.string.contact_encryption;
        int i2 = R.string.group_info_encrypted;
        int i3 = 1;
        if (z) {
            i = R.string.settings_security;
            i2 = R.string.security_card_description_for_in_app_support;
            i3 = 5;
        }
        listItemWithRightIcon.setTitle(getString(i));
        listItemWithRightIcon.setDescription(getString(i2));
        listItemWithRightIcon.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(this, i3, 4));
        listItemWithRightIcon.setVisibility(0);
    }

    public final void A0l() {
        int A062 = this.A0e.A06(AbstractC000400g.A3A);
        View view = this.A01;
        if (A062 > 0) {
            view.setVisibility(0);
            String str = this.A0K.A0B.A02;
            if (TextUtils.isEmpty(str)) {
                AnonymousClass01T r1 = this.A0v;
                if (!r1.A04(this.A0S) || (!r1.A05(this.A0S) && this.A0K.A0Z)) {
                    this.A08.setVisibility(8);
                    this.A01.setVisibility(8);
                    return;
                }
                this.A03.setVisibility(8);
                this.A08.setVisibility(0);
                return;
            }
            this.A08.setVisibility(8);
            this.A03.setVisibility(0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C002001d.A1C(this.A0o, this.A1B, C002001d.A1H(str, this, this.A0T.getPaint(), super.A0M)));
            this.A1H.A02(this, spannableStringBuilder);
            this.A0T.A04(spannableStringBuilder, null, false, 0);
            return;
        }
        view.setVisibility(8);
    }

    public final void A0m() {
        String A1d;
        C007003k A092;
        ChatInfoLayout chatInfoLayout = this.A0I;
        C014308b r8 = this.A0j;
        chatInfoLayout.setTitleText(r8.A08(this.A0K, false));
        this.A0I.setTitleVerified(this.A0K.A0B());
        long A042 = C006803i.A04(this.A0K.A0J, Long.MIN_VALUE);
        AnonymousClass01A r9 = this.A0g;
        AnonymousClass02N r0 = (AnonymousClass02N) this.A0K.A02(GroupJid.class);
        UserJid userJid = null;
        if (!(r0 == null || (A092 = r9.A09(r0)) == null)) {
            userJid = A092.A0A;
        }
        boolean A093 = this.A0a.A09(userJid);
        boolean z = false;
        if (userJid != null) {
            z = true;
        }
        if (this.A0K.A0S) {
            A1d = getString(R.string.whatsapp_support);
        } else if (A042 != Long.MIN_VALUE) {
            long A062 = this.A0p.A06(A042);
            AnonymousClass01X r4 = ((ChatInfoActivity) this).A0A;
            if (A093) {
                A1d = C002001d.A1d(r4, A062, R.string.group_creator_you_with_time_today, R.string.group_creator_you_with_time_yesterday, R.string.group_creator_you_with_time, new Object[0]);
            } else if (z) {
                A1d = C002001d.A1d(r4, A062, R.string.group_creator_name_with_time_today, R.string.group_creator_name_with_time_yesterday, R.string.group_creator_name_with_time, r4.A0E(r8.A08(r9.A0A(userJid), false)));
            } else {
                A1d = C002001d.A1d(r4, A062, R.string.group_create_time_today, R.string.group_create_time_yesterday, R.string.group_create_time, new Object[0]);
            }
        } else if (A093) {
            A1d = getString(R.string.group_creator_you);
        } else {
            A1d = z ? getString(R.string.group_creator_name, ((ChatInfoActivity) this).A0A.A0E(r8.A08(r9.A0A(userJid), false))) : null;
        }
        this.A0I.setSubtitleText(A1d);
    }

    public final void A0n() {
        if (this.A0q.A06()) {
            this.A0d.A05(this, this.A0K, 13);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = R.string.permission_storage_need_write_access_on_group_photo_update_v30;
        if (i < 30) {
            i2 = R.string.permission_storage_need_write_access_on_group_photo_update;
        }
        RequestPermissionActivity.A09(this, R.string.permission_storage_need_write_access_on_group_photo_update_request, i2);
    }

    public final void A0o() {
        C60002od r0 = this.A0N;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        A0Y();
        A0O(true);
        C60002od r2 = new C60002od(this, this.A0K);
        this.A0N = r2;
        ((ChatInfoActivity) this).A0H.ANC(r2, new Void[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r2 != false) goto L_0x0086;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0p() {
        /*
        // Method dump skipped, instructions count: 348
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupChatInfo.A0p():void");
    }

    public final void A0q() {
        AnonymousClass01T r1 = this.A0v;
        boolean A042 = r1.A04(this.A0S);
        boolean A052 = r1.A05(this.A0S);
        boolean A0y2 = A0y();
        View findViewById = findViewById(R.id.group_settings_separator);
        if (findViewById != null) {
            int i = 8;
            boolean z = false;
            int i2 = 8;
            if (A0y2) {
                i2 = 0;
            }
            findViewById.setVisibility(i2);
            View findViewById2 = findViewById(R.id.group_settings_layout);
            if (findViewById2 != null) {
                if (A0y2) {
                    i = 0;
                }
                findViewById2.setVisibility(i);
                if (A042 && (A052 || !this.A0K.A0Z)) {
                    z = true;
                }
                ImageButton imageButton = this.A0Q.A01;
                int i3 = R.drawable.ic_action_info;
                if (z) {
                    i3 = R.drawable.ic_action_edit_shadow;
                }
                imageButton.setImageResource(i3);
                return;
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0066, code lost:
        if (r5.getVisibility() == 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0r() {
        /*
        // Method dump skipped, instructions count: 209
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupChatInfo.A0r():void");
    }

    public final void A0s() {
        boolean A042 = this.A0v.A04(this.A0S);
        AnonymousClass01S r1 = this.A18;
        boolean A0e2 = r1.A0e(A0g());
        List A0B2 = r1.A0B(this.A0S);
        if (A042) {
            AbstractList abstractList = (AbstractList) A0B2;
            if (!abstractList.isEmpty() || A0e2) {
                this.A07.setVisibility(0);
                if (!A0e2) {
                    this.A0F.setText(((ChatInfoActivity) this).A0A.A0A(R.plurals.contact_info_live_location_description, (long) abstractList.size(), Integer.valueOf(abstractList.size())));
                    return;
                } else if (abstractList.isEmpty()) {
                    this.A0F.setText(((ChatInfoActivity) this).A0A.A06(R.string.contact_info_live_location_description_you_are_sharing));
                    return;
                } else if (abstractList.size() == 1) {
                    C007003k A0A2 = this.A0g.A0A((AnonymousClass02N) abstractList.get(0));
                    AnonymousClass01X r5 = ((ChatInfoActivity) this).A0A;
                    String A0E2 = r5.A0E(this.A0j.A08(A0A2, false));
                    this.A0F.setText(r5.A0D(R.string.contact_info_live_location_description_you_and_friend_are_sharing, A0E2));
                    return;
                } else {
                    this.A0F.setText(((ChatInfoActivity) this).A0A.A0A(R.plurals.contact_info_live_location_description_you_and_other_people_are_sharing, (long) abstractList.size(), Integer.valueOf(abstractList.size())));
                    return;
                }
            }
        }
        this.A07.setVisibility(8);
    }

    public final void A0t() {
        AnonymousClass0BG A082 = this.A1C.A08(this.A0S);
        View findViewById = findViewById(R.id.notifications_info);
        if (findViewById != null) {
            int i = 8;
            if (A082.A0H) {
                i = 0;
            }
            findViewById.setVisibility(i);
            return;
        }
        throw null;
    }

    public final void A0u() {
        AnonymousClass0JW r0 = this.A0W;
        if (r0 != null) {
            r0.A00.cancel(true);
        }
        C10340eT r2 = new C10340eT(this, this.A0K);
        this.A0W = r2;
        ((ChatInfoActivity) this).A0H.ANC(r2, new Void[0]);
    }

    public final void A0v(List list) {
        if (this.A0n.A05()) {
            APv(R.string.participant_adding, R.string.register_wait_message);
            this.A1A.A06(new C60552pg(this, this.A1I, this.A13, this.A0u, this.A0S, list));
            return;
        }
        boolean A022 = AnonymousClass04j.A02(getApplicationContext());
        int i = R.string.network_required;
        if (A022) {
            i = R.string.network_required_airplane_on;
        }
        this.A0Z.A03(i);
        A0j();
    }

    public final void A0w(boolean z) {
        int i = 0;
        if (z) {
            i = 1;
        }
        ChatInfoLayout chatInfoLayout = this.A0I;
        Integer valueOf = Integer.valueOf(getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material));
        if (valueOf != null) {
            chatInfoLayout.A03(valueOf.intValue(), getResources().getDimensionPixelSize(R.dimen.abc_action_button_min_width_material) * i);
            return;
        }
        throw null;
    }

    public final void A0x(boolean z) {
        C007003k r2 = this.A0L;
        if (r2 == null) {
            this.A0Z.A06(R.string.group_add_contact_failed, 0);
            return;
        }
        C09060cE r1 = this.A1G;
        Jid A022 = r2.A02(AnonymousClass02N.class);
        if (A022 != null) {
            Intent A023 = r1.A02(r2, (AnonymousClass02N) A022, z);
            A023.setFlags(524288);
            try {
                startActivityForResult(A023, 10);
                this.A0V.A02(z, 8);
            } catch (ActivityNotFoundException unused) {
                C002001d.A2O(this, 5);
            }
        } else {
            throw null;
        }
    }

    public final boolean A0y() {
        AnonymousClass01T r1 = this.A0v;
        return r1.A04(this.A0S) && r1.A05(this.A0S);
    }

    @Override // X.AnonymousClass2Ra
    public void AJk(UserJid userJid) {
        A0G(R.string.revoking_invite);
        ((ChatInfoActivity) this).A0H.ANC(new C59992oc(this, this.A0S, userJid), new Void[0]);
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity
    public void finishAfterTransition() {
        if (AnonymousClass2UT.A00) {
            this.A04.setTransitionName(null);
            TransitionSet transitionSet = new TransitionSet();
            Slide slide = new Slide(48);
            slide.addTarget(this.A04);
            transitionSet.addTransition(slide);
            Slide slide2 = new Slide(80);
            slide2.addTarget(this.A0D);
            transitionSet.addTransition(slide2);
            getWindow().setReturnTransition(transitionSet);
        }
        super.finishAfterTransition();
    }

    public void lambda$onCreate$2138$GroupChatInfo(View view) {
        if (!this.A0v.A04(this.A0S)) {
            APo(R.string.failed_update_photo_not_authorized);
        } else if (!this.A0K.A0R) {
            A0n();
        } else if (!((ChatInfoActivity) this).A04) {
            Intent intent = new Intent(this, ViewProfilePhoto.class);
            intent.putExtra("jid", AnonymousClass1VY.A0D(this.A0K.A09));
            if (Build.VERSION.SDK_INT >= 21) {
                intent.putExtra("start_transition_status_bar_color", getWindow().getStatusBarColor());
            }
            startActivityForResult(intent, 15, AnonymousClass2UT.A01(this, this.A0B, ((ChatInfoActivity) this).A06.A01(R.string.transition_photo)));
        }
    }

    public /* synthetic */ void lambda$onCreate$2140$GroupChatInfo(View view) {
        AnonymousClass01T r1 = this.A0v;
        if (!r1.A04(this.A0S)) {
            return;
        }
        if (r1.A05(this.A0S) || !this.A0K.A0Z) {
            C002001d.A2O(this, 7);
            this.A0r.A01(this.A0S);
            return;
        }
        APo(R.string.failed_update_group_info_not_admin);
    }

    public void lambda$onCreate$2141$GroupChatInfo(View view) {
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

    public /* synthetic */ void lambda$updateEphemeralMessagesSetting$2148$GroupChatInfo(View view) {
        if (A0y()) {
            AnonymousClass02U r1 = this.A0S;
            int i = this.A0K.A00;
            Intent intent = new Intent(this, ChangeEphemeralSettingActivity.class);
            intent.putExtra("jid", r1.getRawString());
            intent.putExtra("current_setting", i);
            startActivity(intent);
            return;
        }
        Toast.makeText(this, ((ChatInfoActivity) this).A0A.A06(R.string.ephemeral_toast_admin_only), 0).show();
    }

    @Override // com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004902h
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10) {
            this.A0m.A06();
            this.A0V.A00();
        } else if (i != 151) {
            if (i == 16) {
                A0t();
            } else if (i != 17) {
                switch (i) {
                    case 12:
                        if (i2 == -1) {
                            A0v(AnonymousClass1VY.A0G(UserJid.class, intent.getStringArrayListExtra("contacts")));
                            return;
                        }
                        return;
                    case 13:
                        if (i2 != -1) {
                            return;
                        }
                        if (intent == null || !intent.getBooleanExtra("is_reset", false)) {
                            Intent A012 = this.A0d.A01(this, this, intent);
                            if (A012 != null) {
                                startActivityForResult(A012, 14);
                                return;
                            }
                            return;
                        }
                        this.A0i.A05(A0g());
                        this.A0A.setVisibility(0);
                        this.A0d.A06(this.A0K);
                        return;
                    case 14:
                        AnonymousClass0EY r3 = this.A0d;
                        r3.A04().delete();
                        if (i2 == -1) {
                            this.A0i.A05(A0g());
                            if (r3.A09(this.A0K)) {
                                this.A0A.setVisibility(0);
                                return;
                            }
                            return;
                        } else if (i2 == 0 && intent != null) {
                            CropImage.A00(r3.A02, intent, this, r3.A0C);
                            return;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            } else if (i2 == 0) {
                InviteGroupParticipantsActivity.A05(this, ((ChatInfoActivity) this).A0A, ((ActivityC004702f) this).A04, intent, 17).A04();
            } else if (i2 == -1) {
                A0o();
            }
        } else if (i2 == -1) {
            AnonymousClass0EV r0 = this.A0k;
            r0.A05.A05(this.A0K);
            A0u();
            A0n();
        }
    }

    @Override // X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        AnonymousClass037 A062 = A04().A06(R.id.search_container);
        if (A062 instanceof GroupParticipantsSearchFragment) {
            ((GroupParticipantsSearchFragment) A062).A0o();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0106, code lost:
        if (r3 != 2) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onContextItemSelected(android.view.MenuItem r15) {
        /*
        // Method dump skipped, instructions count: 406
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GroupChatInfo.onContextItemSelected(android.view.MenuItem):boolean");
    }

    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        UserJid nullable;
        super.onCreate(bundle);
        AnonymousClass00Y r3 = this.A11;
        C000300f r12 = this.A0e;
        this.A0V = new C09110cJ(r3, r12, this.A0o, this.A0q);
        AnonymousClass0TX.A0C(this);
        AnonymousClass01X r11 = ((ChatInfoActivity) this).A0A;
        setTitle(r11.A06(R.string.group_info));
        ((ChatInfoActivity) this).A0D.A01 = 3;
        this.A0J = this.A0l.A03(this);
        setContentView(R.layout.groupchat_info);
        this.A0I = (ChatInfoLayout) findViewById(R.id.content);
        View findViewById = findViewById(R.id.toolbar);
        if (findViewById != null) {
            Toolbar toolbar = (Toolbar) findViewById;
            toolbar.setTitle("");
            toolbar.A09();
            A0C(toolbar);
            A09().A0A(true);
            toolbar.setNavigationIcon(new C06470Tj(r11, C004302a.A03(this, R.drawable.ic_back_shadow)));
            this.A0D = A0T();
            View inflate = getLayoutInflater().inflate(R.layout.groupchat_info_header, (ViewGroup) this.A0D, false);
            this.A05 = inflate;
            AnonymousClass0Q7.A0W(inflate, 2);
            String str = null;
            this.A0D.addHeaderView(this.A05, null, false);
            this.A04 = findViewById(R.id.header);
            this.A0U = (MediaCard) findViewById(R.id.media_card_view);
            this.A09 = findViewById(R.id.participants_card);
            TextView textView = (TextView) findViewById(R.id.participants_title);
            this.A0H = textView;
            AnonymousClass0Q7.A0N(textView);
            this.A0G = (TextView) findViewById(R.id.participants_info);
            this.A06 = findViewById(R.id.invites_card);
            this.A0E = (TextView) findViewById(R.id.invites_info);
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.invites_recycler_view);
            this.A0I.A01();
            View inflate2 = getLayoutInflater().inflate(R.layout.groupchat_info_footer, (ViewGroup) this.A0D, false);
            this.A02 = inflate2;
            C002001d.A2j(inflate2);
            this.A0D.addFooterView(this.A02, null, false);
            this.A0C = new LinearLayout(this);
            Point point = new Point();
            getWindowManager().getDefaultDisplay().getSize(point);
            this.A0C.setPadding(0, 0, 0, point.y);
            AnonymousClass0Q7.A0W(this.A0C, 2);
            this.A0D.addFooterView(this.A0C, null, false);
            AnonymousClass02U A032 = AnonymousClass02U.A03(getIntent().getStringExtra("gid"));
            this.A0S = A032;
            if (A032 == null) {
                Log.e("group_info/on_create: exiting due to null gid");
                finish();
                return;
            }
            AnonymousClass01A r9 = this.A0g;
            this.A0K = r9.A0A(A032);
            this.A1J.clear();
            int i = 8;
            this.A06.setVisibility(8);
            C014308b r0 = this.A0j;
            AnonymousClass1PN r8 = ((ChatInfoActivity) this).A06;
            this.A0R = new C55412gV(this, r0, r11, r8, this.A1E, this.A0J);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1A(1);
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.A0R);
            AnonymousClass2QY r2 = new AnonymousClass2QY(this);
            this.A0M = r2;
            if (bundle != null) {
                r2.A03 = bundle.getBoolean("group_participants_list_expanded", false);
            }
            A0p();
            this.A0D.setOnItemClickListener(new AnonymousClass2QL(this));
            StringBuilder sb = new StringBuilder("group_info/");
            sb.append(this.A0K.toString());
            Log.d(sb.toString());
            AnonymousClass01T r7 = this.A0v;
            A0w(r7.A05(this.A0S));
            View findViewById2 = findViewById(R.id.add_participant_layout);
            if (findViewById2 != null) {
                if (r7.A05(this.A0S)) {
                    i = 0;
                }
                findViewById2.setVisibility(i);
                findViewById2.findViewById(R.id.add_participant_button).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 20));
                findViewById2.findViewById(R.id.invite_via_link_button).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 21));
                View findViewById3 = findViewById(R.id.participants_search);
                if (findViewById3 != null) {
                    findViewById3.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 22));
                    View findViewById4 = findViewById(R.id.live_location_card);
                    if (findViewById4 != null) {
                        this.A07 = findViewById4;
                        View findViewById5 = findViewById(R.id.live_location_info);
                        if (findViewById5 != null) {
                            this.A0F = (TextView) findViewById5;
                            AnonymousClass0AR r5 = this.A1A;
                            AnonymousClass02U r32 = this.A0S;
                            if (!this.A0K.A07() && !TextUtils.isEmpty(this.A0K.A0J)) {
                                str = "interactive";
                            }
                            r5.A0F(r32, str);
                            A0u();
                            A0o();
                            A0k();
                            View findViewById6 = findViewById(R.id.starred_messages_layout);
                            if (findViewById6 != null) {
                                findViewById6.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 23));
                                View findViewById7 = findViewById(R.id.payment_transactions_layout);
                                if (findViewById7 != null) {
                                    findViewById7.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 13));
                                    View findViewById8 = findViewById(R.id.exit_group_btn);
                                    if (findViewById8 != null) {
                                        findViewById8.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 14));
                                        View findViewById9 = findViewById(R.id.report_group_btn);
                                        if (findViewById9 != null) {
                                            findViewById9.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 15));
                                            C54752fR r1 = new C54752fR(this);
                                            MediaCard mediaCard = this.A0U;
                                            if (mediaCard != null) {
                                                mediaCard.setSeeMoreClickListener(r1);
                                                ImageView imageView = (ImageView) findViewById(R.id.picture);
                                                this.A0B = imageView;
                                                C002001d.A2w(r11, imageView, R.string.action_open_image);
                                                this.A0I.setOnPhotoClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 21));
                                                this.A0A = findViewById(R.id.photo_progress);
                                                this.A0D.setAdapter((ListAdapter) this.A0M);
                                                registerForContextMenu(this.A0D);
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("group_info/");
                                                sb2.append(this.A0K.toString());
                                                Log.d(sb2.toString());
                                                A0m();
                                                ImageButton imageButton = (ImageButton) findViewById(R.id.change_subject_btn);
                                                View findViewById10 = findViewById(R.id.change_subject_progress);
                                                AnonymousClass02U r15 = this.A0S;
                                                AnonymousClass02M r02 = this.A0Z;
                                                AnonymousClass0C4 r03 = this.A1I;
                                                AnonymousClass0EO r33 = this.A13;
                                                AnonymousClass04j r22 = this.A0n;
                                                AnonymousClass0A8 r13 = this.A0u;
                                                this.A0Q = new C49332Qb(imageButton, findViewById10, r15, this, r02, r03, r5, r12, r11, r0, r9, r33, r22, r13, r7);
                                                imageButton.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 19));
                                                C002001d.A2w(r11, imageButton, R.string.accessibility_action_click_change_group_subject);
                                                this.A0O = new C49322Qa(r22, r5, r02, r12, r33, r03, r13, r7, r9, r0, this, this.A0S);
                                                this.A0T = (ReadMoreTextView) findViewById(R.id.group_description);
                                                if (getIntent().getBooleanExtra("show_description", false)) {
                                                    this.A0T.setLinesLimit(0);
                                                    this.A0r.A01(this.A0S);
                                                }
                                                ReadMoreTextView readMoreTextView = this.A0T;
                                                readMoreTextView.setAccessibilityHelper(new C05720Pu(readMoreTextView));
                                                this.A0T.A02 = new C54762fS(this);
                                                this.A03 = findViewById(R.id.has_description_view);
                                                this.A08 = findViewById(R.id.no_description_view);
                                                this.A00 = findViewById(R.id.change_description_progress);
                                                this.A01 = findViewById(R.id.description_card);
                                                A0l();
                                                this.A01.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 18));
                                                A0r();
                                                View findViewById11 = findViewById(R.id.live_location_card);
                                                if (findViewById11 != null) {
                                                    findViewById11.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 16));
                                                    AnonymousClass01S r23 = this.A18;
                                                    r23.A0V(this.A16);
                                                    AnonymousClass0EF r34 = this.A17;
                                                    List list = r23.A0X;
                                                    if (!list.contains(r34)) {
                                                        list.add(r34);
                                                    }
                                                    A0q();
                                                    View findViewById12 = findViewById(R.id.group_settings_layout);
                                                    if (findViewById12 != null) {
                                                        findViewById12.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 17));
                                                        A0t();
                                                        View findViewById13 = findViewById(R.id.notifications_layout);
                                                        if (findViewById13 != null) {
                                                            findViewById13.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I1_2(this, 18));
                                                            View findViewById14 = findViewById(R.id.media_visibility_layout);
                                                            if (findViewById14 != null) {
                                                                findViewById14.setOnClickListener(new ViewOnClickEBaseShape6S0100000_I1_4(this, 19));
                                                                A0e(this.A1C.A08(this.A0S), AnonymousClass0Q7.A0D(((ActivityC004702f) this).A04, R.id.mute_layout), this.A0Y);
                                                                A0g();
                                                                C54952fl r24 = new C54952fl(this.A0S, new C54712fN(this));
                                                                this.A0P = r24;
                                                                this.A0w.A01(r24);
                                                                this.A0i.A01(this.A0h);
                                                                r13.A00(this.A0t);
                                                                if (!(bundle == null || (nullable = UserJid.getNullable(bundle.getString("selected_jid"))) == null)) {
                                                                    this.A0L = r9.A0A(nullable);
                                                                }
                                                                if (Build.VERSION.SDK_INT >= 21) {
                                                                    if (getIntent().getBooleanExtra("circular_transition", false)) {
                                                                        this.A04.setTransitionName(r8.A01(R.string.transition_photo));
                                                                    } else {
                                                                        View findViewById15 = findViewById(R.id.picture);
                                                                        if (findViewById15 != null) {
                                                                            findViewById15.setTransitionName(r8.A01(R.string.transition_photo));
                                                                        } else {
                                                                            throw null;
                                                                        }
                                                                    }
                                                                }
                                                                this.A15.A00.add(this.A14);
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
                                            throw null;
                                        }
                                        throw null;
                                    }
                                    throw null;
                                }
                                throw null;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        C007003k r7 = ((AnonymousClass2QZ) ((AdapterView.AdapterContextMenuInfo) contextMenuInfo).targetView.getTag()).A05;
        if (r7 != null) {
            UserJid userJid = (UserJid) r7.A02(UserJid.class);
            if (userJid == null) {
                throw null;
            } else if (!this.A1J.containsKey(userJid)) {
                String A042 = this.A0j.A04(r7);
                AnonymousClass01X r4 = ((ChatInfoActivity) this).A0A;
                contextMenu.add(0, 1, 0, r4.A0D(R.string.message_contact_name, A042));
                if (r7.A08 == null) {
                    contextMenu.add(0, 2, 0, r4.A06(R.string.add_contact));
                    contextMenu.add(0, 3, 0, r4.A06(R.string.add_exist));
                } else if (r7.A08()) {
                    contextMenu.add(0, 4, 0, r4.A06(R.string.view_business_profile));
                } else {
                    contextMenu.add(0, 0, 0, r4.A0D(R.string.view_contact_name, A042));
                }
                AnonymousClass01T r1 = this.A0v;
                if (r1.A05(this.A0S)) {
                    if (!r1.A06(this.A0S, userJid)) {
                        contextMenu.add(0, 6, 0, r4.A06(R.string.make_contact_group_admin));
                    } else if (this.A0e.A0D(AbstractC000400g.A15)) {
                        contextMenu.add(0, 7, 0, r4.A06(R.string.dismiss_contact_group_admin));
                    }
                    contextMenu.add(0, 5, 0, r4.A0D(R.string.remove_contact_name_from_group, A042));
                }
                contextMenu.add(0, 8, 0, r4.A06(R.string.verify_identity));
            }
        }
    }

    @Override // X.ActivityC004602e
    public Dialog onCreateDialog(int i) {
        if (i == 1) {
            AnonymousClass01X r10 = ((ChatInfoActivity) this).A0A;
            String A0D2 = r10.A0D(R.string.delete_group_dialog_title, this.A0j.A08(this.A0K, false));
            return C28051Sr.A0Y(this, super.A0M, r10, super.A0J, new C54892ff(this), A0D2, false, R.string.delete, 1).A00();
        } else if (i == 3) {
            AnonymousClass01X r3 = ((ChatInfoActivity) this).A0A;
            String A0D3 = r3.A0D(R.string.end_group_dialog_title, this.A0j.A08(this.A0K, false));
            AnonymousClass0MB r2 = new AnonymousClass0MB(this);
            CharSequence A1J2 = C002001d.A1J(A0D3, this, super.A0M);
            AnonymousClass0MC r0 = r2.A01;
            r0.A0E = A1J2;
            r0.A0J = true;
            r2.A05(r3.A06(R.string.cancel), new AnonymousClass2QO(this));
            r2.A07(r3.A06(R.string.ok), new AnonymousClass2QN(this));
            return r2.A00();
        } else if (i == 4) {
            AnonymousClass0Eg r9 = this.A12;
            AnonymousClass02M r102 = this.A0Z;
            C06170Sb r11 = ((ActivityC004602e) this).A0H;
            C02590Cr r12 = super.A0M;
            C02600Cs r13 = super.A0L;
            C03930Ii r14 = this.A0z;
            AnonymousClass03P r15 = this.A0o;
            AnonymousClass01X r4 = ((ChatInfoActivity) this).A0A;
            C53492dM r32 = this.A10;
            AnonymousClass00D r22 = super.A0J;
            AnonymousClass022 r1 = this.A1B;
            C014308b r6 = this.A0j;
            AnonymousClass01A r5 = this.A0g;
            Jid A022 = this.A0K.A02(AnonymousClass02U.class);
            if (A022 != null) {
                C007003k A082 = r5.A08((AnonymousClass02N) A022);
                if (A082 != null) {
                    return new AnonymousClass2d6(this, r9, r102, r11, r12, r13, r14, r15, r4, r32, r22, r1, 4, R.string.edit_group_subject_dialog_title, r6.A08(A082, false), new C54812fX(this.A0Q), this.A0e.A06(AbstractC000400g.A40), R.string.small_case_subject, R.string.no_emtpy_subject, 16385);
                }
                throw null;
            }
            throw null;
        } else if (i == 5) {
            Log.w("groupchatinfo/add existing contact: activity not found, probably tablet");
            AnonymousClass0MB r33 = new AnonymousClass0MB(this);
            AnonymousClass01X r23 = ((ChatInfoActivity) this).A0A;
            r33.A01.A0E = r23.A06(R.string.activity_not_found);
            r33.A07(r23.A06(R.string.ok), new AnonymousClass2QP(this));
            return r33.A00();
        } else if (i == 6) {
            C007003k r62 = this.A0L;
            if (r62 == null) {
                return super.onCreateDialog(i);
            }
            AnonymousClass01X r34 = ((ChatInfoActivity) this).A0A;
            C014308b r16 = this.A0j;
            String A0D4 = r34.A0D(R.string.remove_participant_dialog_title, r16.A08(r62, false), r16.A08(this.A0K, false));
            AnonymousClass0MB r24 = new AnonymousClass0MB(this);
            CharSequence A1J3 = C002001d.A1J(A0D4, this, super.A0M);
            AnonymousClass0MC r02 = r24.A01;
            r02.A0E = A1J3;
            r02.A0J = true;
            r24.A05(r34.A06(R.string.cancel), new AnonymousClass2QK(this));
            r24.A07(r34.A06(R.string.ok), new AnonymousClass2QM(this));
            return r24.A00();
        } else if (i != 7) {
            return super.onCreateDialog(i);
        } else {
            int A062 = this.A0e.A06(AbstractC000400g.A3A);
            AnonymousClass0Eg r92 = this.A12;
            AnonymousClass02M r103 = this.A0Z;
            C06170Sb r112 = ((ActivityC004602e) this).A0H;
            C02590Cr r122 = super.A0M;
            C02600Cs r132 = super.A0L;
            C03930Ii r142 = this.A0z;
            AnonymousClass03P r152 = this.A0o;
            AnonymousClass01X r17 = ((ChatInfoActivity) this).A0A;
            AnonymousClass2d6 r7 = new AnonymousClass2d6(this, r92, r103, r112, r122, r132, r142, r152, r17, this.A10, super.A0J, this.A1B, 7, R.string.edit_group_description_dialog_title, this.A0K.A0B.A02, new C54802fW(this), A062, R.string.description_hint, 0, 147457);
            r7.A05 = true;
            r7.A00 = A062 / 10;
            r7.A03 = r17.A06(R.string.group_description_helper);
            return r7;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A0v.A05(this.A0S)) {
            menu.add(0, 1, 0, ((ChatInfoActivity) this).A0A.A06(R.string.add_paticipants)).setIcon(R.drawable.ic_action_add_person_shadow).setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // X.ActivityC03630Ha, X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.ActivityC004702f, X.ActivityC004902h
    public void onDestroy() {
        super.onDestroy();
        AnonymousClass01S r2 = this.A18;
        r2.A0W.remove(this.A16);
        r2.A0X.remove(this.A17);
        C54952fl r1 = this.A0P;
        if (r1 != null) {
            this.A0w.A00(r1);
        }
        this.A0i.A00(this.A0h);
        this.A0u.A01(this.A0t);
        this.A0J.A00();
        AnonymousClass0EZ r0 = this.A15;
        r0.A00.remove(this.A14);
    }

    public void onListItemClicked(View view) {
        C007003k r3 = ((AnonymousClass2QZ) view.getTag()).A05;
        if (r3 == null) {
            AnonymousClass2QY r2 = this.A0M;
            if (!r2.A03) {
                r2.A03 = true;
                r2.notifyDataSetChanged();
            }
        } else if (this.A1J.containsKey(r3.A02(UserJid.class))) {
            A0v(Collections.singletonList(r3.A02(UserJid.class)));
        } else {
            this.A0L = r3;
            view.showContextMenu();
        }
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            A0i();
            return true;
        } else if (itemId == 2) {
            A0g();
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            AnonymousClass0TX.A0B(this);
            return true;
        }
    }

    @Override // X.ActivityC004602e, X.ActivityC004702f, X.ActivityC004902h
    public void onResume() {
        super.onResume();
        A0s();
        if (this.A0s.A0F(this.A0S)) {
            A0h();
        }
    }

    @Override // X.ActivityC004802g, com.whatsapp.chatinfo.ChatInfoActivity, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C007003k r0 = this.A0L;
        if (r0 != null) {
            bundle.putString("selected_jid", AnonymousClass1VY.A0D(r0.A09));
        }
        bundle.putBoolean("group_participants_list_expanded", this.A0M.A03);
    }
}
