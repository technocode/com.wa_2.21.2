package com.whatsapp.conversationslist;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AbstractC06110Rt;
import X.AbstractC07520Xz;
import X.AbstractC09120cK;
import X.AbstractC10770fA;
import X.AbstractC28721Vm;
import X.AbstractC658531u;
import X.AbstractC658831x;
import X.ActivityC004802g;
import X.ActivityC004902h;
import X.AnonymousClass008;
import X.AnonymousClass00D;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00Y;
import X.AnonymousClass019;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass01Q;
import X.AnonymousClass01T;
import X.AnonymousClass01X;
import X.AnonymousClass02H;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass037;
import X.AnonymousClass03P;
import X.AnonymousClass03S;
import X.AnonymousClass04j;
import X.AnonymousClass08B;
import X.AnonymousClass08C;
import X.AnonymousClass09H;
import X.AnonymousClass0A8;
import X.AnonymousClass0A9;
import X.AnonymousClass0AC;
import X.AnonymousClass0AM;
import X.AnonymousClass0AN;
import X.AnonymousClass0AP;
import X.AnonymousClass0AQ;
import X.AnonymousClass0AR;
import X.AnonymousClass0AS;
import X.AnonymousClass0B7;
import X.AnonymousClass0BB;
import X.AnonymousClass0BP;
import X.AnonymousClass0BR;
import X.AnonymousClass0BS;
import X.AnonymousClass0C4;
import X.AnonymousClass0CG;
import X.AnonymousClass0DG;
import X.AnonymousClass0DH;
import X.AnonymousClass0EO;
import X.AnonymousClass0ET;
import X.AnonymousClass0FE;
import X.AnonymousClass0GG;
import X.AnonymousClass0HE;
import X.AnonymousClass0HI;
import X.AnonymousClass0HJ;
import X.AnonymousClass0HN;
import X.AnonymousClass0HQ;
import X.AnonymousClass0JJ;
import X.AnonymousClass0JW;
import X.AnonymousClass0L2;
import X.AnonymousClass0L7;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass0Q7;
import X.AnonymousClass0Q8;
import X.AnonymousClass0Q9;
import X.AnonymousClass0XB;
import X.AnonymousClass0Y2;
import X.AnonymousClass0Y5;
import X.AnonymousClass0Y6;
import X.AnonymousClass0YX;
import X.AnonymousClass0Z6;
import X.AnonymousClass0Z7;
import X.AnonymousClass1VY;
import X.AnonymousClass2CD;
import X.AnonymousClass2J8;
import X.AnonymousClass2JN;
import X.AnonymousClass2JO;
import X.AnonymousClass2JP;
import X.AnonymousClass2JR;
import X.AnonymousClass2JS;
import X.AnonymousClass2JT;
import X.AnonymousClass31y;
import X.AnonymousClass325;
import X.AnonymousClass357;
import X.AnonymousClass364;
import X.AnonymousClass3Ot;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002301g;
import X.C004302a;
import X.C006903j;
import X.C007003k;
import X.C014308b;
import X.C014508d;
import X.C015808q;
import X.C017009c;
import X.C017109d;
import X.C02040Ak;
import X.C02130At;
import X.C02150Av;
import X.C02360Br;
import X.C02430Bz;
import X.C02590Cr;
import X.C02780Dk;
import X.C03270Fn;
import X.C04260Jr;
import X.C04360Kb;
import X.C04410Kg;
import X.C04490Ko;
import X.C04600Kz;
import X.C05390Oi;
import X.C05400Oj;
import X.C06170Sb;
import X.C06470Tj;
import X.C08680bX;
import X.C09030cB;
import X.C09040cC;
import X.C09050cD;
import X.C09060cE;
import X.C09070cF;
import X.C09080cG;
import X.C09100cI;
import X.C09110cJ;
import X.C09480d1;
import X.C09490d2;
import X.C09500d3;
import X.C09590dC;
import X.C09610dF;
import X.C10760f9;
import X.C10960fU;
import X.C11610gd;
import X.C28051Sr;
import X.C36901n6;
import X.C47682Jd;
import X.C47712Jg;
import X.C47732Ji;
import X.C52202ak;
import X.C52222am;
import X.C52262aq;
import X.C52272ar;
import X.C52282as;
import X.C52312av;
import X.C52322aw;
import X.C52332ax;
import X.C52342ay;
import X.C52352az;
import X.C52382b2;
import X.C52392b3;
import X.C59382nY;
import X.ServiceConnectionC47672Jc;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.ListFragment;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.EmptyTellAFriendView;
import com.whatsapp.HomeActivity;
import com.whatsapp.QuickContactActivity;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SelectionCheckView;
import com.whatsapp.backup.google.GoogleBackupService;
import com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.base.WaListFragment;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ListMembersSelector;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.group.NewGroup;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape12S0100000_I1_1;
import com.whatsapp.util.ViewOnClickCListenerShape4S0200000_I1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;

public class ConversationsFragment extends WaListFragment implements AnonymousClass0Y5, AnonymousClass0Y2, AbstractC07520Xz, AnonymousClass0Y6 {
    public int A00;
    public long A01;
    public long A02;
    public View A03;
    public ViewGroup A04;
    public ImageView A05;
    public ListView A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public TextView A0A;
    public TextView A0B;
    public AbstractC06110Rt A0C;
    public C36901n6 A0D;
    public C09590dC A0E;
    public C09590dC A0F;
    public GoogleBackupService A0G;
    public AnonymousClass0YX A0H;
    public AnonymousClass2J8 A0I;
    public C47712Jg A0J;
    public C59382nY A0K;
    public C09480d1 A0L;
    public C09490d2 A0M;
    public C09500d3 A0N;
    public C47732Ji A0O;
    public C09610dF A0P;
    public AnonymousClass02N A0Q;
    public AnonymousClass02N A0R;
    public C09110cJ A0S;
    public ArrayList A0T = new ArrayList();
    public LinkedHashSet A0U = new LinkedHashSet();
    public Set A0V = new HashSet();
    public boolean A0W = true;
    public boolean A0X;
    public boolean A0Y;
    public final ServiceConnection A0Z;
    public final C02780Dk A0a = C02780Dk.A02();
    public final AnonymousClass0GG A0b = AnonymousClass0GG.A00();
    public final C09050cD A0c = C09050cD.A00();
    public final AnonymousClass02M A0d = AnonymousClass02M.A00();
    public final AnonymousClass01I A0e = AnonymousClass01I.A00();
    public final AnonymousClass0Z6 A0f = AnonymousClass0Z6.A00();
    public final C000300f A0g = C000300f.A00();
    public final AnonymousClass0Z7 A0h;
    public final C09040cC A0i = C09040cC.A00();
    public final C04360Kb A0j = C04360Kb.A00();
    public final AnonymousClass0HI A0k = AnonymousClass0HI.A00();
    public final AnonymousClass0HQ A0l;
    public final C09080cG A0m;
    public final C017009c A0n;
    public final C017109d A0o = C017109d.A00();
    public final AbstractC09120cK A0p;
    public final AnonymousClass0DH A0q = AnonymousClass0DH.A00();
    public final AnonymousClass0HJ A0r = AnonymousClass0HJ.A02();
    public final AnonymousClass01A A0s = AnonymousClass01A.A00();
    public final AnonymousClass0BP A0t;
    public final AnonymousClass08B A0u;
    public final C014308b A0v = C014308b.A00();
    public final AnonymousClass08C A0w = AnonymousClass08C.A00();
    public final AnonymousClass0L2 A0x = AnonymousClass0L2.A01();
    public final AnonymousClass0HN A0y = AnonymousClass0HN.A00();
    public final C04410Kg A0z;
    public final C09030cB A10 = new C09030cB(Executors.newSingleThreadExecutor());
    public final C52312av A11 = new C52312av(this);
    public final AnonymousClass04j A12 = AnonymousClass04j.A00();
    public final AnonymousClass03P A13 = AnonymousClass03P.A00();
    public final C03270Fn A14 = C03270Fn.A00();
    public final AnonymousClass00S A15 = AnonymousClass00S.A00();
    public final AnonymousClass00G A16 = AnonymousClass00G.A01;
    public final AnonymousClass03S A17 = AnonymousClass03S.A00();
    public final AnonymousClass00D A18 = AnonymousClass00D.A00();
    public final AnonymousClass01X A19 = AnonymousClass01X.A00();
    public final AnonymousClass0DG A1A = AnonymousClass0DG.A00();
    public final C006903j A1B = C006903j.A00();
    public final AnonymousClass0AQ A1C;
    public final AnonymousClass0BR A1D;
    public final AnonymousClass0A8 A1E;
    public final AnonymousClass01Q A1F;
    public final AnonymousClass0A9 A1G = AnonymousClass0A9.A00();
    public final AnonymousClass0AM A1H = AnonymousClass0AM.A00();
    public final C08680bX A1I;
    public final AnonymousClass01T A1J;
    public final AnonymousClass0AN A1K = AnonymousClass0AN.A00();
    public final AnonymousClass0B7 A1L = AnonymousClass0B7.A00();
    public final AnonymousClass0AP A1M = AnonymousClass0AP.A00();
    public final AnonymousClass019 A1N;
    public final AnonymousClass0AC A1O;
    public final C014508d A1P = C014508d.A00();
    public final AnonymousClass0CG A1Q = AnonymousClass0CG.A00();
    public final C04490Ko A1R = C04490Ko.A00();
    public final C02430Bz A1S;
    public final C02590Cr A1T = C02590Cr.A00();
    public final AnonymousClass0AS A1U = AnonymousClass0AS.A00();
    public final AnonymousClass0ET A1V = AnonymousClass0ET.A00();
    public final AnonymousClass00Y A1W = AnonymousClass00Y.A00();
    public final AnonymousClass0EO A1X = AnonymousClass0EO.A00();
    public final AbstractC28721Vm A1Y;
    public final AnonymousClass09H A1Z = AnonymousClass09H.A01();
    public final C015808q A1a = C015808q.A00();
    public final C02360Br A1b = C02360Br.A00();
    public final AnonymousClass0FE A1c = AnonymousClass0FE.A00();
    public final AnonymousClass0BS A1d = AnonymousClass0BS.A01();
    public final C02130At A1e;
    public final C02040Ak A1f;
    public final C02150Av A1g = C02150Av.A02();
    public final C09100cI A1h;
    public final AnonymousClass0L7 A1i;
    public final AnonymousClass0BB A1j = AnonymousClass0BB.A00();
    public final AnonymousClass3Ot A1k = AnonymousClass3Ot.A00();
    public final AbstractC658531u A1l = AbstractC658531u.A00();
    public final AbstractC658831x A1m = AbstractC658831x.A00();
    public final AnonymousClass31y A1n = AnonymousClass31y.A00();
    public final AnonymousClass325 A1o = AnonymousClass325.A00();
    public final C09070cF A1p;
    public final AnonymousClass0HE A1q = AnonymousClass0HE.A00();
    public final C09060cE A1r = C09060cE.A01();
    public final C04260Jr A1s = C04260Jr.A00();
    public final C06170Sb A1t = C06170Sb.A00();
    public final AnonymousClass00T A1u = C002101e.A00();
    public final AnonymousClass0C4 A1v = AnonymousClass0C4.A00();

    @Override // X.AnonymousClass0Y2
    public String A4o() {
        return null;
    }

    @Override // X.AnonymousClass0Y2
    public Drawable A4p() {
        return null;
    }

    @Override // X.AnonymousClass0Y2
    public void ADE() {
    }

    @Override // X.AbstractC07520Xz
    public boolean AQO() {
        return true;
    }

    public class BulkDeleteConversationDialogFragment extends WaDialogFragment {
        public final C04360Kb A00 = C04360Kb.A00();
        public final AnonymousClass01A A01 = AnonymousClass01A.A00();
        public final AnonymousClass00D A02 = AnonymousClass00D.A00();
        public final AnonymousClass01X A03 = AnonymousClass01X.A00();
        public final AnonymousClass0A8 A04 = AnonymousClass0A8.A00;
        public final C02590Cr A05 = C02590Cr.A00();
        public final AnonymousClass00T A06 = C002101e.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                List A0G = AnonymousClass1VY.A0G(AnonymousClass02N.class, bundle2.getStringArrayList("selection_jids"));
                int i = ((AnonymousClass037) this).A06.getInt("unsentCount", 0);
                int size = ((AbstractCollection) A0G).size();
                C52322aw r13 = new C52322aw(this, A0G);
                boolean z = ((AnonymousClass037) this).A06.getBoolean("chatContainsStarredMessages", false);
                AnonymousClass01X r11 = this.A03;
                String A0A = r11.A0A(R.plurals.bulk_delete_conversations, (long) size, Integer.valueOf(size));
                if (z) {
                    StringBuilder A0Y = AnonymousClass008.A0Y(A0A, "\n");
                    if (i > 0) {
                        A0A = AnonymousClass008.A0E(r11, R.string.unsent_and_starred_messages_in_selection, A0Y);
                    } else {
                        A0A = AnonymousClass008.A0E(r11, R.string.starred_messages_in_selection, A0Y);
                    }
                } else if (i > 0) {
                    StringBuilder A0Y2 = AnonymousClass008.A0Y(A0A, "\n");
                    A0Y2.append(r11.A0A(R.plurals.unsent_messages_in_selection, (long) i, Integer.valueOf(i)));
                    A0A = A0Y2.toString();
                }
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    return C28051Sr.A0Y(A0A2, this.A05, r11, this.A02, r13, A0A, true, R.string.delete, size).A00();
                }
                throw null;
            }
            throw null;
        }
    }

    public class BulkLeaveGroupsDialogFragment extends WaDialogFragment {
        public final AnonymousClass02M A00 = AnonymousClass02M.A00();
        public final C000300f A01 = C000300f.A00();
        public final AnonymousClass04j A02 = AnonymousClass04j.A00();
        public final AnonymousClass00D A03 = AnonymousClass00D.A00();
        public final AnonymousClass01X A04 = AnonymousClass01X.A00();
        public final C006903j A05 = C006903j.A00();
        public final AnonymousClass0A8 A06 = AnonymousClass0A8.A00;
        public final C02590Cr A07 = C02590Cr.A00();
        public final AnonymousClass0EO A08 = AnonymousClass0EO.A00();
        public final AnonymousClass0AR A09 = AnonymousClass0AR.A00();
        public final AnonymousClass0BB A0A = AnonymousClass0BB.A00();
        public final AnonymousClass00T A0B = C002101e.A00();
        public final AnonymousClass0C4 A0C = AnonymousClass0C4.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                List A0G = AnonymousClass1VY.A0G(AnonymousClass02U.class, bundle2.getStringArrayList("selection_jids"));
                boolean z = false;
                int i = ((AnonymousClass037) this).A06.getInt("unsentCount", 0);
                AbstractCollection abstractCollection = (AbstractCollection) A0G;
                int size = abstractCollection.size();
                AnonymousClass01X r4 = this.A04;
                String A0A2 = r4.A0A(R.plurals.bulk_leave_conversations, (long) size, Integer.valueOf(size));
                if (i > 0) {
                    StringBuilder A0Y = AnonymousClass008.A0Y(A0A2, "\n");
                    A0Y.append(r4.A0A(R.plurals.unsent_messages_in_selection, (long) i, Integer.valueOf(i)));
                    A0A2 = A0Y.toString();
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = abstractCollection.iterator();
                boolean z2 = true;
                while (it.hasNext()) {
                    AnonymousClass02N r1 = (AnonymousClass02N) it.next();
                    boolean A092 = this.A0A.A08(r1).A09();
                    z2 &= A092;
                    if (!A092) {
                        arrayList.add(r1);
                    }
                }
                ActivityC004902h A0A3 = A0A();
                if (A0A3 != null) {
                    AnonymousClass0MB r2 = new AnonymousClass0MB(A0A3);
                    CharSequence A1J = C002001d.A1J(A0A2, A0A(), this.A07);
                    AnonymousClass0MC r0 = r2.A01;
                    r0.A0E = A1J;
                    r0.A0J = true;
                    r2.A05(r4.A06(R.string.cancel), new AnonymousClass2JO(this));
                    r2.A07(r4.A06(R.string.exit), new AnonymousClass2JP(this, A0G));
                    if (!arrayList.isEmpty() && this.A01.A0D(AbstractC000400g.A0p) && this.A05.A0E((AnonymousClass02N) arrayList.get(0))) {
                        z = true;
                    }
                    if (!z2 && !z) {
                        r2.A06(r4.A06(R.string.mute_instead), new AnonymousClass2JN(this, arrayList));
                    }
                    return r2.A00();
                }
                throw null;
            }
            throw null;
        }
    }

    public class DeleteBroadcastListDialogFragment extends WaDialogFragment {
        public final C04360Kb A00 = C04360Kb.A00();
        public final AnonymousClass01A A01 = AnonymousClass01A.A00();
        public final C014308b A02 = C014308b.A00();
        public final AnonymousClass00D A03 = AnonymousClass00D.A00();
        public final AnonymousClass01X A04 = AnonymousClass01X.A00();
        public final AnonymousClass0A8 A05 = AnonymousClass0A8.A00;
        public final C02590Cr A06 = C02590Cr.A00();
        public final AnonymousClass00T A07 = C002101e.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r5;
            String A0D;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("jid");
                AnonymousClass01A r3 = this.A01;
                AnonymousClass02N A012 = AnonymousClass02N.A01(string);
                StringBuilder sb = new StringBuilder("Invalid rawJid=");
                sb.append(string);
                AnonymousClass00E.A04(A012, sb.toString());
                C007003k A0A = r3.A0A(A012);
                C52332ax r7 = new C52332ax(this, A0A);
                if (((AnonymousClass037) this).A06.getBoolean("chatContainsStarredMessages", false)) {
                    if (TextUtils.isEmpty(A0A.A0F)) {
                        r5 = this.A04;
                        A0D = r5.A06(R.string.delete_list_unnamed_starred_dialog_title);
                    } else {
                        r5 = this.A04;
                        A0D = r5.A0D(R.string.delete_list_starred_dialog_title, this.A02.A08(A0A, false));
                    }
                } else if (TextUtils.isEmpty(A0A.A0F)) {
                    r5 = this.A04;
                    A0D = r5.A06(R.string.delete_list_unnamed_dialog_title);
                } else {
                    r5 = this.A04;
                    A0D = r5.A0D(R.string.delete_list_dialog_title, this.A02.A08(A0A, false));
                }
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    return C28051Sr.A0Y(A0A2, this.A06, r5, this.A03, r7, A0D, true, R.string.delete, 1).A00();
                }
                throw null;
            }
            throw null;
        }
    }

    public class DeleteContactDialogFragment extends WaDialogFragment {
        public final C04360Kb A00 = C04360Kb.A00();
        public final AnonymousClass01A A01 = AnonymousClass01A.A00();
        public final C014308b A02 = C014308b.A00();
        public final AnonymousClass00D A03 = AnonymousClass00D.A00();
        public final AnonymousClass01X A04 = AnonymousClass01X.A00();
        public final AnonymousClass0A8 A05 = AnonymousClass0A8.A00;
        public final C02590Cr A06 = C02590Cr.A00();
        public final AnonymousClass00T A07 = C002101e.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r10;
            String A0A;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("jid");
                AnonymousClass01A r3 = this.A01;
                AnonymousClass02N A012 = AnonymousClass02N.A01(string);
                StringBuilder sb = new StringBuilder("Invalid rawJid=");
                sb.append(string);
                AnonymousClass00E.A04(A012, sb.toString());
                C007003k A0A2 = r3.A0A(A012);
                int i = ((AnonymousClass037) this).A06.getInt("unsentCount");
                C52342ay r12 = new C52342ay(this, A0A2);
                if (((AnonymousClass037) this).A06.getBoolean("chatContainsStarredMessages", false)) {
                    r10 = this.A04;
                    int i2 = R.string.delete_contact_with_unsent_and_starred_dialog_title;
                    if (i == 0) {
                        i2 = R.string.delete_contact_with_starred_dialog_title;
                    }
                    A0A = r10.A0D(i2, this.A02.A08(A0A2, false));
                } else if (i == 0) {
                    r10 = this.A04;
                    A0A = r10.A0D(R.string.delete_contact_dialog_title, this.A02.A08(A0A2, false));
                } else {
                    r10 = this.A04;
                    A0A = r10.A0A(R.plurals.delete_contact_with_unsent_dialog_title, (long) i, this.A02.A08(A0A2, false), Integer.valueOf(i));
                }
                ActivityC004902h A0A3 = A0A();
                if (A0A3 != null) {
                    return C28051Sr.A0Y(A0A3, this.A06, r10, this.A03, r12, A0A, true, R.string.delete, 1).A00();
                }
                throw null;
            }
            throw null;
        }
    }

    public class DeleteGroupDialogFragment extends WaDialogFragment {
        public final C04360Kb A00 = C04360Kb.A00();
        public final AnonymousClass01A A01 = AnonymousClass01A.A00();
        public final C014308b A02 = C014308b.A00();
        public final AnonymousClass00D A03 = AnonymousClass00D.A00();
        public final AnonymousClass01X A04 = AnonymousClass01X.A00();
        public final AnonymousClass0A8 A05 = AnonymousClass0A8.A00;
        public final AnonymousClass0AP A06 = AnonymousClass0AP.A00();
        public final C02590Cr A07 = C02590Cr.A00();
        public final AnonymousClass00T A08 = C002101e.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r4;
            String A0D;
            int i;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("jid");
                AnonymousClass02N A012 = AnonymousClass02N.A01(string);
                StringBuilder sb = new StringBuilder("Invalid rawJid=");
                sb.append(string);
                AnonymousClass00E.A04(A012, sb.toString());
                C007003k A0A = this.A01.A0A(A012);
                String str = null;
                if (A0A.A0F == null) {
                    AbstractC007503q A022 = this.A06.A02(A012);
                    if ((A022 instanceof C05390Oi) && ((i = ((C05390Oi) A022).A00) == 2 || i == 3)) {
                        str = A022.A0D();
                    }
                }
                if (str == null) {
                    str = this.A02.A08(A0A, false);
                }
                C52352az r6 = new C52352az(this, A0A);
                if (((AnonymousClass037) this).A06.getBoolean("chatContainsStarredMessages", false)) {
                    r4 = this.A04;
                    A0D = r4.A0D(R.string.delete_group_starred_dialog_title, str);
                } else {
                    r4 = this.A04;
                    A0D = r4.A0D(R.string.delete_group_dialog_title, str);
                }
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    return C28051Sr.A0Y(A0A2, this.A07, r4, this.A03, r6, A0D, true, R.string.delete, 1).A00();
                }
                throw null;
            }
            throw null;
        }
    }

    public class ExitGroupDialogFragment extends WaDialogFragment {
        public final AnonymousClass02M A00 = AnonymousClass02M.A00();
        public final C000300f A01 = C000300f.A00();
        public final AnonymousClass01A A02 = AnonymousClass01A.A00();
        public final C014308b A03 = C014308b.A00();
        public final AnonymousClass04j A04 = AnonymousClass04j.A00();
        public final AnonymousClass00D A05 = AnonymousClass00D.A00();
        public final AnonymousClass01X A06 = AnonymousClass01X.A00();
        public final C006903j A07 = C006903j.A00();
        public final AnonymousClass0A8 A08 = AnonymousClass0A8.A00;
        public final C02590Cr A09 = C02590Cr.A00();
        public final AnonymousClass0EO A0A = AnonymousClass0EO.A00();
        public final AnonymousClass0AR A0B = AnonymousClass0AR.A00();
        public final AnonymousClass0BB A0C = AnonymousClass0BB.A00();
        public final AnonymousClass00T A0D = C002101e.A00();
        public final AnonymousClass0C4 A0E = AnonymousClass0C4.A00();

        @Override // androidx.fragment.app.DialogFragment
        public Dialog A0p(Bundle bundle) {
            AnonymousClass01X r6;
            String A0A2;
            Bundle bundle2 = ((AnonymousClass037) this).A06;
            if (bundle2 != null) {
                String string = bundle2.getString("jid");
                AnonymousClass02N A012 = AnonymousClass02N.A01(string);
                StringBuilder sb = new StringBuilder("invalid jid: ");
                sb.append(string);
                AnonymousClass00E.A04(A012, sb.toString());
                C007003k A0A3 = this.A02.A0A(A012);
                int i = ((AnonymousClass037) this).A06.getInt("unsentCount");
                boolean z = true;
                if (i == 0) {
                    r6 = this.A06;
                    A0A2 = r6.A0D(R.string.exit_group_dialog_title, this.A03.A08(A0A3, false));
                } else {
                    r6 = this.A06;
                    A0A2 = r6.A0A(R.plurals.exit_group_with_unsent_dialog_title, (long) i, this.A03.A08(A0A3, false), Integer.valueOf(i));
                }
                boolean A092 = this.A0C.A08(A012).A09();
                ActivityC004902h A0A4 = A0A();
                if (A0A4 != null) {
                    AnonymousClass0MB r2 = new AnonymousClass0MB(A0A4);
                    CharSequence A1J = C002001d.A1J(A0A2, A0A(), this.A09);
                    AnonymousClass0MC r0 = r2.A01;
                    r0.A0E = A1J;
                    r0.A0J = true;
                    r2.A05(r6.A06(R.string.cancel), new AnonymousClass2JS(this));
                    r2.A07(r6.A06(R.string.exit), new AnonymousClass2JT(this, A0A3));
                    if (!this.A01.A0D(AbstractC000400g.A0p) || !this.A07.A0E(A012)) {
                        z = false;
                    }
                    if (!A092 && !z) {
                        r2.A06(r6.A06(R.string.mute_instead), new AnonymousClass2JR(this, A012));
                    }
                    return r2.A00();
                }
                throw null;
            }
            throw null;
        }
    }

    public ConversationsFragment() {
        AbstractC28721Vm r0 = AbstractC28721Vm.A00;
        if (r0 != null) {
            this.A1Y = r0;
            this.A1F = AnonymousClass01Q.A00();
            this.A1e = C02130At.A00();
            this.A1f = C02040Ak.A00();
            this.A0n = C017009c.A00();
            this.A1S = C02430Bz.A00();
            this.A1i = AnonymousClass0L7.A00();
            this.A0z = C04410Kg.A00();
            this.A1p = C09070cF.A00();
            this.A1J = AnonymousClass01T.A00();
            this.A0h = AnonymousClass0Z7.A00();
            this.A1C = AnonymousClass0AQ.A00();
            this.A0l = AnonymousClass0HQ.A00();
            this.A0m = C09080cG.A00();
            this.A1h = C09100cI.A01;
            this.A1I = new C08680bX();
            this.A0Z = new ServiceConnectionC47672Jc(this);
            this.A0u = AnonymousClass08B.A00;
            this.A0t = new C52262aq(this);
            this.A1O = AnonymousClass0AC.A00;
            this.A1N = new C52272ar(this);
            this.A1E = AnonymousClass0A8.A00;
            this.A1D = new C52282as(this);
            this.A0p = new C52202ak(this);
            return;
        }
        throw null;
    }

    public static AnonymousClass02N A00(ConversationsFragment conversationsFragment) {
        if (conversationsFragment.A0U.size() == 1) {
            return (AnonymousClass02N) conversationsFragment.A0U.iterator().next();
        }
        Log.i("conversations/getSoloSelectionJid/not a solo selection");
        return null;
    }

    public static void A01(ConversationsFragment conversationsFragment, C007003k r4, AnonymousClass02N r5, boolean z) {
        if (conversationsFragment != null) {
            try {
                Intent A022 = conversationsFragment.A1r.A02(r4, r5, z);
                conversationsFragment.A11(2);
                conversationsFragment.A0M(A022, 10, null);
                conversationsFragment.A0S.A02(z, 7);
            } catch (ActivityNotFoundException unused) {
                conversationsFragment.A0d.A06(R.string.activity_not_found, 0);
            }
        } else {
            throw null;
        }
    }

    public static void A02(ConversationsFragment conversationsFragment, AnonymousClass02N r5) {
        View A0q2;
        if (conversationsFragment.A0J != null && (A0q2 = conversationsFragment.A0q(r5)) != null) {
            ViewHolder viewHolder = (ViewHolder) A0q2.getTag();
            conversationsFragment.A1C.A02(r5);
            viewHolder.A01.A01(viewHolder.A02, false);
        }
    }

    public static void A03(AnonymousClass01X r4, View view) {
        AnonymousClass0Q7.A0d(view, new AnonymousClass0Q9(new AnonymousClass0Q8[]{new AnonymousClass0Q8(16, R.string.contacts_row_action_click), new AnonymousClass0Q8(32, R.string.accessibility_contact_long_press)}, r4));
    }

    public static void A04(C007003k r3, DialogFragment dialogFragment) {
        Bundle bundle = new Bundle();
        bundle.putString("jid", AnonymousClass1VY.A0D(r3.A09));
        dialogFragment.A0N(bundle);
    }

    @Override // X.AnonymousClass037
    public View A0Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.conversations, viewGroup, false);
        ListView listView = (ListView) inflate.findViewById(16908298);
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            View inflate2 = A0A2.getLayoutInflater().inflate(R.layout.conversations_tip_row, (ViewGroup) listView, false);
            listView.addFooterView(inflate2, null, false);
            this.A0B = (TextView) inflate2.findViewById(R.id.conversations_row_tip_tv);
            this.A0X = C002001d.A3H(this.A13.A0G());
            View inflate3 = layoutInflater.inflate(R.layout.conversations_tip_row, (ViewGroup) listView, false);
            listView.addFooterView(inflate3, null, true);
            TextView textView = (TextView) inflate3.findViewById(R.id.conversations_row_tip_tv);
            this.A08 = textView;
            textView.setBackgroundResource(R.drawable.selector_orange_gradient);
            this.A08.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 30));
            C002001d.A2j(inflate3);
            HomeActivity.A07(inflate, this, A02().getDimensionPixelSize(R.dimen.conversations_row_height));
            this.A04 = (ViewGroup) inflate.findViewById(R.id.banner_holder);
            if (!(this instanceof ArchivedConversationsFragment)) {
                C09590dC r2 = new C09590dC(A0A());
                this.A0E = r2;
                listView.addHeaderView(r2, null, true);
            }
            return inflate;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0a(Context context) {
        Log.i("conversations/attach");
        super.A0a(context);
        this.A0S = new C09110cJ(this.A1W, this.A0g, this.A13, this.A17);
        AbstractC06110Rt r0 = this.A0C;
        if (r0 != null) {
            r0.A01();
        }
    }

    @Override // X.AnonymousClass037
    public void A0b(Bundle bundle) {
        ArrayList<String> stringArrayList;
        C04600Kz r4 = new C04600Kz("conversations/create");
        super.A0U = true;
        A0I();
        if (this.A0P == null) {
            this.A0P = new C09610dF(this.A19);
        }
        AnonymousClass00T r3 = this.A1u;
        r3.ANF(new RunnableEBaseShape9S0100000_I1_4(this.A14, 9));
        if (this.A1f.A02()) {
            C014508d r0 = this.A1P;
            r0.A05();
            if (r0.A01) {
                r3.ANF(new RunnableEBaseShape9S0100000_I1_4(this.A1e, 22));
            }
        }
        A0n();
        ListView listView = ((ListFragment) this).A04;
        this.A06 = listView;
        AnonymousClass01X r2 = this.A19;
        Context A002 = A00();
        if (A002 != null) {
            listView.setDivider(new C06470Tj(r2, C004302a.A03(A002, R.drawable.conversations_list_divider)));
            this.A06.setFastScrollEnabled(false);
            this.A06.setScrollbarFadingEnabled(true);
            A0v();
            this.A1i.A03(A00());
            this.A06.setOnScrollListener(new C47682Jd(this));
            if (this.A0l.A06() && AnonymousClass0JJ.A0J(this.A18)) {
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    View inflate = A0A2.getLayoutInflater().inflate(R.layout.conversations_google_drive_header, (ViewGroup) this.A06, false);
                    this.A03 = inflate;
                    this.A06.addHeaderView(inflate);
                    this.A06.findViewById(R.id.google_drive_progress_view).setVisibility(8);
                } else {
                    throw null;
                }
            }
            C47712Jg r1 = new C47712Jg(this);
            this.A0J = r1;
            this.A06.setAdapter((ListAdapter) r1);
            this.A0O.A03 = true;
            A0x();
            this.A06.setOnCreateContextMenuListener(this);
            if (bundle != null) {
                this.A0R = AnonymousClass02N.A01(bundle.getString("LongPressedRowJid"));
                if (this.A0W && (stringArrayList = bundle.getStringArrayList("SelectedRowJids")) != null) {
                    LinkedHashSet linkedHashSet = this.A0U;
                    linkedHashSet.clear();
                    linkedHashSet.addAll(AnonymousClass1VY.A0G(AnonymousClass02N.class, stringArrayList));
                    if (!this.A0U.isEmpty()) {
                        A0u();
                    }
                }
            }
            r4.A01();
            r3.ANF(new RunnableEBaseShape9S0100000_I1_4(this, 16));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public void A0c() {
        C59382nY r1;
        Log.i("conversationsFragment/onDestroy");
        super.A0U = true;
        this.A0H.A00();
        GoogleBackupService googleBackupService = this.A0G;
        if (!(googleBackupService == null || (r1 = this.A0K) == null)) {
            googleBackupService.A0J.A01(r1);
        }
        this.A0Y = false;
    }

    @Override // X.AnonymousClass037
    public void A0d() {
        Log.i("conversationsFragment/onPause");
        super.A0U = true;
        C47732Ji r2 = this.A0O;
        C52382b2 r0 = r2.A01;
        if (r0 != null) {
            ((AnonymousClass0JW) r0).A00.cancel(true);
        }
        r2.A03 = false;
        ObjectAnimator objectAnimator = this.A0O.A00;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        this.A01 = 0;
    }

    @Override // X.AnonymousClass037
    public void A0e() {
        View findViewById;
        Log.i("conversationsFragment/onResume");
        super.A0U = true;
        this.A1d.A00.clear();
        this.A1s.A01();
        if (this.A0l.A06() && (findViewById = this.A06.findViewById(R.id.google_drive_progress_view)) != null) {
            if (findViewById.getVisibility() == 8) {
                if (AnonymousClass0JJ.A0J(this.A18)) {
                    findViewById.setVisibility(0);
                    Log.i("conversations/gdrive-header/gdrive-media-restore-pending/show-view");
                    ActivityC004902h A0A2 = A0A();
                    if (A0A2 != null) {
                        A0A2.bindService(new Intent(A0A2, GoogleBackupService.class), this.A0Z, 1);
                        View view = this.A03;
                        if (view != null) {
                            view.setVisibility(0);
                            this.A06.setHeaderDividersEnabled(true);
                            this.A05 = (ImageView) this.A06.findViewById(R.id.google_drive_image_view);
                            ProgressBar progressBar = (ProgressBar) this.A06.findViewById(R.id.google_drive_progress);
                            this.A07 = progressBar;
                            Context A002 = A00();
                            if (A002 != null) {
                                C28051Sr.A1V(progressBar, C004302a.A00(A002, R.color.media_message_progress_determinate));
                                TextView textView = (TextView) this.A06.findViewById(R.id.google_drive_backup_info_title);
                                this.A0A = textView;
                                C002301g.A03(textView);
                                this.A09 = (TextView) this.A06.findViewById(R.id.google_drive_backup_info_message);
                                this.A05.setImageResource(R.drawable.ic_in_progress);
                                ImageView imageView = this.A05;
                                AnonymousClass364 r3 = new AnonymousClass364();
                                r3.setDuration(2000);
                                r3.setRepeatCount(-1);
                                r3.setInterpolator(new LinearInterpolator());
                                r3.A00 = 0;
                                r3.A01 = true;
                                imageView.setAnimation(r3);
                                this.A03.setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 31));
                            } else {
                                throw null;
                            }
                        } else {
                            throw null;
                        }
                    } else {
                        throw null;
                    }
                }
            } else if (!AnonymousClass0JJ.A0J(this.A18)) {
                Log.i("conversations/resume/gdrive-header/gdrive-media-restore-done/hide-view");
                this.A06.findViewById(R.id.google_drive_progress_view).setVisibility(8);
                ActivityC004902h A0A3 = A0A();
                if (A0A3 != null) {
                    A0A3.unbindService(this.A0Z);
                } else {
                    throw null;
                }
            }
        }
        AnonymousClass0HE r32 = this.A1q;
        boolean z = false;
        if (r32.A00.A0D(AbstractC000400g.A2a)) {
            z = true;
        }
        if (z) {
            Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary");
            AnonymousClass357 A022 = r32.A05.A02();
            if (A022 == null) {
                Log.i("UserNoticeManager/transitionUserNoticeStageIfNecessary/no metadata");
            } else {
                r32.A08(A022, r32.A04.A03(A022));
            }
        }
        this.A1p.A01(A01());
        A0v();
        A0x();
        if (this.A0C != null) {
            A0w();
            this.A0C.A01();
        }
        if (this.A0Y) {
            this.A0Y = false;
            A0h(new Intent(A0A(), GoogleDriveNewUserSetupActivity.class));
        }
    }

    @Override // X.AnonymousClass037
    public void A0f() {
        super.A0U = true;
        this.A0u.A01(this.A0t);
        this.A1E.A00(this.A1D);
        this.A1O.A01(this.A1N);
        C47712Jg r2 = this.A0J;
        r2.A03.A0T = A0r();
        r2.notifyDataSetChanged();
        A0t();
    }

    @Override // X.AnonymousClass037
    public void A0g(int i, int i2, Intent intent) {
        if (!this.A0M.A01(i)) {
            if (i != 12) {
                if (i == 150 && i2 == -1) {
                    A0M(new Intent(A0A(), ContactPicker.class), 12, null);
                }
            } else if (i2 == -1) {
                AnonymousClass02N A012 = AnonymousClass02N.A01(intent.getStringExtra("contact"));
                if (A012 != null) {
                    Intent A042 = Conversation.A04(A00(), this.A0s.A0A(A012));
                    A042.putExtra("show_keyboard", true);
                    A042.putExtra("start_t", SystemClock.uptimeMillis());
                    C09100cI.A02.ABx(703934026);
                    A0h(A042);
                    return;
                }
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass037
    public void A0i(Bundle bundle) {
        Log.i("conversationsFragment/onCreate");
        AnonymousClass0YX A032 = this.A0x.A03(A00());
        this.A0H = A032;
        AnonymousClass02M r0 = this.A0d;
        AnonymousClass00T r02 = this.A1u;
        AnonymousClass01A r03 = this.A0s;
        C014308b r1 = this.A0v;
        AnonymousClass01X r04 = this.A19;
        this.A0O = new C47732Ji(this, r0, r02, r03, r1, r04, this.A0w, A032);
        AnonymousClass00S r05 = this.A15;
        AnonymousClass0DG r5 = this.A1A;
        C000300f r06 = this.A0g;
        AnonymousClass0DH r4 = this.A0q;
        C02360Br r3 = this.A1b;
        AnonymousClass0EO r07 = this.A1X;
        AnonymousClass0BB r08 = this.A1j;
        C04490Ko r2 = this.A1R;
        AnonymousClass0CG r12 = this.A1Q;
        AnonymousClass01T r09 = this.A1J;
        C09480d1 r13 = new C09480d1(r05, r0, r02, r5, r06, r4, r03, r3, r04, r07, r08, r2, r12, r09, new C52222am(this));
        this.A0L = r13;
        this.A0M = new C09490d2(A00(), super.A0H, r05, r0, r02, this.A1B, this.A1o, r06, this.A0j, this.A1Z, r03, r04, this.A0u, r07, this.A1n, this.A0S, r08, this.A0k, this.A1r, this.A0y, this.A1c, this.A0o, this.A0n, this.A0z, r09, r13, 10);
        this.A0N = new C09500d3(this.A1W);
        super.A0i(bundle);
    }

    @Override // X.AnonymousClass037
    public void A0j(Bundle bundle) {
        AnonymousClass02N r0 = this.A0R;
        if (r0 != null) {
            bundle.putString("LongPressedRowJid", r0.getRawString());
        }
        bundle.putStringArrayList("SelectedRowJids", AnonymousClass1VY.A0F(this.A0U));
    }

    @Override // X.AnonymousClass037
    public void A0k(Menu menu, MenuInflater menuInflater) {
        C000300f r6 = this.A0g;
        if (r6 != null) {
            AnonymousClass01X r4 = this.A19;
            menu.add(1, R.id.menuitem_new_group, 0, r4.A06(R.string.menuitem_groupchat)).setAlphabeticShortcut('g');
            menu.add(1, R.id.menuitem_new_broadcast, 0, r4.A06(R.string.menuitem_list)).setAlphabeticShortcut('b');
            boolean A1p2 = C28051Sr.A1p(r6);
            int i = R.string.menuitem_whatsapp_web;
            if (A1p2) {
                i = R.string.menuitem_linked_devices;
            }
            menu.add(1, R.id.menuitem_scan_qr, 0, r4.A06(i)).setAlphabeticShortcut('q');
            menu.add(1, R.id.menuitem_starred, 0, r4.A06(R.string.menuitem_starred)).setAlphabeticShortcut('s');
            if (this.A1f.A04()) {
                menu.add(1, R.id.menuitem_payments, 0, r4.A06(R.string.payments_activity_title));
                return;
            }
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass037
    public boolean A0m(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_new_conversation) {
            AHO();
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_broadcast) {
            this.A0N.A00(3);
            A0h(new Intent(A0A(), ListMembersSelector.class));
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_new_group) {
            this.A0N.A00(2);
            ActivityC004902h A0A2 = A0A();
            if (A0A2 != null) {
                NewGroup.A04(A0A2, 2, null);
                return true;
            }
            throw null;
        } else if (menuItem.getItemId() == R.id.menuitem_scan_qr) {
            this.A1u.ANC(new C10960fU(this.A1v, this.A1S, this.A1Y, this.A0p), new Void[0]);
            return true;
        } else if (menuItem.getItemId() == R.id.menuitem_archived_chats) {
            A0h(new Intent(A0A(), ArchivedConversationsActivity.class));
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_starred) {
            return false;
        } else {
            this.A0N.A00(6);
            A0h(new Intent(A0A(), StarredMessagesActivity.class));
            return true;
        }
    }

    public final View A0q(AnonymousClass02N r6) {
        if (r6 == null) {
            return null;
        }
        for (int i = 0; i < this.A06.getChildCount(); i++) {
            View childAt = this.A06.getChildAt(i);
            Object tag = childAt.getTag();
            if (tag instanceof ViewHolder) {
                AbstractC10770fA r1 = ((ViewHolder) tag).A02;
                if ((r1 instanceof C10760f9) && r6.equals(((C10760f9) r1).A00)) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public ArrayList A0r() {
        if (!(this instanceof ArchivedConversationsFragment)) {
            ArrayList A092 = this.A1F.A09(this.A1j);
            ArrayList arrayList = new ArrayList(A092.size());
            Iterator it = A092.iterator();
            while (it.hasNext()) {
                arrayList.add(new C10760f9((AnonymousClass02N) it.next()));
            }
            return arrayList;
        }
        ArrayList A052 = ((ArchivedConversationsFragment) this).A04.A05();
        ArrayList arrayList2 = new ArrayList(A052.size());
        Iterator it2 = A052.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C10760f9((AnonymousClass02N) it2.next()));
        }
        return arrayList2;
    }

    public final ArrayList A0s() {
        ArrayList arrayList = this.A0T;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!(next instanceof C11610gd) && !(next instanceof C52392b3)) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public void A0t() {
        if (A0U()) {
            A0v();
            A0w();
            AbstractC06110Rt r0 = this.A0C;
            if (r0 != null) {
                r0.A01();
            }
            C47712Jg r02 = this.A0J;
            if (r02 != null) {
                r02.notifyDataSetChanged();
            }
        }
    }

    public void A0u() {
        AnonymousClass2J8 r0 = this.A0I;
        if (r0 != null) {
            r0.setEnableState(false);
        }
        ActivityC004802g r1 = (ActivityC004802g) A0A();
        if (r1 != null) {
            this.A0C = r1.A0B(this.A11);
            return;
        }
        throw null;
    }

    public void A0v() {
        if (!(this instanceof ArchivedConversationsFragment)) {
            C09590dC r0 = this.A0E;
            if (r0 != null) {
                r0.A02();
            }
            this.A00 = this.A1F.A01();
            if (!this.A0g.A0D(AbstractC000400g.A0p) || !(A0A() instanceof HomeActivity)) {
                AnonymousClass2J8 r02 = this.A0I;
                if (r02 != null) {
                    r02.setVisibility(false);
                }
                if (this.A00 > 0) {
                    this.A08.setVisibility(0);
                    this.A08.setText(this.A19.A0D(R.string.archived_chats_count, Integer.valueOf(this.A00)));
                    this.A0B.setVisibility(8);
                    return;
                }
                this.A08.setVisibility(8);
                A0y();
                return;
            }
            this.A08.setVisibility(8);
            A0y();
            if (this.A00 > 0) {
                if (this.A0I == null) {
                    this.A0I = new AnonymousClass2J8(A0A());
                    A0n();
                    ((ListFragment) this).A04.addHeaderView(this.A0I, null, false);
                }
                this.A0I.setVisibility(true);
                return;
            }
            AnonymousClass2J8 r03 = this.A0I;
            if (r03 != null) {
                r03.setVisibility(false);
                return;
            }
            return;
        }
        ArchivedConversationsFragment archivedConversationsFragment = (ArchivedConversationsFragment) this;
        ((ConversationsFragment) archivedConversationsFragment).A08.setVisibility(8);
        ((ConversationsFragment) archivedConversationsFragment).A0B.setVisibility(8);
        AnonymousClass2J8 r1 = ((ConversationsFragment) archivedConversationsFragment).A0I;
        if (r1 != null) {
            r1.setVisibility(false);
        }
        View view = archivedConversationsFragment.A01;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = archivedConversationsFragment.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        if (!archivedConversationsFragment.A03.A0D(AbstractC000400g.A0p)) {
            return;
        }
        if (archivedConversationsFragment.A18.A00.getInt("archive_nux_shown_count", 0) <= 3) {
            if (archivedConversationsFragment.A01 == null) {
                View A142 = archivedConversationsFragment.A14(R.layout.conversations_archive_nux);
                archivedConversationsFragment.A01 = A142;
                C002301g.A03((TextView) A142.findViewById(R.id.archive_nux_title));
                archivedConversationsFragment.A01.findViewById(R.id.archive_nux_cancel).setOnClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(archivedConversationsFragment, 28));
            }
            archivedConversationsFragment.A01.setVisibility(0);
            return;
        }
        archivedConversationsFragment.A15(false);
    }

    public final void A0w() {
        Set set;
        if (!this.A0T.isEmpty()) {
            LinkedHashSet linkedHashSet = this.A0U;
            if ((linkedHashSet != null && !linkedHashSet.isEmpty()) || ((set = this.A0V) != null && !set.isEmpty())) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                Iterator it = this.A0T.iterator();
                while (it.hasNext()) {
                    AnonymousClass02N A6w = ((AbstractC10770fA) it.next()).A6w();
                    if (A6w != null) {
                        if (this.A0U.contains(A6w)) {
                            linkedHashSet2.add(A6w);
                        }
                        if (this.A0V.contains(A6w)) {
                            hashSet.add(A6w);
                        }
                    }
                }
                this.A0U = linkedHashSet2;
                this.A0V = hashSet;
            }
        }
    }

    public final void A0x() {
        C47712Jg r1 = this.A0J;
        if (r1.getCount() != 0) {
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else if (r1 != null) {
            boolean z = false;
            if (r1.getCount() == 0) {
                z = true;
            }
            AnonymousClass00E.A07(z);
            if (this.A0g.A0D(AbstractC000400g.A0p)) {
                this.A0B.setVisibility(8);
            }
            View view = super.A0A;
            if (view != null) {
                ViewGroup viewGroup2 = (ViewGroup) AnonymousClass0Q7.A0D(view, R.id.conversations_empty_no_contacts);
                ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.conversations_empty_permission_denied);
                ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.conversations_empty_nux);
                View findViewById = view.findViewById(R.id.search_no_matches);
                this.A04.setVisibility(8);
                C47712Jg r0 = this.A0J;
                if (r0 == null || !r0.A00.A01()) {
                    findViewById.setVisibility(8);
                    if (this.A0s.A03() > 0) {
                        viewGroup2.setVisibility(8);
                        viewGroup3.setVisibility(8);
                        viewGroup4.setVisibility(8);
                        this.A06.setEmptyView(viewGroup4);
                        if (this.A1F.A01() == 0) {
                            if (viewGroup4.getChildCount() == 0) {
                                ActivityC004902h A0A2 = A0A();
                                if (A0A2 != null) {
                                    A0A2.getLayoutInflater().inflate(R.layout.empty_nux, viewGroup4, true);
                                } else {
                                    throw null;
                                }
                            }
                            viewGroup4.setVisibility(0);
                            A0z();
                            C47732Ji r5 = this.A0O;
                            if (r5.A03) {
                                if (r5.A02 == null) {
                                    boolean z2 = false;
                                    if ((r5.A0A.A02().getConfiguration().screenLayout & 15) == 1) {
                                        z2 = true;
                                    }
                                    r5.A04 = z2;
                                    View view2 = ((AnonymousClass037) r5.A0A).A0A;
                                    if (view2 != null) {
                                        View findViewById2 = view2.findViewById(R.id.conversations_empty_nux);
                                        AnonymousClass01X r4 = r5.A0B;
                                        if (r4.A02().A06) {
                                            findViewById2.findViewById(R.id.instruction_arrow).setRotationY(180.0f);
                                        }
                                        if (Build.VERSION.SDK_INT >= 17) {
                                            View findViewById3 = findViewById2.findViewById(R.id.linear_layout);
                                            if (r4.A0M()) {
                                                AnonymousClass0Q7.A0X(findViewById3, 1);
                                            } else {
                                                AnonymousClass0Q7.A0X(findViewById3, 0);
                                            }
                                        }
                                        r5.A02 = new ViewOnClickCListenerShape4S0200000_I1(r5, view2, 26);
                                    } else {
                                        throw null;
                                    }
                                }
                                C52382b2 r02 = r5.A01;
                                if (r02 != null) {
                                    ((AnonymousClass0JW) r02).A00.cancel(true);
                                }
                                r5.A03 = false;
                                AnonymousClass02H r42 = r5.A0C;
                                synchronized (r42) {
                                    r42.A03.clear();
                                }
                                C52382b2 r03 = new C52382b2(r5, r5.A06, r5.A08);
                                r5.A01 = r03;
                                ((AnonymousClass0JW) r03).A00.executeOnExecutor(r42, new Object[0]);
                                r5.A03 = false;
                            }
                            C47732Ji r3 = this.A0O;
                            ObjectAnimator objectAnimator = r3.A00;
                            if (objectAnimator == null) {
                                View view3 = ((AnonymousClass037) r3.A0A).A0A;
                                if (view3 != null) {
                                    View findViewById4 = view3.findViewById(R.id.conversations_empty_nux).findViewById(R.id.instruction_arrow);
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById4, "translationX", TypedValue.applyDimension(1, -8.0f, findViewById4.getResources().getDisplayMetrics()));
                                    r3.A00 = ofFloat;
                                    ofFloat.setDuration(1100L);
                                    r3.A00.setRepeatCount(-1);
                                    r3.A00.setRepeatMode(2);
                                    r3.A00.setInterpolator(new AccelerateDecelerateInterpolator());
                                    r3.A00.start();
                                    return;
                                }
                                throw null;
                            } else if (!objectAnimator.isRunning()) {
                                r3.A00.start();
                            }
                        }
                    } else if (this.A17.A03()) {
                        if (viewGroup2.getChildCount() == 0) {
                            EmptyTellAFriendView emptyTellAFriendView = new EmptyTellAFriendView(A00());
                            viewGroup2.addView(emptyTellAFriendView);
                            emptyTellAFriendView.setInviteButtonClickListener(new ViewOnClickEBaseShape5S0100000_I1_3(this, 29));
                        }
                        viewGroup2.setVisibility(0);
                        A0z();
                        viewGroup3.setVisibility(8);
                        viewGroup4.setVisibility(8);
                        this.A06.setEmptyView(viewGroup2);
                    } else {
                        if (viewGroup3.getChildCount() == 0) {
                            ActivityC004902h A0A3 = A0A();
                            if (A0A3 != null) {
                                A0A3.getLayoutInflater().inflate(R.layout.empty_contacts_permissions_needed, viewGroup3, true);
                                viewGroup3.findViewById(R.id.button_open_permission_settings).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I1_1(this, 39));
                            } else {
                                throw null;
                            }
                        }
                        viewGroup3.setVisibility(0);
                        viewGroup2.setVisibility(8);
                        viewGroup4.setVisibility(8);
                        this.A06.setEmptyView(viewGroup3);
                    }
                } else {
                    findViewById.setVisibility(0);
                    this.A06.setEmptyView(findViewById);
                    viewGroup2.setVisibility(8);
                    viewGroup3.setVisibility(8);
                    viewGroup4.setVisibility(8);
                }
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4.A0X != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0y() {
        /*
            r4 = this;
            android.widget.TextView r3 = r4.A0B
            X.00D r0 = r4.A18
            android.content.SharedPreferences r2 = r0.A00
            java.lang.String r1 = "delete_chat_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r0 = 3
            if (r1 >= r0) goto L_0x0015
            boolean r1 = r4.A0X
            r0 = 0
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            r0 = 8
        L_0x0017:
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ConversationsFragment.A0y():void");
    }

    public final void A0z() {
        if (this.A0F == null) {
            C09590dC r1 = new C09590dC(A0A());
            this.A0F = r1;
            this.A04.addView(r1);
        }
        if (this.A0F.A04()) {
            this.A0F.A02();
            this.A04.setVisibility(0);
            return;
        }
        this.A04.setVisibility(8);
    }

    public final void A10(int i) {
        Object tag;
        if (!this.A0U.isEmpty()) {
            if (i > 2 || i < 0) {
                Log.w("conversations/undefined animation behaviour. defaulting to IMMEDIATELY_ANIMATE");
                i = 2;
            }
            this.A0V.clear();
            for (int i2 = 0; i2 < this.A06.getChildCount(); i2++) {
                View childAt = this.A06.getChildAt(i2);
                if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof ViewHolder))) {
                    ViewHolder viewHolder = (ViewHolder) tag;
                    if (this.A0U.contains(viewHolder.A02.A6w())) {
                        if (i == 0) {
                            View view = viewHolder.A05;
                            view.setBackgroundResource(0);
                            C28051Sr.A1P(view);
                            viewHolder.A0J.A03(false, false);
                        } else if (i == 1) {
                            this.A0V.add(viewHolder.A02.A6w());
                        } else if (i == 2) {
                            View view2 = viewHolder.A05;
                            view2.setBackgroundResource(0);
                            C28051Sr.A1P(view2);
                            viewHolder.A0J.A03(false, true);
                        }
                    }
                }
            }
            this.A0U.clear();
        }
    }

    public final void A11(int i) {
        A10(i);
        AbstractC06110Rt r0 = this.A0C;
        if (r0 != null) {
            r0.A00();
        }
        if (i == 1) {
            A0t();
        }
        AnonymousClass2J8 r02 = this.A0I;
        if (r02 != null) {
            r02.setEnableState(true);
        }
    }

    public final void A12(AnonymousClass02N r11, View view, SelectionCheckView selectionCheckView) {
        AnonymousClass01X r4;
        if (this.A0W) {
            if (this.A0U.contains(r11)) {
                this.A0U.remove(r11);
                if (this.A0U.isEmpty() && this.A0C != null) {
                    A11(2);
                }
                view.setBackgroundResource(0);
                view.postDelayed(new RunnableEBaseShape9S0100000_I1_4(view, 18), 1);
                selectionCheckView.A03(false, true);
                ActivityC004902h A0A2 = A0A();
                AnonymousClass03P r2 = this.A13;
                AnonymousClass01X r1 = this.A19;
                r4 = r1;
                C002001d.A2R(A0A2, r2, r1.A06(R.string.accessibility_announcement_chat_deselected));
                A03(r1, view);
            } else {
                this.A0U.add(r11);
                if (this.A0C == null && (A0A() instanceof ActivityC004802g)) {
                    A0u();
                }
                view.setBackgroundResource(R.color.home_row_selection);
                selectionCheckView.A03(true, true);
                r4 = this.A19;
                AnonymousClass0Q7.A0d(view, new AnonymousClass0Q9(new AnonymousClass0Q8[]{new AnonymousClass0Q8(32, R.string.accessibility_action_long_click_selected_chat_to_deselect)}, r4));
            }
            AbstractC06110Rt r0 = this.A0C;
            if (r0 != null) {
                r0.A01();
            }
            if (!this.A0U.isEmpty()) {
                C002001d.A2R(A0A(), this.A13, r4.A0A(R.plurals.n_items_selected, (long) this.A0U.size(), Integer.valueOf(this.A0U.size())));
            }
        }
    }

    public final boolean A13() {
        boolean z = false;
        if (SystemClock.elapsedRealtime() - this.A01 < 1000) {
            z = true;
        }
        this.A01 = SystemClock.elapsedRealtime();
        return z;
    }

    @Override // X.AbstractC07520Xz
    public void A23(AnonymousClass0XB r6) {
        if (TextUtils.isEmpty(this.A0J.A00.A01)) {
            if (this.A02 == 0) {
                this.A02 = SystemClock.uptimeMillis();
            }
        } else if (TextUtils.isEmpty(r6.A01)) {
            this.A02 = 0;
        }
        this.A0J.A00 = r6.clone();
        this.A0J.A02.filter(r6.A01);
    }

    @Override // X.AnonymousClass0Y5
    public void A2h() {
        this.A0Q = null;
    }

    @Override // X.AnonymousClass0Y6
    public void A3h() {
        this.A0W = false;
    }

    @Override // X.AnonymousClass0Y6
    public void A41() {
        this.A0W = true;
    }

    @Override // X.AnonymousClass0Y5
    public AnonymousClass02N A6g() {
        return this.A0Q;
    }

    @Override // X.AnonymousClass0Y2
    public String A7B() {
        return this.A19.A06(R.string.menuitem_new);
    }

    @Override // X.AnonymousClass0Y2
    public Drawable A7C() {
        Context A002 = A00();
        if (A002 != null) {
            return C004302a.A03(A002, R.drawable.ic_action_compose);
        }
        throw null;
    }

    @Override // X.AnonymousClass0Y5
    public List A8O() {
        return this.A0J.A01;
    }

    @Override // X.AnonymousClass0Y5
    public Set A8x() {
        return this.A0U;
    }

    @Override // X.AnonymousClass0Y5
    public void AEA(AnonymousClass02N r5, ViewHolder viewHolder) {
        if (this.A0C != null) {
            A12(r5, viewHolder.A05, viewHolder.A0J);
            return;
        }
        AnonymousClass008.A12("conversations/click/jid ", r5);
        if (viewHolder.A06.getVisibility() != 0 && !A13()) {
            Intent putExtra = Conversation.A05(A01(), r5).putExtra("start_t", SystemClock.uptimeMillis());
            Conversation.A0B(putExtra, this.A0J.A00);
            C09100cI.A02.ABx(703934026);
            A0h(putExtra);
        }
    }

    @Override // X.AnonymousClass0Y5
    public void AEB(AnonymousClass02N r4, View view, SelectionCheckView selectionCheckView) {
        if (this.A0C != null) {
            A12(r4, view, selectionCheckView);
        } else if (!A13()) {
            View findViewById = view.findViewById(R.id.contact_photo);
            QuickContactActivity.A04(A0A(), findViewById, r4, AnonymousClass0Q7.A0G(findViewById));
        }
    }

    @Override // X.AnonymousClass0Y5
    public void AEC(AbstractC007503q r4, ViewHolder viewHolder) {
        if (!A13()) {
            Intent A062 = Conversation.A06(A01(), ((C52392b3) viewHolder.A02).A00, this.A0J.A00.A01);
            Conversation.A0B(A062, this.A0J.A00);
            View currentFocus = A0A().getCurrentFocus();
            if (currentFocus != null) {
                this.A1t.A02(currentFocus);
            }
            C09100cI.A02.ABx(703934026);
            A0h(A062);
        }
    }

    @Override // X.AnonymousClass0Y5
    public void AED(AnonymousClass2CD r14) {
        AnonymousClass0EO r3 = this.A1X;
        if (r3.A0F.A05()) {
            AbstractC007503q A022 = r3.A0V.A02(r14);
            if (A022 instanceof C05390Oi) {
                Set set = r3.A0k;
                if (!set.contains(r14) && ((C05390Oi) A022).A00 == 3) {
                    set.add(r14);
                    r3.A0O.A0J(r3.A0f.A03(r14, r3.A0G.A05(), 2, A022.A0D(), ((C05400Oj) A022).A01));
                    C007003k A0A2 = r3.A0A.A0A(r14);
                    AnonymousClass08C r0 = r3.A0D;
                    r3.A0h.ANF(new RunnableEBaseShape1S0500000_I1(r3, r14, A022, r0.A02(A0A2), r0.A03(A0A2), 2));
                    return;
                }
                return;
            }
            return;
        }
        boolean A023 = AnonymousClass04j.A02(A0A());
        int i = R.string.network_required;
        if (A023) {
            i = R.string.network_required_airplane_on;
        }
        this.A0d.A06(i, 0);
    }

    @Override // X.AnonymousClass0Y5
    public void AHN(AnonymousClass02N r4, View view, SelectionCheckView selectionCheckView) {
        if (this.A0W) {
            A12(r4, view, selectionCheckView);
            return;
        }
        ActivityC004902h A0A2 = A0A();
        if (A0A2 != null) {
            this.A1U.A01 = 4;
            A0A2.openContextMenu(view);
        }
    }

    @Override // X.AnonymousClass0Y2
    public void AHO() {
        if (this.A17.A03()) {
            A0M(new Intent(A0A(), ContactPicker.class), 12, null);
        } else {
            RequestPermissionActivity.A0F(this, R.string.permission_contacts_access_request, R.string.permission_contacts_needed);
        }
    }

    @Override // X.AnonymousClass0Y5
    public boolean AMb(Jid jid) {
        return this.A0V.remove(jid);
    }

    @Override // X.AbstractC07520Xz
    public void ANS(C007003k r6) {
        if (!(this instanceof ArchivedConversationsFragment)) {
            AnonymousClass02N r4 = (AnonymousClass02N) r6.A02(AnonymousClass02N.class);
            this.A0Q = r4;
            if (r4 != null) {
                int i = 0;
                while (true) {
                    C47712Jg r1 = this.A0J;
                    if (i < r1.getCount()) {
                        if (r4.equals(((AbstractC10770fA) r1.A03.A0T.get(i)).A6w())) {
                            break;
                        }
                        i++;
                    } else {
                        i = 0;
                        break;
                    }
                }
                if (this.A06.getFirstVisiblePosition() >= i || this.A06.getLastVisiblePosition() <= i) {
                    this.A06.setTranscriptMode(0);
                    this.A06.setSelectionFromTop(i, this.A06.getHeight() / 3);
                }
            }
        }
    }

    @Override // X.AbstractC07520Xz
    public void AP1(boolean z) {
        if (z) {
            this.A1u.ANF(new RunnableEBaseShape9S0100000_I1_4(this, 17));
        }
    }

    @Override // X.AbstractC07520Xz
    public void AP2(boolean z) {
        C36901n6 r1;
        if (!z && (r1 = this.A0D) != null) {
            r1.A02(3);
        }
    }

    @Override // X.AnonymousClass037
    public void onConfigurationChanged(Configuration configuration) {
        super.A0U = true;
        AbstractC06110Rt r0 = this.A0C;
        if (r0 != null) {
            r0.A01();
        }
    }
}
