package com.whatsapp.util;

import X.AbstractC000400g;
import X.AbstractC007503q;
import X.AbstractC69803In;
import X.AbstractRunnableC459527e;
import X.AbstractView$OnClickListenerC08330av;
import X.AbstractView$OnCreateContextMenuListenerC56112i5;
import X.ActivityC004702f;
import X.ActivityC004802g;
import X.AnonymousClass008;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01I;
import X.AnonymousClass02N;
import X.AnonymousClass02U;
import X.AnonymousClass0A6;
import X.AnonymousClass0AL;
import X.AnonymousClass0FI;
import X.AnonymousClass0HU;
import X.AnonymousClass0LW;
import X.AnonymousClass0M3;
import X.AnonymousClass0M4;
import X.AnonymousClass0MP;
import X.AnonymousClass0PW;
import X.AnonymousClass0Q7;
import X.AnonymousClass0QB;
import X.AnonymousClass0ZF;
import X.AnonymousClass1M5;
import X.AnonymousClass1MI;
import X.AnonymousClass1VY;
import X.AnonymousClass201;
import X.AnonymousClass2RV;
import X.AnonymousClass2TJ;
import X.AnonymousClass312;
import X.AnonymousClass3O3;
import X.AnonymousClass3OB;
import X.AnonymousClass3OI;
import X.AnonymousClass3OK;
import X.C002001d;
import X.C006803i;
import X.C007003k;
import X.C02770Dj;
import X.C02780Dk;
import X.C04360Kb;
import X.C05440On;
import X.C10260eL;
import X.C10350eU;
import X.C28051Sr;
import X.C28301Tu;
import X.C28351Tz;
import X.C29111Xc;
import X.C48672Ng;
import X.C49332Qb;
import X.C54402er;
import X.C59842oN;
import X.C60122oq;
import X.C60542pf;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.search.verification.client.R;
import com.whatsapp.ReportSpamDialogFragment;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.SetStatus;
import com.whatsapp.SettingsJidNotificationActivity;
import com.whatsapp.ShareInviteLinkActivity;
import com.whatsapp.chatinfo.ChatInfoActivity;
import com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity;
import com.whatsapp.gif_search.GifSearchContainer;
import com.whatsapp.group.EditGroupAdminsSelector;
import com.whatsapp.group.GroupAddPrivacyActivity;
import com.whatsapp.group.GroupAdminPickerActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.group.GroupSettingsActivity;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import com.whatsapp.invites.NobodyDeprecatedDialogFragment;
import com.whatsapp.invites.RevokeInviteDialogFragment;
import com.whatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.picker.search.GifSearchDialogFragment;
import com.whatsapp.picker.search.PickerSearchDialogFragment;
import com.whatsapp.picker.search.StickerSearchDialogFragment;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.registration.ChangeNumberNotifyContacts;
import com.whatsapp.registration.ChangeNumberOverview;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ViewOnClickCListenerShape13S0100000_I1_2 extends AbstractView$OnClickListenerC08330av {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape13S0100000_I1_2(ActivityC004802g r2) {
        this.A01 = 35;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape13S0100000_I1_2(C54402er r2) {
        this.A01 = 5;
        this.A00 = r2;
    }

    public ViewOnClickCListenerShape13S0100000_I1_2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    @Override // X.AbstractView$OnClickListenerC08330av
    public void A00(View view) {
        int i;
        AnonymousClass0MP r3;
        Class A89;
        switch (this.A01) {
            case 0:
                C59842oN r1 = (C59842oN) this.A00;
                if (r1.A00 != 0) {
                    r1.A0C(0);
                    return;
                }
                return;
            case 1:
                C59842oN r2 = (C59842oN) this.A00;
                if (r2.A00 != 1) {
                    r2.A0C(1);
                    r2.A0A();
                    return;
                }
                return;
            case 2:
                C59842oN r32 = (C59842oN) this.A00;
                if (r32.A00 != 2) {
                    r32.A0C(2);
                    if (r32.A0A.getVisibility() == 0) {
                        AnonymousClass008.A0n(((AnonymousClass1MI) r32).A05, "sticker_store_onboarding_badge_shown", true);
                        r32.A0A.setVisibility(8);
                        Animation animation = r32.A0A.getAnimation();
                        if (animation != null) {
                            animation.cancel();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A00;
                GifSearchContainer.A00(gifSearchContainer, gifSearchContainer.A0G);
                return;
            case 4:
                ((GifSearchContainer) this.A00).A05.setText("");
                return;
            case 5:
                ((C48672Ng) this.A00).A02();
                return;
            case 6:
                AnonymousClass201 r4 = new AnonymousClass201();
                C60542pf r33 = (C60542pf) this.A00;
                int i2 = r33.A01.A00;
                if (i2 == 1) {
                    i = 0;
                } else if (i2 == 2) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException(AnonymousClass008.A0F("Unexpected provider type ", i2));
                }
                r4.A00 = Integer.valueOf(i);
                r33.A09.A0B(r4, null, false);
                r33.A0B.AGa(r33.A01);
                return;
            case 7:
                GroupAddPrivacyActivity.A04((GroupAddPrivacyActivity) this.A00, 1);
                return;
            case 8:
                GroupAddPrivacyActivity.A04((GroupAddPrivacyActivity) this.A00, 0);
                return;
            case 9:
                GroupAddPrivacyActivity.A04((GroupAddPrivacyActivity) this.A00, 2);
                return;
            case 10:
                GroupAddPrivacyActivity.A04((GroupAddPrivacyActivity) this.A00, 3);
                return;
            case 11:
                GroupAddPrivacyActivity groupAddPrivacyActivity = (GroupAddPrivacyActivity) this.A00;
                if (((ActivityC004702f) groupAddPrivacyActivity).A0G.A0D(AbstractC000400g.A14)) {
                    if (groupAddPrivacyActivity.A00 != 2 && groupAddPrivacyActivity.A05) {
                        groupAddPrivacyActivity.APm(new NobodyDeprecatedDialogFragment());
                        return;
                    }
                } else if (groupAddPrivacyActivity == null) {
                    throw null;
                }
                Intent intent = new Intent();
                intent.putExtra("groupadd", groupAddPrivacyActivity.A00);
                groupAddPrivacyActivity.setResult(-1, intent);
                groupAddPrivacyActivity.finish();
                return;
            case 12:
                ((GroupAdminPickerActivity) this.A00).A0T();
                return;
            case 13:
                GroupChatInfo groupChatInfo = (GroupChatInfo) this.A00;
                if (((ChatInfoActivity) groupChatInfo).A0E.A02() && (A89 = ((ChatInfoActivity) groupChatInfo).A0F.A03().A89()) != null) {
                    groupChatInfo.startActivity(new Intent(groupChatInfo, A89).putExtra("extra_jid", AnonymousClass1VY.A0D(groupChatInfo.A0K.A09)));
                    return;
                }
                return;
            case 14:
                GroupChatInfo groupChatInfo2 = (GroupChatInfo) this.A00;
                if (groupChatInfo2.A0v.A04(groupChatInfo2.A0S)) {
                    groupChatInfo2.A0G(R.string.register_wait_message);
                    AnonymousClass02U r12 = groupChatInfo2.A0S;
                    if (r12 != null) {
                        groupChatInfo2.A0c.A05(r12);
                        groupChatInfo2.A0i.A03(groupChatInfo2.A0S);
                        ((ChatInfoActivity) groupChatInfo2).A0H.ANC(new C10350eU(groupChatInfo2, groupChatInfo2.A0x, groupChatInfo2.A0S), new Object[0]);
                        return;
                    }
                    throw null;
                }
                C002001d.A2O(groupChatInfo2, 1);
                return;
            case 15:
                GroupChatInfo groupChatInfo3 = (GroupChatInfo) this.A00;
                Jid A02 = groupChatInfo3.A0K.A02(AnonymousClass02U.class);
                if (A02 != null) {
                    groupChatInfo3.APm(ReportSpamDialogFragment.A00((AnonymousClass02N) A02, "group_info"));
                    return;
                }
                throw null;
            case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                GroupChatInfo groupChatInfo4 = (GroupChatInfo) this.A00;
                groupChatInfo4.A19.A08(groupChatInfo4, groupChatInfo4.A0S, null);
                return;
            case 17:
                GroupChatInfo groupChatInfo5 = (GroupChatInfo) this.A00;
                groupChatInfo5.startActivity(new Intent(groupChatInfo5.getApplicationContext(), GroupSettingsActivity.class).putExtra("gid", groupChatInfo5.A0S.getRawString()));
                return;
            case 18:
                GroupChatInfo groupChatInfo6 = (GroupChatInfo) this.A00;
                groupChatInfo6.startActivityForResult(new Intent(groupChatInfo6.getApplicationContext(), SettingsJidNotificationActivity.class).putExtra("jid", groupChatInfo6.A0S.getRawString()), 16);
                return;
            case 19:
                C49332Qb r34 = ((GroupChatInfo) this.A00).A0Q;
                if (r34.A0A.A04(r34.A0C)) {
                    AnonymousClass01A r0 = r34.A05;
                    AnonymousClass02U r22 = r34.A0C;
                    C007003k A0A = r0.A0A(r22);
                    if (r34.A0A.A05(r22) || !A0A.A0Z) {
                        C002001d.A2O(r34.A02, 4);
                        return;
                    } else {
                        r34.A02.APo(R.string.failed_update_group_info_not_admin);
                        return;
                    }
                } else {
                    r34.A02.APo(R.string.subject_change_not_authorized);
                    return;
                }
            case AnonymousClass0PW.A01:
                ((GroupChatInfo) this.A00).A0i();
                return;
            case 21:
                GroupChatInfo groupChatInfo7 = (GroupChatInfo) this.A00;
                Intent intent2 = new Intent(groupChatInfo7, ShareInviteLinkActivity.class);
                intent2.putExtra("jid", groupChatInfo7.A0S.getRawString());
                groupChatInfo7.startActivity(intent2);
                return;
            case 22:
                GroupChatInfo groupChatInfo8 = (GroupChatInfo) this.A00;
                AnonymousClass0Q7.A0W(groupChatInfo8.A0I, 4);
                AnonymousClass0LW A04 = groupChatInfo8.A04();
                if (A04 != null) {
                    AnonymousClass0QB r23 = new AnonymousClass0QB(A04);
                    GroupParticipantsSearchFragment groupParticipantsSearchFragment = new GroupParticipantsSearchFragment();
                    r23.A06(R.id.search_container, groupParticipantsSearchFragment, null);
                    groupParticipantsSearchFragment.A00 = groupChatInfo8.A0I;
                    r23.A08(null);
                    r23.A00();
                    return;
                }
                throw null;
            case 23:
                GroupChatInfo groupChatInfo9 = (GroupChatInfo) this.A00;
                groupChatInfo9.startActivity(new Intent(groupChatInfo9, StarredMessagesActivity.class).putExtra("jid", AnonymousClass1VY.A0D(groupChatInfo9.A0K.A09)));
                return;
            case 24:
                ((GroupParticipantsSearchFragment) this.A00).A0o();
                return;
            case 25:
                GroupSettingsActivity groupSettingsActivity = (GroupSettingsActivity) this.A00;
                if (groupSettingsActivity != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = groupSettingsActivity.A07.A01(groupSettingsActivity.A02).A04().iterator();
                    while (true) {
                        C28351Tz r13 = (C28351Tz) it;
                        if (r13.hasNext()) {
                            AnonymousClass1M5 r24 = (AnonymousClass1M5) r13.next();
                            int i3 = r24.A01;
                            if (!(i3 == 0 || i3 == 2)) {
                                AnonymousClass01I r02 = groupSettingsActivity.A03;
                                UserJid userJid = r24.A03;
                                if (!r02.A09(userJid)) {
                                    arrayList.add(userJid);
                                }
                            }
                        } else {
                            Intent intent3 = new Intent(groupSettingsActivity, EditGroupAdminsSelector.class);
                            intent3.putExtra("gid", groupSettingsActivity.A02.getRawString());
                            intent3.putExtra("selected", AnonymousClass1VY.A0F(arrayList));
                            groupSettingsActivity.startActivityForResult(intent3, 17);
                            return;
                        }
                    }
                } else {
                    throw null;
                }
            case 26:
                ActivityC004702f r25 = (ActivityC004702f) this.A00;
                r25.A0J.A0B("security_notifications_alert_timestamp");
                r25.A0F.A02.post(new RunnableEBaseShape10S0100000_I1_5(this, 19));
                return;
            case 27:
                InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A00;
                C04360Kb r35 = inviteGroupParticipantsActivity.A07;
                String A08 = inviteGroupParticipantsActivity.A09.A08(inviteGroupParticipantsActivity.A04, false);
                List<AnonymousClass2RV> list = inviteGroupParticipantsActivity.A05;
                byte[] bArr = inviteGroupParticipantsActivity.A06;
                String stringText = inviteGroupParticipantsActivity.A02.getStringText();
                if (r35 != null) {
                    for (AnonymousClass2RV r26 : list) {
                        AnonymousClass0AL r14 = r35.A12;
                        UserJid userJid2 = r26.A02;
                        AnonymousClass02U r142 = r26.A01;
                        AnonymousClass01I r03 = r35.A06;
                        r03.A04();
                        UserJid userJid3 = r03.A03;
                        String str = r26.A03;
                        long A05 = r35.A0L.A05();
                        long j = r26.A00;
                        AnonymousClass0A6 r04 = r14.A07;
                        AnonymousClass0ZF r15 = new AnonymousClass0ZF(AnonymousClass0FI.A07(r04.A01, r04.A00, userJid2, true), A05);
                        ((AbstractC007503q) r15).A01 = 1;
                        r15.A01 = r142;
                        r15.A02 = userJid3;
                        r15.A04 = A08;
                        r15.A05 = str;
                        r15.A00 = j;
                        r15.A06 = false;
                        r15.A03 = stringText;
                        if (bArr != null) {
                            C05440On A0B = r15.A0B();
                            if (A0B != null) {
                                A0B.A03(bArr);
                            } else {
                                throw null;
                            }
                        }
                        r35.A0K(r15);
                        r35.A0W.A0J(r15);
                    }
                    inviteGroupParticipantsActivity.setResult(-1);
                    ((ActivityC004702f) inviteGroupParticipantsActivity).A0F.A0C(inviteGroupParticipantsActivity.A0D.A0A(R.plurals.group_invites_sent, (long) inviteGroupParticipantsActivity.A05.size(), Integer.valueOf(inviteGroupParticipantsActivity.A05.size())), 0);
                    inviteGroupParticipantsActivity.finish();
                    return;
                }
                throw null;
            case 28:
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                if (viewGroupInviteActivity.A0E) {
                    UserJid userJid4 = viewGroupInviteActivity.A0A;
                    if (userJid4 != null) {
                        AnonymousClass0ZF r27 = viewGroupInviteActivity.A0C;
                        if (r27 != null) {
                            RevokeInviteDialogFragment revokeInviteDialogFragment = new RevokeInviteDialogFragment();
                            Bundle bundle = new Bundle();
                            bundle.putString("jid", userJid4.getRawString());
                            bundle.putLong("invite_row_id", r27.A0p);
                            revokeInviteDialogFragment.A0N(bundle);
                            viewGroupInviteActivity.APm(revokeInviteDialogFragment);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                }
                viewGroupInviteActivity.A06.setText(viewGroupInviteActivity.A0J.A06(R.string.joining_group_via_invite));
                viewGroupInviteActivity.A03.setVisibility(0);
                viewGroupInviteActivity.A02.setVisibility(4);
                AnonymousClass00T r28 = viewGroupInviteActivity.A0Q;
                C29111Xc r05 = viewGroupInviteActivity.A0B;
                if (r05 != null) {
                    r28.ANC(new C10260eL(viewGroupInviteActivity, r05), new Void[0]);
                    return;
                }
                throw null;
            case 29:
                AbstractView$OnCreateContextMenuListenerC56112i5 r29 = (AbstractView$OnCreateContextMenuListenerC56112i5) this.A00;
                if (r29.A0g.getVisibility() == 0 && r29.A0a.A0B == 5) {
                    BottomSheetBehavior bottomSheetBehavior = r29.A0Z;
                    int i4 = bottomSheetBehavior.A0B;
                    if (i4 == 4) {
                        bottomSheetBehavior.A0D(3);
                        return;
                    } else if (i4 == 3) {
                        bottomSheetBehavior.A0D(4);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 30:
                ((AbstractView$OnCreateContextMenuListenerC56112i5) this.A00).A0G();
                return;
            case 31:
                AbstractView$OnCreateContextMenuListenerC56112i5 r210 = (AbstractView$OnCreateContextMenuListenerC56112i5) this.A00;
                r210.A0B();
                r210.A0u = false;
                r210.A0s = false;
                r210.A0U.setVisibility(8);
                r210.A0E();
                return;
            case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                AbstractView$OnCreateContextMenuListenerC56112i5 r16 = (AbstractView$OnCreateContextMenuListenerC56112i5) this.A00;
                if (!r16.A0r) {
                    Activity activity = r16.A0E;
                    activity.startActivityForResult(new Intent(activity, RequestPermissionActivity.class).putExtra("drawable_id", R.drawable.permission_location).putExtra("permissions", C02770Dj.A07).putExtra("perm_denial_message_id", R.string.permission_location_access_on_updating_location).putExtra("message_id", R.string.permission_location_access_on_updating_location_request), 35);
                    return;
                }
                return;
            case 33:
                C002001d.A2O(((AbstractView$OnCreateContextMenuListenerC56112i5) this.A00).A0E, 2);
                return;
            case 34:
                C002001d.A2O(((C60122oq) this.A00).A06.A0E, 0);
                return;
            case 35:
                C006803i.A0R((Activity) this.A00, "com.whatsapp");
                return;
            case 36:
                ((AbstractC69803In) this.A00).A01();
                return;
            case 37:
                GifSearchDialogFragment gifSearchDialogFragment = (GifSearchDialogFragment) this.A00;
                GifSearchDialogFragment.A00(gifSearchDialogFragment, gifSearchDialogFragment.A07);
                return;
            case 38:
                GifSearchDialogFragment gifSearchDialogFragment2 = (GifSearchDialogFragment) this.A00;
                gifSearchDialogFragment2.A04.setText("");
                gifSearchDialogFragment2.A04.A01(false);
                return;
            case 39:
                PickerSearchDialogFragment pickerSearchDialogFragment = (PickerSearchDialogFragment) this.A00;
                pickerSearchDialogFragment.A0x();
                pickerSearchDialogFragment.A0w(false, false);
                return;
            case 40:
                StickerSearchDialogFragment stickerSearchDialogFragment = (StickerSearchDialogFragment) this.A00;
                stickerSearchDialogFragment.A05.setText("");
                stickerSearchDialogFragment.A05.A01(false);
                return;
            case 41:
                ((DialogFragment) this.A00).A0w(false, false);
                return;
            case 42:
                Context context = (Context) this.A00;
                context.startActivity(new Intent(context, ChangeNumberOverview.class));
                return;
            case 43:
                Context context2 = (Context) this.A00;
                context2.startActivity(new Intent(context2, SetStatus.class));
                return;
            case 44:
                Log.i("changenumber/next");
                ChangeNumber changeNumber = (ChangeNumber) this.A00;
                if (changeNumber.A0Y(AnonymousClass008.A0B(changeNumber.A06.A02), changeNumber.A06.A03.getText().toString(), changeNumber.A06) && changeNumber.A0Y(AnonymousClass008.A0B(((AnonymousClass0HU) changeNumber).A01.A02), ((AnonymousClass0HU) changeNumber).A01.A03.getText().toString(), ((AnonymousClass0HU) changeNumber).A01)) {
                    String A0B2 = AnonymousClass008.A0B(changeNumber.A06.A02);
                    String obj = changeNumber.A06.A03.getText().toString();
                    String A0B3 = AnonymousClass008.A0B(((AnonymousClass0HU) changeNumber).A01.A02);
                    String obj2 = ((AnonymousClass0HU) changeNumber).A01.A03.getText().toString();
                    Intent intent4 = new Intent(changeNumber, ChangeNumberNotifyContacts.class);
                    intent4.putExtra("mode", changeNumber.A01);
                    intent4.putStringArrayListExtra("preselectedJids", changeNumber.A07);
                    StringBuilder sb = new StringBuilder();
                    sb.append(A0B2);
                    sb.append(obj);
                    intent4.putExtra("oldJid", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(A0B3);
                    sb2.append(obj2);
                    intent4.putExtra("newJid", sb2.toString());
                    changeNumber.startActivityForResult(intent4, 1);
                    return;
                }
                return;
            case 45:
                C006803i.A0R((Activity) this.A00, "com.whatsapp.w4b");
                return;
            case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                AnonymousClass312 r42 = (AnonymousClass312) this.A00;
                AnonymousClass0MP r36 = r42.A00;
                if (C002001d.A3W(r36)) {
                    AnonymousClass2TJ r06 = r42.A07;
                    if (r06 != null) {
                        r06.A01(r36);
                        return;
                    }
                    throw null;
                }
                AnonymousClass0M4 r07 = ((AnonymousClass0M3) r36).A02;
                if (r07 == null) {
                    throw null;
                } else if (r07.A07 == 1) {
                    if (r36.A0m == 2) {
                        r42.A01.A04(R.string.gallery_unsafe_audio_removed, 1);
                        return;
                    } else {
                        r42.A01.A04(R.string.gallery_unsafe_video_removed, 1);
                        return;
                    }
                } else if (((AnonymousClass0M3) r36).A09 != null) {
                    r42.A03.A06((ActivityC004702f) r42.getContext(), r36, true);
                    return;
                } else {
                    Log.e("cannot download media message with no media attached");
                    r42.A01.A06(R.string.invalid_media_message_download, 0);
                    return;
                }
            case 47:
                AnonymousClass312 r08 = (AnonymousClass312) this.A00;
                r08.A02.A03(r08.A00, true, true);
                return;
            case 48:
                AnonymousClass312 r17 = (AnonymousClass312) this.A00;
                AnonymousClass0MP r211 = r17.A00;
                if (C002001d.A3W(r211)) {
                    AnonymousClass2TJ r09 = r17.A07;
                    if (r09 != null) {
                        AbstractRunnableC459527e r010 = (AbstractRunnableC459527e) r09.A07.get(r211);
                        if (r010 != null) {
                            r010.cancel();
                            return;
                        }
                        return;
                    }
                    throw null;
                } else if (!AnonymousClass0FI.A0p(r211)) {
                    r17.A05.A07(r211, true);
                    return;
                } else {
                    r17.A06.A08(r211, false, false);
                    return;
                }
            case 49:
                AnonymousClass312 r212 = (AnonymousClass312) this.A00;
                if (RequestPermissionActivity.A0N(r212.getContext(), r212.A04) && (r3 = r212.A00) != null && C28051Sr.A1v(r3, r212.getContext(), new AnonymousClass3OB(r212), r212.A08, r212.A01, r212.A09)) {
                    if (!(r212 instanceof AnonymousClass3OK)) {
                        AnonymousClass3OI r213 = (AnonymousClass3OI) r212;
                        C28301Tu A0b = C28051Sr.A0b(((AnonymousClass312) r213).A00, C02780Dk.A00(r213.getContext()));
                        A0b.A0F = new AnonymousClass3O3(r213);
                        A0b.A0N(((AnonymousClass312) r213).A00);
                        A0b.A0D();
                        r213.A01();
                        return;
                    }
                    AnonymousClass3OK r214 = (AnonymousClass3OK) r212;
                    C28301Tu A0b2 = C28051Sr.A0b(((AnonymousClass312) r214).A00, C02780Dk.A00(r214.getContext()));
                    A0b2.A0N(((AnonymousClass312) r214).A00);
                    A0b2.A0D();
                    r214.A01();
                    return;
                }
                return;
            default:
                super.A00(view);
                return;
        }
    }
}
