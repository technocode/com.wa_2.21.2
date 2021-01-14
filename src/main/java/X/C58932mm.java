package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2mm  reason: invalid class name and case insensitive filesystem */
public class C58932mm extends AnonymousClass2Z9 {
    public final C02780Dk A00;
    public final AnonymousClass0GG A01;
    public final C017009c A02;
    public final C27831Rq A03;
    public final AnonymousClass01P A04;

    public C58932mm(ActivityC004802g r27, AbstractC004502c r28, AbstractC03780Hp r29, AnonymousClass02M r30, AnonymousClass01I r31, AnonymousClass00T r32, C006903j r33, AnonymousClass325 r34, C000300f r35, C04360Kb r36, C02780Dk r37, AnonymousClass0Fh r38, C014308b r39, AnonymousClass01X r40, AnonymousClass1PN r41, AnonymousClass0AS r42, AnonymousClass08B r43, AnonymousClass0GG r44, AnonymousClass31y r45, AnonymousClass0BB r46, AnonymousClass00C r47, AnonymousClass0HI r48, AnonymousClass0CG r49, AnonymousClass01P r50, C47242Ha r51, C017009c r52, C27831Rq r53, AnonymousClass0AQ r54, AnonymousClass02N r55, C007003k r56) {
        super(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r40, r41, r42, r43, r45, r46, r47, r48, r49, r51, r54, r55, r56);
        this.A00 = r37;
        this.A01 = r44;
        this.A04 = r50;
        this.A02 = r52;
        this.A03 = r53;
    }

    @Override // X.AnonymousClass1PE
    public void AEm(Menu menu) {
        boolean z;
        boolean z2;
        Log.i("contactconversationmenu/oncreateoptionsmenu");
        AnonymousClass02N r5 = this.A0K;
        if (AnonymousClass1VY.A0a(r5)) {
            AnonymousClass01X r52 = this.A0F;
            menu.add(0, 21, 0, r52.A06(R.string.view_contact));
            menu.add(0, 6, 0, r52.A06(R.string.view_conversation_media));
            menu.add(0, 7, 0, r52.A06(R.string.search));
            menu.add(0, 4, 0, r52.A06(A00()));
            menu.add(0, 5, 0, r52.A06(R.string.wallpaper));
            SubMenu A012 = A01(menu);
            A012.clearHeader();
            A012.add(0, 8, 0, r52.A06(R.string.clear_chat));
            A02(A012);
            return;
        }
        if (!this.A06.A0D(AbstractC000400g.A1l) || !super.A00.A08()) {
            if (AnonymousClass0Fh.A02() || ((Conversation) this.A0C).A1J()) {
                z = false;
            } else {
                z = !this.A05.A09(r5);
            }
            AnonymousClass01X r13 = this.A0F;
            MenuItem add = menu.add(0, 26, 0, r13.A06(R.string.video_call));
            add.setActionView(R.layout.video_call_menu_item);
            A03(add, R.string.video_call, z);
            MenuItem add2 = menu.add(0, 25, 0, r13.A06(R.string.audio_call));
            add2.setActionView(R.layout.audio_call_menu_item);
            add2.getActionView().setContentDescription(r13.A06(R.string.audio_call));
            A03(add2, R.string.audio_call, z);
            add.setShowAsAction(2);
            add2.setShowAsAction(2);
        } else {
            UserJid userJid = (UserJid) r5;
            if (userJid != null) {
                C017009c r7 = this.A02;
                r7.A08.ANC(new C41761vb(r7, userJid, new C51452Yu(this, menu)), new Void[0]);
            }
            if (!this.A04.A02((UserJid) super.A00.A02(UserJid.class))) {
                if (AnonymousClass0Fh.A02() || ((Conversation) this.A0C).A1J()) {
                    z2 = false;
                } else {
                    z2 = !this.A05.A09(r5);
                }
                AnonymousClass01X r11 = this.A0F;
                MenuItem add3 = menu.add(0, 28, 0, r11.A06(R.string.call));
                add3.setActionView(R.layout.audio_video_call_menu_item);
                add3.getActionView().setContentDescription(r11.A06(R.string.call));
                A03(add3, R.string.call, z2);
                add3.setShowAsAction(2);
            }
        }
        if (super.A00.A08()) {
            AnonymousClass01X r53 = this.A0F;
            menu.add(0, 21, 0, r53.A06(R.string.view_contact));
            menu.add(0, 22, 0, r53.A06(R.string.add_contact));
            menu.add(0, 9, 0, r53.A06(R.string.report_spam));
            menu.add(0, 23, 0, r53.A06(R.string.block));
            menu.add(0, 24, 0, r53.A06(R.string.unblock));
            menu.add(0, 7, 0, r53.A06(R.string.search));
            menu.add(0, 4, 0, r53.A06(A00()));
            menu.add(0, 5, 0, r53.A06(R.string.wallpaper));
            SubMenu A013 = A01(menu);
            A013.clearHeader();
            A013.add(0, 6, 0, r53.A06(R.string.view_conversation_media));
            A013.add(0, 8, 0, r53.A06(R.string.clear_chat));
            A02(A013);
            A013.add(0, 2, 0, r53.A06(R.string.add_shortcut_short));
            return;
        }
        AnonymousClass01X r54 = this.A0F;
        menu.add(0, 21, 0, r54.A06(R.string.view_contact));
        menu.add(0, 22, 0, r54.A06(R.string.add_contact));
        menu.add(0, 6, 0, r54.A06(R.string.view_conversation_media));
        menu.add(0, 7, 0, r54.A06(R.string.search));
        menu.add(0, 4, 0, r54.A06(A00()));
        menu.add(0, 5, 0, r54.A06(R.string.wallpaper));
        SubMenu A014 = A01(menu);
        A014.clearHeader();
        A014.add(0, 9, 0, r54.A06(R.string.report_spam));
        A014.add(0, 23, 0, r54.A06(R.string.block));
        A014.add(0, 24, 0, r54.A06(R.string.unblock));
        A014.add(0, 8, 0, r54.A06(R.string.clear_chat));
        A02(A014);
        A014.add(0, 2, 0, r54.A06(R.string.add_shortcut_short));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008e, code lost:
        if (r10.A00.A08() == false) goto L_0x0090;
     */
    @Override // X.AnonymousClass2Z9, X.AnonymousClass1PE
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AI8(android.view.MenuItem r11) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58932mm.AI8(android.view.MenuItem):boolean");
    }

    @Override // X.AnonymousClass2Z9, X.AnonymousClass1PE
    public boolean AIi(Menu menu) {
        StringBuilder A0S = AnonymousClass008.A0S("contactconversationmenu/onprepareoptionsmenu ");
        A0S.append(menu.size());
        Log.i(A0S.toString());
        boolean z = false;
        if (menu.size() == 0) {
            return false;
        }
        menu.findItem(4).setTitle(this.A0F.A06(A00()));
        AnonymousClass02N r4 = this.A0K;
        if (!AnonymousClass1VY.A0a(r4)) {
            MenuItem findItem = menu.findItem(21);
            boolean z2 = false;
            if (super.A00.A08 != null) {
                z2 = true;
            }
            findItem.setVisible(z2);
            MenuItem findItem2 = menu.findItem(22);
            if (super.A00.A08 == null) {
                z = true;
            }
            findItem2.setVisible(z);
            boolean A0H = this.A01.A0H(UserJid.of(r4));
            menu.findItem(23).setVisible(!A0H);
            menu.findItem(24).setVisible(A0H);
        }
        super.AIi(menu);
        return true;
    }
}
