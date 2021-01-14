package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.Collections;

/* renamed from: X.0d2  reason: invalid class name and case insensitive filesystem */
public class C09490d2 implements AbstractC03680Hf {
    public AnonymousClass02N A00;
    public WeakReference A01;
    public WeakReference A02;
    public final int A03;
    public final AnonymousClass02M A04;
    public final C000300f A05;
    public final C04360Kb A06;
    public final AnonymousClass0HI A07;
    public final C017009c A08;
    public final C017109d A09;
    public final AnonymousClass01A A0A;
    public final AnonymousClass08B A0B;
    public final AnonymousClass0HN A0C;
    public final C04410Kg A0D;
    public final C09480d1 A0E;
    public final AnonymousClass00S A0F;
    public final AnonymousClass01X A0G;
    public final C006903j A0H;
    public final AnonymousClass01T A0I;
    public final AnonymousClass0EO A0J;
    public final AnonymousClass09H A0K;
    public final AnonymousClass0FE A0L;
    public final AnonymousClass0BB A0M;
    public final AnonymousClass31y A0N;
    public final AnonymousClass325 A0O;
    public final C09110cJ A0P;
    public final C09060cE A0Q;
    public final AnonymousClass00T A0R;

    @Override // X.AbstractC03680Hf
    public void AGV() {
    }

    @Override // X.AbstractC03680Hf
    public void AGW() {
    }

    public C09490d2(Context context, AnonymousClass0LW r3, AnonymousClass00S r4, AnonymousClass02M r5, AnonymousClass00T r6, C006903j r7, AnonymousClass325 r8, C000300f r9, C04360Kb r10, AnonymousClass09H r11, AnonymousClass01A r12, AnonymousClass01X r13, AnonymousClass08B r14, AnonymousClass0EO r15, AnonymousClass31y r16, C09110cJ r17, AnonymousClass0BB r18, AnonymousClass0HI r19, C09060cE r20, AnonymousClass0HN r21, AnonymousClass0FE r22, C017109d r23, C017009c r24, C04410Kg r25, AnonymousClass01T r26, C09480d1 r27, int i) {
        this.A01 = new WeakReference(context);
        this.A02 = new WeakReference(r3);
        this.A0F = r4;
        this.A04 = r5;
        this.A0R = r6;
        this.A0H = r7;
        this.A0O = r8;
        this.A05 = r9;
        this.A06 = r10;
        this.A0K = r11;
        this.A0A = r12;
        this.A0G = r13;
        this.A0B = r14;
        this.A0J = r15;
        this.A0N = r16;
        this.A0P = r17;
        this.A0M = r18;
        this.A07 = r19;
        this.A0Q = r20;
        this.A0C = r21;
        this.A0L = r22;
        this.A09 = r23;
        this.A08 = r24;
        this.A0D = r25;
        this.A0I = r26;
        this.A0E = r27;
        this.A03 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (r7.A0E(r12) == false) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.view.ContextMenu r11, X.AnonymousClass02N r12, boolean r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 478
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09490d2.A00(android.view.ContextMenu, X.02N, boolean, boolean):void");
    }

    public boolean A01(int i) {
        UserJid userJid;
        if (this.A00 == null || i != this.A03) {
            return false;
        }
        this.A0C.A06();
        C007003k A0A2 = this.A0A.A0A(this.A00);
        if (A0A2.A08() && (userJid = (UserJid) A0A2.A02(UserJid.class)) != null) {
            new C40141sh(this.A09.A01(), userJid, null, this.A04, this.A0K, this.A0B, this.A08).A00(this);
        }
        this.A0P.A00();
        return true;
    }

    public boolean A02(Activity activity, AnonymousClass037 r13, MenuItem menuItem) {
        AnonymousClass0LW r4 = (AnonymousClass0LW) this.A02.get();
        WeakReference weakReference = this.A01;
        weakReference.get();
        if (!(weakReference == null || r4 == null || this.A00 == null)) {
            if (menuItem.getItemId() == R.id.menuitem_conversations_contact_info) {
                C007003k A0A2 = this.A0A.A0A(this.A00);
                if (A0A2.A08 != null) {
                    ContactInfoActivity.A07(A0A2, activity, null);
                }
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_delete) {
                C09480d1 r1 = this.A0E;
                AnonymousClass02N r6 = this.A00;
                C28051Sr.A1Y(r1.A00, r1.A0E, r1.A09, r6, new C52372b1(r1, r4, r6));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_new_contact) {
                Intent A022 = this.A0Q.A02(this.A0A.A0A(this.A00), this.A00, true);
                if (activity != null) {
                    A022.setComponent(A022.resolveActivity(activity.getPackageManager()));
                    if (A022.getComponent() != null) {
                        r13.A0M(A022, this.A03, null);
                        this.A0P.A02(true, 7);
                        return true;
                    }
                    Log.w("conversations/context system contact list could not found");
                    this.A04.A06(R.string.unimplemented, 0);
                    return true;
                }
                throw null;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_add_to_existing_contact) {
                try {
                    r13.A0M(this.A0Q.A02(this.A0A.A0A(this.A00), this.A00, false), this.A03, null);
                    this.A0P.A02(false, 7);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    this.A04.A06(R.string.activity_not_found, 0);
                    return true;
                }
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_pin) {
                if (((AbstractCollection) this.A0M.A0F()).size() + 1 > 3) {
                    this.A04.A0C(this.A0G.A0A(R.plurals.cannot_pin, 3, 3), 0);
                    return true;
                }
                this.A0R.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 36));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unpin) {
                this.A0R.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 34));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mute) {
                MuteDialogFragment.A01(Collections.singleton(this.A00)).A0u(r4, null);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unmute) {
                if (!this.A05.A0D(AbstractC000400g.A0p) || !this.A0H.A0E(this.A00)) {
                    this.A0R.ANF(new RunnableEBaseShape2S0100000_I0_2(this, 35));
                    return true;
                }
                this.A04.A06(R.string.chats_in_read_later_stay_muted, 0);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_archive) {
                C09480d1 r42 = this.A0E;
                AnonymousClass02N r7 = this.A00;
                r42.A07.A03(r7, true);
                r42.A0C.A01(3, r7, 0, 0);
                r42.A0E.ANF(new RunnableEBaseShape2S0200000_I0_1(r42, r7, 10));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_unarchive) {
                C09480d1 r2 = this.A0E;
                AnonymousClass02N r5 = this.A00;
                r2.A07.A03(r5, false);
                r2.A0C.A01(4, r5, 0, 0);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_read) {
                this.A0D.A03(this.A00, true, true);
                this.A0L.A04();
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_mark_unread) {
                this.A0D.A01(this.A00, true);
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_create_shortcuit) {
                this.A07.A06(this.A0A.A0A(this.A00));
                return true;
            } else if (menuItem.getItemId() == R.id.menuitem_conversations_group_info) {
                C007003k A0A3 = this.A0A.A0A(this.A00);
                if (!AnonymousClass1VY.A0T(A0A3.A09)) {
                    GroupChatInfo.A05(A0A3, activity, null);
                    return true;
                } else if (activity != null) {
                    ListChatInfo.A04(A0A3, activity, null);
                    return true;
                } else {
                    throw null;
                }
            }
        }
        return false;
    }
}
