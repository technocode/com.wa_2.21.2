package X;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import com.whatsapp.MuteDialogFragment;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import com.whatsapp.group.GroupChatInfo;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.2av  reason: invalid class name and case insensitive filesystem */
public class C52312av implements AbstractC06100Rs {
    public MenuItem A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public MenuItem A05;
    public MenuItem A06;
    public MenuItem A07;
    public MenuItem A08;
    public MenuItem A09;
    public MenuItem A0A;
    public MenuItem A0B;
    public MenuItem A0C;
    public MenuItem A0D;
    public final C09020cA A0E = new C09020cA();
    public final /* synthetic */ ConversationsFragment A0F;

    public C52312av(ConversationsFragment conversationsFragment) {
        this.A0F = conversationsFragment;
    }

    @Override // X.AbstractC06100Rs
    public boolean ACa(AbstractC06110Rt r13, MenuItem menuItem) {
        Object tag;
        int itemId = menuItem.getItemId();
        ConversationsFragment conversationsFragment = this.A0F;
        AnonymousClass0AS r5 = conversationsFragment.A1U;
        int i = 5;
        if (conversationsFragment.A0U.size() == 1) {
            i = 1;
        }
        r5.A01 = i;
        if (itemId == R.id.menuitem_conversations_archive) {
            ArrayList arrayList = new ArrayList(conversationsFragment.A0U);
            Set A0F2 = conversationsFragment.A1j.A0F();
            conversationsFragment.A11(0);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    AnonymousClass02N r8 = (AnonymousClass02N) it.next();
                    if (!AnonymousClass1VY.A0d(r8)) {
                        conversationsFragment.A1A.A03(r8, true);
                        conversationsFragment.A1b.A01(3, r8, 0, 0);
                    }
                }
                conversationsFragment.A1u.ANF(new RunnableEBaseShape2S0300000_I1(this, arrayList, A0F2, 25));
            }
            return true;
        } else if (itemId == R.id.menuitem_conversations_unarchive) {
            ArrayList arrayList2 = new ArrayList(conversationsFragment.A0U);
            conversationsFragment.A11(0);
            conversationsFragment.A06.post(new RunnableEBaseShape7S0200000_I1_2(this, arrayList2, 30));
            return true;
        } else if (itemId == R.id.menuitem_conversations_delete) {
            AnonymousClass02N A002 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A0R = A002;
            if (A002 != null) {
                C09480d1 r52 = conversationsFragment.A0L;
                C28051Sr.A1Y(r52.A00, r52.A0E, r52.A09, A002, new C52372b1(r52, ((AnonymousClass037) conversationsFragment).A0H, A002));
            } else {
                AnonymousClass0LW r3 = ((AnonymousClass037) conversationsFragment).A0H;
                if (!(r3 == null || conversationsFragment.A0U.size() == 0)) {
                    C52302au r6 = new C52302au(this, r3);
                    AnonymousClass02M r53 = conversationsFragment.A0d;
                    AnonymousClass00T r4 = conversationsFragment.A1u;
                    AnonymousClass3SC r2 = new AnonymousClass3SC(conversationsFragment.A1Q, conversationsFragment.A0U, r6);
                    r4.ANC(r2, new Void[0]);
                    r53.A02.postDelayed(new RunnableEBaseShape6S0200000_I1_1(r2, r6, 48), 500);
                    return true;
                }
            }
            return true;
        } else if (itemId == R.id.menuitem_conversations_leave) {
            AnonymousClass02N A003 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A0R = A003;
            if (A003 != null) {
                C09480d1 r54 = conversationsFragment.A0L;
                C28051Sr.A1Y(r54.A00, r54.A0E, r54.A09, A003, new C52372b1(r54, ((AnonymousClass037) conversationsFragment).A0H, A003));
            } else {
                AnonymousClass0LW r55 = ((AnonymousClass037) conversationsFragment).A0H;
                if (r55 != null) {
                    conversationsFragment.A1u.ANC(new C10710f4(r55, (DialogFragment) new ConversationsFragment.BulkLeaveGroupsDialogFragment(), conversationsFragment.A1R, (Set) conversationsFragment.A0U, false), new Object[0]);
                    return true;
                }
            }
            return true;
        } else if (itemId == R.id.menuitem_conversations_mute) {
            AnonymousClass02N A004 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A0R = A004;
            if (A004 != null) {
                MuteDialogFragment A012 = MuteDialogFragment.A01(Collections.singleton(A004));
                AnonymousClass0LW r0 = ((AnonymousClass037) conversationsFragment).A0H;
                if (r0 != null) {
                    A012.A0u(r0, null);
                    return true;
                }
                throw null;
            }
            MuteDialogFragment A013 = MuteDialogFragment.A01(conversationsFragment.A0U);
            AnonymousClass0LW r02 = ((AnonymousClass037) conversationsFragment).A0H;
            if (r02 != null) {
                A013.A0u(r02, null);
                return true;
            }
            throw null;
        } else if (itemId == R.id.menuitem_conversations_unmute) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(conversationsFragment.A0U);
            conversationsFragment.A11(1);
            conversationsFragment.A1u.ANF(new RunnableEBaseShape7S0200000_I1_2(this, linkedHashSet, 28));
            return true;
        } else if (itemId == R.id.menuitem_conversations_pin) {
            HashSet hashSet = new HashSet(conversationsFragment.A0U);
            Set A0F3 = conversationsFragment.A1j.A0F();
            hashSet.removeAll(A0F3);
            int size = hashSet.size();
            if (((AbstractCollection) A0F3).size() + size > 3) {
                conversationsFragment.A0d.A0C(conversationsFragment.A19.A0A(R.plurals.cannot_pin, 3, 3), 0);
                return true;
            }
            conversationsFragment.A11(1);
            conversationsFragment.A1u.ANF(new RunnableEBaseShape1S0201000_I1(hashSet, size, this, 13));
            return true;
        } else if (itemId == R.id.menuitem_conversations_unpin) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(conversationsFragment.A0U);
            conversationsFragment.A11(1);
            conversationsFragment.A1u.ANF(new RunnableEBaseShape7S0200000_I1_2(this, linkedHashSet2, 29));
            return true;
        } else if (itemId == R.id.menuitem_conversations_create_shortcuit) {
            AnonymousClass02N A005 = ConversationsFragment.A00(conversationsFragment);
            conversationsFragment.A0R = A005;
            if (A005 != null) {
                conversationsFragment.A0k.A06(conversationsFragment.A0s.A0A(A005));
            }
            conversationsFragment.A11(2);
            return true;
        } else {
            if (itemId == R.id.menuitem_conversations_contact_info) {
                AnonymousClass02N A006 = ConversationsFragment.A00(conversationsFragment);
                conversationsFragment.A0R = A006;
                if (A006 != null) {
                    C007003k A0A2 = conversationsFragment.A0s.A0A(A006);
                    conversationsFragment.A11(2);
                    if (A0A2.A08 != null) {
                        ContactInfoActivity.A07(A0A2, conversationsFragment.A0A(), null);
                        return true;
                    }
                    boolean A0T = AnonymousClass1VY.A0T(A0A2.A09);
                    ActivityC004902h A0A3 = conversationsFragment.A0A();
                    if (!A0T) {
                        GroupChatInfo.A05(A0A2, A0A3, null);
                        return true;
                    } else if (A0A3 != null) {
                        ListChatInfo.A04(A0A2, A0A3, null);
                        return true;
                    } else {
                        throw null;
                    }
                }
            } else if (itemId == R.id.menuitem_conversations_add_new_contact) {
                AnonymousClass02N A007 = ConversationsFragment.A00(conversationsFragment);
                conversationsFragment.A0R = A007;
                if (A007 != null) {
                    C007003k A0A4 = conversationsFragment.A0s.A0A(A007);
                    CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
                    createOrAddToContactsDialog.A00 = new C52292at(conversationsFragment, A0A4);
                    createOrAddToContactsDialog.A0u(((AnonymousClass037) conversationsFragment).A0H, null);
                    return true;
                }
            } else if (itemId == R.id.menuitem_conversations_mark_read) {
                Iterator it2 = conversationsFragment.A0U.iterator();
                while (it2.hasNext()) {
                    AnonymousClass02N r42 = (AnonymousClass02N) it2.next();
                    if (!AnonymousClass1VY.A0d(r42)) {
                        C04410Kg r32 = conversationsFragment.A0z;
                        if (conversationsFragment.A00() != null) {
                            r32.A03(r42, true, true);
                            conversationsFragment.A1c.A04();
                        } else {
                            throw null;
                        }
                    }
                }
                conversationsFragment.A11(1);
                return true;
            } else if (itemId == R.id.menuitem_conversations_mark_unread) {
                Iterator it3 = conversationsFragment.A0U.iterator();
                while (it3.hasNext()) {
                    AnonymousClass02N r33 = (AnonymousClass02N) it3.next();
                    if (!AnonymousClass1VY.A0T(r33) && !AnonymousClass1VY.A0d(r33)) {
                        conversationsFragment.A0z.A01(r33, true);
                    }
                }
                conversationsFragment.A11(1);
                return true;
            } else if (itemId == R.id.menuitem_conversations_select_all) {
                if (conversationsFragment != null) {
                    conversationsFragment.A0V.clear();
                    for (int i2 = 0; i2 < conversationsFragment.A06.getChildCount(); i2++) {
                        View childAt = conversationsFragment.A06.getChildAt(i2);
                        if (!(childAt == null || (tag = childAt.getTag()) == null || !(tag instanceof ViewHolder))) {
                            ViewHolder viewHolder = (ViewHolder) tag;
                            AnonymousClass02N A6w = viewHolder.A02.A6w();
                            if (!conversationsFragment.A0U.contains(A6w)) {
                                conversationsFragment.A0U.add(A6w);
                                viewHolder.A05.setBackgroundResource(R.color.home_row_selection);
                                viewHolder.A0J.A03(true, true);
                            }
                        }
                    }
                    Iterator it4 = conversationsFragment.A0s().iterator();
                    while (it4.hasNext()) {
                        AnonymousClass02N A6w2 = ((AbstractC10770fA) it4.next()).A6w();
                        if (!conversationsFragment.A0U.contains(A6w2) && !AnonymousClass1VY.A0d(A6w2)) {
                            conversationsFragment.A0U.add(A6w2);
                        }
                    }
                    if (conversationsFragment.A0C != null) {
                        conversationsFragment.A0C.A04(String.format(conversationsFragment.A19.A0I(), "%d", Integer.valueOf(conversationsFragment.A0U.size())));
                        conversationsFragment.A0C.A01();
                    }
                    if (!conversationsFragment.A0U.isEmpty()) {
                        ActivityC004902h A0A5 = conversationsFragment.A0A();
                        if (A0A5 != null) {
                            C002001d.A2R(A0A5, conversationsFragment.A13, conversationsFragment.A19.A0A(R.plurals.n_items_selected, (long) conversationsFragment.A0U.size(), Integer.valueOf(conversationsFragment.A0U.size())));
                        } else {
                            throw null;
                        }
                    }
                    return true;
                }
                throw null;
            }
            return false;
        }
    }

    @Override // X.AbstractC06100Rs
    public boolean AEi(AbstractC06110Rt r8, Menu menu) {
        this.A06 = menu.add(0, R.id.menuitem_conversations_pin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_pin);
        this.A0A = menu.add(0, R.id.menuitem_conversations_unpin, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unpin);
        this.A03 = menu.add(0, R.id.menuitem_conversations_delete, 0, (CharSequence) null).setIcon(R.drawable.ic_action_delete);
        this.A05 = menu.add(0, R.id.menuitem_conversations_mute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_mute);
        this.A09 = menu.add(0, R.id.menuitem_conversations_unmute, 0, (CharSequence) null).setIcon(R.drawable.ic_action_unmute);
        MenuItem add = menu.add(0, R.id.menuitem_conversations_archive, 0, (CharSequence) null);
        ConversationsFragment conversationsFragment = this.A0F;
        this.A02 = add.setIcon(C002001d.A0b(conversationsFragment.A01(), R.drawable.ic_action_archive, R.color.white));
        this.A08 = menu.add(0, R.id.menuitem_conversations_unarchive, 0, (CharSequence) null).setIcon(C002001d.A0b(conversationsFragment.A01(), R.drawable.ic_action_unarchive, R.color.white));
        this.A04 = menu.add(0, R.id.menuitem_conversations_leave, 0, (CharSequence) null);
        AnonymousClass01X r3 = conversationsFragment.A19;
        this.A01 = menu.add(0, R.id.menuitem_conversations_create_shortcuit, 0, r3.A06(R.string.add_shortcut));
        this.A0D = menu.add(0, R.id.menuitem_conversations_contact_info, 0, r3.A06(R.string.contact_info));
        this.A00 = menu.add(0, R.id.menuitem_conversations_add_new_contact, 0, r3.A06(R.string.add_contact));
        this.A07 = menu.add(0, R.id.menuitem_conversations_mark_read, 0, r3.A06(R.string.mark_read));
        this.A0B = menu.add(0, R.id.menuitem_conversations_mark_unread, 0, r3.A06(R.string.mark_unread));
        this.A0C = menu.add(0, R.id.menuitem_conversations_select_all, 0, r3.A06(R.string.select_all_conversations));
        this.A06.setShowAsAction(2);
        this.A0A.setShowAsAction(2);
        this.A02.setShowAsAction(2);
        this.A08.setShowAsAction(2);
        this.A03.setShowAsAction(2);
        this.A05.setShowAsAction(2);
        this.A09.setShowAsAction(2);
        this.A04.setShowAsAction(8);
        this.A01.setShowAsAction(8);
        this.A0D.setShowAsAction(8);
        this.A00.setShowAsAction(8);
        this.A07.setShowAsAction(8);
        this.A0B.setShowAsAction(8);
        this.A0C.setShowAsAction(8);
        C09020cA r1 = this.A0E;
        r1.A00(R.id.menuitem_conversations_leave);
        r1.A00(R.id.menuitem_conversations_create_shortcuit);
        r1.A00(R.id.menuitem_conversations_contact_info);
        r1.A00(R.id.menuitem_conversations_add_new_contact);
        r1.A00(R.id.menuitem_conversations_mark_read);
        r1.A00(R.id.menuitem_conversations_mark_unread);
        r1.A00(R.id.menuitem_conversations_select_all);
        return true;
    }

    @Override // X.AbstractC06100Rs
    public void AEx(AbstractC06110Rt r4) {
        ConversationsFragment conversationsFragment = this.A0F;
        conversationsFragment.A10(2);
        conversationsFragment.A0C = null;
        AnonymousClass2J8 r0 = conversationsFragment.A0I;
        if (r0 != null) {
            r0.setEnableState(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ba, code lost:
        if (r1 == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        if (r1 == false) goto L_0x01cc;
     */
    @Override // X.AbstractC06100Rs
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AIh(X.AbstractC06110Rt r23, android.view.Menu r24) {
        /*
        // Method dump skipped, instructions count: 756
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52312av.AIh(X.0Rt, android.view.Menu):boolean");
    }
}
