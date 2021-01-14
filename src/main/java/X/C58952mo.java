package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.JoinableEducationDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2mo  reason: invalid class name and case insensitive filesystem */
public class C58952mo extends AnonymousClass2Z9 {
    public final AnonymousClass0I5 A00;
    public final AnonymousClass01A A01;
    public final AnonymousClass00D A02;
    public final AnonymousClass01T A03;
    public final C04490Ko A04;
    public final AnonymousClass02U A05;

    public C58952mo(ActivityC004802g r28, AbstractC004502c r29, AbstractC03780Hp r30, AnonymousClass02M r31, AnonymousClass01I r32, AnonymousClass00T r33, C006903j r34, AnonymousClass325 r35, C000300f r36, C04360Kb r37, AnonymousClass0Fh r38, AnonymousClass01A r39, C014308b r40, AnonymousClass01X r41, AnonymousClass0I5 r42, AnonymousClass1PN r43, AnonymousClass0AS r44, AnonymousClass08B r45, AnonymousClass31y r46, AnonymousClass0BB r47, AnonymousClass00C r48, AnonymousClass0HI r49, C04490Ko r50, AnonymousClass0CG r51, AnonymousClass00D r52, C47242Ha r53, AnonymousClass01T r54, AnonymousClass0AQ r55, AnonymousClass02U r56, C007003k r57) {
        super(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r41, r43, r44, r45, r46, r47, r48, r49, r51, r53, r55, r56, r57);
        this.A01 = r39;
        this.A00 = r42;
        this.A04 = r50;
        this.A02 = r52;
        this.A03 = r54;
        this.A05 = r56;
    }

    public final void A04() {
        AnonymousClass01T r0 = this.A03;
        AnonymousClass02U r1 = this.A05;
        ArrayList arrayList = new ArrayList(r0.A01(r1).A03().A02());
        AnonymousClass01I r02 = super.A05;
        r02.A04();
        arrayList.remove(r02.A03);
        C002001d.A2v(this.A01, r1, arrayList, null, super.A02, true, 24);
    }

    public final boolean A05() {
        C28351Tz r1;
        if (AnonymousClass0Fh.A02() || ((Conversation) this.A0C).A1J() || (super.A00.A0Q && !this.A03.A05(this.A05))) {
            return false;
        }
        C05350Oe A032 = this.A03.A01(this.A05).A03();
        Set set = A032.A00;
        if (set.size() == 1) {
            AnonymousClass01I r0 = super.A05;
            r0.A04();
            if (set.contains(r0.A03)) {
                return false;
            }
        }
        int size = set.size();
        C000300f r2 = this.A06;
        if (size <= Math.min(r2.A06(AbstractC000400g.A39), r2.A06(AbstractC000400g.A3f))) {
            return true;
        }
        Iterator it = A032.iterator();
        do {
            r1 = (C28351Tz) it;
            if (!r1.hasNext()) {
                return false;
            }
        } while (!this.A01.A0S((UserJid) r1.next()));
        return true;
    }

    @Override // X.AnonymousClass1PE
    public void AEm(Menu menu) {
        Log.i("groupconversationmenu/oncreateoptionsmenu");
        AnonymousClass01T r2 = this.A03;
        AnonymousClass02U r1 = this.A05;
        if (r2.A04(r1) && !super.A00.A0S) {
            C000300f r5 = this.A06;
            if (!r5.A0D(AbstractC000400g.A16) || r2.A01(r1).A01.size() > Math.min(r5.A06(AbstractC000400g.A39), r5.A06(AbstractC000400g.A3f))) {
                boolean A052 = A05();
                MenuItem add = menu.add(0, 24, 0, this.A0F.A06(R.string.group_call));
                add.setActionView(R.layout.group_call_menu_item);
                A03(add, R.string.group_call, A052);
                add.setShowAsAction(2);
            } else {
                boolean A053 = A05();
                AnonymousClass01X r8 = this.A0F;
                MenuItem add2 = menu.add(0, 26, 0, r8.A06(R.string.video_call));
                add2.setActionView(R.layout.video_call_menu_item);
                A03(add2, R.string.video_call, A053);
                MenuItem add3 = menu.add(0, 25, 0, r8.A06(R.string.audio_call));
                add3.setActionView(R.layout.audio_call_menu_item);
                add3.getActionView().setContentDescription(r8.A06(R.string.audio_call));
                A03(add3, R.string.audio_call, A053);
                add2.setShowAsAction(2);
                add3.setShowAsAction(2);
            }
        }
        AnonymousClass01X r52 = this.A0F;
        menu.add(0, 21, 0, r52.A06(R.string.group_info));
        menu.add(0, 6, 0, r52.A06(R.string.view_group_media));
        menu.add(0, 7, 0, r52.A06(R.string.search));
        menu.add(0, 4, 0, r52.A06(A00()));
        menu.add(0, 5, 0, r52.A06(R.string.wallpaper));
        SubMenu A012 = A01(menu);
        A012.add(0, 9, 0, r52.A06(R.string.report_spam));
        A012.add(0, 23, 0, r52.A06(R.string.exit_group));
        A012.add(0, 8, 0, r52.A06(R.string.clear_chat));
        A02(A012);
        A012.add(0, 2, 0, r52.A06(R.string.add_shortcut_short));
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.AnonymousClass2Z9, X.AnonymousClass1PE
    public boolean AI8(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 21:
                C007003k r4 = super.A00;
                ActivityC004802g r3 = super.A02;
                GroupChatInfo.A05(r4, r3, AnonymousClass2UT.A01(r3, r3.findViewById(R.id.transition_start), this.A09.A01(R.string.transition_photo)));
                return true;
            case 22:
                break;
            case 23:
                AbstractC004502c r42 = super.A03;
                r42.APv(0, R.string.register_wait_message);
                this.A00.A05(this.A0K);
                this.A0O.ANC(new C10350eU(r42, this.A04, this.A05), new Object[0]);
                break;
            case 24:
                C000300f r0 = this.A06;
                AnonymousClass00D r43 = this.A02;
                if (C002001d.A3O(r0, r43)) {
                    JoinableEducationDialogFragment A002 = JoinableEducationDialogFragment.A00(false, new AnonymousClass2H9(this));
                    AnonymousClass0LW A042 = super.A02.A04();
                    if (A042 != null) {
                        AnonymousClass0QB r02 = new AnonymousClass0QB(A042);
                        r02.A0A(0, A002, null, 1);
                        r02.A01();
                        r43.A0L();
                        return true;
                    }
                    throw null;
                }
                A04();
                return true;
            case 25:
                ((Conversation) this.A0C).A16(super.A00, false);
                return true;
            case 26:
                ((Conversation) this.A0C).A16(super.A00, true);
                return true;
            default:
                return super.AI8(menuItem);
        }
        return true;
    }

    @Override // X.AnonymousClass2Z9, X.AnonymousClass1PE
    public boolean AIi(Menu menu) {
        StringBuilder A0S = AnonymousClass008.A0S("groupconversationmenu/onprepareoptionsmenu ");
        A0S.append(menu.size());
        Log.i(A0S.toString());
        if (menu.size() == 0) {
            return false;
        }
        menu.findItem(4).setTitle(this.A0F.A06(A00()));
        menu.findItem(1).getSubMenu().findItem(23).setVisible(this.A03.A04(this.A05));
        super.AIi(menu);
        return true;
    }
}
