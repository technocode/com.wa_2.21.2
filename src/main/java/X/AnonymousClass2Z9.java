package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.facebook.redex.ViewOnClickEBaseShape1S0200000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.Conversation;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.ReportSpamDialogFragment;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.2Z9  reason: invalid class name */
public abstract class AnonymousClass2Z9 extends AnonymousClass1PD implements AnonymousClass1PE {
    public C007003k A00;
    public final int A01;
    public final ActivityC004802g A02;
    public final AbstractC004502c A03;
    public final AnonymousClass02M A04;
    public final AnonymousClass01I A05;
    public final C000300f A06;
    public final C04360Kb A07;
    public final AnonymousClass0HI A08;
    public final AnonymousClass1PN A09;
    public final AnonymousClass0BP A0A = new AnonymousClass2Z7(this);
    public final AnonymousClass08B A0B;
    public final AbstractC03780Hp A0C;
    public final C47242Ha A0D;
    public final AnonymousClass00C A0E;
    public final AnonymousClass01X A0F;
    public final C006903j A0G;
    public final AnonymousClass0AQ A0H;
    public final AnonymousClass0CG A0I;
    public final AnonymousClass0AS A0J;
    public final AnonymousClass02N A0K;
    public final AnonymousClass0BB A0L;
    public final AnonymousClass31y A0M;
    public final AnonymousClass325 A0N;
    public final AnonymousClass00T A0O;
    public final AnonymousClass0Fh A0P;
    public final boolean A0Q = true;

    public AnonymousClass2Z9(ActivityC004802g r2, AbstractC004502c r3, AbstractC03780Hp r4, AnonymousClass02M r5, AnonymousClass01I r6, AnonymousClass00T r7, C006903j r8, AnonymousClass325 r9, C000300f r10, C04360Kb r11, AnonymousClass0Fh r12, AnonymousClass01X r13, AnonymousClass1PN r14, AnonymousClass0AS r15, AnonymousClass08B r16, AnonymousClass31y r17, AnonymousClass0BB r18, AnonymousClass00C r19, AnonymousClass0HI r20, AnonymousClass0CG r21, C47242Ha r22, AnonymousClass0AQ r23, AnonymousClass02N r24, C007003k r25) {
        this.A02 = r2;
        this.A03 = r3;
        this.A0C = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A0O = r7;
        this.A0G = r8;
        this.A0N = r9;
        this.A06 = r10;
        this.A07 = r11;
        this.A0P = r12;
        this.A0F = r13;
        this.A09 = r14;
        this.A0J = r15;
        this.A0B = r16;
        this.A0M = r17;
        this.A0L = r18;
        this.A0E = r19;
        this.A08 = r20;
        this.A0I = r21;
        this.A0D = r22;
        this.A0H = r23;
        this.A0K = r24;
        this.A00 = r25;
        this.A01 = 17;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r3.A0G.A0E(r3.A0K) == false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00() {
        /*
            r3 = this;
            X.00f r1 = r3.A06
            X.01l r0 = X.AbstractC000400g.A0p
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0015
            X.03j r1 = r3.A0G
            X.02N r0 = r3.A0K
            boolean r0 = r1.A0E(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            r2 = 0
        L_0x0016:
            X.0BB r1 = r3.A0L
            X.02N r0 = r3.A0K
            X.0BG r0 = r1.A08(r0)
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x002a
            if (r2 != 0) goto L_0x002a
            r0 = 2131887995(0x7f12077b, float:1.9410613E38)
            return r0
        L_0x002a:
            r0 = 2131888014(0x7f12078e, float:1.9410651E38)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Z9.A00():int");
    }

    public SubMenu A01(Menu menu) {
        SubMenu addSubMenu = menu.addSubMenu(0, 1, 0, this.A0F.A06(R.string.more));
        addSubMenu.clearHeader();
        return addSubMenu;
    }

    public void A02(Menu menu) {
        if (this.A06.A0D(AbstractC000400g.A0w)) {
            menu.add(0, 3, 0, this.A0F.A06(R.string.export_attachment));
        }
    }

    public void A03(MenuItem menuItem, int i, boolean z) {
        View actionView = menuItem.getActionView();
        float f = 0.4f;
        if (z) {
            f = 1.0f;
        }
        actionView.setAlpha(f);
        actionView.setEnabled(z);
        if (z) {
            if (this.A0F.A0M()) {
                actionView.setOnTouchListener(new AnonymousClass2PR(0.0f, 0.0f, 0.2f, 0.0f));
            } else {
                actionView.setOnTouchListener(new AnonymousClass2PR(0.2f, 0.0f, 0.0f, 0.0f));
            }
            actionView.setOnClickListener(new ViewOnClickEBaseShape1S0200000_I1_0(this, menuItem, 29));
            actionView.setOnLongClickListener(new AnonymousClass2H3(this, i));
        }
    }

    @Override // X.AnonymousClass1PE
    public boolean AI8(MenuItem menuItem) {
        this.A0J.A01 = 6;
        int itemId = menuItem.getItemId();
        if (itemId != 16908332) {
            switch (itemId) {
                case 2:
                    this.A08.A06(this.A00);
                    return true;
                case 3:
                    if (this.A0E.A07()) {
                        Log.w("conversation/email-attachment/need-sd-card");
                        AbstractC004502c r2 = this.A03;
                        boolean A012 = AnonymousClass00C.A01();
                        int i = R.string.need_sd_card_shared_storage;
                        if (A012) {
                            i = R.string.need_sd_card;
                        }
                        r2.APo(i);
                        return true;
                    }
                    C47242Ha r8 = this.A0D;
                    ActivityC004802g r7 = this.A02;
                    AbstractC004502c r6 = this.A03;
                    AnonymousClass02N r4 = this.A0K;
                    C007003k r3 = this.A00;
                    if (r8.A05.A0B(r4, 1, null, 2).size() > 0) {
                        C002001d.A2O(r7, 10);
                        return true;
                    }
                    r8.A02(r7, r6, r3, false);
                    return true;
                case 4:
                    if (!this.A06.A0D(AbstractC000400g.A0p) || !this.A0G.A0E(this.A0K)) {
                        AnonymousClass0BB r0 = this.A0L;
                        AnonymousClass02N r1 = this.A0K;
                        if (r0.A08(r1).A09()) {
                            this.A0O.ANF(new RunnableEBaseShape8S0100000_I1_3(this, 47));
                            return true;
                        }
                        MuteDialogFragment.A00(r1).A0u(this.A02.A04(), "MuteDialogFragment");
                        return true;
                    }
                    this.A04.A06(R.string.chats_in_read_later_stay_muted, 0);
                    return true;
                case 5:
                    Log.i("conversation/menu/wallpaper/");
                    AnonymousClass1VY.A0N(this.A06, this.A02, this.A0K, this.A03, this.A01);
                    return true;
                case 6:
                    ActivityC004802g r32 = this.A02;
                    Intent intent = new Intent(r32, MediaGalleryActivity.class);
                    intent.putExtra("jid", this.A0K.getRawString());
                    r32.startActivity(intent);
                    return true;
                case 7:
                    this.A02.onSearchRequested();
                    return true;
                case 8:
                    C28051Sr.A1Y(this.A04, this.A0O, this.A0I, this.A0K, new AnonymousClass2Z8(this));
                    return true;
                case 9:
                    this.A03.APm(ReportSpamDialogFragment.A00(this.A0K, "overflow_menu"));
                    return true;
                default:
                    return false;
            }
        } else {
            this.A02.finish();
            return true;
        }
    }

    @Override // X.AnonymousClass1PE
    public boolean AIi(Menu menu) {
        boolean z = false;
        if (((Conversation) this.A0C).A0q.getCount() > 0) {
            z = true;
        }
        menu.findItem(8).setVisible(z);
        menu.findItem(7).setVisible(z);
        MenuItem findItem = menu.findItem(3);
        if (findItem != null) {
            findItem.setVisible(z);
        }
        MenuItem findItem2 = menu.findItem(9);
        if (findItem2 != null) {
            findItem2.setVisible(true);
        }
        MenuItem findItem3 = menu.findItem(1);
        if (findItem3.getSubMenu().hasVisibleItems()) {
            findItem3.setVisible(true);
            return true;
        }
        findItem3.setVisible(false);
        return true;
    }

    @Override // X.AnonymousClass1PD
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0B.A01(this.A0A);
    }

    @Override // X.AnonymousClass1PD
    public void onActivityDestroyed(Activity activity) {
        this.A0B.A00(this.A0A);
    }
}
