package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.search.verification.client.R;
import com.whatsapp.ShareInviteLinkActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Ec  reason: invalid class name */
public class AnonymousClass0Ec extends Handler {
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass01A A02;
    public final C014308b A03;
    public final AnonymousClass01X A04;
    public final AnonymousClass01K A05;
    public final C02940Eb A06;
    public final AnonymousClass0EZ A07;

    public AnonymousClass0Ec(AnonymousClass02M r2, C000300f r3, AnonymousClass01A r4, C014308b r5, AnonymousClass01X r6, AnonymousClass01K r7, AnonymousClass0EZ r8, C02940Eb r9) {
        super(Looper.getMainLooper());
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r8;
        this.A06 = r9;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public void handleMessage(Message message) {
        String A0A;
        int i = message.what;
        switch (i) {
            case 1:
                Log.i("groupmgr/handle-init-group-chat");
                this.A05.A0J((AbstractC007503q) message.obj);
                return;
            case 2:
                Log.i("groupmgr/handle_add_groupchat_msg");
                AbstractC007503q r2 = (AbstractC007503q) message.obj;
                this.A05.A0J(r2);
                this.A07.A00(r2.A0n.A00);
                return;
            case 3:
                Log.i("groupmgr/conversations/leave group");
                this.A07.A00(((AbstractC007503q) message.obj).A0n.A00);
                return;
            case 4:
                Log.i("groupmgr/handle_groupchat_subject_change");
                AbstractC007503q r22 = (AbstractC007503q) message.obj;
                this.A05.A0J(r22);
                this.A07.A00(r22.A0n.A00);
                return;
            case 5:
                this.A07.A00((AnonymousClass02N) message.obj);
                return;
            case 6:
                C02940Eb r0 = this.A06;
                C48732Nm r4 = (C48732Nm) message.obj;
                Iterator it = r0.A00.iterator();
                while (true) {
                    AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                    if (r1.hasNext()) {
                        ShareInviteLinkActivity shareInviteLinkActivity = ((C39051qs) r1.next()).A00;
                        AnonymousClass02U r12 = shareInviteLinkActivity.A05;
                        if (r12 != null && r12.equals(r4.A00)) {
                            shareInviteLinkActivity.A0X(r4.A01);
                        }
                    } else {
                        return;
                    }
                }
            default:
                switch (i) {
                    case 1001:
                    case 1004:
                        C007003k A08 = this.A02.A08((AnonymousClass02N) message.obj);
                        if (A08 != null) {
                            this.A00.A0C(this.A04.A0D(R.string.failed_to_leave_x_group, A08.A0F), 0);
                            return;
                        }
                        return;
                    case 1002:
                        this.A07.A00((AnonymousClass02N) message.obj);
                        this.A00.A06(R.string.group_error_add_participants, 0);
                        return;
                    case 1003:
                        this.A07.A00((AnonymousClass02N) message.obj);
                        this.A00.A06(R.string.group_error_remove_participants, 0);
                        return;
                    case 1005:
                        this.A07.A00((AnonymousClass02N) message.obj);
                        this.A00.A06(R.string.group_error_change_admins, 0);
                        return;
                    case 1006:
                        this.A07.A00((AnonymousClass02N) message.obj);
                        this.A00.A06(R.string.group_error_change_admins, 0);
                        return;
                    case 1007:
                        this.A07.A00((AnonymousClass02N) message.obj);
                        this.A00.A06(R.string.group_error_subject, 0);
                        return;
                    default:
                        switch (i) {
                            case 2001:
                                this.A00.A0G(this.A04.A0D(R.string.group_error_create, message.obj), 0);
                                return;
                            case 2002:
                                this.A00.A0G(this.A04.A0D(R.string.group_error_create_too_many_groups, message.obj), 0);
                                return;
                            case 2003:
                                this.A00.A0G(this.A04.A0D(R.string.group_error_create_subject_too_long, message.obj), 0);
                                return;
                            case 2004:
                                this.A00.A0G(this.A04.A0D(R.string.group_error_create_too_many_requests, message.obj), 0);
                                return;
                            case 2005:
                                this.A00.A04(R.string.group_error_subject, 0);
                                return;
                            case 2006:
                                this.A00.A04(R.string.group_error_subject_not_authorized, 0);
                                return;
                            case 2007:
                                this.A00.A04(R.string.group_error_subject_not_in_group, 0);
                                return;
                            case 2008:
                                this.A00.A04(R.string.group_error_subject_no_such_group, 0);
                                return;
                            case 2009:
                                this.A00.A0G(this.A04.A0D(R.string.group_error_subject_too_long, message.obj), 0);
                                return;
                            case 2010:
                                this.A00.A04(R.string.group_error_add_participants, 0);
                                return;
                            case 2011:
                                this.A00.A04(R.string.group_error_add_participants_not_authorized, 0);
                                return;
                            case 2012:
                                this.A00.A04(R.string.group_error_add_participants_not_in_group, 0);
                                return;
                            case 2013:
                                break;
                            case 2014:
                                this.A00.A04(R.string.group_error_remove_participants, 0);
                                return;
                            case 2015:
                                this.A00.A04(R.string.group_error_remove_participants_not_authorized, 0);
                                return;
                            case 2016:
                                this.A00.A04(R.string.group_error_remove_participants_not_in_group, 0);
                                return;
                            case 2017:
                                this.A00.A04(R.string.group_error_remove_participants_no_such_group, 0);
                                return;
                            case 2018:
                                this.A00.A04(R.string.group_error_change_admins, 0);
                                return;
                            case 2019:
                                this.A00.A04(R.string.group_error_change_admins_not_authorized, 0);
                                return;
                            case 2020:
                                this.A00.A04(R.string.group_error_change_admins_not_in_group, 0);
                                return;
                            case 2021:
                                this.A00.A04(R.string.group_error_change_admins_no_such_group, 0);
                                return;
                            case 2022:
                                this.A00.A04(R.string.group_error_leave, 0);
                                return;
                            case 2023:
                                this.A00.A04(R.string.group_error_leave_not_in_group, 0);
                                return;
                            case 2024:
                                this.A00.A04(R.string.group_error_leave_no_such_group, 0);
                                return;
                            case 2025:
                                this.A00.A04(R.string.group_error_end, 0);
                                return;
                            default:
                                switch (i) {
                                    case 3001:
                                        StringBuilder sb = new StringBuilder();
                                        String str = null;
                                        int i2 = 0;
                                        int i3 = 0;
                                        for (Map.Entry entry : ((Map) message.obj).entrySet()) {
                                            UserJid userJid = (UserJid) entry.getKey();
                                            StringBuilder A0X = AnonymousClass008.A0X("groupmgr/add-participant/error/", userJid, "/");
                                            A0X.append(entry.getValue());
                                            Log.e(A0X.toString());
                                            int intValue = ((Number) entry.getValue()).intValue();
                                            C007003k A0A2 = this.A02.A0A(userJid);
                                            if (intValue != 401) {
                                                if (intValue != 403) {
                                                    if (intValue == 406) {
                                                        i3++;
                                                        AnonymousClass008.A0p(this.A04, R.string.error_adding_participant_406, new Object[]{this.A03.A08(A0A2, false)}, sb);
                                                    } else if (intValue == 500) {
                                                        i3++;
                                                        AnonymousClass008.A0p(this.A04, R.string.error_adding_participant_500, new Object[]{this.A03.A08(A0A2, false)}, sb);
                                                    } else if (intValue == 408) {
                                                        i2++;
                                                        if (str == null) {
                                                            str = this.A03.A08(A0A2, false);
                                                        }
                                                    } else if (intValue == 409) {
                                                    }
                                                } else if (this.A01.A0D(AbstractC000400g.A18)) {
                                                }
                                                i3++;
                                                AnonymousClass008.A0p(this.A04, R.string.error_adding_participant, new Object[]{this.A03.A08(A0A2, false)}, sb);
                                            } else {
                                                i3++;
                                                AnonymousClass008.A0p(this.A04, R.string.error_adding_participant_401, new Object[]{this.A03.A08(A0A2, false)}, sb);
                                            }
                                        }
                                        if (i2 > 0) {
                                            AnonymousClass01X r7 = this.A04;
                                            if (i2 == 1) {
                                                A0A = r7.A0D(R.string.error_adding_participant_408_single, str);
                                            } else {
                                                A0A = r7.A0A(R.plurals.error_adding_participant_408_multi, (long) i2, Integer.valueOf(i2));
                                            }
                                            this.A00.A0G(A0A, 0);
                                            return;
                                        } else if (i3 > 0) {
                                            this.A00.A0G(sb.toString(), 0);
                                            return;
                                        } else {
                                            return;
                                        }
                                    case 3002:
                                        StringBuilder sb2 = new StringBuilder();
                                        for (Map.Entry entry2 : ((Map) message.obj).entrySet()) {
                                            UserJid userJid2 = (UserJid) entry2.getKey();
                                            StringBuilder A0X2 = AnonymousClass008.A0X("groupmgr/remove-participant/error/", userJid2, "/");
                                            A0X2.append(entry2.getValue());
                                            Log.e(A0X2.toString());
                                            int intValue2 = ((Number) entry2.getValue()).intValue();
                                            C007003k A0A3 = this.A02.A0A(userJid2);
                                            if (intValue2 != 404) {
                                                if (intValue2 != 406) {
                                                    AnonymousClass008.A0p(this.A04, R.string.error_removing_participant, new Object[]{this.A03.A08(A0A3, false)}, sb2);
                                                } else {
                                                    AnonymousClass008.A0p(this.A04, R.string.error_removing_participant_406, new Object[]{this.A03.A08(A0A3, false)}, sb2);
                                                }
                                            }
                                        }
                                        if (!TextUtils.isEmpty(sb2)) {
                                            this.A00.A0G(sb2.toString(), 0);
                                            return;
                                        }
                                        return;
                                    case 3003:
                                        StringBuilder sb3 = new StringBuilder();
                                        for (Map.Entry entry3 : ((Map) message.obj).entrySet()) {
                                            UserJid userJid3 = (UserJid) entry3.getKey();
                                            StringBuilder A0X3 = AnonymousClass008.A0X("groupmgr/add-admins/error/", userJid3, "/");
                                            A0X3.append(entry3.getValue());
                                            Log.e(A0X3.toString());
                                            int intValue3 = ((Number) entry3.getValue()).intValue();
                                            C007003k A0A4 = this.A02.A0A(userJid3);
                                            if (intValue3 == 404) {
                                                AnonymousClass008.A0p(this.A04, R.string.error_adding_participant, new Object[]{this.A03.A08(A0A4, false)}, sb3);
                                            } else if (intValue3 != 419) {
                                                AnonymousClass008.A0p(this.A04, R.string.error_adding_participant, new Object[]{this.A03.A08(A0A4, false)}, sb3);
                                            } else {
                                                AnonymousClass008.A0p(this.A04, R.string.failed_announcement_group_add_admin, new Object[]{this.A03.A08(A0A4, false)}, sb3);
                                            }
                                        }
                                        this.A00.A0G(sb3.toString(), 0);
                                        return;
                                    case 3004:
                                        StringBuilder sb4 = new StringBuilder();
                                        for (Map.Entry entry4 : ((Map) message.obj).entrySet()) {
                                            UserJid userJid4 = (UserJid) entry4.getKey();
                                            StringBuilder A0X4 = AnonymousClass008.A0X("groupmgr/remove-admins/error/", userJid4, "/");
                                            A0X4.append(entry4.getValue());
                                            Log.e(A0X4.toString());
                                            int intValue4 = ((Number) entry4.getValue()).intValue();
                                            C007003k A0A5 = this.A02.A0A(userJid4);
                                            if (intValue4 == 404) {
                                                AnonymousClass008.A0p(this.A04, R.string.error_removing_participant, new Object[]{this.A03.A08(A0A5, false)}, sb4);
                                            } else if (intValue4 != 406) {
                                                AnonymousClass008.A0p(this.A04, R.string.error_removing_participant, new Object[]{this.A03.A08(A0A5, false)}, sb4);
                                            } else {
                                                AnonymousClass008.A0p(this.A04, R.string.error_removing_admin_406, new Object[]{this.A03.A08(A0A5, false)}, sb4);
                                            }
                                        }
                                        this.A00.A0G(sb4.toString(), 0);
                                        return;
                                    case 3005:
                                        this.A00.A04(R.string.group_error_add_participants_too_many_requests, 0);
                                        return;
                                    case 3006:
                                        Log.i("groupmgr/handle groupchat description change");
                                        AbstractC007503q r23 = (AbstractC007503q) message.obj;
                                        this.A05.A0J(r23);
                                        this.A07.A00(r23.A0n.A00);
                                        return;
                                    case 3007:
                                        this.A00.A04(R.string.group_error_add_participant_repeated_add_blocked, 0);
                                        break;
                                    case 3008:
                                        Log.i("groupmgr/handle groupchat restrict mode change");
                                        AbstractC007503q r24 = (AbstractC007503q) message.obj;
                                        this.A05.A0J(r24);
                                        this.A07.A00(r24.A0n.A00);
                                        return;
                                    case 3009:
                                        Log.i("groupmgr/handle groupchat announcements only change");
                                        AbstractC007503q r25 = (AbstractC007503q) message.obj;
                                        this.A05.A0J(r25);
                                        this.A07.A00(r25.A0n.A00);
                                        return;
                                    case 3010:
                                        this.A00.A04(R.string.failed_update_group_info_not_admin, 0);
                                        return;
                                    case 3011:
                                        this.A00.A04(R.string.failed_update_group_info_not_participant, 0);
                                        return;
                                    case 3012:
                                        this.A00.A04(R.string.failed_update_group_info, 0);
                                        return;
                                    case 3013:
                                        int A062 = this.A01.A06(AbstractC000400g.A3i) - 1;
                                        this.A00.A0G(this.A04.A0A(R.plurals.failed_announcement_group_revert, (long) A062, Integer.valueOf(A062)), 0);
                                        return;
                                    case 3014:
                                        int A063 = this.A01.A06(AbstractC000400g.A2q);
                                        this.A00.A0G(this.A04.A0A(R.plurals.failed_announcement_group_toggle_time, (long) A063, Integer.valueOf(A063)), 0);
                                        return;
                                    case 3015:
                                        Log.i("groupmgr/handle groupchat description updated");
                                        AbstractC007503q r26 = (AbstractC007503q) message.obj;
                                        this.A05.A0M(r26);
                                        this.A07.A00(r26.A0n.A00);
                                        return;
                                    case 3016:
                                        Log.i("groupmgr/handle groupchat no frequently forwarded change");
                                        AbstractC007503q r27 = (AbstractC007503q) message.obj;
                                        this.A05.A0J(r27);
                                        this.A07.A00(r27.A0n.A00);
                                        return;
                                    case 3017:
                                        AbstractC007503q r28 = (AbstractC007503q) message.obj;
                                        this.A05.A0J(r28);
                                        this.A07.A00(r28.A0n.A00);
                                        return;
                                    case 3018:
                                        this.A00.A04(R.string.group_error_ephemeral_internal_only, 0);
                                        return;
                                    default:
                                        return;
                                }
                        }
                        this.A00.A04(R.string.group_error_add_participants_no_such_group, 0);
                        return;
                }
        }
    }
}
