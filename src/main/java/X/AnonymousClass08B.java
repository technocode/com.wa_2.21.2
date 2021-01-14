package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape2S0100000_I1_0;
import com.google.android.search.verification.client.R;
import com.whatsapp.BlockList;
import com.whatsapp.Conversation;
import com.whatsapp.MentionPickerView;
import com.whatsapp.MentionableEntry;
import com.whatsapp.SetStatus;
import com.whatsapp.Settings;
import com.whatsapp.StatusesFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.ViewProfilePhoto;
import com.whatsapp.chatinfo.ContactInfoActivity;
import com.whatsapp.chatinfo.ListChatInfo;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.PopupNotification;
import com.whatsapp.payments.ui.IndiaUpiPaymentActivity;
import com.whatsapp.profile.ProfileInfoActivity;
import com.whatsapp.search.SearchFragment;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLogActivity;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.08B  reason: invalid class name */
public class AnonymousClass08B extends AbstractC003401r {
    public static final AnonymousClass08B A00 = new AnonymousClass08B();

    public void A02() {
        AnonymousClass2Z5 r1;
        MentionPickerView mentionPickerView;
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r12 = (AnonymousClass0AY) it;
            if (r12.hasNext()) {
                AnonymousClass0BP r13 = (AnonymousClass0BP) r12.next();
                if (r13 instanceof C09280cc) {
                    CallsFragment callsFragment = ((C09280cc) r13).A00;
                    C675138x r2 = (C675138x) callsFragment.A06.getFilter();
                    synchronized (r2.A02) {
                        r2.A00 = null;
                    }
                    callsFragment.A06.getFilter().filter(callsFragment.A08);
                } else if (r13 instanceof AnonymousClass3TU) {
                    ((AnonymousClass3TU) r13).A00.A0T();
                } else if (r13 instanceof C71603Pp) {
                    ((AbstractC16300pa) ((C71603Pp) r13).A00.A0D).A01.A00();
                } else if (r13 instanceof C71553Pk) {
                    ((C71553Pk) r13).A00.A0y();
                } else if (r13 instanceof AnonymousClass0BO) {
                    ((AnonymousClass0BO) r13).A00.A0D();
                } else if (r13 instanceof C71063Nl) {
                    SearchFragment searchFragment = ((C71063Nl) r13).A00;
                    searchFragment.A0N.A02.post(new RunnableEBaseShape12S0100000_I1_7(searchFragment, 33));
                } else if (r13 instanceof C58682mK) {
                    PopupNotification popupNotification = ((C58682mK) r13).A00;
                    if (!popupNotification.A0W.isEmpty()) {
                        popupNotification.A0X(popupNotification.A0Q.getCurrentItem());
                    }
                } else if (r13 instanceof C56072i1) {
                    ((AbstractC16300pa) ((C56072i1) r13).A00.A0h).A01.A00();
                } else if (r13 instanceof C54912fh) {
                    Log.d("group_info/onContactsChanged");
                    GroupChatInfo groupChatInfo = ((C54912fh) r13).A00;
                    C007003k A08 = groupChatInfo.A0g.A08(groupChatInfo.A0S);
                    groupChatInfo.A0K = A08;
                    if (A08 != null) {
                        groupChatInfo.A0p();
                        groupChatInfo.A0k();
                        groupChatInfo.A0l();
                        groupChatInfo.A0q();
                    }
                } else if (r13 instanceof C54842fa) {
                    GroupAdminPickerActivity groupAdminPickerActivity = ((C54842fa) r13).A00;
                    groupAdminPickerActivity.A0W(groupAdminPickerActivity.A0B);
                } else if (r13 instanceof C52262aq) {
                    ConversationsFragment conversationsFragment = ((C52262aq) r13).A00;
                    conversationsFragment.A0t();
                    conversationsFragment.A0O.A03 = true;
                    if (conversationsFragment.A0J != null) {
                        conversationsFragment.A0x();
                        conversationsFragment.A1u.ANF(new RunnableEBaseShape9S0100000_I1_4(conversationsFragment.A1C, 23));
                    }
                } else if (r13 instanceof C51952aL) {
                    ((C51952aL) r13).A00.A03.notifyDataSetChanged();
                } else if (r13 instanceof C51852a8) {
                    ((C51852a8) r13).A00.A02.notifyDataSetChanged();
                } else if (r13 instanceof AnonymousClass2ZB) {
                    ((AnonymousClass2ZB) r13).A00.A00();
                } else if (r13 instanceof AnonymousClass2Z7) {
                    AnonymousClass2Z9 r22 = ((AnonymousClass2Z7) r13).A00;
                    r22.A00 = r22.A0H.A02(r22.A0K);
                } else if (r13 instanceof AnonymousClass2YP) {
                    ((AnonymousClass2YP) r13).A00.A0b();
                } else if (r13 instanceof AnonymousClass2YF) {
                    AnonymousClass2YF r14 = (AnonymousClass2YF) r13;
                    Log.d("contact_picker/onContactsChanged");
                    if (!ContactPickerFragment.A1t) {
                        r14.A00.A0u();
                    }
                } else if (r13 instanceof AnonymousClass2XF) {
                    Log.d("list_chat_info/onContactsChanged");
                    ListChatInfo listChatInfo = ((AnonymousClass2XF) r13).A00;
                    ArrayList arrayList = listChatInfo.A0c;
                    arrayList.clear();
                    HashSet A02 = listChatInfo.A0N.A01(listChatInfo.A0g()).A03().A02();
                    AnonymousClass01I r0 = listChatInfo.A0C;
                    r0.A04();
                    A02.remove(r0.A03);
                    Iterator it2 = A02.iterator();
                    while (it2.hasNext()) {
                        C007003k A0A = listChatInfo.A0E.A0A((AnonymousClass02N) it2.next());
                        if (!arrayList.contains(A0A)) {
                            arrayList.add(A0A);
                        }
                    }
                    listChatInfo.A0j();
                    listChatInfo.A0m();
                } else if (r13 instanceof AnonymousClass2XA) {
                    ContactInfoActivity contactInfoActivity = ((AnonymousClass2XA) r13).A00;
                    contactInfoActivity.A0j();
                    contactInfoActivity.A05();
                } else if (r13 instanceof C41751va) {
                    ((C41751va) r13).A00.A0T();
                } else if (r13 instanceof C40911u5) {
                    ViewProfilePhoto viewProfilePhoto = ((C40911u5) r13).A00;
                    AnonymousClass01A r23 = viewProfilePhoto.A0B;
                    Jid A022 = viewProfilePhoto.A00.A02(AnonymousClass02N.class);
                    if (A022 != null) {
                        C007003k A0A2 = r23.A0A((AnonymousClass02N) A022);
                        viewProfilePhoto.A00 = A0A2;
                        if (A0A2.A09()) {
                            viewProfilePhoto.setTitle(((AnonymousClass2C0) viewProfilePhoto).A01.A06(R.string.group_photo));
                        } else {
                            viewProfilePhoto.A0L(viewProfilePhoto.A0E.A08(viewProfilePhoto.A00, false));
                        }
                    } else {
                        throw null;
                    }
                } else if (r13 instanceof C09160cO) {
                    StatusesFragment statusesFragment = ((C09160cO) r13).A00;
                    statusesFragment.A06.getFilter().filter(statusesFragment.A0A);
                } else if (r13 instanceof AnonymousClass1t4) {
                    ((AnonymousClass1t4) r13).A00.A01.notifyDataSetChanged();
                } else if (r13 instanceof C39661rt) {
                    Conversation conversation = ((C39661rt) r13).A00;
                    if (!conversation.isFinishing()) {
                        conversation.A0q.A01++;
                        conversation.A0m();
                        conversation.A0n();
                        MentionableEntry mentionableEntry = conversation.A0k;
                        if (!(mentionableEntry == null || (mentionPickerView = mentionableEntry.A07) == null)) {
                            mentionPickerView.A03();
                        }
                        AnonymousClass2HI r02 = (AnonymousClass2HI) conversation.A0p.A00.get(AnonymousClass2Z5.class);
                        if (!(r02 == null || !r02.A04() || (r1 = (AnonymousClass2Z5) ((AnonymousClass2HI) conversation.A0p.A00.get(AnonymousClass2Z5.class))) == null)) {
                            r1.A07(conversation.A0z);
                        }
                        if (conversation.A1a) {
                            conversation.invalidateOptionsMenu();
                        }
                    }
                } else if (r13 instanceof C39501rd) {
                    Log.d("statusrecipients/onContactsChanged");
                    ((C39501rd) r13).A00.A0W();
                } else if (r13 instanceof C39411rS) {
                    BlockList blockList = ((C39411rS) r13).A00;
                    blockList.A0V();
                    blockList.A00.notifyDataSetChanged();
                }
            } else {
                return;
            }
        }
    }

    public void A03(AnonymousClass02N r8) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass0BP r12 = (AnonymousClass0BP) r1.next();
                if (r12 instanceof C71063Nl) {
                    SearchFragment.A00(((C71063Nl) r12).A00, r8);
                } else if (r12 instanceof C58682mK) {
                    PopupNotification popupNotification = ((C58682mK) r12).A00;
                    C007003k r0 = popupNotification.A0N;
                    if (r0 != null && r8 != null && r8.equals(r0.A09) && !AnonymousClass1VY.A0Y(r8)) {
                        String A01 = popupNotification.A0d.A01(popupNotification.A0N);
                        if (TextUtils.isEmpty(A01)) {
                            popupNotification.A0F.setVisibility(8);
                        } else {
                            popupNotification.A0F.setVisibility(0);
                            popupNotification.A0F.setText(A01);
                        }
                    }
                } else if (r12 instanceof C52262aq) {
                    ConversationsFragment.A02(((C52262aq) r12).A00, r8);
                } else if (r12 instanceof AnonymousClass2ZB) {
                    AnonymousClass2ZB r13 = (AnonymousClass2ZB) r12;
                    if (r13.A01(r8)) {
                        r13.A00.A01();
                    }
                } else if (r12 instanceof AnonymousClass2XA) {
                    ContactInfoActivity contactInfoActivity = ((AnonymousClass2XA) r12).A00;
                    if (r8.equals(ContactInfoActivity.A05(contactInfoActivity))) {
                        TextView textView = (TextView) contactInfoActivity.findViewById(R.id.conversation_contact_status);
                        String A012 = contactInfoActivity.A0O.A01(contactInfoActivity.A0G);
                        textView.setText(A012);
                        int i = 0;
                        int i2 = 0;
                        if (TextUtils.isEmpty(A012)) {
                            i2 = 8;
                        }
                        textView.setVisibility(i2);
                        View findViewById = contactInfoActivity.A01.findViewById(R.id.business_separator);
                        if (contactInfoActivity.A01.getVisibility() == 0 && TextUtils.isEmpty(A012)) {
                            i = 8;
                        }
                        findViewById.setVisibility(i);
                        contactInfoActivity.A0l();
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01e4, code lost:
        if (r4.A01 != -1) goto L_0x01e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.AnonymousClass02N r10) {
        /*
        // Method dump skipped, instructions count: 1289
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08B.A04(X.02N):void");
    }

    public void A05(AnonymousClass02N r6) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass0BP r12 = (AnonymousClass0BP) r1.next();
                if (r12 instanceof C69313Go) {
                    C69313Go r13 = (C69313Go) r12;
                    if (r6 != null) {
                        IndiaUpiPaymentActivity indiaUpiPaymentActivity = r13.A00;
                        if (r6.equals(indiaUpiPaymentActivity.A03)) {
                            indiaUpiPaymentActivity.A0r();
                        }
                    }
                } else if (r12 instanceof C54912fh) {
                    C54912fh r14 = (C54912fh) r12;
                    Log.d("group_info/onProfilePhotoStartChanging");
                    if (AnonymousClass1VY.A0Y(r6)) {
                        GroupChatInfo groupChatInfo = r14.A00;
                        if (r6.equals(groupChatInfo.A0S)) {
                            groupChatInfo.A0A.setVisibility(0);
                        }
                    }
                } else if (r12 instanceof C40911u5) {
                    ViewProfilePhoto viewProfilePhoto = ((C40911u5) r12).A00;
                    AnonymousClass01A r2 = viewProfilePhoto.A0B;
                    Jid A02 = viewProfilePhoto.A00.A02(AnonymousClass02N.class);
                    if (A02 != null) {
                        C007003k A0A = r2.A0A((AnonymousClass02N) A02);
                        viewProfilePhoto.A00 = A0A;
                        if (r6.equals(A0A.A02(AnonymousClass02N.class))) {
                            StringBuilder A0S = AnonymousClass008.A0S("viewprofilephoto/onProfilePhotoStartChanging photo_full_id:");
                            C007003k r15 = viewProfilePhoto.A00;
                            A0S.append(r15.A01);
                            A0S.append(" thumb_full_id:");
                            AnonymousClass008.A1L(A0S, r15.A02);
                            if (viewProfilePhoto.A02) {
                                viewProfilePhoto.A02 = false;
                            } else {
                                viewProfilePhoto.A03 = true;
                            }
                        }
                    } else {
                        throw null;
                    }
                } else {
                    continue;
                }
            } else {
                return;
            }
        }
    }

    public void A06(UserJid userJid) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((AnonymousClass0BP) r1.next()).A00(userJid);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a2, code lost:
        if (r12.equals(r5.A0J) == false) goto L_0x01a4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(com.whatsapp.jid.UserJid r12) {
        /*
        // Method dump skipped, instructions count: 1018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08B.A07(com.whatsapp.jid.UserJid):void");
    }

    public void A08(UserJid userJid) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass0BP r3 = (AnonymousClass0BP) r1.next();
                if (r3 instanceof AnonymousClass3TU) {
                    CallLogActivity callLogActivity = ((AnonymousClass3TU) r3).A00;
                    if (callLogActivity.A06.equals(userJid)) {
                        callLogActivity.A0T();
                    }
                } else if (r3 instanceof C71063Nl) {
                    SearchFragment.A00(((C71063Nl) r3).A00, userJid);
                } else if (r3 instanceof AnonymousClass3J7) {
                    AnonymousClass3J7 r32 = (AnonymousClass3J7) r3;
                    if (userJid != null) {
                        ProfileInfoActivity profileInfoActivity = r32.A00;
                        AnonymousClass01I r0 = profileInfoActivity.A09;
                        r0.A04();
                        if (userJid.equals(r0.A03)) {
                            profileInfoActivity.A06.setSubText(profileInfoActivity.A0A.A01());
                        }
                    }
                } else if (r3 instanceof C54912fh) {
                    C54912fh r33 = (C54912fh) r3;
                    StringBuilder sb = new StringBuilder("group_info/onStatusChanged:");
                    sb.append(userJid);
                    Log.d(sb.toString());
                    if (userJid != null) {
                        GroupChatInfo groupChatInfo = r33.A00;
                        AnonymousClass01I r02 = groupChatInfo.A0a;
                        r02.A04();
                        if (userJid.equals(r02.A03)) {
                            groupChatInfo.A0M.notifyDataSetChanged();
                        } else {
                            C007003k.A00(groupChatInfo.A0X, new C52662bU(groupChatInfo.A0g.A0A(userJid)));
                            groupChatInfo.A0M.A00();
                        }
                    }
                } else if (r3 instanceof C54842fa) {
                    C54842fa r34 = (C54842fa) r3;
                    if (userJid != null && !AnonymousClass1VY.A0Y(userJid)) {
                        GroupAdminPickerActivity groupAdminPickerActivity = r34.A00;
                        if (GroupAdminPickerActivity.A04(groupAdminPickerActivity, userJid)) {
                            C007003k.A00(groupAdminPickerActivity.A0C, new C52662bU(groupAdminPickerActivity.A0F.A0A(userJid)));
                            ((AbstractC16300pa) groupAdminPickerActivity.A09).A01.A00();
                        }
                    }
                } else if (r3 instanceof C52262aq) {
                    ConversationsFragment.A02(((C52262aq) r3).A00, userJid);
                } else if (r3 instanceof AnonymousClass2ZB) {
                    AnonymousClass2ZB r35 = (AnonymousClass2ZB) r3;
                    if (r35.A01(userJid)) {
                        r35.A00.A01();
                    }
                } else if (r3 instanceof AnonymousClass2YP) {
                    AnonymousClass0QH r2 = ((AnonymousClass2YP) r3).A00;
                    if (C007003k.A00(r2.A0K, new C52662bU(r2.A0R.A0A(userJid)))) {
                        r2.A0F.notifyDataSetChanged();
                    }
                } else if (r3 instanceof AnonymousClass2YF) {
                    ContactPickerFragment contactPickerFragment = ((AnonymousClass2YF) r3).A00;
                    if (C007003k.A00(contactPickerFragment.A0f, new C52662bU(contactPickerFragment.A1C.A0A(userJid)))) {
                        contactPickerFragment.A0I.notifyDataSetChanged();
                    }
                } else if (r3 instanceof AnonymousClass2XF) {
                    StringBuilder sb2 = new StringBuilder("list_chat_info/onStatusChanged:");
                    sb2.append(userJid);
                    Log.d(sb2.toString());
                    ListChatInfo listChatInfo = ((AnonymousClass2XF) r3).A00;
                    AnonymousClass01I r03 = listChatInfo.A0C;
                    r03.A04();
                    if (!userJid.equals(r03.A03)) {
                        C007003k.A00(listChatInfo.A0c, new C52662bU(listChatInfo.A0E.A0A(userJid)));
                        listChatInfo.A06.notifyDataSetChanged();
                    }
                } else if (r3 instanceof AnonymousClass2XA) {
                    ContactInfoActivity contactInfoActivity = ((AnonymousClass2XA) r3).A00;
                    if (userJid.equals(ContactInfoActivity.A05(contactInfoActivity))) {
                        contactInfoActivity.A0j();
                    }
                } else if (r3 instanceof C40611tY) {
                    C40611tY r36 = (C40611tY) r3;
                    if (userJid != null) {
                        Settings settings = r36.A00;
                        AnonymousClass01I r04 = settings.A09;
                        r04.A04();
                        if (userJid.equals(r04.A03)) {
                            settings.A03.A02(settings.A0A.A01());
                        }
                    }
                } else if (r3 instanceof C40591tW) {
                    C40591tW r37 = (C40591tW) r3;
                    if (userJid != null) {
                        SetStatus setStatus = r37.A00;
                        AnonymousClass01I r05 = setStatus.A05;
                        r05.A04();
                        if (userJid.equals(r05.A03)) {
                            String A01 = setStatus.A06.A01();
                            if (setStatus.A03) {
                                setStatus.A03 = false;
                                Iterator it2 = SetStatus.A0A.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((String) it2.next()).equals(A01)) {
                                            break;
                                        }
                                    } else {
                                        SetStatus.A0A.add(0, A01);
                                        break;
                                    }
                                }
                                setStatus.A0U();
                            }
                            TextEmojiLabel textEmojiLabel = setStatus.A02;
                            textEmojiLabel.setText(C002001d.A1H(A01, textEmojiLabel.getContext(), setStatus.A02.getPaint(), setStatus.A0M));
                            setStatus.A01.notifyDataSetInvalidated();
                            setStatus.A00.setOnClickListener(new ViewOnClickEBaseShape2S0100000_I1_0(r37, 37));
                        }
                    }
                } else if (r3 instanceof C39661rt) {
                    C39661rt r38 = (C39661rt) r3;
                    if (r38.A01(userJid)) {
                        r38.A00.A0n();
                    }
                } else if (r3 instanceof C39501rd) {
                    AnonymousClass2DH r22 = ((C39501rd) r3).A00;
                    if (C007003k.A00(r22.A09, new C52662bU(r22.A0E.A0A(userJid)))) {
                        r22.A02.notifyDataSetChanged();
                    }
                } else if (r3 instanceof C39411rS) {
                    BlockList blockList = ((C39411rS) r3).A00;
                    blockList.A0V();
                    blockList.A00.notifyDataSetChanged();
                }
            } else {
                return;
            }
        }
    }

    public void A09(Collection collection) {
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                AnonymousClass0BP r4 = (AnonymousClass0BP) r1.next();
                if (r4 instanceof AnonymousClass3H7) {
                    ((AnonymousClass3H7) r4).A00.A05.notifyDataSetChanged();
                } else if (r4 instanceof C02820Dp) {
                    C02820Dp r42 = (C02820Dp) r4;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass02N r2 = (AnonymousClass02N) it2.next();
                        if (r2 == null) {
                            Log.e("LocationSharingManager/ContactObserver/found jid == null");
                        } else {
                            AnonymousClass01S r12 = r42.A00;
                            r12.A0P(r2);
                            r12.A0Q(r2, null);
                        }
                    }
                } else if (r4 instanceof C53522dP) {
                    ChangeEphemeralSettingActivity changeEphemeralSettingActivity = ((C53522dP) r4).A00;
                    AnonymousClass02N r22 = changeEphemeralSettingActivity.A02;
                    if (AnonymousClass1VY.A0e(r22) && changeEphemeralSettingActivity.A03.A0H(UserJid.of(r22)) && !changeEphemeralSettingActivity.isFinishing()) {
                        AnonymousClass02M r3 = ((ActivityC004702f) changeEphemeralSettingActivity).A0F;
                        AnonymousClass01X r23 = ((AnonymousClass2C0) changeEphemeralSettingActivity).A01;
                        int i = changeEphemeralSettingActivity.A01;
                        int i2 = R.string.ephemeral_unblock_to_turn_setting_on;
                        if (i == 0) {
                            i2 = R.string.ephemeral_unblock_to_turn_setting_off;
                        }
                        r3.A0C(r23.A06(i2), 1);
                        changeEphemeralSettingActivity.finish();
                    }
                } else if (r4 instanceof AnonymousClass2YP) {
                    ((AnonymousClass2YP) r4).A00.A0F.notifyDataSetChanged();
                } else if (r4 instanceof AnonymousClass2YF) {
                    ((AnonymousClass2YF) r4).A00.A0I.notifyDataSetChanged();
                } else if (r4 instanceof AnonymousClass2XA) {
                    ContactInfoActivity contactInfoActivity = ((AnonymousClass2XA) r4).A00;
                    contactInfoActivity.A0i();
                    contactInfoActivity.A0l();
                } else if (r4 instanceof C40691tg) {
                    ((C40691tg) r4).A00.A0W();
                } else if (r4 instanceof C39661rt) {
                    C39661rt r43 = (C39661rt) r4;
                    Conversation conversation = r43.A00;
                    AnonymousClass2JD r13 = conversation.A0v;
                    if (r13.A02 != null || r13.A01 != null) {
                        Iterator it3 = collection.iterator();
                        while (it3.hasNext()) {
                            if (r43.A01((AnonymousClass02N) it3.next())) {
                                conversation.A0x();
                            }
                        }
                    }
                } else if (r4 instanceof C39501rd) {
                    ((C39501rd) r4).A00.A02.notifyDataSetChanged();
                } else if (r4 instanceof C39411rS) {
                    BlockList blockList = ((C39411rS) r4).A00;
                    blockList.A0V();
                    blockList.A00.notifyDataSetChanged();
                    blockList.A0W();
                }
            } else {
                return;
            }
        }
    }
}
