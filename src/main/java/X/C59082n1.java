package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickEBaseShape5S0100000_I1_3;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.ShareInviteLinkActivity;
import com.whatsapp.conversation.ChangeNumberNotificationDialogFragment;
import com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment;
import com.whatsapp.conversation.conversationrow.DeviceChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.IdentityChangeDialogFragment;
import com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment;
import com.whatsapp.ephemeral.ChangeEphemeralSettingActivity;
import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.DefaultCryptoCallback;
import com.whatsapp.voipcalling.GlVideoRenderer;

/* renamed from: X.2n1  reason: invalid class name and case insensitive filesystem */
public class C59082n1 extends AbstractC51572Zg {
    public final View.OnClickListener A00 = new ViewOnClickEBaseShape5S0100000_I1_3(this, 16);
    public final TextView A01;
    public final AnonymousClass0Z7 A02 = AnonymousClass0Z7.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final C006903j A04 = C006903j.A00();
    public final AnonymousClass01T A05 = AnonymousClass01T.A00();
    public final C02130At A06 = C02130At.A00();

    public C59082n1(Context context, C05390Oi r4) {
        super(context, r4);
        setClickable(false);
        this.A01 = (TextView) findViewById(R.id.info);
        A0k();
    }

    public static boolean A04(C05390Oi r3) {
        if (AnonymousClass0FI.A0Z(r3) || ((AnonymousClass0FI.A0U(r3) && (r3 instanceof C12150hd) && ((C12150hd) r3).A00 == 0) || AnonymousClass0FI.A0X(r3) || r3.A00 == 62)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51572Zg
    public void A0K() {
        A0k();
        A0e(false);
    }

    @Override // X.AbstractC51572Zg
    public void A0Z(AbstractC007503q r3, boolean z) {
        boolean z2 = false;
        if (r3 != super.getFMessage()) {
            z2 = true;
        }
        super.A0Z(r3, z);
        if (z || z2) {
            A0k();
        }
    }

    public void A0j() {
        String string;
        String str;
        C05390Oi r8 = (C05390Oi) super.getFMessage();
        AnonymousClass02N r7 = r8.A0n.A00;
        if (r7 != null) {
            boolean z = true;
            switch (r8.A00) {
                case 18:
                    ActivityC004702f r4 = (ActivityC004702f) getContext();
                    IdentityChangeDialogFragment identityChangeDialogFragment = new IdentityChangeDialogFragment();
                    Bundle bundle = new Bundle();
                    if (r7 != null) {
                        AnonymousClass02N A07 = r8.A07();
                        if (A07 == null) {
                            A07 = r7;
                        }
                        bundle.putString("participant_jid", A07.getRawString());
                        identityChangeDialogFragment.A0N(bundle);
                        r4.APl(identityChangeDialogFragment, null);
                        return;
                    }
                    throw null;
                case 19:
                    int i = ((C12150hd) r8).A00;
                    EncryptionChangeDialogFragment encryptionChangeDialogFragment = new EncryptionChangeDialogFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("jid", r7.getRawString());
                    bundle2.putInt("provider_category", i);
                    encryptionChangeDialogFragment.A0N(bundle2);
                    ((ActivityC004702f) getContext()).APl(encryptionChangeDialogFragment, null);
                    return;
                case AnonymousClass0PW.A01:
                case 29:
                case 30:
                case 31:
                case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                case 33:
                case 38:
                case 40:
                case 41:
                case 42:
                case 43:
                case 45:
                case 51:
                case 52:
                case 53:
                case 54:
                case 60:
                default:
                    A0M();
                    return;
                case 21:
                    AnonymousClass01T r1 = this.A05;
                    AnonymousClass02U A022 = AnonymousClass02U.A02(r7);
                    if (A022 == null) {
                        throw null;
                    } else if (r1.A05(A022)) {
                        Intent intent = new Intent(getContext(), ShareInviteLinkActivity.class);
                        intent.putExtra("jid", r7.getRawString());
                        getContext().startActivity(intent);
                        return;
                    } else {
                        ((AbstractC51572Zg) this).A0V.A0C(this.A0n.A06(R.string.cannot_view_invite_link), 0);
                        return;
                    }
                case 22:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_none_to_unknown_alert, ((C12110hZ) r8).A00)), null);
                    return;
                case 23:
                    ActivityC004702f r42 = (ActivityC004702f) getContext();
                    AnonymousClass01X r3 = this.A0n;
                    boolean A0c = AnonymousClass1VY.A0c(r7);
                    int i2 = R.string.vlevel_transition_none_to_high_alert;
                    if (A0c) {
                        i2 = R.string.wa_vlevel_transition_none_to_high_alert;
                    }
                    r42.APl(VerifiedBusinessInfoDialogFragment.A00(r3.A0D(i2, ((C12110hZ) r8).A00)), null);
                    return;
                case 24:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_low_or_unknown_to_high_alert, ((C12110hZ) r8).A00)), null);
                    return;
                case 25:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_high_to_low_or_unknown_alert, ((C12110hZ) r8).A00)), null);
                    return;
                case 26:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A06(R.string.vlevel_transition_any_to_none_alert)), null);
                    return;
                case 27:
                    if (!TextUtils.isEmpty(r8.A0D())) {
                        GroupChatInfo.A04(this.A03.A0A(r7), (Activity) getContext());
                        return;
                    } else if (!((AbstractC51572Zg) this).A0X.A09(r8.A07())) {
                        A0M();
                        return;
                    } else {
                        return;
                    }
                case 28:
                    C12130hb r82 = (C12130hb) r8;
                    AnonymousClass01A r12 = this.A03;
                    UserJid userJid = r82.A01;
                    if (userJid != null) {
                        String A08 = this.A0f.A08(r12.A0A(userJid), false);
                        ActivityC004702f r2 = (ActivityC004702f) getContext();
                        UserJid of = UserJid.of(r7);
                        if (of != null) {
                            UserJid userJid2 = r82.A00;
                            if (userJid2 != null) {
                                r2.APl(ChangeNumberNotificationDialogFragment.A00(of, userJid2, A08), null);
                                return;
                            }
                            throw null;
                        }
                        throw null;
                    }
                    throw null;
                case 34:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_none_to_low_alert, ((C12110hZ) r8).A00)), null);
                    return;
                case 35:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_unknown_to_low_alert, ((C12110hZ) r8).A00)), null);
                    return;
                case 36:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_low_to_unknown_alert, ((C12110hZ) r8).A00)), null);
                    return;
                case 37:
                case 39:
                case 44:
                    C02130At r0 = this.A06;
                    Context context = getContext();
                    Intent intent2 = new Intent(context, r0.A08.A03().A8K());
                    C007303n r22 = ((C05480Os) r8).A02;
                    boolean z2 = false;
                    if (r22 != null) {
                        z2 = true;
                    }
                    AnonymousClass00E.A04(Boolean.valueOf(z2), "Remote request message key is not specified.");
                    C006803i.A05(intent2, r22);
                    context.startActivity(intent2);
                    return;
                case DefaultCryptoCallback.E2E_EXTENDED_V2_KEY_LENGTH /*{ENCODED_INT: 46}*/:
                    AnonymousClass01X r32 = this.A0n;
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(AnonymousClass0SE.A01(r32, r32.A0D(R.string.blue_alert_self_premise_unverified, AnonymousClass0SE.A02(((C12110hZ) r8).A00)))), null);
                    return;
                case 47:
                    C007003k A09 = this.A03.A09(r7);
                    if (this.A0f.A0F(A09) || A09.A08 == null) {
                        ActivityC004702f r43 = (ActivityC004702f) getContext();
                        AnonymousClass01X r33 = this.A0n;
                        boolean A0c2 = AnonymousClass1VY.A0c(r7);
                        int i3 = R.string.blue_alert_self_premise_verified;
                        if (A0c2) {
                            i3 = R.string.wa_vlevel_transition_none_to_high_alert_no_and_match_contact_v2;
                        }
                        r43.APl(VerifiedBusinessInfoDialogFragment.A00(AnonymousClass0SE.A01(r33, r33.A0D(i3, AnonymousClass0SE.A02(((C12110hZ) r8).A00)))), null);
                        return;
                    }
                    ActivityC004702f r44 = (ActivityC004702f) getContext();
                    AnonymousClass01X r34 = this.A0n;
                    boolean A0c3 = AnonymousClass1VY.A0c(r7);
                    int i4 = R.string.blue_alert_self_premise_verified_contact_mismatch;
                    if (A0c3) {
                        i4 = R.string.wa_vlevel_transition_none_to_high_alert_non_match_contact_v2;
                    }
                    r44.APl(VerifiedBusinessInfoDialogFragment.A00(AnonymousClass0SE.A01(r34, r34.A0D(i4, AnonymousClass0SE.A02(((C12110hZ) r8).A00)))), null);
                    return;
                case 48:
                    ActivityC004702f r45 = (ActivityC004702f) getContext();
                    AnonymousClass01X r35 = this.A0n;
                    boolean A0c4 = AnonymousClass1VY.A0c(r7);
                    int i5 = R.string.vlevel_transition_low_or_unknown_to_high_alert_v2;
                    if (A0c4) {
                        i5 = R.string.wa_vlevel_transition_low_or_unknown_to_high_alert_v2;
                    }
                    r45.APl(VerifiedBusinessInfoDialogFragment.A00(r35.A0D(i5, ((C12110hZ) r8).A00)), null);
                    return;
                case 49:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_high_to_low_or_unknown_alert_v2, ((C12110hZ) r8).A00)), null);
                    return;
                case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*{ENCODED_INT: 50}*/:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A06(R.string.vlevel_transition_any_to_none_alert_v2)), null);
                    return;
                case 55:
                    ((ActivityC004702f) getContext()).APl(VerifiedBusinessInfoDialogFragment.A00(this.A0n.A0D(R.string.vlevel_transition_high_to_high_alert_v2, ((C12110hZ) r8).A00)), null);
                    return;
                case 56:
                    AnonymousClass02U A023 = AnonymousClass02U.A02(super.getFMessage().A0n.A00);
                    if (A023 == null) {
                        throw null;
                    } else if (this.A05.A05(A023)) {
                        Context context2 = getContext();
                        Context context3 = getContext();
                        C007003k A092 = this.A03.A09(A023);
                        if (A092 != null) {
                            int i6 = A092.A00;
                            Intent intent3 = new Intent(context3, ChangeEphemeralSettingActivity.class);
                            intent3.putExtra("jid", A023.getRawString());
                            intent3.putExtra("current_setting", i6);
                            context2.startActivity(intent3);
                            return;
                        }
                        throw null;
                    } else if (!((AbstractC51572Zg) this).A0X.A09(r8.A07())) {
                        A0M();
                        return;
                    } else {
                        return;
                    }
                case 57:
                    ActivityC004702f r5 = (ActivityC004702f) getContext();
                    C12140hc r83 = (C12140hc) r8;
                    DeviceChangeDialogFragment deviceChangeDialogFragment = new DeviceChangeDialogFragment();
                    Bundle bundle3 = new Bundle();
                    AnonymousClass02N r23 = r83.A0n.A00;
                    if (r23 != null) {
                        bundle3.putString("chat_jid", r23.getRawString());
                        if (r23 != null) {
                            AnonymousClass02N A072 = r83.A07();
                            if (A072 == null) {
                                A072 = r23;
                            }
                            bundle3.putString("participant_jid", A072.getRawString());
                            bundle3.putInt("device_added_count", r83.A00);
                            bundle3.putInt("device_removed_count", r83.A01);
                            deviceChangeDialogFragment.A0N(bundle3);
                            r5.APl(deviceChangeDialogFragment, null);
                            return;
                        }
                        throw null;
                    }
                    throw null;
                case 58:
                    if (r8 instanceof C12160he) {
                        boolean z3 = ((C12160he) r8).A00;
                        boolean A0H = ((AbstractC51572Zg) this).A0T.A0H(UserJid.of(r7));
                        if (z3 && A0H) {
                            C002001d.A2O((Activity) getContext(), 106);
                            return;
                        }
                        return;
                    }
                    return;
                case 59:
                    Context A0O = C002001d.A0O(getContext());
                    if (A0O instanceof ActivityC004702f) {
                        UserJid of2 = UserJid.of(super.getFMessage().A0n.A00);
                        if (of2 != null) {
                            ChangeEphemeralSettingActivity.A04(this.A0n, ((AbstractC51572Zg) this).A0T, (ActivityC004702f) A0O, of2, this.A04.A02(of2));
                            return;
                        }
                        throw null;
                    }
                    return;
                case 61:
                    AnonymousClass01A r36 = this.A03;
                    if (r36.A09(r7).A08 == null || this.A0f.A0F(r36.A09(r7))) {
                        z = false;
                    }
                    C12180hg r84 = (C12180hg) r8;
                    String str2 = r84.A01;
                    int i7 = r84.A00;
                    Context context4 = getContext();
                    switch (i7) {
                        case 1:
                        case 3:
                        case 5:
                        case 15:
                            Resources resources = context4.getResources();
                            if (!z) {
                                string = resources.getString(R.string.blue_alert_verified, str2);
                                str = string;
                                break;
                            } else {
                                string = resources.getString(R.string.blue_alert_verified_contact_mismatch, str2);
                                str = string;
                                break;
                            }
                        case 2:
                        case 4:
                        case 6:
                        case 7:
                            string = context4.getResources().getString(R.string.blue_alert_verified_to_unverified, AnonymousClass0SE.A02(str2));
                            str = string;
                            break;
                        case 8:
                        case 9:
                        case 13:
                        case 14:
                        case GlVideoRenderer.CAP_RENDER_I420 /*{ENCODED_INT: 16}*/:
                        case 17:
                        case 23:
                        case 28:
                        case 29:
                        case 31:
                        case 33:
                            if (r7 != null && AnonymousClass1VY.A0W(r7)) {
                                string = context4.getResources().getString(R.string.contact_info_security_modal_company_number, str2);
                                str = string;
                                break;
                            } else {
                                string = context4.getResources().getString(R.string.blue_alert_self_fb_or_fb_and_other_verified, str2);
                                str = string;
                                break;
                            }
                            break;
                        case 10:
                        case 11:
                        case 12:
                        case 18:
                        case 19:
                        case AnonymousClass0PW.A01:
                        case 22:
                        case 25:
                        case 26:
                        case DefaultCryptoCallback.E2E_CALL_KEY_LENGTH /*{ENCODED_INT: 32}*/:
                            string = context4.getResources().getString(R.string.blue_alert_bsp_premise, str2);
                            str = string;
                            break;
                        case 21:
                        case 24:
                        case 27:
                        default:
                            string = null;
                            str = null;
                            break;
                        case 30:
                            string = context4.getResources().getString(R.string.blue_alert_consumer_to_self_premise_unverified);
                            str = string;
                            break;
                    }
                    if (!TextUtils.isEmpty(string)) {
                        BusinessTransitionInfoDialogFragment businessTransitionInfoDialogFragment = new BusinessTransitionInfoDialogFragment();
                        Bundle bundle4 = new Bundle();
                        bundle4.putString("message", str);
                        businessTransitionInfoDialogFragment.A0N(bundle4);
                        ((ActivityC004702f) getContext()).APl(businessTransitionInfoDialogFragment, null);
                        return;
                    }
                    return;
                case 62:
                    EncryptionChangeDialogFragment encryptionChangeDialogFragment2 = new EncryptionChangeDialogFragment();
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("jid", r7.getRawString());
                    bundle5.putInt("provider_category", 0);
                    encryptionChangeDialogFragment2.A0N(bundle5);
                    ((ActivityC004702f) getContext()).APl(encryptionChangeDialogFragment2, null);
                    return;
            }
        } else {
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0122, code lost:
        if (r1 != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0145, code lost:
        if (r2.A05(r0) == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x014e, code lost:
        if (r10 == 59) goto L_0x0129;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0k() {
        /*
        // Method dump skipped, instructions count: 460
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59082n1.A0k():void");
    }

    public final boolean A0l(C05390Oi r3) {
        AnonymousClass02N r1 = r3.A0n.A00;
        return AnonymousClass1VY.A0Y(r1) && this.A03.A0A(r1).A0S;
    }

    public int getBackgroundResource() {
        C05390Oi r2 = (C05390Oi) super.getFMessage();
        if (A0l(r2)) {
            return R.drawable.business_balloon;
        }
        if (A04(r2)) {
            return R.drawable.security_balloon;
        }
        if (AnonymousClass0FI.A0h(r2) || AnonymousClass0FI.A0T(r2)) {
            return R.drawable.business_balloon;
        }
        int i = r2.A00;
        if (C001801b.A1k(i) || AnonymousClass0FI.A0s(r2) || i == 63) {
            return R.drawable.business_balloon;
        }
        return R.drawable.date_balloon;
    }

    @Override // X.AnonymousClass2I2
    public int getCenteredLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public C05390Oi getFMessage() {
        return (C05390Oi) super.getFMessage();
    }

    @Override // X.AnonymousClass2I2
    public int getIncomingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    @Override // X.AnonymousClass2I2
    public int getOutgoingLayoutId() {
        return R.layout.conversation_row_divider;
    }

    public int getTextColor() {
        C05390Oi r1 = (C05390Oi) super.getFMessage();
        if (A0l(r1)) {
            return R.color.bubbleBusinessText;
        }
        if (A04(r1)) {
            return R.color.bubbleSecurityText;
        }
        if (AnonymousClass0FI.A0h(r1) || C001801b.A1k(r1.A00) || AnonymousClass0FI.A0T(r1) || AnonymousClass0FI.A0s(r1)) {
            return R.color.bubbleBusinessText;
        }
        return R.color.conversation_divider_text;
    }

    @Override // X.AnonymousClass2I2
    public void setFMessage(AbstractC007503q r2) {
        AnonymousClass00E.A07(r2 instanceof C05390Oi);
        super.setFMessage(r2);
    }
}
